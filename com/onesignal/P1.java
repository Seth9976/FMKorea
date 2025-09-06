package com.onesignal;

import org.json.JSONObject;

public class p1 {
    private OSSubscriptionState a;
    private OSSubscriptionState b;

    public p1(OSSubscriptionState oSSubscriptionState0, OSSubscriptionState oSSubscriptionState1) {
        this.a = oSSubscriptionState0;
        this.b = oSSubscriptionState1;
    }

    public JSONObject a() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("from", this.a.m());
            jSONObject0.put("to", this.b.m());
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

