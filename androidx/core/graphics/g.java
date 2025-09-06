package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

public abstract class g {
    static class a {
        int a;
        boolean b;

    }

    public static class b {
        private char a;
        private final float[] b;

        b(char c, float[] arr_f) {
            this.a = c;
            this.b = arr_f;
        }

        b(b g$b0) {
            this.a = g$b0.a;
            this.b = g.c(g$b0.b, 0, g$b0.b.length);
        }

        private static void e(Path path0, float[] arr_f, char c, char c1, float[] arr_f1) {
            int v4;
            float f21;
            float f20;
            float f19;
            float f18;
            float f15;
            float f14;
            int v1;
            int v = c1;
            float f = arr_f[0];
            float f1 = arr_f[1];
            float f2 = arr_f[2];
            float f3 = arr_f[3];
            float f4 = arr_f[4];
            float f5 = arr_f[5];
            switch(v) {
                case 65: 
                case 97: {
                    v1 = 7;
                    break;
                }
                case 67: 
                case 99: {
                    v1 = 6;
                    break;
                }
                case 81: 
                case 83: 
                case 0x71: 
                case 0x73: {
                    v1 = 4;
                    break;
                }
                case 72: 
                case 86: 
                case 104: 
                case 0x76: {
                    v1 = 1;
                    break;
                }
                case 90: 
                case 0x7A: {
                    path0.close();
                    path0.moveTo(f4, f5);
                    f = f4;
                    f2 = f;
                    f1 = f5;
                    f3 = f1;
                    v1 = 2;
                    break;
                }
                default: {
                    v1 = 2;
                }
            }
            float f6 = f;
            float f7 = f1;
            float f8 = f4;
            float f9 = f5;
            int v2 = 0;
            int v3 = c;
            while(v2 < arr_f1.length) {
                switch(v) {
                    case 65: {
                        v4 = v2;
                        b.g(path0, f6, f7, arr_f1[v4 + 5], arr_f1[v4 + 6], arr_f1[v4], arr_f1[v4 + 1], arr_f1[v4 + 2], arr_f1[v4 + 3] != 0.0f, arr_f1[v4 + 4] != 0.0f);
                        f6 = arr_f1[v4 + 5];
                        f7 = arr_f1[v4 + 6];
                        f3 = f7;
                        f2 = f6;
                        break;
                    }
                    case 67: {
                        v4 = v2;
                        path0.cubicTo(arr_f1[v4], arr_f1[v4 + 1], arr_f1[v4 + 2], arr_f1[v4 + 3], arr_f1[v4 + 4], arr_f1[v4 + 5]);
                        f6 = arr_f1[v4 + 4];
                        float f10 = arr_f1[v4 + 5];
                        float f11 = arr_f1[v4 + 2];
                        f7 = f10;
                        f3 = arr_f1[v4 + 3];
                        f2 = f11;
                        break;
                    }
                    case 72: {
                        v4 = v2;
                        path0.lineTo(arr_f1[v4], f7);
                        f6 = arr_f1[v4];
                        break;
                    }
                    case 76: {
                        path0.lineTo(arr_f1[v2], arr_f1[v2 + 1]);
                        f6 = arr_f1[v2];
                        f7 = arr_f1[v2 + 1];
                        v4 = v2;
                        break;
                    }
                    case 77: {
                        f6 = arr_f1[v2];
                        f7 = arr_f1[v2 + 1];
                        if(v2 > 0) {
                            path0.lineTo(f6, f7);
                            v4 = v2;
                        }
                        else {
                            path0.moveTo(f6, f7);
                            v4 = v2;
                            f9 = f7;
                            f8 = f6;
                        }
                        break;
                    }
                    case 81: {
                        v4 = v2;
                        path0.quadTo(arr_f1[v4], arr_f1[v4 + 1], arr_f1[v4 + 2], arr_f1[v4 + 3]);
                        float f12 = arr_f1[v4];
                        float f13 = arr_f1[v4 + 1];
                        f6 = arr_f1[v4 + 2];
                        f7 = arr_f1[v4 + 3];
                        f2 = f12;
                        f3 = f13;
                        break;
                    }
                    case 83: {
                        if(v3 == 99 || v3 == 0x73 || v3 == 67 || v3 == 83) {
                            f6 = f6 * 2.0f - f2;
                            f7 = f7 * 2.0f - f3;
                        }
                        path0.cubicTo(f6, f7, arr_f1[v2], arr_f1[v2 + 1], arr_f1[v2 + 2], arr_f1[v2 + 3]);
                        f14 = arr_f1[v2];
                        f15 = arr_f1[v2 + 1];
                        f6 = arr_f1[v2 + 2];
                        f7 = arr_f1[v2 + 3];
                        f2 = f14;
                        f3 = f15;
                        v4 = v2;
                        break;
                    }
                    case 84: {
                        if(v3 == 81 || v3 == 84 || v3 == 0x71 || v3 == 0x74) {
                            f6 = f6 * 2.0f - f2;
                            f7 = f7 * 2.0f - f3;
                        }
                        path0.quadTo(f6, f7, arr_f1[v2], arr_f1[v2 + 1]);
                        v4 = v2;
                        f3 = f7;
                        f2 = f6;
                        f6 = arr_f1[v2];
                        f7 = arr_f1[v2 + 1];
                        break;
                    }
                    case 86: {
                        v4 = v2;
                        path0.lineTo(f6, arr_f1[v4]);
                        f7 = arr_f1[v4];
                        break;
                    }
                    case 97: {
                        v4 = v2;
                        b.g(path0, f6, f7, arr_f1[v2 + 5] + f6, arr_f1[v2 + 6] + f7, arr_f1[v2], arr_f1[v2 + 1], arr_f1[v2 + 2], arr_f1[v2 + 3] != 0.0f, arr_f1[v2 + 4] != 0.0f);
                        f6 += arr_f1[v2 + 5];
                        f7 += arr_f1[v2 + 6];
                        f3 = f7;
                        f2 = f6;
                        break;
                    }
                    case 99: {
                        path0.rCubicTo(arr_f1[v2], arr_f1[v2 + 1], arr_f1[v2 + 2], arr_f1[v2 + 3], arr_f1[v2 + 4], arr_f1[v2 + 5]);
                        f14 = arr_f1[v2 + 2] + f6;
                        f15 = arr_f1[v2 + 3] + f7;
                        f6 += arr_f1[v2 + 4];
                        f7 += arr_f1[v2 + 5];
                        f2 = f14;
                        f3 = f15;
                        v4 = v2;
                        break;
                    }
                    case 104: {
                        path0.rLineTo(arr_f1[v2], 0.0f);
                        f6 += arr_f1[v2];
                        v4 = v2;
                        break;
                    }
                    case 108: {
                        path0.rLineTo(arr_f1[v2], arr_f1[v2 + 1]);
                        f6 += arr_f1[v2];
                        f7 += arr_f1[v2 + 1];
                        v4 = v2;
                        break;
                    }
                    case 109: {
                        float f16 = arr_f1[v2];
                        f6 += f16;
                        float f17 = arr_f1[v2 + 1];
                        f7 += f17;
                        if(v2 > 0) {
                            path0.rLineTo(f16, f17);
                            v4 = v2;
                            break;
                        }
                        else {
                            path0.rMoveTo(f16, f17);
                        }
                        v4 = v2;
                        f9 = f7;
                        f8 = f6;
                        break;
                    }
                    case 0x71: {
                        path0.rQuadTo(arr_f1[v2], arr_f1[v2 + 1], arr_f1[v2 + 2], arr_f1[v2 + 3]);
                        f14 = arr_f1[v2] + f6;
                        f15 = arr_f1[v2 + 1] + f7;
                        f6 += arr_f1[v2 + 2];
                        f7 += arr_f1[v2 + 3];
                        f2 = f14;
                        f3 = f15;
                        v4 = v2;
                        break;
                    }
                    case 0x73: {
                        if(v3 == 99 || v3 == 0x73 || v3 == 67 || v3 == 83) {
                            f19 = f7 - f3;
                            f18 = f6 - f2;
                        }
                        else {
                            f18 = 0.0f;
                            f19 = 0.0f;
                        }
                        path0.rCubicTo(f18, f19, arr_f1[v2], arr_f1[v2 + 1], arr_f1[v2 + 2], arr_f1[v2 + 3]);
                        f14 = arr_f1[v2] + f6;
                        f15 = arr_f1[v2 + 1] + f7;
                        f6 += arr_f1[v2 + 2];
                        f7 += arr_f1[v2 + 3];
                        f2 = f14;
                        f3 = f15;
                        v4 = v2;
                        break;
                    }
                    case 0x74: {
                        if(v3 == 81 || v3 == 84 || v3 == 0x71 || v3 == 0x74) {
                            f21 = f6 - f2;
                            f20 = f7 - f3;
                        }
                        else {
                            f20 = 0.0f;
                            f21 = 0.0f;
                        }
                        path0.rQuadTo(f21, f20, arr_f1[v2], arr_f1[v2 + 1]);
                        float f22 = f21 + f6;
                        float f23 = f20 + f7;
                        f6 += arr_f1[v2];
                        f7 += arr_f1[v2 + 1];
                        f3 = f23;
                        f2 = f22;
                        v4 = v2;
                        break;
                    }
                    case 0x76: {
                        path0.rLineTo(0.0f, arr_f1[v2]);
                        f7 += arr_f1[v2];
                        v4 = v2;
                        break;
                    }
                    default: {
                        v4 = v2;
                    }
                }
                v2 = v4 + v1;
                v3 = c1;
                v = v3;
            }
            arr_f[0] = f6;
            arr_f[1] = f7;
            arr_f[2] = f2;
            arr_f[3] = f3;
            arr_f[4] = f8;
            arr_f[5] = f9;
        }

