package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzals {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzakz zze;
    private final zzali zzf;
    private final zzalj[] zzg;
    private zzalb zzh;
    private final List zzi;
    private final List zzj;
    private final zzalg zzk;

    public zzals(zzakz zzakz0, zzali zzali0, int v) {
        zzalg zzalg0 = new zzalg(new Handler(Looper.getMainLooper()));
        super();
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzakz0;
        this.zzf = zzali0;
        this.zzg = new zzalj[4];
        this.zzk = zzalg0;
    }

    public final zzalp zza(zzalp zzalp0) {
        zzalp0.zzf(this);
        synchronized(this.zzb) {
            this.zzb.add(zzalp0);
        }
        zzalp0.zzg(this.zza.incrementAndGet());
        zzalp0.zzm("add-to-queue");
        this.zzc(zzalp0, 0);
        this.zzc.add(zzalp0);
        return zzalp0;
    }

    final void zzb(zzalp zzalp0) {
        synchronized(this.zzb) {
            this.zzb.remove(zzalp0);
        }
        synchronized(this.zzi) {
            for(Object object0: this.zzi) {
                ((zzalr)object0).zza();
            }
        }
        this.zzc(zzalp0, 5);
    }

    final void zzc(zzalp zzalp0, int v) {
        synchronized(this.zzj) {
            for(Object object0: this.zzj) {
                ((zzalq)object0).zza();
            }
        }
    }

    public final void zzd() {
        zzalb zzalb0 = this.zzh;
        if(zzalb0 != null) {
            zzalb0.zzb();
        }
        zzalj[] arr_zzalj = this.zzg;
        for(int v1 = 0; v1 < 4; ++v1) {
            zzalj zzalj0 = arr_zzalj[v1];
            if(zzalj0 != null) {
                zzalj0.zza();
            }
        }
        zzalb zzalb1 = new zzalb(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzalb1;
        zzalb1.start();
        for(int v = 0; v < 4; ++v) {
            zzalj zzalj1 = new zzalj(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[v] = zzalj1;
            zzalj1.start();
        }
    }
}

