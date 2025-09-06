package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

public final class zzdqw implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdqw(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzdqs zzdqs0 = (zzdqs)this.zza.zzb();
        zzgzb.zzb(zzcan.zza);
        zzeak zzeak0 = (zzeak)this.zzc.zzb();
        return ((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue() ? new zzddo(zzeak0, zzcan.zza) : new zzddo(zzdqs0, zzcan.zza);
    }
}

