package com.onesignal;

import org.json.JSONObject;

public class j1 implements Cloneable {
    private c1 f;
    private String g;
    private String h;

    j1(boolean z) {
        this.f = new c1("changed", false);
        if(z) {
            this.g = S1.f("I1", "PREFS_OS_SMS_ID_LAST", null);
            this.h = S1.f("I1", "PREFS_OS_SMS_NUMBER_LAST", null);
            return;
        }
        this.g = I1.x0();
        this.h = X1.g().E();
    }

    public c1 b() {
        return this.f;
    }

    public String c() {
        return this.h;
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

    public String d() {
        return this.g;
    }

    public boolean e() {
        return this.g != null && this.h != null;
    }

    void f() {
        S1.m("I1", "PREFS_OS_SMS_ID_LAST", this.g);
        S1.m("I1", "PREFS_OS_SMS_NUMBER_LAST", this.h);
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
                jSONObject0.put("smsUserId", JSONObject.NULL);
            }
            else {
                jSONObject0.put("smsUserId", s);
            }
            String s1 = this.h;
            if(s1 == null) {
                jSONObject0.put("smsNumber", JSONObject.NULL);
            }
            else {
                jSONObject0.put("smsNumber", s1);
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

