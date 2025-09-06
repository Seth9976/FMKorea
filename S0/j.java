package s0;

import java.util.HashSet;
import java.util.Set;

public abstract class j {
    public static class a extends j {
        a(String s, String s1) {
            super(s, s1);
        }
    }

    public static class b extends j {
        b(String s, String s1) {
            super(s, s1);
        }
    }

    private final String a;
    private final String b;
    private static final Set c;

    static {
        j.c = new HashSet();
    }

    j(String s, String s1) {
        this.a = s;
        this.b = s1;
        j.c.add(this);
    }
}

