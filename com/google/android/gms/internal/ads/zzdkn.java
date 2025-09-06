package com.google.android.gms.internal.ads;

public final class zzdkn implements zzfqw {
    public final zzdko zza;
    public final double zzb;
    public final boolean zzc;

    public zzdkn(zzdko zzdko0, double f, boolean z) {
        this.zza = zzdko0;
        this.zzb = f;
        this.zzc = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    public final Object apply(Object object0) {
        return this.zza.zza(this.zzb, this.zzc, ((zzall)object0));
    }
}

