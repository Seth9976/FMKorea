package com.google.android.gms.internal.ads;

public final class zzxm {
    public final int zza;
    public final zzlq[] zzb;
    public final zzxf[] zzc;
    public final zzdh zzd;
    public final Object zze;

    public zzxm(zzlq[] arr_zzlq, zzxf[] arr_zzxf, zzdh zzdh0, Object object0) {
        this.zzb = arr_zzlq;
        this.zzc = (zzxf[])arr_zzxf.clone();
        this.zzd = zzdh0;
        this.zze = object0;
        this.zza = arr_zzlq.length;
    }

    // 去混淆评级： 低(30)
    public final boolean zza(zzxm zzxm0, int v) {
        return zzxm0 == null ? false : zzfk.zzD(this.zzb[v], zzxm0.zzb[v]) && zzfk.zzD(this.zzc[v], zzxm0.zzc[v]);
    }

    public final boolean zzb(int v) {
        return this.zzb[v] != null;
    }
}

