package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

public final class zzfar implements zzeln {
    private final Context zza;
    private final Executor zzb;
    private final zzchd zzc;
    private final zzfah zzd;
    private final zzeyv zze;
    private final zzfbs zzf;
    private final zzfhu zzg;
    private final zzfby zzh;
    private d zzi;

    public zzfar(Context context0, Executor executor0, zzchd zzchd0, zzeyv zzeyv0, zzfah zzfah0, zzfby zzfby0, zzfbs zzfbs0) {
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = zzchd0;
        this.zze = zzeyv0;
        this.zzd = zzfah0;
        this.zzh = zzfby0;
        this.zzf = zzfbs0;
        this.zzg = zzchd0.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzeln
    public final boolean zza() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzeln
    public final boolean zzb(zzl zzl0, String s, zzell zzell0, zzelm zzelm0) {
        zzfhr zzfhr1;
        zzbvk zzbvk0 = new zzbvk(zzl0, s);
        if(zzbvk0.zzb == null) {
            zzcaa.zzg("Ad unit ID should not be null for rewarded video ad.");
            zzfak zzfak0 = () -> {
                zze zze0 = zzfdb.zzd(6, null, null);
                this.zzd.zzbF(zze0);
            };
            this.zzb.execute(zzfak0);
            return false;
        }
        if(this.zzi == null || this.zzi.isDone()) {
            if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
                zzeyv zzeyv0 = this.zze;
                if(zzeyv0.zzd() == null) {
                    zzfhr1 = null;
                }
                else {
                    zzfhr zzfhr0 = ((zzdnv)zzeyv0.zzd()).zzh();
                    zzfhr0.zzh(5);
                    zzfhr0.zzb(zzbvk0.zza.zzp);
                    zzfhr1 = zzfhr0;
                }
            }
            else {
                zzfhr1 = null;
            }
            zzfcv.zza(this.zza, zzbvk0.zza.zzf);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && zzbvk0.zza.zzf) {
                this.zzc.zzk().zzn(true);
            }
            this.zzh.zzs(zzbvk0.zzb);
            zzq zzq0 = zzq.zzd();
            this.zzh.zzr(zzq0);
            this.zzh.zzE(zzbvk0.zza);
            zzfca zzfca0 = this.zzh.zzG();
            int v = zzfhq.zzf(zzfca0);
            zzfhg zzfhg0 = zzfhf.zzb(this.zza, v, 5, zzbvk0.zza);
            zzfaq zzfaq0 = new zzfaq(null);
            zzfaq0.zza = zzfca0;
            zzeyw zzeyw0 = new zzeyw(zzfaq0, null);
            zzfal zzfal0 = (zzeyt zzeyt0) -> this.zzk(zzeyt0);
            d d0 = this.zze.zzc(zzeyw0, zzfal0, null);
            this.zzi = d0;
            zzfye.zzr(d0, new zzfao(this, zzelm0, zzfhr1, zzfhg0, zzfaq0), this.zzb);
            return true;
        }
        return false;
    }

    // 检测为 Lambda 实现
    public static zzdnu zzc(zzfar zzfar0, zzeyt zzeyt0) [...]

    static zzdnu zzd(zzfar zzfar0, zzeyt zzeyt0) {
        return zzfar0.zzk(zzeyt0);
    }

    static zzeyv zze(zzfar zzfar0) {
        return zzfar0.zze;
    }

    // 检测为 Lambda 实现
    final void zzi() [...]

    final void zzj(int v) {
        this.zzh.zzo().zza(v);
    }

    private final zzdnu zzk(zzeyt zzeyt0) {
        zzdnu zzdnu0 = this.zzc.zzi();
        zzcvq zzcvq0 = new zzcvq();
        zzcvq0.zze(this.zza);
        zzcvq0.zzi(((zzfaq)zzeyt0).zza);
        zzcvq0.zzh(this.zzf);
        zzdnu0.zzd(zzcvq0.zzj());
        zzdnu0.zzc(new zzdbt().zzn());
        return zzdnu0;
    }
}

