package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.view.View;

public final class zzeiz implements zzedn {
    private final Context zza;
    private final zzcqz zzb;
    private final zzbcp zzc;
    private final zzfyo zzd;
    private final zzfge zze;

    public zzeiz(Context context0, zzcqz zzcqz0, zzfge zzfge0, zzfyo zzfyo0, zzbcp zzbcp0) {
        this.zza = context0;
        this.zzb = zzcqz0;
        this.zze = zzfge0;
        this.zzd = zzfyo0;
        this.zzc = zzbcp0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final d zza(zzfbr zzfbr0, zzfbe zzfbe0) {
        View view0 = new View(this.zza);
        Object object0 = zzfbe0.zzv.get(0);
        zzeix zzeix0 = new zzeix(this, view0, null, () -> null, ((zzfbf)object0));
        zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, null);
        zzcqd zzcqd0 = this.zzb.zza(zzcst0, zzeix0);
        return zzffo.zzd(() -> this.zzc.zze(new zzbck(zzcqd0.zzk(), zzfbe0.zzt.zzb, zzfbe0.zzt.zza)), this.zzd, zzffy.zzs, this.zze).zzb(zzffy.zzt).zzd(zzfye.zzh(zzcqd0.zza())).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbr0, zzfbe zzfbe0) {
        return this.zzc != null && (zzfbe0.zzt != null && zzfbe0.zzt.zza != null);
    }

    // 检测为 Lambda 实现
    final void zzc(zzbck zzbck0) [...]
}

