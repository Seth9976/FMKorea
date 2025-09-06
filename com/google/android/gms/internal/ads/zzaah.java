package com.google.android.gms.internal.ads;

public final class zzaah implements zzaca {
    private final zzaak zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzaah(zzaak zzaak0, long v, long v1, long v2, long v3, long v4, long v5) {
        this.zza = zzaak0;
        this.zzb = v;
        this.zzc = v2;
        this.zzd = v3;
        this.zze = v4;
        this.zzf = v5;
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzb;
    }

    public final long zzf(long v) {
        return this.zza.zza(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long v) {
        zzacb zzacb0 = new zzacb(v, zzaaj.zzf(this.zza.zza(v), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzaby(zzacb0, zzacb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}

