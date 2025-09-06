package com.facebook.internal;

import Y0.b;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.GraphRequest;
import com.facebook.h;
import com.facebook.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z3.k;

public final class o {
    public interface a {
        void a();
    }

    private static final String a;
    private static final AtomicBoolean b;
    private static final ConcurrentLinkedQueue c;
    private static final Map d;
    private static Long e;
    private static b f;
    public static final o g;

    static {
        o.g = new o();
        o.a = "o";
        o.b = new AtomicBoolean(false);
        o.c = new ConcurrentLinkedQueue();
        o.d = new ConcurrentHashMap();
    }

    public static final AtomicBoolean b(o o0) {
        return o.b;
    }

    public static final void d(o o0, Long long0) {
        o.e = long0;
    }

    private final JSONObject e(String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("platform", "android");
        bundle0.putString("sdk_version", "9.1.1");
        bundle0.putString("fields", "gatekeepers");
        String s1 = String.format("%s/%s", Arrays.copyOf(new Object[]{s, "mobile_sdk_gk"}, 2));
        k.d(s1, "java.lang.String.format(format, *args)");
        GraphRequest graphRequest0 = GraphRequest.J(null, s1, null);
        graphRequest0.a0(true);
        k.d(graphRequest0, "request");
        graphRequest0.Z(bundle0);
        n n0 = graphRequest0.g();
        k.d(n0, "request.executeAndWait()");
        JSONObject jSONObject0 = n0.h();
        return jSONObject0 == null ? new JSONObject() : jSONObject0;
    }

    public static final boolean f(String s, String s1, boolean z) {
        k.e(s, "name");
        Map map0 = o.g.g(s1);
        if(map0.containsKey(s)) {
            Boolean boolean0 = (Boolean)map0.get(s);
            return boolean0 == null ? z : boolean0.booleanValue();
        }
        return z;
    }

    public final Map g(String s) {
        this.i();
        if(s != null) {
            Map map0 = o.d;
            if(map0.containsKey(s)) {
                List list0 = o.f == null ? null : o.f.a(s);
                if(list0 != null) {
                    Map map1 = new HashMap();
                    for(Object object0: list0) {
                        map1.put(((Y0.a)object0).a(), Boolean.valueOf(((Y0.a)object0).b()));
                    }
                    return map1;
                }
                HashMap hashMap0 = new HashMap();
                JSONObject jSONObject0 = (JSONObject)map0.get(s);
                if(jSONObject0 == null) {
                    jSONObject0 = new JSONObject();
                }
                Iterator iterator1 = jSONObject0.keys();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    k.d(((String)object1), "key");
                    hashMap0.put(((String)object1), Boolean.valueOf(jSONObject0.optBoolean(((String)object1))));
                }
                b b0 = o.f == null ? new b() : o.f;
                ArrayList arrayList0 = new ArrayList(hashMap0.size());
                for(Object object2: hashMap0.entrySet()) {
                    arrayList0.add(new Y0.a(((String)((Map.Entry)object2).getKey()), ((Boolean)((Map.Entry)object2).getValue()).booleanValue()));
                }
                b0.b(s, arrayList0);
                o.f = b0;
                return hashMap0;
            }
        }
        return new HashMap();
    }

    private final boolean h(Long long0) [...] // 潜在的解密器

    public final void i() {
        o.j(null);
    }

    public static final void j(a o$a0) {
        static final class com.facebook.internal.o.b implements Runnable {
            final String f;
            final Context g;
            final String h;

            com.facebook.internal.o.b(String s, Context context0, String s1) {
                this.f = s;
                this.g = context0;
                this.h = s1;
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
                    goto label_4;
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                    return;
                }
                return;
                try {
                label_4:
                    o o0 = o.g;
                    k.d(this.f, "applicationId");
                    JSONObject jSONObject0 = o0.e(this.f);
                    if(jSONObject0.length() != 0) {
                        k.d(this.f, "applicationId");
                        o0.k(this.f, jSONObject0);
                        this.g.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.h, jSONObject0.toString()).apply();
                        o.d(o0, System.currentTimeMillis());
                    }
                    o0.l();
                    o.b(o0).set(false);
                    return;
                }
                catch(Throwable throwable1) {
                }
                try {
                    b1.a.b(throwable1, this);
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        synchronized(o.class) {
            if(o$a0 != null) {
                o.c.add(o$a0);
            }
            String s = h.f();
            Context context0 = h.e();
            String s1 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{s}, 1));
            k.d(s1, "java.lang.String.format(format, *args)");
            if(context0 == null) {
                return;
            }
            JSONObject jSONObject0 = null;
            String s2 = context0.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(s1, null);
            if(!F.P(s2)) {
                try {
                    jSONObject0 = new JSONObject(s2);
                }
                catch(JSONException jSONException0) {
                    F.U("FacebookSDK", jSONException0);
                }
                if(jSONObject0 != null) {
                    k.d(s, "applicationId");
                    o.g.k(s, jSONObject0);
                }
            }
            Executor executor0 = h.m();
            if(executor0 != null) {
                if(!o.b.compareAndSet(false, true)) {
                    return;
                }
                executor0.execute(new com.facebook.internal.o.b(s, context0, s1));
            }
        }
    }

    public final JSONObject k(String s, JSONObject jSONObject0) {
        JSONObject jSONObject2;
        synchronized(this) {
            k.e(s, "applicationId");
            JSONObject jSONObject1 = (JSONObject)o.d.get(s);
            if(jSONObject1 == null) {
                jSONObject1 = new JSONObject();
            }
            if(jSONObject0 == null) {
                jSONObject2 = new JSONObject();
            }
            else {
                JSONArray jSONArray0 = jSONObject0.optJSONArray("data");
                if(jSONArray0 == null) {
                    jSONObject2 = new JSONObject();
                }
                else {
                    jSONObject2 = jSONArray0.optJSONObject(0);
                    if(jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                }
            }
            JSONArray jSONArray1 = jSONObject2.optJSONArray("gatekeepers");
            if(jSONArray1 == null) {
                jSONArray1 = new JSONArray();
            }
            int v2 = jSONArray1.length();
            for(int v1 = 0; v1 < v2; ++v1) {
                try {
                    JSONObject jSONObject3 = jSONArray1.getJSONObject(v1);
                    jSONObject1.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                }
                catch(JSONException jSONException0) {
                    F.U("FacebookSDK", jSONException0);
                }
            }
            o.d.put(s, jSONObject1);
            return jSONObject1;
        }
    }

    private final void l() {
        static final class c implements Runnable {
            final a f;

            c(a o$a0) {
                this.f = o$a0;
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

        Handler handler0 = new Handler(Looper.getMainLooper());
        while(true) {
            ConcurrentLinkedQueue concurrentLinkedQueue0 = o.c;
            if(concurrentLinkedQueue0.isEmpty()) {
                break;
            }
            a o$a0 = (a)concurrentLinkedQueue0.poll();
            if(o$a0 != null) {
                handler0.post(new c(o$a0));
            }
        }
    }

    public static final JSONObject m(String s, boolean z) {
        k.e(s, "applicationId");
        if(!z) {
            Map map0 = o.d;
            if(map0.containsKey(s)) {
                JSONObject jSONObject0 = (JSONObject)map0.get(s);
                return jSONObject0 == null ? new JSONObject() : jSONObject0;
            }
        }
        JSONObject jSONObject1 = o.g.e(s);
        Context context0 = h.e();
        String s1 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{s}, 1));
        k.d(s1, "java.lang.String.format(format, *args)");
        context0.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(s1, jSONObject1.toString()).apply();
        return o.g.k(s, jSONObject1);
    }
}

