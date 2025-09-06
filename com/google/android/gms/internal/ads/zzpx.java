package com.google.android.gms.internal.ads;

import android.os.SystemClock;

final class zzpx {
    private Exception zza;
    private long zzb;

    public zzpx(long v) {
    }

    public final void zza() {
        this.zza = null;
    }

    public final void zzb(Exception exception0) {
        long v = SystemClock.elapsedRealtime();
        if(this.zza == null) {
            this.zza = exception0;
            this.zzb = v + 100L;
        }
        if(v >= this.zzb) {
            Exception exception1 = this.zza;
            if(exception1 != exception0) {
                try {
                    exception1.addSuppressed(exception0);
                }
                catch(Exception unused_ex) {
                }
            }
            Exception exception2 = this.zza;
            this.zza = null;
            throw exception2;
        }
    }
}

