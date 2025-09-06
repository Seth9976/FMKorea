package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

final class zzmt implements Callable {
    private final zzo zza;
    private final zzmp zzb;

    zzmt(zzmp zzmp0, zzo zzo0) {
        this.zzb = zzmp0;
        this.zza = zzo0;
        super();
    }

    @Override
    public final Object call() {
        String s = (String)Preconditions.checkNotNull(this.zza.zza);
        if(this.zzb.zzb(s).zzh() && zzih.zza(this.zza.zzt).zzh()) {
            zzh zzh0 = this.zzb.zza(this.zza);
            if(zzh0 == null) {
                this.zzb.zzj().zzu().zza("App info was null when attempting to get app instance id");
                return null;
            }
            return zzh0.zzy();
        }
        this.zzb.zzj().zzp().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}

