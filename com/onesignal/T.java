package com.onesignal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

class t {
    static enum a {
        BACKGROUND,
        END_SESSION;

    }

    static class b extends c {
        b() {
            this.a = 1L;
            this.b = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
        }

        @Override  // com.onesignal.t$c
        protected void h(JSONObject jSONObject0) {
            I1.D0().b(jSONObject0, this.j());
        }

        @Override  // com.onesignal.t$c
        protected List j() {
            List list0 = new ArrayList();
            for(Object object0: S1.g("I1", "PREFS_OS_ATTRIBUTED_INFLUENCES", new HashSet())) {
                String s = (String)object0;
                try {
                    list0.add(new e3.a(s));
                }
                catch(JSONException jSONException0) {
                    I1.a(C.h, this.getClass().getSimpleName() + ": error generation OSInfluence from json object: " + jSONException0);
                }
            }
            return list0;
        }

        @Override  // com.onesignal.t$c
        protected void m(List list0) {
            HashSet hashSet0 = new HashSet();
            for(Object object0: list0) {
                e3.a a0 = (e3.a)object0;
                try {
                    hashSet0.add(a0.g());
                }
                catch(JSONException jSONException0) {
                    I1.a(C.h, this.getClass().getSimpleName() + ": error generation json object OSInfluence: " + jSONException0);
                }
            }
            S1.n("I1", "PREFS_OS_ATTRIBUTED_INFLUENCES", hashSet0);
        }

        @Override  // com.onesignal.t$c
        protected void r(a t$a0) {
            I1.p1(C.k, this.getClass().getSimpleName() + " sendTime with: " + t$a0);
            if(t$a0.equals(a.g)) {
                this.u();
                return;
            }
            q1.q().s(I1.b);
        }
    }

    static abstract class c {
        protected long a;
        protected String b;
        private Long c;
        private final AtomicBoolean d;

        c() {
            this.c = null;
            this.d = new AtomicBoolean();
        }

        static void a(c t$c0, long v, List list0) {
            t$c0.n(v, list0);
        }

        static void b(c t$c0) {
            t$c0.s();
        }

        static void d(c t$c0, a t$a0) {
            t$c0.t(t$a0);
        }

        static void e(c t$c0, long v, List list0, a t$a0) {
            t$c0.g(v, list0, t$a0);
        }

        private void g(long v, List list0, a t$a0) {
            this.n(v, list0);
            this.t(t$a0);
        }

        protected void h(JSONObject jSONObject0) {
        }

        private JSONObject i(long v) {
            JSONObject jSONObject0 = new JSONObject().put("app_id", I1.z0()).put("type", 1).put("state", "ping").put("active_time", v).put("device_type", new OSUtils().e());
            I1.y(jSONObject0);
            return jSONObject0;
        }

        protected abstract List j();

        private long k() {
            if(this.c == null) {
                this.c = S1.d("I1", this.b, 0L);
            }
            I1.a(C.k, this.getClass().getSimpleName() + ":getUnsentActiveTime: " + this.c);
            return (long)this.c;
        }

        private boolean l() {
            return this.k() >= this.a;
        }

        protected abstract void m(List arg1);

        private void n(long v, List list0) {
            I1.a(C.k, this.getClass().getSimpleName() + ":saveUnsentActiveData with lastFocusTimeInfluences: " + list0.toString());
            long v1 = this.k();
            this.m(list0);
            this.o(v1 + v);
        }

        private void o(long v) {
            this.c = v;
            I1.a(C.k, this.getClass().getSimpleName() + ":saveUnsentActiveTime: " + this.c);
            S1.l("I1", this.b, v);
        }

        private void p(long v) {
            try {
                I1.a(C.k, this.getClass().getSimpleName() + ":sendOnFocus with totalTimeActive: " + v);
                JSONObject jSONObject0 = this.i(v);
                this.h(jSONObject0);
                this.q(I1.L0(), jSONObject0);
                if(I1.T0()) {
                    this.q(I1.i0(), this.i(v));
                }
                if(I1.U0()) {
                    this.q(I1.x0(), this.i(v));
                }
                this.m(new ArrayList());
                return;
            }
            catch(JSONException jSONException0) {
            }
            I1.b(C.h, "Generating on_focus:JSON Failed.", jSONException0);
        }

