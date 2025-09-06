package com.google.android.gms.internal.ads;

final class zzadp implements zzaca {
    final zzaca zza;
    final zzadq zzb;

    zzadp(zzadq zzadq0, zzaca zzaca0) {
        this.zzb = zzadq0;
        this.zza = zzaca0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zza.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long v) {
        zzaby zzaby0 = this.zza.zzg(v);
        long v1 = zzadq.zza(this.zzb);
        zzacb zzacb0 = new zzacb(zzaby0.zza.zzb, zzaby0.zza.zzc + v1);
        long v2 = zzadq.zza(this.zzb);
        return new zzaby(zzacb0, new zzacb(zzaby0.zzb.zzb, zzaby0.zzb.zzc + v2));
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return this.zza.zzh();
    }
}

