package com.onesignal;

import org.json.JSONObject;

public class f1 implements Cloneable {
    private c1 f;
    private boolean g;

    f1(boolean z) {
        this.f = new c1("changed", false);
        if(z) {
            this.g = S1.b("I1", "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", false);
            return;
        }
        this.e();
    }

    public boolean b() {
        return this.g;
    }

    public c1 c() {
        return this.f;
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

    void d() {
        S1.j("I1", "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", this.g);
    }

    void e() {
        this.f(OSUtils.a(I1.b));
    }

    private void f(boolean z) {
        boolean z1 = this.g != z;
        this.g = z;
        if(z1) {
            this.f.c(this);
        }
    }

    public JSONObject g() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("areNotificationsEnabled", this.g);
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
        return jSONObject0;
    }

    @Override
    public String toString() {
        return this.g().toString();
    }
}

