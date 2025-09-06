package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

final class zzld implements zzku {
    public final zztn zza;
    public final Object zzb;
    public final List zzc;
    public int zzd;
    public boolean zze;

    public zzld(zztu zztu0, boolean z) {
        this.zza = new zztn(zztu0, z);
        this.zzc = new ArrayList();
        this.zzb = new Object();
    }

    @Override  // com.google.android.gms.internal.ads.zzku
    public final zzcw zza() {
        return this.zza.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzku
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int v) {
        this.zzd = v;
        this.zze = false;
        this.zzc.clear();
    }
}

