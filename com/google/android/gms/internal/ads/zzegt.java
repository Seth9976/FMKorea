package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzegt extends zzegs {
    private final zzchd zza;
    private final zzcvq zzb;
    private final zzdbv zzc;
    private final zzehc zzd;
    private final zzeds zze;

    zzegt(zzchd zzchd0, zzcvq zzcvq0, zzdbv zzdbv0, zzehc zzehc0, zzeds zzeds0) {
        this.zza = zzchd0;
        this.zzb = zzcvq0;
        this.zzc = zzdbv0;
        this.zzd = zzehc0;
        this.zze = zzeds0;
    }

    @Override  // com.google.android.gms.internal.ads.zzegs
    protected final d zzc(zzfca zzfca0, Bundle bundle0, zzfbe zzfbe0, zzfbr zzfbr0) {
        this.zzb.zzi(zzfca0);
        this.zzb.zzf(bundle0);
        zzcvk zzcvk0 = new zzcvk(zzfbr0, zzfbe0, this.zzd);
        this.zzb.zzg(zzcvk0);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzcpp zzcpp0 = this.zza.zzd();
        zzcpp0.zzd(this.zzb.zzj());
        zzcpp0.zzc(this.zzc);
        zzctl zzctl0 = zzcpp0.zze().zzb();
        return zzctl0.zzi(zzctl0.zzj());
    }
}

