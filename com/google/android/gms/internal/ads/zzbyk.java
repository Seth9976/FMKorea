package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzbyk {
    private final Map zza;
    private final List zzb;
    private final Context zzc;
    private final zzbxh zzd;

    zzbyk(Context context0, zzbxh zzbxh0) {
        this.zza = new HashMap();
        this.zzb = new ArrayList();
        this.zzc = context0;
        this.zzd = zzbxh0;
    }

    static List zza(zzbyk zzbyk0) {
        return zzbyk0.zzb;
    }

    final void zzb(Map map0, SharedPreferences sharedPreferences0, String s, String s1) {
        if(!map0.containsKey(s)) {
            return;
        }
        if(!((Set)map0.get(s)).contains(s1)) {
            return;
        }
        this.zzd.zze();
    }

    final void zzc(String s) {
        SharedPreferences sharedPreferences0;
        synchronized(this) {
            if(!this.zza.containsKey(s)) {
                switch(s) {
                    case 0: {
                        sharedPreferences0 = this.zzc.getSharedPreferences(0, 0);
                        break;
                    }
                    case 0x5FE3: {
                        sharedPreferences0 = PreferenceManager.getDefaultSharedPreferences(this.zzc);
                        break;
                    }
                    default: {
                        sharedPreferences0 = s.equals("__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(s, 0);
                    }
                }
                zzbyj zzbyj0 = new zzbyj(this, s);
                this.zza.put(s, zzbyj0);
                sharedPreferences0.registerOnSharedPreferenceChangeListener(zzbyj0);
            }
        }
    }

    final void zzd(zzbyi zzbyi0) {
        synchronized(this) {
            this.zzb.add(zzbyi0);
        }
    }
}

