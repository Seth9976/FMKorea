package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class zzky implements Runnable {
    public final zzlb zza;
    public final Pair zzb;
    public final zztj zzc;
    public final zzto zzd;

    public zzky(zzlb zzlb0, Pair pair0, zztj zztj0, zzto zzto0) {
        this.zza = zzlb0;
        this.zzb = pair0;
        this.zzc = zztj0;
        this.zzd = zzto0;
    }

    @Override
    public final void run() {
        zzlf.zze(this.zza.zza).zzad(((int)(((Integer)this.zzb.first))), ((zzts)this.zzb.second), this.zzc, this.zzd);
    }
}

