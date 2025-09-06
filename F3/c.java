package f3;

import com.onesignal.m1;

public class c implements b {
    private final m1 a;

    public c(m1 m10) {
        this.a = m10;
    }

    @Override  // f3.b
    public String a() {
        String s = this.a.f();
        return this.a.e(s, "PREFS_OS_LANGUAGE", "en");
    }
}

