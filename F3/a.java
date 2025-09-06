package f3;

import com.onesignal.m1;

public class a {
    private b a;
    private static a b;

    static {
    }

    public a(m1 m10) {
        a.b = this;
        if(m10.e(m10.f(), "PREFS_OS_LANGUAGE", null) != null) {
            this.a = new c(m10);
            return;
        }
        this.a = new d();
    }

    public static a a() {
        return a.b;
    }

    public String b() {
        return this.a.a();
    }
}

