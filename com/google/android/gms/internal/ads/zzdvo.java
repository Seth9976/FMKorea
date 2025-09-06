package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

public final class zzdvo implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzdvo(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzfge zzfge0 = (zzfge)this.zza.zzb();
        zzffv zzffv0 = zzffo.zza(new zzdvl(zzt.zzq().zzb(((Context)this.zzb.zzb()))), zzffy.zzu, zzfge0).zzi(1L, TimeUnit.SECONDS);
        zzffr zzffr0 = new zzffr(zzdvm.zza);
        return zzffv0.zzc(Exception.class, zzffr0).zza();
    }
}

