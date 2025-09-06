package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zztx implements Runnable {
    public final zzub zza;
    public final zzuc zzb;
    public final zztj zzc;
    public final zzto zzd;
    public final IOException zze;
    public final boolean zzf;

    public zztx(zzub zzub0, zzuc zzuc0, zztj zztj0, zzto zzto0, IOException iOException0, boolean z) {
        this.zza = zzub0;
        this.zzb = zzuc0;
        this.zzc = zztj0;
        this.zzd = zzto0;
        this.zze = iOException0;
        this.zzf = z;
    }

    @Override
    public final void run() {
        this.zzb.zzaf(0, this.zza.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}

