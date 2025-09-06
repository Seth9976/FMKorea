package com.google.android.gms.internal.ads;

public final class zzdpk implements zzaxd {
    public final zzaxo zza;
    public final String zzb;
    public final zzbae zzc;
    public final String zzd;

    public zzdpk(zzaxo zzaxo0, String s, zzbae zzbae0, String s1) {
        this.zza = zzaxo0;
        this.zzb = s;
        this.zzc = zzbae0;
        this.zzd = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxd
    public final void zza(zzayt zzayt0) {
        zzaxp zzaxp0 = (zzaxp)zzayt0.zza().zzaB();
        zzaxp0.zza(this.zza);
        zzayt0.zze(zzaxp0);
        zzayl zzayl0 = (zzayl)zzayt0.zzb().zzaB();
        zzayl0.zza(this.zzb);
        zzayl0.zzb(this.zzc);
        zzayt0.zzg(zzayl0);
        zzayt0.zzh(this.zzd);
    }
}

