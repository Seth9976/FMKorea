package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.Executor;

public final class zzezh implements zzeln {
    private final Context zza;
    private final Executor zzb;
    private final zzchd zzc;
    private final zzekx zzd;
    private final zzfah zze;
    private zzbcp zzf;
    private final zzfhu zzg;
    private final zzfby zzh;
    private d zzi;

    public zzezh(Context context0, Executor executor0, zzchd zzchd0, zzekx zzekx0, zzfah zzfah0, zzfby zzfby0) {
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = zzchd0;
        this.zzd = zzekx0;
        this.zzh = zzfby0;
        this.zze = zzfah0;
        this.zzg = zzchd0.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzeln
    public final boolean zza() {
        return this.zzi != null && !this.zzi.isDone();
    }

    @Override  // com.google.android.gms.internal.ads.zzeln
    public final boolean zzb(zzl zzl0, String s, zzell zzell0, zzelm zzelm0) {
        zzfhr zzfhr1;
        zzdfq zzdfq0;
        if(s == null) {
            zzcaa.zzg("Ad unit ID should not be null for interstitial ad.");
            zzezb zzezb0 = () -> {
                zze zze0 = zzfdb.zzd(6, null, null);
                this.zzd.zzbF(zze0);
            };
            this.zzb.execute(zzezb0);
            return false;
        }
        if(this.zza()) {
            return false;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && zzl0.zzf) {
            this.zzc.zzk().zzn(true);
        }
        this.zzh.zzs(s);
        this.zzh.zzr(((zzeza)zzell0).zza);
        this.zzh.zzE(zzl0);
        zzfca zzfca0 = this.zzh.zzG();
        int v = zzfhq.zzf(zzfca0);
        zzfhg zzfhg0 = zzfhf.zzb(this.zza, v, 4, zzl0);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzhQ)).booleanValue()) {
            zzdfp zzdfp0 = this.zzc.zzg();
            zzcvq zzcvq0 = new zzcvq();
            zzcvq0.zze(this.zza);
            zzcvq0.zzi(zzfca0);
            zzdfp0.zze(zzcvq0.zzj());
            zzdbt zzdbt0 = new zzdbt();
            zzdbt0.zzj(this.zzd, this.zzb);
            zzdbt0.zzk(this.zzd, this.zzb);
            zzdfp0.zzd(zzdbt0.zzn());
            zzdfp0.zzc(new zzejg(this.zzf));
            zzdfq0 = zzdfp0.zzf();
        }
        else {
            zzdbt zzdbt1 = new zzdbt();
            zzfah zzfah0 = this.zze;
            if(zzfah0 != null) {
                zzdbt1.zze(zzfah0, this.zzb);
                zzdbt1.zzf(this.zze, this.zzb);
                zzdbt1.zzb(this.zze, this.zzb);
            }
            zzdfp zzdfp1 = this.zzc.zzg();
            zzcvq zzcvq1 = new zzcvq();
            zzcvq1.zze(this.zza);
            zzcvq1.zzi(zzfca0);
            zzdfp1.zze(zzcvq1.zzj());
            zzdbt1.zzj(this.zzd, this.zzb);
            zzdbt1.zze(this.zzd, this.zzb);
            zzdbt1.zzf(this.zzd, this.zzb);
            zzdbt1.zzb(this.zzd, this.zzb);
            zzdbt1.zza(this.zzd, this.zzb);
            zzdbt1.zzl(this.zzd, this.zzb);
            zzdbt1.zzk(this.zzd, this.zzb);
            zzdbt1.zzi(this.zzd, this.zzb);
            zzdbt1.zzc(this.zzd, this.zzb);
            zzdfp1.zzd(zzdbt1.zzn());
            zzdfp1.zzc(new zzejg(this.zzf));
            zzdfq0 = zzdfp1.zzf();
        }
        if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
            zzfhr zzfhr0 = zzdfq0.zzf();
            zzfhr0.zzh(4);
            zzfhr0.zzb(zzl0.zzp);
            zzfhr1 = zzfhr0;
        }
        else {
            zzfhr1 = null;
        }
        zzctl zzctl0 = zzdfq0.zza();
        d d0 = zzctl0.zzi(zzctl0.zzj());
        this.zzi = d0;
        zzfye.zzr(d0, new zzezg(this, zzelm0, zzfhr1, zzfhg0, zzdfq0), this.zzb);
        return true;
    }

    static void zzg(zzezh zzezh0, d d0) {
        zzezh0.zzi = null;
    }

    // 检测为 Lambda 实现
    final void zzh() [...]

    public final void zzi(zzbcp zzbcp0) {
        this.zzf = zzbcp0;
    }
}

