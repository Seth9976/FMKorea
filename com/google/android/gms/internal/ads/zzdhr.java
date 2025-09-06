package com.google.android.gms.internal.ads;

public final class zzdhr implements Runnable {
    public final zzdhx zza;
    public final boolean zzb;

    public zzdhr(zzdhx zzdhx0, boolean z) {
        this.zza = zzdhx0;
        this.zzb = z;
    }

    @Override
    public final void run() {
        this.zza.zzw(this.zzb);
    }
}

