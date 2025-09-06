package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

public class k1 {
    private j1 a;
    private j1 b;

    public k1(j1 j10, j1 j11) {
        this.a = j10;
        this.b = j11;
    }

    public JSONObject a() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("from", this.a.i());
            jSONObject0.put("to", this.b.i());
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        return jSONObject0;
    }

    @Override
    public String toString() {
        return this.a().toString();
    }
}

