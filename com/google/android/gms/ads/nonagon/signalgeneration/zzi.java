package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdrc;

public final class zzi implements Runnable {
    public final zzaa zza;
    public final String zzb;
    public final String zzc;
    public final zzdrc zzd;

    public zzi(zzaa zzaa0, String s, String s1, zzdrc zzdrc0) {
        this.zza = zzaa0;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = zzdrc0;
    }

    @Override
    public final void run() {
        this.zza.zzI(this.zzb, this.zzc, this.zzd);
    }
}

