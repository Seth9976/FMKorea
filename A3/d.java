package a3;

abstract class d {
    static int a(b b0) {
        return d.b(b0, true) + d.b(b0, false);
    }

    private static int b(b b0, boolean z) {
        int v = z ? b0.d() : b0.e();
        int v1 = z ? b0.e() : b0.d();
        byte[][] arr2_b = b0.c();
        int v3 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            int v4 = -1;
            int v6 = 0;
            for(int v5 = 0; v5 < v1; ++v5) {
                int v7 = z ? arr2_b[v2][v5] : arr2_b[v5][v2];
                if(v7 == v4) {
                    ++v6;
                }
                else {
                    if(v6 >= 5) {
                        v3 += v6 - 2;
                    }
                    v6 = 1;
                    v4 = v7;
                }
            }
            if(v6 >= 5) {
                v3 += v6 - 2;
            }
        }
        return v3;
    }

    static int c(b b0) {
        byte[][] arr2_b = b0.c();
        int v = b0.e();
        int v1 = b0.d();
        int v3 = 0;
        for(int v2 = 0; v2 < v1 - 1; ++v2) {
            byte[] arr_b = arr2_b[v2];
            for(int v4 = 0; v4 < v - 1; ++v4) {
                int v5 = arr_b[v4];
                if(v5 == arr_b[v4 + 1]) {
                    byte[] arr_b1 = arr2_b[v2 + 1];
                    if(v5 == arr_b1[v4] && v5 == arr_b1[v4 + 1]) {
                        ++v3;
                    }
                }
            }
        }
        return v3 * 3;
    }

    static int d(b b0) {
        byte[][] arr2_b = b0.c();
        int v = b0.e();
        int v1 = b0.d();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            for(int v4 = 0; v4 < v; ++v4) {
                byte[] arr_b = arr2_b[v2];
                if(v4 + 6 < v && arr_b[v4] == 1 && arr_b[v4 + 1] == 0 && arr_b[v4 + 2] == 1 && arr_b[v4 + 3] == 1 && arr_b[v4 + 4] == 1 && arr_b[v4 + 5] == 0 && arr_b[v4 + 6] == 1 && (d.g(arr_b, v4 - 4, v4) || d.g(arr_b, v4 + 7, v4 + 11))) {
                    ++v3;
                }
                if(v2 + 6 < v1 && arr2_b[v2][v4] == 1 && arr2_b[v2 + 1][v4] == 0 && arr2_b[v2 + 2][v4] == 1 && arr2_b[v2 + 3][v4] == 1 && arr2_b[v2 + 4][v4] == 1 && arr2_b[v2 + 5][v4] == 0 && arr2_b[v2 + 6][v4] == 1 && (d.h(arr2_b, v4, v2 - 4, v2) || d.h(arr2_b, v4, v2 + 7, v2 + 11))) {
                    ++v3;
                }
            }
        }
        return v3 * 40;
    }

    static int e(b b0) {
        byte[][] arr2_b = b0.c();
        int v = b0.e();
        int v1 = b0.d();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            byte[] arr_b = arr2_b[v2];
            for(int v4 = 0; v4 < v; ++v4) {
                if(arr_b[v4] == 1) {
                    ++v3;
                }
            }
        }
        int v5 = b0.d() * b0.e();
        return Math.abs((v3 << 1) - v5) * 10 / v5 * 10;
    }

    static boolean f(int v, int v1, int v2) {
        switch(v) {
            case 0: {
                return (v2 + v1 & 1) == 0;
            }
            case 1: {
                break;
            }
            case 2: {
                return v1 % 3 == 0;
            }
            case 3: {
                return (v2 + v1) % 3 == 0;
            }
            case 4: {
                v2 = v2 / 2 + v1 / 3;
                break;
            }
            case 5: {
                return (v2 * v1 & 1) + v2 * v1 % 3 == 0;
            }
            case 6: {
                return ((v2 * v1 & 1) + v2 * v1 % 3 & 1) == 0;
            }
            case 7: {
                return (v2 * v1 % 3 + (v2 + v1 & 1) & 1) == 0;
            }
            default: {
                throw new IllegalArgumentException("Invalid mask pattern: " + v);
            }
        }
        return (v2 & 1) == 0;
    }

    private static boolean g(byte[] arr_b, int v, int v1) {
        int v2 = Math.max(v, 0);
        int v3 = Math.min(v1, arr_b.length);
        while(v2 < v3) {
            if(arr_b[v2] == 1) {
                return false;
            }
            ++v2;
        }
        return true;
    }

    private static boolean h(byte[][] arr2_b, int v, int v1, int v2) {
        int v3 = Math.max(v1, 0);
        int v4 = Math.min(v2, arr2_b.length);
        while(v3 < v4) {
            if(arr2_b[v3][v] == 1) {
                return false;
            }
            ++v3;
        }
        return true;
    }
}

