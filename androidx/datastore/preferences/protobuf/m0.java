package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

public final class m0 {
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;
    private static final m0 f;

    static {
        m0.f = new m0(0, new int[0], new Object[0], false);
    }

    private m0() {
        this(0, new int[8], new Object[8], true);
    }

    private m0(int v, int[] arr_v, Object[] arr_object, boolean z) {
        this.d = -1;
        this.a = v;
        this.b = arr_v;
        this.c = arr_object;
        this.e = z;
    }

    void a() {
        if(!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    private void b() {
        int v = this.a;
        int[] arr_v = this.b;
        if(v == arr_v.length) {
            int v1 = v + (v >= 4 ? v >> 1 : 8);
            this.b = Arrays.copyOf(arr_v, v1);
            this.c = Arrays.copyOf(this.c, v1);
        }
    }

    private static boolean c(int[] arr_v, int[] arr_v1, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(arr_v[v1] != arr_v1[v1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] arr_object, Object[] arr_object1, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(!arr_object[v1].equals(arr_object1[v1])) {
                return false;
            }
        }
        return true;
    }

    public static m0 e() {
        return m0.f;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof m0 ? this.a == ((m0)object0).a && m0.c(this.b, ((m0)object0).b, this.a) && m0.d(this.c, ((m0)object0).c, this.a) : false;
    }

    public int f() {
        int v5;
        int v = this.d;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.a; ++v1) {
            int v3 = this.b[v1];
            int v4 = v3 >>> 3;
            switch(v3 & 7) {
                case 0: {
                    v5 = j.S(v4, ((long)(((Long)this.c[v1]))));
                    break;
                }
                case 1: {
                    v5 = j.n(v4, ((long)(((Long)this.c[v1]))));
                    break;
                }
                case 2: {
                    v5 = j.f(v4, ((g)this.c[v1]));
                    break;
                }
                case 3: {
                    v5 = j.P(v4) * 2 + ((m0)this.c[v1]).f();
                    break;
                }
                case 5: {
                    v5 = j.l(v4, ((int)(((Integer)this.c[v1]))));
                    break;
                }
                default: {
                    throw new IllegalStateException(z.d());
                }
            }
            v2 += v5;
        }
        this.d = v2;
        return v2;
    }

    public int g() {
        int v = this.d;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.a; ++v1) {
            v2 += j.D(r0.a(this.b[v1]), ((g)this.c[v1]));
        }
        this.d = v2;
        return v2;
    }

    private static int h(int[] arr_v, int v) {
        int v1 = 17;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 = v1 * 0x1F + arr_v[v2];
        }
        return v1;
    }

    @Override
    public int hashCode() {
        return ((this.a + 0x20F) * 0x1F + m0.h(this.b, this.a)) * 0x1F + m0.i(this.c, this.a);
    }

    private static int i(Object[] arr_object, int v) {
        int v1 = 17;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 = v1 * 0x1F + arr_object[v2].hashCode();
        }
        return v1;
    }

    public void j() {
        this.e = false;
    }

    static m0 k(m0 m00, m0 m01) {
        int v = m00.a + m01.a;
        int[] arr_v = Arrays.copyOf(m00.b, v);
        System.arraycopy(m01.b, 0, arr_v, m00.a, m01.a);
        Object[] arr_object = Arrays.copyOf(m00.c, v);
        System.arraycopy(m01.c, 0, arr_object, m00.a, m01.a);
        return new m0(v, arr_v, arr_object, true);
    }

    static m0 l() {
        return new m0();
    }

    final void m(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < this.a; ++v1) {
            Q.c(stringBuilder0, v, String.valueOf(r0.a(this.b[v1])), this.c[v1]);
        }
    }

    void n(int v, Object object0) {
        this.a();
        this.b();
        int v1 = this.a;
        this.b[v1] = v;
        this.c[v1] = object0;
        this.a = v1 + 1;
    }

    void o(s0 s00) {
        if(s00.i() == a.g) {
            for(int v = this.a - 1; v >= 0; --v) {
                s00.c(r0.a(this.b[v]), this.c[v]);
            }
            return;
        }
        for(int v1 = 0; v1 < this.a; ++v1) {
            s00.c(r0.a(this.b[v1]), this.c[v1]);
        }
    }

    private static void p(int v, Object object0, s0 s00) {
        switch(v & 7) {
            case 0: {
                s00.p(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 1: {
                s00.h(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 2: {
                s00.w(v >>> 3, ((g)object0));
                return;
            }
            case 3: {
                if(s00.i() == a.f) {
                    s00.s(v >>> 3);
                    ((m0)object0).q(s00);
                    s00.F(v >>> 3);
                    return;
                }
                s00.F(v >>> 3);
                ((m0)object0).q(s00);
                s00.s(v >>> 3);
                return;
            }
            case 5: {
                s00.d(v >>> 3, ((int)(((Integer)object0))));
                return;
            }
            default: {
                throw new RuntimeException(z.d());
            }
        }
    }

    public void q(s0 s00) {
        if(this.a == 0) {
            return;
        }
        if(s00.i() == a.f) {
            for(int v = 0; v < this.a; ++v) {
                m0.p(this.b[v], this.c[v], s00);
            }
            return;
        }
        for(int v1 = this.a - 1; v1 >= 0; --v1) {
            m0.p(this.b[v1], this.c[v1], s00);
        }
    }
}

