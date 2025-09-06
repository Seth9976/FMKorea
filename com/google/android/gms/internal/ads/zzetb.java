package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.ScheduledExecutorService;

public final class zzetb implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzetb(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzg zzg0 = ((zzchh)this.zza).zza();
        Context context0 = ((zzchj)this.zzb).zza();
        zzgzb.zzb(zzcan.zza);
        Object object0 = this.zzd.zzb();
        zzedl zzedl0 = ((zzedm)this.zze).zza();
        return new zzesy(zzg0, context0, zzcan.zza, ((ScheduledExecutorService)object0), zzedl0);
    }
}

