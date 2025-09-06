package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

public final class zzduj implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzduj(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Context context0 = ((zzchj)this.zza).zza();
        WeakReference weakReference0 = ((zzchk)this.zzb).zza();
        Object object0 = this.zzc.zzb();
        zzduz zzduz0 = new zzduz();
        zzgzb.zzb(zzcan.zza);
        return new zzduy(context0, weakReference0, ((zzdum)object0), zzduz0, zzcan.zza);
    }
}

