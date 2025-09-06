package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

final class zzcfo implements zzo {
    private final zzcfi zza;
    private final zzo zzb;

    public zzcfo(zzcfi zzcfi0, zzo zzo0) {
        this.zza = zzcfi0;
        this.zzb = zzo0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        zzo zzo0 = this.zzb;
        if(zzo0 != null) {
            zzo0.zzbu();
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        zzo zzo0 = this.zzb;
        if(zzo0 != null) {
            zzo0.zzbv();
        }
        this.zza.zzX();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        zzo zzo0 = this.zzb;
        if(zzo0 != null) {
            zzo0.zzbx();
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int v) {
        zzo zzo0 = this.zzb;
        if(zzo0 != null) {
            zzo0.zzby(v);
        }
        this.zza.zzV();
    }
}

