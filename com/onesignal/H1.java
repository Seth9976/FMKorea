package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

class h1 {
    void a(String s, String s1, Integer integer0, String s2, g u1$g0) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("app_id", s).put("player_id", s1);
            if(integer0 != null) {
                jSONObject0.put("device_type", integer0);
            }
            U1.l(("notifications/" + s2 + "/report_received"), jSONObject0, u1$g0);
            return;
        }
        catch(JSONException jSONException0) {
        }
        I1.b(C.h, "Generating direct receive receipt:JSON Failed.", jSONException0);
    }
}

