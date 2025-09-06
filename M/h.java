package M;

import J.k;
import L.d;
import L.g;
import L.h.b;
import androidx.datastore.preferences.protobuf.w;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import l3.l;
import l3.u;
import m3.o;
import p3.f;

public final class h implements k {
    public abstract class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            arr_v[b.g.ordinal()] = 1;
            arr_v[b.h.ordinal()] = 2;
            arr_v[b.m.ordinal()] = 3;
            arr_v[b.i.ordinal()] = 4;
            arr_v[b.j.ordinal()] = 5;
            arr_v[b.k.ordinal()] = 6;
            arr_v[b.l.ordinal()] = 7;
            arr_v[b.n.ordinal()] = 8;
            a.a = arr_v;
        }
    }

    public static final h a;
    private static final String b;

    static {
        h.a = new h();
        h.b = "preferences_pb";
    }

    @Override  // J.k
    public Object a() {
        return this.e();
    }

    @Override  // J.k
    public Object b(InputStream inputStream0, f f0) {
        L.f f1 = d.a.a(inputStream0);
        M.a a0 = e.b(new M.d.b[0]);
        Map map0 = f1.K();
        z3.k.d(map0, "preferencesProto.preferencesMap");
        for(Object object0: map0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            L.h h0 = (L.h)((Map.Entry)object0).getValue();
            z3.k.d(s, "name");
            z3.k.d(h0, "value");
            h.a.d(s, h0, a0);
        }
        return a0.d();
    }

    @Override  // J.k
    public Object c(Object object0, OutputStream outputStream0, f f0) {
        return this.h(((M.d)object0), outputStream0, f0);
    }

    private final void d(String s, L.h h0, M.a a0) {
        b h$b0 = h0.X();
        switch((h$b0 == null ? -1 : a.a[h$b0.ordinal()])) {
            case -1: {
                throw new J.a("Value case is null.", null, 2, null);
            }
            case 1: {
                a0.i(M.f.a(s), Boolean.valueOf(h0.P()));
                return;
            }
            case 2: {
                a0.i(M.f.c(s), h0.S());
                return;
            }
            case 3: {
                a0.i(M.f.b(s), h0.R());
                return;
            }
            case 4: {
                a0.i(M.f.d(s), h0.T());
                return;
            }
            case 5: {
                a0.i(M.f.e(s), h0.U());
                return;
            }
            case 6: {
                M.d.a d$a0 = M.f.f(s);
                z3.k.d("", "value.string");
                a0.i(d$a0, "");
                return;
            }
            case 7: {
                M.d.a d$a1 = M.f.g(s);
                List list0 = h0.W().M();
                z3.k.d(list0, "value.stringSet.stringsList");
                a0.i(d$a1, o.I(list0));
                return;
            }
            case 8: {
                throw new J.a("Value not set.", null, 2, null);
            }
            default: {
                throw new l();
            }
        }
    }

    public M.d e() {
        return e.a();
    }

    // 去混淆评级： 低(20)
    public final String f() [...] // 潜在的解密器

    private final L.h g(Object object0) {
        if(object0 instanceof Boolean) {
            w w0 = L.h.Y().u(((Boolean)object0).booleanValue()).m();
            z3.k.d(w0, "newBuilder().setBoolean(value).build()");
            return (L.h)w0;
        }
        if(object0 instanceof Float) {
            w w1 = L.h.Y().w(((Number)object0).floatValue()).m();
            z3.k.d(w1, "newBuilder().setFloat(value).build()");
            return (L.h)w1;
        }
        if(object0 instanceof Double) {
            w w2 = L.h.Y().v(((Number)object0).doubleValue()).m();
            z3.k.d(w2, "newBuilder().setDouble(value).build()");
            return (L.h)w2;
        }
        if(object0 instanceof Integer) {
            w w3 = L.h.Y().x(((Number)object0).intValue()).m();
            z3.k.d(w3, "newBuilder().setInteger(value).build()");
            return (L.h)w3;
        }
        if(object0 instanceof Long) {
            w w4 = L.h.Y().y(((Number)object0).longValue()).m();
            z3.k.d(w4, "newBuilder().setLong(value).build()");
            return (L.h)w4;
        }
        if(object0 instanceof String) {
            w w5 = L.h.Y().z(((String)object0)).m();
            z3.k.d(w5, "newBuilder().setString(value).build()");
            return (L.h)w5;
        }
        if(!(object0 instanceof Set)) {
            throw new IllegalStateException(z3.k.k("PreferencesSerializer does not support type: ", object0.getClass().getName()));
        }
        w w6 = L.h.Y().A(g.N().u(((Set)object0))).m();
        z3.k.d(w6, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
        return (L.h)w6;
    }

    public Object h(M.d d0, OutputStream outputStream0, f f0) {
        Map map0 = d0.a();
        L.f.a f$a0 = L.f.N();
        for(Object object0: map0.entrySet()) {
            f$a0.u(((M.d.a)((Map.Entry)object0).getKey()).a(), this.g(((Map.Entry)object0).getValue()));
        }
        ((L.f)f$a0.m()).m(outputStream0);
        return u.a;
    }
}

