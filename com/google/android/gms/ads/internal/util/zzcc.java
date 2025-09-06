package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.Set;

final class zzcc implements SharedPreferences.OnSharedPreferenceChangeListener {
    final zzcd zza;
    private final String zzb;

    public zzcc(zzcd zzcd0, String s) {
        this.zza = zzcd0;
        super();
        this.zzb = s;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        synchronized(this.zza) {
            for(Object object0: zzcd.zza(this.zza)) {
                Map map0 = ((zzcb)object0).zza;
                if(map0.containsKey(this.zzb) && ((Set)map0.get(this.zzb)).contains(s)) {
                    zzt.zzo().zzh().zzI(false);
                }
            }
        }
    }
}

