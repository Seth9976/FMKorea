package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

public final class zzcie implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzcie(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    public final zzbuy zza() {
        Context context0 = ((zzchj)this.zza).zza();
        zzfhu zzfhu0 = (zzfhu)this.zzb.zzb();
        zzt.zzf().zzb(context0, zzcag.zza(), zzfhu0).zza("google.afma.request.getAdDictionary", zzbnf.zza, zzbnf.zza);
        return new zzbux(context0, zzt.zzf().zzb(context0, zzcag.zza(), zzfhu0).zza("google.afma.sdkConstants.getSdkConstants", zzbnf.zza, zzbnf.zza));
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

