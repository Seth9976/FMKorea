package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

final class k implements s0 {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.o.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.n.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.l.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.v.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.x.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.t.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.m.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.j.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.w.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.y.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.k.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.p.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final j a;

    private k(j j0) {
        j j1 = (j)y.b(j0, "output");
        this.a = j1;
        j1.a = this;
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void A(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.a.N0(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += j.d(((Boolean)list0.get(v2)).booleanValue());
            }
            this.a.P0(v3);
            while(v1 < list0.size()) {
                boolean z1 = ((Boolean)list0.get(v1)).booleanValue();
                this.a.c0(z1);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            boolean z2 = ((Boolean)list0.get(v1)).booleanValue();
            this.a.b0(v, z2);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void B(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.a.N0(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += j.R(((int)(((Integer)list0.get(v2)))));
            }
            this.a.P0(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.a.P0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.a.O0(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void C(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.a.N0(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += j.M(((long)(((Long)list0.get(v2)))));
            }
            this.a.P0(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.a.K0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.a.J0(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void D(int v, long v1) {
        this.a.J0(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void E(int v, float f) {
        this.a.p0(v, f);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void F(int v) {
        this.a.N0(v, 4);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void G(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.a.N0(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += j.K(((int)(((Integer)list0.get(v2)))));
            }
            this.a.P0(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.a.I0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.a.H0(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void H(int v, int v1) {
        this.a.j0(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void I(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.a.N0(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += j.x(((long)(((Long)list0.get(v2)))));
            }
            this.a.P0(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.a.y0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.a.x0(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void J(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.a.N0(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += j.k(((int)(((Integer)list0.get(v2)))));
            }
            this.a.P0(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.a.k0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.a.j0(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void K(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.a.N0(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += j.i(((double)(((Double)list0.get(v2)))));
            }
            this.a.P0(v3);
            while(v1 < list0.size()) {
                double f = (double)(((Double)list0.get(v1)));
                this.a.i0(f);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            double f1 = (double)(((Double)list0.get(v1)));
            this.a.h0(v, f1);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void L(int v, androidx.datastore.preferences.protobuf.H.a h$a0, Map map0) {
        if(this.a.Y()) {
            this.T(v, h$a0, map0);
            return;
        }
        for(Object object0: map0.entrySet()) {
            this.a.N0(v, 2);
            int v1 = H.b(h$a0, ((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
            this.a.P0(v1);
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            H.e(this.a, h$a0, object1, object2);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void M(int v, int v1) {
        this.a.H0(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void N(int v, List list0) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            g g0 = (g)list0.get(v1);
            this.a.f0(v, g0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void O(int v, Object object0, e0 e00) {
        this.a.s0(v, ((O)object0), e00);
    }

    public static k P(j j0) {
        k k0 = j0.a;
        return k0 == null ? new k(j0) : k0;
    }

    private void Q(int v, boolean z, Object object0, androidx.datastore.preferences.protobuf.H.a h$a0) {
        this.a.N0(v, 2);
        int v1 = H.b(h$a0, Boolean.valueOf(z), object0);
        this.a.P0(v1);
        H.e(this.a, h$a0, Boolean.valueOf(z), object0);
    }

    private void R(int v, androidx.datastore.preferences.protobuf.H.a h$a0, Map map0) {
        int v1 = map0.size();
        int[] arr_v = new int[v1];
        int v3 = 0;
        for(Object object0: map0.keySet()) {
            arr_v[v3] = (int)(((Integer)object0));
            ++v3;
        }
        Arrays.sort(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            int v4 = arr_v[v2];
            Object object1 = map0.get(v4);
            this.a.N0(v, 2);
            int v5 = H.b(h$a0, v4, object1);
            this.a.P0(v5);
            H.e(this.a, h$a0, v4, object1);
        }
    }

    private void S(int v, androidx.datastore.preferences.protobuf.H.a h$a0, Map map0) {
        int v1 = map0.size();
        long[] arr_v = new long[v1];
        int v3 = 0;
        for(Object object0: map0.keySet()) {
            arr_v[v3] = (long)(((Long)object0));
            ++v3;
        }
        Arrays.sort(arr_v);
        for(int v2 = 0; v2 < v1; ++v2) {
            long v4 = arr_v[v2];
            Object object1 = map0.get(v4);
            this.a.N0(v, 2);
            int v5 = H.b(h$a0, v4, object1);
            this.a.P0(v5);
            H.e(this.a, h$a0, v4, object1);
        }
    }

    private void T(int v, androidx.datastore.preferences.protobuf.H.a h$a0, Map map0) {
        switch(h$a0.a) {
            case 1: {
                Object object0 = map0.get(Boolean.FALSE);
                if(object0 != null) {
                    this.Q(v, false, object0, h$a0);
                }
                Object object1 = map0.get(Boolean.TRUE);
                if(object1 != null) {
                    this.Q(v, true, object1, h$a0);
                }
                return;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                this.R(v, h$a0, map0);
                return;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                this.S(v, h$a0, map0);
                return;
            }
            case 12: {
                this.U(v, h$a0, map0);
                return;
            }
            default: {
                throw new IllegalArgumentException("does not support key type: " + h$a0.a);
            }
        }
    }

    private void U(int v, androidx.datastore.preferences.protobuf.H.a h$a0, Map map0) {
        int v1 = map0.size();
        String[] arr_s = new String[v1];
        int v3 = 0;
        for(Object object0: map0.keySet()) {
            arr_s[v3] = (String)object0;
            ++v3;
        }
        Arrays.sort(arr_s);
        for(int v2 = 0; v2 < v1; ++v2) {
            String s = arr_s[v2];
            Object object1 = map0.get(s);
            this.a.N0(v, 2);
            int v4 = H.b(h$a0, s, object1);
            this.a.P0(v4);
            H.e(this.a, h$a0, s, object1);
        }
    }

    private void V(int v, Object object0) {
        if(object0 instanceof String) {
            this.a.L0(v, ((String)object0));
            return;
        }
        this.a.f0(v, ((g)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void a(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.a.N0(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += j.q(((float)(((Float)list0.get(v2)))));
            }
            this.a.P0(v3);
            while(v1 < list0.size()) {
                float f = (float)(((Float)list0.get(v1)));
                this.a.q0(f);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            float f1 = (float)(((Float)list0.get(v1)));
            this.a.p0(v, f1);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void b(int v, int v1) {
        this.a.O0(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public final void c(int v, Object object0) {
        if(object0 instanceof g) {
            this.a.C0(v, ((g)object0));
            return;
        }
        this.a.B0(v, ((O)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void d(int v, int v1) {
        this.a.l0(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void e(int v, double f) {
        this.a.h0(v, f);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void f(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.a.N0(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += j.I(((long)(((Long)list0.get(v2)))));
            }
            this.a.P0(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.a.G0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.a.F0(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void g(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.a.N0(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += j.T(((long)(((Long)list0.get(v2)))));
            }
            this.a.P0(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.a.R0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.a.Q0(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void h(int v, long v1) {
        this.a.n0(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public androidx.datastore.preferences.protobuf.s0.a i() {
        return androidx.datastore.preferences.protobuf.s0.a.f;
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void j(int v, List list0, e0 e00) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.z(v, list0.get(v1), e00);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void k(int v, List list0) {
        int v1 = 0;
        if(list0 instanceof D) {
            while(v1 < list0.size()) {
                this.V(v, ((D)list0).F(v1));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            String s = (String)list0.get(v1);
            this.a.L0(v, s);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void l(int v, List list0, e0 e00) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.O(v, list0.get(v1), e00);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void m(int v, String s) {
        this.a.L0(v, s);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void n(int v, long v1) {
        this.a.Q0(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void o(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.a.N0(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += j.v(((int)(((Integer)list0.get(v2)))));
            }
            this.a.P0(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.a.w0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.a.v0(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void p(int v, long v1) {
        this.a.x0(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void q(int v, boolean z) {
        this.a.b0(v, z);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void r(int v, int v1) {
        this.a.D0(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void s(int v) {
        this.a.N0(v, 3);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void t(int v, int v1) {
        this.a.v0(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void u(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.a.N0(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += j.o(((long)(((Long)list0.get(v2)))));
            }
            this.a.P0(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.a.o0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.a.n0(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void v(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.a.N0(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += j.G(((int)(((Integer)list0.get(v2)))));
            }
            this.a.P0(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.a.E0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.a.D0(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void w(int v, g g0) {
        this.a.f0(v, g0);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void x(int v, long v1) {
        this.a.F0(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void y(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.a.N0(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += j.m(((int)(((Integer)list0.get(v2)))));
            }
            this.a.P0(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.a.m0(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.a.l0(v, v5);
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.s0
    public void z(int v, Object object0, e0 e00) {
        this.a.z0(v, ((O)object0), e00);
    }
}

