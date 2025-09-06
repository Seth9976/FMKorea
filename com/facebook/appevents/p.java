package com.facebook.appevents;

import M0.c;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import b1.a;
import com.facebook.h;
import com.facebook.internal.F;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.FIN;

public abstract class p {
    private static final String a = "p";
    private static SharedPreferences b;
    private static AtomicBoolean c;
    private static final ConcurrentHashMap d;
    private static final ConcurrentHashMap e;

    static {
        p.c = new AtomicBoolean(false);
        p.d = new ConcurrentHashMap();
        p.e = new ConcurrentHashMap();
    }

    // 去混淆评级： 低(20)
    static AtomicBoolean a() {
        return a.d(p.class) ? null : p.c;
    }

    static void b() {
        Class class0 = p.class;
        if(a.d(class0)) {
            return;
        }
        try {
            p.f();
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }

    // 去混淆评级： 低(20)
    static SharedPreferences c() {
        return a.d(p.class) ? null : p.b;
    }

    public static String d() [...] // 潜在的解密器

    private static Map e() {
        Class class0 = p.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            Map map0 = new HashMap();
            Set set0 = c.b();
            for(Object object0: p.e.keySet()) {
                String s = (String)object0;
                if(set0.contains(s)) {
                    map0.put(s, p.e.get(s));
                }
            }
            return map0;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    private static void f() {
        Class class0 = p.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        if(a.d(p.class)) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(class0);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        try {
            if(!p.c.get()) {
                SharedPreferences sharedPreferences0 = PreferenceManager.getDefaultSharedPreferences(h.e());
                p.b = sharedPreferences0;
                String s = sharedPreferences0.getString("com.facebook.appevents.UserDataStore.userData", "");
                String s1 = p.b.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                Map map0 = F.T(s);
                p.d.putAll(map0);
                Map map1 = F.T(s1);
                p.e.putAll(map1);
                p.c.set(true);
                FIN.finallyExec$NT(v);
                return;
            }
            FIN.finallyExec$NT(v);
        }
        catch(Throwable throwable0) {
            a.b(throwable0, p.class);
            FIN.finallyExec$NT(v);
        }
    }

    static void g() {
        Class class0 = p.class;
        if(a.d(class0)) {
            return;
        }
        try {
            if(p.c.get()) {
                return;
            }
            p.f();
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }

    private static String h(String s, String s1) {
        Class class0 = p.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            String s2 = s1.trim().toLowerCase();
            if("em".equals(s)) {
                if(Patterns.EMAIL_ADDRESS.matcher(s2).matches()) {
                    return s2;
                }
                Log.e("p", "Setting email failure: this is not a valid email address");
                return "";
            }
            if("ph".equals(s)) {
                return s2.replaceAll("[^0-9]", "");
            }
            if("ge".equals(s)) {
                String s3 = s2.length() <= 0 ? "" : s2.substring(0, 1);
                if(!"f".equals(s3) && !"m".equals(s3)) {
                    Log.e("p", "Setting gender failure: the supported value for gender is f or m");
                    return "";
                }
                return s3;
            }
            return s2;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    static void i(Map map0) {
        Class class0 = p.class;
        if(a.d(class0)) {
            return;
        }
        try {
            if(!p.c.get()) {
                p.f();
            }
            for(Object object0: map0.entrySet()) {
                String s = (String)((Map.Entry)object0).getKey();
                String s1 = F.q0(p.h(s, ((String)map0.get(s)).trim()));
                ConcurrentHashMap concurrentHashMap0 = p.e;
                if(concurrentHashMap0.containsKey(s)) {
                    String s2 = (String)concurrentHashMap0.get(s);
                    String[] arr_s = s2 == null ? new String[0] : s2.split(",");
                    HashSet hashSet0 = new HashSet(Arrays.asList(arr_s));
                    if(hashSet0.contains(s1)) {
                        return;
                    }
                    StringBuilder stringBuilder0 = new StringBuilder();
                    if(arr_s.length == 0) {
                        stringBuilder0.append(s1);
                    }
                    else if(arr_s.length < 5) {
                        stringBuilder0.append(s2);
                        stringBuilder0.append(",");
                        stringBuilder0.append(s1);
                    }
                    else {
                        for(int v = 1; v < 5; ++v) {
                            stringBuilder0.append(arr_s[v]);
                            stringBuilder0.append(",");
                        }
                        stringBuilder0.append(s1);
                        hashSet0.remove(arr_s[0]);
                    }
                    p.e.put(s, stringBuilder0.toString());
                }
                else {
                    concurrentHashMap0.put(s, s1);
                }
            }
            p.j("com.facebook.appevents.UserDataStore.internalUserData", "");
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
    }

    private static void j(String s, String s1) {
        static final class com.facebook.appevents.p.a implements Runnable {
            final String f;
            final String g;

            com.facebook.appevents.p.a(String s, String s1) {
                this.f = s;
                this.g = s1;
                super();
            }

            @Override
            public void run() {
                if(a.d(this)) {
                    return;
                }
                try {
                    if(!p.a().get()) {
                        p.b();
                    }
                    p.c().edit().putString(this.f, this.g).apply();
                    return;
                }
                catch(Throwable throwable0) {
                }
                a.b(throwable0, this);
            }
        }

        Class class0 = p.class;
        if(a.d(class0)) {
            return;
        }
        try {
            h.m().execute(new com.facebook.appevents.p.a(s, s1));
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }
}

