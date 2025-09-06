package com.google.android.gms.internal.ads;

final class zzgqb extends zzgqe {
    private final int zzc;
    private final int zzd;

    zzgqb(byte[] arr_b, int v, int v1) {
        super(arr_b);
        zzgqi.zzq(v, v + v1, arr_b.length);
        this.zzc = v;
        this.zzd = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqe
    public final byte zza(int v) {
        zzgqi.zzy(v, this.zzd);
        return this.zza[this.zzc + v];
    }

    @Override  // com.google.android.gms.internal.ads.zzgqe
    final byte zzb(int v) {
        return this.zza[this.zzc + v];
    }

    @Override  // com.google.android.gms.internal.ads.zzgqe
    protected final int zzc() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqe
    public final int zzd() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqe
    protected final void zze(byte[] arr_b, int v, int v1, int v2) {
        System.arraycopy(this.zza, this.zzc + v, arr_b, v1, v2);
    }
}

