package com.onesignal;

import org.json.JSONException;

class p2 extends m2 {
    p2(String s, boolean z) {
        super(s, z);
    }

    private int A() {
        int v = this.i().d("subscribableStatus", 1);
        if(v < -2) {
            return v;
        }
        if(!this.i().c("androidPermission", true)) {
            return 0;
        }
        return this.i().c("userSubscribePref", true) ? 1 : -2;
    }

    @Override  // com.onesignal.m2
    protected void a() {
        try {
            this.t("notification_types", this.A());
        }
        catch(JSONException unused_ex) {
        }
    }

    @Override  // com.onesignal.m2
    m2 p(String s) {
        return new p2(s, false);
    }
}

