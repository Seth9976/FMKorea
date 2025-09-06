package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class zzaxj {
    final zzaxk zza;
    private final byte[] zzb;
    private int zzc;

    zzaxj(zzaxk zzaxk0, byte[] arr_b, zzaxi zzaxi0) {
        this.zza = zzaxk0;
        super();
        this.zzb = arr_b;
    }

    public final zzaxj zza(int v) {
        this.zzc = v;
        return this;
    }

    // 检测为 Lambda 实现
    public static void zzb(zzaxj zzaxj0) [...]

    public final void zzc() {
        synchronized(this) {
            zzaxk.zza(this.zza).execute(() -> this.zzd());
        }
    }

    private final void zzd() {
        synchronized(this) {
            zzaxk zzaxk0 = this.zza;
            if(zzaxk0.zzb) {
                try {
                    zzaxk0.zza.zzj(this.zzb);
                    this.zza.zza.zzi(0);
                    this.zza.zza.zzg(this.zzc);
                    this.zza.zza.zzh(null);
                    this.zza.zza.zzf();
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzf("Clearcut log failed", remoteException0);
                }
            }
        }
    }
}

