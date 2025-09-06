package com.facebook.internal;

import O0.e;
import S0.d;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.GraphRequest;
import com.facebook.h;
import com.facebook.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import m3.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z3.k;

public final class r {
    public static enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

    }

    public interface b {
        void a();

        void b(p arg1);
    }

    private static final String a;
    private static final List b;
    private static final Map c;
    private static final AtomicReference d;
    private static final ConcurrentLinkedQueue e;
    private static boolean f;
    private static JSONArray g;
    public static final r h;

    static {
        r.h = new r();
        k.d("r", "FetchedAppSettingsManager::class.java.simpleName");
        r.a = "r";
        r.b = o.k(new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting"});
        r.c = new ConcurrentHashMap();
        r.d = new AtomicReference(a.f);
        r.e = new ConcurrentLinkedQueue();
    }

    public static final Map b(r r0) {
        return r.c;
    }

    public static final AtomicReference c(r r0) {
        return r.d;
    }

    public static final boolean d(r r0) {
        return r.f;
    }

    // 去混淆评级： 低(20)
    public static final String e(r r0) {
        return "r";
    }

    public static final void g(r r0, boolean z) {
        r.f = z;
    }

    public static final void h(b r$b0) {
        k.e(r$b0, "callback");
        r.e.add(r$b0);
        r.k();
    }

    private final JSONObject i(String s) {
        Bundle bundle0 = new Bundle();
        ArrayList arrayList0 = new ArrayList();
        arrayList0.addAll(r.b);
        bundle0.putString("fields", TextUtils.join(",", arrayList0));
        GraphRequest graphRequest0 = GraphRequest.J(null, s, null);
        graphRequest0.a0(true);
        k.d(graphRequest0, "request");
        graphRequest0.Z(bundle0);
        n n0 = graphRequest0.g();
        k.d(n0, "request.executeAndWait()");
        JSONObject jSONObject0 = n0.h();
        return jSONObject0 == null ? new JSONObject() : jSONObject0;
    }

    public static final p j(String s) {
        return s == null ? null : ((p)r.c.get(s));
    }

    public static final void k() {
        static final class c implements Runnable {
            final Context f;
            final String g;
            final String h;

            c(Context context0, String s, String s1) {
                this.f = context0;
                this.g = s;
                this.h = s1;
                super();
            }

            @Override
            public final void run() {
                JSONObject jSONObject0;
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    if(b1.a.d(this)) {
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences0 = this.f.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                        p p0 = null;
                        String s = sharedPreferences0.getString(this.g, null);
                        if(!F.P(s)) {
                            if(s == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            try {
                                jSONObject0 = new JSONObject(s);
                            }
                            catch(JSONException jSONException0) {
                                F.U("FacebookSDK", jSONException0);
                                jSONObject0 = null;
                            }
                            if(jSONObject0 != null) {
                                k.d(this.h, "applicationId");
                                p0 = r.h.l(this.h, jSONObject0);
                            }
                        }
                        r r0 = r.h;
                        k.d(this.h, "applicationId");
                        JSONObject jSONObject1 = r0.i(this.h);
                        if(jSONObject1 != null) {
                            k.d(this.h, "applicationId");
                            r0.l(this.h, jSONObject1);
                            sharedPreferences0.edit().putString(this.g, jSONObject1.toString()).apply();
                        }
                        if(p0 != null) {
                            String s1 = p0.h();
                            if(!r.d(r0) && s1 != null && s1.length() > 0) {
                                r.g(r0, true);
                                Log.w(r.e(r0), s1);
                            }
                        }
                        k.d(this.h, "applicationId");
                        com.facebook.internal.o.m(this.h, true);
                        d.d();
                        r.c(r0).set((r.b(r0).containsKey(this.h) ? a.h : a.i));
                        r0.n();
                    }
                    catch(Throwable throwable1) {
                        b1.a.b(throwable1, this);
                    }
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        Context context0 = h.e();
        String s = h.f();
        if(F.P(s)) {
            r.d.set(a.i);
            r.h.n();
            return;
        }
        if(r.c.containsKey(s)) {
            r.d.set(a.h);
            r.h.n();
            return;
        }
        if(!q.a(r.d, a.f, a.g) && !q.a(r.d, a.i, a.g)) {
            r.h.n();
            return;
        }
        String s1 = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{s}, 1));
        k.d(s1, "java.lang.String.format(format, *args)");
        h.m().execute(new c(context0, s1, s));
    }

    public final p l(String s, JSONObject jSONObject0) {
        k.e(s, "applicationId");
        k.e(jSONObject0, "settingsJSON");
        JSONArray jSONArray0 = jSONObject0.optJSONArray("android_sdk_error_categories");
        com.facebook.internal.h.a h$a0 = com.facebook.internal.h.h;
        com.facebook.internal.h h0 = h$a0.a(jSONArray0);
        if(h0 == null) {
            h0 = h$a0.b();
        }
        int v = jSONObject0.optInt("app_events_feature_bitmask", 0);
        JSONArray jSONArray1 = jSONObject0.optJSONArray("auto_event_mapping_android");
        r.g = jSONArray1;
        if(jSONArray1 != null && t.b()) {
            e.b((jSONArray1 == null ? null : jSONArray1.toString()));
        }
        boolean z = jSONObject0.optBoolean("supports_implicit_sdk_logging", false);
        String s1 = jSONObject0.optString("gdpv4_nux_content", "");
        k.d(s1, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean z1 = jSONObject0.optBoolean("gdpv4_nux_enabled", false);
        int v1 = jSONObject0.optInt("app_events_session_timeout", 60);
        long v2 = jSONObject0.optLong("seamless_login");
        EnumSet enumSet0 = A.l.a(v2);
        Map map0 = this.m(jSONObject0.optJSONObject("android_dialog_configs"));
        String s2 = jSONObject0.optString("smart_login_bookmark_icon_url");
        k.d(s2, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String s3 = jSONObject0.optString("smart_login_menu_icon_url");
        k.d(s3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String s4 = jSONObject0.optString("sdk_update_message");
        k.d(s4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        p p0 = new p(z, s1, z1, v1, enumSet0, map0, (v & 8) != 0, h0, s2, s3, (v & 16) != 0, (v & 0x20) != 0, jSONArray1, s4, (v & 0x100) != 0, (v & 0x4000) != 0, jSONObject0.optString("aam_rules"), jSONObject0.optString("suggested_events_setting"), jSONObject0.optString("restrictive_data_filter_params"));
        r.c.put(s, p0);
        return p0;
    }

    private final Map m(JSONObject jSONObject0) {
        Map map0 = new HashMap();
        if(jSONObject0 != null) {
            JSONArray jSONArray0 = jSONObject0.optJSONArray("data");
            if(jSONArray0 != null) {
                int v = jSONArray0.length();
                for(int v1 = 0; v1 < v; ++v1) {
                    JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
                    k.d(jSONObject1, "dialogConfigData.optJSONObject(i)");
                    com.facebook.internal.p.b p$b0 = com.facebook.internal.p.b.e.a(jSONObject1);
                    if(p$b0 != null) {
                        String s = p$b0.a();
                        Map map1 = (Map)((HashMap)map0).get(s);
                        if(map1 == null) {
                            map1 = new HashMap();
                            map0.put(s, map1);
                        }
                        map1.put(p$b0.b(), p$b0);
                    }
                }
            }
        }
        return map0;
    }

    private final void n() {
        static final class com.facebook.internal.r.d implements Runnable {
            final b f;

            com.facebook.internal.r.d(b r$b0) {
                this.f = r$b0;
                super();
            }

            @Override
            public final void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    if(b1.a.d(this)) {
                        return;
                    }
                    try {
                        this.f.a();
                    }
                    catch(Throwable throwable1) {
                        b1.a.b(throwable1, this);
                    }
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }


        static final class com.facebook.internal.r.e implements Runnable {
            final b f;
            final p g;

            com.facebook.internal.r.e(b r$b0, p p0) {
                this.f = r$b0;
                this.g = p0;
                super();
            }

            @Override
            public final void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    if(b1.a.d(this)) {
                        return;
                    }
                    try {
                        this.f.b(this.g);
                    }
                    catch(Throwable throwable1) {
                        b1.a.b(throwable1, this);
                    }
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        synchronized(this) {
            a r$a0 = (a)r.d.get();
            if(a.f != r$a0 && a.g != r$a0) {
                String s = h.f();
                p p0 = (p)r.c.get(s);
                Handler handler0 = new Handler(Looper.getMainLooper());
                if(a.i == r$a0) {
                    while(true) {
                        ConcurrentLinkedQueue concurrentLinkedQueue0 = r.e;
                        if(concurrentLinkedQueue0.isEmpty()) {
                            break;
                        }
                        handler0.post(new com.facebook.internal.r.d(((b)concurrentLinkedQueue0.poll())));
                    }
                    return;
                }
                while(true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue1 = r.e;
                    if(concurrentLinkedQueue1.isEmpty()) {
                        break;
                    }
                    handler0.post(new com.facebook.internal.r.e(((b)concurrentLinkedQueue1.poll()), p0));
                }
            }
        }
    }

    public static final p o(String s, boolean z) {
        k.e(s, "applicationId");
        if(!z) {
            Map map0 = r.c;
            if(map0.containsKey(s)) {
                return (p)map0.get(s);
            }
        }
        r r0 = r.h;
        JSONObject jSONObject0 = r0.i(s);
        if(jSONObject0 != null) {
            p p0 = r0.l(s, jSONObject0);
            if(k.a(s, h.f())) {
                r.d.set(a.h);
                r0.n();
            }
            return p0;
        }
        return null;
    }
}

