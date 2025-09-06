package U2;

import O2.b;

public class k {
    private final boolean a;
    private final int b;
    private final int c;
    public final int d;
    public final int e;
    private final int f;
    private final int g;
    private final int h;
    static final k[] i;
    private static k[] j;

    static {
        k[] arr_k = {new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), new k(false, 30, 20, 20, 20, 1), new k(true, 0x20, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, 0x72, 0x30, 18, 18, 4), new k(false, 0x90, 56, 20, 20, 4), new k(false, 0xAE, 68, 22, 22, 4), new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, 280, 0x70, 14, 14, 16, 140, 56), new k(false, 0x170, 0x90, 16, 16, 16, 92, 36), new k(false, 456, 0xC0, 18, 18, 16, 0x72, 0x30), new k(false, 0x240, 0xE0, 20, 20, 16, 0x90, 56), new k(false, 696, 0x110, 22, 22, 16, 0xAE, 68), new k(false, 0x330, 0x150, 24, 24, 16, 0x88, 56), new k(false, 1050, 408, 18, 18, 36, 0xAF, 68), new k(false, 1304, 0x1F0, 20, 20, 36, 0xA3, 62), new d()};
        k.i = arr_k;
        k.j = arr_k;
    }

    public k(boolean z, int v, int v1, int v2, int v3, int v4) {
        this(z, v, v1, v2, v3, v4, v, v1);
    }

    k(boolean z, int v, int v1, int v2, int v3, int v4, int v5, int v6) {
        this.a = z;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = v6;
    }

    public final int a() {
        return this.b;
    }

    public int b(int v) {
        return this.g;
    }

    public final int c() {
        return this.c;
    }

    public final int d(int v) {
        return this.h;
    }

    private int e() {
        switch(this.f) {
            case 1: 
            case 2: 
            case 4: {
                return 1;
            }
            case 16: {
                return 4;
            }
            case 36: {
                return 6;
            }
            default: {
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
    }

    public int f() {
        return this.b / this.g;
    }

    public final int g() {
        return this.k() * this.e;
    }

    public final int h() {
        return this.e() * this.d;
    }

    public final int i() {
        return this.g() + (this.k() << 1);
    }

    public final int j() {
        return this.h() + (this.e() << 1);
    }

    private int k() {
        switch(this.f) {
            case 1: 
            case 2: {
                return 1;
            }
            case 4: {
                return 2;
            }
            case 16: {
                return 4;
            }
            case 36: {
                return 6;
            }
            default: {
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
    }

    public static k l(int v, l l0, b b0, b b1, boolean z) {
        k[] arr_k = k.j;
        for(int v1 = 0; v1 < arr_k.length; ++v1) {
            k k0 = arr_k[v1];
            if((l0 != l.g || !k0.a) && (l0 != l.h || k0.a) && v <= k0.b) {
                return k0;
            }
        }
        if(z) {
            throw new IllegalArgumentException("Can\'t find a symbol arrangement that matches the message. Data codewords: " + v);
        }
        return null;
    }

    // 去混淆评级： 低(20)
    @Override
    public final String toString() {
        return (this.a ? "Rectangular Symbol:" : "Square Symbol:") + " data region " + this.d + 'x' + this.e + ", symbol size " + this.j() + 'x' + this.i() + ", symbol data size " + this.h() + 'x' + this.g() + ", codewords " + this.b + '+' + this.c;
    }
}

