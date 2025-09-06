package com.google.android.gms.internal.ads;

final class zzckb implements zzdsh {
    private final zzciz zza;
    private final zzckh zzb;
    private Long zzc;
    private String zzd;

    zzckb(zzciz zzciz0, zzckh zzckh0, zzcka zzcka0) {
        this.zza = zzciz0;
        this.zzb = zzckh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsh
    public final zzdsh zza(String s) {
        s.getClass();
        this.zzd = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsh
    public final zzdsh zzb(long v) {
        this.zzc = v;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsh
    public final zzdsi zzc() {
        zzgzb.zzc(this.zzc, Long.class);
        zzgzb.zzc(this.zzd, String.class);
        return new zzckd(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}

