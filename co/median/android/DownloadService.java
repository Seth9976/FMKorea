package co.median.android;

import I0.g;
import I0.l;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class DownloadService extends Service {
    public class a extends Binder {
        final DownloadService f;

        public DownloadService a() {
            return DownloadService.this;
        }
    }

    public interface b {
        void a();

        void b(String arg1);
    }

    class c {
        private final int a;
        private final String b;
        private boolean c;
        private HttpURLConnection d;
        private InputStream e;
        private FileOutputStream f;
        private File g;
        private Uri h;
        private String i;
        private String j;
        private String k;
        private boolean l;
        private boolean m;
        private final d n;
        private final b o;
        AtomicReference p;
        private boolean q;
        final DownloadService r;

        public c(String s, String s1, String s2, boolean z, boolean z1, d d$d0, b downloadService$b0) {
            this.g = null;
            this.q = false;
            int v = downloadService0.i;
            downloadService0.i = v + 1;
            this.a = v;
            this.b = s;
            this.i = s1;
            this.k = s2;
            this.c = false;
            this.l = z;
            this.m = z1;
            this.n = d$d0;
            this.o = downloadService$b0;
            this.p = new AtomicReference(s1);
        }

        public void c() {
            this.c = false;
            Toast.makeText(DownloadService.this, "Download canceled " + this.i, 0).show();
        }

        public void d() {
            try {
                InputStream inputStream0 = this.e;
                if(inputStream0 != null) {
                    inputStream0.close();
                }
                FileOutputStream fileOutputStream0 = this.f;
                if(fileOutputStream0 != null) {
                    fileOutputStream0.close();
                }
                HttpURLConnection httpURLConnection0 = this.d;
                if(httpURLConnection0 != null) {
                    httpURLConnection0.disconnect();
                }
            }
            catch(IOException iOException0) {
                g.a().c("DownloadService", "startDownload: ", iOException0);
            }
        }

        private void e() {
            String s = Uri.parse(this.b).getSchemeSpecificPart();
            this.k = s.substring(0, s.indexOf(";"));
            this.j = MimeTypeMap.getSingleton().getExtensionFromMimeType(this.k);
            if(TextUtils.isEmpty(this.i)) {
                int v = s.indexOf("filename=");
                if(v != -1) {
                    int v1 = s.indexOf(";", v + 9);
                    this.i = Uri.decode((v1 == -1 ? s.substring(v + 9) : s.substring(v + 9, v1)));
                }
                if(TextUtils.isEmpty(this.i)) {
                    this.i = "download";
                }
            }
            if(!Objects.equals(this.i, "download")) {
                String s1 = co.median.android.d.t(this.i);
                if(!TextUtils.isEmpty(s1)) {
                    this.j = s1;
                    if(!Objects.equals(this.i, s1)) {
                        this.i = this.i.substring(0, this.i.length() - (s1.length() + 1));
                        this.k = MimeTypeMap.getSingleton().getMimeTypeFromExtension(this.j);
                    }
                }
            }
            this.g();
            if(s.contains(";base64")) {
                byte[] arr_b = Base64.decode(s.substring(s.indexOf(";base64,") + 8), 0);
                this.f.write(arr_b);
                return;
            }
            this.f.write(s.substring(s.indexOf(",") + 1).getBytes(StandardCharsets.UTF_8));
        }

        private void f() {
            HttpURLConnection httpURLConnection0 = (HttpURLConnection)new URL(this.b).openConnection();
            this.d = httpURLConnection0;
            httpURLConnection0.setInstanceFollowRedirects(true);
            this.d.setRequestProperty("User-Agent", DownloadService.this.j);
            this.d.setConnectTimeout(5000);
            this.d.connect();
            if(this.d.getResponseCode() != 200) {
                g.a().b("DownloadService", "Server returned HTTP " + this.d.getResponseCode() + " " + this.d.getResponseMessage());
                this.c = false;
                this.o.b("Response code: " + this.d.getResponseCode() + ". " + this.d.getResponseMessage());
                return;
            }
            Log.d("DownloadService", "startDownload: File size in MB: " + ((double)this.d.getContentLength()) / 1048576.0);
            if(this.d.getHeaderField("Content-Type") != null) {
                this.k = this.d.getHeaderField("Content-Type");
            }
            if(TextUtils.isEmpty(this.i)) {
                String s1 = this.d.getHeaderField("Content-Disposition");
                String s2 = l.e(this.b, s1, this.k);
                int v = s2.lastIndexOf(46);
                if(v == -1) {
                    this.i = s2;
                    this.j = "";
                }
                else if(v == 0) {
                    this.i = "download";
                    this.j = s2.substring(1);
                }
                else {
                    this.i = s2.substring(0, v);
                    this.j = s2.substring(v + 1);
                }
                if(!TextUtils.isEmpty(this.j)) {
                    this.k = MimeTypeMap.getSingleton().getMimeTypeFromExtension(this.j);
                }
            }
            else {
                String s = co.median.android.d.t(this.i);
                this.j = s;
                if(TextUtils.isEmpty(s)) {
                    this.j = MimeTypeMap.getSingleton().getExtensionFromMimeType(this.k);
                }
                else if(Objects.equals(this.i, this.j)) {
                    this.i = "download";
                }
                else {
                    this.i = this.i.substring(0, this.i.length() - (this.j.length() + 1));
                    this.k = MimeTypeMap.getSingleton().getMimeTypeFromExtension(this.j);
                }
            }
            this.g();
            int v1 = this.d.getContentLength();
            this.e = this.d.getInputStream();
            byte[] arr_b = new byte[0x1000];
            int v2 = 0;
            while(true) {
                int v3 = this.e.read(arr_b);
                if(v3 == -1 || !this.c) {
                    break;
                }
                this.f.write(arr_b, 0, v3);
                v2 += v3;
                Log.d("DownloadService", "startDownload: Download progress: " + v2 * 100 / v1);
            }
        }

        private void g() {
            if(this.n == d.f) {
                if(Build.VERSION.SDK_INT > 28) {
                    ContentResolver contentResolver0 = DownloadService.this.getApplicationContext().getContentResolver();
                    if(!this.l || !this.k.contains("image")) {
                        this.h = co.median.android.d.k(contentResolver0, this.i, this.k, Environment.DIRECTORY_DOWNLOADS);
                        this.l = false;
                    }
                    else {
                        this.h = co.median.android.d.k(contentResolver0, this.i, this.k, Environment.DIRECTORY_PICTURES);
                    }
                    Uri uri0 = this.h;
                    if(uri0 != null) {
                        this.p.set(co.median.android.d.s(uri0, contentResolver0));
                        this.f = (FileOutputStream)contentResolver0.openOutputStream(this.h);
                        return;
                    }
                    this.c = false;
                    DownloadService.this.f.post(() -> Toast.makeText(DownloadService.this, "Download Error", 0).show());
                    g.a().b("DownloadService", "Error creating file - filename: " + this.i + ", mimetype: " + this.k);
                    return;
                }
                this.g = this.l ? co.median.android.d.m(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), this.i, this.j) : co.median.android.d.m(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), this.i, this.j);
                this.p.set(this.g.getName());
                this.f = new FileOutputStream(this.g);
                return;
            }
            this.m = true;
            File file0 = co.median.android.d.m(DownloadService.this.getFilesDir(), this.i, this.j);
            this.g = file0;
            this.p.set(file0.getName());
            this.f = new FileOutputStream(this.g);
        }

        public int h() {
            return this.a;
        }

        public boolean i() {
            return this.c;
        }

        // 检测为 Lambda 实现
        private void j() [...]

        // 检测为 Lambda 实现
        private void k() [...]

        public void l() {
            Log.d("DownloadService", "startDownload: Starting download");
            this.c = true;
            new Thread(() -> {
                Log.d("DownloadService", "startDownload: Thread started");
                try {
                    Uri uri0 = Uri.parse(this.b);
                    String s = uri0.getScheme();
                    Objects.requireNonNull(s);
                    switch(s) {
                        case "data": {
                            goto label_15;
                        }
                        case "http": 
                        case "https": {
                            goto label_17;
                        }
                        default: {
                            this.o.b("Unsupported URI scheme: " + uri0.getScheme());
                            if(!this.q) {
                                break;
                            }
                            goto label_10;
                        }
                    }
                }
                catch(FileNotFoundException unused_ex) {
                    goto label_30;
                }
                catch(Exception exception0) {
                    goto label_36;
                }
                catch(Throwable throwable0) {
                    goto label_42;
                }
                File file0 = this.g;
                if(file0 != null) {
                    file0.delete();
                }
            label_10:
                this.c = false;
                this.g = null;
                this.q = false;
                this.d();
                return;
                try {
                    try {
                    label_15:
                        this.e();
                        goto label_18;
                    label_17:
                        this.f();
                    label_18:
                        this.q = true;
                        this.c = false;
                        if(this.h == null && this.g != null) {
                            this.h = FileProvider.h(DownloadService.this, "com.fmkorea.m.fmk.fileprovider", this.g);
                        }
                        if(DownloadService.this.g != null) {
                            DownloadService.this.g.x(this.h, this.k, this.l, this.m, ((String)this.p.get()));
                        }
                        this.o.a();
                        goto label_51;
                    }
                    catch(FileNotFoundException unused_ex) {
                    }
                    catch(Exception exception0) {
                        goto label_36;
                    }
                label_30:
                    this.o.b("Failed to create download file. filename = " + this.i + ", mimetype = " + this.k + ".");
                    if(!this.q) {
                        goto label_32;
                    }
                    goto label_55;
                }
                catch(Throwable throwable0) {
                    goto label_42;
                }
            label_32:
                File file1 = this.g;
                if(file1 != null) {
                    file1.delete();
                    goto label_55;
                    try {
                    label_36:
                        this.o.b("Unexpected error occurred: " + exception0.getLocalizedMessage());
                        if(!this.q) {
                            goto label_38;
                        }
                        goto label_55;
                    }
                    catch(Throwable throwable0) {
                        goto label_42;
                    }
                label_38:
                    file1 = this.g;
                    if(file1 != null) {
                        file1.delete();
                        goto label_55;
                    label_42:
                        if(!this.q) {
                            File file2 = this.g;
                            if(file2 != null) {
                                file2.delete();
                            }
                        }
                        this.c = false;
                        this.g = null;
                        this.q = false;
                        this.d();
                        throw throwable0;
                    label_51:
                        if(!this.q) {
                            file1 = this.g;
                            if(file1 != null) {
                                file1.delete();
                            }
                        }
                    }
                }
            label_55:
                this.c = false;
                this.g = null;
                this.q = false;
                this.d();
            }).start();
        }
    }

    private final Handler f;
    private co.median.android.d g;
    private final Map h;
    private int i;
    private String j;

    public DownloadService() {
        this.f = new Handler(Looper.getMainLooper());
        this.h = new HashMap();
        this.i = 0;
    }

    public void f(int v) {
        c downloadService$c0 = (c)this.h.get(v);
        if(downloadService$c0 != null && downloadService$c0.i()) {
            downloadService$c0.c();
        }
    }

    public void g(co.median.android.d d0) {
        this.g = d0;
    }

    public void h(e d$e0, d d$d0, b downloadService$b0) {
        this.i(d$e0.a, d$e0.b, d$e0.c, d$e0.d, d$e0.e, d$d0, downloadService$b0);
    }

    public void i(String s, String s1, String s2, boolean z, boolean z1, d d$d0, b downloadService$b0) {
        c downloadService$c0 = new c(this, s, s1, s2, z, z1, d$d0, downloadService$b0);
        this.h.put(downloadService$c0.h(), downloadService$c0);
        downloadService$c0.l();
    }

    @Override  // android.app.Service
    public IBinder onBind(Intent intent0) {
        return new a(this);
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.j = I0.a.V(this).k;
    }

    @Override  // android.app.Service
    public int onStartCommand(Intent intent0, int v, int v1) {
        if(intent0.getAction().equals("action_cancel_download")) {
            this.f(intent0.getIntExtra("download_id", 0));
        }
        return 2;
    }
}

