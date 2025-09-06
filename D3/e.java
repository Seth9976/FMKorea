package d3;

import com.onesignal.I1.w;
import com.onesignal.Q0;
import com.onesignal.m1;
import com.onesignal.v1;
import e3.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import m3.o;
import org.json.JSONObject;
import z3.k;

public final class e {
    public abstract class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            arr_v[b.i.ordinal()] = 1;
            arr_v[b.h.ordinal()] = 2;
            a.a = arr_v;
        }
    }

    private final ConcurrentHashMap a;
    private final c b;

    public e(m1 m10, Q0 q00, v1 v10) {
        k.e(m10, "preferences");
        k.e(q00, "logger");
        k.e(v10, "timeProvider");
        super();
        ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
        this.a = concurrentHashMap0;
        c c0 = new c(m10);
        this.b = c0;
        concurrentHashMap0.put(c3.a.a.a(), new d3.b(c0, q00, v10));
        concurrentHashMap0.put(c3.a.a.b(), new d(c0, q00, v10));
    }

    public final void a(JSONObject jSONObject0, List list0) {
        k.e(jSONObject0, "jsonObject");
        k.e(list0, "influences");
        for(Object object0: list0) {
            e3.a a0 = (e3.a)object0;
            if(a.a[a0.c().ordinal()] == 1) {
                this.g().a(jSONObject0, a0);
            }
        }
    }

    public final d3.a b(w i1$w0) {
        k.e(i1$w0, "entryAction");
        return i1$w0.g() ? this.g() : null;
    }

    public final List c() {
        List list0 = new ArrayList();
        list0.add(this.g());
        list0.add(this.e());
        return list0;
    }

    public final List d(w i1$w0) {
        k.e(i1$w0, "entryAction");
        List list0 = new ArrayList();
        if(i1$w0.b()) {
            return list0;
        }
        d3.a a0 = i1$w0.f() ? this.g() : null;
        if(a0 != null) {
            list0.add(a0);
        }
        list0.add(this.e());
        return list0;
    }

    public final d3.a e() {
        Object object0 = this.a.get(c3.a.a.a());
        k.b(object0);
        k.d(object0, "trackers[OSInfluenceConstants.IAM_TAG]!!");
        return (d3.a)object0;
    }

    public final List f() {
        Collection collection0 = this.a.values();
        k.d(collection0, "trackers.values");
        List list0 = new ArrayList(o.n(collection0, 10));
        for(Object object0: collection0) {
            list0.add(((d3.a)object0).e());
        }
        return list0;
    }

    public final d3.a g() {
        Object object0 = this.a.get(c3.a.a.b());
        k.b(object0);
        k.d(object0, "trackers[OSInfluenceConstants.NOTIFICATION_TAG]!!");
        return (d3.a)object0;
    }

    public final List h() {
        Collection collection0 = this.a.values();
        k.d(collection0, "trackers.values");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: collection0) {
            if(!k.a(((d3.a)object0).h(), c3.a.a.a())) {
                arrayList0.add(object0);
            }
        }
        List list0 = new ArrayList(o.n(arrayList0, 10));
        for(Object object1: arrayList0) {
            list0.add(((d3.a)object1).e());
        }
        return list0;
    }

    public final void i() {
        Collection collection0 = this.a.values();
        k.d(collection0, "trackers.values");
        for(Object object0: collection0) {
            ((d3.a)object0).p();
        }
    }

    public final void j(com.onesignal.T1.e t1$e0) {
        k.e(t1$e0, "influenceParams");
        this.b.q(t1$e0);
    }
}

