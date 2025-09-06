package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

abstract class n0 {
    private static JSONObject a(Intent intent0) {
        if(!V0.e(intent0)) {
            return null;
        }
        JSONObject jSONObject0 = S.a(intent0.getExtras());
        n0.d(jSONObject0);
        return jSONObject0;
    }

    static void b(Activity activity0, Intent intent0) {
        I1.X0(activity0.getApplicationContext());
        if(intent0 == null) {
            return;
        }
        JSONObject jSONObject0 = n0.a(intent0);
        if(jSONObject0 == null) {
            return;
        }
        n0.c(activity0, jSONObject0);
    }

    private static void c(Activity activity0, JSONObject jSONObject0) {
        if(I0.b(activity0, jSONObject0)) {
            return;
        }
        I1.Q0(activity0, new JSONArray().put(jSONObject0), V0.b(jSONObject0));
    }

    private static void d(JSONObject jSONObject0) {
        try {
            String s = (String)S.b(jSONObject0).remove("actionId");
            if(s == null) {
                return;
            }
            jSONObject0.put("actionId", s);
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
    }
}

