package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class h {
    static abstract class a {
    }

    static final class b extends h {
        private final byte[] f;
        private final boolean g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private boolean m;
        private int n;

        private b(byte[] arr_b, int v, int v1, boolean z) {
            super(null);
            this.n = 0x7FFFFFFF;
            this.f = arr_b;
            this.h = v1 + v;
            this.j = v;
            this.k = v;
            this.g = z;
        }

        b(byte[] arr_b, int v, int v1, boolean z, a h$a0) {
            this(arr_b, v, v1, z);
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public String A() {
            int v = this.J();
            if(v > 0) {
                int v1 = this.j;
                if(v <= this.h - v1) {
                    String s = q0.e(this.f, v1, v);
                    this.j += v;
                    return s;
                }
            }
            if(v != 0) {
                throw v > 0 ? z.k() : z.f();
            }
            return "";
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int B() {
            if(this.e()) {
                this.l = 0;
                return 0;
            }
            int v = this.J();
            this.l = v;
            if(v >>> 3 == 0) {
                throw z.b();
            }
            return this.l;
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int C() {
            return this.J();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public long D() {
            return this.K();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public boolean E(int v) {
            switch(v & 7) {
                case 0: {
                    this.P();
                    return true;
                }
                case 1: {
                    this.O(8);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                this.N();
                                this.a(v >>> 3 << 3 | 4);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw z.d();
                                }
                                this.O(4);
                                return true;
                            }
                        }
                    }
                    this.O(this.J());
                    return true;
                }
            }
        }

        public byte F() {
            int v = this.j;
            if(v == this.h) {
                throw z.k();
            }
            this.j = v + 1;
            return this.f[v];
        }

        public byte[] G(int v) {
            if(v > 0) {
                int v1 = this.j;
                if(v <= this.h - v1) {
                    int v2 = v + v1;
                    this.j = v2;
                    return Arrays.copyOfRange(this.f, v1, v2);
                }
            }
            if(v > 0) {
                throw z.k();
            }
            if(v != 0) {
                throw z.f();
            }
            return y.c;
        }

        public int H() {
            int v = this.j;
            if(this.h - v < 4) {
                throw z.k();
            }
            this.j = v + 4;
            return (this.f[v + 3] & 0xFF) << 24 | (this.f[v] & 0xFF | (this.f[v + 1] & 0xFF) << 8 | (this.f[v + 2] & 0xFF) << 16);
        }

        public long I() {
            int v = this.j;
            if(this.h - v < 8) {
                throw z.k();
            }
            this.j = v + 8;
            return (((long)this.f[v + 7]) & 0xFFL) << 56 | (((long)this.f[v]) & 0xFFL | (((long)this.f[v + 1]) & 0xFFL) << 8 | (((long)this.f[v + 2]) & 0xFFL) << 16 | (((long)this.f[v + 3]) & 0xFFL) << 24 | (((long)this.f[v + 4]) & 0xFFL) << 0x20 | (((long)this.f[v + 5]) & 0xFFL) << 40 | (((long)this.f[v + 6]) & 0xFFL) << 0x30);
        }

        public int J() {
            int v5;
            int v = this.j;
            int v1 = this.h;
            if(v1 != v) {
                byte[] arr_b = this.f;
                int v2 = arr_b[v];
                if(v2 >= 0) {
                    this.j = v + 1;
                    return v2;
                }
                if(v1 - (v + 1) >= 9) {
                    int v3 = v + 2;
                    int v4 = arr_b[v + 1] << 7 ^ v2;
                    if(v4 < 0) {
                        v5 = v4 ^ 0xFFFFFF80;
                        this.j = v3;
                        return v5;
                    }
                    int v6 = v + 3;
                    int v7 = arr_b[v3] << 14 ^ v4;
                    if(v7 >= 0) {
                        v5 = v7 ^ 0x3F80;
                        v3 = v6;
                        this.j = v3;
                        return v5;
                    }
                    int v8 = v + 4;
                    int v9 = v7 ^ arr_b[v6] << 21;
                    if(v9 < 0) {
                        v5 = 0xFFE03F80 ^ v9;
                        v3 = v8;
                        this.j = v3;
                        return v5;
                    }
                    v6 = v + 5;
                    int v10 = arr_b[v8];
                    int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                    if(v10 >= 0) {
                        v3 = v6;
                        this.j = v3;
                        return v11;
                    }
                    v8 = v + 6;
                    if(arr_b[v6] >= 0) {
                        v3 = v8;
                        this.j = v3;
                        return v11;
                    }
                    v6 = v + 7;
                    if(arr_b[v8] >= 0) {
                        v3 = v6;
                        this.j = v3;
                        return v11;
                    }
                    v8 = v + 8;
                    if(arr_b[v6] >= 0) {
                        v3 = v8;
                        this.j = v3;
                        return v11;
                    }
                    v6 = v + 9;
                    if(arr_b[v8] >= 0) {
                        v3 = v6;
                        this.j = v3;
                        return v11;
                    }
                    else if(arr_b[v6] >= 0) {
                        v3 = v + 10;
                        this.j = v3;
                        return v11;
                    }
                }
            }
            return (int)this.L();
        }

        public long K() {
            long v12;
            long v9;
            long v5;
            int v = this.j;
            int v1 = this.h;
            if(v1 != v) {
                byte[] arr_b = this.f;
                int v2 = arr_b[v];
                if(v2 >= 0) {
                    this.j = v + 1;
                    return (long)v2;
                }
                if(v1 - (v + 1) >= 9) {
                    int v3 = v + 2;
                    int v4 = arr_b[v + 1] << 7 ^ v2;
                    if(v4 < 0) {
                        v5 = (long)(v4 ^ 0xFFFFFF80);
                        this.j = v3;
                        return v5;
                    }
                    int v6 = arr_b[v3] << 14 ^ v4;
                    if(v6 >= 0) {
                        v5 = (long)(v6 ^ 0x3F80);
                        v3 = v + 3;
                        this.j = v3;
                        return v5;
                    }
                    int v7 = v6 ^ arr_b[v + 3] << 21;
                    if(v7 < 0) {
                        v3 = v + 4;
                        v5 = (long)(0xFFE03F80 ^ v7);
                        this.j = v3;
                        return v5;
                    }
                    v3 = v + 5;
                    long v8 = ((long)v7) ^ ((long)arr_b[v + 4]) << 28;
                    if(v8 >= 0L) {
                        v9 = 0xFE03F80L;
                        v5 = v8 ^ v9;
                        this.j = v3;
                        return v5;
                    }
                    int v10 = v + 6;
                    long v11 = v8 ^ ((long)arr_b[v3]) << 35;
                    if(v11 < 0L) {
                        v12 = 0xFFFFFFF80FE03F80L;
                        v5 = v11 ^ v12;
                        v3 = v10;
                        this.j = v3;
                        return v5;
                    }
                    v3 = v + 7;
                    v8 = v11 ^ ((long)arr_b[v10]) << 42;
                    if(v8 >= 0L) {
                        v9 = 0x3F80FE03F80L;
                        v5 = v8 ^ v9;
                        this.j = v3;
                        return v5;
                    }
                    v10 = v + 8;
                    v11 = v8 ^ ((long)arr_b[v3]) << 49;
                    if(v11 < 0L) {
                        v12 = 0xFFFE03F80FE03F80L;
                        v5 = v11 ^ v12;
                        v3 = v10;
                        this.j = v3;
                        return v5;
                    }
                    v3 = v + 9;
                    long v13 = v11 ^ ((long)arr_b[v10]) << 56 ^ 0xFE03F80FE03F80L;
                    boolean z = false;
                    if(v13 >= 0L) {
                        z = true;
                    }
                    else if(((long)arr_b[v3]) >= 0L) {
                        z = true;
                        v3 = v + 10;
                    }
                    if(z) {
                        this.j = v3;
                        return v13;
                    }
                }
            }
            return this.L();
        }

        long L() {
            long v = 0L;
            for(int v1 = 0; v1 < 0x40; v1 += 7) {
                int v2 = this.F();
                v |= ((long)(v2 & 0x7F)) << v1;
                if((v2 & 0x80) == 0) {
                    return v;
                }
            }
            throw z.e();
        }

        private void M() {
            int v = this.h + this.i;
            this.h = v;
            int v1 = v - this.k;
            int v2 = this.n;
            if(v1 > v2) {
                int v3 = v1 - v2;
                this.i = v3;
                this.h = v - v3;
                return;
            }
            this.i = 0;
        }

        public void N() {
            do {
                int v = this.B();
            }
            while(v != 0 && this.E(v));
        }

        public void O(int v) {
            if(v >= 0) {
                int v1 = this.j;
                if(v <= this.h - v1) {
                    this.j = v1 + v;
                    return;
                }
            }
            throw v >= 0 ? z.k() : z.f();
        }

        private void P() {
            if(this.h - this.j >= 10) {
                this.Q();
                return;
            }
            this.R();
        }

        private void Q() {
            for(int v = 0; v < 10; ++v) {
                int v1 = this.j;
                this.j = v1 + 1;
                if(this.f[v1] >= 0) {
                    return;
                }
            }
            throw z.e();
        }

        private void R() {
            for(int v = 0; v < 10; ++v) {
                if(this.F() >= 0) {
                    return;
                }
            }
            throw z.e();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public void a(int v) {
            if(this.l != v) {
                throw z.a();
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int d() {
            return this.j - this.k;
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public boolean e() {
            return this.j == this.h;
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public void k(int v) {
            this.n = v;
            this.M();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int l(int v) {
            if(v < 0) {
                throw z.f();
            }
            int v1 = v + this.d();
            int v2 = this.n;
            if(v1 > v2) {
                throw z.k();
            }
            this.n = v1;
            this.M();
            return v2;
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public boolean m() {
            return this.K() != 0L;
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public g n() {
            int v = this.J();
            if(v > 0) {
                int v1 = this.j;
                if(v <= this.h - v1) {
                    g g0 = !this.g || !this.m ? g.i(this.f, v1, v) : g.A(this.f, v1, v);
                    this.j += v;
                    return g0;
                }
            }
            return v == 0 ? g.g : g.z(this.G(v));
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public double o() {
            return Double.longBitsToDouble(this.I());
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int p() {
            return this.J();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int q() {
            return this.H();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public long r() {
            return this.I();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public float s() {
            return Float.intBitsToFloat(this.H());
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int t() {
            return this.J();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public long u() {
            return this.K();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int v() {
            return this.H();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public long w() {
            return this.I();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int x() {
            return h.b(this.J());
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public long y() {
            return h.c(this.K());
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public String z() {
            int v = this.J();
            if(v > 0) {
                int v1 = this.j;
                if(v <= this.h - v1) {
                    String s = new String(this.f, v1, v, y.a);
                    this.j += v;
                    return s;
                }
            }
            if(v != 0) {
                throw v >= 0 ? z.k() : z.f();
            }
            return "";
        }
    }

    static final class c extends h {
        private final InputStream f;
        private final byte[] g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;

        private c(InputStream inputStream0, int v) {
            super(null);
            this.m = 0x7FFFFFFF;
            y.b(inputStream0, "input");
            this.f = inputStream0;
            this.g = new byte[v];
            this.h = 0;
            this.j = 0;
            this.l = 0;
        }

        c(InputStream inputStream0, int v, a h$a0) {
            this(inputStream0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public String A() {
            int v = this.M();
            int v1 = this.j;
            int v2 = this.h;
            if(v <= v2 - v1 && v > 0) {
                this.j = v1 + v;
                return q0.e(this.g, v1, v);
            }
            if(v == 0) {
                return "";
            }
            if(v <= v2) {
                this.Q(v);
                this.j = v;
                return q0.e(this.g, v1, v);
            }
            return q0.e(this.H(v, false), v1, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int B() {
            if(this.e()) {
                this.k = 0;
                return 0;
            }
            int v = this.M();
            this.k = v;
            if(v >>> 3 == 0) {
                throw z.b();
            }
            return this.k;
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int C() {
            return this.M();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public long D() {
            return this.N();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public boolean E(int v) {
            switch(v & 7) {
                case 0: {
                    this.U();
                    return true;
                }
                case 1: {
                    this.S(8);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                this.R();
                                this.a(v >>> 3 << 3 | 4);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw z.d();
                                }
                                this.S(4);
                                return true;
                            }
                        }
                    }
                    this.S(this.M());
                    return true;
                }
            }
        }

        private g F(int v) {
            byte[] arr_b = this.I(v);
            if(arr_b != null) {
                return g.h(arr_b);
            }
            int v1 = this.j;
            int v2 = this.h - v1;
            this.l += this.h;
            this.j = 0;
            this.h = 0;
            List list0 = this.J(v - v2);
            byte[] arr_b1 = new byte[v];
            System.arraycopy(this.g, v1, arr_b1, 0, v2);
            for(Object object0: list0) {
                System.arraycopy(((byte[])object0), 0, arr_b1, v2, ((byte[])object0).length);
                v2 += ((byte[])object0).length;
            }
            return g.z(arr_b1);
        }

        public byte G() {
            if(this.j == this.h) {
                this.Q(1);
            }
            int v = this.j;
            this.j = v + 1;
            return this.g[v];
        }

        private byte[] H(int v, boolean z) {
            byte[] arr_b = this.I(v);
            if(arr_b != null) {
                return z ? ((byte[])arr_b.clone()) : arr_b;
            }
            int v1 = this.j;
            int v2 = this.h - v1;
            this.l += this.h;
            this.j = 0;
            this.h = 0;
            List list0 = this.J(v - v2);
            byte[] arr_b1 = new byte[v];
            System.arraycopy(this.g, v1, arr_b1, 0, v2);
            for(Object object0: list0) {
                System.arraycopy(((byte[])object0), 0, arr_b1, v2, ((byte[])object0).length);
                v2 += ((byte[])object0).length;
            }
            return arr_b1;
        }

        private byte[] I(int v) {
            if(v == 0) {
                return y.c;
            }
            if(v < 0) {
                throw z.f();
            }
            int v1 = this.l;
            int v2 = this.j;
            int v3 = v1 + v2 + v;
            if(v3 - this.c > 0) {
                throw z.j();
            }
            int v4 = this.m;
            if(v3 <= v4) {
                int v5 = this.h - v2;
                if(v - v5 >= 0x1000 && v - v5 > this.f.available()) {
                    return null;
                }
                byte[] arr_b = new byte[v];
                System.arraycopy(this.g, this.j, arr_b, 0, v5);
                this.l += this.h;
                this.j = 0;
                this.h = 0;
                while(v5 < v) {
                    int v6 = this.f.read(arr_b, v5, v - v5);
                    if(v6 == -1) {
                        throw z.k();
                    }
                    this.l += v6;
                    v5 += v6;
                }
                return arr_b;
            }
            this.S(v4 - v1 - v2);
            throw z.k();
        }

        private List J(int v) {
            List list0 = new ArrayList();
            while(v > 0) {
                int v1 = Math.min(v, 0x1000);
                byte[] arr_b = new byte[v1];
                for(int v2 = 0; v2 < v1; v2 += v3) {
                    int v3 = this.f.read(arr_b, v2, v1 - v2);
                    if(v3 == -1) {
                        throw z.k();
                    }
                    this.l += v3;
                }
                v -= v1;
                list0.add(arr_b);
            }
            return list0;
        }

        public int K() {
            int v = this.j;
            if(this.h - v < 4) {
                this.Q(4);
                v = this.j;
            }
            this.j = v + 4;
            return (this.g[v + 3] & 0xFF) << 24 | (this.g[v] & 0xFF | (this.g[v + 1] & 0xFF) << 8 | (this.g[v + 2] & 0xFF) << 16);
        }

        public long L() {
            int v = this.j;
            if(this.h - v < 8) {
                this.Q(8);
                v = this.j;
            }
            this.j = v + 8;
            return (((long)this.g[v + 7]) & 0xFFL) << 56 | (((long)this.g[v]) & 0xFFL | (((long)this.g[v + 1]) & 0xFFL) << 8 | (((long)this.g[v + 2]) & 0xFFL) << 16 | (((long)this.g[v + 3]) & 0xFFL) << 24 | (((long)this.g[v + 4]) & 0xFFL) << 0x20 | (((long)this.g[v + 5]) & 0xFFL) << 40 | (((long)this.g[v + 6]) & 0xFFL) << 0x30);
        }

        public int M() {
            int v5;
            int v = this.j;
            int v1 = this.h;
            if(v1 != v) {
                byte[] arr_b = this.g;
                int v2 = arr_b[v];
                if(v2 >= 0) {
                    this.j = v + 1;
                    return v2;
                }
                if(v1 - (v + 1) >= 9) {
                    int v3 = v + 2;
                    int v4 = arr_b[v + 1] << 7 ^ v2;
                    if(v4 < 0) {
                        v5 = v4 ^ 0xFFFFFF80;
                        this.j = v3;
                        return v5;
                    }
                    int v6 = v + 3;
                    int v7 = arr_b[v3] << 14 ^ v4;
                    if(v7 >= 0) {
                        v5 = v7 ^ 0x3F80;
                        v3 = v6;
                        this.j = v3;
                        return v5;
                    }
                    int v8 = v + 4;
                    int v9 = v7 ^ arr_b[v6] << 21;
                    if(v9 < 0) {
                        v5 = 0xFFE03F80 ^ v9;
                        v3 = v8;
                        this.j = v3;
                        return v5;
                    }
                    v6 = v + 5;
                    int v10 = arr_b[v8];
                    int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                    if(v10 >= 0) {
                        v3 = v6;
                        this.j = v3;
                        return v11;
                    }
                    v8 = v + 6;
                    if(arr_b[v6] >= 0) {
                        v3 = v8;
                        this.j = v3;
                        return v11;
                    }
                    v6 = v + 7;
                    if(arr_b[v8] >= 0) {
                        v3 = v6;
                        this.j = v3;
                        return v11;
                    }
                    v8 = v + 8;
                    if(arr_b[v6] >= 0) {
                        v3 = v8;
                        this.j = v3;
                        return v11;
                    }
                    v6 = v + 9;
                    if(arr_b[v8] >= 0) {
                        v3 = v6;
                        this.j = v3;
                        return v11;
                    }
                    else if(arr_b[v6] >= 0) {
                        v3 = v + 10;
                        this.j = v3;
                        return v11;
                    }
                }
            }
            return (int)this.O();
        }

        public long N() {
            long v12;
            long v9;
            long v5;
            int v = this.j;
            int v1 = this.h;
            if(v1 != v) {
                byte[] arr_b = this.g;
                int v2 = arr_b[v];
                if(v2 >= 0) {
                    this.j = v + 1;
                    return (long)v2;
                }
                if(v1 - (v + 1) >= 9) {
                    int v3 = v + 2;
                    int v4 = arr_b[v + 1] << 7 ^ v2;
                    if(v4 < 0) {
                        v5 = (long)(v4 ^ 0xFFFFFF80);
                        this.j = v3;
                        return v5;
                    }
                    int v6 = arr_b[v3] << 14 ^ v4;
                    if(v6 >= 0) {
                        v5 = (long)(v6 ^ 0x3F80);
                        v3 = v + 3;
                        this.j = v3;
                        return v5;
                    }
                    int v7 = v6 ^ arr_b[v + 3] << 21;
                    if(v7 < 0) {
                        v3 = v + 4;
                        v5 = (long)(0xFFE03F80 ^ v7);
                        this.j = v3;
                        return v5;
                    }
                    v3 = v + 5;
                    long v8 = ((long)v7) ^ ((long)arr_b[v + 4]) << 28;
                    if(v8 >= 0L) {
                        v9 = 0xFE03F80L;
                        v5 = v8 ^ v9;
                        this.j = v3;
                        return v5;
                    }
                    int v10 = v + 6;
                    long v11 = v8 ^ ((long)arr_b[v3]) << 35;
                    if(v11 < 0L) {
                        v12 = 0xFFFFFFF80FE03F80L;
                        v5 = v11 ^ v12;
                        v3 = v10;
                        this.j = v3;
                        return v5;
                    }
                    v3 = v + 7;
                    v8 = v11 ^ ((long)arr_b[v10]) << 42;
                    if(v8 >= 0L) {
                        v9 = 0x3F80FE03F80L;
                        v5 = v8 ^ v9;
                        this.j = v3;
                        return v5;
                    }
                    v10 = v + 8;
                    v11 = v8 ^ ((long)arr_b[v3]) << 49;
                    if(v11 < 0L) {
                        v12 = 0xFFFE03F80FE03F80L;
                        v5 = v11 ^ v12;
                        v3 = v10;
                        this.j = v3;
                        return v5;
                    }
                    v3 = v + 9;
                    long v13 = v11 ^ ((long)arr_b[v10]) << 56 ^ 0xFE03F80FE03F80L;
                    boolean z = false;
                    if(v13 >= 0L) {
                        z = true;
                    }
                    else if(((long)arr_b[v3]) >= 0L) {
                        z = true;
                        v3 = v + 10;
                    }
                    if(z) {
                        this.j = v3;
                        return v13;
                    }
                }
            }
            return this.O();
        }

        long O() {
            long v = 0L;
            for(int v1 = 0; v1 < 0x40; v1 += 7) {
                int v2 = this.G();
                v |= ((long)(v2 & 0x7F)) << v1;
                if((v2 & 0x80) == 0) {
                    return v;
                }
            }
            throw z.e();
        }

        private void P() {
            int v = this.h + this.i;
            this.h = v;
            int v1 = this.l + v;
            int v2 = this.m;
            if(v1 > v2) {
                int v3 = v1 - v2;
                this.i = v3;
                this.h = v - v3;
                return;
            }
            this.i = 0;
        }

        private void Q(int v) {
            if(!this.X(v)) {
                throw v <= this.c - this.l - this.j ? z.k() : z.j();
            }
        }

        public void R() {
            do {
                int v = this.B();
            }
            while(v != 0 && this.E(v));
        }

        public void S(int v) {
            int v1 = this.j;
            if(v <= this.h - v1 && v >= 0) {
                this.j = v1 + v;
                return;
            }
            this.T(v);
        }

        private void T(int v) {
            int v10;
            if(v < 0) {
                throw z.f();
            }
            int v1 = this.l;
            int v2 = this.j;
            int v3 = this.m;
            if(v1 + v2 + v <= v3) {
                this.l = v1 + v2;
                int v4 = this.h - v2;
                this.h = 0;
                this.j = 0;
                try {
                    while(v4 < v) {
                        long v6 = (long)(v - v4);
                        long v7 = this.f.skip(v6);
                        int v8 = Long.compare(v7, 0L);
                        if(v8 < 0 || v7 > v6) {
                            throw new IllegalStateException(this.f.getClass() + "#skip returned invalid result: " + v7 + "\nThe InputStream implementation is buggy.");
                        }
                        if(v8 == 0) {
                            break;
                        }
                        v4 += (int)v7;
                    }
                }
                finally {
                    this.l += v4;
                    this.P();
                }
                if(v4 < v) {
                    int v9 = this.h - this.j;
                    this.j = this.h;
                    this.Q(1);
                    while(true) {
                        v10 = v - v9;
                        int v11 = this.h;
                        if(v10 <= v11) {
                            break;
                        }
                        v9 += v11;
                        this.j = v11;
                        this.Q(1);
                    }
                    this.j = v10;
                }
                return;
            }
            this.S(v3 - v1 - v2);
            throw z.k();
        }

        private void U() {
            if(this.h - this.j >= 10) {
                this.V();
                return;
            }
            this.W();
        }

        private void V() {
            for(int v = 0; v < 10; ++v) {
                int v1 = this.j;
                this.j = v1 + 1;
                if(this.g[v1] >= 0) {
                    return;
                }
            }
            throw z.e();
        }

        private void W() {
            for(int v = 0; v < 10; ++v) {
                if(this.G() >= 0) {
                    return;
                }
            }
            throw z.e();
        }

        private boolean X(int v) {
            int v1 = this.j;
            int v2 = this.h;
            if(v1 + v <= v2) {
                throw new IllegalStateException("refillBuffer() called when " + v + " bytes were already available in buffer");
            }
            int v3 = this.l;
            if(v > this.c - v3 - v1) {
                return false;
            }
            if(v3 + v1 + v > this.m) {
                return false;
            }
            if(v1 > 0) {
                if(v2 > v1) {
                    System.arraycopy(this.g, v1, this.g, 0, v2 - v1);
                }
                this.l += v1;
                this.h -= v1;
                this.j = 0;
            }
            int v4 = this.f.read(this.g, this.h, Math.min(this.g.length - this.h, this.c - this.l - this.h));
            if(v4 == 0 || v4 < -1 || v4 > this.g.length) {
                throw new IllegalStateException(this.f.getClass() + "#read(byte[]) returned invalid result: " + v4 + "\nThe InputStream implementation is buggy.");
            }
            if(v4 > 0) {
                this.h += v4;
                this.P();
                return this.h < v ? this.X(v) : true;
            }
            return false;
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public void a(int v) {
            if(this.k != v) {
                throw z.a();
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int d() {
            return this.l + this.j;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.h
        public boolean e() {
            return this.j == this.h && !this.X(1);
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public void k(int v) {
            this.m = v;
            this.P();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int l(int v) {
            if(v < 0) {
                throw z.f();
            }
            int v1 = v + (this.l + this.j);
            int v2 = this.m;
            if(v1 > v2) {
                throw z.k();
            }
            this.m = v1;
            this.P();
            return v2;
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public boolean m() {
            return this.N() != 0L;
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public g n() {
            int v = this.M();
            int v1 = this.j;
            if(v <= this.h - v1 && v > 0) {
                g g0 = g.i(this.g, v1, v);
                this.j += v;
                return g0;
            }
            return v == 0 ? g.g : this.F(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public double o() {
            return Double.longBitsToDouble(this.L());
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int p() {
            return this.M();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int q() {
            return this.K();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public long r() {
            return this.L();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public float s() {
            return Float.intBitsToFloat(this.K());
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int t() {
            return this.M();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public long u() {
            return this.N();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int v() {
            return this.K();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public long w() {
            return this.L();
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public int x() {
            return h.b(this.M());
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public long y() {
            return h.c(this.N());
        }

        @Override  // androidx.datastore.preferences.protobuf.h
        public String z() {
            int v = this.M();
            if(v > 0) {
                int v1 = this.j;
                if(v <= this.h - v1) {
                    String s = new String(this.g, v1, v, y.a);
                    this.j += v;
                    return s;
                }
            }
            if(v == 0) {
                return "";
            }
            if(v <= this.h) {
                this.Q(v);
                String s1 = new String(this.g, this.j, v, y.a);
                this.j += v;
                return s1;
            }
            return new String(this.H(v, false), y.a);
        }
    }

    int a;
    int b;
    int c;
    i d;
    private boolean e;

    private h() {
        this.b = 100;
        this.c = 0x7FFFFFFF;
        this.e = false;
    }

    h(a h$a0) {
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int arg1);

    public abstract void a(int arg1);

    public static int b(int v) {
        return -(v & 1) ^ v >>> 1;
    }

    public static long c(long v) {
        return -(v & 1L) ^ v >>> 1;
    }

    public abstract int d();

    public abstract boolean e();

    public static h f(InputStream inputStream0) {
        return h.g(inputStream0, 0x1000);
    }

    public static h g(InputStream inputStream0, int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        return inputStream0 == null ? h.h(y.c) : new c(inputStream0, v, null);
    }

    public static h h(byte[] arr_b) {
        return h.i(arr_b, 0, arr_b.length);
    }

    public static h i(byte[] arr_b, int v, int v1) {
        return h.j(arr_b, v, v1, false);
    }

    static h j(byte[] arr_b, int v, int v1, boolean z) {
        h h0 = new b(arr_b, v, v1, z, null);
        try {
            ((b)h0).l(v1);
            return h0;
        }
        catch(z z1) {
            throw new IllegalArgumentException(z1);
        }
    }

    public abstract void k(int arg1);

    public abstract int l(int arg1);

    public abstract boolean m();

    public abstract g n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();
}

