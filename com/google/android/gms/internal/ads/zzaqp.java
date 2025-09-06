package com.google.android.gms.internal.ads;

final class zzaqp implements Runnable {
    final zzaqq zza;

    zzaqp(zzaqq zzaqq0) {
        this.zza = zzaqq0;
        super();
    }

    @Override
    public final void run() {
        synchronized(zzaqq.zzd(this.zza)) {
            if(!zzaqq.zzq(this.zza)) {
                zzaqq.zzi(this.zza, true);
                try {
                    zzaqq.zzj(this.zza);
                }
                catch(Exception exception0) {
                    zzaqq.zzc(this.zza).zzc(2023, -1L, exception0);
                }
                Object object1 = zzaqq.zzd(this.zza);
                synchronized(object1) {
                    zzaqq.zzi(this.zza, false);
                }
            }
        }
    }
}

