package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzdlw {
    private final Executor zza;
    private final zzcpi zzb;
    private final zzddq zzc;

    zzdlw(Executor executor0, zzcpi zzcpi0, zzddq zzddq0) {
        this.zza = executor0;
        this.zzc = zzddq0;
        this.zzb = zzcpi0;
    }

    public final void zza(zzcfi zzcfi0) {
        if(zzcfi0 == null) {
            return;
        }
        View view0 = zzcfi0.zzF();
        this.zzc.zza(view0);
        zzdls zzdls0 = new zzdls(zzcfi0);
        this.zzc.zzo(zzdls0, this.zza);
        zzdlt zzdlt0 = new zzdlt(zzcfi0);
        this.zzc.zzo(zzdlt0, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcfi0);
        zzcfi0.zzad("/trackActiveViewUnit", (zzcfi zzcfi0, Map map0) -> this.zzb.zzb());
        zzcfi0.zzad("/untrackActiveViewUnit", (zzcfi zzcfi0, Map map0) -> this.zzb.zza());
    }

    // 检测为 Lambda 实现
    final void zzb(zzcfi zzcfi0, Map map0) [...]

    // 检测为 Lambda 实现
    final void zzc(zzcfi zzcfi0, Map map0) [...]
}

