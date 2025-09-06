package com.google.android.gms.internal.ads;

public final class zzceq implements zzgh {
    public final zzgh zza;
    public final byte[] zzb;

    public zzceq(zzgh zzgh0, byte[] arr_b) {
        this.zza = zzgh0;
        this.zzb = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzgh
    public final zzgi zza() {
        zzgi zzgi0 = this.zza.zza();
        return new zzcej(new zzgd(this.zzb), this.zzb.length, zzgi0);
    }
}

