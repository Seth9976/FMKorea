package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbg;
import com.google.android.gms.ads.internal.client.zze;

final class zzdsr extends zzbg {
    final zzdsl zza;
    final zzdss zzb;

    zzdsr(zzdss zzdss0, zzdsl zzdsl0) {
        this.zzb = zzdss0;
        this.zza = zzdsl0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() {
        long v = zzdss.zzd(this.zzb);
        this.zza.zzb(v);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() {
        long v = zzdss.zzd(this.zzb);
        this.zza.zzc(v);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int v) {
        this.zza.zzd(zzdss.zzd(this.zzb), v);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(zze zze0) {
        this.zza.zzd(zzdss.zzd(this.zzb), zze0.zza);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        this.zza.zze(zzdss.zzd(this.zzb));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        this.zza.zzg(zzdss.zzd(this.zzb));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
    }
}

