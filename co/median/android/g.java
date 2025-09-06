package co.median.android;

import B0.F;
import B0.G;
import B0.H;
import B0.M;
import I0.l;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class g {
    static class a {
        public String a;
        public String b;
        public long c;
        public String d;
        public String e;
        public File f;
        public Uri g;
        public OutputStream h;
        public long i;
        public String j;
        public boolean k;

        private a() {
        }

        a(H h0) {
        }
    }

    class b {
        final g a;

        private b() {
        }

        b(H h0) {
        }

        @JavascriptInterface
        public void postMessage(String s) {
            Log.d("g", "got message " + s);
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                String s1 = l.i(jSONObject0, "event");
                if("fileStart".equals(s1)) {
                    g.this.q(jSONObject0);
                    return;
                }
                if("fileChunk".equals(s1)) {
                    g.this.o(jSONObject0);
                    return;
                }
                if("fileEnd".equals(s1)) {
                    g.this.p(jSONObject0);
                    return;
                }
                I0.g.a().b("g", "Invalid event " + s1);
                return;
            }
            catch(JSONException jSONException0) {
            }
            catch(IOException iOException0) {
                I0.g.a().c("g", "IO Error", iOException0);
                return;
            }
            I0.g.a().c("g", "Error parsing message as json", jSONException0);
        }
    }

    private final d a;
    private String b;
    private final b c;
    private final MainActivity d;
    private final Map e;
    private static final String f = "g";

    static {
    }

    public g(MainActivity mainActivity0) {
        this.c = new b(this, null);
        this.d = mainActivity0;
        this.e = new HashMap();
        if(I0.a.V(mainActivity0).s1.a()) {
            this.a = d.f;
            return;
        }
        this.a = d.g;
    }

    // 去混淆评级： 低(20)
    static String h() [...] // 潜在的解密器

    public void i(String s, String s1, boolean z, String s2) {
        if(s != null && s.startsWith("blob:")) {
            this.b = s2;
            a g$a0 = new a(null);
            g$a0.a = "783971ca-506b-4249-bca0-5144e025e61d";
            g$a0.b = s1;
            g$a0.j = s2;
            g$a0.k = z;
            this.e.put("783971ca-506b-4249-bca0-5144e025e61d", g$a0);
            try {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                M.b(new BufferedInputStream(this.d.getAssets().open("BlobDownloader.js")), byteArrayOutputStream0);
                this.d.a(byteArrayOutputStream0.toString());
                Object[] arr_object = {l.f(s), g$a0.a, g$a0.b};
                this.d.a(String.format("medianDownloadBlobUrl(%s, \'%s\', \'%s\')", arr_object));
            }
            catch(IOException iOException0) {
                I0.g.a().c("g", iOException0.getMessage(), iOException0);
                co.median.android.d.F(this.d, s2, "IO Error - " + iOException0.getMessage());
            }
        }
    }

    public b j() {
        return this.c;
    }

    // 检测为 Lambda 实现
    private void k(a g$a0) [...]

    // 检测为 Lambda 实现
    private void l() [...]

    // 检测为 Lambda 实现
    private void m(a g$a0, String[] arr_s, int[] arr_v) [...]

    // 检测为 Lambda 实现
    private void n() [...]

    private void o(JSONObject jSONObject0) {
        String s = l.i(jSONObject0, "id");
        if(TextUtils.isEmpty(s)) {
            return;
        }
        a g$a0 = (a)this.e.get(s);
        if(g$a0 == null) {
            return;
        }
        String s1 = l.i(jSONObject0, "data");
        if(s1 == null) {
            return;
        }
        int v = s1.indexOf(";base64,");
        if(v == -1) {
            return;
        }
        byte[] arr_b = Base64.decode(s1.substring(v + 8), 0);
        if(g$a0.i + ((long)arr_b.length) > g$a0.c) {
            try {
                g$a0.h.close();
                g$a0.f.delete();
                this.e.remove(s);
            }
            catch(Exception unused_ex) {
            }
            I0.g.a().b("g", "Received too many bytes. Expected " + g$a0.c);
            co.median.android.d.F(this.d, g$a0.j, "Received too many bytes. Expected " + g$a0.c);
            return;
        }
        g$a0.h.write(arr_b);
        g$a0.i += (long)arr_b.length;
    }

    private void p(JSONObject jSONObject0) {
        String s = l.i(jSONObject0, "id");
        if(TextUtils.isEmpty(s)) {
            I0.g.a().b("g", "Invalid identifier " + s + " for fileEnd");
            co.median.android.d.F(this.d, this.b, "Unable to retrieve download info on file end.");
            return;
        }
        a g$a0 = (a)this.e.get(s);
        if(g$a0 == null) {
            I0.g.a().b("g", "Invalid identifier " + s + " for fileEnd");
            co.median.android.d.F(this.d, this.b, "Unable to retrieve download info on file end.");
            return;
        }
        OutputStream outputStream0 = g$a0.h;
        if(outputStream0 != null) {
            outputStream0.close();
        }
        String s1 = jSONObject0.optString("error");
        if(!TextUtils.isEmpty(s1)) {
            co.median.android.d.F(this.d, g$a0.j, s1);
            return;
        }
        if(g$a0.k) {
            e e0 = () -> {
                if(g$a0.g == null && g$a0.f != null) {
                    g$a0.g = FileProvider.h(this.d, "com.fmkorea.m.fmk.fileprovider", g$a0.f);
                }
                Uri uri0 = g$a0.g;
                if(uri0 == null) {
                    return;
                }
                co.median.android.d.M(this.d, uri0, g$a0.d, this.a == d.g);
            };
            this.d.runOnUiThread(e0);
        }
        else {
            Toast.makeText(this.d, (g$a0.b == null || g$a0.b.isEmpty() ? "File downloaded" : String.format("%1$s downloaded", g$a0.b + '.' + g$a0.e)), 0).show();
        }
        co.median.android.d.G(this.d, g$a0.j);
    }

    private void q(JSONObject jSONObject0) {
        String s = l.i(jSONObject0, "id");
        if(TextUtils.isEmpty(s)) {
            I0.g.a().b("g", "Invalid file id");
            co.median.android.d.F(this.d, this.b, "Unable to retrieve download info on file start.");
            return;
        }
        a g$a0 = (a)this.e.get(s);
        if(g$a0 == null) {
            co.median.android.d.F(this.d, this.b, "Unable to retrieve download info on file start.");
            return;
        }
        if(TextUtils.isEmpty(g$a0.b)) {
            String s2 = l.i(jSONObject0, "name");
            g$a0.b = s2;
            if(TextUtils.isEmpty(s2)) {
                g$a0.b = "download";
            }
        }
        else {
            String s1 = co.median.android.d.t(g$a0.b);
            g$a0.e = s1;
            if(!TextUtils.isEmpty(s1)) {
                g$a0.b = Objects.equals(g$a0.e, g$a0.b) ? "download" : g$a0.b.substring(0, g$a0.b.length() - (g$a0.e.length() + 1));
                g$a0.d = MimeTypeMap.getSingleton().getMimeTypeFromExtension(g$a0.e);
            }
        }
        long v = jSONObject0.optLong("size", -1L);
        if(v > 0L && v <= 0x40000000L) {
            g$a0.c = v;
            if(TextUtils.isEmpty(g$a0.d)) {
                String s3 = l.i(jSONObject0, "type");
                g$a0.d = s3;
                if(TextUtils.isEmpty(s3)) {
                    I0.g.a().b("g", "Invalid file type");
                    co.median.android.d.F(this.d, g$a0.j, "Invalid file type.");
                    return;
                }
            }
            if(TextUtils.isEmpty(g$a0.e)) {
                g$a0.e = MimeTypeMap.getSingleton().getExtensionFromMimeType(g$a0.d);
            }
            if(Build.VERSION.SDK_INT < 29 && this.a == d.f) {
                f f0 = (String[] arr_s, int[] arr_v) -> try {
                    this.r(g$a0, arr_v[0] == 0);
                    G g0 = () -> this.d.a("medianGotStoragePermissions()");
                    this.d.runOnUiThread(g0);
                }
                catch(IOException iOException0) {
                    I0.g.a().c("g", "IO Error", iOException0);
                    co.median.android.d.F(this.d, g$a0.j, "IO Error - " + iOException0.getMessage());
                };
                this.d.j2(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, f0);
                return;
            }
            this.r(g$a0, true);
            F f1 = () -> this.d.a("medianGotStoragePermissions()");
            this.d.runOnUiThread(f1);
            return;
        }
        I0.g.a().b("g", "Invalid file size");
        co.median.android.d.F(this.d, g$a0.j, "Invalid file size.");
    }

    private void r(a g$a0, boolean z) {
        if(!z || this.a != d.f) {
            g$a0.f = co.median.android.d.m(this.d.getFilesDir(), g$a0.b, g$a0.e);
            g$a0.h = new BufferedOutputStream(new FileOutputStream(g$a0.f));
        }
        else if(Build.VERSION.SDK_INT > 28) {
            ContentResolver contentResolver0 = this.d.getApplicationContext().getContentResolver();
            Uri uri0 = co.median.android.d.k(contentResolver0, g$a0.b, g$a0.d, Environment.DIRECTORY_DOWNLOADS);
            if(uri0 != null) {
                g$a0.h = contentResolver0.openOutputStream(uri0);
                g$a0.g = uri0;
            }
        }
        else {
            g$a0.f = co.median.android.d.m(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), g$a0.b, g$a0.e);
            g$a0.h = new BufferedOutputStream(new FileOutputStream(g$a0.f));
        }
        g$a0.i = 0L;
        this.e.put(g$a0.a, g$a0);
    }
}

