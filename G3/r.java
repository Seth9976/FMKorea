package G3;

import z3.k;

abstract class r extends q {
    public static Long j(String s) {
        k.e(s, "<this>");
        return r.k(s, 10);
    }

    public static final Long k(String s, int v) {
        k.e(s, "<this>");
        a.a(v);
        int v1 = s.length();
        if(v1 == 0) {
            return null;
        }
        boolean z = true;
        int v2 = 0;
        int v3 = s.charAt(0);
        long v4 = 0x8000000000000001L;
        if(k.f(v3, 0x30) < 0) {
            if(v1 == 1) {
                return null;
            }
            switch(v3) {
                case 43: {
                    z = false;
                    v2 = 1;
                    break;
                }
                case 45: {
                    v4 = 0x8000000000000000L;
                    v2 = 1;
                    break;
                }
                default: {
                    return null;
                }
            }
        }
        else {
            z = false;
        }
        long v5 = 0L;
        long v6 = -256204778801521550L;
        while(v2 < v1) {
            int v7 = b.b(s.charAt(v2), v);
            if(v7 < 0) {
                return null;
            }
            if(v5 < v6) {
                if(v6 == -256204778801521550L) {
                    v6 = v4 / ((long)v);
                    if(v5 < v6) {
                        return null;
                    }
                    goto label_32;
                }
                return null;
            }
        label_32:
            long v8 = v5 * ((long)v);
            if(v8 < v4 + ((long)v7)) {
                return null;
            }
            v5 = v8 - ((long)v7);
            ++v2;
        }
        return z ? v5 : ((long)(-v5));
    }
}

