package a3;

import O2.h;
import Z2.b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

public abstract class c {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.i.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.j.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.l.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.n.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final int[] a;

    static {
        c.a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 0x1F, 0x20, 33, 34, 35, -1, -1, -1, -1, -1};
    }

    static void a(String s, R2.a a0, String s1) {
        byte[] arr_b;
        try {
            arr_b = s.getBytes(s1);
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new h(unsupportedEncodingException0);
        }
        for(int v = 0; v < arr_b.length; ++v) {
            a0.d(((int)arr_b[v]), 8);
        }
    }

    static void b(CharSequence charSequence0, R2.a a0) {
        int v = charSequence0.length();
        int v1 = 0;
        while(v1 < v) {
            int v2 = c.p(charSequence0.charAt(v1));
            if(v2 == -1) {
                throw new h();
            }
            if(v1 + 1 < v) {
                int v3 = c.p(charSequence0.charAt(v1 + 1));
                if(v3 == -1) {
                    throw new h();
                }
                a0.d(v2 * 45 + v3, 11);
                v1 += 2;
            }
            else {
                a0.d(v2, 6);
                ++v1;
            }
        }
    }

    static void c(String s, b b0, R2.a a0, String s1) {
        switch(a.a[b0.ordinal()]) {
            case 1: {
                c.h(s, a0);
                return;
            }
            case 2: {
                c.b(s, a0);
                return;
            }
            case 3: {
                c.a(s, a0, s1);
                return;
            }
            case 4: {
                c.e(s, a0);
                return;
            }
            default: {
                throw new h("Invalid mode: " + b0);
            }
        }
    }

    private static void d(R2.c c0, R2.a a0) {
        a0.d(b.m.b(), 4);
        a0.d(c0.f(), 8);
    }

    static void e(String s, R2.a a0) {
        int v2;
        int v;
        byte[] arr_b;
        try {
            arr_b = s.getBytes("Shift_JIS");
            v = 0;
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new h(unsupportedEncodingException0);
        }
        while(v < arr_b.length) {
            int v1 = (arr_b[v] & 0xFF) << 8 | arr_b[v + 1] & 0xFF;
            if(v1 >= 0x8140 && v1 <= 0x9FFC) {
                v2 = v1 - 0x8140;
            }
            else if(v1 < 0xE040 || v1 > 0xEBBF) {
                v2 = -1;
            }
            else {
                v2 = v1 - 0xC140;
            }
            if(v2 == -1) {
                throw new h("Invalid byte sequence");
            }
            a0.d((v2 >> 8) * 0xC0 + (v2 & 0xFF), 13);
            v += 2;
        }
    }

    static void f(int v, Z2.c c0, b b0, R2.a a0) {
        int v1 = b0.f(c0);
        if(v >= 1 << v1) {
            throw new h(v + " is bigger than " + ((1 << v1) - 1));
        }
        a0.d(v, v1);
    }

    static void g(b b0, R2.a a0) {
        a0.d(b0.b(), 4);
    }

    static void h(CharSequence charSequence0, R2.a a0) {
        int v = charSequence0.length();
        int v1 = 0;
        while(v1 < v) {
            int v2 = charSequence0.charAt(v1) - 0x30;
            int v3 = v1 + 2;
            if(v3 < v) {
                a0.d(v2 * 100 + (charSequence0.charAt(v1 + 1) - 0x30) * 10 + (charSequence0.charAt(v3) - 0x30), 10);
                v1 += 3;
            }
            else {
                ++v1;
                if(v1 < v) {
                    a0.d(v2 * 10 + (charSequence0.charAt(v1) - 0x30), 7);
                    v1 = v3;
                }
                else {
                    a0.d(v2, 4);
                }
            }
        }
    }

    private static int i(b b0, R2.a a0, R2.a a1, Z2.c c0) {
        return a0.i() + b0.f(c0) + a1.i();
    }

    private static int j(a3.b b0) {
        return d.a(b0) + d.c(b0) + d.d(b0) + d.e(b0);
    }

    private static int k(R2.a a0, Z2.a a1, Z2.c c0, a3.b b0) {
        int v = 0x7FFFFFFF;
        int v1 = -1;
        for(int v2 = 0; v2 < 8; ++v2) {
            e.a(a0, a1, c0, v2, b0);
            int v3 = c.j(b0);
            if(v3 < v) {
                v1 = v2;
                v = v3;
            }
        }
        return v1;
    }

    private static b l(String s, String s1) {
        if("Shift_JIS".equals(s1) && c.s(s)) {
            return b.n;
        }
        boolean z = false;
        boolean z1 = false;
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(v1 < 0x30 || v1 > 57) {
                if(c.p(v1) == -1) {
                    return b.l;
                }
                z = true;
            }
            else {
                z1 = true;
            }
        }
        if(z) {
            return b.j;
        }
        return z1 ? b.i : b.l;
    }

    private static Z2.c m(int v, Z2.a a0) {
        for(int v1 = 1; v1 <= 40; ++v1) {
            Z2.c c0 = Z2.c.e(v1);
            if(c.v(v, c0, a0)) {
                return c0;
            }
        }
        throw new h("Data too big");
    }

    public static f n(String s, Z2.a a0, Map map0) {
        Z2.c c2;
        boolean z = map0 != null && map0.containsKey(O2.c.g);
        String s1 = z ? map0.get(O2.c.g).toString() : "ISO-8859-1";
        b b0 = c.l(s, s1);
        R2.a a1 = new R2.a();
        b b1 = b.l;
        if(b0 == b1 && z) {
            R2.c c0 = R2.c.b(s1);
            if(c0 != null) {
                c.d(c0, a1);
            }
        }
        if(map0 != null && (map0.containsKey(O2.c.q) && Boolean.valueOf(map0.get(O2.c.q).toString()).booleanValue())) {
            c.g(b.o, a1);
        }
        c.g(b0, a1);
        R2.a a2 = new R2.a();
        c.c(s, b0, a2, s1);
        if(map0 == null) {
            c2 = c.t(a0, b0, a1, a2);
        }
        else {
            O2.c c1 = O2.c.p;
            if(map0.containsKey(c1)) {
                c2 = Z2.c.e(Integer.parseInt(map0.get(c1).toString()));
                if(!c.v(c.i(b0, a1, a2, c2), c2, a0)) {
                    throw new h("Data too big for requested version");
                }
            }
            else {
                c2 = c.t(a0, b0, a1, a2);
            }
        }
        R2.a a3 = new R2.a();
        a3.c(a1);
        c.f((b0 == b1 ? a2.j() : s.length()), c2, b0, a3);
        a3.c(a2);
        Z2.c.b c$b0 = c2.c(a0);
        int v = c2.d() - c$b0.d();
        c.u(v, a3);
        R2.a a4 = c.r(a3, c2.d(), v, c$b0.c());
        f f0 = new f();
        f0.c(a0);
        f0.f(b0);
        f0.g(c2);
        int v1 = c2.b();
        a3.b b2 = new a3.b(v1, v1);
        int v2 = c.k(a4, a0, c2, b2);
        f0.d(v2);
        e.a(a4, a0, c2, v2, b2);
        f0.e(b2);
        return f0;
    }

    static byte[] o(byte[] arr_b, int v) {
        int[] arr_v = new int[arr_b.length + v];
        for(int v2 = 0; v2 < arr_b.length; ++v2) {
            arr_v[v2] = arr_b[v2] & 0xFF;
        }
        new S2.c(S2.a.l).b(arr_v, v);
        byte[] arr_b1 = new byte[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b1[v1] = (byte)arr_v[arr_b.length + v1];
        }
        return arr_b1;
    }

    static int p(int v) {
        return v >= c.a.length ? -1 : c.a[v];
    }

    static void q(int v, int v1, int v2, int v3, int[] arr_v, int[] arr_v1) {
        if(v3 >= v2) {
            throw new h("Block ID too large");
        }
        int v4 = v % v2;
        int v5 = v2 - v4;
        int v6 = v / v2;
        int v7 = v1 / v2;
        int v8 = v6 - v7;
        int v9 = v6 + 1 - (v7 + 1);
        if(v != (v7 + v8) * v5 + (v7 + 1 + v9) * v4) {
            throw new h("Total bytes mismatch");
        }
        if(v3 < v5) {
            arr_v[0] = v7;
            arr_v1[0] = v8;
            return;
        }
        arr_v[0] = v7 + 1;
        arr_v1[0] = v9;
    }

    static R2.a r(R2.a a0, int v, int v1, int v2) {
        if(a0.j() != v1) {
            throw new h("Number of bits and data bytes does not match");
        }
        ArrayList arrayList0 = new ArrayList(v2);
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        for(int v4 = 0; v4 < v2; ++v4) {
            int[] arr_v = new int[1];
            int[] arr_v1 = new int[1];
            c.q(v, v1, v2, v4, arr_v, arr_v1);
            int v8 = arr_v[0];
            byte[] arr_b = new byte[v8];
            a0.l(v5 << 3, arr_b, 0, v8);
            byte[] arr_b1 = c.o(arr_b, arr_v1[0]);
            arrayList0.add(new a3.a(arr_b, arr_b1));
            v6 = Math.max(v6, v8);
            v7 = Math.max(v7, arr_b1.length);
            v5 += arr_v[0];
        }
        if(v1 != v5) {
            throw new h("Data bytes does not match offset");
        }
        R2.a a1 = new R2.a();
        for(int v9 = 0; v9 < v6; ++v9) {
            for(Object object0: arrayList0) {
                byte[] arr_b2 = ((a3.a)object0).a();
                if(v9 < arr_b2.length) {
                    a1.d(((int)arr_b2[v9]), 8);
                }
            }
        }
        for(int v3 = 0; v3 < v7; ++v3) {
            for(Object object1: arrayList0) {
                byte[] arr_b3 = ((a3.a)object1).b();
                if(v3 < arr_b3.length) {
                    a1.d(((int)arr_b3[v3]), 8);
                }
            }
        }
        if(v != a1.j()) {
            throw new h("Interleaving error: " + v + " and " + a1.j() + " differ.");
        }
        return a1;
    }

    private static boolean s(String s) {
        byte[] arr_b;
        try {
            arr_b = s.getBytes("Shift_JIS");
        }
        catch(UnsupportedEncodingException unused_ex) {
            return false;
        }
        if(arr_b.length % 2 != 0) {
            return false;
        }
        int v = 0;
        while(v < arr_b.length) {
            int v1 = arr_b[v] & 0xFF;
            if(v1 >= 0x81 && v1 <= 0x9F || v1 >= 0xE0 && v1 <= 0xEB) {
                v += 2;
                continue;
            }
            return false;
        }
        return true;
    }

    private static Z2.c t(Z2.a a0, b b0, R2.a a1, R2.a a2) {
        return c.m(c.i(b0, a1, a2, c.m(c.i(b0, a1, a2, Z2.c.e(1)), a0)), a0);
    }

    static void u(int v, R2.a a0) {
        if(a0.i() > v << 3) {
            throw new h("data bits cannot fit in the QR Code" + a0.i() + " > " + (v << 3));
        }
        for(int v2 = 0; v2 < 4 && a0.i() < v << 3; ++v2) {
            a0.b(false);
        }
        int v3 = a0.i() & 7;
        if(v3 > 0) {
            while(v3 < 8) {
                a0.b(false);
                ++v3;
            }
        }
        int v4 = a0.j();
        for(int v1 = 0; v1 < v - v4; ++v1) {
            a0.d(((v1 & 1) == 0 ? 0xEC : 17), 8);
        }
        if(a0.i() != v << 3) {
            throw new h("Bits size does not equal capacity");
        }
    }

    private static boolean v(int v, Z2.c c0, Z2.a a0) {
        return c0.d() - c0.c(a0).d() >= (v + 7) / 8;
    }
}

