package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzelu implements zzeln {
    private final zzfby zza;
    private final zzchd zzb;
    private final Context zzc;
    private final zzelk zzd;
    private final zzfhu zze;
    private zzcss zzf;

    public zzelu(zzchd zzchd0, Context context0, zzelk zzelk0, zzfby zzfby0) {
        this.zzb = zzchd0;
        this.zzc = context0;
        this.zzd = zzelk0;
        this.zza = zzfby0;
        this.zze = zzchd0.zzz();
        zzfby0.zzu(zzelk0.zzd());
    }

    @Override  // com.google.android.gms.internal.ads.zzeln
    public final boolean zza() {
        return this.zzf != null && this.zzf.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzeln
    public final boolean zzb(zzl zzl0, String s, zzell zzell0, zzelm zzelm0) {
        zzfhr zzfhr1;
        if(zzs.zzE(this.zzc) && zzl0.zzs == null) {
            zzcaa.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzB().execute(() -> {
                zze zze0 = zzfdb.zzd(4, null, null);
                this.zzd.zza().zzbF(zze0);
            });
            return false;
        }
        if(s == null) {
            zzcaa.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzB().execute(() -> {
                zze zze0 = zzfdb.zzd(6, null, null);
                this.zzd.zza().zzbF(zze0);
            });
            return false;
        }
        zzfcv.zza(this.zzc, zzl0.zzf);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && zzl0.zzf) {
            this.zzb.zzk().zzn(true);
        }
        this.zza.zzE(zzl0);
        this.zza.zzz(((zzelo)zzell0).zza);
        zzfca zzfca0 = this.zza.zzG();
        int v = zzfhq.zzf(zzfca0);
        zzfhg zzfhg0 = zzfhf.zzb(this.zzc, v, 8, zzl0);
        zzcb zzcb0 = zzfca0.zzn;
        if(zzcb0 != null) {
            this.zzd.zzd().zzm(zzcb0);
        }
        zzdgl zzdgl0 = this.zzb.zzh();
        zzcvq zzcvq0 = new zzcvq();
        zzcvq0.zze(this.zzc);
        zzcvq0.zzi(zzfca0);
        zzdgl0.zzf(zzcvq0.zzj());
        zzdbt zzdbt0 = new zzdbt();
        Executor executor0 = this.zzb.zzB();
        zzdbt0.zzk(this.zzd.zzd(), executor0);
        zzdgl0.zze(zzdbt0.zzn());
        zzdgl0.zzd(this.zzd.zzc());
        zzdgl0.zzc(new zzcpz(null));
        zzdgm zzdgm0 = zzdgl0.zzg();
        if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
            zzfhr zzfhr0 = zzdgm0.zzf();
            zzfhr0.zzh(8);
            zzfhr0.zzb(zzl0.zzp);
            zzfhr1 = zzfhr0;
        }
        else {
            zzfhr1 = null;
        }
        this.zzb.zzx().zzc(1);
        zzgzb.zzb(zzcan.zza);
        ScheduledExecutorService scheduledExecutorService0 = this.zzb.zzC();
        zzctl zzctl0 = zzdgm0.zza();
        d d0 = zzctl0.zzi(zzctl0.zzj());
        zzcss zzcss0 = new zzcss(zzcan.zza, scheduledExecutorService0, d0);
        this.zzf = zzcss0;
        zzcss0.zze(new zzelt(this, zzelm0, zzfhr1, zzfhg0, zzdgm0));
        return true;
    }

    // 检测为 Lambda 实现
    final void zzf() [...]

    // 检测为 Lambda 实现
    final void zzg() [...]
}