        private void q(String s, JSONObject jSONObject0) {
            class com.onesignal.t.c.a extends g {
                final c a;

                @Override  // com.onesignal.U1$g
                void a(int v, String s, Throwable throwable0) {
                    I1.g1("sending on_focus Failed", v, throwable0, s);
                }

                @Override  // com.onesignal.U1$g
                void b(String s) {
                    c.this.o(0L);
                }
            }

            U1.k(("players/" + s + "/on_focus"), jSONObject0, new com.onesignal.t.c.a(this));
        }

        protected abstract void r(a arg1);

        private void s() {
            List list0 = this.j();
            long v = this.k();
            I1.a(C.k, this.getClass().getSimpleName() + ":sendUnsentTimeNow with time: " + v + " and influences: " + list0.toString());
            this.t(a.f);
        }

        private void t(a t$a0) {
            if(!I1.V0()) {
                I1.a(C.i, this.getClass().getSimpleName() + ":sendUnsentTimeNow not possible due to user id null");
                return;
            }
            this.r(t$a0);
        }

        protected void u() {
            if(this.d.get()) {
                return;
            }
            synchronized(this.d) {
                this.d.set(true);
                if(this.l()) {
                    this.p(this.k());
                }
                this.d.set(false);
            }
        }

        private void v() {
            if(this.l()) {
                this.u();
            }
        }

        protected void w() {
            if(!this.l()) {
                return;
            }
            q1.q().s(I1.b);
        }
    }

    static class d extends c {
        d() {
            this.a = 60L;
            this.b = "GT_UNSENT_ACTIVE_TIME";
        }

        @Override  // com.onesignal.t$c
        protected List j() {
            return new ArrayList();
        }

        @Override  // com.onesignal.t$c
        protected void m(List list0) {
        }

        @Override  // com.onesignal.t$c
        protected void r(a t$a0) {
            I1.p1(C.k, this.getClass().getSimpleName() + " sendTime with: " + t$a0);
            if(t$a0.equals(a.g)) {
                return;
            }
            this.w();
        }
    }

    private Long a;
    private Object b;
    private y0 c;
    private Q0 d;

    t(y0 y00, Q0 q00) {
        this.b = new Object();
        this.c = y00;
        this.d = q00;
    }

    void a() {
        synchronized(this.b) {
            this.d.d("Application backgrounded focus time: " + this.a);
            c.b(this.c.b());
            this.a = null;
        }
    }

    void b() {
        synchronized(this.b) {
            this.a = I1.H0().b();
            this.d.d("Application foregrounded focus time: " + this.a);
        }
    }

    void c() {
        Long long0 = this.e();
        synchronized(this.b) {
            this.d.d("Application stopped focus time: " + this.a + " timeElapsed: " + long0);
        }
        if(long0 == null) {
            return;
        }
        List list0 = I1.D0().f();
        c.a(this.c.c(list0), ((long)long0), list0);
    }

    void d() {
        if(I1.a1()) {
            return;
        }
        this.c.b().v();
    }

    private Long e() {
        synchronized(this.b) {
            if(this.a == null) {
                return null;
            }
            long v1 = (long)(((double)(I1.H0().b() - ((long)this.a))) / 1000.0 + 0.5);
            return v1 >= 1L && v1 <= 86400L ? v1 : null;
        }
    }

    private boolean f(List list0, a t$a0) {
        Long long0 = this.e();
        if(long0 == null) {
            return false;
        }
        c.e(this.c.c(list0), ((long)long0), list0, t$a0);
        return true;
    }

    void g(List list0) {
        a t$a0 = a.g;
        if(!this.f(list0, t$a0)) {
            c.d(this.c.c(list0), t$a0);
        }
    }
}

