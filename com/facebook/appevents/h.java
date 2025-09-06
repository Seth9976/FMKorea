package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.e;
import com.facebook.internal.F;
import com.facebook.internal.G;
import com.facebook.internal.l;
import com.facebook.internal.o;
import com.facebook.internal.r;
import com.facebook.internal.s;
import com.facebook.internal.v;
import com.facebook.q;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

class h {
    private final String a;
    private final a b;
    private static final String c = "com.facebook.appevents.h";
    private static ScheduledThreadPoolExecutor d;
    private static com.facebook.appevents.g.a e;
    private static final Object f;
    private static String g;
    private static boolean h;
    private static String i;

    static {
        h.e = com.facebook.appevents.g.a.f;
        h.f = new Object();
    }

    h(Context context0, String s, AccessToken accessToken0) {
        this(F.p(context0), s, accessToken0);
    }

    h(String s, String s1, AccessToken accessToken0) {
        G.k();
        this.a = s;
        if(accessToken0 == null) {
            accessToken0 = AccessToken.g();
        }
        if(accessToken0 == null || accessToken0.u() || s1 != null && !s1.equals(accessToken0.f())) {
            if(s1 == null) {
                s1 = F.y(com.facebook.h.e());
            }
            this.b = new a(null, s1);
        }
        else {
            this.b = new a(accessToken0);
        }
        h.j();
    }

    static void a(Application application0, String s) {
        Class class0 = h.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            if(!com.facebook.h.v()) {
                throw new e("The Facebook sdk must be initialized before calling activateApp");
            }
            b.d();
            p.g();
            if(s == null) {
                s = com.facebook.h.f();
            }
            com.facebook.h.A(application0, s);
            S0.a.x(application0, s);
            return;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
    }

    static void b() {
        Class class0 = h.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            if(h.f() != com.facebook.appevents.g.a.g) {
                com.facebook.appevents.e.k(j.k);
            }
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    void c() {
        if(b1.a.d(this)) {
            return;
        }
        try {
            com.facebook.appevents.e.k(j.f);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
        }
    }

    static Executor d() {
        Class class0 = h.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            if(h.d == null) {
                h.j();
                return h.d;
            }
            return h.d;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
        return null;
    }

    static String e(Context context0) {
        if(b1.a.d(h.class)) {
            return null;
        }
        try {
            if(h.g == null) {
                Object object0 = h.f;
                synchronized(object0) {
                    if(h.g == null) {
                        String s = context0.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                        h.g = s;
                        if(s == null) {
                            h.g = "XZ0412fc52-9d53-4c0a-8314-c3e3262b56a8";
                            context0.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", h.g).apply();
                        }
                    }
                    return h.g;
                }
            }
            return h.g;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, h.class);
        return null;
    }

    // 去混淆评级： 低(20)
    static com.facebook.appevents.g.a f() {
        return b1.a.d(h.class) ? null : h.e;
    }

    static String g() {
        static final class com.facebook.appevents.h.b implements com.facebook.internal.s.a {
            @Override  // com.facebook.internal.s$a
            public void a(String s) {
                h.v(s);
            }
        }

        Class class0 = h.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            s.d((String s) -> {
                Class class0 = h.class;
                if(b1.a.d(class0)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences0 = com.facebook.h.e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                    if(s != null) {
                        sharedPreferences0.edit().putString("install_referrer", s).apply();
                    }
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, class0);
                }
            });
            return com.facebook.h.e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    // 去混淆评级： 低(20)
    static String h() {
        return b1.a.d(h.class) ? null : h.i;
    }

    static void i(Context context0, String s) {
        static final class com.facebook.appevents.h.a implements Runnable {
            final Context f;
            final h g;

            com.facebook.appevents.h.a(Context context0, h h0) {
                this.f = context0;
                this.g = h0;
                super();
            }

            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    Bundle bundle0 = new Bundle();
                    int v = 0;
                    for(int v1 = 0; true; ++v1) {
                        if(v1 >= 11) {
                            SharedPreferences sharedPreferences0 = this.f.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                            if(sharedPreferences0.getInt("kitsBitmask", 0) != v) {
                                sharedPreferences0.edit().putInt("kitsBitmask", v).apply();
                                this.g.p("fb_sdk_initialize", null, bundle0);
                            }
                            return;
                        }
                        String s = new String[]{"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"}[v1];
                        String s1 = new String[]{"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"}[v1];
                        try {
                            Class.forName(s);
                            bundle0.putInt(s1, 1);
                            v |= 1 << v1;
                        }
                        catch(ClassNotFoundException unused_ex) {
                        }
                    }
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        Class class0 = h.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            if(!com.facebook.h.i()) {
                return;
            }
            h h0 = new h(context0, s, null);
            h.d.execute(new com.facebook.appevents.h.a(context0, h0));
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    private static void j() {
        static final class c implements Runnable {
            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    HashSet hashSet0 = new HashSet();
                    for(Object object0: com.facebook.appevents.e.m()) {
                        hashSet0.add(((a)object0).b());
                    }
                    for(Object object1: hashSet0) {
                        r.o(((String)object1), true);
                    }
                    return;
                }
                catch(Throwable throwable0) {
                }
                b1.a.b(throwable0, this);
            }
        }

        if(b1.a.d(h.class)) {
            return;
        }
        try {
            synchronized(h.f) {
                if(h.d != null) {
                    return;
                }
                h.d = new ScheduledThreadPoolExecutor(1);
            }
            c h$c0 = new c();
            h.d.scheduleAtFixedRate(h$c0, 0L, 86400L, TimeUnit.SECONDS);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, h.class);
        }
    }

