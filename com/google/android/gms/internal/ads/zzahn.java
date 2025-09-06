package com.google.android.gms.internal.ads;

final class zzahn implements zzaht {
    private final zzabo zza;
    private final zzabn zzb;
    private long zzc;
    private long zzd;

    public zzahn(zzabo zzabo0, zzabn zzabn0) {
        this.zza = zzabo0;
        this.zzb = zzabn0;
        this.zzc = -1L;
        this.zzd = -1L;
    }

    public final void zza(long v) {
        this.zzc = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzaht
    public final long zzd(zzabc zzabc0) {
        long v = this.zzd;
        if(Long.compare(v, 0L) >= 0) {
            this.zzd = -1L;
            return -(v + 2L);
        }
        return -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzaht
    public final zzaca zze() {
        zzdy.zzf(this.zzc != -1L);
        return new zzabm(this.zza, this.zzc);
    }

    @Override  // com.google.android.gms.internal.ads.zzaht
    public final void zzg(long v) {
        this.zzd = this.zzb.zza[zzfk.zzc(this.zzb.zza, v, true, true)];
    }
}

