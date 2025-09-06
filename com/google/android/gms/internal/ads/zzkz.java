package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class zzkz implements Runnable {
    public final zzlb zza;
    public final Pair zzb;
    public final zzto zzc;

    public zzkz(zzlb zzlb0, Pair pair0, zzto zzto0) {
        this.zza = zzlb0;
        this.zzb = pair0;
        this.zzc = zzto0;
    }

    @Override
    public final void run() {
        zzlf.zze(this.zza.zza).zzac(((int)(((Integer)this.zzb.first))), ((zzts)this.zzb.second), this.zzc);
    }
}

