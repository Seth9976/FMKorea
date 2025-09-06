package com.onesignal;

import org.json.JSONObject;

public class g1 {
    private f1 a;
    private f1 b;

    public g1(f1 f10, f1 f11) {
        this.a = f10;
        this.b = f11;
    }

    public JSONObject a() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("from", this.a.g());
            jSONObject0.put("to", this.b.g());
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
        return jSONObject0;
    }

    @Override
    public String toString() {
        return this.a().toString();
    }
}

