package com.onesignal;

import org.json.JSONObject;

class o2 extends t2 {
    o2() {
        super(d.g);
    }

    @Override  // com.onesignal.t2
    protected String B() {
        return I1.i0();
    }

    @Override  // com.onesignal.u2
    protected m2 P(String s, boolean z) {
        return new n2(s, z);
    }

    @Override  // com.onesignal.u2
    void f0(String s) {
        I1.n2(s);
    }

    @Override  // com.onesignal.t2
    void h0() {
    }

    @Override  // com.onesignal.t2
    void i0(JSONObject jSONObject0) {
    }

    @Override  // com.onesignal.t2
    protected String j0() {
        return "email_auth_hash";
    }

    @Override  // com.onesignal.t2
    protected String k0() {
        return "email";
    }

    @Override  // com.onesignal.t2
    protected int l0() {
        return 11;
    }

    void n0(String s) {
        I1.M1(s);
    }
}

