package T0;

abstract class d {
    static void a(a a0, a a1) {
        Class class0 = d.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            int v = a0.c(0);
            int v1 = a0.c(1);
            int v2 = a0.c(2);
            float[] arr_f = a0.b();
            float[] arr_f1 = a1.b();
            for(int v3 = 0; v3 < v; ++v3) {
                for(int v4 = 0; v4 < v1; ++v4) {
                    for(int v5 = 0; v5 < v2; ++v5) {
                        int v6 = v3 * v1 * v2 + v4 * v2 + v5;
                        arr_f[v6] += arr_f1[v5];
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    static a b(a[] arr_a) {
        Class class0 = d.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            int v = arr_a[0].c(0);
            int v2 = 0;
            for(int v1 = 0; v1 < arr_a.length; ++v1) {
                v2 += arr_a[v1].c(1);
            }
            a a0 = new a(new int[]{v, v2});
            float[] arr_f = a0.b();
            for(int v3 = 0; v3 < v; ++v3) {
                int v4 = v3 * v2;
                for(int v5 = 0; v5 < arr_a.length; ++v5) {
                    float[] arr_f1 = arr_a[v5].b();
                    int v6 = arr_a[v5].c(1);
                    System.arraycopy(arr_f1, v3 * v6, arr_f, v4, v6);
                    v4 += v6;
                }
            }
            return a0;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
        return null;
    }

    static a c(a a0, a a1) {
        Class class0 = d.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            int v1 = a0.c(0);
            int v2 = a0.c(1);
            int v3 = a0.c(2);
            int v4 = a1.c(0);
            int v5 = v2 - v4 + 1;
            int v6 = a1.c(2);
            a a2 = new a(new int[]{v1, v5, v6});
            float[] arr_f = a0.b();
            float[] arr_f1 = a2.b();
            float[] arr_f2 = a1.b();
            int v7 = 0;
            for(int v = 0; v7 < v1; v = 0) {
                int v8 = 0;
                while(v8 < v6) {
                    int v9 = 0;
                    while(v9 < v5) {
                        float f = 0.0f;
                        while(v < v4) {
                            for(int v10 = 0; v10 < v3; ++v10) {
                                f += arr_f[v2 * v3 * v7 + (v + v9) * v3 + v10] * arr_f2[(v * v3 + v10) * v6 + v8];
                            }
                            ++v;
                        }
                        arr_f1[v5 * v6 * v7 + v9 * v6 + v8] = f;
                        ++v9;
                        v = 0;
                    }
                    ++v8;
                    v = 0;
                }
                ++v7;
            }
            return a2;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
        return null;
    }

    static a d(a a0, a a1, a a2) {
        Class class0 = d.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            int v = a0.c(0);
            int v1 = a2.c(0);
            a a3 = d.h(a0, a1);
            float[] arr_f = a2.b();
            float[] arr_f1 = a3.b();
            for(int v2 = 0; v2 < v; ++v2) {
                for(int v3 = 0; v3 < v1; ++v3) {
                    int v4 = v2 * v1 + v3;
                    arr_f1[v4] += arr_f[v3];
                }
            }
            return a3;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    static a e(String[] arr_s, int v, a a0) {
        Class class0 = d.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            int v1 = a0.c(1);
            a a1 = new a(new int[]{arr_s.length, v, v1});
            float[] arr_f = a1.b();
            float[] arr_f1 = a0.b();
            for(int v2 = 0; v2 < arr_s.length; ++v2) {
                int[] arr_v = e.c(arr_s[v2], v);
                for(int v3 = 0; v3 < v; ++v3) {
                    System.arraycopy(arr_f1, arr_v[v3] * v1, arr_f, v1 * v * v2 + v1 * v3, v1);
                }
            }
            return a1;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    static void f(a a0, int v) {
        Class class0 = d.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            if(v >= a0.d()) {
                return;
            }
            int v1 = 1;
            for(int v2 = v; v2 < a0.d(); ++v2) {
                v1 *= a0.c(v2);
            }
            int[] arr_v = new int[v + 1];
            for(int v3 = 0; v3 < v; ++v3) {
                arr_v[v3] = a0.c(v3);
            }
            arr_v[v] = v1;
            a0.e(arr_v);
            return;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
    }

    static a g(a a0, int v) {
        Class class0 = d.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            int v1 = a0.c(0);
            int v2 = a0.c(1);
            int v3 = a0.c(2);
            int v4 = v2 - v + 1;
            a a1 = new a(new int[]{v1, v4, v3});
            float[] arr_f = a0.b();
            float[] arr_f1 = a1.b();
            for(int v5 = 0; v5 < v1; ++v5) {
                for(int v6 = 0; v6 < v3; ++v6) {
                    for(int v7 = 0; v7 < v4; ++v7) {
                        int v8 = v7 * v3;
                        int v9 = v5 * v4 * v3 + v8 + v6;
                        int v10 = v5 * v2 * v3 + v8 + v6;
                        arr_f1[v9] = 1.401298E-45f;
                        for(int v11 = 0; v11 < v; ++v11) {
                            arr_f1[v9] = Math.max(arr_f1[v9], arr_f[v10 + v11 * v3]);
                        }
                    }
                }
            }
            return a1;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    static a h(a a0, a a1) {
        Class class0 = d.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            int v = a0.c(0);
            int v1 = a1.c(0);
            int v2 = a1.c(1);
            a a2 = new a(new int[]{v, v2});
            float[] arr_f = a0.b();
            float[] arr_f1 = a1.b();
            float[] arr_f2 = a2.b();
            for(int v3 = 0; v3 < v; ++v3) {
                for(int v4 = 0; v4 < v2; ++v4) {
                    int v5 = v3 * v2 + v4;
                    arr_f2[v5] = 0.0f;
                    for(int v6 = 0; v6 < v1; ++v6) {
                        arr_f2[v5] += arr_f[v3 * v1 + v6] * arr_f1[v6 * v2 + v4];
                    }
                }
            }
            return a2;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    static void i(a a0) {
        Class class0 = d.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            float[] arr_f = a0.b();
            for(int v = 0; v < arr_f.length; ++v) {
                if(arr_f[v] < 0.0f) {
                    arr_f[v] = 0.0f;
                }
            }
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    static void j(a a0) {
        Class class0 = d.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            int v1 = a0.c(0);
            int v2 = a0.c(1);
            float[] arr_f = a0.b();
            for(int v = 0; v < v1; ++v) {
                int v3 = v * v2;
                int v4 = v3 + v2;
                float f = 1.401298E-45f;
                for(int v5 = v3; v5 < v4; ++v5) {
                    float f1 = arr_f[v5];
                    if(f1 > f) {
                        f = f1;
                    }
                }
                for(int v6 = v3; v6 < v4; ++v6) {
                    arr_f[v6] = (float)Math.exp(arr_f[v6] - f);
                }
                float f2 = 0.0f;
                for(int v7 = v3; v7 < v4; ++v7) {
                    f2 += arr_f[v7];
                }
                while(v3 < v4) {
                    arr_f[v3] /= f2;
                    ++v3;
                }
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
    }

    static a k(a a0) {
        Class class0 = d.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            int v = a0.c(0);
            int v1 = a0.c(1);
            a a1 = new a(new int[]{v1, v});
            float[] arr_f = a0.b();
            float[] arr_f1 = a1.b();
            for(int v2 = 0; v2 < v; ++v2) {
                for(int v3 = 0; v3 < v1; ++v3) {
                    arr_f1[v3 * v + v2] = arr_f[v2 * v1 + v3];
                }
            }
            return a1;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    static a l(a a0) {
        Class class0 = d.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            int v = a0.c(0);
            int v1 = a0.c(1);
            int v2 = a0.c(2);
            a a1 = new a(new int[]{v2, v1, v});
            float[] arr_f = a0.b();
            float[] arr_f1 = a1.b();
            for(int v3 = 0; v3 < v; ++v3) {
                for(int v4 = 0; v4 < v1; ++v4) {
                    for(int v5 = 0; v5 < v2; ++v5) {
                        arr_f1[v5 * v * v1 + v4 * v + v3] = arr_f[v3 * v1 * v2 + v4 * v2 + v5];
                    }
                }
            }
            return a1;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }
}

