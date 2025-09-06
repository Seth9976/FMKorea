package com.google.android.gms.internal.ads;

import java.util.List;

final class zzfuc extends zzfud {
    final transient int zza;
    final transient int zzb;
    final zzfud zzc;

    zzfuc(zzfud zzfud0, int v, int v1) {
        this.zzc = zzfud0;
        super();
        this.zza = v;
        this.zzb = v1;
    }

    @Override
    public final Object get(int v) {
        zzfri.zza(v, this.zzb, "index");
        return this.zzc.get(v + this.zza);
    }

    @Override
    public final int size() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfud
    public final List subList(int v, int v1) {
        return this.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final boolean zzf() {
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzfud
    public final zzfud zzh(int v, int v1) {
        zzfri.zzh(v, v1, this.zzb);
        return this.zzc.zzh(v + this.zza, v1 + this.zza);
    }
}

