package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

final class zzbqs implements zzo {
    final zzbqu zza;

    zzbqs(zzbqu zzbqu0) {
        this.zza = zzbqu0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
        zzcaa.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        zzcaa.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        zzcaa.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        zzcaa.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbqu.zzb(this.zza).onAdOpened(this.zza);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int v) {
        zzcaa.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbqu.zzb(this.zza).onAdClosed(this.zza);
    }
}

