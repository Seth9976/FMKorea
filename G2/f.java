package g2;

import android.util.Log;

public class f {
    private final String a;
    private int b;
    static final f c;

    static {
        f.c = new f("FirebaseCrashlytics");
    }

    public f(String s) {
        this.a = s;
        this.b = 4;
    }

    private boolean a(int v) {
        return this.b <= v || Log.isLoggable(this.a, v);
    }

    public void b(String s) {
        this.c(s, null);
    }

    public void c(String s, Throwable throwable0) {
        if(this.a(3)) {
            Log.d(this.a, s, throwable0);
        }
    }

    public void d(String s) {
        this.e(s, null);
    }

    public void e(String s, Throwable throwable0) {
        if(this.a(6)) {
            Log.e(this.a, s, throwable0);
        }
    }

    public static f f() {
        return f.c;
    }

    public void g(String s) {
        this.h(s, null);
    }

    public void h(String s, Throwable throwable0) {
        if(this.a(4)) {
            Log.i(this.a, s, throwable0);
        }
    }

    public void i(String s) [...] // 潜在的解密器

    public void j(String s, Throwable throwable0) {
        if(this.a(2)) {
            Log.v(this.a, s, throwable0);
        }
    }

    public void k(String s) {
        this.l(s, null);
    }

    public void l(String s, Throwable throwable0) {
        if(this.a(5)) {
            Log.w(this.a, s, throwable0);
        }
    }
}

