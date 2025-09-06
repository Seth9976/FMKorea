package com.google.android.gms.internal.ads;

final class zzka implements zzku {
    private final Object zza;
    private final zztu zzb;
    private zzcw zzc;

    public zzka(Object object0, zztn zztn0) {
        this.zza = object0;
        this.zzb = zztn0;
        this.zzc = zztn0.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzku
    public final zzcw zza() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzku
    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzcw zzcw0) {
        this.zzc = zzcw0;
    }
}

