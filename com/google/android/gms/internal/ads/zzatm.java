package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class zzatm implements Callable {
    protected final String zza;
    protected final zzary zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzanv zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzatm(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1) {
        this.zza = this.getClass().getSimpleName();
        this.zzb = zzary0;
        this.zzc = s;
        this.zzd = s1;
        this.zze = zzanv0;
        this.zzg = v;
        this.zzh = v1;
    }

    @Override
    public Object call() {
        this.zzl();
        return null;
    }

    protected abstract void zza();

    public Void zzl() {
        try {
            long v = System.nanoTime();
            Method method0 = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = method0;
            if(method0 == null) {
                return null;
            }
            this.zza();
            zzaqs zzaqs0 = this.zzb.zzd();
            if(zzaqs0 != null) {
                int v1 = this.zzg;
                if(v1 != 0x80000000) {
                    zzaqs0.zzc(this.zzh, v1, (System.nanoTime() - v) / 1000L, null, null);
                }
            }
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
        }
        return null;
    }
}

