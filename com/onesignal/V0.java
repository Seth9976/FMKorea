package com.onesignal;

import org.json.JSONObject;

public class v0 implements Cloneable {
    private c1 f;
    private String g;
    private String h;

    v0(boolean z) {
        this.f = new c1("changed", false);
        if(z) {
            this.g = S1.f("I1", "PREFS_ONESIGNAL_EMAIL_ID_LAST", null);
            this.h = S1.f("I1", "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", null);
            return;
        }
        this.g = I1.i0();
        this.h = X1.c().E();
    }

    public String b() {
        return this.h;
    }

    public String c() {
        return this.g;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public c1 d() {
        return this.f;
    }

    public boolean e() {
        return this.g != null && this.h != null;
    }

    void f() {
        S1.m("I1", "PREFS_ONESIGNAL_EMAIL_ID_LAST", this.g);
        S1.m("I1", "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", this.h);
    }

    void g(String s) {
        boolean z = true;
        if(s != null) {
            if(s.equals(this.g)) {
                z = false;
            }
        }
        else if(this.g == null) {
            z = false;
        }
        this.g = s;
        if(z) {
            this.f.c(this);
        }
    }

    public JSONObject i() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            String s = this.g;
            if(s == null) {
                jSONObject0.put("emailUserId", JSONObject.NULL);
            }
            else {
                jSONObject0.put("emailUserId", s);
            }
            String s1 = this.h;
            if(s1 == null) {
                jSONObject0.put("emailAddress", JSONObject.NULL);
            }
            else {
                jSONObject0.put("emailAddress", s1);
            }
            jSONObject0.put("isSubscribed", this.e());
            return jSONObject0;
        }
        catch(Throwable throwable0) {
        }
        throwable0.printStackTrace();
        return jSONObject0;
    }

    @Override
    public String toString() {
        return this.i().toString();
    }
}

