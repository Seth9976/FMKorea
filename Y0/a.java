package y0;

import android.app.Application;
import z3.k;

final class a {
    public static final a a;

    static {
        a.a = new a();
    }

    public final String a() {
        String s = Application.getProcessName();
        k.d(s, "getProcessName()");
        return s;
    }
}

