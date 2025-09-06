package d2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class c {
    static abstract class a {
    }

    public static class b {
        private String a;
        private final Set b;
        private final Set c;
        private int d;
        private int e;
        private h f;
        private final Set g;

        private b(F f0, F[] arr_f) {
            this.a = null;
            HashSet hashSet0 = new HashSet();
            this.b = hashSet0;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            E.c(f0, "Null interface");
            hashSet0.add(f0);
            for(int v = 0; v < arr_f.length; ++v) {
                E.c(arr_f[v], "Null interface");
            }
            Collections.addAll(this.b, arr_f);
        }

        b(F f0, F[] arr_f, a c$a0) {
            this(f0, arr_f);
        }

        private b(Class class0, Class[] arr_class) {
            this.a = null;
            HashSet hashSet0 = new HashSet();
            this.b = hashSet0;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            E.c(class0, "Null interface");
            hashSet0.add(F.b(class0));
            for(int v = 0; v < arr_class.length; ++v) {
                Class class1 = arr_class[v];
                E.c(class1, "Null interface");
                F f0 = F.b(class1);
                this.b.add(f0);
            }
        }

        b(Class class0, Class[] arr_class, a c$a0) {
            this(class0, arr_class);
        }

        static b a(b c$b0) {
            return c$b0.g();
        }

        public b b(r r0) {
            E.c(r0, "Null dependency");
            this.j(r0.c());
            this.c.add(r0);
            return this;
        }

        public b c() {
            return this.i(1);
        }

        public c d() {
            E.d(this.f != null, "Missing required property: factory.");
            return new c(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g, null);
        }

        public b e() {
            return this.i(2);
        }

        public b f(h h0) {
            this.f = (h)E.c(h0, "Null factory");
            return this;
        }

        private b g() {
            this.e = 1;
            return this;
        }

        public b h(String s) {
            this.a = s;
            return this;
        }

        private b i(int v) {
            E.d(this.d == 0, "Instantiation type has already been set.");
            this.d = v;
            return this;
        }

        private void j(F f0) {
            E.a(!this.b.contains(f0), "Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    private final String a;
    private final Set b;
    private final Set c;
    private final int d;
    private final int e;
    private final h f;
    private final Set g;

    private c(String s, Set set0, Set set1, int v, int v1, h h0, Set set2) {
        this.a = s;
        this.b = Collections.unmodifiableSet(set0);
        this.c = Collections.unmodifiableSet(set1);
        this.d = v;
        this.e = v1;
        this.f = h0;
        this.g = Collections.unmodifiableSet(set2);
    }

    c(String s, Set set0, Set set1, int v, int v1, h h0, Set set2, a c$a0) {
        this(s, set0, set1, v, v1, h0, set2);
    }

    // 检测为 Lambda 实现
    public static Object a(Object object0, e e0) [...]

    // 检测为 Lambda 实现
    public static Object b(Object object0, e e0) [...]

    public static b c(F f0) {
        return new b(f0, new F[0], null);
    }

    public static b d(F f0, F[] arr_f) {
        return new b(f0, arr_f, null);
    }

    public static b e(Class class0) {
        return new b(class0, new Class[0], null);
    }

    public static b f(Class class0, Class[] arr_class) {
        return new b(class0, arr_class, null);
    }

    public Set g() {
        return this.c;
    }

    public h h() {
        return this.f;
    }

    public String i() {
        return this.a;
    }

    public Set j() {
        return this.b;
    }

    public Set k() {
        return this.g;
    }

    public static c l(Object object0, Class class0) {
        return c.m(class0).f((e e0) -> object0).d();
    }

    public static b m(Class class0) {
        return b.a(c.e(class0));
    }

    public boolean n() {
        return this.d == 1;
    }

    public boolean o() {
        return this.d == 2;
    }

    public boolean p() {
        return this.e == 0;
    }

    private static Object q(Object object0, e e0) [...] // Inlined contents

    private static Object r(Object object0, e e0) [...] // Inlined contents

    public static c s(Object object0, Class class0, Class[] arr_class) {
        return c.f(class0, arr_class).f((e e0) -> object0).d();
    }

    public c t(h h0) {
        return new c(this.a, this.b, this.c, this.d, this.e, h0, this.g);
    }

    @Override
    public String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}

