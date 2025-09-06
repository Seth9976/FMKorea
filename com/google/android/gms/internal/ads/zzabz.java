package com.google.android.gms.internal.ads;

public class zzabz implements zzaca {
    private final long zza;
    private final zzaby zzb;

    public zzabz(long v, long v1) {
        this.zza = v;
        zzacb zzacb0 = Long.compare(v1, 0L) == 0 ? zzacb.zza : new zzacb(0L, v1);
        this.zzb = new zzaby(zzacb0, zzacb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long v) {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return false;
    }
}

