package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import b1.a;
import com.facebook.appevents.m;
import com.facebook.internal.F;
import com.facebook.internal.p;
import com.facebook.internal.r;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

abstract class x {
    static class b {
        String a;
        Boolean b;
        boolean c;
        long d;

        b(boolean z, String s) {
            this.c = z;
            this.a = s;
        }

        boolean a() {
            return this.b == null ? this.c : this.b.booleanValue();
        }
    }

    private static final String a = "com.facebook.x";
    private static AtomicBoolean b;
    private static AtomicBoolean c;
    private static b d;
    private static b e;
    private static b f;
    private static b g;
    private static b h;
    private static SharedPreferences i;

    static {
        x.b = new AtomicBoolean(false);
        x.c = new AtomicBoolean(false);
        x.d = new b(true, "com.facebook.sdk.AutoInitEnabled");
        x.e = new b(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
        x.f = new b(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
        x.g = new b(false, "auto_event_setup_enabled");
        x.h = new b(true, "com.facebook.sdk.MonitorEnabled");
    }

    // 去混淆评级： 低(20)
    static b a() {
        return a.d(x.class) ? null : x.f;
    }

    // 去混淆评级： 低(20)
    static b b() {
        return a.d(x.class) ? null : x.g;
    }

    static void c(b x$b0) {
        Class class0 = x.class;
        if(a.d(class0)) {
            return;
        }
        try {
            x.r(x$b0);
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }

    // 去混淆评级： 低(20)
    static AtomicBoolean d() {
        return a.d(x.class) ? null : x.c;
    }

    public static boolean e() {
        Class class0 = x.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            x.j();
            return x.f.a();
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return false;
        }
    }

    public static boolean f() {
        Class class0 = x.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            x.j();
            return x.d.a();
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return false;
        }
    }

    public static boolean g() {
        Class class0 = x.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            x.j();
            return x.e.a();
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return false;
        }
    }

