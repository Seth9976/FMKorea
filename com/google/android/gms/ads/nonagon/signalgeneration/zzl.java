package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdnb;

public final class zzl implements Runnable {
    public final zzaa zza;
    public final zzdnb[] zzb;

    public zzl(zzaa zzaa0, zzdnb[] arr_zzdnb) {
        this.zza = zzaa0;
        this.zzb = arr_zzdnb;
    }

    @Override
    public final void run() {
        this.zza.zzH(this.zzb);
    }
}

