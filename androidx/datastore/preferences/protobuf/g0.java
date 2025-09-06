package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

abstract class g0 {
    private static final Class a;
    private static final l0 b;
    private static final l0 c;
    private static final l0 d;

    static {
        g0.a = g0.A();
        g0.b = g0.B(false);
        g0.c = g0.B(true);
        g0.d = new n0();
    }

    private static Class A() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static l0 B(boolean z) {
        try {
            Class class0 = g0.C();
            return class0 == null ? null : ((l0)class0.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z)));
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static Class C() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static void D(p p0, Object object0, Object object1) {
        s s0 = p0.c(object1);
        if(!s0.j()) {
            p0.d(object0).p(s0);
        }
    }

    static void E(J j0, Object object0, Object object1, long v) {
        p0.O(object0, v, j0.a(p0.A(object0, v), p0.A(object1, v)));
    }

    static void F(l0 l00, Object object0, Object object1) {
        l00.p(object0, l00.k(l00.g(object0), l00.g(object1)));
    }

    public static l0 G() {
        return g0.b;
    }

    public static l0 H() {
        return g0.c;
    }

    public static void I(Class class0) {
        if(!w.class.isAssignableFrom(class0) && (g0.a != null && !g0.a.isAssignableFrom(class0))) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    // 去混淆评级： 低(20)
    static boolean J(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    static Object K(int v, int v1, Object object0, l0 l00) {
        if(object0 == null) {
            object0 = l00.n();
        }
        l00.e(object0, v, ((long)v1));
        return object0;
    }

    public static l0 L() {
        return g0.d;
    }

    public static void M(int v, List list0, s0 s00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            s00.A(v, list0, z);
        }
    }

    public static void N(int v, List list0, s0 s00) {
        if(list0 != null && !list0.isEmpty()) {
            s00.N(v, list0);
        }
    }

    public static void O(int v, List list0, s0 s00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            s00.K(v, list0, z);
        }
    }

