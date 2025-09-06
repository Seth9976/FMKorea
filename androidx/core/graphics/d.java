package androidx.core.graphics;

import android.graphics.Color;

public abstract class d {
    private static final ThreadLocal a;

    static {
        d.a = new ThreadLocal();
    }

    public static void a(int v, int v1, int v2, double[] arr_f) {
        if(arr_f.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double f = Double.compare(((double)v) / 255.0, 0.04045) >= 0 ? Math.pow((((double)v) / 255.0 + 0.055) / 1.055, 2.4) : ((double)v) / 255.0 / 12.92;
        double f1 = ((double)v1) / 255.0 < 0.04045 ? ((double)v1) / 255.0 / 12.92 : Math.pow((((double)v1) / 255.0 + 0.055) / 1.055, 2.4);
        double f2 = ((double)v2) / 255.0 < 0.04045 ? ((double)v2) / 255.0 / 12.92 : Math.pow((((double)v2) / 255.0 + 0.055) / 1.055, 2.4);
        arr_f[0] = (0.4124 * f + 0.3576 * f1 + 0.1805 * f2) * 100.0;
        arr_f[1] = (0.2126 * f + 0.7152 * f1 + 0.0722 * f2) * 100.0;
        arr_f[2] = (f * 0.0193 + f1 * 0.1192 + f2 * 0.9505) * 100.0;
    }

    public static int b(double f, double f1, double f2) {
        double f3 = (3.2406 * f + -1.5372 * f1 + -0.4986 * f2) / 100.0;
        double f4 = (-0.9689 * f + 1.8758 * f1 + 0.0415 * f2) / 100.0;
        double f5 = (0.0557 * f + -0.204 * f1 + 1.057 * f2) / 100.0;
        double f6 = Double.compare(f3, 0.003131) <= 0 ? f3 * 12.92 : Math.pow(f3, 0.416667) * 1.055 - 0.055;
        double f7 = f4 > 0.003131 ? Math.pow(f4, 0.416667) * 1.055 - 0.055 : f4 * 12.92;
        return f5 > 0.003131 ? Color.rgb(d.i(((int)Math.round(f6 * 255.0)), 0, 0xFF), d.i(((int)Math.round(f7 * 255.0)), 0, 0xFF), d.i(((int)Math.round((Math.pow(f5, 0.416667) * 1.055 - 0.055) * 255.0)), 0, 0xFF)) : Color.rgb(d.i(((int)Math.round(f6 * 255.0)), 0, 0xFF), d.i(((int)Math.round(f7 * 255.0)), 0, 0xFF), d.i(((int)Math.round(f5 * 3294.6)), 0, 0xFF));
    }

    public static int c(int v, int v1, float f) {
        return Color.argb(((int)(((float)Color.alpha(v)) * (1.0f - f) + ((float)Color.alpha(v1)) * f)), ((int)(((float)Color.red(v)) * (1.0f - f) + ((float)Color.red(v1)) * f)), ((int)(((float)Color.green(v)) * (1.0f - f) + ((float)Color.green(v1)) * f)), ((int)(((float)Color.blue(v)) * (1.0f - f) + ((float)Color.blue(v1)) * f)));
    }

    public static double d(int v) {
        double[] arr_f = d.j();
        d.e(v, arr_f);
        return arr_f[1] / 100.0;
    }

    public static void e(int v, double[] arr_f) {
        d.a(Color.red(v), Color.green(v), Color.blue(v), arr_f);
    }

    private static int f(int v, int v1) [...] // Inlined contents

    public static int g(int v, int v1) {
        int v2 = Color.alpha(v1);
        int v3 = Color.alpha(v);
        int v4 = 0xFF - (0xFF - v2) * (0xFF - v3) / 0xFF;
        return Color.argb(v4, d.h(Color.red(v), v3, Color.red(v1), v2, v4), d.h(Color.green(v), v3, Color.green(v1), v2, v4), d.h(Color.blue(v), v3, Color.blue(v1), v2, v4));
    }

    private static int h(int v, int v1, int v2, int v3, int v4) {
        return v4 == 0 ? 0 : (v * 0xFF * v1 + v2 * v3 * (0xFF - v1)) / (v4 * 0xFF);
    }

    private static int i(int v, int v1, int v2) {
        return v < v1 ? v1 : Math.min(v, v2);
    }

    private static double[] j() {
        ThreadLocal threadLocal0 = d.a;
        double[] arr_f = (double[])threadLocal0.get();
        if(arr_f == null) {
            arr_f = new double[3];
            threadLocal0.set(arr_f);
        }
        return arr_f;
    }

    public static int k(int v, int v1) {
        if(v1 < 0 || v1 > 0xFF) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return v & 0xFFFFFF | v1 << 24;
    }
}

