package com.google.android.gms.internal.ads;

public final class zzalv {
    public final Object zza;
    public final zzaky zzb;
    public final zzaly zzc;
    public boolean zzd;

    private zzalv(zzaly zzaly0) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzaly0;
    }

    private zzalv(Object object0, zzaky zzaky0) {
        this.zzd = false;
        this.zza = object0;
        this.zzb = zzaky0;
        this.zzc = null;
    }

    public static zzalv zza(zzaly zzaly0) {
        return new zzalv(zzaly0);
    }

    public static zzalv zzb(Object object0, zzaky zzaky0) {
        return new zzalv(object0, zzaky0);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}

