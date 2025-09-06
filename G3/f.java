package g3;

import com.onesignal.J1;
import com.onesignal.L1;
import org.json.JSONObject;
import z3.k;

public final class f extends b {
    public f(J1 j10) {
        k.e(j10, "client");
        super(j10);
    }

    @Override  // g3.j
    public void a(JSONObject jSONObject0, L1 l10) {
        k.e(jSONObject0, "jsonObject");
        k.e(l10, "responseHandler");
        this.b().a("outcomes/measure", jSONObject0, l10);
    }
}

