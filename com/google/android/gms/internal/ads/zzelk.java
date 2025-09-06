package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbh;

public final class zzelk {
    private final zzdin zza;
    private final zzekx zzb;
    private final zzcwl zzc;

    public zzelk(zzdin zzdin0, zzfgo zzfgo0) {
        this.zza = zzdin0;
        zzekx zzekx0 = new zzekx(zzfgo0);
        this.zzb = zzekx0;
        this.zzc = new zzelj(zzekx0, zzdin0.zzg());
    }

    public final zzcwl zza() {
        return this.zzc;
    }

    public final zzcxw zzb() {
        return this.zzb;
    }

    public final zzdgh zzc() {
        zzbh zzbh0 = this.zzb.zzg();
        return new zzdgh(this.zza, zzbh0);
    }

    public final zzekx zzd() {
        return this.zzb;
    }

    public final void zze(zzbh zzbh0) {
        this.zzb.zzj(zzbh0);
    }
}

