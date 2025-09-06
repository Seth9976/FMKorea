package com.google.android.gms.internal.ads;

public final class zzcco implements Runnable {
    public final zzcdb zza;
    public final String zzb;

    public zzcco(zzcdb zzcdb0, String s) {
        this.zza = zzcdb0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzG(this.zzb);
    }
}