        private static void f(Path path0, double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7, double f8) {
            int v = (int)Math.ceil(Math.abs(f8 * 4.0 / 3.141593));
            double f9 = Math.cos(f6);
            double f10 = Math.sin(f6);
            double f11 = Math.cos(f7);
            double f12 = Math.sin(f7);
            double f13 = -f2 * f9;
            double f14 = f3 * f10;
            double f15 = -f2 * f10;
            double f16 = f3 * f9;
            double f17 = f12 * f15 + f11 * f16;
            double f18 = f13 * f12 - f14 * f11;
            int v1 = 0;
            double f19 = f4;
            double f20 = f5;
            double f21 = f7;
            while(v1 < v) {
                double f22 = f21 + f8 / ((double)v);
                double f23 = Math.sin(f22);
                double f24 = Math.cos(f22);
                double f25 = f + f2 * f9 * f24 - f14 * f23;
                double f26 = f1 + f2 * f10 * f24 + f16 * f23;
                double f27 = f13 * f23 - f14 * f24;
                double f28 = f23 * f15 + f24 * f16;
                double f29 = f22 - f21;
                double f30 = Math.tan(f29 / 2.0);
                double f31 = Math.sin(f29) * (Math.sqrt(f30 * 3.0 * f30 + 4.0) - 1.0) / 3.0;
                path0.rLineTo(0.0f, 0.0f);
                path0.cubicTo(((float)(f19 + f18 * f31)), ((float)(f20 + f17 * f31)), ((float)(f25 - f31 * f27)), ((float)(f26 - f31 * f28)), ((float)f25), ((float)f26));
                ++v1;
                f19 = f25;
                f21 = f22;
                f17 = f28;
                f18 = f27;
                f20 = f26;
            }
        }

