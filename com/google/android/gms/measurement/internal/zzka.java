package com.google.android.gms.measurement.internal;

import android.net.Uri;

final class zzka implements Runnable {
    private final boolean zza;
    private final Uri zzb;
    private final String zzc;
    private final String zzd;
    private final zzjx zze;

    zzka(zzjx zzjx0, boolean z, Uri uri0, String s, String s1) {
        this.zze = zzjx0;
        this.zza = z;
        this.zzb = uri0;
        this.zzc = s;
        this.zzd = s1;
        super();
    }

    @Override
    public final void run() {
        zzjx.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}

