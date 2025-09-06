package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.Preconditions;

public final class zzgg {
    private final String zza;
    private final boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private final zzgd zze;

    public zzgg(zzgd zzgd0, String s, boolean z) {
        this.zze = zzgd0;
        super();
        Preconditions.checkNotEmpty(s);
        this.zza = s;
        this.zzb = z;
    }

    public final void zza(boolean z) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zze.zzc().edit();
        sharedPreferences$Editor0.putBoolean(this.zza, z);
        sharedPreferences$Editor0.apply();
        this.zzd = z;
    }

    public final boolean zza() {
        if(!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzc().getBoolean(this.zza, this.zzb);
        }
        return this.zzd;
    }
}

