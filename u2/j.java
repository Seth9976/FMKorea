package U2;

import O2.b;
import java.util.Arrays;

public abstract class j {
    public static int a(CharSequence charSequence0, int v) {
        int v1 = charSequence0.length();
        int v2 = 0;
        if(v < v1) {
            int v3 = charSequence0.charAt(v);
            while(j.f(((char)v3)) && v < v1) {
                ++v2;
                ++v;
                if(v < v1) {
                    v3 = charSequence0.charAt(v);
                }
            }
        }
        return v2;
    }

    public static String b(String s, l l0, b b0, b b1) {
        a a0 = new a();
        c c0 = new c();
        m m0 = new m();
        n n0 = new n();
        f f0 = new f();
        U2.b b2 = new U2.b();
        g[] arr_g = new g[6];
        int v = 0;
        arr_g[0] = a0;
        arr_g[1] = c0;
        arr_g[2] = m0;
        arr_g[3] = n0;
        arr_g[4] = f0;
        arr_g[5] = b2;
        h h0 = new h(s);
        h0.n(l0);
        if(s.startsWith("[)>\u001E05\u001D") && s.endsWith("\u001E\u0004")) {
            h0.r('ì');
            h0.m(2);
            h0.d += 7;
        }
        else if(s.startsWith("[)>\u001E06\u001D") && s.endsWith("\u001E\u0004")) {
            h0.r('í');
            h0.m(2);
            h0.d += 7;
        }
        while(h0.i()) {
            arr_g[v].a(h0);
            if(h0.e() >= 0) {
                v = h0.e();
                h0.j();
            }
        }
        int v1 = h0.a();
        h0.p();
        int v2 = h0.g().a();
        if(v1 < v2 && (v != 0 && v != 4 && v != 5)) {
            h0.r('þ');
        }
        StringBuilder stringBuilder0 = h0.b();
        if(stringBuilder0.length() < v2) {
            stringBuilder0.append('\u0081');
        }
        while(stringBuilder0.length() < v2) {
            stringBuilder0.append(j.o('\u0081', stringBuilder0.length() + 1));
        }
        return h0.b().toString();
    }

    private static int c(float[] arr_f, int[] arr_v, int v, byte[] arr_b) {
        Arrays.fill(arr_b, 0);
        for(int v1 = 0; v1 < 6; ++v1) {
            int v2 = (int)Math.ceil(arr_f[v1]);
            arr_v[v1] = v2;
            if(v > v2) {
                Arrays.fill(arr_b, 0);
                v = v2;
            }
            if(v == v2) {
                arr_b[v1] = (byte)(arr_b[v1] + 1);
            }
        }
        return v;
    }

    private static int d(byte[] arr_b) {
        int v = 0;
        for(int v1 = 0; v1 < 6; ++v1) {
            v += arr_b[v1];
        }
        return v;
    }

