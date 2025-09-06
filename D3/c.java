package d3;

import com.onesignal.T1.e;
import com.onesignal.m1;
import org.json.JSONArray;
import z3.k;

public final class c {
    private final m1 a;

    public c(m1 m10) {
        k.e(m10, "preferences");
        super();
        this.a = m10;
    }

    public final void a(e3.c c0) {
        k.e(c0, "influenceType");
        String s = this.a.f();
        this.a.i(s, "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", c0.toString());
    }

    public final void b(e3.c c0) {
        k.e(c0, "influenceType");
        String s = this.a.f();
        this.a.i(s, "PREFS_OS_OUTCOMES_CURRENT_SESSION", c0.toString());
    }

    public final void c(String s) {
        String s1 = this.a.f();
        this.a.i(s1, "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", s);
    }

    public final String d() {
        String s = this.a.f();
        return this.a.e(s, "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", null);
    }

    public final e3.c e() {
        String s = this.a.f();
        String s1 = this.a.e(s, "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", "UNATTRIBUTED");
        return e3.c.f.a(s1);
    }

    public final int f() {
        String s = this.a.f();
        return this.a.d(s, "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", 0x5A0);
    }

    public final int g() {
        String s = this.a.f();
        return this.a.d(s, "PREFS_OS_IAM_LIMIT", 10);
    }

    public final JSONArray h() {
        String s = this.a.f();
        String s1 = this.a.e(s, "PREFS_OS_LAST_IAMS_RECEIVED", "[]");
        JSONArray jSONArray0 = s1 == null ? null : new JSONArray(s1);
        return jSONArray0 == null ? new JSONArray() : jSONArray0;
    }

    public final JSONArray i() {
        String s = this.a.f();
        String s1 = this.a.e(s, "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", "[]");
        JSONArray jSONArray0 = s1 == null ? null : new JSONArray(s1);
        return jSONArray0 == null ? new JSONArray() : jSONArray0;
    }

    public final e3.c j() {
        String s = this.a.f();
        String s1 = this.a.e(s, "PREFS_OS_OUTCOMES_CURRENT_SESSION", "UNATTRIBUTED");
        return e3.c.f.a(s1);
    }

    public final int k() {
        String s = this.a.f();
        return this.a.d(s, "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", 0x5A0);
    }

    public final int l() {
        String s = this.a.f();
        return this.a.d(s, "PREFS_OS_NOTIFICATION_LIMIT", 10);
    }

    public final boolean m() {
        String s = this.a.f();
        return this.a.j(s, "PREFS_OS_DIRECT_ENABLED", false);
    }

    public final boolean n() {
        String s = this.a.f();
        return this.a.j(s, "PREFS_OS_INDIRECT_ENABLED", false);
    }

    public final boolean o() {
        String s = this.a.f();
        return this.a.j(s, "PREFS_OS_UNATTRIBUTED_ENABLED", false);
    }

    public final void p(JSONArray jSONArray0) {
        k.e(jSONArray0, "iams");
        String s = this.a.f();
        this.a.i(s, "PREFS_OS_LAST_IAMS_RECEIVED", jSONArray0.toString());
    }

    public final void q(e t1$e0) {
        k.e(t1$e0, "influenceParams");
        String s = this.a.f();
        this.a.b(s, "PREFS_OS_DIRECT_ENABLED", t1$e0.e());
        String s1 = this.a.f();
        this.a.b(s1, "PREFS_OS_INDIRECT_ENABLED", t1$e0.f());
        String s2 = this.a.f();
        this.a.b(s2, "PREFS_OS_UNATTRIBUTED_ENABLED", t1$e0.g());
        String s3 = this.a.f();
        this.a.a(s3, "PREFS_OS_NOTIFICATION_LIMIT", t1$e0.d());
        String s4 = this.a.f();
        this.a.a(s4, "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", t1$e0.c());
        String s5 = this.a.f();
        this.a.a(s5, "PREFS_OS_IAM_LIMIT", t1$e0.a());
        String s6 = this.a.f();
        this.a.a(s6, "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", t1$e0.b());
    }

    public final void r(JSONArray jSONArray0) {
        k.e(jSONArray0, "notifications");
        String s = this.a.f();
        this.a.i(s, "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", jSONArray0.toString());
    }
}

