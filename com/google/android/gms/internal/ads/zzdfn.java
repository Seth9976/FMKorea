package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

public final class zzdfn implements zzo {
    private final zzcyo zza;
    private final zzddm zzb;

    public zzdfn(zzcyo zzcyo0, zzddm zzddm0) {
        this.zza = zzcyo0;
        this.zzb = zzddm0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
        this.zza.zzbL();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        this.zza.zzbo();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        this.zza.zzbu();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        this.zza.zzbv();
        this.zzb.zzb();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        this.zza.zzbx();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int v) {
        this.zza.zzby(v);
        this.zzb.zza();
    }
}

