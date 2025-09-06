package androidx.datastore.preferences.protobuf;

abstract class q0 {
    static abstract class a {
        private static void h(byte b, byte b1, byte b2, byte b3, char[] arr_c, int v) {
            if(a.m(b1) || (b << 28) + (b1 + 0x70) >> 30 != 0 || a.m(b2) || a.m(b3)) {
                throw z.c();
            }
            int v1 = (b & 7) << 18 | (b1 & 0x3F) << 12 | (b2 & 0x3F) << 6 | b3 & 0x3F;
            arr_c[v] = (char)((v1 >>> 10) + 0xD7C0);
            arr_c[v + 1] = (char)((v1 & 0x3FF) + 0xDC00);
        }

        private static void i(byte b, char[] arr_c, int v) {
            arr_c[v] = (char)b;
        }

        private static void j(byte b, byte b1, byte b2, char[] arr_c, int v) {
            if(a.m(b1) || b == 0xFFFFFFE0 && b1 < 0xFFFFFFA0 || b == -19 && b1 >= 0xFFFFFFA0 || a.m(b2)) {
                throw z.c();
            }
            arr_c[v] = (char)((b & 15) << 12 | (b1 & 0x3F) << 6 | b2 & 0x3F);
        }

        private static void k(byte b, byte b1, char[] arr_c, int v) {
            if(b < -62 || a.m(b1)) {
                throw z.c();
            }
            arr_c[v] = (char)((b & 0x1F) << 6 | b1 & 0x3F);
        }

        private static char l(int v) [...] // Inlined contents

        private static boolean m(byte b) {
            return b > -65;
        }

        private static boolean n(byte b) {
            return b >= 0;
        }

        private static boolean o(byte b) {
            return b < -16;
        }

        private static boolean p(byte b) {
            return b < 0xFFFFFFE0;
        }

        private static char q(int v) [...] // Inlined contents

        private static int r(byte b) [...] // Inlined contents
    }

    static abstract class b {
        abstract String a(byte[] arg1, int arg2, int arg3);

        abstract int b(CharSequence arg1, byte[] arg2, int arg3, int arg4);

        final boolean c(byte[] arr_b, int v, int v1) {
            return this.d(0, arr_b, v, v1) == 0;
        }

        abstract int d(int arg1, byte[] arg2, int arg3, int arg4);
    }

    static final class c extends b {
        @Override  // androidx.datastore.preferences.protobuf.q0$b
        String a(byte[] arr_b, int v, int v1) {
            if((v | v1 | arr_b.length - v - v1) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", ((int)arr_b.length), v, v1));
            }
            int v2 = v + v1;
            char[] arr_c = new char[v1];
            int v3;
            for(v3 = 0; v < v2; ++v3) {
                int v4 = arr_b[v];
                if(!a.n(((byte)v4))) {
                    break;
                }
                ++v;
                a.i(((byte)v4), arr_c, v3);
            }
            int v5 = v3;
            while(v < v2) {
                int v6 = v + 1;
                int v7 = arr_b[v];
                if(a.n(((byte)v7))) {
                    int v8 = v5 + 1;
                    a.i(((byte)v7), arr_c, v5);
                    while(v6 < v2) {
                        int v9 = arr_b[v6];
                        if(!a.n(((byte)v9))) {
                            break;
                        }
                        ++v6;
                        a.i(((byte)v9), arr_c, v8);
                        ++v8;
                    }
                    v5 = v8;
                    v = v6;
                    continue;
                }
                if(a.p(((byte)v7))) {
                    if(v6 < v2) {
                        v += 2;
                        a.k(((byte)v7), arr_b[v6], arr_c, v5);
                        ++v5;
                        continue;
                    }
                }
                else if(!a.o(((byte)v7))) {
                    if(v6 < v2 - 2) {
                        int v11 = arr_b[v6];
                        int v12 = v + 3;
                        int v13 = arr_b[v + 2];
                        v += 4;
                        a.h(((byte)v7), ((byte)v11), ((byte)v13), arr_b[v12], arr_c, v5);
                        v5 += 2;
                        continue;
                    }
                }
                else if(v6 < v2 - 1) {
                    int v10 = v + 2;
                    v += 3;
                    a.j(((byte)v7), arr_b[v6], arr_b[v10], arr_c, v5);
                    ++v5;
                    continue;
                }
                throw z.c();
            }
            return new String(arr_c, 0, v5);
        }

