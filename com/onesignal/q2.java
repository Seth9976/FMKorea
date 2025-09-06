package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

class q2 extends u2 {
    private static boolean m;

    q2() {
        super(d.f);
    }

    @Override  // com.onesignal.u2
    protected String B() {
        return I1.L0();
    }

    @Override  // com.onesignal.u2
    protected C C() {
        return C.h;
    }

    @Override  // com.onesignal.u2
    protected m2 P(String s, boolean z) {
        return new p2(s, z);
    }

    @Override  // com.onesignal.u2
    protected void Q(JSONObject jSONObject0) {
    }

    @Override  // com.onesignal.u2
    protected void V() {
        this.D(0).c();
    }

    @Override  // com.onesignal.u2
    void f0(String s) {
        I1.p2(s);
    }

    public String i0() {
        return this.G().i().g("language", null);
    }

    e j0(boolean z) {
        class a extends g {
            final q2 a;

            @Override  // com.onesignal.U1$g
            void b(String s) {
                q2.m = true;
                if(s == null || s.isEmpty()) {
                    s = "{}";
                }
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    if(jSONObject0.has("tags")) {
                        synchronized(q2.this.a) {
                            JSONObject jSONObject1 = q2.this.A().l().e("tags");
                            JSONObject jSONObject2 = q2.this.G().l().e("tags");
                            JSONObject jSONObject3 = q2.this.y(jSONObject1, jSONObject2, null, null);
                            q2.this.A().t("tags", jSONObject0.optJSONObject("tags"));
                            q2.this.A().q();
                            q2.this.G().o(jSONObject0, jSONObject3);
                            q2.this.G().q();
                        }
                    }
                }
                catch(JSONException jSONException0) {
                    jSONException0.printStackTrace();
                }
            }
        }

        if(z) {
            U1.f(("players/" + I1.L0() + "?app_id=" + I1.z0()), new a(this), "CACHE_KEY_GET_TAGS");
        }
        Object object0 = this.a;
        return new e(q2.m, G.c(this.G().l(), "tags"));
    }

    public boolean k0() {
        return this.G().i().c("userSubscribePref", true);
    }

    void l0(String s) {
        I1.O1(s);
    }

    public void m0(boolean z) {
        try {
            this.H().s("androidPermission", Boolean.valueOf(z));
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
    }

    @Override  // com.onesignal.u2
    protected void n(JSONObject jSONObject0) {
    }

    void n0(JSONObject jSONObject0) {
        try {
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.putOpt("identifier", jSONObject0.optString("identifier", null));
            if(jSONObject0.has("device_type")) {
                jSONObject1.put("device_type", jSONObject0.optInt("device_type"));
            }
            jSONObject1.putOpt("parent_player_id", jSONObject0.optString("parent_player_id", null));
            this.H().h(jSONObject1, null);
            goto label_9;
        }
        catch(JSONException jSONException0) {
        }
        jSONException0.printStackTrace();
        try {
        label_9:
            JSONObject jSONObject2 = new JSONObject();
            if(jSONObject0.has("subscribableStatus")) {
                jSONObject2.put("subscribableStatus", jSONObject0.optInt("subscribableStatus"));
            }
            if(jSONObject0.has("androidPermission")) {
                jSONObject2.put("androidPermission", jSONObject0.optBoolean("androidPermission"));
            }
            this.H().g(jSONObject2, null);
            return;
        }
        catch(JSONException jSONException1) {
        }
        jSONException1.printStackTrace();
    }

    @Override  // com.onesignal.u2
    protected void w(JSONObject jSONObject0) {
        boolean z = !jSONObject0.has("email");
        boolean z1 = !jSONObject0.has("sms_number");
    }
}

