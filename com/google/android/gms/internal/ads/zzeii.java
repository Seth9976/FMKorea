package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

final class zzeii extends zzbvn {
    final zzcyo zza;
    final zzcwg zzb;
    final zzcxp zzc;
    final zzdef zzd;

    zzeii(zzeij zzeij0, zzcyo zzcyo0, zzcwg zzcwg0, zzcxp zzcxp0, zzdef zzdef0) {
        this.zza = zzcyo0;
        this.zzb = zzcwg0;
        this.zzc = zzcxp0;
        this.zzd = zzdef0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zze(IObjectWrapper iObjectWrapper0) {
        this.zzb.onAdClicked();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzf(IObjectWrapper iObjectWrapper0) {
        this.zza.zzby(4);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzg(IObjectWrapper iObjectWrapper0, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzh(IObjectWrapper iObjectWrapper0) {
        this.zzc.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzi(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzj(IObjectWrapper iObjectWrapper0) {
        this.zza.zzbv();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzk(IObjectWrapper iObjectWrapper0, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzl(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzm(IObjectWrapper iObjectWrapper0, zzbvp zzbvp0) {
        this.zzd.zza(zzbvp0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzn(IObjectWrapper iObjectWrapper0) {
        this.zzc.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzo(IObjectWrapper iObjectWrapper0) {
        this.zzd.zzc();
    }
}

