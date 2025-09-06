package com.google.android.gms.internal.ads;

final class zzado extends zzabp {
    private final long zza;

    public zzado(zzabc zzabc0, long v) {
        super(zzabc0);
        zzdy.zzd(zzabc0.zzf() >= v);
        this.zza = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzabp
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzabp
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzabp
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}

