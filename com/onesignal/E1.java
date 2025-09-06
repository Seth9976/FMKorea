package com.onesignal;

import e3.b;
import e3.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class e1 {
    static abstract class f {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[b.values().length];
            f.b = arr_v;
            try {
                arr_v[b.h.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                f.b[b.i.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[c.values().length];
            f.a = arr_v1;
            try {
                arr_v1[c.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                f.a[c.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                f.a[c.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                f.a[c.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private Set a;
    private final g3.c b;
    private final l1 c;

    public e1(l1 l10, g3.c c0) {
        this.c = l10;
        this.b = c0;
        this.g();
    }

    void d() {
        class a implements Runnable {
            final e1 f;

            @Override
            public void run() {
                Thread.currentThread().setPriority(10);
                e1.this.b.b().e("notification", "notification_id");
            }
        }

        new Thread(new a(this), "OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD").start();
    }

    void e() {
        I1.a(C.k, "OneSignal cleanOutcomes for session");
        this.a = OSUtils.K();
        this.j();
    }

    private List f(String s, List list0) {
        List list1 = this.b.b().a(s, list0);
        return list1.size() > 0 ? list1 : null;
    }

    private void g() {
        this.a = OSUtils.K();
        Set set0 = this.b.b().i();
        if(set0 != null) {
            this.a = set0;
        }
    }

    private List h(List list0) {
        List list1 = new ArrayList(list0);
        for(Object object0: list0) {
            e3.a a0 = (e3.a)object0;
        }
        return list1;
    }

    private void i(h3.b b0) {
        class e implements Runnable {
            final h3.b f;
            final e1 g;

            e(h3.b b0) {
                this.f = b0;
                super();
            }

            @Override
            public void run() {
                Thread.currentThread().setPriority(10);
                e1.this.b.b().f(this.f);
            }
        }

        new Thread(new e(this, b0), "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS").start();
    }

    private void j() {
        this.b.b().c(this.a);
    }

    private void k(h3.b b0) {
        if(b0.e()) {
            this.j();
            return;
        }
        this.i(b0);
    }

    private void l(String s, float f, List list0, K i1$K0) {
        class d implements L1 {
            final h3.b a;
            final long b;
            final String c;
            final e1 d;

            d(h3.b b0, K i1$K0, long v, String s) {
                this.a = b0;
                this.b = v;
                this.c = s;
                super();
            }

            @Override  // com.onesignal.L1
            public void a(int v, String s, Throwable throwable0) {
                class com.onesignal.e1.d.a implements Runnable {
                    final d f;

                    @Override
                    public void run() {
                        Thread.currentThread().setPriority(10);
                        d.this.a.f(d.this.b);
                        e1.this.b.b().g(d.this.a);
                    }
                }

                new Thread(new com.onesignal.e1.d.a(this), "OS_SAVE_OUTCOMES").start();
                I1.p1(C.i, "Sending outcome with name: " + this.c + " failed with status code: " + v + " and response: " + s + "\nOutcome event was cached and will be reattempted on app cold start");
            }

            @Override  // com.onesignal.L1
            public void onSuccess(String s) {
                e1.this.k(this.a);
            }
        }

        long v = I1.H0().a();
        int v1 = new OSUtils().e();
        String s1 = I1.d;
        boolean z = false;
        h3.e e0 = null;
        h3.e e1 = null;
        for(Object object0: list0) {
            e3.a a0 = (e3.a)object0;
            switch(f.a[a0.d().ordinal()]) {
                case 1: {
                    if(e0 == null) {
                        e0 = new h3.e();
                    }
                    e0 = this.t(a0, e0);
                    break;
                }
                case 2: {
                    if(e1 == null) {
                        e1 = new h3.e();
                    }
                    e1 = this.t(a0, e1);
                    break;
                }
                case 3: {
                    z = true;
                    break;
                }
                case 4: {
                    I1.a(C.l, "Outcomes disabled for channel: " + a0.c());
                    if(i1$K0 != null) {
                        i1$K0.a(null);
                    }
                    return;
                }
            }
        }
        if(e0 == null && e1 == null && !z) {
            I1.a(C.l, "Outcomes disabled for all channels");
            if(i1$K0 != null) {
                i1$K0.a(null);
            }
            return;
        }
        h3.b b0 = new h3.b(s, new h3.d(e0, e1), f, 0L);
        d e1$d0 = new d(this, b0, i1$K0, v / 1000L, s);
        this.b.b().h(s1, v1, b0, e1$d0);
    }

    void m(List list0) {
        for(Object object0: list0) {
            G0 g00 = (G0)object0;
            String s = g00.a();
            if(g00.c()) {
                this.r(s, null);
            }
            else if(g00.b() > 0.0f) {
                this.o(s, g00.b(), null);
            }
            else {
                this.n(s, null);
            }
        }
    }

    void n(String s, K i1$K0) {
        this.l(s, 0.0f, this.c.e(), i1$K0);
    }

    void o(String s, float f, K i1$K0) {
        this.l(s, f, this.c.e(), i1$K0);
    }

    private void p(h3.b b0) {
        class com.onesignal.e1.c implements L1 {
            final h3.b a;
            final e1 b;

            com.onesignal.e1.c(h3.b b0) {
                this.a = b0;
                super();
            }

            @Override  // com.onesignal.L1
            public void a(int v, String s, Throwable throwable0) {
            }

            @Override  // com.onesignal.L1
            public void onSuccess(String s) {
                e1.this.b.b().d(this.a);
            }
        }

        int v = new OSUtils().e();
        String s = I1.d;
        com.onesignal.e1.c e1$c0 = new com.onesignal.e1.c(this, b0);
        this.b.b().h(s, v, b0, e1$c0);
    }

    void q() {
        class com.onesignal.e1.b implements Runnable {
            final e1 f;

            @Override
            public void run() {
                Thread.currentThread().setPriority(10);
                for(Object object0: e1.this.b.b().b()) {
                    e1.this.p(((h3.b)object0));
                }
            }
        }

        new Thread(new com.onesignal.e1.b(this), "OS_SEND_SAVED_OUTCOMES").start();
    }

    void r(String s, K i1$K0) {
        this.s(s, this.c.e(), i1$K0);
    }

    private void s(String s, List list0, K i1$K0) {
        List list1 = this.h(list0);
        if(list1.isEmpty()) {
            I1.a(C.k, "Unique Outcome disabled for current session");
            return;
        }
        for(Object object0: list1) {
            if(((e3.a)object0).d().f()) {
                List list2 = this.f(s, list1);
                if(list2 == null) {
                    I1.a(C.k, "Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: " + list1.toString() + "\nOutcome name: " + s);
                    if(i1$K0 != null) {
                        i1$K0.a(null);
                    }
                    return;
                }
                this.l(s, 0.0f, list2, i1$K0);
                return;
            }
            if(false) {
                break;
            }
        }
        if(this.a.contains(s)) {
            I1.a(C.k, "Measure endpoint will not send because unique outcome already sent for: \nSession: " + c.i + "\nOutcome name: " + s);
            if(i1$K0 != null) {
                i1$K0.a(null);
            }
            return;
        }
        this.a.add(s);
        this.l(s, 0.0f, list1, i1$K0);
    }

    private h3.e t(e3.a a0, h3.e e0) {
        switch(f.b[a0.c().ordinal()]) {
            case 1: {
                e0.c(a0.b());
                return e0;
            }
            case 2: {
                e0.d(a0.b());
                return e0;
            }
            default: {
                return e0;
            }
        }
    }
}

