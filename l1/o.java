package l1;

import android.util.SparseArray;

public abstract class o {
    public static abstract class a {
        public abstract o a();

        public abstract a b(b arg1);

        public abstract a c(c arg1);
    }

    public static enum b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);

        private static final SparseArray B;
        private final int f;

        static {
            SparseArray sparseArray0 = new SparseArray();
            b.B = sparseArray0;
            sparseArray0.put(0, b.g);
            sparseArray0.put(1, b.h);
            sparseArray0.put(2, b.i);
            sparseArray0.put(3, b.j);
            sparseArray0.put(4, b.k);
            sparseArray0.put(5, b.l);
            sparseArray0.put(6, b.m);
            sparseArray0.put(7, b.n);
            sparseArray0.put(8, b.o);
            sparseArray0.put(9, b.p);
            sparseArray0.put(10, b.q);
            sparseArray0.put(11, b.r);
            sparseArray0.put(12, b.s);
            sparseArray0.put(13, b.t);
            sparseArray0.put(14, b.u);
            sparseArray0.put(15, b.v);
            sparseArray0.put(16, b.w);
            sparseArray0.put(17, b.x);
            sparseArray0.put(18, b.y);
            sparseArray0.put(19, b.z);
        }

        private b(int v1) {
            this.f = v1;
        }

        public static b b(int v) {
            return (b)b.B.get(v);
        }

        public int f() {
            return this.f;
        }
    }

    public static enum c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);

        private final int f;
        private static final SparseArray z;

        static {
            SparseArray sparseArray0 = new SparseArray();
            c.z = sparseArray0;
            sparseArray0.put(0, c.g);
            sparseArray0.put(1, c.h);
            sparseArray0.put(2, c.i);
            sparseArray0.put(3, c.j);
            sparseArray0.put(4, c.k);
            sparseArray0.put(5, c.l);
            sparseArray0.put(6, c.m);
            sparseArray0.put(7, c.n);
            sparseArray0.put(8, c.o);
            sparseArray0.put(9, c.p);
            sparseArray0.put(10, c.q);
            sparseArray0.put(11, c.r);
            sparseArray0.put(12, c.s);
            sparseArray0.put(13, c.t);
            sparseArray0.put(14, c.u);
            sparseArray0.put(15, c.v);
            sparseArray0.put(16, c.w);
            sparseArray0.put(17, c.x);
            sparseArray0.put(-1, c.y);
        }

        private c(int v1) {
            this.f = v1;
        }

        public static c b(int v) {
            return (c)c.z.get(v);
        }

        public int f() {
            return this.f;
        }
    }

    public static a a() {
        return new l1.i.b();
    }

    public abstract b b();

    public abstract c c();
}

