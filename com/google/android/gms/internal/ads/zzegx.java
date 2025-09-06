package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzegx extends zzegs {
    private final zzchd zza;
    private final zzcvq zzb;
    private final zzejg zzc;
    private final zzdbv zzd;
    private final zzehc zze;
    private final zzeds zzf;

    public zzegx(zzchd zzchd0, zzcvq zzcvq0, zzejg zzejg0, zzdbv zzdbv0, zzehc zzehc0, zzeds zzeds0) {
        this.zza = zzchd0;
        this.zzb = zzcvq0;
        this.zzc = zzejg0;
        this.zzd = zzdbv0;
        this.zze = zzehc0;
        this.zzf = zzeds0;
    }

    @Override  // com.google.android.gms.internal.ads.zzegs
    protected final d zzc(zzfca zzfca0, Bundle bundle0, zzfbe zzfbe0, zzfbr zzfbr0) {
        this.zzb.zzi(zzfca0);
        this.zzb.zzf(bundle0);
        zzcvk zzcvk0 = new zzcvk(zzfbr0, zzfbe0, this.zze);
        this.zzb.zzg(zzcvk0);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzdfp zzdfp0 = this.zza.zzg();
        zzdfp0.zze(this.zzb.zzj());
        zzdfp0.zzd(this.zzd);
        zzdfp0.zzc(this.zzc);
        zzctl zzctl0 = zzdfp0.zzf().zza();
        return zzctl0.zzi(zzctl0.zzj());
    }
}

