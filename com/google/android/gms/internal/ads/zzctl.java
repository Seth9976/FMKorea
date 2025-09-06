package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class zzctl {
    private final zzdwn zza;
    private final zzfca zzb;
    private final zzfge zzc;
    private final zzcmq zzd;
    private final zzehh zze;
    private final zzdbn zzf;
    private zzfbr zzg;
    private final zzdxs zzh;
    private final zzcvm zzi;
    private final Executor zzj;
    private final zzdxe zzk;
    private final zzeds zzl;
    private final zzdyi zzm;
    private final zzdyp zzn;

    zzctl(zzdwn zzdwn0, zzfca zzfca0, zzfge zzfge0, zzcmq zzcmq0, zzehh zzehh0, zzdbn zzdbn0, zzfbr zzfbr0, zzdxs zzdxs0, zzcvm zzcvm0, Executor executor0, zzdxe zzdxe0, zzeds zzeds0, zzdyi zzdyi0, zzdyp zzdyp0) {
        this.zza = zzdwn0;
        this.zzb = zzfca0;
        this.zzc = zzfge0;
        this.zzd = zzcmq0;
        this.zze = zzehh0;
        this.zzf = zzdbn0;
        this.zzg = zzfbr0;
        this.zzh = zzdxs0;
        this.zzi = zzcvm0;
        this.zzj = executor0;
        this.zzk = zzdxe0;
        this.zzl = zzeds0;
        this.zzm = zzdyi0;
        this.zzn = zzdyp0;
    }

    public final zze zza(Throwable throwable0) {
        return zzfdb.zzb(throwable0, this.zzl);
    }

    static zzdbn zzb(zzctl zzctl0) {
        return zzctl0.zzf;
    }

    public final zzdbn zzc() {
        return this.zzf;
    }

    final zzfbr zzd(zzfbr zzfbr0) {
        this.zzd.zza(zzfbr0);
        return zzfbr0;
    }

    public final d zze(zzfdu zzfdu0) {
        d d0 = this.zzi.zzc();
        d d1 = this.zzc.zzb(zzffy.zzw, d0).zzf((zzbun zzbun0) -> {
            zzbun0.zzi = zzfdu0;
            return this.zzh.zza(zzbun0);
        }).zza();
        zzfye.zzr(d1, new zzctj(this), this.zzj);
        return d1;
    }

    // 检测为 Lambda 实现
    final d zzf(zzfdu zzfdu0, zzbun zzbun0) [...]

    // 检测为 Lambda 实现
    final d zzg(d d0, d d1, d d2) [...]

    public final d zzh(zzbun zzbun0) {
        d d0 = this.zzh.zzg(zzbun0);
        d d1 = this.zzc.zzb(zzffy.zzx, d0).zza();
        zzfye.zzr(d1, new zzctk(this), this.zzj);
        return d1;
    }

    public final d zzi(d d0) {
        zzffv zzffv0 = this.zzc.zzb(zzffy.zzd, d0).zze(new zzcth(this)).zzf(this.zze);
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzfq)).booleanValue()) {
            zzffv0 = zzffv0.zzi(((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzfr)))))), TimeUnit.SECONDS);
        }
        return zzffv0.zza();
    }

    public final d zzj() {
        zzl zzl0 = this.zzb.zzd;
        return zzl0.zzx == null && zzl0.zzs == null ? this.zzk(this.zzi.zzc()) : zzffo.zzc(this.zza.zza(), zzffy.zzz, this.zzc).zza();
    }

    public final d zzk(d d0) {
        zzfbr zzfbr0 = this.zzg;
        if(zzfbr0 != null) {
            return zzffo.zzc(zzfye.zzh(zzfbr0), zzffy.zzc, this.zzc).zza();
        }
        zzt.zzc().zzj();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzkn)).booleanValue() && !((Boolean)zzbdp.zzc.zze()).booleanValue()) {
            d d1 = zzfye.zzn(d0, new zzctc(this.zzm), this.zzj);
            zzffj zzffj0 = this.zzc.zzb(zzffy.zzg, d1).zzf(new zzctd(this.zzh)).zza();
            return this.zzc.zza(zzffy.zzc, new d[]{d0, d1, zzffj0}).zza(() -> {
                zzbun zzbun0 = (zzbun)d0.get();
                JSONObject jSONObject0 = (JSONObject)d1.get();
                zzbuq zzbuq0 = (zzbuq)zzffj0.get();
                return this.zzn.zzc(zzbun0, jSONObject0, zzbuq0);
            }).zzf((Object object0) -> ((d)object0)).zza();
        }
        return this.zzc.zzb(zzffy.zzc, d0).zzf(new zzctg(this.zzk)).zza();
    }

    public final void zzl(zzfbr zzfbr0) {
        this.zzg = zzfbr0;
    }
}

