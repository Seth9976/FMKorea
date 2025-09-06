package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.p;
import com.facebook.internal.r;
import com.facebook.internal.v;
import com.facebook.n;
import com.facebook.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

abstract class e {
    static final class a implements Runnable {
        @Override
        public void run() {
            if(b1.a.d(this)) {
                return;
            }
            try {
                e.b(null);
                if(g.d() != com.facebook.appevents.g.a.g) {
                    e.l(j.g);
                }
            }
            catch(Throwable throwable0) {
                b1.a.b(throwable0, this);
            }
        }
    }

    private static final String a = "com.facebook.appevents.e";
    private static final Integer b;
    private static volatile d c;
    private static final ScheduledExecutorService d;
    private static ScheduledFuture e;
    private static final Runnable f;

    static {
        e.b = 100;
        e.c = new d();
        e.d = Executors.newSingleThreadScheduledExecutor();
        e.f = new a();
    }

    // 去混淆评级： 低(20)
    static ScheduledFuture a() {
        return b1.a.d(e.class) ? null : e.e;
    }

    static ScheduledFuture b(ScheduledFuture scheduledFuture0) {
        if(b1.a.d(e.class)) {
            return null;
        }
        e.e = scheduledFuture0;
        return scheduledFuture0;
    }

    // 去混淆评级： 低(20)
    static d c() {
        return b1.a.d(e.class) ? null : e.c;
    }

    static d d(d d0) {
        if(b1.a.d(e.class)) {
            return null;
        }
        e.c = d0;
        return d0;
    }

    // 去混淆评级： 低(20)
    static Integer e() {
        return b1.a.d(e.class) ? null : e.b;
    }

    // 去混淆评级： 低(20)
    static Runnable f() {
        return b1.a.d(e.class) ? null : e.f;
    }

    // 去混淆评级： 低(20)
    static ScheduledExecutorService g() {
        return b1.a.d(e.class) ? null : e.d;
    }

