package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class j extends f {
    static abstract class a {
    }

    static abstract class b extends j {
        final byte[] e;
        final int f;
        int g;
        int h;

        b(int v) {
            super(null);
            if(v < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] arr_b = new byte[Math.max(v, 20)];
            this.e = arr_b;
            this.f = arr_b.length;
        }

        final void S0(byte b) {
            int v = this.g;
            this.g = v + 1;
            this.e[v] = b;
            ++this.h;
        }

        final void T0(int v) {
            int v1 = this.g;
            this.g = v1 + 1;
            this.e[v1] = (byte)(v & 0xFF);
            this.g = v1 + 2;
            this.e[v1 + 1] = (byte)(v >> 8 & 0xFF);
            this.g = v1 + 3;
            this.e[v1 + 2] = (byte)(v >> 16 & 0xFF);
            this.g = v1 + 4;
            this.e[v1 + 3] = (byte)(v >> 24 & 0xFF);
            this.h += 4;
        }

        final void U0(long v) {
            int v1 = this.g;
            this.g = v1 + 1;
            this.e[v1] = (byte)(((int)(v & 0xFFL)));
            this.g = v1 + 2;
            this.e[v1 + 1] = (byte)(((int)(v >> 8 & 0xFFL)));
            this.g = v1 + 3;
            this.e[v1 + 2] = (byte)(((int)(v >> 16 & 0xFFL)));
            this.g = v1 + 4;
            this.e[v1 + 3] = (byte)(((int)(0xFFL & v >> 24)));
            this.g = v1 + 5;
            this.e[v1 + 4] = (byte)(((int)(v >> 0x20)) & 0xFF);
            this.g = v1 + 6;
            this.e[v1 + 5] = (byte)(((int)(v >> 40)) & 0xFF);
            this.g = v1 + 7;
            this.e[v1 + 6] = (byte)(((int)(v >> 0x30)) & 0xFF);
            this.g = v1 + 8;
            this.e[v1 + 7] = (byte)(((int)(v >> 56)) & 0xFF);
            this.h += 8;
        }

        final void V0(int v) {
            if(v >= 0) {
                this.X0(v);
                return;
            }
            this.Y0(((long)v));
        }

        final void W0(int v, int v1) {
            this.X0(v << 3 | v1);
        }

        final void X0(int v) {
            long v1 = (long)this.g;
            while((v & 0xFFFFFF80) != 0) {
                int v2 = this.g;
                this.g = v2 + 1;
                p0.H(this.e, ((long)v2), ((byte)(v & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v3 = this.g;
            this.g = v3 + 1;
            p0.H(this.e, ((long)v3), ((byte)v));
            this.h += (int)(((long)this.g) - v1);
        }

        final void Y0(long v) {
            long v1 = (long)this.g;
            while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                int v2 = this.g;
                this.g = v2 + 1;
                p0.H(this.e, ((long)v2), ((byte)(((int)v) & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v3 = this.g;
            this.g = v3 + 1;
            p0.H(this.e, ((long)v3), ((byte)(((int)v))));
            this.h += (int)(((long)this.g) - v1);
        }
    }

    public static class c extends IOException {
        private static final long serialVersionUID = 0x9F95917C52CE6E25L;

        c(Throwable throwable0) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable0);
        }
    }

    static final class d extends b {
        private final OutputStream i;

        d(OutputStream outputStream0, int v) {
            super(v);
            if(outputStream0 == null) {
                throw new NullPointerException("out");
            }
            this.i = outputStream0;
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void A0(O o0) {
            this.P0(o0.d());
            o0.e(this);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void B0(int v, O o0) {
            this.N0(1, 3);
            this.O0(2, v);
            this.c1(3, o0);
            this.N0(1, 4);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void C0(int v, g g0) {
            this.N0(1, 3);
            this.O0(2, v);
            this.f0(3, g0);
            this.N0(1, 4);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void L0(int v, String s) {
            this.N0(v, 2);
            this.M0(s);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void M0(String s) {
            int v9;
            int v6;
            int v5;
            try {
                int v = s.length();
                int v1 = j.R(v * 3);
                int v2 = v1 + v * 3;
                int v3 = this.f;
                if(v2 > v3) {
                    byte[] arr_b = new byte[v * 3];
                    int v4 = q0.f(s, arr_b, 0, v * 3);
                    this.P0(v4);
                    this.a(arr_b, 0, v4);
                    return;
                }
                if(v2 > v3 - this.g) {
                    this.Z0();
                }
                v5 = j.R(s.length());
                v6 = this.g;
                if(v5 == v1) {
                    goto label_15;
                }
                else {
                    goto label_23;
                }
                this.h += v9;
            }
            catch(androidx.datastore.preferences.protobuf.q0.d q0$d0) {
                this.X(s, q0$d0);
            }
            return;
            try {
            label_15:
                int v7 = v6 + v5;
                this.g = v7;
                int v8 = q0.f(s, this.e, v7, this.f - v7);
                this.g = v6;
                v9 = v8 - v6 - v5;
                this.X0(v9);
                this.g = v8;
                this.h += v9;
                return;
            label_23:
                v9 = q0.g(s);
                this.X0(v9);
                this.g = q0.f(s, this.e, this.g, v9);
                this.h += v9;
                return;
            }
            catch(androidx.datastore.preferences.protobuf.q0.d q0$d1) {
            }
            catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
                throw new c(arrayIndexOutOfBoundsException0);
            }
            try {
                this.h -= this.g - v6;
                this.g = v6;
                throw q0$d1;
            }
            catch(androidx.datastore.preferences.protobuf.q0.d q0$d0) {
            }
            this.X(s, q0$d0);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void N0(int v, int v1) {
            this.P0(v << 3 | v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void O0(int v, int v1) {
            this.a1(20);
            this.W0(v, 0);
            this.X0(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void P0(int v) {
            this.a1(5);
            this.X0(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void Q0(int v, long v1) {
            this.a1(20);
            this.W0(v, 0);
            this.Y0(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void R0(long v) {
            this.a1(10);
            this.Y0(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void W() {
            if(this.g > 0) {
                this.Z0();
            }
        }

        private void Z0() {
            this.i.write(this.e, 0, this.g);
            this.g = 0;
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void a(byte[] arr_b, int v, int v1) {
            this.b1(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void a0(byte b) {
            if(this.g == this.f) {
                this.Z0();
            }
            this.S0(b);
        }

        private void a1(int v) {
            if(this.f - this.g < v) {
                this.Z0();
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void b0(int v, boolean z) {
            this.a1(11);
            this.W0(v, 0);
            this.S0(((byte)z));
        }

        public void b1(byte[] arr_b, int v, int v1) {
            int v2 = this.f;
            int v3 = this.g;
            if(v2 - v3 >= v1) {
                System.arraycopy(arr_b, v, this.e, v3, v1);
                this.g += v1;
                this.h += v1;
                return;
            }
            int v4 = v2 - v3;
            System.arraycopy(arr_b, v, this.e, v3, v4);
            int v5 = v + v4;
            int v6 = v1 - v4;
            this.g = this.f;
            this.h += v4;
            this.Z0();
            if(v6 <= this.f) {
                System.arraycopy(arr_b, v5, this.e, 0, v6);
                this.g = v6;
            }
            else {
                this.i.write(arr_b, v5, v6);
            }
            this.h += v6;
        }

        public void c1(int v, O o0) {
            this.N0(v, 2);
            this.A0(o0);
        }

        void d1(O o0, e0 e00) {
            this.P0(((androidx.datastore.preferences.protobuf.a)o0).j(e00));
            e00.e(o0, this.a);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void e0(byte[] arr_b, int v, int v1) {
            this.P0(v1);
            this.b1(arr_b, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void f0(int v, g g0) {
            this.N0(v, 2);
            this.g0(g0);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void g0(g g0) {
            this.P0(g0.size());
            g0.B(this);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void l0(int v, int v1) {
            this.a1(14);
            this.W0(v, 5);
            this.T0(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void m0(int v) {
            this.a1(4);
            this.T0(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void n0(int v, long v1) {
            this.a1(18);
            this.W0(v, 1);
            this.U0(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void o0(long v) {
            this.a1(8);
            this.U0(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void v0(int v, int v1) {
            this.a1(20);
            this.W0(v, 0);
            this.V0(v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        public void w0(int v) {
            if(v >= 0) {
                this.P0(v);
                return;
            }
            this.R0(((long)v));
        }

        @Override  // androidx.datastore.preferences.protobuf.j
        void z0(int v, O o0, e0 e00) {
            this.N0(v, 2);
            this.d1(o0, e00);
        }
    }

    k a;
    private boolean b;
    private static final Logger c;
    private static final boolean d;

    static {
        j.c = Logger.getLogger("androidx.datastore.preferences.protobuf.j");
        j.d = true;
    }

    private j() {
    }

    j(a j$a0) {
    }

    public static int A(O o0) {
        return j.y(o0.d());
    }

    public abstract void A0(O arg1);

    static int B(O o0, e0 e00) {
        return j.y(((androidx.datastore.preferences.protobuf.a)o0).j(e00));
    }

    public abstract void B0(int arg1, O arg2);

    static int C(int v) {
        return v <= 0x1000 ? v : 0x1000;
    }

    public abstract void C0(int arg1, g arg2);

    // 去混淆评级： 低(20)
    public static int D(int v, g g0) {
        return j.Q(2, v) + 2 + j.f(3, g0);
    }

    public final void D0(int v, int v1) {
        this.l0(v, v1);
    }

    public static int E(int v) {
        return j.R(v);
    }

    public final void E0(int v) {
        this.m0(v);
    }

    public static int F(int v, int v1) {
        return j.P(v) + 4;
    }

    public final void F0(int v, long v1) {
        this.n0(v, v1);
    }

    public static int G(int v) [...] // Inlined contents

    public final void G0(long v) {
        this.o0(v);
    }

    public static int H(int v, long v1) {
        return j.P(v) + 8;
    }

    public final void H0(int v, int v1) {
        this.O0(v, v1 >> 0x1F ^ v1 << 1);
    }

    public static int I(long v) [...] // Inlined contents

    public final void I0(int v) {
        this.P0(v >> 0x1F ^ v << 1);
    }

    public static int J(int v, int v1) {
        return j.P(v) + j.K(v1);
    }

    public final void J0(int v, long v1) {
        this.Q0(v, v1 >> 0x3F ^ v1 << 1);
    }

    public static int K(int v) {
        return j.R(v >> 0x1F ^ v << 1);
    }

    public final void K0(long v) {
        this.R0(v >> 0x3F ^ v << 1);
    }

    public static int L(int v, long v1) {
        return j.P(v) + j.M(v1);
    }

    public abstract void L0(int arg1, String arg2);

    public static int M(long v) {
        return j.T(v >> 0x3F ^ v << 1);
    }

    public abstract void M0(String arg1);

    public static int N(int v, String s) {
        return j.P(v) + j.O(s);
    }

    public abstract void N0(int arg1, int arg2);

    public static int O(String s) {
        try {
            return j.y(q0.g(s));
        }
        catch(androidx.datastore.preferences.protobuf.q0.d unused_ex) {
            return j.y(s.getBytes(y.a).length);
        }
    }

    public abstract void O0(int arg1, int arg2);

    public static int P(int v) [...] // 潜在的解密器

    public abstract void P0(int arg1);

    public static int Q(int v, int v1) {
        return j.P(v) + j.R(v1);
    }

    public abstract void Q0(int arg1, long arg2);

    public static int R(int v) {
        if((v & 0xFFFFFF80) == 0) {
            return 1;
        }
        if((v & 0xFFFFC000) == 0) {
            return 2;
        }
        if((0xFFE00000 & v) == 0) {
            return 3;
        }
        return (v & 0xF0000000) == 0 ? 4 : 5;
    }

    public abstract void R0(long arg1);

    public static int S(int v, long v1) {
        return j.P(v) + j.T(v1);
    }

    public static int T(long v) {
        int v1;
        if((0xFFFFFFFFFFFFFF80L & v) == 0L) {
            return 1;
        }
        if(v < 0L) {
            return 10;
        }
        if((0xFFFFFFF800000000L & v) == 0L) {
            v1 = 2;
        }
        else {
            v >>>= 28;
            v1 = 6;
        }
        if((0xFFFFFFFFFFE00000L & v) != 0L) {
            v1 += 2;
            v >>>= 14;
        }
        return (v & 0xFFFFFFFFFFFFC000L) == 0L ? v1 : v1 + 1;
    }

    public static int U(int v) [...] // Inlined contents

    public static long V(long v) [...] // Inlined contents

    public abstract void W();

    final void X(String s, androidx.datastore.preferences.protobuf.q0.d q0$d0) {
        j.c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", q0$d0);
        byte[] arr_b = s.getBytes(y.a);
        try {
            this.P0(arr_b.length);
            this.a(arr_b, 0, arr_b.length);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new c(indexOutOfBoundsException0);
        }
    }

    boolean Y() {
        return this.b;
    }

    public static j Z(OutputStream outputStream0, int v) {
        return new d(outputStream0, v);
    }

    @Override  // androidx.datastore.preferences.protobuf.f
    public abstract void a(byte[] arg1, int arg2, int arg3);

    public abstract void a0(byte arg1);

    static boolean b() [...] // 潜在的解密器

    public abstract void b0(int arg1, boolean arg2);

    public static int c(int v, boolean z) {
        return j.P(v) + 1;
    }

    public final void c0(boolean z) {
        this.a0(((byte)z));
    }

    public static int d(boolean z) [...] // Inlined contents

    public final void d0(byte[] arr_b) {
        this.e0(arr_b, 0, arr_b.length);
    }

    public static int e(byte[] arr_b) {
        return j.y(arr_b.length);
    }

    abstract void e0(byte[] arg1, int arg2, int arg3);

    public static int f(int v, g g0) {
        return j.P(v) + j.g(g0);
    }

    public abstract void f0(int arg1, g arg2);

    public static int g(g g0) {
        return j.y(g0.size());
    }

    public abstract void g0(g arg1);

    public static int h(int v, double f) {
        return j.P(v) + 8;
    }

    public final void h0(int v, double f) {
        this.n0(v, Double.doubleToRawLongBits(f));
    }

    public static int i(double f) [...] // Inlined contents

    public final void i0(double f) {
        this.o0(Double.doubleToRawLongBits(f));
    }

    public static int j(int v, int v1) {
        return j.P(v) + j.k(v1);
    }

    public final void j0(int v, int v1) {
        this.v0(v, v1);
    }

    public static int k(int v) {
        return j.v(v);
    }

    public final void k0(int v) {
        this.w0(v);
    }

    public static int l(int v, int v1) {
        return j.P(v) + 4;
    }

    public abstract void l0(int arg1, int arg2);

    public static int m(int v) [...] // Inlined contents

    public abstract void m0(int arg1);

    public static int n(int v, long v1) {
        return j.P(v) + 8;
    }

    public abstract void n0(int arg1, long arg2);

    public static int o(long v) [...] // Inlined contents

    public abstract void o0(long arg1);

    public static int p(int v, float f) {
        return j.P(v) + 4;
    }

    public final void p0(int v, float f) {
        this.l0(v, Float.floatToRawIntBits(f));
    }

    public static int q(float f) [...] // Inlined contents

    public final void q0(float f) {
        this.m0(Float.floatToRawIntBits(f));
    }

    static int r(int v, O o0, e0 e00) {
        return j.P(v) * 2 + j.t(o0, e00);
    }

    public final void r0(int v, O o0) {
        this.N0(v, 3);
        this.t0(o0);
        this.N0(v, 4);
    }

    public static int s(O o0) {
        return o0.d();
    }

    final void s0(int v, O o0, e0 e00) {
        this.N0(v, 3);
        this.u0(o0, e00);
        this.N0(v, 4);
    }

    static int t(O o0, e0 e00) {
        return ((androidx.datastore.preferences.protobuf.a)o0).j(e00);
    }

    public final void t0(O o0) {
        o0.e(this);
    }

    public static int u(int v, int v1) {
        return j.P(v) + j.v(v1);
    }

    final void u0(O o0, e0 e00) {
        e00.e(o0, this.a);
    }

    public static int v(int v) {
        return v < 0 ? 10 : j.R(v);
    }

    public abstract void v0(int arg1, int arg2);

    public static int w(int v, long v1) {
        return j.P(v) + j.x(v1);
    }

    public abstract void w0(int arg1);

    public static int x(long v) {
        return j.T(v);
    }

    public final void x0(int v, long v1) {
        this.Q0(v, v1);
    }

    static int y(int v) {
        return j.R(v) + v;
    }

    public final void y0(long v) {
        this.R0(v);
    }

    static int z(int v, O o0, e0 e00) {
        return j.P(v) + j.B(o0, e00);
    }

    abstract void z0(int arg1, O arg2, e0 arg3);
}

