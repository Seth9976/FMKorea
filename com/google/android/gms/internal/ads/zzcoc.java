package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcoc implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;

    public zzcoc(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4, zzgzg zzgzg5, zzgzg zzgzg6) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
        this.zzf = zzgzg5;
        this.zzg = zzgzg6;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Context context0 = ((zzchj)this.zza).zza();
        zzg zzg0 = ((zzchh)this.zzb).zza();
        Object object0 = this.zzc.zzb();
        Object object1 = this.zzd.zzb();
        zzgzb.zzb(zzcan.zza);
        Object object2 = this.zzf.zzb();
        Object object3 = this.zzg.zzb();
        return new zzcob(context0, zzg0, ((zzedj)object0), ((zzdor)object1), zzcan.zza, ((zzfyo)object2), ((ScheduledExecutorService)object3));
    }
}

