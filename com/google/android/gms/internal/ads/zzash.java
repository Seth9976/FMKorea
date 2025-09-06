package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;
import java.util.concurrent.Executor;

public final class zzash {
    private static final String[] zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private boolean zze;

    static {
        zzash.zza = new String[]{"android:establish_vpn_service", "android:establish_vpn_manager"};
    }

    zzash(Context context0, Executor executor0, String[] arr_s) {
        this.zzb = 0L;
        this.zzc = 0L;
        this.zzd = -1L;
        this.zze = false;
        if(Build.VERSION.SDK_INT < 30) {
            return;
        }
        zzasg zzasg0 = new zzasg(this);
        try {
            ((AppOpsManager)context0.getSystemService("appops")).startWatchingActive(arr_s, executor0, zzasg0);
        }
        catch(NoSuchMethodError | IllegalArgumentException unused_ex) {
        }
    }

    static long zza(zzash zzash0) {
        return zzash0.zzc;
    }

    public final long zzb() {
        long v = this.zzd;
        this.zzd = -1L;
        return v;
    }

    // 去混淆评级： 低(20)
    public final long zzc() {
        return this.zze ? this.zzc - this.zzb : -1L;
    }

    public static zzash zzd(Context context0, Executor executor0) {
        return new zzash(context0, executor0, zzash.zza);
    }

    static void zze(zzash zzash0, long v) {
        zzash0.zzd = v;
    }

    static void zzf(zzash zzash0, boolean z) {
        zzash0.zze = z;
    }

    static void zzg(zzash zzash0, long v) {
        zzash0.zzb = v;
    }

    public final void zzh() {
        if(this.zze) {
            this.zzc = System.currentTimeMillis();
        }
    }
}

