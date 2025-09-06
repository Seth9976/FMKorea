package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
public final class zzls {
    private final zziv zza;

    @Deprecated
    public zzls(Context context0, zzcer zzcer0) {
        this.zza = new zziv(context0, zzcer0);
    }

    @Deprecated
    public final zzls zza(zzko zzko0) {
        zzdy.zzf(!this.zza.zzq);
        zzko0.getClass();
        this.zza.zzf = new zzin(zzko0);
        return this;
    }

    @Deprecated
    public final zzls zzb(zzxl zzxl0) {
        zzdy.zzf(!this.zza.zzq);
        zzxl0.getClass();
        this.zza.zze = new zzio(zzxl0);
        return this;
    }

    @Deprecated
    public final zzlt zzc() {
        zzdy.zzf(!this.zza.zzq);
        this.zza.zzq = true;
        return new zzlt(this.zza);
    }
}

