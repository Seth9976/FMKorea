package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;

public final class zzctv implements zza, zzcwi, zzcxc, zzcxw, zzczd, zzdbp {
    private final Clock zza;
    private final zzbzc zzb;

    public zzctv(Clock clock0, zzbzc zzbzc0) {
        this.zza = clock0;
        this.zzb = zzbzc0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
        this.zzb.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbun0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbr0) {
        long v = this.zza.elapsedRealtime();
        this.zzb.zzk(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(zzbvd zzbvd0, String s, String s1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbp
    public final void zzh() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdbp
    public final void zzi(zzaxz zzaxz0) {
        this.zzb.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbp
    public final void zzj(zzaxz zzaxz0) {
    }

    public final void zzk(zzl zzl0) {
        this.zzb.zzj(zzl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbp
    public final void zzl(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdbp
    public final void zzm(zzaxz zzaxz0) {
        this.zzb.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbp
    public final void zzn(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        this.zzb.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        this.zzb.zzh(true);
    }
}

