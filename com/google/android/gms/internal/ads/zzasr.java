package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzasr implements Callable {
    private final zzary zza;
    private final zzanv zzb;

    public zzasr(zzary zzary0, zzanv zzanv0) {
        this.zza = zzary0;
        this.zzb = zzanv0;
    }

    @Override
    public final Object call() {
        if(this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzaos zzaos0 = this.zza.zzc();
        if(zzaos0 != null) {
            try {
                synchronized(this.zzb) {
                    byte[] arr_b = zzaos0.zzax();
                    this.zzb.zzak(arr_b, 0, arr_b.length, zzgrc.zza());
                    return null;
                }
            }
            catch(zzgsc | NullPointerException unused_ex) {
            }
        }
        return null;
    }
}

