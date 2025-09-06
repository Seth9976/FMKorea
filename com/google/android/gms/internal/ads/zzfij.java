package com.google.android.gms.internal.ads;

public final class zzfij implements Runnable {
    public final zzfik zza;
    public final String zzb;
    public final zzfhr zzc;

    public zzfij(zzfik zzfik0, String s, zzfhr zzfhr0) {
        this.zza = zzfik0;
        this.zzb = s;
        this.zzc = zzfhr0;
    }

    @Override
    public final void run() {
        this.zza.zzb(this.zzb, this.zzc);
    }
}

