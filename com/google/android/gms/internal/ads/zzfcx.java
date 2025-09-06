package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

public final class zzfcx {
    private final Deque zza;
    private final Callable zzb;
    private final zzfyo zzc;

    public zzfcx(Callable callable0, zzfyo zzfyo0) {
        this.zza = new LinkedBlockingDeque();
        this.zzb = callable0;
        this.zzc = zzfyo0;
    }

    public final d zza() {
        synchronized(this) {
            this.zzc(1);
            return (d)this.zza.poll();
        }
    }

    public final void zzb(d d0) {
        synchronized(this) {
            this.zza.addFirst(d0);
        }
    }

    public final void zzc(int v) {
        synchronized(this) {
            int v2 = this.zza.size();
            for(int v3 = 0; v3 < v - v2; ++v3) {
                d d0 = this.zzc.zzb(this.zzb);
                this.zza.add(d0);
            }
        }
    }
}

