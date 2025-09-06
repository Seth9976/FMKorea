package androidx.datastore.preferences.protobuf;

import androidx.appcompat.app.E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class s {
    static abstract class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[b.values().length];
            a.b = arr_v;
            try {
                arr_v[b.h.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.i.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.j.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.k.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.l.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.m.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.n.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.o.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.q.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.r.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.p.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.s.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.t.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.v.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.w.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.x.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.y.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.u.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[c.values().length];
            a.a = arr_v1;
            try {
                arr_v1[c.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.k.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.l.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.m.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.n.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.o.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public interface androidx.datastore.preferences.protobuf.s.b extends Comparable {
        int a();

        boolean c();

        b d();

        boolean e();
    }

    private final h0 a;
    private boolean b;
    private boolean c;
    private static final s d;

    static {
        s.d = new s(true);
    }

    private s() {
        this.a = h0.r(16);
    }

    private s(h0 h00) {
        this.a = h00;
        this.o();
    }

    private s(boolean z) {
        this(h0.r(0));
        this.o();
    }

    public s a() {
        s s0 = s.r();
        for(int v = 0; v < this.a.l(); ++v) {
            Map.Entry map$Entry0 = this.a.k(v);
            E.a(map$Entry0.getKey());
            s0.s(null, map$Entry0.getValue());
        }
        for(Object object0: this.a.n()) {
            E.a(((Map.Entry)object0).getKey());
            s0.s(null, ((Map.Entry)object0).getValue());
        }
        s0.c = this.c;
        return s0;
    }

    static int b(b r0$b0, int v, Object object0) {
        return (r0$b0 == b.q ? j.P(v) * 2 : j.P(v)) + s.c(r0$b0, object0);
    }

    static int c(b r0$b0, Object object0) {
        switch(r0$b0) {
            case 1: {
                return j.i(((double)(((Double)object0))));
            }
            case 2: {
                return j.q(((float)(((Float)object0))));
            }
            case 3: {
                return j.x(((long)(((Long)object0))));
            }
            case 4: {
                return j.T(((long)(((Long)object0))));
            }
            case 5: {
                return j.v(((int)(((Integer)object0))));
            }
            case 6: {
                return j.o(((long)(((Long)object0))));
            }
            case 7: {
                return j.m(((int)(((Integer)object0))));
            }
            case 8: {
                return j.d(((Boolean)object0).booleanValue());
            }
            case 9: {
                return j.s(((O)object0));
            }
            case 10: {
                return j.A(((O)object0));
            }
            case 11: {
                return object0 instanceof g ? j.g(((g)object0)) : j.O(((String)object0));
            }
            case 12: {
                return object0 instanceof g ? j.g(((g)object0)) : j.e(((byte[])object0));
            }
            case 13: {
                return j.R(((int)(((Integer)object0))));
            }
            case 14: {
                return j.G(((int)(((Integer)object0))));
            }
            case 15: {
                return j.I(((long)(((Long)object0))));
            }
            case 16: {
                return j.K(((int)(((Integer)object0))));
            }
            case 17: {
                return j.M(((long)(((Long)object0))));
            }
            case 18: {
                return j.k(((int)(((Integer)object0))));
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    @Override
    public Object clone() {
        return this.a();
    }

    public static int d(androidx.datastore.preferences.protobuf.s.b s$b0, Object object0) {
        int v = 0;
        b r0$b0 = s$b0.d();
        int v1 = s$b0.a();
        if(s$b0.c()) {
            if(s$b0.e()) {
                for(Object object1: ((List)object0)) {
                    v += s.c(r0$b0, object1);
                }
                return j.P(v1) + v + j.E(v);
            }
            for(Object object2: ((List)object0)) {
                v += s.b(r0$b0, v1, object2);
            }
            return v;
        }
        return s.b(r0$b0, v1, object0);
    }

    Iterator e() {
        return this.c ? new B(this.a.i().iterator()) : this.a.i().iterator();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof s ? this.a.equals(((s)object0).a) : false;
    }

    public int f() {
        int v1 = 0;
        for(int v = 0; v < this.a.l(); ++v) {
            v1 += this.g(this.a.k(v));
        }
        for(Object object0: this.a.n()) {
            v1 += this.g(((Map.Entry)object0));
        }
        return v1;
    }

    private int g(Map.Entry map$Entry0) {
        E.a(map$Entry0.getKey());
        map$Entry0.getValue();
        throw null;
    }

    public int h() {
        int v1 = 0;
        for(int v = 0; v < this.a.l(); ++v) {
            Map.Entry map$Entry0 = this.a.k(v);
            E.a(map$Entry0.getKey());
            v1 += s.d(null, map$Entry0.getValue());
        }
        for(Object object0: this.a.n()) {
            E.a(((Map.Entry)object0).getKey());
            v1 += s.d(null, ((Map.Entry)object0).getValue());
        }
        return v1;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    // 去混淆评级： 低(20)
    static int i(b r0$b0, boolean z) {
        return z ? 2 : r0$b0.f();
    }

    boolean j() {
        return this.a.isEmpty();
    }

    public boolean k() {
        for(int v = 0; v < this.a.l(); ++v) {
            if(!s.l(this.a.k(v))) {
                return false;
            }
        }
        for(Object object0: this.a.n()) {
            if(!s.l(((Map.Entry)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private static boolean l(Map.Entry map$Entry0) {
        E.a(map$Entry0.getKey());
        throw null;
    }

    private static boolean m(b r0$b0, Object object0) {
        y.a(object0);
        switch(r0$b0.b()) {
            case 1: {
                return object0 instanceof Integer;
            }
            case 2: {
                return object0 instanceof Long;
            }
            case 3: {
                return object0 instanceof Float;
            }
            case 4: {
                return object0 instanceof Double;
            }
            case 5: {
                return object0 instanceof Boolean;
            }
            case 6: {
                return object0 instanceof String;
            }
            case 7: {
                return object0 instanceof g || object0 instanceof byte[];
            }
            case 8: {
                return object0 instanceof Integer;
            }
            case 9: {
                return object0 instanceof O;
            }
            default: {
                return false;
            }
        }
    }

    public Iterator n() {
        return this.c ? new B(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public void o() {
        if(this.b) {
            return;
        }
        this.a.q();
        this.b = true;
    }

    public void p(s s0) {
        for(int v = 0; v < s0.a.l(); ++v) {
            this.q(s0.a.k(v));
        }
        for(Object object0: s0.a.n()) {
            this.q(((Map.Entry)object0));
        }
    }

    private void q(Map.Entry map$Entry0) {
        E.a(map$Entry0.getKey());
        map$Entry0.getValue();
        throw null;
    }

    public static s r() {
        return new s();
    }

    public void s(androidx.datastore.preferences.protobuf.s.b s$b0, Object object0) {
        if(s$b0.c()) {
            if(!(object0 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(((List)object0));
            for(Object object1: arrayList0) {
                this.t(s$b0.d(), object1);
            }
            object0 = arrayList0;
        }
        else {
            this.t(s$b0.d(), object0);
        }
        this.a.s(s$b0, object0);
    }

    private void t(b r0$b0, Object object0) {
        if(!s.m(r0$b0, object0)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void u(j j0, b r0$b0, int v, Object object0) {
        if(r0$b0 == b.q) {
            j0.r0(v, ((O)object0));
            return;
        }
        j0.N0(v, s.i(r0$b0, false));
        s.v(j0, r0$b0, object0);
    }

    static void v(j j0, b r0$b0, Object object0) {
        switch(r0$b0) {
            case 1: {
                j0.i0(((double)(((Double)object0))));
                return;
            }
            case 2: {
                j0.q0(((float)(((Float)object0))));
                return;
            }
            case 3: {
                j0.y0(((long)(((Long)object0))));
                return;
            }
            case 4: {
                j0.R0(((long)(((Long)object0))));
                return;
            }
            case 5: {
                j0.w0(((int)(((Integer)object0))));
                return;
            }
            case 6: {
                j0.o0(((long)(((Long)object0))));
                return;
            }
            case 7: {
                j0.m0(((int)(((Integer)object0))));
                return;
            }
            case 8: {
                j0.c0(((Boolean)object0).booleanValue());
                return;
            }
            case 9: {
                j0.t0(((O)object0));
                return;
            }
            case 10: {
                j0.A0(((O)object0));
                return;
            }
            case 11: {
                if(object0 instanceof g) {
                    j0.g0(((g)object0));
                    return;
                }
                j0.M0(((String)object0));
                return;
            }
            case 12: {
                if(object0 instanceof g) {
                    j0.g0(((g)object0));
                    return;
                }
                j0.d0(((byte[])object0));
                return;
            }
            case 13: {
                j0.P0(((int)(((Integer)object0))));
                return;
            }
            case 14: {
                j0.E0(((int)(((Integer)object0))));
                return;
            }
            case 15: {
                j0.G0(((long)(((Long)object0))));
                return;
            }
            case 16: {
                j0.I0(((int)(((Integer)object0))));
                return;
            }
            case 17: {
                j0.K0(((long)(((Long)object0))));
                return;
            }
            case 18: {
                j0.k0(((int)(((Integer)object0))));
            }
        }
    }
}

