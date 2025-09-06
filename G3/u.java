package G3;

import D3.a;
import D3.c;
import D3.d;
import F3.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l3.m;
import l3.r;
import m3.i;
import m3.o;
import z3.k;

abstract class u extends s {
    public static final int A(CharSequence charSequence0, char c, int v, boolean z) {
        k.e(charSequence0, "<this>");
        return z || !(charSequence0 instanceof String) ? u.G(charSequence0, new char[]{c}, v, z) : ((String)charSequence0).indexOf(((int)c), v);
    }

    public static final int B(CharSequence charSequence0, String s, int v, boolean z) {
        k.e(charSequence0, "<this>");
        k.e(s, "string");
        return z || !(charSequence0 instanceof String) ? u.D(charSequence0, s, v, charSequence0.length(), z, false, 16, null) : ((String)charSequence0).indexOf(s, v);
    }

    private static final int C(CharSequence charSequence0, CharSequence charSequence1, int v, int v1, boolean z, boolean z1) {
        a a0 = z1 ? d.f(d.b(v, u.z(charSequence0)), d.a(v1, 0)) : new c(d.a(v, 0), d.b(v1, charSequence0.length()));
        if(!(charSequence0 instanceof String) || !(charSequence1 instanceof String)) {
            int v5 = a0.a();
            int v6 = a0.c();
            int v7 = a0.d();
            if(v7 > 0 && v5 <= v6 || v7 < 0 && v6 <= v5) {
                while(true) {
                    if(u.U(charSequence1, 0, charSequence0, v5, charSequence1.length(), z)) {
                        return v5;
                    }
                    if(v5 == v6) {
                        break;
                    }
                    v5 += v7;
                }
            }
        }
        else {
            int v2 = a0.a();
            int v3 = a0.c();
            int v4 = a0.d();
            if(v4 > 0 && v2 <= v3 || v4 < 0 && v3 <= v2) {
                while(true) {
                    if(s.o(((String)charSequence1), 0, ((String)charSequence0), v2, ((String)charSequence1).length(), z)) {
                        return v2;
                    }
                    if(v2 == v3) {
                        break;
                    }
                    v2 += v4;
                }
            }
        }
        return -1;
    }

    static int D(CharSequence charSequence0, CharSequence charSequence1, int v, int v1, boolean z, boolean z1, int v2, Object object0) {
        if((v2 & 16) != 0) {
            z1 = false;
        }
        return u.C(charSequence0, charSequence1, v, v1, z, z1);
    }

    public static int E(CharSequence charSequence0, char c, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return u.A(charSequence0, c, v, z);
    }

    public static int F(CharSequence charSequence0, String s, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return u.B(charSequence0, s, v, z);
    }

    public static final int G(CharSequence charSequence0, char[] arr_c, int v, boolean z) {
        k.e(charSequence0, "<this>");
        k.e(arr_c, "chars");
        if(!z && arr_c.length == 1 && charSequence0 instanceof String) {
            return ((String)charSequence0).indexOf(i.t(arr_c), v);
        }
        int v1 = d.a(v, 0);
        int v2 = u.z(charSequence0);
        if(v1 <= v2) {
            while(true) {
                int v3 = charSequence0.charAt(v1);
                for(int v4 = 0; v4 < arr_c.length; ++v4) {
                    if(G3.c.d(arr_c[v4], ((char)v3), z)) {
                        return v1;
                    }
                }
                if(v1 == v2) {
                    break;
                }
                ++v1;
            }
        }
        return -1;
    }

    public static boolean H(CharSequence charSequence0) {
        k.e(charSequence0, "<this>");
        int v = 0;
        while(v < charSequence0.length()) {
            if(b.c(charSequence0.charAt(v))) {
                ++v;
                continue;
            }
            return false;
        }
        return true;
    }

    public static final int I(CharSequence charSequence0, char c, int v, boolean z) {
        k.e(charSequence0, "<this>");
        return z || !(charSequence0 instanceof String) ? u.M(charSequence0, new char[]{c}, v, z) : ((String)charSequence0).lastIndexOf(((int)c), v);
    }

    public static final int J(CharSequence charSequence0, String s, int v, boolean z) {
        k.e(charSequence0, "<this>");
        k.e(s, "string");
        return z || !(charSequence0 instanceof String) ? u.C(charSequence0, s, v, 0, z, true) : ((String)charSequence0).lastIndexOf(s, v);
    }

    public static int K(CharSequence charSequence0, char c, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = u.z(charSequence0);
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return u.I(charSequence0, c, v, z);
    }

    public static int L(CharSequence charSequence0, String s, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = u.z(charSequence0);
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return u.J(charSequence0, s, v, z);
    }

