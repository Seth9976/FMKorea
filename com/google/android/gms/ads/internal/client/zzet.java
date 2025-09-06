package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaa;

final class zzet extends zzbm {
    final zzeu zza;

    zzet(zzeu zzeu0, zzes zzes0) {
        this.zza = zzeu0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final String zze() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzl0) {
        this.zzh(zzl0, 1);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final void zzh(zzl zzl0, int v) {
        zzcaa.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzer zzer0 = new zzer(this);
        zzbzt.zza.post(zzer0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzi() {
        return false;
    }
}

