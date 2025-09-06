package com.google.android.gms.measurement.internal;

import java.util.Map;

public final class zzkd implements Runnable {
    private zzke zza;
    private int zzb;
    private Exception zzc;
    private byte[] zzd;
    private Map zze;

    public zzkd(zzke zzke0, int v, Exception exception0, byte[] arr_b, Map map0) {
        this.zza = zzke0;
        this.zzb = v;
        this.zzc = exception0;
        this.zzd = arr_b;
        this.zze = map0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb, this.zzc, this.zzd, this.zze);
    }
}

