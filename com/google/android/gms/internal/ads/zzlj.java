package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

public final class zzlj {
    private final zzli zza;
    private final zzlh zzb;
    private final zzdz zzc;
    private final zzcw zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzlj(zzlh zzlh0, zzli zzli0, zzcw zzcw0, int v, zzdz zzdz0, Looper looper0) {
        this.zzb = zzlh0;
        this.zza = zzli0;
        this.zzd = zzcw0;
        this.zzg = looper0;
        this.zzc = zzdz0;
        this.zzh = v;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzli zzc() {
        return this.zza;
    }

    public final zzlj zzd() {
        zzdy.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzlj zze(Object object0) {
        zzdy.zzf(!this.zzi);
        this.zzf = object0;
        return this;
    }

    public final zzlj zzf(int v) {
        zzdy.zzf(!this.zzi);
        this.zze = v;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final void zzh(boolean z) {
        synchronized(this) {
            this.zzj |= z;
            this.zzk = true;
            this.notifyAll();
        }
    }

    public final boolean zzi(long v) {
        synchronized(this) {
            zzdy.zzf(this.zzi);
            zzdy.zzf(this.zzg.getThread() != Thread.currentThread());
            long v2 = SystemClock.elapsedRealtime() + v;
            while(!this.zzk) {
                if(v <= 0L) {
                    throw new TimeoutException("Message delivery timed out.");
                }
                this.wait(v);
                v = v2 - SystemClock.elapsedRealtime();
            }
            return this.zzj;
        }
    }

    public final boolean zzj() [...] // 潜在的解密器
}

