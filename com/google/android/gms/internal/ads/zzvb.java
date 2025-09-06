package com.google.android.gms.internal.ads;

final class zzvb implements zzxo {
    public long zza;
    public long zzb;
    public zzxn zzc;
    public zzvb zzd;

    public zzvb(long v, int v1) {
        this.zze(v, 0x10000);
    }

    public final int zza(long v) {
        return (int)(v - this.zza);
    }

    public final zzvb zzb() {
        this.zzc = null;
        zzvb zzvb0 = this.zzd;
        this.zzd = null;
        return zzvb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzxo
    public final zzxn zzc() {
        zzxn zzxn0 = this.zzc;
        zzxn0.getClass();
        return zzxn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzxo
    public final zzxo zzd() {
        return this.zzd == null || this.zzd.zzc == null ? null : this.zzd;
    }

    public final void zze(long v, int v1) {
        zzdy.zzf(this.zzc == null);
        this.zza = v;
        this.zzb = v + 0x10000L;
    }
}

