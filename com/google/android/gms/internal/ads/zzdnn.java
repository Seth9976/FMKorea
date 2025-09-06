package com.google.android.gms.internal.ads;

public final class zzdnn implements zzbjh {
    private final zzcxp zza;
    private final zzbvp zzb;
    private final String zzc;
    private final String zzd;

    public zzdnn(zzcxp zzcxp0, zzfbe zzfbe0) {
        this.zza = zzcxp0;
        this.zzb = zzfbe0.zzm;
        this.zzc = zzfbe0.zzk;
        this.zzd = zzfbe0.zzl;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjh
    public final void zza(zzbvp zzbvp0) {
        int v;
        String s;
        zzbvp zzbvp1 = this.zzb;
        if(zzbvp1 != null) {
            zzbvp0 = zzbvp1;
        }
        if(zzbvp0 == null) {
            v = 1;
            s = "";
        }
        else {
            s = zzbvp0.zza;
            v = zzbvp0.zzb;
        }
        zzbva zzbva0 = new zzbva(s, v);
        this.zza.zzd(zzbva0, this.zzc, this.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzbjh
    public final void zzb() {
        this.zza.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzbjh
    public final void zzc() {
        this.zza.zzf();
    }
}

