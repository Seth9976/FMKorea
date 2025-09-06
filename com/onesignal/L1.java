package com.onesignal;

import d3.e;
import e3.a;
import e3.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class l1 {
    public interface b {
        void a(List arg1);
    }

    protected e a;
    private b b;
    private Q0 c;

    public l1(b l1$b0, e e0, Q0 q00) {
        this.b = l1$b0;
        this.a = e0;
        this.c = q00;
    }

    void b(JSONObject jSONObject0, List list0) {
        this.c.d("OneSignal SessionManager addSessionData with influences: " + list0.toString());
        this.a.a(jSONObject0, list0);
        this.c.d("OneSignal SessionManager addSessionIds on jsonObject: " + jSONObject0);
    }

    void c(w i1$w0) {
        this.d(i1$w0, null);
    }

    private void d(w i1$w0, String s) {
        boolean z;
        a a1;
        this.c.d("OneSignal SessionManager attemptSessionUpgrade with entryAction: " + i1$w0);
        d3.a a0 = this.a.b(i1$w0);
        List list0 = this.a.d(i1$w0);
        ArrayList arrayList0 = new ArrayList();
        if(a0 == null) {
            z = false;
            a1 = null;
        }
        else {
            a1 = a0.e();
            c c0 = c.g;
            if(s == null) {
                s = a0.g();
            }
            z = this.o(a0, c0, s, null);
        }
        if(z) {
            this.c.d("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: " + list0);
            arrayList0.add(a1);
            for(Object object0: list0) {
                d3.a a2 = (d3.a)object0;
            }
        }
        this.c.d("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        for(Object object1: list0) {
            d3.a a3 = (d3.a)object1;
        }
        I1.a(C.k, "Trackers after update attempt: " + this.a.c().toString());
        this.n(arrayList0);
    }

    List e() {
        return this.a.f();
    }

    List f() {
        return this.a.h();
    }

    void g() {
        this.a.i();
    }

    void h(String s) {
        this.c.d("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: " + s);
        this.o(this.a.e(), c.g, s, null);
    }

    void i() {
        this.c.d("OneSignal SessionManager onDirectInfluenceFromIAMClickFinished");
        this.a.e().t();
    }

    void j(w i1$w0, String s) {
        this.c.d("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: " + s);
        if(s != null && !s.isEmpty()) {
            this.d(i1$w0, s);
        }
    }

    void k(String s) {
        this.c.d("OneSignal SessionManager onInAppMessageReceived messageId: " + s);
        d3.a a0 = this.a.e();
        a0.v(s);
        a0.t();
    }

    void l(String s) {
        this.c.d("OneSignal SessionManager onNotificationReceived notificationId: " + s);
        if(s != null && !s.isEmpty()) {
            this.a.g().v(s);
        }
    }

    void m(w i1$w0) {
        List list0 = this.a.d(i1$w0);
        ArrayList arrayList0 = new ArrayList();
        this.c.d("OneSignal SessionManager restartSessionIfNeeded with entryAction: " + i1$w0 + "\n channelTrackers: " + list0.toString());
        for(Object object0: list0) {
            d3.a a0 = (d3.a)object0;
            JSONArray jSONArray0 = a0.n();
            this.c.d("OneSignal SessionManager restartSessionIfNeeded lastIds: " + jSONArray0);
            a a1 = a0.e();
            if((jSONArray0.length() <= 0 ? this.o(a0, c.i, null, null) : this.o(a0, c.h, null, jSONArray0))) {
                arrayList0.add(a1);
            }
        }
        this.n(arrayList0);
    }

    private void n(List list0) {
        class com.onesignal.l1.a implements Runnable {
            final List f;
            final l1 g;

            com.onesignal.l1.a(List list0) {
                this.f = list0;
                super();
            }

            @Override
            public void run() {
                Thread.currentThread().setPriority(10);
                l1.this.b.a(this.f);
            }
        }

        this.c.d("OneSignal SessionManager sendSessionEndingWithInfluences with influences: " + list0);
        if(list0.size() > 0) {
            new Thread(new com.onesignal.l1.a(this, list0), "OS_END_CURRENT_SESSION").start();
        }
    }

    private boolean o(d3.a a0, c c0, String s, JSONArray jSONArray0) {
        if(!this.p(a0, c0, s, jSONArray0)) {
            return false;
        }
        I1.a(C.k, "OSChannelTracker changed: " + a0.h() + "\nfrom:\ninfluenceType: " + a0.k() + ", directNotificationId: " + a0.g() + ", indirectNotificationIds: " + a0.j() + "\nto:\ninfluenceType: " + c0 + ", directNotificationId: " + s + ", indirectNotificationIds: " + jSONArray0);
        a0.y(c0);
        a0.w(s);
        a0.x(jSONArray0);
        a0.b();
        I1.a(C.k, "Trackers changed to: " + this.a.c().toString());
        return true;
    }

    // 去混淆评级： 中等(90)
    private boolean p(d3.a a0, c c0, String s, JSONArray jSONArray0) {
        return !c0.equals(a0.k());
    }
}

