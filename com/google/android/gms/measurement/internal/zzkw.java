package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzkw implements Runnable {
    private final zzo zza;
    private final boolean zzb;
    private final zznc zzc;
    private final zzkp zzd;

    zzkw(zzkp zzkp0, zzo zzo0, boolean z, zznc zznc0) {
        this.zzd = zzkp0;
        this.zza = zzo0;
        this.zzb = z;
        this.zzc = zznc0;
        super();
    }

    @Override
    public final void run() {
        zzfk zzfk0 = this.zzd.zzb;
        if(zzfk0 == null) {
            this.zzd.zzj().zzg().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zza(zzfk0, (this.zzb ? null : this.zzc), this.zza);
        this.zzd.zzal();
    }
}