    static void e(char c) {
        String s = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - s.length()) + s) + ')');
    }

    static boolean f(char c) {
        return c >= 0x30 && c <= 57;
    }

    static boolean g(char c) {
        return c >= 0x80 && c <= 0xFF;
    }

    // 去混淆评级： 低(20)
    private static boolean h(char c) {
        return c == 0x20 || c >= 0x30 && c <= 57 || c >= 65 && c <= 90;
    }

    private static boolean i(char c) {
        return c >= 0x20 && c <= 94;
    }

    // 去混淆评级： 低(20)
    private static boolean j(char c) {
        return c == 0x20 || c >= 0x30 && c <= 57 || c >= 97 && c <= 0x7A;
    }

    // 去混淆评级： 低(30)
    private static boolean k(char c) {
        return j.m(c) || c == 0x20 || c >= 0x30 && c <= 57 || c >= 65 && c <= 90;
    }

    private static boolean l(char c) [...] // Inlined contents

    private static boolean m(char c) {
        return c == 13 || c == 42 || c == 62;
    }

    static int n(CharSequence charSequence0, int v, int v1) {
        float[] arr_f;
        if(v >= charSequence0.length()) {
            return v1;
        }
        if(v1 == 0) {
            arr_f = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        }
        else {
            arr_f = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            arr_f[v1] = 0.0f;
        }
        int v2 = 0;
    alab1:
        while(true) {
            do {
                do {
                    int v3 = v + v2;
                    if(v3 == charSequence0.length()) {
                        byte[] arr_b = new byte[6];
                        int[] arr_v = new int[6];
                        int v4 = j.c(arr_f, arr_v, 0x7FFFFFFF, arr_b);
                        int v5 = j.d(arr_b);
                        if(arr_v[0] == v4) {
                            return 0;
                        }
                        if(v5 == 1 && arr_b[5] > 0) {
                            return 5;
                        }
                        if(v5 == 1 && arr_b[4] > 0) {
                            return 4;
                        }
                        if(v5 == 1 && arr_b[2] > 0) {
                            return 2;
                        }
                        return v5 != 1 || arr_b[3] <= 0 ? 1 : 3;
                    }
                    int v6 = charSequence0.charAt(v3);
                    ++v2;
                    if(j.f(((char)v6))) {
                        arr_f[0] += 0.5f;
                    }
                    else if(j.g(((char)v6))) {
                        float f = (float)Math.ceil(arr_f[0]);
                        arr_f[0] = f;
                        arr_f[0] = f + 2.0f;
                    }
                    else {
                        float f1 = (float)Math.ceil(arr_f[0]);
                        arr_f[0] = f1;
                        arr_f[0] = f1 + 1.0f;
                    }
                    if(j.h(((char)v6))) {
                        arr_f[1] += 0.666667f;
                    }
                    else if(j.g(((char)v6))) {
                        arr_f[1] += 2.666667f;
                    }
                    else {
                        arr_f[1] += 1.333333f;
                    }
                    if(j.j(((char)v6))) {
                        arr_f[2] += 0.666667f;
                    }
                    else if(j.g(((char)v6))) {
                        arr_f[2] += 2.666667f;
                    }
                    else {
                        arr_f[2] += 1.333333f;
                    }
                    if(j.k(((char)v6))) {
                        arr_f[3] += 0.666667f;
                    }
                    else if(j.g(((char)v6))) {
                        arr_f[3] += 4.333333f;
                    }
                    else {
                        arr_f[3] += 3.333333f;
                    }
                    if(j.i(((char)v6))) {
                        arr_f[4] += 0.75f;
                    }
                    else if(j.g(((char)v6))) {
                        arr_f[4] += 4.25f;
                    }
                    else {
                        arr_f[4] += 3.25f;
                    }
                    ++arr_f[5];
                }
                while(v2 < 4);
                int[] arr_v1 = new int[6];
                byte[] arr_b1 = new byte[6];
                j.c(arr_f, arr_v1, 0x7FFFFFFF, arr_b1);
                int v7 = j.d(arr_b1);
                int v8 = arr_v1[0];
                int v9 = arr_v1[5];
                if(v8 < v9 && v8 < arr_v1[1] && v8 < arr_v1[2] && v8 < arr_v1[3] && v8 < arr_v1[4]) {
                    return 0;
                }
                if(v9 < v8) {
                    break alab1;
                }
                int v10 = arr_b1[2];
                int v11 = arr_b1[3];
                int v12 = arr_b1[4];
                if(arr_b1[1] + v10 + v11 + v12 == 0) {
                    break alab1;
                }
                if(v7 == 1 && v12 > 0) {
                    return 4;
                }
                if(v7 == 1 && v10 > 0) {
                    return 2;
                }
                if(v7 == 1 && v11 > 0) {
                    return 3;
                }
                int v13 = arr_v1[1];
                if(v13 + 1 >= v8 || v13 + 1 >= v9 || v13 + 1 >= arr_v1[4] || v13 + 1 >= arr_v1[2]) {
                    continue alab1;
                }
                int v14 = arr_v1[3];
                if(v13 < v14) {
                    return 1;
                }
            }
            while(v13 != v14);
            for(int v15 = v + v2 + 1; v15 < charSequence0.length(); ++v15) {
                int v16 = charSequence0.charAt(v15);
                if(j.m(((char)v16))) {
                    return 3;
                }
                if(!j.k(((char)v16))) {
                    break;
                }
            }
            return 1;
        }
        return 5;
    }

    private static char o(char c, int v) {
        int v1 = c + (v * 0x95 % 0xFD + 1);
        return (char)(v1 <= 0xFE ? c + (v * 0x95 % 0xFD + 1) : v1 - 0xFE);
    }
}

