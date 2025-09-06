package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzae;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.ads.nonagon.signalgeneration.zzh;

final class zzcld implements zzg {
    private final zzciz zza;
    private zzcvs zzb;
    private zzae zzc;

    zzcld(zzciz zzciz0, zzclc zzclc0) {
        this.zza = zzciz0;
    }

    @Override  // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final zzg zza(zzcvs zzcvs0) {
        this.zzb = zzcvs0;
        return this;
    }

    @Override  // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final zzg zzb(zzae zzae0) {
        this.zzc = zzae0;
        return this;
    }

    @Override  // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final zzh zzc() {
        zzgzb.zzc(this.zzb, zzcvs.class);
        zzgzb.zzc(this.zzc, zzae.class);
        zzae zzae0 = this.zzc;
        zzctn zzctn0 = new zzctn();
        zzdru zzdru0 = new zzdru();
        return new zzclf(this.zza, zzae0, zzctn0, zzdru0, this.zzb, null, null, null);
    }
}

