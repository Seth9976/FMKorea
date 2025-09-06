package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class zzdqs implements zzcwl, zzcxw, zzczd {
    private final zzdrc zza;
    private final zzdrm zzb;

    public zzdqs(zzdrc zzdrc0, zzdrm zzdrm0) {
        this.zza = zzdrc0;
        this.zzb = zzdrm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(zze zze0) {
        this.zza.zza().put("action", "ftl");
        this.zza.zza().put("ftl", String.valueOf(zze0.zza));
        this.zza.zza().put("ed", zze0.zzc);
        this.zzb.zze(this.zza.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbun0) {
        this.zza.zzc(zzbun0.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbr0) {
        this.zza.zzb(zzfbr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        this.zza.zza().put("action", "loaded");
        this.zzb.zze(this.zza.zza());
    }
}

