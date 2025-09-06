package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzdrm;

public final class zze implements Runnable {
    public final zzdrm zza;
    public final zzdrc zzb;
    public final String zzc;
    public final Pair[] zzd;

    public zze(zzdrm zzdrm0, zzdrc zzdrc0, String s, Pair[] arr_pair) {
        this.zza = zzdrm0;
        this.zzb = zzdrc0;
        this.zzc = s;
        this.zzd = arr_pair;
    }

    @Override
    public final void run() {
        zzf.zzd(this.zza, this.zzb, this.zzc, this.zzd);
    }
}

