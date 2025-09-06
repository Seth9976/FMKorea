package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

public class w0 {
    private v0 a;
    private v0 b;

    public w0(v0 v00, v0 v01) {
        this.a = v00;
        this.b = v01;
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

