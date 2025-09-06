package g3;

import com.onesignal.L1;
import com.onesignal.Q0;
import com.onesignal.d1;
import e3.c;
import h3.b;
import org.json.JSONException;
import org.json.JSONObject;
import z3.k;

public final class e extends d {
    public abstract class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            arr_v[c.g.ordinal()] = 1;
            arr_v[c.h.ordinal()] = 2;
            arr_v[c.i.ordinal()] = 3;
            a.a = arr_v;
        }
    }

    public e(Q0 q00, g3.a a0, j j0) {
        k.e(q00, "logger");
        k.e(a0, "outcomeEventsCache");
        k.e(j0, "outcomeEventsService");
        super(q00, a0, j0);
    }

    @Override  // h3.c
    public void h(String s, int v, b b0, L1 l10) {
        k.e(s, "appId");
        k.e(b0, "eventParams");
        k.e(l10, "responseHandler");
        d1 d10 = d1.a(b0);
        c c0 = d10.b();
        switch((c0 == null ? -1 : a.a[c0.ordinal()])) {
            case 1: {
                k.d(d10, "event");
                this.l(s, v, d10, l10);
                return;
            }
            case 2: {
                k.d(d10, "event");
                this.m(s, v, d10, l10);
                return;
            }
            case 3: {
                k.d(d10, "event");
                this.n(s, v, d10, l10);
            }
        }
    }

    private final void l(String s, int v, d1 d10, L1 l10) {
        try {
            JSONObject jSONObject0 = d10.c().put("app_id", s).put("device_type", v).put("direct", true);
            k.d(jSONObject0, "jsonObject");
            this.k().a(jSONObject0, l10);
        }
        catch(JSONException jSONException0) {
            this.j().c("Generating direct outcome:JSON Failed.", jSONException0);
        }
    }

    private final void m(String s, int v, d1 d10, L1 l10) {
        try {
            JSONObject jSONObject0 = d10.c().put("app_id", s).put("device_type", v).put("direct", false);
            k.d(jSONObject0, "jsonObject");
            this.k().a(jSONObject0, l10);
        }
        catch(JSONException jSONException0) {
            this.j().c("Generating indirect outcome:JSON Failed.", jSONException0);
        }
    }

    private final void n(String s, int v, d1 d10, L1 l10) {
        try {
            JSONObject jSONObject0 = d10.c().put("app_id", s).put("device_type", v);
            k.d(jSONObject0, "jsonObject");
            this.k().a(jSONObject0, l10);
        }
        catch(JSONException jSONException0) {
            this.j().c("Generating unattributed outcome:JSON Failed.", jSONException0);
        }
    }
}

