package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.Executor;

public final class zzexq implements zzeln {
    private final Context zza;
    private final Executor zzb;
    private final zzchd zzc;
    private final zzekx zzd;
    private final zzelb zze;
    private final ViewGroup zzf;
    private zzbcp zzg;
    private final zzcyx zzh;
    private final zzfhu zzi;
    private final zzdbe zzj;
    private final zzfby zzk;
    private d zzl;

    public zzexq(Context context0, Executor executor0, zzq zzq0, zzchd zzchd0, zzekx zzekx0, zzelb zzelb0, zzfby zzfby0, zzdbe zzdbe0) {
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = zzchd0;
        this.zzd = zzekx0;
        this.zze = zzelb0;
        this.zzk = zzfby0;
        this.zzh = zzchd0.zzf();
        this.zzi = zzchd0.zzz();
        this.zzf = new FrameLayout(context0);
        this.zzj = zzdbe0;
        zzfby0.zzr(zzq0);
    }

    @Override  // com.google.android.gms.internal.ads.zzeln
    public final boolean zza() {
        return this.zzl != null && !this.zzl.isDone();
    }

    @Override  // com.google.android.gms.internal.ads.zzeln
    public final boolean zzb(zzl zzl0, String s, zzell zzell0, zzelm zzelm0) {
        zzfhr zzfhr1;
        zzcqz zzcqz0;
        if(s == null) {
            zzcaa.zzg("Ad unit ID should not be null for banner ad.");
            zzexm zzexm0 = () -> {
                zze zze0 = zzfdb.zzd(6, null, null);
                this.zzd.zzbF(zze0);
            };
            this.zzb.execute(zzexm0);
            return false;
        }
        if(this.zza()) {
            return false;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && zzl0.zzf) {
            this.zzc.zzk().zzn(true);
        }
        this.zzk.zzs(s);
        this.zzk.zzE(zzl0);
        zzfca zzfca0 = this.zzk.zzG();
        int v = zzfhq.zzf(zzfca0);
        zzfhg zzfhg0 = zzfhf.zzb(this.zza, v, 3, zzl0);
        if(((Boolean)zzbdp.zze.zze()).booleanValue() && this.zzk.zzg().zzk) {
            zzekx zzekx0 = this.zzd;
            if(zzekx0 != null) {
                zzekx0.zzbF(zzfdb.zzd(7, null, null));
            }
            return false;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzhO)).booleanValue()) {
            zzcqy zzcqy0 = this.zzc.zze();
            zzcvq zzcvq0 = new zzcvq();
            zzcvq0.zze(this.zza);
            zzcvq0.zzi(zzfca0);
            zzcqy0.zzi(zzcvq0.zzj());
            zzdbt zzdbt0 = new zzdbt();
            zzdbt0.zzj(this.zzd, this.zzb);
            zzdbt0.zzk(this.zzd, this.zzb);
            zzcqy0.zzf(zzdbt0.zzn());
            zzcqy0.zze(new zzejg(this.zzg));
            zzcqy0.zzd(new zzdgh(zzdin.zza, null));
            zzcqy0.zzg(new zzcrw(this.zzh, this.zzj));
            zzcqy0.zzc(new zzcpz(this.zzf));
            zzcqz0 = zzcqy0.zzk();
        }
        else {
            zzcqy zzcqy1 = this.zzc.zze();
            zzcvq zzcvq1 = new zzcvq();
            zzcvq1.zze(this.zza);
            zzcvq1.zzi(zzfca0);
            zzcqy1.zzi(zzcvq1.zzj());
            zzdbt zzdbt1 = new zzdbt();
            zzdbt1.zzj(this.zzd, this.zzb);
            zzdbt1.zza(this.zzd, this.zzb);
            zzdbt1.zza(this.zze, this.zzb);
            zzdbt1.zzl(this.zzd, this.zzb);
            zzdbt1.zzd(this.zzd, this.zzb);
            zzdbt1.zze(this.zzd, this.zzb);
            zzdbt1.zzf(this.zzd, this.zzb);
            zzdbt1.zzb(this.zzd, this.zzb);
            zzdbt1.zzk(this.zzd, this.zzb);
            zzdbt1.zzi(this.zzd, this.zzb);
            zzcqy1.zzf(zzdbt1.zzn());
            zzcqy1.zze(new zzejg(this.zzg));
            zzcqy1.zzd(new zzdgh(zzdin.zza, null));
            zzcqy1.zzg(new zzcrw(this.zzh, this.zzj));
            zzcqy1.zzc(new zzcpz(this.zzf));
            zzcqz0 = zzcqy1.zzk();
        }
        if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
            zzfhr zzfhr0 = zzcqz0.zzj();
            zzfhr0.zzh(3);
            zzfhr0.zzb(zzl0.zzp);
            zzfhr1 = zzfhr0;
        }
        else {
            zzfhr1 = null;
        }
        zzctl zzctl0 = zzcqz0.zzd();
        d d0 = zzctl0.zzi(zzctl0.zzj());
        this.zzl = d0;
        zzfye.zzr(d0, new zzexp(this, zzelm0, zzfhr1, zzfhg0, zzcqz0), this.zzb);
        return true;
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    static zzdbe zzf(zzexq zzexq0) {
        return zzexq0.zzj;
    }

    public final zzfby zzi() {
        return this.zzk;
    }

    static void zzl(zzexq zzexq0, d d0) {
        zzexq0.zzl = null;
    }

    // 检测为 Lambda 实现
    final void zzm() [...]

    public final void zzn() {
        int v = this.zzj.zzc();
        this.zzh.zzd(v);
    }

    public final void zzo(zzbe zzbe0) {
        this.zze.zza(zzbe0);
    }

    public final void zzp(zzcyy zzcyy0) {
        this.zzh.zzo(zzcyy0, this.zzb);
    }

    public final void zzq(zzbcp zzbcp0) {
        this.zzg = zzbcp0;
    }

    public final boolean zzr() {
        ViewParent viewParent0 = this.zzf.getParent();
        return viewParent0 instanceof View ? zzs.zzT(((View)viewParent0), ((View)viewParent0).getContext()) : false;
    }
}

