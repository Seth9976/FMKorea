package c3;

import d3.b;
import d3.d;

public final class a {
    public static final a a;
    private static final String b;
    private static final String c;

    static {
        a.a = new a();
        String s = b.class.getCanonicalName();
        if(s == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        a.b = s;
        String s1 = d.class.getCanonicalName();
        if(s1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        a.c = s1;
    }

    public final String a() {
        return a.b;
    }

    public final String b() {
        return a.c;
    }
}

