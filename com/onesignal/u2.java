package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.appcompat.app.E;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

abstract class u2 {
    class a {
        final u2 a;

    }

    static class e {
        boolean a;
        JSONObject b;

        e(boolean z, JSONObject jSONObject0) {
            this.a = z;
            this.b = jSONObject0;
        }
    }

    class f extends HandlerThread {
        int f;
        Handler g;
        int h;
        final u2 i;

        f(int v) {
            super("OSH_NetworkHandlerThread_" + u20.b);
            this.f = v;
            this.start();
            this.g = new Handler(this.getLooper());
        }

        boolean a() {
            synchronized(this.g) {
                if(this.h < 3 && !this.g.hasMessages(0)) {
                    ++this.h;
                    this.g.postDelayed(this.b(), ((long)(this.h * 15000)));
                }
            }
            return this.g.hasMessages(0);
        }

        private Runnable b() {
            class com.onesignal.u2.f.a implements Runnable {
                final f f;

                @Override
                public void run() {
                    if(!u2.this.d.get()) {
                        u2.this.d0(false);
                    }
                }
            }

            return this.f != 0 ? null : new com.onesignal.u2.f.a(this);
        }

        void c() {
            if(!u2.this.c) {
                return;
            }
            synchronized(this.g) {
                this.h = 0;
                this.g.removeCallbacksAndMessages(null);
                this.g.postDelayed(this.b(), 5000L);
            }
        }
    }

    protected final Object a;
    private d b;
    private boolean c;
    private AtomicBoolean d;
    private final Queue e;
    private final Queue f;
    private final Queue g;
    HashMap h;
    private final Object i;
    protected boolean j;
    private m2 k;
    private m2 l;

    u2(d x1$d0) {
        this.a = new Object();
        this.d = new AtomicBoolean();
        this.e = new LinkedBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.g = new LinkedBlockingQueue();
        this.h = new HashMap();
        this.i = new a(this);
        this.j = false;
        this.b = x1$d0;
    }

    protected m2 A() {
        if(this.k == null) {
            Object object0 = this.a;
            synchronized(object0) {
                if(this.k == null) {
                    this.k = this.P("CURRENT_STATE", true);
                }
            }
        }
        return this.k;
    }

    protected abstract String B();

    protected abstract C C();

    protected f D(Integer integer0) {
        synchronized(this.i) {
            if(!this.h.containsKey(integer0)) {
                this.h.put(integer0, new f(this, ((int)integer0)));
            }
        }
        return (f)this.h.get(integer0);
    }

    String E() {
        return this.G().l().g("identifier", null);
    }

    boolean F() {
        return this.H().i().b("session");
    }

    protected m2 G() {
        if(this.l == null) {
            Object object0 = this.a;
            synchronized(object0) {
                if(this.l == null) {
                    this.l = this.P("TOSYNC_STATE", true);
                }
            }
        }
        return this.l;
    }

    protected m2 H() {
        if(this.l == null) {
            this.l = this.A().c("TOSYNC_STATE");
        }
        this.V();
        return this.l;
    }

    private void I(int v) {
        if(v == 403) {
            I1.a(C.g, "403 error updating player, omitting further retries!");
            this.x();
            return;
        }
        if(!this.D(0).a()) {
            this.x();
        }
    }

    private void J() {
        I1.a(C.i, "Creating new player based on missing player_id noted above.");
        this.T();
        this.f0(null);
        this.V();
    }

    boolean K() {
        return this.f.size() > 0;
    }

    void L() {
        if(this.k == null) {
            Object object0 = this.a;
            synchronized(object0) {
                if(this.k == null) {
                    this.k = this.P("CURRENT_STATE", true);
                }
            }
        }
        this.G();
    }

    private void M(boolean z) {
        JSONObject jSONObject1;
        JSONObject jSONObject0;
        String s = this.B();
        if(this.c0() && s != null) {
            this.s(s);
            return;
        }
        if(this.k == null) {
            this.L();
        }
        boolean z1 = !z && this.N();
        synchronized(this.a) {
            jSONObject0 = this.A().d(this.G(), z1);
            m2 m20 = this.G();
            jSONObject1 = this.A().f(m20, null);
            I1.p1(C.k, "UserStateSynchronizer internalSyncUserState from session call: " + z1 + " jsonBody: " + jSONObject0);
            if(jSONObject0 == null) {
                this.A().r(jSONObject1, null);
                this.Z();
                this.v();
                this.q();
                return;
            }
            this.G().q();
        }
        if(!z1) {
            this.t(s, jSONObject0, jSONObject1);
            return;
        }
        this.r(s, jSONObject0, jSONObject1);
    }

    // 去混淆评级： 低(20)
    private boolean N() {
        return (this.G().i().b("session") || this.B() == null) && !this.j;
    }