    private static void k(com.facebook.appevents.c c0, a a0) {
        Class class0 = h.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            com.facebook.appevents.e.h(a0, c0);
            if(l.g(com.facebook.internal.l.b.s) && U0.a.b()) {
                U0.a.c(a0.b(), c0);
            }
            if(!c0.b() && !h.h) {
                if(c0.e().equals("fb_mobile_activate_app")) {
                    h.h = true;
                    return;
                }
                v.h(q.j, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity\'s onResume() methodbefore logging other app events.");
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
    }

    void l(String s, double f, Bundle bundle0) {
        if(b1.a.d(this)) {
            return;
        }
        try {
            this.n(s, f, bundle0, false, S0.a.q());
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
        }
    }

    void m(String s, Bundle bundle0) {
        if(b1.a.d(this)) {
            return;
        }
        try {
            this.n(s, null, bundle0, false, S0.a.q());
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
        }
    }

    void n(String s, Double double0, Bundle bundle0, boolean z, UUID uUID0) {
        if(b1.a.d(this)) {
            return;
        }
        if(s != null) {
            try {
                if(!s.isEmpty()) {
                    if(o.f("app_events_killswitch", com.facebook.h.f(), false)) {
                        v.i(q.j, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", new Object[]{s});
                        return;
                    }
                    try {
                        h.k(new com.facebook.appevents.c(this.a, s, double0, bundle0, z, true, uUID0), this.b);
                    }
                    catch(JSONException jSONException0) {
                        v.i(q.j, "AppEvents", "JSON encoding for app event failed: \'%s\'", new Object[]{jSONException0.toString()});
                    }
                    catch(e e0) {
                        v.i(q.j, "AppEvents", "Invalid app event: %s", new Object[]{e0.toString()});
                    }
                }
            }
            catch(Throwable throwable0) {
                b1.a.b(throwable0, this);
            }
        }
    }

    void o(String s, String s1) {
        if(b1.a.d(this)) {
            return;
        }
        try {
            Bundle bundle0 = new Bundle();
            bundle0.putString("_is_suggested_event", "1");
            bundle0.putString("_button_text", s1);
            this.m(s, bundle0);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
        }
    }

    void p(String s, Double double0, Bundle bundle0) {
        if(b1.a.d(this)) {
            return;
        }
        try {
            this.n(s, double0, bundle0, true, S0.a.q());
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
        }
    }

    void q(String s, BigDecimal bigDecimal0, Currency currency0, Bundle bundle0) {
        if(b1.a.d(this)) {
            return;
        }
        try {
            if(bigDecimal0 != null && currency0 != null) {
                if(bundle0 == null) {
                    bundle0 = new Bundle();
                }
                bundle0.putString("fb_currency", currency0.getCurrencyCode());
                this.n(s, bigDecimal0.doubleValue(), bundle0, true, S0.a.q());
                return;
            }
            F.V("com.facebook.appevents.h", "purchaseAmount and currency cannot be null");
            return;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, this);
    }

    void r(BigDecimal bigDecimal0, Currency currency0, Bundle bundle0, boolean z) {
        if(b1.a.d(this)) {
            return;
        }
        try {
            if(bigDecimal0 == null) {
                h.t("purchaseAmount cannot be null");
                return;
            }
            if(currency0 == null) {
                h.t("currency cannot be null");
                return;
            }
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            bundle0.putString("fb_currency", currency0.getCurrencyCode());
            this.n("fb_mobile_purchase", bigDecimal0.doubleValue(), bundle0, z, S0.a.q());
            h.b();
            return;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, this);
    }

    void s(BigDecimal bigDecimal0, Currency currency0, Bundle bundle0) {
        if(b1.a.d(this)) {
            return;
        }
        try {
            this.r(bigDecimal0, currency0, bundle0, true);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
        }
    }

    private static void t(String s) {
        Class class0 = h.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            v.h(q.k, "AppEvents", s);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    static void u() {
        Class class0 = h.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            com.facebook.appevents.e.o();
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    // 检测为 Lambda 实现
    static void v(String s) [...]
}

