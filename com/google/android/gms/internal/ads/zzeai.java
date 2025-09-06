package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.regex.Pattern;

public final class zzeai implements zza, zzcwm, zzcxc, zzdba {
    private final Context zza;
    private final zzfcq zzb;
    private final zzfbr zzc;
    private final zzfbe zzd;
    private final zzech zze;
    private Boolean zzf;
    private final boolean zzg;
    private final zzfgo zzh;
    private final String zzi;

    public zzeai(Context context0, zzfcq zzfcq0, zzfbr zzfbr0, zzfbe zzfbe0, zzech zzech0, zzfgo zzfgo0, String s) {
        this.zza = context0;
        this.zzb = zzfcq0;
        this.zzc = zzfbr0;
        this.zzd = zzfbe0;
        this.zze = zzech0;
        this.zzg = ((Boolean)zzba.zzc().zzb(zzbbr.zzgJ)).booleanValue();
        this.zzh = zzfgo0;
        this.zzi = s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if(!this.zzd.zzaj) {
            return;
        }
        this.zze(this.zzd("click"));
    }

    @Override  // com.google.android.gms.internal.ads.zzcwm
    public final void zza(zze zze0) {
        if(!this.zzg) {
            return;
        }
        int v = zze0.zza;
        String s = zze0.zzb;
        if(zze0.zzc.equals("com.google.android.gms.ads") && (zze0.zzd != null && !zze0.zzd.zzc.equals("com.google.android.gms.ads"))) {
            v = zze0.zzd.zza;
            s = zze0.zzd.zzb;
        }
        String s1 = this.zzb.zza(s);
        zzfgn zzfgn0 = this.zzd("ifts");
        zzfgn0.zza("reason", "adapter");
        if(v >= 0) {
            zzfgn0.zza("arec", String.valueOf(v));
        }
        if(s1 != null) {
            zzfgn0.zza("areec", s1);
        }
        this.zzh.zzb(zzfgn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        if(!this.zzg) {
            return;
        }
        zzfgn zzfgn0 = this.zzd("ifts");
        zzfgn0.zza("reason", "blocked");
        this.zzh.zzb(zzfgn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwm
    public final void zzc(zzdfx zzdfx0) {
        if(!this.zzg) {
            return;
        }
        zzfgn zzfgn0 = this.zzd("ifts");
        zzfgn0.zza("reason", "exception");
        if(!TextUtils.isEmpty(zzdfx0.getMessage())) {
            zzfgn0.zza("msg", zzdfx0.getMessage());
        }
        this.zzh.zzb(zzfgn0);
    }

    private final zzfgn zzd(String s) {
        zzfgn zzfgn0 = zzfgn.zzb(s);
        zzfgn0.zzh(this.zzc, null);
        zzfgn0.zzf(this.zzd);
        zzfgn0.zza("request_id", this.zzi);
        if(!this.zzd.zzu.isEmpty()) {
            zzfgn0.zza("ancn", ((String)this.zzd.zzu.get(0)));
        }
        if(this.zzd.zzaj) {
            zzfgn0.zza("device_connectivity", (zzt.zzo().zzx(this.zza) ? "online" : "offline"));
            zzfgn0.zza("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
            zzfgn0.zza("offline_ad", "1");
        }
        return zzfgn0;
    }

    private final void zze(zzfgn zzfgn0) {
        if(this.zzd.zzaj) {
            String s = this.zzh.zza(zzfgn0);
            zzecj zzecj0 = new zzecj(zzt.zzB().currentTimeMillis(), this.zzc.zzb.zzb.zzb, s, 2);
            this.zze.zzd(zzecj0);
            return;
        }
        this.zzh.zzb(zzfgn0);
    }

    private final boolean zzf() {
        if(this.zzf == null) {
            synchronized(this) {
                if(this.zzf == null) {
                    boolean z = false;
                    String s = (String)zzba.zzc().zzb(zzbbr.zzbq);
                    String s1 = zzs.zzn(this.zza);
                    if(s != null && s1 != null) {
                        try {
                            z = Pattern.matches(s, s1);
                        }
                        catch(RuntimeException runtimeException0) {
                            zzt.zzo().zzu(runtimeException0, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzf = Boolean.valueOf(z);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    @Override  // com.google.android.gms.internal.ads.zzdba
    public final void zzi() {
        if(!this.zzf()) {
            return;
        }
        zzfgn zzfgn0 = this.zzd("adapter_shown");
        this.zzh.zzb(zzfgn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdba
    public final void zzj() {
        if(!this.zzf()) {
            return;
        }
        zzfgn zzfgn0 = this.zzd("adapter_impression");
        this.zzh.zzb(zzfgn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if(!this.zzf() && !this.zzd.zzaj) {
            return;
        }
        this.zze(this.zzd("impression"));
    }
}

