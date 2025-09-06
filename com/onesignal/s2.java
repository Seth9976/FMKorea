package com.onesignal;

import org.json.JSONObject;

class s2 extends t2 {
    s2() {
        super(d.h);
    }

    @Override  // com.onesignal.t2
    protected String B() {
        return I1.x0();
    }

    @Override  // com.onesignal.u2
    protected m2 P(String s, boolean z) {
        return new r2(s, z);
    }

    @Override  // com.onesignal.u2
    void f0(String s) {
        I1.o2(s);
    }

    @Override  // com.onesignal.t2
    void h0() {
    }

    @Override  // com.onesignal.t2
    void i0(JSONObject jSONObject0) {
    }

    @Override  // com.onesignal.t2
    protected String j0() {
        return "sms_auth_hash";
    }

    @Override  // com.onesignal.t2
    protected String k0() {
        return "sms_number";
    }

    @Override  // com.onesignal.t2
    protected int l0() {
        return 14;
    }

    void n0(String s) {
        I1.N1(s);
    }
}

