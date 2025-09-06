package com.google.android.gms.internal.ads;

public final class zzedv implements zzfqw {
    public final zzedy zza;
    public final zzcfi zzb;
    public final zzfbe zzc;
    public final zzcpn zzd;

    public zzedv(zzedy zzedy0, zzcfi zzcfi0, zzfbe zzfbe0, zzcpn zzcpn0) {
        this.zza = zzedy0;
        this.zzb = zzcfi0;
        this.zzc = zzfbe0;
        this.zzd = zzcpn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    public final Object apply(Object object0) {
        zzcfi zzcfi0 = this.zzb;
        zzcpn zzcpn0 = this.zzd;
        if(this.zzc.zzN) {
            zzcfi0.zzae();
        }
        zzcfi0.zzY();
        zzcfi0.onPause();
        return zzcpn0.zza();
    }
}