        private static void g(Path path0, float f, float f1, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z1) {
            double f25;
            double f24;
            double f7 = Math.toRadians(f6);
            double f8 = Math.cos(f7);
            double f9 = Math.sin(f7);
            double f10 = (((double)f) * f8 + ((double)f1) * f9) / ((double)f4);
            double f11 = (((double)(-f)) * f9 + ((double)f1) * f8) / ((double)f5);
            double f12 = (((double)f2) * f8 + ((double)f3) * f9) / ((double)f4);
            double f13 = (((double)(-f2)) * f9 + ((double)f3) * f8) / ((double)f5);
            double f14 = f10 - f12;
            double f15 = f11 - f13;
            double f16 = (f10 + f12) / 2.0;
            double f17 = (f11 + f13) / 2.0;
            double f18 = f14 * f14 + f15 * f15;
            if(Double.compare(f18, 0.0) == 0) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double f19 = 1.0 / f18 - 0.25;
            if(f19 < 0.0) {
                Log.w("PathParser", "Points are too far apart " + f18);
                double f20 = Math.sqrt(f18);
                b.g(path0, f, f1, f2, f3, f4 * ((float)(f20 / 1.99999)), f5 * ((float)(f20 / 1.99999)), f6, z, z1);
                return;
            }
            double f21 = Math.sqrt(f19);
            double f22 = f14 * f21;
            double f23 = f21 * f15;
            if(z == z1) {
                f24 = f16 - f23;
                f25 = f17 + f22;
            }
            else {
                f24 = f16 + f23;
                f25 = f17 - f22;
            }
            double f26 = Math.atan2(f11 - f25, f10 - f24);
            double f27 = Math.atan2(f13 - f25, f12 - f24) - f26;
            int v = Double.compare(f27, 0.0);
            if(z1 != v >= 0) {
                f27 = v <= 0 ? f27 + 6.283185 : f27 - 6.283185;
            }
            double f28 = f24 * ((double)f4);
            double f29 = f25 * ((double)f5);
            b.f(path0, f28 * f8 - f29 * f9, f28 * f9 + f29 * f8, ((double)f4), ((double)f5), ((double)f), ((double)f1), f7, f26, f27);
        }

