package com.google.android.gms.internal.ads;

public final class zzehz implements zzfqw {
    public final zzeid zza;
    public final zzcfi zzb;
    public final zzfbe zzc;
    public final zzdnr zzd;

    public zzehz(zzeid zzeid0, zzcfi zzcfi0, zzfbe zzfbe0, zzdnr zzdnr0) {
        this.zza = zzeid0;
        this.zzb = zzcfi0;
        this.zzc = zzfbe0;
        this.zzd = zzdnr0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    public final Object apply(Object object0) {
        zzcfi zzcfi0 = this.zzb;
        zzdnr zzdnr0 = this.zzd;
        if(this.zzc.zzN) {
            zzcfi0.zzae();
        }
        zzcfi0.zzY();
        zzcfi0.onPause();
        return zzdnr0.zzk();
    }
}

