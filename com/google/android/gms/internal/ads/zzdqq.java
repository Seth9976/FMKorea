package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;

public final class zzdqq implements zza, zzcwm, zzcxc, zzdba {
    private final Context zza;
    private final zzfcq zzb;
    private final zzdrh zzc;
    private final zzfbr zzd;
    private final zzfbe zze;
    private final zzech zzf;
    private Boolean zzg;
    private final boolean zzh;

    public zzdqq(Context context0, zzfcq zzfcq0, zzdrh zzdrh0, zzfbr zzfbr0, zzfbe zzfbe0, zzech zzech0) {
        this.zza = context0;
        this.zzb = zzfcq0;
        this.zzc = zzdrh0;
        this.zzd = zzfbr0;
        this.zze = zzfbe0;
        this.zzf = zzech0;
        this.zzh = ((Boolean)zzba.zzc().zzb(zzbbr.zzgJ)).booleanValue();
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if(!this.zze.zzaj) {
            return;
        }
        this.zze(this.zzd("click"));
    }

    @Override  // com.google.android.gms.internal.ads.zzcwm
    public final void zza(zze zze0) {
        if(!this.zzh) {
            return;
        }
        zzdrg zzdrg0 = this.zzd("ifts");
        zzdrg0.zzb("reason", "adapter");
        int v = zze0.zza;
        String s = zze0.zzb;
        if(zze0.zzc.equals("com.google.android.gms.ads") && (zze0.zzd != null && !zze0.zzd.zzc.equals("com.google.android.gms.ads"))) {
            v = zze0.zzd.zza;
            s = zze0.zzd.zzb;
        }
        if(v >= 0) {
            zzdrg0.zzb("arec", String.valueOf(v));
        }
        String s1 = this.zzb.zza(s);
        if(s1 != null) {
            zzdrg0.zzb("areec", s1);
        }
        zzdrg0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        if(!this.zzh) {
            return;
        }
        zzdrg zzdrg0 = this.zzd("ifts");
        zzdrg0.zzb("reason", "blocked");
        zzdrg0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzcwm
    public final void zzc(zzdfx zzdfx0) {
        if(!this.zzh) {
            return;
        }
        zzdrg zzdrg0 = this.zzd("ifts");
        zzdrg0.zzb("reason", "exception");
        if(!TextUtils.isEmpty(zzdfx0.getMessage())) {
            zzdrg0.zzb("msg", zzdfx0.getMessage());
        }
        zzdrg0.zzg();
    }

    private final zzdrg zzd(String s) {
        zzdrg zzdrg0 = this.zzc.zza();
        zzdrg0.zze(this.zzd.zzb.zzb);
        zzdrg0.zzd(this.zze);
        zzdrg0.zzb("action", s);
        boolean z = false;
        if(!this.zze.zzu.isEmpty()) {
            zzdrg0.zzb("ancn", ((String)this.zze.zzu.get(0)));
        }
        if(this.zze.zzaj) {
            zzdrg0.zzb("device_connectivity", (zzt.zzo().zzx(this.zza) ? "online" : "offline"));
            zzdrg0.zzb("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
            zzdrg0.zzb("offline_ad", "1");
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzgS)).booleanValue()) {
            if(zzf.zze(this.zzd.zza.zza) != 1) {
                z = true;
            }
            zzdrg0.zzb("scar", String.valueOf(z));
            if(z) {
                zzl zzl0 = this.zzd.zza.zza.zzd;
                zzdrg0.zzc("ragent", zzl0.zzp);
                zzdrg0.zzc("rtype", zzf.zza(zzf.zzb(zzl0)));
            }
        }
        return zzdrg0;
    }

    private final void zze(zzdrg zzdrg0) {
        if(this.zze.zzaj) {
            String s = zzdrg0.zzf();
            zzecj zzecj0 = new zzecj(zzt.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, s, 2);
            this.zzf.zzd(zzecj0);
            return;
        }
        zzdrg0.zzg();
    }

    private final boolean zzf() {
        if(this.zzg == null) {
            synchronized(this) {
                if(this.zzg == null) {
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
                    this.zzg = Boolean.valueOf(z);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    @Override  // com.google.android.gms.internal.ads.zzdba
    public final void zzi() {
        if(!this.zzf()) {
            return;
        }
        this.zzd("adapter_shown").zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzdba
    public final void zzj() {
        if(!this.zzf()) {
            return;
        }
        this.zzd("adapter_impression").zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if(!this.zzf() && !this.zze.zzaj) {
            return;
        }
        this.zze(this.zzd("impression"));
    }
}

