package com.google.android.gms.internal.ads;

public final class zzadq implements zzabe {
    private final long zzb;
    private final zzabe zzc;

    public zzadq(long v, zzabe zzabe0) {
        this.zzb = v;
        this.zzc = zzabe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabe
    public final void zzC() {
        this.zzc.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzabe
    public final void zzN(zzaca zzaca0) {
        zzadp zzadp0 = new zzadp(this, zzaca0);
        this.zzc.zzN(zzadp0);
    }

    static long zza(zzadq zzadq0) {
        return zzadq0.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzabe
    public final zzace zzv(int v, int v1) {
        return this.zzc.zzv(v, v1);
    }
}

