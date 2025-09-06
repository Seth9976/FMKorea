package com.google.android.gms.internal.ads;

public final class zzdhs implements Runnable {
    public final zzdhx zza;
    public final zzdjy zzb;

    public zzdhs(zzdhx zzdhx0, zzdjy zzdjy0) {
        this.zza = zzdhx0;
        this.zzb = zzdjy0;
    }

    @Override
    public final void run() {
        this.zza.zzx(this.zzb);
    }
}

