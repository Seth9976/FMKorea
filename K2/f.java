package k2;

import j2.i;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

class f implements a {
    static class b {
        public final byte[] a;
        public final int b;

        b(byte[] arr_b, int v) {
            this.a = arr_b;
            this.b = v;
        }
    }

    private final File a;
    private final int b;
    private e c;
    private static final Charset d;

    static {
        f.d = Charset.forName("UTF-8");
    }

    f(File file0, int v) {
        this.a = file0;
        this.b = v;
    }

    @Override  // k2.a
    public void a() {
        i.e(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override  // k2.a
    public String b() {
        byte[] arr_b = this.c();
        return arr_b == null ? null : new String(arr_b, f.d);
    }

    @Override  // k2.a
    public byte[] c() {
        b f$b0 = this.g();
        if(f$b0 == null) {
            return null;
        }
        byte[] arr_b = new byte[f$b0.b];
        System.arraycopy(f$b0.a, 0, arr_b, 0, f$b0.b);
        return arr_b;
    }

    @Override  // k2.a
    public void d() {
        this.a();
        this.a.delete();
    }

    @Override  // k2.a
    public void e(long v, String s) {
        this.h();
        this.f(v, s);
    }

    private void f(long v, String s) {
        if(this.c == null) {
            return;
        }
        if(s == null) {
            s = "null";
        }
        try {
            int v1 = this.b / 4;
            if(s.length() > v1) {
                s = "..." + s.substring(s.length() - v1);
            }
            this.c.j(String.format(Locale.US, "%d %s%n", v, s.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f.d));
            while(true) {
                if(this.c.J() || this.c.Z() <= this.b) {
                    return;
                }
                this.c.R();
            }
        }
        catch(IOException iOException0) {
        }
        g2.f.f().e("There was a problem writing to the Crashlytics log.", iOException0);
    }

    private b g() {
        class k2.f.a implements d {
            final byte[] a;
            final int[] b;
            final f c;

            k2.f.a(byte[] arr_b, int[] arr_v) {
                this.a = arr_b;
                this.b = arr_v;
                super();
            }

            @Override  // k2.e$d
            public void a(InputStream inputStream0, int v) {
                try(inputStream0) {
                    inputStream0.read(this.a, this.b[0], v);
                    this.b[0] += v;
                }
            }
        }

        if(!this.a.exists()) {
            return null;
        }
        this.h();
        e e0 = this.c;
        if(e0 == null) {
            return null;
        }
        int[] arr_v = {0};
        byte[] arr_b = new byte[e0.Z()];
        try {
            this.c.w(new k2.f.a(this, arr_b, arr_v));
            return new b(arr_b, arr_v[0]);
        }
        catch(IOException iOException0) {
            g2.f.f().e("A problem occurred while reading the Crashlytics log file.", iOException0);
            return new b(arr_b, arr_v[0]);
        }
    }

    private void h() {
        if(this.c == null) {
            try {
                this.c = new e(this.a);
            }
            catch(IOException iOException0) {
                g2.f.f().e("Could not open log file: " + this.a, iOException0);
            }
        }
    }
}

