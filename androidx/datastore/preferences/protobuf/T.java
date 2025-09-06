package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;

public enum t {
    static abstract class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[A.values().length];
            a.b = arr_v;
            try {
                arr_v[A.p.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[A.r.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[A.o.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[b.values().length];
            a.a = arr_v1;
            try {
                arr_v1[b.j.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.g.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean f;

        private b(boolean z) {
            this.f = z;
        }
    }

    DOUBLE(0, b.g, A.m),
    FLOAT(1, b.g, A.l),
    INT64(2, b.g, A.k),
    UINT64(3, b.g, A.k),
    INT32(4, b.g, A.j),
    FIXED64(5, b.g, A.k),
    FIXED32(6, b.g, A.j),
    BOOL(7, b.g, A.n),
    STRING(8, b.g, A.o),
    MESSAGE(9, b.g, A.r),
    BYTES(10, b.g, A.p),
    UINT32(11, b.g, A.j),
    ENUM(12, b.g, A.q),
    SFIXED32(13, b.g, A.j),
    SFIXED64(14, b.g, A.k),
    SINT32(15, b.g, A.j),
    SINT64(16, b.g, A.k),
    GROUP(17, b.g, A.r),
    DOUBLE_LIST(18, b.h, A.m),
    FLOAT_LIST(19, b.h, A.l),
    INT64_LIST(20, b.h, A.k),
    UINT64_LIST(21, b.h, A.k),
    INT32_LIST(22, b.h, A.j),
    FIXED64_LIST(23, b.h, A.k),
    FIXED32_LIST(24, b.h, A.j),
    BOOL_LIST(25, b.h, A.n),
    STRING_LIST(26, b.h, A.o),
    MESSAGE_LIST(27, b.h, A.r),
    BYTES_LIST(28, b.h, A.p),
    UINT32_LIST(29, b.h, A.j),
    ENUM_LIST(30, b.h, A.q),
    SFIXED32_LIST(0x1F, b.h, A.j),
    SFIXED64_LIST(0x20, b.h, A.k),
    SINT32_LIST(33, b.h, A.j),
    SINT64_LIST(34, b.h, A.k),
    DOUBLE_LIST_PACKED(35, b.i, A.m),
    FLOAT_LIST_PACKED(36, b.i, A.l),
    INT64_LIST_PACKED(37, b.i, A.k),
    UINT64_LIST_PACKED(38, b.i, A.k),
    INT32_LIST_PACKED(39, b.i, A.j),
    FIXED64_LIST_PACKED(40, b.i, A.k),
    FIXED32_LIST_PACKED(41, b.i, A.j),
    BOOL_LIST_PACKED(42, b.i, A.n),
    UINT32_LIST_PACKED(43, b.i, A.j),
    ENUM_LIST_PACKED(44, b.i, A.q),
    SFIXED32_LIST_PACKED(45, b.i, A.j),
    SFIXED64_LIST_PACKED(46, b.i, A.k),
    SINT32_LIST_PACKED(0x2F, b.i, A.j),
    SINT64_LIST_PACKED(0x30, b.i, A.k),
    GROUP_LIST(49, b.h, A.r),
    MAP(50, b.j, A.i);

    private final A f;
    private final int g;
    private final b h;
    private final Class i;
    private final boolean j;
    private static final t[] j0;
    private static final Type[] k0;
    private static final t[] l0;

    static {
        arr_t[0] = t.k;
        arr_t[1] = t.l;
        arr_t[2] = t.m;
        arr_t[3] = t.n;
        arr_t[4] = t.o;
        arr_t[5] = t.p;
        arr_t[6] = t.q;
        arr_t[7] = t.r;
        arr_t[8] = t.s;
        arr_t[9] = t.t;
        arr_t[10] = t.u;
        arr_t[11] = t.v;
        arr_t[12] = t.w;
        arr_t[13] = t.x;
        arr_t[14] = t.y;
        arr_t[15] = t.z;
        arr_t[16] = t.A;
        arr_t[17] = t.B;
        arr_t[18] = t.C;
        arr_t[19] = t.D;
        arr_t[20] = t.E;
        arr_t[21] = t.F;
        arr_t[22] = t.G;
        arr_t[23] = t.H;
        arr_t[24] = t.I;
        arr_t[25] = t.J;
        arr_t[26] = t.K;
        arr_t[27] = t.L;
        arr_t[28] = t.M;
        arr_t[29] = t.N;
        arr_t[30] = t.O;
        arr_t[0x1F] = t.P;
        arr_t[0x20] = t.Q;
        arr_t[33] = t.R;
        arr_t[34] = t.S;
        arr_t[35] = t.T;
        arr_t[36] = t.U;
        arr_t[37] = t.V;
        arr_t[38] = t.W;
        arr_t[39] = t.X;
        arr_t[40] = t.Y;
        arr_t[41] = t.Z;
        arr_t[42] = t.a0;
        arr_t[43] = t.b0;
        arr_t[44] = t.c0;
        arr_t[45] = t.d0;
        arr_t[46] = t.e0;
        arr_t[0x2F] = t.f0;
        arr_t[0x30] = t.g0;
        arr_t[49] = t.h0;
        arr_t[50] = t.i0;
        t.l0 = arr_t;
        t.k0 = new Type[0];
        t[] arr_t1 = (t[])t.l0.clone();
        t.j0 = new t[arr_t1.length];
        for(int v = 0; v < arr_t1.length; ++v) {
            t t0 = arr_t1[v];
            t.j0[t0.g] = t0;
        }
    }

    private t(int v1, b t$b0, A a0) {
        this.g = v1;
        this.h = t$b0;
        this.f = a0;
        boolean z = true;
        switch(t$b0) {
            case 1: {
                this.i = a0.b();
                break;
            }
            case 2: {
                this.i = a0.b();
                break;
            }
            default: {
                this.i = null;
            }
        }
        if(t$b0 == b.g) {
            int v2 = a.b[a0.ordinal()];
            if(v2 == 1 || v2 == 2 || v2 == 3) {
                z = false;
            }
        }
        else {
            z = false;
        }
        this.j = z;
    }

    public int b() {
        return this.g;
    }
}