        @Override  // androidx.datastore.preferences.protobuf.q0$b
        int b(CharSequence charSequence0, byte[] arr_b, int v, int v1) {
            int v2 = charSequence0.length();
            int v3 = v1 + v;
            int v4;
            for(v4 = 0; v4 < v2; ++v4) {
                int v5 = v4 + v;
                if(v5 >= v3) {
                    break;
                }
                int v6 = charSequence0.charAt(v4);
                if(v6 >= 0x80) {
                    break;
                }
                arr_b[v5] = (byte)v6;
            }
            if(v4 == v2) {
                return v + v2;
            }
            int v7 = v + v4;
            while(v4 < v2) {
                int v8 = charSequence0.charAt(v4);
                if(v8 < 0x80 && v7 < v3) {
                    arr_b[v7] = (byte)v8;
                    ++v7;
                }
                else if(v8 < 0x800 && v7 <= v3 - 2) {
                    int v9 = v7 + 1;
                    arr_b[v7] = (byte)(v8 >>> 6 | 960);
                    v7 += 2;
                    arr_b[v9] = (byte)(v8 & 0x3F | 0x80);
                }
                else if(v8 >= 0xD800 && 0xDFFF >= v8 || v7 > v3 - 3) {
                    if(v7 > v3 - 4) {
                        goto label_49;
                    }
                    if(v4 + 1 == charSequence0.length()) {
                        throw new d(v4 - 1, v2);
                    }
                    int v11 = charSequence0.charAt(v4 + 1);
                    if(!Character.isSurrogatePair(((char)v8), ((char)v11))) {
                        goto label_47;
                    }
                    int v12 = Character.toCodePoint(((char)v8), ((char)v11));
                    arr_b[v7] = (byte)(v12 >>> 18 | 0xF0);
                    arr_b[v7 + 1] = (byte)(v12 >>> 12 & 0x3F | 0x80);
                    int v13 = v7 + 3;
                    arr_b[v7 + 2] = (byte)(v12 >>> 6 & 0x3F | 0x80);
                    v7 += 4;
                    arr_b[v13] = (byte)(v12 & 0x3F | 0x80);
                    ++v4;
                }
                else {
                    arr_b[v7] = (byte)(v8 >>> 12 | 480);
                    int v10 = v7 + 2;
                    arr_b[v7 + 1] = (byte)(v8 >>> 6 & 0x3F | 0x80);
                    v7 += 3;
                    arr_b[v10] = (byte)(v8 & 0x3F | 0x80);
                }
                ++v4;
                continue;
            label_47:
                ++v4;
                throw new d(v4 - 1, v2);
            label_49:
                if(!(0xD800 <= v8 && v8 <= 0xDFFF && (v4 + 1 == charSequence0.length() || !Character.isSurrogatePair(((char)v8), charSequence0.charAt(v4 + 1))))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v8) + " at index " + v7);
                }
                throw new d(v4, v2);
            }
            return v7;
        }

        @Override  // androidx.datastore.preferences.protobuf.q0$b
        int d(int v, byte[] arr_b, int v1, int v2) {
            int v7;
            int v6;
            if(v != 0) {
                if(v1 >= v2) {
                    return v;
                }
                if(((byte)v) < 0xFFFFFFE0) {
                    if(((byte)v) >= -62) {
                        return arr_b[v1] > -65 ? -1 : c.e(arr_b, v1 + 1, v2);
                    }
                    return -1;
                }
                if(((byte)v) < -16) {
                    int v3 = (byte)(~(v >> 8));
                    if(v3 == 0) {
                        int v4 = arr_b[v1];
                        if(v1 + 1 >= v2) {
                            return q0.j(((byte)v), v4);
                        }
                        ++v1;
                        v3 = v4;
                    }
                    if(v3 <= -65 && (((byte)v) != 0xFFFFFFE0 || v3 >= 0xFFFFFFA0) && (((byte)v) != -19 || v3 < 0xFFFFFFA0)) {
                        return arr_b[v1] <= -65 ? c.e(arr_b, v1 + 1, v2) : -1;
                    }
                    return -1;
                }
                int v5 = (byte)(~(v >> 8));
                if(v5 == 0) {
                    v6 = v1 + 1;
                    v5 = arr_b[v1];
                    if(v6 >= v2) {
                        return q0.j(((byte)v), v5);
                    }
                    v7 = 0;
                }
                else {
                    v7 = (byte)(v >> 16);
                    v6 = v1;
                }
                if(v7 == 0) {
                    int v8 = arr_b[v6];
                    if(v6 + 1 >= v2) {
                        return q0.k(((byte)v), v5, v8);
                    }
                    v7 = v8;
                    ++v6;
                }
                if(v5 <= -65 && (((byte)v) << 28) + (v5 + 0x70) >> 30 == 0 && v7 <= -65) {
                    return arr_b[v6] <= -65 ? c.e(arr_b, v6 + 1, v2) : -1;
                }
                return -1;
            }
            return c.e(arr_b, v1, v2);
        }

        private static int e(byte[] arr_b, int v, int v1) {
            while(v < v1 && arr_b[v] >= 0) {
                ++v;
            }
            return v < v1 ? c.f(arr_b, v, v1) : 0;
        }

        private static int f(byte[] arr_b, int v, int v1) {
            while(true) {
                if(v >= v1) {
                    return 0;
                }
                int v2 = v + 1;
                int v3 = arr_b[v];
                if(v3 < 0) {
                    if(v3 < 0xFFFFFFE0) {
                        if(v2 >= v1) {
                            return v3;
                        }
                        if(v3 >= -62) {
                            v += 2;
                            if(arr_b[v2] > -65) {
                                return -1;
                            }
                            continue;
                        }
                    }
                    else if(v3 < -16) {
                        if(v2 >= v1 - 1) {
                            return q0.l(arr_b, v2, v1);
                        }
                        int v4 = v + 2;
                        int v5 = arr_b[v2];
                        if(v5 <= -65 && (v3 != 0xFFFFFFE0 || v5 >= 0xFFFFFFA0) && (v3 != -19 || v5 < 0xFFFFFFA0)) {
                            v += 3;
                            if(arr_b[v4] > -65) {
                                return -1;
                            }
                            continue;
                        }
                    }
                    else {
                        if(v2 >= v1 - 2) {
                            return q0.l(arr_b, v2, v1);
                        }
                        int v6 = arr_b[v2];
                        if(v6 <= -65 && (v3 << 28) + (v6 + 0x70) >> 30 == 0) {
                            int v7 = v + 3;
                            if(arr_b[v + 2] <= -65) {
                                v += 4;
                                if(arr_b[v7] > -65) {
                                    return -1;
                                }
                                continue;
                            }
                        }
                    }
                    return -1;
                }
                v = v2;
            }
        }
    }

    static class d extends IllegalArgumentException {
        d(int v, int v1) {
            super("Unpaired surrogate at index " + v + " of " + v1);
        }
    }

    static final class e extends b {
        @Override  // androidx.datastore.preferences.protobuf.q0$b
        String a(byte[] arr_b, int v, int v1) {
            if((v | v1 | arr_b.length - v - v1) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", ((int)arr_b.length), v, v1));
            }
            int v2 = v + v1;
            char[] arr_c = new char[v1];
            int v3;
            for(v3 = 0; v < v2; ++v3) {
                int v4 = p0.s(arr_b, ((long)v));
                if(!a.n(((byte)v4))) {
                    break;
                }
                ++v;
                a.i(((byte)v4), arr_c, v3);
            }
            int v5 = v3;
            while(v < v2) {
                int v6 = v + 1;
                int v7 = p0.s(arr_b, ((long)v));
                if(a.n(((byte)v7))) {
                    int v8 = v5 + 1;
                    a.i(((byte)v7), arr_c, v5);
                    while(v6 < v2) {
                        int v9 = p0.s(arr_b, ((long)v6));
                        if(!a.n(((byte)v9))) {
                            break;
                        }
                        ++v6;
                        a.i(((byte)v9), arr_c, v8);
                        ++v8;
                    }
                    v5 = v8;
                    v = v6;
                    continue;
                }
                if(a.p(((byte)v7))) {
                    if(v6 < v2) {
                        v += 2;
                        a.k(((byte)v7), p0.s(arr_b, ((long)v6)), arr_c, v5);
                        ++v5;
                        continue;
                    }
                }
                else if(!a.o(((byte)v7))) {
                    if(v6 < v2 - 2) {
                        int v11 = p0.s(arr_b, ((long)v6));
                        int v12 = v + 3;
                        int v13 = p0.s(arr_b, ((long)(v + 2)));
                        v += 4;
                        a.h(((byte)v7), ((byte)v11), ((byte)v13), p0.s(arr_b, ((long)v12)), arr_c, v5);
                        v5 += 2;
                        continue;
                    }
                }
                else if(v6 < v2 - 1) {
                    int v10 = v + 2;
                    v += 3;
                    a.j(((byte)v7), p0.s(arr_b, ((long)v6)), p0.s(arr_b, ((long)v10)), arr_c, v5);
                    ++v5;
                    continue;
                }
                throw z.c();
            }
            return new String(arr_c, 0, v5);
        }

        @Override  // androidx.datastore.preferences.protobuf.q0$b
        int b(CharSequence charSequence0, byte[] arr_b, int v, int v1) {
            long v2 = (long)v;
            long v3 = ((long)v1) + v2;
            int v4 = charSequence0.length();
            if(v4 > v1 || arr_b.length - v1 < v) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v4 - 1) + " at index " + (v + v1));
            }
            int v5 = 0;
            while(v5 < v4) {
                int v6 = charSequence0.charAt(v5);
                if(v6 >= 0x80) {
                    break;
                }
                p0.H(arr_b, v2, ((byte)v6));
                ++v5;
                ++v2;
            }
            if(v5 == v4) {
                return (int)v2;
            }
            while(v5 < v4) {
                int v7 = charSequence0.charAt(v5);
                if(v7 < 0x80 && v2 < v3) {
                    p0.H(arr_b, v2, ((byte)v7));
                    ++v2;
                }
                else if(v7 < 0x800 && v2 <= v3 - 2L) {
                    long v8 = v2 + 1L;
                    p0.H(arr_b, v2, ((byte)(v7 >>> 6 | 960)));
                    v2 += 2L;
                    p0.H(arr_b, v8, ((byte)(v7 & 0x3F | 0x80)));
                }
                else if(v7 >= 0xD800 && 0xDFFF >= v7 || v2 > v3 - 3L) {
                    if(v2 > v3 - 4L) {
                        goto label_49;
                    }
                    if(v5 + 1 == v4) {
                        throw new d(v5 - 1, v4);
                    }
                    int v10 = charSequence0.charAt(v5 + 1);
                    if(!Character.isSurrogatePair(((char)v7), ((char)v10))) {
                        goto label_47;
                    }
                    int v11 = Character.toCodePoint(((char)v7), ((char)v10));
                    p0.H(arr_b, v2, ((byte)(v11 >>> 18 | 0xF0)));
                    p0.H(arr_b, v2 + 1L, ((byte)(v11 >>> 12 & 0x3F | 0x80)));
                    long v12 = v2 + 3L;
                    p0.H(arr_b, v2 + 2L, ((byte)(v11 >>> 6 & 0x3F | 0x80)));
                    v2 += 4L;
                    p0.H(arr_b, v12, ((byte)(v11 & 0x3F | 0x80)));
                    ++v5;
                }
                else {
                    p0.H(arr_b, v2, ((byte)(v7 >>> 12 | 480)));
                    long v9 = v2 + 2L;
                    p0.H(arr_b, v2 + 1L, ((byte)(v7 >>> 6 & 0x3F | 0x80)));
                    v2 += 3L;
                    p0.H(arr_b, v9, ((byte)(v7 & 0x3F | 0x80)));
                }
                ++v5;
                continue;
            label_47:
                ++v5;
                throw new d(v5 - 1, v4);
            label_49:
                if(0xD800 > v7 || v7 > 0xDFFF || v5 + 1 != v4 && Character.isSurrogatePair(((char)v7), charSequence0.charAt(v5 + 1))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v7) + " at index " + v2);
                }
                throw new d(v5, v4);
            }
            return (int)v2;
        }

        @Override  // androidx.datastore.preferences.protobuf.q0$b
        int d(int v, byte[] arr_b, int v1, int v2) {
            long v6;
            int v3 = 0;
            if((v1 | v2 | arr_b.length - v2) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", ((int)arr_b.length), v1, v2));
            }
            long v4 = (long)v1;
            if(v != 0) {
                if(v4 >= ((long)v2)) {
                    return v;
                }
                if(((byte)v) < 0xFFFFFFE0) {
                    return ((byte)v) < -62 || p0.s(arr_b, v4) > -65 ? -1 : e.f(arr_b, v4 + 1L, ((int)(((long)v2) - (v4 + 1L))));
                }
                if(((byte)v) < -16) {
                    int v5 = (byte)(~(v >> 8));
                    if(v5 == 0) {
                        v5 = p0.s(arr_b, v4);
                        if(v4 + 1L >= ((long)v2)) {
                            return q0.j(((byte)v), v5);
                        }
                        ++v4;
                    }
                    if(v5 <= -65 && (((byte)v) != 0xFFFFFFE0 || v5 >= 0xFFFFFFA0) && (((byte)v) != -19 || v5 < 0xFFFFFFA0)) {
                        v6 = v4 + 1L;
                        return p0.s(arr_b, v4) > -65 ? -1 : e.f(arr_b, v6, ((int)(((long)v2) - v6)));
                    }
                    return -1;
                }
                int v7 = (byte)(~(v >> 8));
                if(v7 == 0) {
                    v7 = p0.s(arr_b, v4);
                    if(v4 + 1L >= ((long)v2)) {
                        return q0.j(((byte)v), v7);
                    }
                    ++v4;
                }
                else {
                    v3 = (byte)(v >> 16);
                }
                if(v3 == 0) {
                    v3 = p0.s(arr_b, v4);
                    if(v4 + 1L >= ((long)v2)) {
                        return q0.k(((byte)v), v7, v3);
                    }
                    ++v4;
                }
                if(v7 <= -65 && (((byte)v) << 28) + (v7 + 0x70) >> 30 == 0 && v3 <= -65) {
                    v6 = v4 + 1L;
                    return p0.s(arr_b, v4) <= -65 ? e.f(arr_b, v6, ((int)(((long)v2) - v6))) : -1;
                }
                return -1;
            }
            return e.f(arr_b, v4, ((int)(((long)v2) - v4)));
        }

        // 去混淆评级： 中等(60)
        static boolean e() [...] // 潜在的解密器

        private static int f(byte[] arr_b, long v, int v1) {
            int v5;
            int v2 = e.g(arr_b, v, v1);
            int v3 = v1 - v2;
            long v4 = v + ((long)v2);
            while(true) {
                while(true) {
                label_3:
                    v5 = 0;
                    while(v3 > 0) {
                        v5 = p0.s(arr_b, v4);
                        if(v5 >= 0) {
                            --v3;
                            ++v4;
                        }
                        else {
                            ++v4;
                            if(true) {
                                break;
                            }
                        }
                    }
                    if(v3 == 0) {
                        return 0;
                    }
                    if(v5 < 0xFFFFFFE0) {
                        if(v3 - 1 == 0) {
                            return v5;
                        }
                        v3 -= 2;
                        if(v5 >= -62 && p0.s(arr_b, v4) <= -65) {
                            ++v4;
                            continue;
                        }
                        return -1;
                    }
                    if(v5 < -16) {
                        if(v3 - 1 < 2) {
                            return e.h(arr_b, v5, v4, v3 - 1);
                        }
                        v3 -= 3;
                        long v6 = v4 + 1L;
                        int v7 = p0.s(arr_b, v4);
                        if(v7 <= -65 && (v5 != 0xFFFFFFE0 || v7 >= 0xFFFFFFA0) && (v5 != -19 || v7 < 0xFFFFFFA0)) {
                            v4 += 2L;
                            if(p0.s(arr_b, v6) <= -65) {
                                continue;
                            }
                        }
                        return -1;
                    }
                    break;
                }
                if(v3 - 1 < 3) {
                    return e.h(arr_b, v5, v4, v3 - 1);
                }
                v3 -= 4;
                int v8 = p0.s(arr_b, v4);
                if(v8 > -65 || (v5 << 28) + (v8 + 0x70) >> 30 != 0) {
                    break;
                }
                long v9 = v4 + 2L;
                if(p0.s(arr_b, v4 + 1L) > -65) {
                    break;
                }
                v4 += 3L;
                if(p0.s(arr_b, v9) <= -65) {
                    goto label_3;
                }
                break;
            }
            return -1;
        }

        private static int g(byte[] arr_b, long v, int v1) {
            int v2 = 0;
            if(v1 < 16) {
                return 0;
            }
            while(v2 < v1) {
                if(p0.s(arr_b, v) < 0) {
                    return v2;
                }
                ++v2;
                ++v;
            }
            return v1;
        }

        private static int h(byte[] arr_b, int v, long v1, int v2) {
            switch(v2) {
                case 0: {
                    return q0.i(v);
                }
                case 1: {
                    return q0.j(v, p0.s(arr_b, v1));
                }
                case 2: {
                    return q0.k(v, p0.s(arr_b, v1), p0.s(arr_b, v1 + 1L));
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
    }

    private static final b a;

    // 去混淆评级： 低(30)
    static {
        q0.a = new e();
    }

    static String e(byte[] arr_b, int v, int v1) {
        return q0.a.a(arr_b, v, v1);
    }

    static int f(CharSequence charSequence0, byte[] arr_b, int v, int v1) {
        return q0.a.b(charSequence0, arr_b, v, v1);
    }

    static int g(CharSequence charSequence0) {
        int v = charSequence0.length();
        int v1;
        for(v1 = 0; v1 < v && charSequence0.charAt(v1) < 0x80; ++v1) {
        }
        int v2 = v;
        while(v1 < v) {
            int v3 = charSequence0.charAt(v1);
            if(v3 < 0x800) {
                v2 += 0x7F - v3 >>> 0x1F;
                ++v1;
            }
            else {
                v2 += q0.h(charSequence0, v1);
                if(true) {
                    break;
                }
            }
        }
        if(v2 < v) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long)v2) + 0x100000000L));
        }
        return v2;
    }

    private static int h(CharSequence charSequence0, int v) {
        int v1 = charSequence0.length();
        int v2 = 0;
        while(v < v1) {
            int v3 = charSequence0.charAt(v);
            if(v3 < 0x800) {
                v2 += 0x7F - v3 >>> 0x1F;
            }
            else {
                v2 += 2;
                if(0xD800 <= v3 && v3 <= 0xDFFF) {
                    if(Character.codePointAt(charSequence0, v) < 0x10000) {
                        throw new d(v, v1);
                    }
                    ++v;
                }
            }
            ++v;
        }
        return v2;
    }

    private static int i(int v) {
        return v <= -12 ? v : -1;
    }

    private static int j(int v, int v1) {
        return v > -12 || v1 > -65 ? -1 : v ^ v1 << 8;
    }

    private static int k(int v, int v1, int v2) {
        return v > -12 || v1 > -65 || v2 > -65 ? -1 : v ^ v1 << 8 ^ v2 << 16;
    }

    private static int l(byte[] arr_b, int v, int v1) {
        int v2 = arr_b[v - 1];
        switch(v1 - v) {
            case 0: {
                return q0.i(v2);
            }
            case 1: {
                return q0.j(v2, arr_b[v]);
            }
            case 2: {
                return q0.k(v2, arr_b[v], arr_b[v + 1]);
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    public static boolean m(byte[] arr_b) {
        return q0.a.c(arr_b, 0, arr_b.length);
    }

    public static boolean n(byte[] arr_b, int v, int v1) {
        return q0.a.c(arr_b, v, v1);
    }
}

