package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdrc;
import java.util.ArrayDeque;

public final class zza implements Runnable {
    public final zzc zza;
    public final zzdrc zzb;
    public final ArrayDeque zzc;
    public final ArrayDeque zzd;

    public zza(zzc zzc0, zzdrc zzdrc0, ArrayDeque arrayDeque0, ArrayDeque arrayDeque1) {
        this.zza = zzc0;
        this.zzb = zzdrc0;
        this.zzc = arrayDeque0;
        this.zzd = arrayDeque1;
    }

    @Override
    public final void run() {
        this.zza.zze(this.zzb, this.zzc, this.zzd);
    }
}

