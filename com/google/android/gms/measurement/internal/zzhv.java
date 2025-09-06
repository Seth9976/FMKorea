package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zznp;

final class zzhv implements Runnable {
    private final zzo zza;
    private final zzhj zzb;

    zzhv(zzhj zzhj0, zzo zzo0) {
        this.zzb = zzhj0;
        this.zza = zzo0;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zza.zzr();
        zzmp zzmp0 = this.zzb.zza;
        zzo zzo0 = this.zza;
        zzmp0.zzl().zzt();
        zzmp0.zzs();
        Preconditions.checkNotEmpty(zzo0.zza);
        int v = !zznp.zza() || !zzmp0.zze().zza(zzbi.zzcm) ? 100 : zzo0.zzy;
        zzih zzih0 = zzih.zza(zzo0.zzt, v);
        zzih zzih1 = zzmp0.zzb(zzo0.zza);
        zzmp0.zzj().zzp().zza("Setting consent, package, consent", zzo0.zza, zzih0);
        zzmp0.zza(zzo0.zza, zzih0);
        if(zzih0.zzc(zzih1)) {
            zzmp0.zzd(zzo0);
        }
        if(zznp.zza() && zzmp0.zze().zza(zzbi.zzcm)) {
            zzay zzay0 = zzay.zza(zzo0.zzz);
            if(!zzay.zza.equals(zzay0)) {
                zzmp0.zzj().zzp().zza("Setting DMA consent. package, consent", zzo0.zza, zzay0);
                zzmp0.zza(zzo0.zza, zzay0);
            }
        }
    }
}

