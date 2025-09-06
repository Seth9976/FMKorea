package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzdmy implements Callable {
    private final zza zza;
    private final zzcfu zzb;
    private final Context zzc;
    private final zzdrh zzd;
    private final zzfgo zze;
    private final zzech zzf;
    private final Executor zzg;
    private final zzaqx zzh;
    private final zzcag zzi;
    private final zzfik zzj;
    private final zzecs zzk;

    public zzdmy(Context context0, Executor executor0, zzaqx zzaqx0, zzcag zzcag0, zza zza0, zzcfu zzcfu0, zzech zzech0, zzfik zzfik0, zzdrh zzdrh0, zzfgo zzfgo0, zzecs zzecs0) {
        this.zzc = context0;
        this.zzg = executor0;
        this.zzh = zzaqx0;
        this.zzi = zzcag0;
        this.zza = zza0;
        this.zzb = zzcfu0;
        this.zzf = zzech0;
        this.zzj = zzfik0;
        this.zzd = zzdrh0;
        this.zze = zzfgo0;
        this.zzk = zzecs0;
    }

    @Override
    public final Object call() {
        zzdnb zzdnb0 = new zzdnb(this);
        zzdnb0.zzh();
        return zzdnb0;
    }
}

