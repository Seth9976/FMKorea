package h3;

import org.json.JSONArray;
import org.json.JSONObject;
import z3.g;
import z3.k;

public final class e {
    private JSONArray a;
    private JSONArray b;

    public e() {
        this(null, null, 3, null);
    }

    public e(JSONArray jSONArray0, JSONArray jSONArray1) {
        this.a = jSONArray0;
        this.b = jSONArray1;
    }

    public e(JSONArray jSONArray0, JSONArray jSONArray1, int v, g g0) {
        if((v & 1) != 0) {
            jSONArray0 = new JSONArray();
        }
        if((v & 2) != 0) {
            jSONArray1 = new JSONArray();
        }
        this(jSONArray0, jSONArray1);
    }

    public final JSONArray a() {
        return this.b;
    }

    public final JSONArray b() {
        return this.a;
    }

    public final void c(JSONArray jSONArray0) {
        this.b = jSONArray0;
    }

    public final void d(JSONArray jSONArray0) {
        this.a = jSONArray0;
    }

    public final JSONObject e() {
        JSONObject jSONObject0 = new JSONObject().put("notification_ids", this.a).put("in_app_message_ids", this.b);
        k.d(jSONObject0, "JSONObject()\n        .pu…AM_IDS, inAppMessagesIds)");
        return jSONObject0;
    }

    @Override
    public String toString() {
        return "OSOutcomeSourceBody{notificationIds=" + this.a + ", inAppMessagesIds=" + this.b + '}';
    }
}

