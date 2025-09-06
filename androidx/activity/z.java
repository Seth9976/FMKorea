package androidx.activity;

import android.content.res.Resources;
import y3.l;
import z3.g;
import z3.k;

public final class z {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final z a(int v, int v1, l l0) {
            k.e(l0, "detectDarkMode");
            return new z(v, v1, 0, l0, null);
        }

        public static z b(a z$a0, int v, int v1, l l0, int v2, Object object0) {
            static final class androidx.activity.z.a.a extends z3.l implements l {
                public static final androidx.activity.z.a.a g;

                static {
                    androidx.activity.z.a.a.g = new androidx.activity.z.a.a();
                }

                androidx.activity.z.a.a() {
                    super(1);
                }

                public final Boolean b(Resources resources0) {
                    k.e(resources0, "resources");
                    return (resources0.getConfiguration().uiMode & 0x30) == 0x20;
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.b(((Resources)object0));
                }
            }

            if((v2 & 4) != 0) {
                l0 = androidx.activity.z.a.a.g;
            }
            return z$a0.a(v, v1, l0);
        }

        public final z c(int v) {
            static final class b extends z3.l implements l {
                public static final b g;

                static {
                    b.g = new b();
                }

                b() {
                    super(1);
                }

                public final Boolean b(Resources resources0) {
                    k.e(resources0, "<anonymous parameter 0>");
                    return true;
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.b(((Resources)object0));
                }
            }

            return new z(v, v, 2, b.g, null);
        }

        public final z d(int v, int v1) {
            static final class c extends z3.l implements l {
                public static final c g;

                static {
                    c.g = new c();
                }

                c() {
                    super(1);
                }

                public final Boolean b(Resources resources0) {
                    k.e(resources0, "<anonymous parameter 0>");
                    return false;
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.b(((Resources)object0));
                }
            }

            return new z(v, v1, 1, c.g, null);
        }
    }

    private final int a;
    private final int b;
    private final int c;
    private final l d;
    public static final a e;

    static {
        z.e = new a(null);
    }

    private z(int v, int v1, int v2, l l0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = l0;
    }

    public z(int v, int v1, int v2, l l0, g g0) {
        this(v, v1, v2, l0);
    }

    public final int a() {
        return this.b;
    }

    public final l b() {
        return this.d;
    }

    public final int c() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    public final int d(boolean z) {
        return z ? this.b : this.a;
    }

    public final int e(boolean z) {
        if(this.c == 0) {
            return 0;
        }
        return z ? this.b : this.a;
    }
}

