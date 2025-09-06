package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzdx;

public final class zza implements Runnable {
    public final AdLoader zza;
    public final zzdx zzb;

    public zza(AdLoader adLoader0, zzdx zzdx0) {
        this.zza = adLoader0;
        this.zzb = zzdx0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

