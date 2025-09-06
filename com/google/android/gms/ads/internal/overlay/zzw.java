package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfpa;
import com.google.android.gms.internal.ads.zzfpb;
import com.google.android.gms.internal.ads.zzfpc;
import com.google.android.gms.internal.ads.zzfpd;
import com.google.android.gms.internal.ads.zzfpm;
import com.google.android.gms.internal.ads.zzfpo;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfpq;
import com.google.android.gms.internal.ads.zzfpr;
import com.google.android.gms.internal.ads.zzfql;
import java.util.HashMap;
import java.util.Map;

public final class zzw {
    private String zza;
    private String zzb;
    private zzcfi zzc;
    private zzfpc zzd;
    private boolean zze;
    private zzfpp zzf;

    public zzw() {
        this.zzc = null;
        this.zze = false;
        this.zza = null;
        this.zzd = null;
        this.zzb = null;
    }

    public final void zza(zzcfi zzcfi0, Context context0) {
        synchronized(this) {
            this.zzc = zzcfi0;
            if(!this.zzk(context0)) {
                this.zzf("Unable to bind", "on_play_store_bind");
                return;
            }
            HashMap hashMap0 = new HashMap();
            hashMap0.put("action", "fetch_completed");
            this.zze("on_play_store_bind", hashMap0);
        }
    }

    public final void zzb() {
        if(this.zze) {
            zzfpc zzfpc0 = this.zzd;
            if(zzfpc0 != null) {
                zzfpc0.zza(this.zzl(), this.zzf);
                this.zzd("onLMDOverlayCollapse");
                return;
            }
        }
        zze.zza("LastMileDelivery not connected");
    }

    public final void zzc() {
        if(this.zze) {
            zzfpc zzfpc0 = this.zzd;
            if(zzfpc0 != null) {
                zzfpa zzfpa0 = zzfpb.zzc();
                if(!((Boolean)zzba.zzc().zzb(zzbbr.zzkj)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
                    String s = this.zza;
                    if(s == null) {
                        this.zzf("Missing session token and/or appId", "onLMDupdate");
                    }
                    else {
                        zzfpa0.zzb(s);
                    }
                }
                else {
                    zzfpa0.zza(this.zzb);
                }
                zzfpc0.zzb(zzfpa0.zzc(), this.zzf);
                return;
            }
        }
        zze.zza("LastMileDelivery not connected");
    }

    final void zzd(String s) {
        this.zze(s, new HashMap());
    }

    final void zze(String s, Map map0) {
        zzu zzu0 = () -> {
            zzcfi zzcfi0 = this.zzc;
            if(zzcfi0 != null) {
                zzcfi0.zzd(s, map0);
            }
        };
        zzcan.zze.execute(zzu0);
    }

    final void zzf(String s, String s1) {
        zze.zza(s);
        if(this.zzc != null) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("message", s);
            hashMap0.put("action", s1);
            this.zze("onError", hashMap0);
        }
    }

    public final void zzg() {
        if(this.zze) {
            zzfpc zzfpc0 = this.zzd;
            if(zzfpc0 != null) {
                zzfpc0.zzc(this.zzl(), this.zzf);
                this.zzd("onLMDOverlayExpand");
                return;
            }
        }
        zze.zza("LastMileDelivery not connected");
    }

    // 检测为 Lambda 实现
    final void zzh(String s, Map map0) [...]

    final void zzi(zzfpo zzfpo0) {
        if(!TextUtils.isEmpty(zzfpo0.zzb()) && !((Boolean)zzba.zzc().zzb(zzbbr.zzkj)).booleanValue()) {
            this.zza = zzfpo0.zzb();
        }
        switch(zzfpo0.zza()) {
            case 0x1FD8: {
                this.zzd("onLMDOverlayOpened");
                return;
            }
            case 0x1FD9: {
                this.zzd("onLMDOverlayClicked");
                return;
            }
            case 0x1FDB: {
                this.zzd("onLMDOverlayClose");
                return;
            }
            case 0x1FDD: {
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                return;
            }
            case 0x1FE0: 
            case 0x1FE1: 
            case 0x1FE2: {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("error", String.valueOf(zzfpo0.zza()));
                this.zze("onLMDOverlayFailedToOpen", hashMap0);
            }
        }
    }

    public final void zzj(zzcfi zzcfi0, zzfpm zzfpm0) {
        if(zzcfi0 == null) {
            this.zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcfi0;
        if(!this.zze && !this.zzk(zzcfi0.getContext())) {
            this.zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzkj)).booleanValue()) {
            this.zzb = zzfpm0.zzg();
        }
        this.zzm();
        zzfpc zzfpc0 = this.zzd;
        if(zzfpc0 != null) {
            zzfpc0.zzd(zzfpm0, this.zzf);
        }
    }

    public final boolean zzk(Context context0) {
        synchronized(this) {
            if(!zzfql.zza(context0)) {
                return false;
            }
            try {
                this.zzd = zzfpd.zza(context0);
            }
            catch(NullPointerException nullPointerException0) {
                zze.zza("Error connecting LMD Overlay service");
                zzt.zzo().zzu(nullPointerException0, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
            }
            if(this.zzd == null) {
                this.zze = false;
                return false;
            }
            this.zzm();
            this.zze = true;
            return true;
        }
    }

    private final zzfpr zzl() {
        zzfpq zzfpq0 = zzfpr.zzc();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzkj)).booleanValue() && !TextUtils.isEmpty(this.zzb)) {
            zzfpq0.zza(this.zzb);
            return zzfpq0.zzc();
        }
        String s = this.zza;
        if(s != null) {
            zzfpq0.zzb(s);
            return zzfpq0.zzc();
        }
        this.zzf("Missing session token and/or appId", "onLMDupdate");
        return zzfpq0.zzc();
    }

    private final void zzm() {
        if(this.zzf == null) {
            this.zzf = new zzv(this);
        }
    }
}