    public static void h(com.facebook.appevents.a a0, c c0) {
        static final class com.facebook.appevents.e.d implements Runnable {
            final com.facebook.appevents.a f;
            final c g;

            com.facebook.appevents.e.d(com.facebook.appevents.a a0, c c0) {
                this.f = a0;
                this.g = c0;
                super();
            }

            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    e.c().a(this.f, this.g);
                    if(g.d() != com.facebook.appevents.g.a.g && e.c().d() > ((int)e.e())) {
                        e.l(j.j);
                        return;
                    }
                    if(e.a() == null) {
                        e.b(e.g().schedule(e.f(), 15L, TimeUnit.SECONDS));
                    }
                    return;
                }
                catch(Throwable throwable0) {
                }
                b1.a.b(throwable0, this);
            }
        }

        Class class0 = e.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            com.facebook.appevents.e.d e$d0 = new com.facebook.appevents.e.d(a0, c0);
            e.d.execute(e$d0);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    static GraphRequest i(com.facebook.appevents.a a0, o o0, boolean z, l l0) {
        static final class com.facebook.appevents.e.e implements com.facebook.GraphRequest.e {
            final com.facebook.appevents.a a;
            final GraphRequest b;
            final o c;
            final l d;

            com.facebook.appevents.e.e(com.facebook.appevents.a a0, GraphRequest graphRequest0, o o0, l l0) {
                this.a = a0;
                this.b = graphRequest0;
                this.c = o0;
                this.d = l0;
                super();
            }

            @Override  // com.facebook.GraphRequest$e
            public void a(n n0) {
                e.n(this.a, this.b, n0, this.c, this.d);
            }
        }

        boolean z1 = false;
        Class class0 = e.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            String s = a0.b();
            p p0 = r.o(s, false);
            GraphRequest graphRequest0 = GraphRequest.K(null, String.format("%s/activities", s), null, null);
            Bundle bundle0 = graphRequest0.y();
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            bundle0.putString("access_token", a0.a());
            String s1 = m.d();
            if(s1 != null) {
                bundle0.putString("device_token", s1);
            }
            String s2 = h.g();
            if(s2 != null) {
                bundle0.putString("install_referrer", s2);
            }
            graphRequest0.Z(bundle0);
            if(p0 != null) {
                z1 = p0.l();
            }
            int v = o0.f(graphRequest0, com.facebook.h.e(), z1, z);
            if(v == 0) {
                return null;
            }
            l0.a += v;
            graphRequest0.V(new com.facebook.appevents.e.e(a0, graphRequest0, o0, l0));
            return graphRequest0;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
        return null;
    }

    static List j(d d0, l l0) {
        Class class0 = e.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            boolean z = com.facebook.h.q(com.facebook.h.e());
            List list0 = new ArrayList();
            for(Object object0: d0.f()) {
                GraphRequest graphRequest0 = e.i(((com.facebook.appevents.a)object0), d0.c(((com.facebook.appevents.a)object0)), z, l0);
                if(graphRequest0 != null) {
                    list0.add(graphRequest0);
                }
            }
            return list0;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    public static void k(j j0) {
        static final class com.facebook.appevents.e.c implements Runnable {
            final j f;

            com.facebook.appevents.e.c(j j0) {
                this.f = j0;
                super();
            }

            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    e.l(this.f);
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        Class class0 = e.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            com.facebook.appevents.e.c e$c0 = new com.facebook.appevents.e.c(j0);
            e.d.execute(e$c0);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    static void l(j j0) {
        l l0;
        Class class0 = e.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            com.facebook.appevents.n n0 = f.c();
            e.c.b(n0);
            try {
                l0 = e.p(j0, e.c);
            }
            catch(Exception exception0) {
                Log.w("com.facebook.appevents.e", "Caught unexpected exception while flushing app events: ", exception0);
                return;
            }
            if(l0 != null) {
                Intent intent0 = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent0.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", l0.a);
                intent0.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", l0.b);
                X.a.b(com.facebook.h.e()).d(intent0);
                return;
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
    }

    public static Set m() {
        Class class0 = e.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            return e.c.f();
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    static void n(com.facebook.appevents.a a0, GraphRequest graphRequest0, n n0, o o0, l l0) {
        static final class com.facebook.appevents.e.f implements Runnable {
            final com.facebook.appevents.a f;
            final o g;

            com.facebook.appevents.e.f(com.facebook.appevents.a a0, o o0) {
                this.f = a0;
                this.g = o0;
                super();
            }

            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    f.a(this.f, this.g);
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        String s2;
        boolean z = true;
        Class class0 = e.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            FacebookRequestError facebookRequestError0 = n0.g();
            String s = "Success";
            k k0 = k.f;
            if(facebookRequestError0 != null) {
                if(facebookRequestError0.c() == -1) {
                    s = "Failed: No Connectivity";
                    k0 = k.h;
                }
                else {
                    s = String.format("Failed:\n  Response: %s\n  Error %s", n0.toString(), facebookRequestError0.toString());
                    k0 = k.g;
                }
            }
            if(com.facebook.h.x(q.j)) {
                String s1 = (String)graphRequest0.A();
                try {
                    s2 = "<Can\'t encode events for debug logging>";
                    s2 = new JSONArray(s1).toString(2);
                }
                catch(JSONException unused_ex) {
                }
                v.i(q.j, "com.facebook.appevents.e", "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", new Object[]{graphRequest0.t().toString(), s, s2});
            }
            if(facebookRequestError0 == null) {
                z = false;
            }
            o0.b(z);
            k k1 = k.h;
            if(k0 == k1) {
                com.facebook.h.m().execute(new com.facebook.appevents.e.f(a0, o0));
            }
            if(k0 != k.f && l0.b != k1) {
                l0.b = k0;
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
    }

    public static void o() {
        static final class b implements Runnable {
            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    f.b(e.c());
                    e.d(new d());
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        Class class0 = e.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            b e$b0 = new b();
            e.d.execute(e$b0);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    private static l p(j j0, d d0) {
        Class class0 = e.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            l l0 = new l();
            List list0 = e.j(d0, l0);
            if(list0.size() > 0) {
                v.i(q.j, "com.facebook.appevents.e", "Flushing %d events due to %s.", new Object[]{l0.a, j0.toString()});
                for(Object object0: list0) {
                    ((GraphRequest)object0).g();
                }
                return l0;
            }
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
        return null;
    }
}

