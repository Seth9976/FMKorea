package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

final class zzmv implements Runnable {
    private final String zza;
    private final String zzb;
    private final Bundle zzc;
    private final zzmw zzd;

    zzmv(zzmw zzmw0, String s, String s1, Bundle bundle0) {
        this.zzd = zzmw0;
        this.zza = s;
        this.zzb = s1;
        this.zzc = bundle0;
        super();
    }

    @Override
    public final void run() {
        zznd zznd0 = this.zzd.zza.zzq();
        long v = this.zzd.zza.zzb().currentTimeMillis();
        zzbg zzbg0 = (zzbg)Preconditions.checkNotNull(zznd0.zza(this.zza, this.zzb, this.zzc, "auto", v, false, true));
        this.zzd.zza.zza(zzbg0, this.zza);
    }
}

