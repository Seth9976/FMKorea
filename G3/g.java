package g3;

import com.onesignal.L1;
import com.onesignal.Q0;
import h3.b;
import org.json.JSONException;
import org.json.JSONObject;
import z3.k;

public final class g extends d {
    public g(Q0 q00, a a0, j j0) {
        k.e(q00, "logger");
        k.e(a0, "outcomeEventsCache");
        k.e(j0, "outcomeEventsService");
        super(q00, a0, j0);
    }

    @Override  // h3.c
    public void h(String s, int v, b b0, L1 l10) {
        k.e(s, "appId");
        k.e(b0, "event");
        k.e(l10, "responseHandler");
        try {
            JSONObject jSONObject0 = b0.g().put("app_id", s).put("device_type", v);
            k.d(jSONObject0, "jsonObject");
            this.k().a(jSONObject0, l10);
        }
        catch(JSONException jSONException0) {
            this.j().c("Generating indirect outcome:JSON Failed.", jSONException0);
        }
    }
}

