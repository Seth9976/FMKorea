package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzegq extends zzegs {
    private final zzchd zza;
    private final zzdgh zzb;
    private final zzcvq zzc;
    private final zzdbv zzd;
    private final zzehc zze;
    private final zzeds zzf;

    public zzegq(zzchd zzchd0, zzdgh zzdgh0, zzcvq zzcvq0, zzdbv zzdbv0, zzehc zzehc0, zzeds zzeds0) {
        this.zza = zzchd0;
        this.zzb = zzdgh0;
        this.zzc = zzcvq0;
        this.zzd = zzdbv0;
        this.zze = zzehc0;
        this.zzf = zzeds0;
    }

    @Override  // com.google.android.gms.internal.ads.zzegs
    protected final d zzc(zzfca zzfca0, Bundle bundle0, zzfbe zzfbe0, zzfbr zzfbr0) {
        this.zzc.zzi(zzfca0);
        this.zzc.zzf(bundle0);
        zzcvk zzcvk0 = new zzcvk(zzfbr0, zzfbe0, this.zze);
        this.zzc.zzg(zzcvk0);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            this.zzc.zzd(this.zzf);
        }
        zzdgl zzdgl0 = this.zza.zzh();
        zzdgl0.zzf(this.zzc.zzj());
        zzdgl0.zze(this.zzd);
        zzdgl0.zzd(this.zzb);
        zzdgl0.zzc(new zzcpz(null));
        zzctl zzctl0 = zzdgl0.zzg().zza();
        return zzctl0.zzi(zzctl0.zzj());
    }
}

