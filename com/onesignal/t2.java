package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

abstract class t2 extends u2 {
    t2(d x1$d0) {
        super(x1$d0);
    }

    @Override  // com.onesignal.u2
    protected abstract String B();

    @Override  // com.onesignal.u2
    protected C C() {
        return C.j;
    }

    @Override  // com.onesignal.u2
    protected void Q(JSONObject jSONObject0) {
        if(jSONObject0.has("identifier")) {
            JSONObject jSONObject1 = new JSONObject();
            try {
                jSONObject1.put(this.k0(), jSONObject0.get("identifier"));
                if(jSONObject0.has(this.j0())) {
                    jSONObject1.put(this.j0(), jSONObject0.get(this.j0()));
                }
            }
            catch(JSONException jSONException0) {
                jSONException0.printStackTrace();
            }
            this.i0(jSONObject1);
        }
    }

    @Override  // com.onesignal.u2
    protected void V() {
        if(this.B() == null && this.E() == null || I1.L0() == null) {
            return;
        }
        this.D(0).c();
    }

    abstract void h0();

    abstract void i0(JSONObject arg1);

    protected abstract String j0();

    protected abstract String k0();

    protected abstract int l0();

    void m0() {
        this.V();
    }

    @Override  // com.onesignal.u2
    protected void n(JSONObject jSONObject0) {
        try {
            jSONObject0.put("device_type", this.l0());
            jSONObject0.putOpt("device_player_id", I1.L0());
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
    }

    @Override  // com.onesignal.u2
    protected void w(JSONObject jSONObject0) {
        if(jSONObject0.has("identifier")) {
            this.h0();
        }
    }
}

