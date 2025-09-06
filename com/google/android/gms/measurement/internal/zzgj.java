package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.Preconditions;

public final class zzgj {
    private final String zza;
    private final String zzb;
    private boolean zzc;
    private String zzd;
    private final zzgd zze;

    public zzgj(zzgd zzgd0, String s, String s1) {
        this.zze = zzgd0;
        super();
        Preconditions.checkNotEmpty(s);
        this.zza = s;
        this.zzb = null;
    }

    public final String zza() {
        if(!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzc().getString(this.zza, null);
        }
        return this.zzd;
    }

    public final void zza(String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zze.zzc().edit();
        sharedPreferences$Editor0.putString(this.zza, s);
        sharedPreferences$Editor0.apply();
        this.zzd = s;
    }
}

