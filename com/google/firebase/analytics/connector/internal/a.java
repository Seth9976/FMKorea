package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzii;
import com.google.android.gms.measurement.internal.zzij;
import com.google.common.collect.n;
import com.google.common.collect.q;

public abstract class a {
    private static final q a;
    private static final n b;
    private static final n c;
    private static final n d;
    private static final n e;
    private static final n f;

    static {
        a.a = q.y("_in", "_xa", "_xu", "_aq", "_aa", "_ai", new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"});
        a.b = n.u("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
        a.c = n.t("auto", "app", "am");
        a.d = n.s("_r", "_dbg");
        a.e = new com.google.common.collect.n.a().f(zzij.zza).f(zzij.zzb).g();
        a.f = n.s("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static String a(String s) {
        String s1 = zzii.zza(s);
        return s1 == null ? s : s1;
    }

    public static void b(String s, String s1, Bundle bundle0) {
        if("clx".equals(s) && "_ae".equals(s1)) {
            bundle0.putLong("_r", 1L);
        }
    }

    public static boolean c(String s, Bundle bundle0) {
        if(a.b.contains(s)) {
            return false;
        }
        if(bundle0 != null) {
            n n0 = a.d;
            int v = n0.size();
            int v1 = 0;
            while(v1 < v) {
                Object object0 = n0.get(v1);
                ++v1;
                if(bundle0.containsKey(((String)object0))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    public static boolean d(String s, String s1) {
        if(!"_ce1".equals(s1) && !"_ce2".equals(s1)) {
            if("_ln".equals(s1)) {
                return s.equals("fcm") || s.equals("fiam");
            }
            if(a.e.contains(s1)) {
                return false;
            }
            n n0 = a.f;
            int v = n0.size();
            int v1 = 0;
            while(v1 < v) {
                Object object0 = n0.get(v1);
                ++v1;
                if(s1.matches(((String)object0))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        return s.equals("fcm") || s.equals("frc");
    }

    public static boolean e(String s, String s1, Bundle bundle0) {
        if(!"_cmp".equals(s1)) {
            return true;
        }
        if(!a.g(s)) {
            return false;
        }
        if(bundle0 == null) {
            return false;
        }
        n n0 = a.d;
        int v = n0.size();
        int v1 = 0;
        while(v1 < v) {
            Object object0 = n0.get(v1);
            ++v1;
            if(bundle0.containsKey(((String)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        s.hashCode();
        switch(s) {
            case "fcm": {
                bundle0.putString("_cis", "fcm_integration");
                return true;
            }
            case "fdl": {
                bundle0.putString("_cis", "fdl_integration");
                return true;
            }
            case "fiam": {
                bundle0.putString("_cis", "fiam_integration");
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean f(String s) {
        return !a.a.contains(s);
    }

    public static boolean g(String s) {
        return !a.c.contains(s);
    }
}

