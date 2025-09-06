package com.google.android.gms.internal.ads;

public final class zzdrn implements Runnable {
    public final zzdro zza;
    public final String zzb;

    public zzdrn(zzdro zzdro0, String s) {
        this.zza = zzdro0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzd.zza(this.zzb);
    }
}