    public static boolean h() {
        Class class0 = x.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            x.j();
            return x.g.a();
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return false;
        }
    }

    private static void i() {
        static final class com.facebook.x.a implements Runnable {
            final long f;

            com.facebook.x.a(long v) {
                this.f = v;
                super();
            }

            @Override
            public void run() {
                if(a.d(this)) {
                    return;
                }
                try {
                    if(x.a().a()) {
                        p p0 = r.o(h.f(), false);
                        if(p0 != null && p0.b()) {
                            com.facebook.internal.a a0 = com.facebook.internal.a.m(h.e());
                            if((a0 == null || a0.j() == null ? null : a0.j()) != null) {
                                Bundle bundle0 = new Bundle();
                                bundle0.putString("advertiser_id", a0.j());
                                bundle0.putString("fields", "auto_event_setup_enabled");
                                GraphRequest graphRequest0 = GraphRequest.J(null, h.f(), null);
                                graphRequest0.a0(true);
                                graphRequest0.Z(bundle0);
                                JSONObject jSONObject0 = graphRequest0.g().h();
                                if(jSONObject0 != null) {
                                    b x$b0 = x.b();
                                    x$b0.b = Boolean.valueOf(jSONObject0.optBoolean("auto_event_setup_enabled", false));
                                    b x$b1 = x.b();
                                    x$b1.d = this.f;
                                    x.c(x.b());
                                }
                            }
                        }
                    }
                    x.d().set(false);
                    return;
                }
                catch(Throwable throwable0) {
                }
                a.b(throwable0, this);
            }
        }

        Class class0 = x.class;
        if(a.d(class0)) {
            return;
        }
        try {
            x.p(x.g);
            long v = System.currentTimeMillis();
            b x$b0 = x.g;
            if(x$b0.b != null && v - x$b0.d < 604800000L) {
                return;
            }
            x$b0.b = null;
            x$b0.d = 0L;
            if(!x.c.compareAndSet(false, true)) {
                return;
            }
            h.m().execute(new com.facebook.x.a(v));
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
    }

    public static void j() {
        Class class0 = x.class;
        if(a.d(class0)) {
            return;
        }
        try {
            if(!h.v()) {
                return;
            }
            if(!x.b.compareAndSet(false, true)) {
                return;
            }
            x.i = h.e().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            x.k(new b[]{x.e, x.f, x.d});
            x.i();
            x.o();
            x.n();
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }

    private static void k(b[] arr_x$b) {
        Class class0 = x.class;
        if(a.d(class0)) {
            return;
        }
        try {
            for(int v = 0; v < arr_x$b.length; ++v) {
                b x$b0 = arr_x$b[v];
                if(x$b0 == x.g) {
                    x.i();
                }
                else if(x$b0.b == null) {
                    x.p(x$b0);
                    if(x$b0.b == null) {
                        x.l(x$b0);
                    }
                }
                else {
                    x.r(x$b0);
                }
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
    }

    private static void l(b x$b0) {
        Class class0 = x.class;
        if(a.d(class0)) {
            return;
        }
        try {
            x.q();
            try {
                ApplicationInfo applicationInfo0 = h.e().getPackageManager().getApplicationInfo("com.fmkorea.m.fmk", 0x80);
                if(applicationInfo0 != null && (applicationInfo0.metaData != null && applicationInfo0.metaData.containsKey(x$b0.a))) {
                    x$b0.b = Boolean.valueOf(applicationInfo0.metaData.getBoolean(x$b0.a, x$b0.c));
                }
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                F.U("com.facebook.x", packageManager$NameNotFoundException0);
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }

    static void m() {
        Class class0 = x.class;
        if(a.d(class0)) {
            return;
        }
        try {
            Context context0 = h.e();
            ApplicationInfo applicationInfo0 = context0.getPackageManager().getApplicationInfo("com.fmkorea.m.fmk", 0x80);
            if(applicationInfo0 != null && (applicationInfo0.metaData != null && applicationInfo0.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false))) {
                m m0 = new m(context0);
                Bundle bundle0 = new Bundle();
                if(!F.I()) {
                    bundle0.putString("SchemeWarning", "You haven\'t set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                    Log.w("com.facebook.x", "You haven\'t set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                }
                m0.g("fb_auto_applink", bundle0);
                return;
            }
            return;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
    }

    private static void n() {
        int v3;
        Class class0 = x.class;
        if(a.d(class0)) {
            return;
        }
        try {
            if(!x.b.get()) {
                return;
            }
            if(!h.v()) {
                return;
            }
            Context context0 = h.e();
            int v = 0;
            int v1 = x.d.a() | x.e.a() << 1 | x.f.a() << 2 | x.h.a() << 3;
            int v2 = x.i.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
            if(v2 != v1) {
                x.i.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", v1).commit();
                try {
                    ApplicationInfo applicationInfo0 = context0.getPackageManager().getApplicationInfo("com.fmkorea.m.fmk", 0x80);
                    v3 = 0;
                    if(applicationInfo0 != null && applicationInfo0.metaData != null) {
                        String[] arr_s = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                        int v4 = 0;
                        while(v < 4) {
                            try {
                                v4 |= applicationInfo0.metaData.containsKey(arr_s[v]) << v;
                                v3 |= applicationInfo0.metaData.getBoolean(arr_s[v], new boolean[]{true, true, true, true}[v]) << v;
                                ++v;
                                continue;
                            }
                            catch(PackageManager.NameNotFoundException unused_ex) {
                            }
                            break;
                        }
                        v = v4;
                    }
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                m m0 = new m(context0);
                Bundle bundle0 = new Bundle();
                bundle0.putInt("usage", v);
                bundle0.putInt("initial", v3);
                bundle0.putInt("previous", v2);
                bundle0.putInt("current", v1);
                m0.e(bundle0);
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }

    private static void o() {
        Class class0 = x.class;
        if(a.d(class0)) {
            return;
        }
        try {
            ApplicationInfo applicationInfo0 = h.e().getPackageManager().getApplicationInfo("com.fmkorea.m.fmk", 0x80);
            if(applicationInfo0 != null) {
                Bundle bundle0 = applicationInfo0.metaData;
                if(bundle0 != null) {
                    if(!bundle0.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                        Log.w("com.facebook.x", "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                    }
                    if(!applicationInfo0.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                        Log.w("com.facebook.x", "You haven\'t set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                    }
                    if(!x.e()) {
                        Log.w("com.facebook.x", "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you\'re sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                        return;
                    }
                }
            }
            return;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
    }

    private static void p(b x$b0) {
        Class class0 = x.class;
        if(a.d(class0)) {
            return;
        }
        try {
            x.q();
            try {
                String s = x.i.getString(x$b0.a, "");
                if(!s.isEmpty()) {
                    JSONObject jSONObject0 = new JSONObject(s);
                    x$b0.b = Boolean.valueOf(jSONObject0.getBoolean("value"));
                    x$b0.d = jSONObject0.getLong("last_timestamp");
                }
            }
            catch(JSONException jSONException0) {
                F.U("com.facebook.x", jSONException0);
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }

    private static void q() {
        Class class0 = x.class;
        if(a.d(class0)) {
            return;
        }
        try {
            if(!x.b.get()) {
                throw new i("The UserSettingManager has not been initialized successfully");
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }

    private static void r(b x$b0) {
        Class class0 = x.class;
        if(a.d(class0)) {
            return;
        }
        try {
            x.q();
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("value", x$b0.b);
                jSONObject0.put("last_timestamp", x$b0.d);
                x.i.edit().putString(x$b0.a, jSONObject0.toString()).commit();
                x.n();
            }
            catch(Exception exception0) {
                F.U("com.facebook.x", exception0);
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }
}

