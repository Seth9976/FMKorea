package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.Preconditions;

public final class zzgi {
    private final String zza;
    private final long zzb;
    private boolean zzc;
    private long zzd;
    private final zzgd zze;

    public zzgi(zzgd zzgd0, String s, long v) {
        this.zze = zzgd0;
        super();
        Preconditions.checkNotEmpty(s);
        this.zza = s;
        this.zzb = v;
    }

    public final long zza() {
        if(!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzc().getLong(this.zza, this.zzb);
        }
        return this.zzd;
    }

    public final void zza(long v) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zze.zzc().edit();
        sharedPreferences$Editor0.putLong(this.zza, v);
        sharedPreferences$Editor0.apply();
        this.zzd = v;
    }
}

