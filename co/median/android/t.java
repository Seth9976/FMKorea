package co.median.android;

import G3.h;
import I0.j;
import org.json.JSONObject;
import z3.g;
import z3.k;

public final class t {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    private final MainActivity a;
    private final boolean b;
    private final j c;
    public u d;
    private boolean e;
    public static final a f;

    static {
        t.f = new a(null);
    }

    public t(MainActivity mainActivity0, boolean z) {
        k.e(mainActivity0, "mainActivity");
        super();
        this.a = mainActivity0;
        this.b = z;
        j j0 = mainActivity0.d();
        k.d(j0, "getWebView(...)");
        this.c = j0;
    }

    public final u a() {
        u u0 = this.d;
        if(u0 != null) {
            return u0;
        }
        k.p("urlNavigation");
        return null;
    }

    private final void b(String s, boolean z, boolean z1) {
        if(s != null && !h.H(s)) {
            if(this.b && z && this.a.a2().a("_median_url_changed")) {
                if(h.u(s, "javascript:", false, 2, null)) {
                    this.c.e(s);
                    return;
                }
                if(!z1 && this.a().U(this.c, s, false)) {
                    return;
                }
                this.j(s);
                return;
            }
            this.c.loadUrl(s);
        }
    }

    public final void c(String s) {
        this.e(s, false, false);
    }

    public final void d(String s, boolean z) {
        this.e(s, z, false);
    }

    public final void e(String s, boolean z, boolean z1) {
        if(s == null) {
            return;
        }
        this.a.m0 = null;
        this.a.n0 = null;
        if(h.n(s, "median_logout", true) || h.n(s, "gonative_logout", true)) {
            this.a.K2();
        }
        else {
            this.b(s, z, z1);
        }
        if(!z1 && this.a.l2() != null) {
            this.a.l2().o(s, null);
        }
    }

    public final void f(String s, String s1, boolean z, boolean z1) {
        k.e(s1, "javascript");
        String s2 = this.c.getUrl();
        if(s != null && !h.H(s) || s2 != null && !h.H(s2) || !k.a(s, s2)) {
            this.a.m0 = s1;
            this.a.n0 = s1;
            this.b(s, z, z1);
        }
        else {
            this.a.a(s1);
            this.a.n0 = s1;
        }
        if(!z1 && this.a.l2() != null) {
            this.a.l2().o(s, s1);
        }
    }

    public final void g() {
        this.e = false;
    }

    public final void h() {
        this.e = true;
    }

    public final void i(String s) {
        if(this.b && !this.e) {
            this.a().M(s);
        }
    }

    private final void j(String s) {
        if(s != null && !h.H(s)) {
            JSONObject jSONObject0 = new JSONObject().put("url", s);
            this.a.j("_median_url_changed", jSONObject0);
        }
    }

    public final void k(u u0) {
        k.e(u0, "<set-?>");
        this.d = u0;
    }
}

