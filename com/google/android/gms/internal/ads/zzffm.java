package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzffm {
    final zzffw zza;
    private final Object zzb;
    private final List zzc;

    zzffm(zzffw zzffw0, Object object0, List list0, zzffl zzffl0) {
        this.zza = zzffw0;
        super();
        this.zzb = object0;
        this.zzc = list0;
    }

    public final zzffv zza(Callable callable0) {
        zzfyd zzfyd0 = zzfye.zzb(this.zzc);
        d d0 = zzfyd0.zza(() -> null, zzcan.zzf);
        d d1 = zzfyd0.zza(callable0, zzffw.zze(this.zza));
        return new zzffv(this.zza, this.zzb, null, d0, this.zzc, d1, null);
    }
}

