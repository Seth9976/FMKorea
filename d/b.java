package d;

import D3.d;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import l3.m;
import l3.r;
import m3.F;
import m3.i;
import m3.o;
import z3.g;
import z3.k;

public final class b extends a {
    public static final class d.b.a {
        private d.b.a() {
        }

        public d.b.a(g g0) {
        }

        public final Intent a(String[] arr_s) {
            k.e(arr_s, "input");
            Intent intent0 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", arr_s);
            k.d(intent0, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intent0;
        }
    }

    public static final d.b.a a;

    static {
        b.a = new d.b.a(null);
    }

    @Override  // d.a
    public Intent a(Context context0, Object object0) {
        return this.d(context0, ((String[])object0));
    }

    @Override  // d.a
    public d.a.a b(Context context0, Object object0) {
        return this.e(context0, ((String[])object0));
    }

    @Override  // d.a
    public Object c(int v, Intent intent0) {
        return this.f(v, intent0);
    }

    public Intent d(Context context0, String[] arr_s) {
        k.e(context0, "context");
        k.e(arr_s, "input");
        return b.a.a(arr_s);
    }

    public d.a.a e(Context context0, String[] arr_s) {
        k.e(context0, "context");
        k.e(arr_s, "input");
        if(arr_s.length == 0) {
            return new d.a.a(F.h());
        }
        int v1 = 0;
        while(v1 < arr_s.length) {
            if(androidx.core.content.a.checkSelfPermission(context0, arr_s[v1]) == 0) {
                ++v1;
                continue;
            }
            return null;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(d.a(F.e(arr_s.length), 16));
        for(int v = 0; v < arr_s.length; ++v) {
            m m0 = r.a(arr_s[v], Boolean.TRUE);
            linkedHashMap0.put(m0.c(), m0.d());
        }
        return new d.a.a(linkedHashMap0);
    }

    public Map f(int v, Intent intent0) {
        if(v != -1) {
            return F.h();
        }
        if(intent0 == null) {
            return F.h();
        }
        String[] arr_s = intent0.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] arr_v = intent0.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if(arr_v != null && arr_s != null) {
            ArrayList arrayList0 = new ArrayList(arr_v.length);
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                arrayList0.add(Boolean.valueOf(arr_v[v1] == 0));
            }
            return F.p(o.J(i.l(arr_s), arrayList0));
        }
        return F.h();
    }
}

