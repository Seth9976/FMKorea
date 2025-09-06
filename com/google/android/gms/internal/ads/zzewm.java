package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;

public abstract class zzewm implements zzeln {
    protected final zzchd zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzexc zzd;
    private final zzeyv zze;
    private final zzcag zzf;
    private final ViewGroup zzg;
    private final zzfhu zzh;
    private final zzfby zzi;
    private d zzj;

    protected zzewm(Context context0, Executor executor0, zzchd zzchd0, zzeyv zzeyv0, zzexc zzexc0, zzfby zzfby0, zzcag zzcag0) {
        this.zzb = context0;
        this.zzc = executor0;
        this.zza = zzchd0;
        this.zze = zzeyv0;
        this.zzd = zzexc0;
        this.zzi = zzfby0;
        this.zzf = zzcag0;
        this.zzg = new FrameLayout(context0);
        this.zzh = zzchd0.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzeln
    public final boolean zza() {
        return this.zzj != null && !this.zzj.isDone();
    }

    @Override  // com.google.android.gms.internal.ads.zzeln
    public final boolean zzb(zzl zzl0, String s, zzell zzell0, zzelm zzelm0) {
        zzfhr zzfhr1;
        synchronized(this) {
            boolean z = ((Boolean)zzbdi.zzd.zze()).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzkc)).booleanValue();
            if(this.zzf.zzc < ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzkd)))) || !z) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            if(s == null) {
                zzcaa.zzg("Ad unit ID should not be null for app open ad.");
                zzewg zzewg0 = () -> {
                    zze zze0 = zzfdb.zzd(6, null, null);
                    this.zzd.zzbF(zze0);
                };
                this.zzc.execute(zzewg0);
                return false;
            }
            if(this.zzj != null) {
                return false;
            }
            if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
                zzeyv zzeyv0 = this.zze;
                if(zzeyv0.zzd() == null) {
                    zzfhr1 = null;
                }
                else {
                    zzfhr zzfhr0 = ((zzcpm)zzeyv0.zzd()).zzh();
                    zzfhr0.zzh(7);
                    zzfhr0.zzb(zzl0.zzp);
                    zzfhr1 = zzfhr0;
                }
            }
            else {
                zzfhr1 = null;
            }
            zzfcv.zza(this.zzb, zzl0.zzf);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && zzl0.zzf) {
                this.zza.zzk().zzn(true);
            }
            this.zzi.zzs(s);
            zzq zzq0 = zzq.zzb();
            this.zzi.zzr(zzq0);
            this.zzi.zzE(zzl0);
            zzfca zzfca0 = this.zzi.zzG();
            int v1 = zzfhq.zzf(zzfca0);
            zzfhg zzfhg0 = zzfhf.zzb(this.zzb, v1, 7, zzl0);
            zzewl zzewl0 = new zzewl(null);
            zzewl0.zza = zzfca0;
            zzeyw zzeyw0 = new zzeyw(zzewl0, null);
            zzewh zzewh0 = (zzeyt zzeyt0) -> this.zzm(zzeyt0);
            d d0 = this.zze.zzc(zzeyw0, zzewh0, null);
            this.zzj = d0;
            zzfye.zzr(d0, new zzewj(this, zzelm0, zzfhr1, zzfhg0, zzewl0), this.zzc);
            return true;
        }
    }

    // 检测为 Lambda 实现
    public static zzcvo zzc(zzewm zzewm0, zzeyt zzeyt0) [...]

    static zzcvo zzd(zzewm zzewm0, zzeyt zzeyt0) {
        return zzewm0.zzm(zzeyt0);
    }

    protected abstract zzcvo zze(zzcpz arg1, zzcvs arg2, zzdbv arg3);

    static zzeyv zzg(zzewm zzewm0) {
        return zzewm0.zze;
    }

    static Executor zzi(zzewm zzewm0) {
        return zzewm0.zzc;
    }

    static void zzj(zzewm zzewm0, d d0) {
        zzewm0.zzj = null;
    }

    // 检测为 Lambda 实现
    final void zzk() [...]

    public final void zzl(zzw zzw0) {
        this.zzi.zzt(zzw0);
    }

    private final zzcvo zzm(zzeyt zzeyt0) {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzhP)).booleanValue()) {
                zzcpz zzcpz0 = new zzcpz(this.zzg);
                zzcvq zzcvq0 = new zzcvq();
                zzcvq0.zze(this.zzb);
                zzcvq0.zzi(((zzewl)zzeyt0).zza);
                zzcvs zzcvs0 = zzcvq0.zzj();
                zzdbt zzdbt0 = new zzdbt();
                zzdbt0.zzc(this.zzd, this.zzc);
                zzdbt0.zzl(this.zzd, this.zzc);
                return this.zze(zzcpz0, zzcvs0, zzdbt0.zzn());
            }
            zzexc zzexc0 = zzexc.zzi(this.zzd);
            zzdbt zzdbt1 = new zzdbt();
            zzdbt1.zzb(zzexc0, this.zzc);
            zzdbt1.zzg(zzexc0, this.zzc);
            zzdbt1.zzh(zzexc0, this.zzc);
            zzdbt1.zzi(zzexc0, this.zzc);
            zzdbt1.zzc(zzexc0, this.zzc);
            zzdbt1.zzl(zzexc0, this.zzc);
            zzdbt1.zzm(zzexc0);
            zzcpz zzcpz1 = new zzcpz(this.zzg);
            zzcvq zzcvq1 = new zzcvq();
            zzcvq1.zze(this.zzb);
            zzcvq1.zzi(((zzewl)zzeyt0).zza);
            return this.zze(zzcpz1, zzcvq1.zzj(), zzdbt1.zzn());
        }
    }
}

