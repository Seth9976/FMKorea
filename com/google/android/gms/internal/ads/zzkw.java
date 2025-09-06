package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

public final class zzkw implements Runnable {
    public final zzlb zza;
    public final Pair zzb;
    public final zztj zzc;
    public final zzto zzd;
    public final IOException zze;
    public final boolean zzf;

    public zzkw(zzlb zzlb0, Pair pair0, zztj zztj0, zzto zzto0, IOException iOException0, boolean z) {
        this.zza = zzlb0;
        this.zzb = pair0;
        this.zzc = zztj0;
        this.zzd = zzto0;
        this.zze = iOException0;
        this.zzf = z;
    }

    @Override
    public final void run() {
        zzlf.zze(this.zza.zza).zzaf(((int)(((Integer)this.zzb.first))), ((zzts)this.zzb.second), this.zzc, this.zzd, this.zze, this.zzf);
    }
}

