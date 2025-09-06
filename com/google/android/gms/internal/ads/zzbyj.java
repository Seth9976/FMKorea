package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;

final class zzbyj implements SharedPreferences.OnSharedPreferenceChangeListener {
    final zzbyk zza;
    private final String zzb;

    public zzbyj(zzbyk zzbyk0, String s) {
        this.zza = zzbyk0;
        super();
        this.zzb = s;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        synchronized(this.zza) {
            for(Object object0: zzbyk.zza(this.zza)) {
                ((zzbyi)object0).zza.zzb(((zzbyi)object0).zzb, sharedPreferences0, this.zzb, s);
            }
        }
    }
}

