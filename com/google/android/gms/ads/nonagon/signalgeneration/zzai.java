package com.google.android.gms.ads.nonagon.signalgeneration;

import Z1.d;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzcvn;
import com.google.android.gms.internal.ads.zzffy;
import com.google.android.gms.internal.ads.zzfge;
import com.google.android.gms.internal.ads.zzgyt;
import com.google.android.gms.internal.ads.zzgzg;
import java.util.concurrent.TimeUnit;

public final class zzai implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzai(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzfge zzfge0 = (zzfge)this.zza.zzb();
        zzak zzak0 = ((zzal)this.zzb).zza();
        d d0 = ((zzcvn)this.zzc).zza().zzc();
        return zzfge0.zzb(zzffy.zzv, d0).zzf(zzak0).zzi(((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzfr)))))), TimeUnit.SECONDS).zza();
    }
}

