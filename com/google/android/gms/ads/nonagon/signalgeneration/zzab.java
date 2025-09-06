package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzchv;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzfcx;
import com.google.android.gms.internal.ads.zzfik;
import com.google.android.gms.internal.ads.zzgyt;
import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzgzg;
import java.util.concurrent.ScheduledExecutorService;

public final class zzab implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;

    public zzab(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4, zzgzg zzgzg5, zzgzg zzgzg6, zzgzg zzgzg7, zzgzg zzgzg8) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
        this.zzf = zzgzg5;
        this.zzg = zzgzg6;
        this.zzh = zzgzg7;
        this.zzi = zzgzg8;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Object object0 = this.zza.zzb();
        Context context0 = ((zzchj)this.zzb).zza();
        Object object1 = this.zzc.zzb();
        Object object2 = this.zzd.zzb();
        zzgzb.zzb(zzcan.zza);
        Object object3 = this.zzf.zzb();
        Object object4 = this.zzg.zzb();
        Object object5 = this.zzh.zzb();
        zzcag zzcag0 = ((zzchv)this.zzi).zza();
        return new zzaa(((zzchd)object0), context0, ((zzaqx)object1), ((zzfcx)object2), zzcan.zza, ((ScheduledExecutorService)object3), ((zzdrm)object4), ((zzfik)object5), zzcag0);
    }
}