    public static void P(int v, List list0, s0 s00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            s00.J(v, list0, z);
        }
    }

    public static void Q(int v, List list0, s0 s00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            s00.y(v, list0, z);
        }
    }

    public static void R(int v, List list0, s0 s00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            s00.u(v, list0, z);
        }
    }

    public static void S(int v, List list0, s0 s00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            s00.a(v, list0, z);
        }
    }

    public static void T(int v, List list0, s0 s00, e0 e00) {
        if(list0 != null && !list0.isEmpty()) {
            s00.l(v, list0, e00);
        }
    }

    public static void U(int v, List list0, s0 s00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            s00.o(v, list0, z);
        }
    }

    public static void V(int v, List list0, s0 s00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            s00.I(v, list0, z);
        }
    }

    public static void W(int v, List list0, s0 s00, e0 e00) {
        if(list0 != null && !list0.isEmpty()) {
            s00.j(v, list0, e00);
        }
    }

    public static void X(int v, List list0, s0 s00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            s00.v(v, list0, z);
        }
    }

    public static void Y(int v, List list0, s0 s00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            s00.f(v, list0, z);
        }
    }

    public static void Z(int v, List list0, s0 s00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            s00.G(v, list0, z);
        }
    }

    static int a(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        return z ? j.P(v) + j.y(v1) : v1 * j.c(v, true);
    }

    public static void a0(int v, List list0, s0 s00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            s00.C(v, list0, z);
        }
    }

    static int b(List list0) {
        return list0.size();
    }

    public static void b0(int v, List list0, s0 s00) {
        if(list0 != null && !list0.isEmpty()) {
            s00.k(v, list0);
        }
    }

    static int c(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = v1 * j.P(v);
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            v3 += j.g(((g)list0.get(v2)));
        }
        return v3;
    }

    public static void c0(int v, List list0, s0 s00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            s00.B(v, list0, z);
        }
    }

    static int d(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = g0.e(list0);
        return z ? j.P(v) + j.y(v2) : v2 + v1 * j.P(v);
    }

    public static void d0(int v, List list0, s0 s00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            s00.g(v, list0, z);
        }
    }

    static int e(List list0) {
        int v = list0.size();
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof x) {
            x x0 = (x)list0;
            if(v > 0) {
                throw null;
            }
            return 0;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += j.k(((int)(((Integer)list0.get(v1)))));
        }
        return v2;
    }

    static int f(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        return z ? j.P(v) + j.y(v1 * 4) : v1 * j.l(v, 0);
    }

    static int g(List list0) {
        return list0.size() * 4;
    }

    static int h(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        return z ? j.P(v) + j.y(v1 * 8) : v1 * j.n(v, 0L);
    }

    static int i(List list0) {
        return list0.size() * 8;
    }

    static int j(int v, List list0, e0 e00) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 += j.r(v, ((O)list0.get(v2)), e00);
        }
        return v3;
    }

    static int k(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = g0.l(list0);
        return z ? j.P(v) + j.y(v2) : v2 + v1 * j.P(v);
    }

    static int l(List list0) {
        int v = list0.size();
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof x) {
            x x0 = (x)list0;
            if(v > 0) {
                throw null;
            }
            return 0;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += j.v(((int)(((Integer)list0.get(v1)))));
        }
        return v2;
    }

    static int m(int v, List list0, boolean z) {
        if(list0.size() == 0) {
            return 0;
        }
        int v1 = g0.n(list0);
        return z ? j.P(v) + j.y(v1) : v1 + list0.size() * j.P(v);
    }

    static int n(List list0) {
        int v = list0.size();
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof F) {
            F f0 = (F)list0;
            if(v > 0) {
                throw null;
            }
            return 0;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += j.x(((long)(((Long)list0.get(v1)))));
        }
        return v2;
    }

    static int o(int v, Object object0, e0 e00) {
        return j.z(v, ((O)object0), e00);
    }

    static int p(int v, List list0, e0 e00) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = j.P(v) * v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 += j.B(((O)list0.get(v2)), e00);
        }
        return v3;
    }

    static int q(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = g0.r(list0);
        return z ? j.P(v) + j.y(v2) : v2 + v1 * j.P(v);
    }

    static int r(List list0) {
        int v = list0.size();
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof x) {
            x x0 = (x)list0;
            if(v > 0) {
                throw null;
            }
            return 0;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += j.K(((int)(((Integer)list0.get(v1)))));
        }
        return v2;
    }

    static int s(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = g0.t(list0);
        return z ? j.P(v) + j.y(v2) : v2 + v1 * j.P(v);
    }

    static int t(List list0) {
        int v = list0.size();
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof F) {
            F f0 = (F)list0;
            if(v > 0) {
                throw null;
            }
            return 0;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += j.M(((long)(((Long)list0.get(v1)))));
        }
        return v2;
    }

    static int u(int v, List list0) {
        int v1 = list0.size();
        int v2 = 0;
        if(v1 == 0) {
            return 0;
        }
        int v3 = j.P(v) * v1;
        if(list0 instanceof D) {
            while(v2 < v1) {
                Object object0 = ((D)list0).F(v2);
                v3 += (object0 instanceof g ? j.g(((g)object0)) : j.O(((String)object0)));
                ++v2;
            }
            return v3;
        }
        while(v2 < v1) {
            Object object1 = list0.get(v2);
            v3 += (object1 instanceof g ? j.g(((g)object1)) : j.O(((String)object1)));
            ++v2;
        }
        return v3;
    }

    static int v(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = g0.w(list0);
        return z ? j.P(v) + j.y(v2) : v2 + v1 * j.P(v);
    }

    static int w(List list0) {
        int v = list0.size();
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof x) {
            x x0 = (x)list0;
            if(v > 0) {
                throw null;
            }
            return 0;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += j.R(((int)(((Integer)list0.get(v1)))));
        }
        return v2;
    }

    static int x(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v2 = g0.y(list0);
        return z ? j.P(v) + j.y(v2) : v2 + v1 * j.P(v);
    }

    static int y(List list0) {
        int v = list0.size();
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof F) {
            F f0 = (F)list0;
            if(v > 0) {
                throw null;
            }
            return 0;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += j.T(((long)(((Long)list0.get(v1)))));
        }
        return v2;
    }

    static Object z(int v, List list0, a y$a0, Object object0, l0 l00) {
        if(y$a0 == null) {
            return object0;
        }
        if(list0 instanceof RandomAccess) {
            int v1 = list0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)list0.get(v2);
                int v4 = (int)integer0;
                if(y$a0.a(v4)) {
                    if(v2 != v3) {
                        list0.set(v3, integer0);
                    }
                    ++v3;
                }
                else {
                    object0 = g0.K(v, v4, object0, l00);
                }
            }
            if(v3 != v1) {
                list0.subList(v3, v1).clear();
                return object0;
            }
        }
        else {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                int v5 = (int)(((Integer)object1));
                if(!y$a0.a(v5)) {
                    object0 = g0.K(v, v5, object0, l00);
                    iterator0.remove();
                }
            }
        }
        return object0;
    }
}

