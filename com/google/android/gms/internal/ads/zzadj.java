package com.google.android.gms.internal.ads;

abstract class zzadj {
    protected final zzace zza;

    protected zzadj(zzace zzace0) {
        this.zza = zzace0;
    }

    protected abstract boolean zza(zzfb arg1);

    protected abstract boolean zzb(zzfb arg1, long arg2);

    // 去混淆评级： 低(20)
    public final boolean zzf(zzfb zzfb0, long v) {
        return this.zza(zzfb0) && this.zzb(zzfb0, v);
    }
}