        public void h(b g$b0, b g$b1, float f) {
            this.a = g$b0.a;
            for(int v = 0; true; ++v) {
                float[] arr_f = g$b0.b;
                if(v >= arr_f.length) {
                    break;
                }
                this.b[v] = arr_f[v] * (1.0f - f) + g$b1.b[v] * f;
            }
        }

        public static void i(b[] arr_g$b, Path path0) {
            g.j(arr_g$b, path0);
        }
    }

    private static void a(ArrayList arrayList0, char c, float[] arr_f) {
        arrayList0.add(new b(c, arr_f));
    }

    public static boolean b(b[] arr_g$b, b[] arr_g$b1) {
        if(arr_g$b == null || arr_g$b1 == null || arr_g$b.length != arr_g$b1.length) {
            return false;
        }
        int v = 0;
        while(v < arr_g$b.length) {
            if(arr_g$b[v].a == arr_g$b1[v].a) {
                float[] arr_f = arr_g$b[v].b;
                float[] arr_f1 = arr_g$b1[v].b;
                if(arr_f.length != arr_f1.length) {
                    return false;
                }
                ++v;
                continue;
            }
            return false;
        }
        return true;
    }

    static float[] c(float[] arr_f, int v, int v1) {
        if(v > v1) {
            throw new IllegalArgumentException();
        }
        if(v < 0 || v > arr_f.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int v2 = v1 - v;
        float[] arr_f1 = new float[v2];
        System.arraycopy(arr_f, v, arr_f1, 0, Math.min(v2, arr_f.length - v));
        return arr_f1;
    }

    public static b[] d(String s) {
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        int v1;
        for(v1 = 1; v1 < s.length(); v1 = v2 + 1) {
            int v2 = g.i(s, v1);
            String s1 = s.substring(v, v2).trim();
            if(!s1.isEmpty()) {
                g.a(arrayList0, s1.charAt(0), g.h(s1));
            }
            v = v2;
        }
        if(v1 - v == 1 && v < s.length()) {
            g.a(arrayList0, s.charAt(v), new float[0]);
        }
        return (b[])arrayList0.toArray(new b[0]);
    }

    public static Path e(String s) {
        Path path0 = new Path();
        b[] arr_g$b = g.d(s);
        try {
            b.i(arr_g$b, path0);
            return path0;
        }
        catch(RuntimeException runtimeException0) {
            throw new RuntimeException("Error in parsing " + s, runtimeException0);
        }
    }

    public static b[] f(b[] arr_g$b) {
        b[] arr_g$b1 = new b[arr_g$b.length];
        for(int v = 0; v < arr_g$b.length; ++v) {
            arr_g$b1[v] = new b(arr_g$b[v]);
        }
        return arr_g$b1;
    }

    private static void g(String s, int v, a g$a0) {
        g$a0.b = false;
        int v1 = v;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        while(v1 < s.length()) {
            switch(s.charAt(v1)) {
                case 0x20: 
                case 44: {
                    z = false;
                    z2 = true;
                    break;
                }
                case 45: {
                    if(v1 == v || z) {
                        z = false;
                    }
                    else {
                        g$a0.b = true;
                        z = false;
                        z2 = true;
                    }
                    break;
                }
                case 46: {
                    if(z1) {
                        g$a0.b = true;
                        z = false;
                        z2 = true;
                    }
                    else {
                        z = false;
                        z1 = true;
                    }
                    break;
                }
                case 69: 
                case 101: {
                    z = true;
                    break;
                }
                default: {
                    z = false;
                }
            }
            if(z2) {
                break;
            }
            ++v1;
        }
        g$a0.a = v1;
    }

    private static float[] h(String s) {
        switch(s.charAt(0)) {
            case 90: 
            case 0x7A: {
                return new float[0];
            }
            default: {
                try {
                    float[] arr_f = new float[s.length()];
                    a g$a0 = new a();
                    int v = s.length();
                    int v2 = 0;
                    for(int v1 = 1; v1 < v; v1 = g$a0.b ? v3 : v3 + 1) {
                        g.g(s, v1, g$a0);
                        int v3 = g$a0.a;
                        if(v1 < v3) {
                            arr_f[v2] = Float.parseFloat(s.substring(v1, v3));
                            ++v2;
                        }
                    }
                    return g.c(arr_f, 0, v2);
                }
                catch(NumberFormatException numberFormatException0) {
                }
                throw new RuntimeException("error in parsing \"" + s + "\"", numberFormatException0);
            }
        }
    }

    private static int i(String s, int v) {
        while(v < s.length()) {
            int v1 = s.charAt(v);
            if(((v1 - 65) * (v1 - 90) <= 0 || (v1 - 97) * (v1 - 0x7A) <= 0) && v1 != 101 && v1 != 69) {
                return v;
            }
            ++v;
        }
        return v;
    }

    public static void j(b[] arr_g$b, Path path0) {
        int v = 109;
        for(int v1 = 0; v1 < arr_g$b.length; ++v1) {
            b g$b0 = arr_g$b[v1];
            int v2 = g$b0.a;
            float[] arr_f = g$b0.b;
            b.e(path0, new float[6], ((char)v), ((char)v2), arr_f);
            v = g$b0.a;
        }
    }

    public static void k(b[] arr_g$b, b[] arr_g$b1) {
        for(int v = 0; v < arr_g$b1.length; ++v) {
            arr_g$b[v].a = arr_g$b1[v].a;
            for(int v1 = 0; v1 < arr_g$b1[v].b.length; ++v1) {
                arr_g$b[v].b[v1] = arr_g$b1[v].b[v1];
            }
        }
    }
}

