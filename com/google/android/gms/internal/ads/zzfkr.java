package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzfkr {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc;
    private zzfkq zzd;

    public zzfkr() {
        this.zzc = new ArrayDeque();
        this.zzd = null;
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue0;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue0);
    }

    public final void zza(zzfkq zzfkq0) {
        this.zzd = null;
        this.zzc();
    }

    public final void zzb(zzfkq zzfkq0) {
        zzfkq0.zzb(this);
        this.zzc.add(zzfkq0);
        if(this.zzd == null) {
            this.zzc();
        }
    }

    private final void zzc() {
        zzfkq zzfkq0 = (zzfkq)this.zzc.poll();
        this.zzd = zzfkq0;
        if(zzfkq0 != null) {
            zzfkq0.executeOnExecutor(this.zzb, new Object[0]);
        }
    }
}

