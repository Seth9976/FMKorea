package U2;

public abstract class i {
    private static final int[] a;
    private static final int[][] b;
    private static final int[] c;
    private static final int[] d;

    static {
        i.a = new int[]{5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 0x30, 56, 62, 68};
        i.b = new int[][]{new int[]{0xE4, 0x30, 15, 0x6F, 62}, new int[]{23, 68, 0x90, 0x86, 0xF0, 92, 0xFE}, new int[]{28, 24, 0xB9, 0xA6, 0xDF, 0xF8, 0x74, 0xFF, 110, 61}, new int[]{0xAF, 0x8A, 205, 12, 0xC2, 0xA8, 39, 0xF5, 60, 97, 120}, new int[]{41, 0x99, 0x9E, 91, 61, 42, 0x8E, 0xD5, 97, 0xB2, 100, 0xF2}, new int[]{0x9C, 97, 0xC0, 0xFC, 0x5F, 9, 0x9D, 0x77, 0x8A, 45, 18, 0xBA, 83, 0xB9}, new int[]{83, 0xC3, 100, 39, 0xBC, 75, 66, 61, 0xF1, 0xD5, 109, 0x81, 94, 0xFE, 0xE1, 0x30, 90, 0xBC}, new int[]{15, 0xC3, 0xF4, 9, 0xE9, 71, 0xA8, 2, 0xBC, 0xA0, 0x99, 0x91, 0xFD, 0x4F, 108, 82, 27, 0xAE, 0xBA, 0xAC}, new int[]{52, 190, 88, 205, 109, 39, 0xB0, 21, 0x9B, 0xC5, 0xFB, 0xDF, 0x9B, 21, 5, 0xAC, 0xFE, 0x7C, 12, 0xB5, 0xB8, 0x60, 50, 0xC1}, new int[]{0xD3, 0xE7, 43, 97, 71, 0x60, 103, 0xAE, 37, 0x97, 170, 53, 75, 34, 0xF9, 0x79, 17, 0x8A, 110, 0xD5, 0x8D, 0x88, 120, 0x97, 0xE9, 0xA8, 93, 0xFF}, new int[]{0xF5, 0x7F, 0xF2, 0xDA, 130, 0xFA, 0xA2, 0xB5, 102, 120, 84, 0xB3, 220, 0xFB, 80, 0xB6, 0xE5, 18, 2, 4, 68, 33, 101, 0x89, 0x5F, 0x77, 0x73, 44, 0xAF, 0xB8, 59, 25, 0xE1, 98, 81, 0x70}, new int[]{77, 0xC1, 0x89, 0x1F, 19, 38, 22, 0x99, 0xF7, 105, 0x7A, 2, 0xF5, 0x85, 0xF2, 8, 0xAF, 0x5F, 100, 9, 0xA7, 105, 0xD6, 0x6F, 57, 0x79, 21, 1, 0xFD, 57, 54, 101, 0xF8, 202, 69, 50, 150, 0xB1, 0xE2, 5, 9, 5}, new int[]{0xF5, 0x84, 0xAC, 0xDF, 0x60, 0x20, 0x75, 22, 0xEE, 0x85, 0xEE, 0xE7, 205, 0xBC, 0xED, 87, 0xBF, 106, 16, 0x93, 0x76, 23, 37, 90, 170, 205, 0x83, 88, 120, 100, 66, 0x8A, 0xBA, 0xF0, 82, 44, 0xB0, 87, 0xBB, 0x93, 0xA0, 0xAF, 69, 0xD5, 92, 0xFD, 0xE1, 19}, new int[]{0xAF, 9, 0xDF, 0xEE, 12, 17, 220, 0xD0, 100, 29, 0xAF, 170, 230, 0xC0, 0xD7, 0xEB, 150, 0x9F, 36, 0xDF, 38, 200, 0x84, 54, 0xE4, 0x92, 0xDA, 0xEA, 0x75, 203, 29, 0xE8, 0x90, 0xEE, 22, 150, 201, 0x75, 62, 0xCF, 0xA4, 13, 0x89, 0xF5, 0x7F, 67, 0xF7, 28, 0x9B, 43, 203, 107, 0xE9, 53, 0x8F, 46}, new int[]{0xF2, 93, 0xA9, 50, 0x90, 210, 39, 0x76, 202, 0xBC, 201, 0xBD, 0x8F, 108, 0xC4, 37, 0xB9, 0x70, 0x86, 230, 0xF5, 0x3F, 0xC5, 190, 0xFA, 106, 0xB9, 0xDD, 0xAF, 0x40, 0x72, 71, 0xA1, 44, 0x93, 6, 27, 0xDA, 51, 0x3F, 87, 10, 40, 130, 0xBC, 17, 0xA3, 0x1F, 0xB0, 170, 4, 107, 0xE8, 7, 94, 0xA6, 0xE0, 0x7C, 86, 0x2F, 11, 204}, new int[]{220, 0xE4, 0xAD, 89, 0xFB, 0x95, 0x9F, 56, 89, 33, 0x93, 0xF4, 0x9A, 36, 73, 0x7F, 0xD5, 0x88, 0xF8, 180, 0xEA, 0xC5, 0x9E, 0xB1, 68, 0x7A, 93, 0xD5, 15, 0xA0, 0xE3, 0xEC, 66, 0x8B, 0x99, 0xB9, 202, 0xA7, 0xB3, 25, 220, 0xE8, 0x60, 210, 0xE7, 0x88, 0xDF, 0xEF, 0xB5, 0xF1, 59, 52, 0xAC, 25, 49, 0xE8, 0xD3, 0xBD, 0x40, 54, 108, 0x99, 0x84, 0x3F, 0x60, 103, 82, 0xBA}};
        i.c = new int[0x100];
        i.d = new int[0xFF];
        int v = 1;
        for(int v1 = 0; v1 < 0xFF; ++v1) {
            i.d[v1] = v;
            i.c[v] = v1;
            v <<= 1;
            v = v < 0x100 ? v << 1 : v ^ 301;
        }
    }

