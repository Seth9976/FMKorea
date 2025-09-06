package com.onesignal;

import d3.e;

class i1 {
    private f a;

    i1() {
        this.a = null;
    }

    void a() {
        this.a = null;
    }

    boolean b() {
        return S1.b("I1", "OS_CLEAR_GROUP_SUMMARY_CLICK", true);
    }

    boolean c() {
        return S1.b("I1", "GT_FIREBASE_TRACKING_ENABLED", false);
    }

    f d() {
        return this.a;
    }

    boolean e() {
        return S1.b("I1", "ONESIGNAL_USER_PROVIDED_CONSENT", false);
    }

    boolean f() {
        return this.a != null && this.a.m != null;
    }

    boolean g() {
        return S1.b("I1", "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", false);
    }

    boolean h() {
        return S1.b("I1", "PREFS_OS_LOCATION_SHARED", true);
    }

    boolean i() {
        return S1.b("I1", "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", false);
    }

    boolean j() {
        return S1.b("I1", "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", false);
    }

    boolean k() {
        return this.a != null;
    }

    boolean l() {
        return S1.b("I1", "OS_RESTORE_TTL_FILTER", true);
    }

    void m(boolean z) {
        S1.j("I1", "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", z);
    }

    void n(boolean z) {
        S1.j("I1", "PREFS_OS_LOCATION_SHARED", z);
    }

    void o(boolean z) {
        S1.j("I1", "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", z);
    }

    private void p(boolean z) {
        S1.j("I1", "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", z);
    }

    void q(f t1$f0, e e0, m1 m10, Q0 q00) {
        this.a = t1$f0;
        S1.j("I1", "GT_FIREBASE_TRACKING_ENABLED", t1$f0.f);
        this.r(t1$f0.g);
        S1.j("I1", "OS_CLEAR_GROUP_SUMMARY_CLICK", t1$f0.h);
        S1.j("I1", m10.h(), t1$f0.n.h);
        this.p(t1$f0.i);
        q00.d("OneSignal saveInfluenceParams: InfluenceParams{indirectNotificationAttributionWindow=1440, notificationLimit=10, indirectIAMAttributionWindow=1440, iamLimit=10, directEnabled=false, indirectEnabled=false, unattributedEnabled=false}");
        e0.j(t1$f0.n);
        Boolean boolean0 = t1$f0.j;
        if(boolean0 != null) {
            this.m(boolean0.booleanValue());
        }
        Boolean boolean1 = t1$f0.k;
        if(boolean1 != null) {
            this.s(boolean1.booleanValue());
        }
        Boolean boolean2 = t1$f0.l;
        if(boolean2 != null) {
            I1.k2(boolean2.booleanValue());
        }
        Boolean boolean3 = t1$f0.m;
        if(boolean3 != null) {
            this.o(boolean3.booleanValue());
        }
    }

    private void r(boolean z) {
        S1.j("I1", "OS_RESTORE_TTL_FILTER", this.a.g);
    }

    void s(boolean z) {
        S1.j("I1", "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", z);
    }

    void t(boolean z) {
        S1.j("I1", "ONESIGNAL_USER_PROVIDED_CONSENT", z);
    }

    boolean u() {
        return S1.b("I1", "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", true);
    }
}

