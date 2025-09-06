package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Callable;

public final class zzdze implements Callable {
    public final zzdzo zza;
    public final d zzb;
    public final d zzc;
    public final zzbun zzd;
    public final zzfhg zze;

    public zzdze(zzdzo zzdzo0, d d0, d d1, zzbun zzbun0, zzfhg zzfhg0) {
        this.zza = zzdzo0;
        this.zzb = d0;
        this.zzc = d1;
        this.zzd = zzbun0;
        this.zze = zzfhg0;
    }

    @Override
    public final Object call() {
        return this.zza.zzj(this.zzb, this.zzc, this.zzd, this.zze);
    }
}

