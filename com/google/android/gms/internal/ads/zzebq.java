package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

public final class zzebq implements zzfgf {
    private final zzebe zza;
    private final zzebi zzb;

    zzebq(zzebe zzebe0, zzebi zzebi0) {
        this.zza = zzebe0;
        this.zzb = zzebi0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffy0, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbH(zzffy zzffy0, String s, Throwable throwable0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzgb)).booleanValue() && zzffy.zzd == zzffy0 && this.zza.zzc() != 0L) {
            long v = zzt.zzB().elapsedRealtime();
            long v1 = this.zza.zzc();
            this.zza.zzf(v - v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbI(zzffy zzffy0, String s) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzgb)).booleanValue()) {
            return;
        }
        if(zzffy.zzd == zzffy0) {
            long v = zzt.zzB().elapsedRealtime();
            this.zza.zzg(v);
            return;
        }
        if(zzffy.zzz != zzffy0 && zzffy.zzc != zzffy0) {
            return;
        }
        long v1 = zzt.zzB().elapsedRealtime();
        this.zza.zzh(v1);
        long v2 = this.zza.zzd();
        zzebh zzebh0 = new zzebh(this.zzb, v2);
        this.zzb.zza.zza(zzebh0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffy0, String s) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzgb)).booleanValue() && zzffy.zzd == zzffy0 && this.zza.zzc() != 0L) {
            long v = zzt.zzB().elapsedRealtime();
            long v1 = this.zza.zzc();
            this.zza.zzf(v - v1);
        }
    }
}

