package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.zzt;

public final class zzbz {
    private long zza;
    private long zzb;
    private final Object zzc;

    public zzbz(long v) {
        this.zzb = 0x8000000000000000L;
        this.zzc = new Object();
        this.zza = v;
    }

    public final void zza(long v) {
        synchronized(this.zzc) {
            this.zza = v;
        }
    }

    public final boolean zzb() {
        synchronized(this.zzc) {
            long v1 = zzt.zzB().elapsedRealtime();
            if(this.zzb + this.zza > v1) {
                return false;
            }
            this.zzb = v1;
            return true;
        }
    }
}