    private static String a(CharSequence charSequence0, int v) {
        return i.b(charSequence0, 0, charSequence0.length(), v);
    }

    private static String b(CharSequence charSequence0, int v, int v1, int v2) {
        int v4;
        for(v4 = 0; true; ++v4) {
            int[] arr_v = i.a;
            if(v4 >= arr_v.length) {
                v4 = -1;
                break;
            }
            if(arr_v[v4] == v2) {
                break;
            }
        }
        if(v4 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: " + v2);
        }
        int[] arr_v1 = i.b[v4];
        char[] arr_c = new char[v2];
        for(int v5 = 0; v5 < v2; ++v5) {
            arr_c[v5] = '\u0000';
        }
        for(int v6 = v; v6 < v + v1; ++v6) {
            int v7 = v2 - 1;
            int v8 = arr_c[v7] ^ charSequence0.charAt(v6);
            while(v7 > 0) {
                if(v8 == 0) {
                    arr_c[v7] = arr_c[v7 - 1];
                }
                else {
                    int v9 = arr_v1[v7];
                    if(v9 != 0) {
                        arr_c[v7] = (char)(i.d[(i.c[v8] + i.c[v9]) % 0xFF] ^ arr_c[v7 - 1]);
                    }
                }
                --v7;
            }
            if(v8 == 0) {
                arr_c[0] = '\u0000';
            }
            else {
                int v10 = arr_v1[0];
                if(v10 != 0) {
                    arr_c[0] = (char)i.d[(i.c[v8] + i.c[v10]) % 0xFF];
                }
            }
        }
        char[] arr_c1 = new char[v2];
        for(int v3 = 0; v3 < v2; ++v3) {
            arr_c1[v3] = arr_c[v2 - v3 - 1];
        }
        return String.valueOf(arr_c1);
    }

    public static String c(String s, k k0) {
        if(s.length() != k0.a()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder stringBuilder0 = new StringBuilder(k0.a() + k0.c());
        stringBuilder0.append(s);
        int v = k0.f();
        if(v == 1) {
            stringBuilder0.append(i.a(s, k0.c()));
            return stringBuilder0.toString();
        }
        stringBuilder0.setLength(stringBuilder0.capacity());
        int[] arr_v = new int[v];
        int[] arr_v1 = new int[v];
        int[] arr_v2 = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = k0.b(v1 + 1);
            arr_v1[v1] = k0.d(v1 + 1);
            arr_v2[v1] = 0;
            if(v1 > 0) {
                arr_v2[v1] = arr_v2[v1 - 1] + arr_v[v1];
            }
        }
        for(int v2 = 0; v2 < v; ++v2) {
            StringBuilder stringBuilder1 = new StringBuilder(arr_v[v2]);
            for(int v3 = v2; v3 < k0.a(); v3 += v) {
                stringBuilder1.append(s.charAt(v3));
            }
            String s1 = i.a(stringBuilder1.toString(), arr_v1[v2]);
            int v4 = v2;
            for(int v5 = 0; v4 < arr_v1[v2] * v; ++v5) {
                stringBuilder0.setCharAt(k0.a() + v4, s1.charAt(v5));
                v4 += v;
            }
        }
        return stringBuilder0.toString();
    }
}

