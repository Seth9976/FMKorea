package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzegz extends zzegs {
    private final zzchd zza;
    private final zzcvq zzb;
    private final zzdbv zzc;
    private final zzehc zzd;
    private final zzfbs zze;
    private final zzeds zzf;

    public zzegz(zzchd zzchd0, zzcvq zzcvq0, zzdbv zzdbv0, zzfbs zzfbs0, zzehc zzehc0, zzeds zzeds0) {
        this.zza = zzchd0;
        this.zzb = zzcvq0;
        this.zzc = zzdbv0;
        this.zze = zzfbs0;
        this.zzd = zzehc0;
        this.zzf = zzeds0;
    }

    @Override  // com.google.android.gms.internal.ads.zzegs
    protected final d zzc(zzfca zzfca0, Bundle bundle0, zzfbe zzfbe0, zzfbr zzfbr0) {
        this.zzb.zzi(zzfca0);
        this.zzb.zzf(bundle0);
        zzcvk zzcvk0 = new zzcvk(zzfbr0, zzfbe0, this.zzd);
        this.zzb.zzg(zzcvk0);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzdn)).booleanValue()) {
            zzfbs zzfbs0 = this.zze;
            if(zzfbs0 != null) {
                this.zzb.zzh(zzfbs0);
            }
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzdnu zzdnu0 = this.zza.zzi();
        zzdnu0.zzd(this.zzb.zzj());
        zzdnu0.zzc(this.zzc);
        zzctl zzctl0 = zzdnu0.zze().zzb();
        return zzctl0.zzi(zzctl0.zzj());
    }
}

