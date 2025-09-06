package s0;

import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class a implements h {
    static abstract class s0.a.a {
        static final Set a;

        static {
            s0.a.a.a = new HashSet(Arrays.asList(m.d().a()));
        }
    }

    public static class b extends a {
        b(String s, String s1) {
            super(s, s1);
        }

        @Override  // s0.a
        public final boolean c() {
            return true;
        }
    }

    public static class c extends a {
        c(String s, String s1) {
            super(s, s1);
        }

        @Override  // s0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    public static class d extends a {
        d(String s, String s1) {
            super(s, s1);
        }

        @Override  // s0.a
        public final boolean c() {
            return false;
        }
    }

    public static class e extends a {
        e(String s, String s1) {
            super(s, s1);
        }

        @Override  // s0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    public static class f extends a {
        f(String s, String s1) {
            super(s, s1);
        }

        @Override  // s0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static class g extends a {
        g(String s, String s1) {
            super(s, s1);
        }

        @Override  // s0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class s0.a.h extends a {
        s0.a.h(String s, String s1) {
            super(s, s1);
        }

        @Override  // s0.a
        public final boolean c() [...] // 潜在的解密器
    }

    public static abstract class i extends a {
        i(String s, String s1) {
            super(s, s1);
        }

        @Override  // s0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    private final String a;
    private final String b;
    private static final Set c;

    static {
        a.c = new HashSet();
    }

    a(String s, String s1) {
        this.a = s;
        this.b = s1;
        a.c.add(this);
    }

    @Override  // s0.h
    public String a() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override  // s0.h
    public boolean b() {
        return this.c() || this.d();
    }

    public abstract boolean c();

    public boolean d() {
        return T3.a.b(s0.a.a.a, this.b);
    }

    public static Set e() {
        return Collections.unmodifiableSet(a.c);
    }
}

