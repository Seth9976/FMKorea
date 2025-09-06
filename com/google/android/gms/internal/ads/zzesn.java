package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

public final class zzesn implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzesn(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
    }

    public final zzesm zza() {
        Context context0 = ((zzchj)this.zza).zza();
        zzgzb.zzb(zzcan.zza);
        Set set0 = ((zzgze)this.zzc).zzc();
        Object object0 = this.zzd.zzb();
        Object object1 = this.zze.zzb();
        return new zzesm(context0, zzcan.zza, set0, ((zzfhr)object0), ((zzdrh)object1));
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

