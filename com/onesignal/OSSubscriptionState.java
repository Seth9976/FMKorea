package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

public class OSSubscriptionState implements Cloneable {
    private c1 f;
    private String g;
    private String h;
    private boolean i;
    private boolean j;

    OSSubscriptionState(boolean z, boolean z1) {
        this.f = new c1("changed", false);
        if(z) {
            this.j = S1.b("I1", "ONESIGNAL_SUBSCRIPTION_LAST", true);
            this.g = S1.f("I1", "ONESIGNAL_PLAYER_ID_LAST", null);
            this.h = S1.f("I1", "ONESIGNAL_PUSH_TOKEN_LAST", null);
            this.i = S1.b("I1", "ONESIGNAL_PERMISSION_ACCEPTED_LAST", false);
            return;
        }
        this.j = !X1.k();
        this.g = I1.L0();
        this.h = X1.f();
        this.i = z1;
    }

    boolean b(OSSubscriptionState oSSubscriptionState0) {
        if(this.j == oSSubscriptionState0.j) {
            String s = this.g;
            String s1 = "";
            if(s == null) {
                s = "";
            }
            if(s.equals((oSSubscriptionState0.g == null ? "" : oSSubscriptionState0.g))) {
                String s2 = this.h == null ? "" : this.h;
                String s3 = oSSubscriptionState0.h;
                if(s3 != null) {
                    s1 = s3;
                }
                return !s2.equals(s1) || this.i != oSSubscriptionState0.i;
            }
        }
        return true;
    }

    public c1 c() {
        return this.f;
    }

    void changed(f1 f10) {
        this.j(f10.b());
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        }
        catch(CloneNotSupportedException unused_ex) {
            return null;
        }
    }

    public String d() {
        return this.h;
    }

    public String e() {
        return this.g;
    }

    public boolean f() {
        return this.j;
    }

    // 去混淆评级： 低(20)
    public boolean g() {
        return this.g != null && this.h != null && !this.j && this.i;
    }

    void i() {
        S1.j("I1", "ONESIGNAL_SUBSCRIPTION_LAST", this.j);
        S1.m("I1", "ONESIGNAL_PLAYER_ID_LAST", this.g);
        S1.m("I1", "ONESIGNAL_PUSH_TOKEN_LAST", this.h);
        S1.j("I1", "ONESIGNAL_PERMISSION_ACCEPTED_LAST", this.i);
    }

    private void j(boolean z) {
        boolean z1 = this.g();
        this.i = z;
        if(z1 != this.g()) {
            this.f.c(this);
        }
    }

    void k(String s) {
        if(s == null) {
            return;
        }
        boolean z = s.equals(this.h);
        this.h = s;
        if(!z) {
            this.f.c(this);
        }
    }

    void l(String s) {
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

    public JSONObject m() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            String s = this.g;
            if(s == null) {
                jSONObject0.put("userId", JSONObject.NULL);
            }
            else {
                jSONObject0.put("userId", s);
            }
            String s1 = this.h;
            if(s1 == null) {
                jSONObject0.put("pushToken", JSONObject.NULL);
            }
            else {
                jSONObject0.put("pushToken", s1);
            }
            jSONObject0.put("isPushDisabled", this.f());
            jSONObject0.put("isSubscribed", this.g());
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
        }
        jSONException0.printStackTrace();
        return jSONObject0;
    }

    @Override
    public String toString() {
        return this.m().toString();
    }
}

