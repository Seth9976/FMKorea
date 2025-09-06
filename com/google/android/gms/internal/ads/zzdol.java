package com.google.android.gms.internal.ads;

import Z1.d;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzdol {
    private final zzcwg zza;
    private final zzddu zzb;
    private final zzcxp zzc;
    private final zzcyc zzd;
    private final zzcyo zze;
    private final zzdbc zzf;
    private final Executor zzg;
    private final zzddq zzh;
    private final zzcoy zzi;
    private final zzb zzj;
    private final zzbxb zzk;
    private final zzaqx zzl;
    private final zzdat zzm;
    private final zzech zzn;
    private final zzfik zzo;
    private final zzdrh zzp;
    private final zzfgo zzq;
    private final zzcob zzr;
    private final zzdor zzs;

    public zzdol(zzcwg zzcwg0, zzcxp zzcxp0, zzcyc zzcyc0, zzcyo zzcyo0, zzdbc zzdbc0, Executor executor0, zzddq zzddq0, zzcoy zzcoy0, zzb zzb0, zzbxb zzbxb0, zzaqx zzaqx0, zzdat zzdat0, zzech zzech0, zzfik zzfik0, zzdrh zzdrh0, zzfgo zzfgo0, zzddu zzddu0, zzcob zzcob0, zzdor zzdor0) {
        this.zza = zzcwg0;
        this.zzc = zzcxp0;
        this.zzd = zzcyc0;
        this.zze = zzcyo0;
        this.zzf = zzdbc0;
        this.zzg = executor0;
        this.zzh = zzddq0;
        this.zzi = zzcoy0;
        this.zzj = zzb0;
        this.zzk = zzbxb0;
        this.zzl = zzaqx0;
        this.zzm = zzdat0;
        this.zzn = zzech0;
        this.zzo = zzfik0;
        this.zzp = zzdrh0;
        this.zzq = zzfgo0;
        this.zzb = zzddu0;
        this.zzr = zzcob0;
        this.zzs = zzdor0;
    }

    static zzcxp zza(zzdol zzdol0) {
        return zzdol0.zzc;
    }

    static zzdat zzb(zzdol zzdol0) {
        return zzdol0.zzm;
    }

    // 检测为 Lambda 实现
    final void zzc() [...]

    // 检测为 Lambda 实现
    final void zzd(String s, String s1) [...]

    // 检测为 Lambda 实现
    final void zze() [...]

    // 检测为 Lambda 实现
    final void zzf(View view0) [...]

    // 检测为 Lambda 实现
    final void zzg(zzcfi zzcfi0, zzcfi zzcfi1, Map map0) [...]

    final boolean zzh(View view0, MotionEvent motionEvent0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjo)).booleanValue() && motionEvent0 != null && motionEvent0.getAction() == 0) {
            this.zzs.zzb(motionEvent0);
        }
        this.zzj.zza();
        if(view0 != null) {
            view0.performClick();
        }
        return false;
    }

    public final void zzi(zzcfi zzcfi0, boolean z, zzbit zzbit0) {
        zzcgv zzcgv0 = zzcfi0.zzN();
        zzdoc zzdoc0 = () -> this.zza.onAdClicked();
        zzdod zzdod0 = (String s, String s1) -> this.zzf.zzb(s, s1);
        zzdoe zzdoe0 = () -> this.zzc.zzb();
        zzdok zzdok0 = new zzdok(this);
        zzcgv0.zzM(zzdoc0, this.zzd, this.zze, zzdod0, zzdoe0, z, zzbit0, this.zzj, zzdok0, this.zzk, this.zzn, this.zzo, this.zzp, this.zzq, null, this.zzb, null, null, this.zzr);
        zzcfi0.setOnTouchListener(new zzdof(this));
        zzcfi0.setOnClickListener((View view0) -> this.zzj.zza());
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzcr)).booleanValue()) {
            this.zzl.zzc().zzo(((View)zzcfi0));
        }
        this.zzh.zzo(zzcfi0, this.zzg);
        zzdoh zzdoh0 = new zzdoh(zzcfi0);
        this.zzh.zzo(zzdoh0, this.zzg);
        this.zzh.zza(((View)zzcfi0));
        zzcfi0.zzad("/trackActiveViewUnit", (zzcfi zzcfi1, Map map0) -> this.zzi.zzh(zzcfi0));
        this.zzi.zzi(zzcfi0);
    }

    public static final d zzj(zzcfi zzcfi0, String s, String s1) {
        d d0 = new zzcas();
        zzcfi0.zzN().zzA(new zzdoj(((zzcas)d0)));
        zzcfi0.zzab(s, s1, null);
        return d0;
    }
}

