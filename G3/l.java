package G3;

import java.util.ArrayList;
import java.util.List;
import m3.o;
import z3.k;

abstract class l extends i {
    private static final y3.l d(String s) {
        return s.length() == 0 ? (String s) -> {
            k.e(s, "line");
            return s;
        } : (String s1) -> {
            k.e(s1, "line");
            return s + s1;
        };
    }

    // 检测为 Lambda 实现
    private static final String e(String s) [...]

    // 检测为 Lambda 实现
    private static final String f(String s, String s1) [...]

    private static final int g(String s) {
        int v = s.length();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(!b.c(s.charAt(v1))) {
                break;
            }
        }
        return v1 == -1 ? s.length() : v1;
    }

    public static final String h(String s, String s1) {
        k.e(s, "<this>");
        k.e(s1, "newIndent");
        List list0 = u.O(s);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(!h.H(((String)object0))) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(o.n(arrayList0, 10));
        for(Object object1: arrayList0) {
            arrayList1.add(l.g(((String)object1)));
        }
        Integer integer0 = (Integer)o.y(arrayList1);
        int v = 0;
        int v1 = integer0 == null ? 0 : ((int)integer0);
        int v2 = s.length();
        int v3 = s1.length();
        int v4 = list0.size();
        y3.l l0 = l.d(s1);
        int v5 = o.j(list0);
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: list0) {
            if(v < 0) {
                o.m();
            }
            String s2 = (String)object2;
            if(v != 0 && v != v5 || !h.H(s2)) {
                String s3 = w.h0(s2, v1);
                if(s3 != null) {
                    String s4 = (String)l0.h(s3);
                    if(s4 != null) {
                        s2 = s4;
                    }
                }
            }
            else {
                s2 = null;
            }
            if(s2 != null) {
                arrayList2.add(s2);
            }
            ++v;
        }
        return ((StringBuilder)o.u(arrayList2, new StringBuilder(v2 + v3 * v4), "\n", null, null, 0, null, null, 0x7C, null)).toString();
    }

    public static String i(String s) {
        k.e(s, "<this>");
        return l.h(s, "");
    }
}

