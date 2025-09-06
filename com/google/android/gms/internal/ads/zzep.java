package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

public final class zzep {
    private final zzdz zza;
    private final zzej zzb;
    private final zzen zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzep(Looper looper0, zzdz zzdz0, zzen zzen0) {
        this(new CopyOnWriteArraySet(), looper0, zzdz0, zzen0, true);
    }

    private zzep(CopyOnWriteArraySet copyOnWriteArraySet0, Looper looper0, zzdz zzdz0, zzen zzen0, boolean z) {
        this.zza = zzdz0;
        this.zzd = copyOnWriteArraySet0;
        this.zzc = zzen0;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzdz0.zzb(looper0, new zzek(this));
        this.zzi = z;
    }

    public final zzep zza(Looper looper0, zzen zzen0) {
        return new zzep(this.zzd, looper0, this.zza, zzen0, this.zzi);
    }

    public final void zzb(Object object0) {
        synchronized(this.zzg) {
            if(this.zzh) {
                return;
            }
            zzeo zzeo0 = new zzeo(object0);
            this.zzd.add(zzeo0);
        }
    }

    public final void zzc() {
        this.zzh();
        if(this.zzf.isEmpty()) {
            return;
        }
        if(!this.zzb.zzg(0)) {
            zzei zzei0 = this.zzb.zzb(0);
            this.zzb.zzk(zzei0);
        }
        this.zze.addAll(this.zzf);
        this.zzf.clear();
        if(this.zze.isEmpty()) {
            while(!this.zze.isEmpty()) {
                ((Runnable)this.zze.peekFirst()).run();
                this.zze.removeFirst();
            }
        }
    }

    public final void zzd(int v, zzem zzem0) {
        this.zzh();
        zzel zzel0 = new zzel(new CopyOnWriteArraySet(this.zzd), v, zzem0);
        this.zzf.add(zzel0);
    }

    public final void zze() {
        this.zzh();
        synchronized(this.zzg) {
            this.zzh = true;
        }
        for(Object object0: this.zzd) {
            ((zzeo)object0).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object object0) {
        this.zzh();
        for(Object object1: this.zzd) {
            zzeo zzeo0 = (zzeo)object1;
            if(zzeo0.zza.equals(object0)) {
                zzeo0.zzc(this.zzc);
                this.zzd.remove(zzeo0);
            }
        }
    }

    public static boolean zzg(zzep zzep0, Message message0) {
        for(Object object0: zzep0.zzd) {
            ((zzeo)object0).zzb(zzep0.zzc);
            if(zzep0.zzb.zzg(0)) {
                break;
            }
        }
        return true;
    }

    private final void zzh() {
        if(!this.zzi) {
            return;
        }
        zzdy.zzf(Thread.currentThread() == this.zzb.zza().getThread());
    }
}

