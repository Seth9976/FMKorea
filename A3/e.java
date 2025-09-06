package a3;

import O2.h;
import R2.a;
import Z2.c;

abstract class e {
    private static final int[][] a;
    private static final int[][] b;
    private static final int[][] c;
    private static final int[][] d;

    static {
        e.a = new int[][]{new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
        e.b = new int[][]{new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
        e.c = new int[][]{new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 0x20, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 0x30, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 0x20, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 0x72, -1, -1}, new int[]{6, 34, 62, 90, 0x76, -1, -1}, new int[]{6, 26, 50, 74, 98, 0x7A, -1}, new int[]{6, 30, 54, 78, 102, 0x7E, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 0x86, -1}, new int[]{6, 34, 60, 86, 0x70, 0x8A, -1}, new int[]{6, 30, 58, 86, 0x72, 0x8E, -1}, new int[]{6, 34, 62, 90, 0x76, 0x92, -1}, new int[]{6, 30, 54, 78, 102, 0x7E, 150}, new int[]{6, 24, 50, 76, 102, 0x80, 0x9A}, new int[]{6, 28, 54, 80, 106, 0x84, 0x9E}, new int[]{6, 0x20, 58, 84, 110, 0x88, 0xA2}, new int[]{6, 26, 54, 82, 110, 0x8A, 0xA6}, new int[]{6, 30, 58, 86, 0x72, 0x8E, 170}};
        e.d = new int[][]{new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    }

    static void a(a a0, Z2.a a1, c c0, int v, b b0) {
        e.c(b0);
        e.d(c0, b0);
        e.l(a1, v, b0);
        e.s(c0, b0);
        e.f(a0, v, b0);
    }

    static int b(int v, int v1) {
        if(v1 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int v2 = e.n(v1);
        int v3;
        for(v3 = v << v2 - 1; e.n(v3) >= v2; v3 ^= v1 << e.n(v3) - v2) {
        }
        return v3;
    }

    static void c(b b0) {
        b0.a(-1);
    }

    static void d(c c0, b b0) {
        e.j(b0);
        e.e(b0);
        e.r(c0, b0);
        e.k(b0);
    }

    private static void e(b b0) {
        if(b0.b(8, b0.d() - 8) == 0) {
            throw new h();
        }
        b0.f(8, b0.d() - 8, 1);
    }

    static void f(a a0, int v, b b0) {
        boolean z;
        int v1 = b0.e() - 1;
        int v2 = b0.d() - 1;
        int v3 = 0;
        int v4 = -1;
        while(v1 > 0) {
            if(v1 == 6) {
                v1 = 5;
            }
            while(v2 >= 0 && v2 < b0.d()) {
                for(int v5 = 0; v5 < 2; ++v5) {
                    int v6 = v1 - v5;
                    if(e.o(b0.b(v6, v2))) {
                        if(v3 < a0.i()) {
                            z = a0.g(v3);
                            ++v3;
                        }
                        else {
                            z = false;
                        }
                        if(v != -1 && d.f(v, v6, v2)) {
                            z = !z;
                        }
                        b0.g(v6, v2, z);
                    }
                }
                v2 += v4;
            }
            v4 = -v4;
            v2 += v4;
            v1 -= 2;
        }
        if(v3 != a0.i()) {
            throw new h("Not all bits consumed: " + v3 + '/' + a0.i());
        }
    }

    private static void g(int v, int v1, b b0) {
        for(int v2 = 0; v2 < 8; ++v2) {
            int v3 = v + v2;
            if(!e.o(b0.b(v3, v1))) {
                throw new h();
            }
            b0.f(v3, v1, 0);
        }
    }

    private static void h(int v, int v1, b b0) {
        for(int v2 = 0; v2 < 5; ++v2) {
            int[] arr_v = e.b[v2];
            for(int v3 = 0; v3 < 5; ++v3) {
                b0.f(v + v3, v1 + v2, arr_v[v3]);
            }
        }
    }

    private static void i(int v, int v1, b b0) {
        for(int v2 = 0; v2 < 7; ++v2) {
            int[] arr_v = e.a[v2];
            for(int v3 = 0; v3 < 7; ++v3) {
                b0.f(v + v3, v1 + v2, arr_v[v3]);
            }
        }
    }

    private static void j(b b0) {
        int v = e.a[0].length;
        e.i(0, 0, b0);
        e.i(b0.e() - v, 0, b0);
        e.i(0, b0.e() - v, b0);
        e.g(0, 7, b0);
        e.g(b0.e() - 8, 7, b0);
        e.g(0, b0.e() - 8, b0);
        e.m(7, 0, b0);
        e.m(b0.d() - 8, 0, b0);
        e.m(7, b0.d() - 7, b0);
    }

    private static void k(b b0) {
        for(int v = 8; v < b0.e() - 8; ++v) {
            int v1 = (v + 1) % 2;
            if(e.o(b0.b(v, 6))) {
                b0.f(v, 6, v1);
            }
            if(e.o(b0.b(6, v))) {
                b0.f(6, v, v1);
            }
        }
    }

    static void l(Z2.a a0, int v, b b0) {
        a a1 = new a();
        e.p(a0, v, a1);
        for(int v1 = 0; v1 < a1.i(); ++v1) {
            boolean z = a1.g(a1.i() - 1 - v1);
            int[] arr_v = e.d[v1];
            b0.g(arr_v[0], arr_v[1], z);
            if(v1 < 8) {
                b0.g(b0.e() - v1 - 1, 8, z);
            }
            else {
                b0.g(8, b0.d() - 7 + (v1 - 8), z);
            }
        }
    }

    private static void m(int v, int v1, b b0) {
        for(int v2 = 0; v2 < 7; ++v2) {
            int v3 = v1 + v2;
            if(!e.o(b0.b(v, v3))) {
                throw new h();
            }
            b0.f(v, v3, 0);
        }
    }

    static int n(int v) {
        return 0x20 - Integer.numberOfLeadingZeros(v);
    }

    private static boolean o(int v) {
        return v == -1;
    }

    static void p(Z2.a a0, int v, a a1) {
        if(!f.b(v)) {
            throw new h("Invalid mask pattern");
        }
        int v1 = a0.b() << 3 | v;
        a1.d(v1, 5);
        a1.d(e.b(v1, 0x537), 10);
        a a2 = new a();
        a2.d(0x5412, 15);
        a1.m(a2);
        if(a1.i() != 15) {
            throw new h("should not happen but we got: " + a1.i());
        }
    }

    static void q(c c0, a a0) {
        a0.d(c0.f(), 6);
        a0.d(e.b(c0.f(), 0x1F25), 12);
        if(a0.i() != 18) {
            throw new h("should not happen but we got: " + a0.i());
        }
    }

    private static void r(c c0, b b0) {
        if(c0.f() < 2) {
            return;
        }
        int[] arr_v = e.c[c0.f() - 1];
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(v1 >= 0) {
                for(int v2 = 0; v2 < arr_v.length; ++v2) {
                    int v3 = arr_v[v2];
                    if(v3 >= 0 && e.o(b0.b(v3, v1))) {
                        e.h(v3 - 2, v1 - 2, b0);
                    }
                }
            }
        }
    }

    static void s(c c0, b b0) {
        if(c0.f() < 7) {
            return;
        }
        a a0 = new a();
        e.q(c0, a0);
        int v = 17;
        for(int v1 = 0; v1 < 6; ++v1) {
            for(int v2 = 0; v2 < 3; ++v2) {
                boolean z = a0.g(v);
                --v;
                b0.g(v1, b0.d() - 11 + v2, z);
                b0.g(b0.d() - 11 + v2, v1, z);
            }
        }
    }
}

