package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzcd {
    private final Map zza;
    private final List zzb;
    private final Context zzc;

    zzcd(Context context0) {
        this.zza = new HashMap();
        this.zzb = new ArrayList();
        this.zzc = context0;
    }

    static List zza(zzcd zzcd0) {
        return zzcd0.zzb;
    }

    final void zzb(String s) {
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
                zzcc zzcc0 = new zzcc(this, s);
                this.zza.put(s, zzcc0);
                sharedPreferences0.registerOnSharedPreferenceChangeListener(zzcc0);
            }
        }
    }

    public final void zzc() {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzjw)).booleanValue()) {
            return;
        }
        Map map0 = zzs.zzs(((String)zzba.zzc().zzb(zzbbr.zzjz)));
        for(Object object0: map0.keySet()) {
            this.zzb(((String)object0));
        }
        this.zzd(new zzcb(map0));
    }

    final void zzd(zzcb zzcb0) {
        synchronized(this) {
            this.zzb.add(zzcb0);
        }
    }
}