    private void O() {
        this.G().v("logoutEmail");
        this.l.v("email_auth_hash");
        this.l.w("parent_player_id");
        this.l.w("email");
        this.l.q();
        this.A().v("email_auth_hash");
        this.A().w("parent_player_id");
        this.A().w("email");
        X1.u();
        I1.a(C.j, "Device successfully logged out of email: ");
    }

    protected abstract m2 P(String arg1, boolean arg2);

    protected abstract void Q(JSONObject arg1);

    boolean R() {
        boolean z = false;
        if(this.l != null) {
            synchronized(this.a) {
                if(this.A().d(this.l, this.N()) != null) {
                    z = true;
                }
                this.l.q();
                return z;
            }
        }
        return false;
    }

    void S(boolean z) {
        boolean z1 = this.c != z;
        this.c = z;
        if(z1 && z) {
            this.V();
        }
    }

    void T() {
        this.A().z(new JSONObject());
        this.A().q();
    }

    private boolean U(int v, String s, String s1) {
        if(v == 400 && s != null) {
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                return jSONObject0.has("errors") && jSONObject0.optString("errors").contains(s1);
            }
            catch(JSONException jSONException0) {
                jSONException0.printStackTrace();
            }
        }
        return false;
    }

    protected abstract void V();

    void W(JSONObject jSONObject0, g u1$g0) {
        U1.j(("players/" + this.B() + "/on_purchase"), jSONObject0, u1$g0);
    }

    void X(JSONObject jSONObject0, x i1$x0) {
        if(i1$x0 != null) {
            this.e.add(i1$x0);
        }
        this.H().h(jSONObject0, null);
    }

    private void Y(N i1$N0) {
        E.a(this.e.poll());
    }

    private void Z() {
        X1.i(false);
        E.a(this.e.poll());
    }

    void a0(String s, String s1, G i1$G0) {
        if(i1$G0 != null) {
            this.f.add(i1$G0);
        }
        m2 m20 = this.H();
        m20.t("external_user_id", s);
        if(s1 != null) {
            m20.t("external_user_id_auth_hash", s1);
        }
    }

    void b0() {
        try {
            synchronized(this.a) {
                this.H().s("session", Boolean.TRUE);
                this.H().q();
            }
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
    }

    private boolean c0() {
        return this.G().i().c("logoutEmail", false);
    }

    void d0(boolean z) {
        this.d.set(true);
        this.M(z);
        this.d.set(false);
    }

    void e0(JSONObject jSONObject0, b x1$b0) {
        if(x1$b0 != null) {
            this.g.add(x1$b0);
        }
        this.H().h(jSONObject0, null);
    }

    abstract void f0(String arg1);

    void g0(com.onesignal.N.d n$d0) {
        this.H().y(n$d0);
    }

    protected abstract void n(JSONObject arg1);

    void o() {
        this.G().b();
        this.G().q();
    }

    private void p(c x1$c0) {
        E.a(this.g.poll());
    }

    private void q() {
        X1.d();
        E.a(this.g.poll());
    }

    private void r(String s, JSONObject jSONObject0, JSONObject jSONObject1) {
        class com.onesignal.u2.d extends g {
            final JSONObject a;
            final JSONObject b;
            final String c;
            final u2 d;

            com.onesignal.u2.d(JSONObject jSONObject0, JSONObject jSONObject1, String s) {
                this.a = jSONObject0;
                this.b = jSONObject1;
                this.c = s;
                super();
            }

            @Override  // com.onesignal.U1$g
            void a(int v, String s, Throwable throwable0) {
                synchronized(u2.this.a) {
                    u2.this.j = false;
                    I1.a(C.i, "Failed last request. statusCode: " + v + "\nresponse: " + s);
                    if(u2.this.U(v, s, "not a valid device_type")) {
                        u2.this.J();
                    }
                    else {
                        u2.this.I(v);
                    }
                }
            }

            @Override  // com.onesignal.U1$g
            void b(String s) {
                synchronized(u2.this.a) {
                    u2.this.j = false;
                    u2.this.A().r(this.a, this.b);
                    try {
                        I1.p1(C.k, "doCreateOrNewSession:response: " + s);
                        JSONObject jSONObject0 = new JSONObject(s);
                        if(jSONObject0.has("id")) {
                            String s1 = jSONObject0.optString("id");
                            u2.this.f0(s1);
                            I1.a(C.j, "Device registered, UserId = " + s1);
                        }
                        else {
                            I1.a(C.j, "session sent, UserId = " + this.c);
                        }
                        u2.this.H().s("session", Boolean.FALSE);
                        u2.this.H().q();
                        if(jSONObject0.has("in_app_messages")) {
                            I1.m0().p0(jSONObject0.getJSONArray("in_app_messages"));
                        }
                        u2.this.Q(this.b);
                    }
                    catch(JSONException jSONException0) {
                        I1.b(C.h, "ERROR parsing on_session or create JSON Response.", jSONException0);
                    }
                }
            }
        }

        this.j = true;
        this.n(jSONObject0);
        U1.k((s == null ? "players" : "players/" + s + "/on_session"), jSONObject0, new com.onesignal.u2.d(this, jSONObject1, jSONObject0, s));
    }

    private void s(String s) {
        class com.onesignal.u2.b extends g {
            final u2 a;

            @Override  // com.onesignal.U1$g
            void a(int v, String s, Throwable throwable0) {
                I1.a(C.i, "Failed last request. statusCode: " + v + "\nresponse: " + s);
                if(u2.this.U(v, s, "already logged out of email")) {
                    u2.this.O();
                    return;
                }
                if(u2.this.U(v, s, "not a valid device_type")) {
                    u2.this.J();
                    return;
                }
                u2.this.I(v);
            }

            @Override  // com.onesignal.U1$g
            void b(String s) {
                u2.this.O();
            }
        }

        JSONObject jSONObject0 = new JSONObject();
        try {
            if(this.A().i().a("email_auth_hash")) {
                jSONObject0.put("email_auth_hash", "");
            }
            if(this.A().l().a("parent_player_id")) {
                jSONObject0.put("parent_player_id", "");
            }
            jSONObject0.put("app_id", "");
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        U1.k(("players/" + s + "/email_logout"), jSONObject0, new com.onesignal.u2.b(this));
    }

    private void t(String s, JSONObject jSONObject0, JSONObject jSONObject1) {
        class com.onesignal.u2.c extends g {
            final JSONObject a;
            final JSONObject b;
            final u2 c;

            com.onesignal.u2.c(JSONObject jSONObject0, JSONObject jSONObject1) {
                this.a = jSONObject0;
                this.b = jSONObject1;
                super();
            }

            @Override  // com.onesignal.U1$g
            void a(int v, String s, Throwable throwable0) {
                C i1$C0 = C.h;
                I1.a(i1$C0, "Failed PUT sync request with status code: " + v + " and response: " + s);
                synchronized(u2.this.a) {
                    if(u2.this.U(v, s, "No user with this id found")) {
                        u2.this.J();
                    }
                    else {
                        u2.this.I(v);
                    }
                }
                if(this.a.has("tags")) {
                    N i1$N0 = new N(v, s);
                    u2.this.Y(i1$N0);
                }
                if(this.a.has("external_user_id")) {
                    I1.p1(i1$C0, "Error setting external user id for push with status code: " + v + " and message: " + s);
                    u2.this.u();
                }
                if(this.a.has("language")) {
                    c x1$c0 = new c(v, s);
                    u2.this.p(x1$c0);
                }
            }

            @Override  // com.onesignal.U1$g
            void b(String s) {
                synchronized(u2.this.a) {
                    u2.this.A().r(this.b, this.a);
                    u2.this.Q(this.a);
                }
                if(this.a.has("tags")) {
                    u2.this.Z();
                }
                if(this.a.has("external_user_id")) {
                    u2.this.v();
                }
                if(this.a.has("language")) {
                    u2.this.q();
                }
            }
        }

        if(s == null) {
            I1.p1(this.C(), "Error updating the user record because of the null user id");
            this.Y(new N(-1, "Unable to update tags: the current user is not registered with OneSignal"));
            this.u();
            this.p(new c(-1, "Unable to set Language: the current user is not registered with OneSignal"));
            return;
        }
        U1.m(("players/" + s), jSONObject0, new com.onesignal.u2.c(this, jSONObject0, jSONObject1));
    }

    private void u() {
        G i1$G0;
        while((i1$G0 = (G)this.f.poll()) != null) {
            i1$G0.a(this.z(), false);
        }
    }

    private void v() {
        G i1$G0;
        while((i1$G0 = (G)this.f.poll()) != null) {
            i1$G0.a(this.z(), true);
        }
    }

    protected abstract void w(JSONObject arg1);

    private void x() {
        JSONObject jSONObject0 = this.A().d(this.l, false);
        if(jSONObject0 != null) {
            this.w(jSONObject0);
        }
        boolean z = !this.G().i().c("logoutEmail", false);
    }

    protected JSONObject y(JSONObject jSONObject0, JSONObject jSONObject1, JSONObject jSONObject2, Set set0) {
        synchronized(this.a) {
        }
        return com.onesignal.G.b(jSONObject0, jSONObject1, jSONObject2, set0);
    }

    String z() {
        return this.b.name().toLowerCase();
    }
}

