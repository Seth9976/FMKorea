package com.onesignal;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class a implements b {
    static abstract class com.onesignal.a.b {
        abstract void a(Activity arg1);

        void b(Activity activity0) {
        }
    }

    static class c implements ViewTreeObserver.OnGlobalLayoutListener {
        private final com.onesignal.r1.c f;
        private final b g;
        private final String h;

        private c(b r1$b0, com.onesignal.r1.c r1$c0, String s) {
            this.g = r1$b0;
            this.f = r1$c0;
            this.h = s;
        }

        c(b r1$b0, com.onesignal.r1.c r1$c0, String s, com.onesignal.a.a a$a0) {
            this(r1$b0, r1$c0, s);
        }

        @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
        public void onGlobalLayout() {
            if(!D1.j(new WeakReference(I1.Z()))) {
                this.g.a(this.h, this);
                this.f.c();
            }
        }
    }

    private final OSFocusHandler a;
    private Activity b;
    private boolean c;
    private static final Map d;
    private static final Map e;
    private static final Map f;

    static {
        a.d = new ConcurrentHashMap();
        a.e = new ConcurrentHashMap();
        a.f = new ConcurrentHashMap();
    }

    public a(OSFocusHandler oSFocusHandler0) {
        this.b = null;
        this.c = false;
        this.a = oSFocusHandler0;
    }

    @Override  // com.onesignal.r1$b
    public void a(String s, c a$c0) {
        Activity activity0 = this.b;
        if(activity0 != null) {
            activity0.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(a$c0);
        }
        a.f.remove(s);
        a.e.remove(s);
    }

    void c(String s, com.onesignal.a.b a$b0) {
        a.d.put(s, a$b0);
        Activity activity0 = this.b;
        if(activity0 != null) {
            a$b0.a(activity0);
        }
    }

    void d(String s, com.onesignal.r1.c r1$c0) {
        Activity activity0 = this.b;
        if(activity0 != null) {
            ViewTreeObserver viewTreeObserver0 = activity0.getWindow().getDecorView().getViewTreeObserver();
            c a$c0 = new c(this, r1$c0, s, null);
            viewTreeObserver0.addOnGlobalLayoutListener(a$c0);
            a.f.put(s, a$c0);
        }
        a.e.put(s, r1$c0);
    }

    public Activity e() {
        return this.b;
    }

    private void f() {
        C i1$C0 = C.k;
        I1.p1(i1$C0, "ActivityLifecycleHandler handleFocus, nextResumeIsFirstActivity: " + this.c);
        if(!this.c) {
            I1.p1(i1$C0, "ActivityLifecycleHandler cancel background lost focus worker");
            this.a.e("FOCUS_LOST_WORKER_TAG", I1.b);
            return;
        }
        I1.p1(i1$C0, "ActivityLifecycleHandler reset background state, call app focus");
        this.c = false;
        this.a.j();
    }

    private void g() {
        class com.onesignal.a.a extends Thread {
            final a f;

            @Override
            public void run() {
                I1.l0().c();
                a.this.a.k("FOCUS_LOST_WORKER_TAG", 2000L, I1.b);
            }
        }

        I1.p1(C.k, "ActivityLifecycleHandler Handling lost focus");
        if(this.a != null) {
            new com.onesignal.a.a(this).start();
        }
    }

    private void h() {
        I1.a(C.k, "curActivity is NOW: " + (this.b == null ? "null" : "" + this.b.getClass().getName() + ":" + this.b));
    }

    private void i(int v, Activity activity0) {
        switch(v) {
            case 1: {
                I1.p1(C.k, "Configuration Orientation Change: PORTRAIT (" + 1 + ") on activity: " + activity0);
                return;
            }
            case 2: {
                I1.p1(C.k, "Configuration Orientation Change: LANDSCAPE (" + 2 + ") on activity: " + activity0);
            }
        }
    }

    void j(Activity activity0) {
    }

    void k(Activity activity0) {
        I1.a(C.k, "onActivityDestroyed: " + activity0);
        a.f.clear();
        if(activity0 == this.b) {
            this.b = null;
            this.g();
        }
        this.h();
    }

    void l(Activity activity0) {
        I1.a(C.k, "onActivityPaused: " + activity0);
        if(activity0 == this.b) {
            this.b = null;
            this.g();
        }
        this.h();
    }

    void m(Activity activity0) {
        I1.a(C.k, "onActivityResumed: " + activity0);
        this.s(activity0);
        this.h();
        this.f();
    }

    void n(Activity activity0) {
        this.a.l();
    }

    void o(Activity activity0) {
        I1.a(C.k, "onActivityStopped: " + activity0);
        if(activity0 == this.b) {
            this.b = null;
            this.g();
        }
        for(Object object0: a.d.entrySet()) {
            ((com.onesignal.a.b)((Map.Entry)object0).getValue()).b(activity0);
        }
        this.h();
        if(this.b == null) {
            this.a.m();
        }
    }

    void p(Configuration configuration0, Activity activity0) {
        if(this.b != null && OSUtils.q(this.b, 0x80)) {
            this.i(configuration0.orientation, activity0);
            this.q(activity0);
        }
    }

    private void q(Activity activity0) {
        this.g();
        for(Object object0: a.d.entrySet()) {
            ((com.onesignal.a.b)((Map.Entry)object0).getValue()).b(activity0);
        }
        for(Object object1: a.d.entrySet()) {
            ((com.onesignal.a.b)((Map.Entry)object1).getValue()).a(this.b);
        }
        ViewTreeObserver viewTreeObserver0 = this.b.getWindow().getDecorView().getViewTreeObserver();
        for(Object object2: a.e.entrySet()) {
            c a$c0 = new c(this, ((com.onesignal.r1.c)((Map.Entry)object2).getValue()), ((String)((Map.Entry)object2).getKey()), null);
            viewTreeObserver0.addOnGlobalLayoutListener(a$c0);
            String s = (String)((Map.Entry)object2).getKey();
            a.f.put(s, a$c0);
        }
        this.f();
    }

    void r(String s) {
        a.d.remove(s);
    }

    public void s(Activity activity0) {
        this.b = activity0;
        for(Object object0: a.d.entrySet()) {
            ((com.onesignal.a.b)((Map.Entry)object0).getValue()).a(this.b);
        }
        try {
            ViewTreeObserver viewTreeObserver0 = this.b.getWindow().getDecorView().getViewTreeObserver();
            for(Object object1: a.e.entrySet()) {
                c a$c0 = new c(this, ((com.onesignal.r1.c)((Map.Entry)object1).getValue()), ((String)((Map.Entry)object1).getKey()), null);
                viewTreeObserver0.addOnGlobalLayoutListener(a$c0);
                String s = (String)((Map.Entry)object1).getKey();
                a.f.put(s, a$c0);
            }
        }
        catch(RuntimeException runtimeException0) {
            runtimeException0.printStackTrace();
        }
    }

    void t(boolean z) {
        this.c = z;
    }
}

