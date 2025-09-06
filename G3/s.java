package G3;

import D3.d;
import z3.k;

abstract class s extends r {
    public static final boolean l(String s, String s1, boolean z) {
        k.e(s, "<this>");
        k.e(s1, "suffix");
        return z ? s.o(s, s.length() - s1.length(), s1, 0, s1.length(), true) : s.endsWith(s1);
    }

    public static boolean m(String s, String s1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return s.l(s, s1, z);
    }

    public static boolean n(String s, String s1, boolean z) {
        if(s == null) {
            return s1 == null;
        }
        return z ? s.equalsIgnoreCase(s1) : s.equals(s1);
    }

    public static final boolean o(String s, int v, String s1, int v1, int v2, boolean z) {
        k.e(s, "<this>");
        k.e(s1, "other");
        return z ? s.regionMatches(true, v, s1, v1, v2) : s.regionMatches(v, s1, v1, v2);
    }

    public static final String p(String s, char c, char c1, boolean z) {
        k.e(s, "<this>");
        if(!z) {
            String s1 = s.replace(c, c1);
            k.d(s1, "replace(...)");
            return s1;
        }
        StringBuilder stringBuilder0 = new StringBuilder(s.length());
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(c.d(((char)v1), c, true)) {
                v1 = c1;
            }
            stringBuilder0.append(((char)v1));
        }
        return stringBuilder0.toString();
    }

    public static final String q(String s, String s1, String s2, boolean z) {
        k.e(s, "<this>");
        k.e(s1, "oldValue");
        k.e(s2, "newValue");
        int v = 0;
        int v1 = u.B(s, s1, 0, z);
        if(v1 < 0) {
            return s;
        }
        int v2 = s1.length();
        int v3 = d.a(v2, 1);
        int v4 = s.length() - v2 + s2.length();
        if(v4 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder stringBuilder0 = new StringBuilder(v4);
        do {
            stringBuilder0.append(s, v, v1);
            stringBuilder0.append(s2);
            v = v1 + v2;
            if(v1 >= s.length()) {
                break;
            }
            v1 = u.B(s, s1, v1 + v3, z);
        }
        while(v1 > 0);
        stringBuilder0.append(s, v, s.length());
        String s3 = stringBuilder0.toString();
        k.d(s3, "toString(...)");
        return s3;
    }

    public static String r(String s, char c, char c1, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        return s.p(s, c, c1, z);
    }

    public static String s(String s, String s1, String s2, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        return s.q(s, s1, s2, z);
    }

    public static final boolean t(String s, String s1, boolean z) {
        k.e(s, "<this>");
        k.e(s1, "prefix");
        return z ? s.o(s, 0, s1, 0, s1.length(), true) : s.startsWith(s1);
    }

    public static boolean u(String s, String s1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return s.t(s, s1, z);
    }
}