    public static final int M(CharSequence charSequence0, char[] arr_c, int v, boolean z) {
        k.e(charSequence0, "<this>");
        k.e(arr_c, "chars");
        if(!z && arr_c.length == 1 && charSequence0 instanceof String) {
            return ((String)charSequence0).lastIndexOf(i.t(arr_c), v);
        }
        for(int v1 = d.b(v, u.z(charSequence0)); -1 < v1; --v1) {
            int v2 = charSequence0.charAt(v1);
            for(int v3 = 0; v3 < arr_c.length; ++v3) {
                if(G3.c.d(arr_c[v3], ((char)v2), z)) {
                    return v1;
                }
            }
        }
        return -1;
    }

    public static final e N(CharSequence charSequence0) {
        public static final class G3.u.a implements e {
            final CharSequence a;

            public G3.u.a(CharSequence charSequence0) {
                this.a = charSequence0;
                super();
            }

            @Override  // F3.e
            public Iterator iterator() {
                return new f(this.a);
            }
        }

        k.e(charSequence0, "<this>");
        return new G3.u.a(charSequence0);
    }

    public static final List O(CharSequence charSequence0) {
        k.e(charSequence0, "<this>");
        return F3.f.q(u.N(charSequence0));
    }

    public static final CharSequence P(CharSequence charSequence0, int v, char c) {
        k.e(charSequence0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException("Desired length " + v + " is less than zero.");
        }
        if(v <= charSequence0.length()) {
            return charSequence0.subSequence(0, charSequence0.length());
        }
        CharSequence charSequence1 = new StringBuilder(v);
        int v1 = v - charSequence0.length();
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                ((StringBuilder)charSequence1).append(c);
                if(v2 == v1) {
                    break;
                }
            }
        }
        ((StringBuilder)charSequence1).append(charSequence0);
        return charSequence1;
    }

    public static String Q(String s, int v, char c) {
        k.e(s, "<this>");
        return u.P(s, v, c).toString();
    }

    private static final e R(CharSequence charSequence0, String[] arr_s, int v, boolean z, int v1) {
        u.V(v1);
        return new G3.e(charSequence0, v, v1, (CharSequence charSequence0, int v) -> {
            k.e(charSequence0, "$this$DelimitedRangesSequence");
            m m0 = u.y(charSequence0, i.c(arr_s), v, z, false);
            return m0 == null ? null : r.a(m0.c(), ((String)m0.d()).length());
        });
    }

    static e S(CharSequence charSequence0, String[] arr_s, int v, boolean z, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            z = false;
        }
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        return u.R(charSequence0, arr_s, v, z, v1);
    }

    // 检测为 Lambda 实现
    private static final m T(List list0, boolean z, CharSequence charSequence0, int v) [...]

    public static final boolean U(CharSequence charSequence0, int v, CharSequence charSequence1, int v1, int v2, boolean z) {
        k.e(charSequence0, "<this>");
        k.e(charSequence1, "other");
        if(v1 >= 0 && v >= 0 && v <= charSequence0.length() - v2 && v1 <= charSequence1.length() - v2) {
            for(int v3 = 0; v3 < v2; ++v3) {
                if(!G3.c.d(charSequence0.charAt(v + v3), charSequence1.charAt(v1 + v3), z)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final void V(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + v).toString());
        }
    }

    public static final List W(CharSequence charSequence0, String[] arr_s, boolean z, int v) {
        k.e(charSequence0, "<this>");
        k.e(arr_s, "delimiters");
        if(arr_s.length == 1) {
            String s = arr_s[0];
            if(s.length() != 0) {
                return u.X(charSequence0, s, z, v);
            }
        }
        Iterable iterable0 = F3.f.k(u.S(charSequence0, arr_s, 0, z, v, 2, null));
        List list0 = new ArrayList(o.n(iterable0, 10));
        for(Object object0: iterable0) {
            list0.add(u.Z(charSequence0, ((c)object0)));
        }
        return list0;
    }

    private static final List X(CharSequence charSequence0, String s, boolean z, int v) {
        u.V(v);
        int v1 = 0;
        int v2 = u.B(charSequence0, s, 0, z);
        if(v2 != -1 && v != 1) {
            List list0 = new ArrayList((v <= 0 ? d.b(v, 10) : 10));
            do {
                ((ArrayList)list0).add(charSequence0.subSequence(v1, v2).toString());
                v1 = s.length() + v2;
                if(v > 0 && ((ArrayList)list0).size() == v - 1) {
                    break;
                }
                v2 = u.B(charSequence0, s, v1, z);
            }
            while(v2 != -1);
            ((ArrayList)list0).add(charSequence0.subSequence(v1, charSequence0.length()).toString());
            return list0;
        }
        return o.e(charSequence0.toString());
    }

    public static List Y(CharSequence charSequence0, String[] arr_s, boolean z, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return u.W(charSequence0, arr_s, z, v);
    }

    public static final String Z(CharSequence charSequence0, c c0) {
        k.e(charSequence0, "<this>");
        k.e(c0, "range");
        return charSequence0.subSequence(((int)c0.k()), ((int)c0.i()) + 1).toString();
    }

    public static final String a0(String s, char c, String s1) {
        k.e(s, "<this>");
        k.e(s1, "missingDelimiterValue");
        int v = u.E(s, c, 0, false, 6, null);
        if(v != -1) {
            s1 = s.substring(v + 1, s.length());
            k.d(s1, "substring(...)");
        }
        return s1;
    }

    public static final String b0(String s, String s1, String s2) {
        k.e(s, "<this>");
        k.e(s1, "delimiter");
        k.e(s2, "missingDelimiterValue");
        int v = h.F(s, s1, 0, false, 6, null);
        if(v != -1) {
            s2 = s.substring(v + s1.length(), s.length());
            k.d(s2, "substring(...)");
        }
        return s2;
    }

    public static String c0(String s, char c, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = s;
        }
        return u.a0(s, c, s1);
    }

    public static String d0(String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s2 = s;
        }
        return u.b0(s, s1, s2);
    }

    public static String e0(String s, char c, String s1) {
        k.e(s, "<this>");
        k.e(s1, "missingDelimiterValue");
        int v = u.K(s, c, 0, false, 6, null);
        if(v != -1) {
            s1 = s.substring(v + 1, s.length());
            k.d(s1, "substring(...)");
        }
        return s1;
    }

    public static String f0(String s, char c, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = s;
        }
        return h.e0(s, c, s1);
    }

    public static CharSequence g0(CharSequence charSequence0) {
        k.e(charSequence0, "<this>");
        int v = charSequence0.length() - 1;
        int v1 = 0;
        boolean z = false;
        while(v1 <= v) {
            boolean z1 = b.c(charSequence0.charAt((z ? v : v1)));
            if(z) {
                if(!z1) {
                    break;
                }
                --v;
            }
            else if(z1) {
                ++v1;
            }
            else {
                z = true;
            }
        }
        return charSequence0.subSequence(v1, v + 1);
    }

    public static final boolean w(CharSequence charSequence0, CharSequence charSequence1, boolean z) {
        k.e(charSequence0, "<this>");
        k.e(charSequence1, "other");
        return charSequence1 instanceof String ? h.F(charSequence0, ((String)charSequence1), 0, z, 2, null) >= 0 : u.D(charSequence0, charSequence1, 0, charSequence0.length(), z, false, 16, null) >= 0;
    }

    public static boolean x(CharSequence charSequence0, CharSequence charSequence1, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return u.w(charSequence0, charSequence1, z);
    }

    private static final m y(CharSequence charSequence0, Collection collection0, int v, boolean z, boolean z1) {
        if(!z && collection0.size() == 1) {
            String s = (String)o.z(collection0);
            int v1 = z1 ? h.L(charSequence0, s, v, false, 4, null) : h.F(charSequence0, s, v, false, 4, null);
            return v1 < 0 ? null : r.a(v1, s);
        }
        a a0 = z1 ? d.f(d.b(v, u.z(charSequence0)), 0) : new c(d.a(v, 0), charSequence0.length());
        if(charSequence0 instanceof String) {
            int v2 = a0.a();
            int v3 = a0.c();
            int v4 = a0.d();
            if(v4 > 0 && v2 <= v3 || v4 < 0 && v3 <= v2) {
                while(true) {
                    for(Object object0: collection0) {
                        if(!s.o(((String)object0), 0, ((String)charSequence0), v2, ((String)object0).length(), z)) {
                            continue;
                        }
                        goto label_19;
                    }
                    object0 = null;
                label_19:
                    if(((String)object0) != null) {
                        return r.a(v2, ((String)object0));
                    }
                    if(v2 == v3) {
                        break;
                    }
                    v2 += v4;
                }
            }
        }
        else {
            int v5 = a0.a();
            int v6 = a0.c();
            int v7 = a0.d();
            if(v7 > 0 && v5 <= v6 || v7 < 0 && v6 <= v5) {
                while(true) {
                    for(Object object1: collection0) {
                        if(!u.U(((String)object1), 0, charSequence0, v5, ((String)object1).length(), z)) {
                            continue;
                        }
                        goto label_34;
                    }
                    object1 = null;
                label_34:
                    if(((String)object1) != null) {
                        return r.a(v5, ((String)object1));
                    }
                    if(v5 == v6) {
                        break;
                    }
                    v5 += v7;
                }
            }
        }
        return null;
    }

    public static final int z(CharSequence charSequence0) {
        k.e(charSequence0, "<this>");
        return charSequence0.length() - 1;
    }
}

