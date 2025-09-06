package com.google.android.gms.internal.ads;

import Z1.d;

public final class zzeje implements zzedn {
    private final zzbcp zza;
    private final zzfyo zzb;
    private final zzfge zzc;
    private final zzejn zzd;

    public zzeje(zzfge zzfge0, zzfyo zzfyo0, zzbcp zzbcp0, zzejn zzejn0) {
        this.zzc = zzfge0;
        this.zzb = zzfyo0;
        this.zza = zzbcp0;
        this.zzd = zzejn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final d zza(zzfbr zzfbr0, zzfbe zzfbe0) {
        zzcas zzcas0 = new zzcas();
        zzejj zzejj0 = new zzejj();
        zzejj0.zzd(new zzejd(this, zzcas0, zzfbr0, zzfbe0, zzejj0));
        return zzffo.zzd(() -> this.zza.zze(new zzbck(zzejj0, zzfbe0.zzt.zzb, zzfbe0.zzt.zza)), this.zzb, zzffy.zzs, this.zzc).zzb(zzffy.zzt).zzd(zzcas0).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbr0, zzfbe zzfbe0) {
        return this.zza != null && (zzfbe0.zzt != null && zzfbe0.zzt.zza != null);
    }

    // 检测为 Lambda 实现
    final void zzc(zzbck zzbck0) [...]

    static zzejn zzd(zzeje zzeje0) {
        return zzeje0.zzd;
    }
}

