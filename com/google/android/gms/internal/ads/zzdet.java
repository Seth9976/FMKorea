package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public class zzdet {
    private final zzdfy zza;
    private final zzcfi zzb;

    public zzdet(zzdfy zzdfy0, zzcfi zzcfi0) {
        this.zza = zzdfy0;
        this.zzb = zzcfi0;
    }

    public final View zza() {
        zzcfi zzcfi0 = this.zzb;
        return zzcfi0 == null ? null : zzcfi0.zzG();
    }

    public final View zzb() {
        zzcfi zzcfi0 = this.zzb;
        return zzcfi0 != null ? zzcfi0.zzG() : null;
    }

    public final zzcfi zzc() {
        return this.zzb;
    }

    public final zzddo zzd(Executor executor0) {
        return new zzddo(new zzder(this.zzb), executor0);
    }

    public final zzdfy zze() {
        return this.zza;
    }

    public Set zzf(zzcvf zzcvf0) {
        return Collections.singleton(new zzddo(zzcvf0, zzcan.zzf));
    }

    public Set zzg(zzcvf zzcvf0) {
        return Collections.singleton(new zzddo(zzcvf0, zzcan.zzf));
    }

    public static final zzddo zzh(zzfhd zzfhd0) {
        return new zzddo(zzfhd0, zzcan.zzf);
    }

    public static final zzddo zzi(zzdgd zzdgd0) {
        return new zzddo(zzdgd0, zzcan.zzf);
    }
}

