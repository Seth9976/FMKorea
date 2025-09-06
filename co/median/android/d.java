package co.median.android;

import B0.v;
import I0.g;
import I0.h;
import I0.l;
import K0.m;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.IBinder;
import android.provider.MediaStore.Files;
import android.provider.MediaStore.Images.Media;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import androidx.activity.result.b;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import jeb.synthetic.TWR;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements DownloadListener {
    class a implements ServiceConnection {
        final d f;

        @Override  // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
            DownloadService downloadService0 = ((co.median.android.DownloadService.a)iBinder0).a();
            d.this.k = downloadService0;
            d.this.k.g(d.this);
            d.this.l = true;
        }

        @Override  // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName0) {
            d.this.k = null;
            d.this.l = false;
        }
    }

    public static enum co.median.android.d.d {
        PUBLIC_DOWNLOADS,
        PRIVATE_INTERNAL;

        private static co.median.android.d.d[] b() [...] // Inlined contents
    }

    public static class e {
        String a;
        String b;
        String c;
        boolean d;
        boolean e;
        boolean f;
        String g;

        public e(String s, String s1, String s2, boolean z, boolean z1, boolean z2, String s3) {
            this.a = s;
            this.b = s1;
            this.c = s2;
            this.d = z;
            this.e = z1;
            this.f = z2;
            this.g = s3;
        }

        public e(String s, String s1, boolean z, boolean z1, String s2) {
            this.a = s;
            this.b = s1;
            this.f = z;
            this.e = z1;
            this.g = s2;
        }
    }

    private final MainActivity f;
    private final co.median.android.d.d g;
    private final b h;
    private u i;
    private String j;
    private DownloadService k;
    private boolean l;
    private e m;
    private final ServiceConnection n;
    private static final String o = "co.median.android.d";
    private static Uri p;

    static {
    }

    d(MainActivity mainActivity0) {
        this.l = false;
        a d$a0 = new a(this);
        this.n = d$a0;
        this.f = mainActivity0;
        m m0 = I0.a.V(mainActivity0).s1;
        if(!m0.a()) {
            this.g = co.median.android.d.d.g;
        }
        else if(Build.VERSION.SDK_INT > 28) {
            this.g = co.median.android.d.d.f;
        }
        else if(m0.b()) {
            this.g = co.median.android.d.d.f;
        }
        else {
            this.g = co.median.android.d.d.g;
        }
        mainActivity0.bindService(new Intent(mainActivity0, DownloadService.class), d$a0, 1);
        this.h = mainActivity0.I0(new d.b(), (Map map0) -> {
            if(map0.containsKey("android.permission.WRITE_EXTERNAL_STORAGE")) {
                Object object0 = map0.get("android.permission.WRITE_EXTERNAL_STORAGE");
                if(Boolean.FALSE.equals(object0)) {
                    Toast.makeText(mainActivity0, "Unable to save download, storage permission denied", 0).show();
                    e d$e0 = this.m;
                    if(d$e0 != null) {
                        d.F(mainActivity0, d$e0.g, "Unable to save download, storage permission denied.");
                        this.m = null;
                    }
                    return;
                }
            }
            e d$e1 = this.m;
            if(d$e1 != null && this.l) {
                if(d$e1.f) {
                    mainActivity0.c2().i(this.m.a, this.m.b, this.m.e, this.m.g);
                }
                else {
                    this.J(d$e1, d$e1.g);
                }
                this.m = null;
            }
        });
    }

    // 检测为 Lambda 实现
    private void A(MainActivity mainActivity0, Map map0) [...]

    // 检测为 Lambda 实现
    private static void B(h h0, String s, JSONObject jSONObject0) [...]

    // 检测为 Lambda 实现
    private static void C(Activity activity0, String s) [...]

    public void D() {
        if(d.p != null && d.p.getPath() != null) {
            Log.d("co.median.android.d", "onAppResume: Deleting file after viewing: " + d.p.getPath());
            this.f.getContentResolver().delete(d.p, null, null);
        }
    }

    private static void E(h h0, String s, JSONObject jSONObject0) {
        ((Activity)h0).runOnUiThread(() -> h0.a(l.b(s, jSONObject0)));
    }

    public static void F(h h0, String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("success", false);
            jSONObject0.put("error", s1);
            d.E(h0, s, jSONObject0);
        }
        catch(JSONException unused_ex) {
        }
    }

    public static void G(h h0, String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("success", true);
            d.E(h0, s, jSONObject0);
        }
        catch(JSONException unused_ex) {
        }
    }

    public void H(u u0) {
        this.i = u0;
    }

    private boolean I(e d$e0) {
        if(Build.VERSION.SDK_INT > 28) {
            return false;
        }
        if(this.g == co.median.android.d.d.f && androidx.core.content.a.checkSelfPermission(this.f, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.m = d$e0;
            this.h.a(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
            return true;
        }
        return false;
    }

    private void J(e d$e0, String s) {
        class c implements co.median.android.DownloadService.b {
            final String a;
            final d b;

            c(String s) {
                this.a = s;
                super();
            }

            @Override  // co.median.android.DownloadService$b
            public void a() {
                d.G(d.this.f, this.a);
            }

            @Override  // co.median.android.DownloadService$b
            public void b(String s) {
                d.F(d.this.f, this.a, s);
            }
        }

        DownloadService downloadService0 = this.k;
        c d$c0 = new c(this, s);
        downloadService0.h(d$e0, this.g, d$c0);
    }

    public void K() {
        if(this.l) {
            this.f.unbindService(this.n);
            this.l = false;
        }
    }

    private void L(String s, String s1, String s2, boolean z, boolean z1, String s3) {
        if(!this.l) {
            g.a().c("co.median.android.d", "verifyAndStartDownload: Unable to start download.", new Exception("DownloadService not bound."));
            return;
        }
        e d$e0 = new e(s, s1, s2, z, z1, false, s3);
        if(this.I(d$e0)) {
            return;
        }
        this.J(d$e0, s3);
    }

    public static void M(Activity activity0, Uri uri0, String s, boolean z) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setDataAndType(uri0, s);
            intent0.setFlags(0x10000001);
            activity0.startActivity(intent0);
            if(z) {
                d.p = uri0;
            }
        }
        catch(ActivityNotFoundException unused_ex) {
            activity0.runOnUiThread(() -> Toast.makeText(activity0, "Could not find an app to open this file.", 1).show());
        }
        catch(Exception exception0) {
            g.a().c("co.median.android.d", "viewFile: Exception:", exception0);
        }
    }

    private void j(Uri uri0) {
        Log.d("co.median.android.d", "addFileToGallery: Adding to Albums . . .");
        Intent intent0 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent0.setData(uri0);
        this.f.sendBroadcast(intent0);
    }

    public static Uri k(ContentResolver contentResolver0, String s, String s1, String s2) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("_display_name", s);
        contentValues0.put("mime_type", s1);
        contentValues0.put("relative_path", s2);
        Uri uri0 = d.r(s2);
        return uri0 == null ? null : d.l(uri0, contentResolver0, contentValues0, s, s1);
    }

    private static Uri l(Uri uri0, ContentResolver contentResolver0, ContentValues contentValues0, String s, String s1) {
        try {
            Uri uri1 = contentResolver0.insert(uri0, contentValues0);
            return uri1 == null ? d.n(uri0, contentResolver0, contentValues0, s, s1) : uri1;
        }
        catch(IllegalStateException unused_ex) {
            return d.n(uri0, contentResolver0, contentValues0, s, s1);
        }
    }

    public static File m(File file0, String s, String s1) {
        return new File(file0, d.w((s + "." + s1), file0));
    }

    private static Uri n(Uri uri0, ContentResolver contentResolver0, ContentValues contentValues0, String s, String s1) {
        try {
            contentValues0.put("_display_name", d.v(contentResolver0, uri0, s, MimeTypeMap.getSingleton().getExtensionFromMimeType(s1)));
            return contentResolver0.insert(uri0, contentValues0);
        }
        catch(IllegalStateException unused_ex) {
            return d.o(uri0, contentResolver0, contentValues0, s);
        }
    }

    private static Uri o(Uri uri0, ContentResolver contentResolver0, ContentValues contentValues0, String s) {
        try {
            contentValues0.put("_display_name", s + "_" + System.currentTimeMillis());
            return contentResolver0.insert(uri0, contentValues0);
        }
        catch(IllegalStateException unused_ex) {
            return null;
        }
    }

    @Override  // android.webkit.DownloadListener
    public void onDownloadStart(String s, String s1, String s2, String s3, long v) {
        class co.median.android.d.b implements Runnable {
            final d f;

            @Override
            public void run() {
                d.this.f.b3();
            }
        }

        String s7;
        u u0 = this.i;
        if(u0 != null) {
            u0.I();
        }
        MainActivity mainActivity0 = this.f;
        if(mainActivity0 != null) {
            mainActivity0.runOnUiThread(new co.median.android.d.b(this));
        }
        String s4 = TextUtils.isEmpty(s2) ? null : l.e(s, s2, s3);
        if(s.startsWith("blob:") && this.f != null) {
            boolean z = this.g == co.median.android.d.d.g;
            if(this.I(new e(s, s4, true, z, ""))) {
                return;
            }
            this.f.c2().i(s, s4, z, "");
            return;
        }
        this.j = s;
        if(s3 != null && !s3.equalsIgnoreCase("application/force-download") && !s3.equalsIgnoreCase("application/octet-stream")) {
            s7 = s3;
        }
        else {
            MimeTypeMap mimeTypeMap0 = MimeTypeMap.getSingleton();
            String s5 = MimeTypeMap.getFileExtensionFromUrl(s);
            if(s5 == null || s5.isEmpty()) {
                s7 = s3;
            }
            else {
                String s6 = mimeTypeMap0.getMimeTypeFromExtension(s5);
                s7 = s6 == null ? s3 : s6;
            }
        }
        this.L(s, s4, s7, false, false, "");
    }

    public void p(String s, String s1, boolean z, boolean z1, String s2) {
        String s4;
        if(TextUtils.isEmpty(s)) {
            Log.d("co.median.android.d", "downloadFile: Url empty!");
            d.F(this.f, s2, "URL cannot be empty.");
            return;
        }
        if(s.startsWith("blob:") && this.f != null) {
            if(this.g == co.median.android.d.d.g) {
                z1 = true;
            }
            if(this.I(new e(s, s1, true, z1, s2))) {
                return;
            }
            this.f.c2().i(s, s1, z1, s2);
            return;
        }
        MimeTypeMap mimeTypeMap0 = MimeTypeMap.getSingleton();
        String s3 = MimeTypeMap.getFileExtensionFromUrl(s);
        if(s3 == null || s3.isEmpty()) {
            s4 = "*/*";
        }
        else {
            s4 = mimeTypeMap0.getMimeTypeFromExtension(s3);
            if(s4 == null) {
                s4 = "*/*";
            }
        }
        this.L(s, s1, s4, z, z1, s2);
    }

    private static boolean q(ContentResolver contentResolver0, Uri uri0, String s) {
        try(Cursor cursor0 = contentResolver0.query(uri0, new String[]{"_display_name"}, "_display_name=?", new String[]{s}, null)) {
            if(cursor0 != null && cursor0.moveToFirst()) {
                return true;
            }
            if(cursor0 != null) {
                return false;
            }
        }
        catch(Exception exception0) {
            Log.w("co.median.android.d", "externalFileExists: ", exception0);
        }
        return false;
    }

    private static Uri r(String s) {
        if(Objects.equals(s, Environment.DIRECTORY_PICTURES)) {
            return MediaStore.Images.Media.getContentUri("external");
        }
        return Objects.equals(s, Environment.DIRECTORY_DOWNLOADS) ? MediaStore.Files.getContentUri("external") : null;
    }

    public static String s(Uri uri0, ContentResolver contentResolver0) {
        Cursor cursor0 = contentResolver0.query(uri0, new String[]{"_display_name"}, null, null, null);
        String s = null;
        if(cursor0 != null) {
            try {
                if(cursor0.moveToFirst()) {
                    s = cursor0.getString(cursor0.getColumnIndex("_display_name"));
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
            cursor0.close();
        }
        return s;
    }

    public static String t(String s) {
        int v = s.lastIndexOf(46);
        if(v == -1) {
            return null;
        }
        return v == 0 ? s : s.substring(v + 1);
    }

    public String u() {
        return this.j;
    }

    private static String v(ContentResolver contentResolver0, Uri uri0, String s, String s1) {
        String s2 = s;
        for(int v = 1; d.q(contentResolver0, uri0, s2 + "." + s1); ++v) {
            s2 = s + " (" + v + ")";
        }
        return s2;
    }

    public static String w(String s, File file0) {
        if(!new File(file0, s).exists()) {
            return s;
        }
        String s1 = s.substring(0, s.lastIndexOf(46));
        String s2 = s.substring(s.lastIndexOf(46));
        File file1 = new File(file0, s1 + "_" + 1 + s2);
        int v = 1;
        while(file1.exists()) {
            ++v;
            file1 = new File(file0, s1 + "_" + v + s2);
        }
        return file1.getName();
    }

    public void x(Uri uri0, String s, boolean z, boolean z1, String s1) {
        if(uri0 == null) {
            return;
        }
        if(this.g == co.median.android.d.d.f) {
            if(z) {
                this.j(uri0);
            }
            if(z1) {
                d.M(this.f, uri0, s, false);
                return;
            }
            B0.u u0 = () -> {
                if(z) {
                    Toast.makeText(this.f, 0x7F12007F, 0).show();  // string:file_download_finished_gallery "Image saved to Gallery"
                    return;
                }
                Toast.makeText(this.f, String.format("%1$s downloaded", s1), 0).show();
            };
            this.f.runOnUiThread(u0);
            return;
        }
        if(z1) {
            d.M(this.f, uri0, s, true);
            return;
        }
        v v0 = () -> Toast.makeText(this.f, String.format("%1$s downloaded", s1), 0).show();
        this.f.runOnUiThread(v0);
    }

    // 检测为 Lambda 实现
    private void y(boolean z, String s) [...]

    // 检测为 Lambda 实现
    private void z(String s) [...]
}

