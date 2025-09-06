package com.google.android.gms.internal.ads;

final class zzauw implements Runnable {
    final zzaux zza;

    zzauw(zzaux zzaux0) {
        this.zza = zzaux0;
        super();
    }

    @Override
    public final void run() {
        synchronized(zzaux.zzc(this.zza)) {
            zzaux zzaux0 = this.zza;
            if(!zzaux.zzi(zzaux0) || !zzaux.zzj(zzaux0)) {
                zzcaa.zze("App is still foreground");
            }
            else {
                zzaux.zze(zzaux0, false);
                zzcaa.zze("App went background");
                for(Object object1: zzaux.zzd(this.zza)) {
                    zzauy zzauy0 = (zzauy)object1;
                    try {
                        zzauy0.zza(false);
                    }
                    catch(Exception exception0) {
                        zzcaa.zzh("", exception0);
                    }
                }
            }
        }
    }
}

