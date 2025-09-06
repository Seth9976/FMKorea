package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzpm;

public final class zzme implements Runnable {
    private zzmb zza;

    public zzme(zzmb zzmb0) {
        this.zza = zzmb0;
    }

    @Override
    public final void run() {
        zzmc zzmc0 = this.zza.zzc;
        long v = this.zza.zza;
        long v1 = this.zza.zzb;
        zzmc0.zza.zzt();
        zzmc0.zza.zzj().zzc().zza("Application going to the background");
        zzmc0.zza.zzk().zzn.zza(true);
        zzmc0.zza.zza(true);
        if(!zzmc0.zza.zze().zzu()) {
            zzmc0.zza.zzb.zzb(v1);
            zzmc0.zza.zza(false, false, v1);
        }
        if(zzpm.zza() && zzmc0.zza.zze().zza(zzbi.zzce)) {
            zzmc0.zza.zzj().zzn().zza("Application backgrounded at: timestamp_millis", v);
            return;
        }
        zzmc0.zza.zzm().zza("auto", "_ab", v, new Bundle());
    }
}

