package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzegv extends zzegs {
    private final zzchd zza;
    private final zzcvq zzb;
    private final zzejg zzc;
    private final zzdbv zzd;
    private final zzdgh zze;
    private final zzcyx zzf;
    private final ViewGroup zzg;
    private final zzdbe zzh;
    private final zzehc zzi;
    private final zzeds zzj;

    public zzegv(zzchd zzchd0, zzcvq zzcvq0, zzejg zzejg0, zzdbv zzdbv0, zzdgh zzdgh0, zzcyx zzcyx0, ViewGroup viewGroup0, zzdbe zzdbe0, zzehc zzehc0, zzeds zzeds0) {
        this.zza = zzchd0;
        this.zzb = zzcvq0;
        this.zzc = zzejg0;
        this.zzd = zzdbv0;
        this.zze = zzdgh0;
        this.zzf = zzcyx0;
        this.zzg = viewGroup0;
        this.zzh = zzdbe0;
        this.zzi = zzehc0;
        this.zzj = zzeds0;
    }

    @Override  // com.google.android.gms.internal.ads.zzegs
    protected final d zzc(zzfca zzfca0, Bundle bundle0, zzfbe zzfbe0, zzfbr zzfbr0) {
        this.zzb.zzi(zzfca0);
        this.zzb.zzf(bundle0);
        zzcvk zzcvk0 = new zzcvk(zzfbr0, zzfbe0, this.zzi);
        this.zzb.zzg(zzcvk0);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            this.zzb.zzd(this.zzj);
        }
        zzcqy zzcqy0 = this.zza.zze();
        zzcqy0.zzi(this.zzb.zzj());
        zzcqy0.zzf(this.zzd);
        zzcqy0.zze(this.zzc);
        zzcqy0.zzd(this.zze);
        zzcqy0.zzg(new zzcrw(this.zzf, this.zzh));
        zzcqy0.zzc(new zzcpz(this.zzg));
        zzctl zzctl0 = zzcqy0.zzk().zzd();
        return zzctl0.zzi(zzctl0.zzj());
    }
}

