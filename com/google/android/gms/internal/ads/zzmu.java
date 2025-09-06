package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzmu implements zzem {
    public final zzly zza;
    public final zztj zzb;
    public final zzto zzc;
    public final IOException zzd;
    public final boolean zze;

    public zzmu(zzly zzly0, zztj zztj0, zzto zzto0, IOException iOException0, boolean z) {
        this.zza = zzly0;
        this.zzb = zztj0;
        this.zzc = zzto0;
        this.zzd = iOException0;
        this.zze = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzem
    public final void zza(Object object0) {
        ((zzma)object0).zzj(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}

