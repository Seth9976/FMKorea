package com.google.android.gms.internal.ads;

final class zzakm implements zzaca {
    private final zzakj zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzakm(zzakj zzakj0, int v, long v1, long v2) {
        this.zza = zzakj0;
        this.zzb = v;
        this.zzc = v1;
        long v3 = (v2 - v1) / ((long)zzakj0.zzd);
        this.zzd = v3;
        this.zze = this.zza(v3);
    }

    private final long zza(long v) {
        return zzfk.zzq(v * ((long)this.zzb), 1000000L, this.zza.zzc);
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long v) {
        long v1 = Math.max(0L, Math.min(((long)this.zza.zzc) * v / (((long)this.zzb) * 1000000L), this.zzd - 1L));
        long v2 = this.zza(v1);
        zzacb zzacb0 = new zzacb(v2, this.zzc + ((long)this.zza.zzd) * v1);
        return v2 >= v || v1 == this.zzd - 1L ? new zzaby(zzacb0, zzacb0) : new zzaby(zzacb0, new zzacb(this.zza(v1 + 1L), this.zzc + ((long)this.zza.zzd) * (v1 + 1L)));
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}

