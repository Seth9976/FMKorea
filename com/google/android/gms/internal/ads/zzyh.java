package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class zzyh {
    public static final zzyb zza;
    public static final zzyb zzb;
    public static final zzyb zzc;
    public static final zzyb zzd;
    private final ExecutorService zze;
    private zzyc zzf;
    private IOException zzg;

    static {
        zzyh.zza = new zzyb(0, 0x8000000000000001L, null);
        zzyh.zzb = new zzyb(1, 0x8000000000000001L, null);
        zzyh.zzc = new zzyb(2, 0x8000000000000001L, null);
        zzyh.zzd = new zzyb(3, 0x8000000000000001L, null);
    }

    public zzyh(String s) {
        this.zze = zzfk.zzB("ExoPlayer:Loader:ProgressiveMediaPeriod");
    }

    public final long zza(zzyd zzyd0, zzxz zzxz0, int v) {
        Looper looper0 = Looper.myLooper();
        zzdy.zzb(looper0);
        this.zzg = null;
        long v1 = SystemClock.elapsedRealtime();
        new zzyc(this, looper0, zzyd0, zzxz0, v, v1).zzc(0L);
        return v1;
    }

    public static zzyb zzb(boolean z, long v) {
        return new zzyb(((int)z), v, null);
    }

    static zzyc zzc(zzyh zzyh0) {
        return zzyh0.zzf;
    }

    static ExecutorService zzd(zzyh zzyh0) {
        return zzyh0.zze;
    }

    static void zze(zzyh zzyh0, zzyc zzyc0) {
        zzyh0.zzf = zzyc0;
    }

    static void zzf(zzyh zzyh0, IOException iOException0) {
        zzyh0.zzg = iOException0;
    }

    public final void zzg() {
        zzyc zzyc0 = this.zzf;
        zzdy.zzb(zzyc0);
        zzyc0.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int v) {
        IOException iOException0 = this.zzg;
        if(iOException0 != null) {
            throw iOException0;
        }
        zzyc zzyc0 = this.zzf;
        if(zzyc0 != null) {
            zzyc0.zzb(v);
        }
    }

    public final void zzj(zzye zzye0) {
        zzyc zzyc0 = this.zzf;
        if(zzyc0 != null) {
            zzyc0.zza(true);
        }
        zzyf zzyf0 = new zzyf(zzye0);
        this.zze.execute(zzyf0);
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}

