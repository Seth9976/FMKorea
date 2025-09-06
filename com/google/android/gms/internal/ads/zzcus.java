package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

public final class zzcus implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzcus(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzdqq zzdqq0 = (zzdqq)this.zza.zzb();
        zzgzb.zzb(zzcan.zza);
        zzeai zzeai0 = (zzeai)this.zzc.zzb();
        return ((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue() ? new zzddo(zzeai0, zzcan.zza) : new zzddo(zzdqq0, zzcan.zza);
    }
}

