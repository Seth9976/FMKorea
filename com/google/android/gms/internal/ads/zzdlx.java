package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdlx {
    private final zzfca zza;
    private final Executor zzb;
    private final zzdom zzc;
    private final zzdnh zzd;
    private final Context zze;
    private final zzdrh zzf;
    private final zzfgo zzg;
    private final zzfik zzh;
    private final zzech zzi;

    public zzdlx(zzfca zzfca0, Executor executor0, zzdom zzdom0, Context context0, zzdrh zzdrh0, zzfgo zzfgo0, zzfik zzfik0, zzech zzech0, zzdnh zzdnh0) {
        this.zza = zzfca0;
        this.zzb = executor0;
        this.zzc = zzdom0;
        this.zze = context0;
        this.zzf = zzdrh0;
        this.zzg = zzfgo0;
        this.zzh = zzfik0;
        this.zzi = zzech0;
        this.zzd = zzdnh0;
    }

    public final d zza(JSONObject jSONObject0) {
        return zzfye.zzn(zzfye.zzn(zzfye.zzh(null), (Object object0) -> {
            zzq zzq0 = zzq.zzc();
            zzcfi zzcfi0 = this.zzc.zza(zzq0, null, null);
            d d0 = zzcar.zza(zzcfi0);
            this.zzh(zzcfi0);
            zzcfi0.zzN().zzG(new zzdlp(((zzcar)d0)));
            zzcfi0.loadUrl(((String)zzba.zzc().zzb(zzbbr.zzdA)));
            return d0;
        }, this.zzb), (zzcfi zzcfi0) -> {
            d d0 = zzcar.zza(zzcfi0);
            if(this.zza.zzb == null) {
                zzcfi0.zzag(zzcgx.zze());
            }
            else {
                zzcfi0.zzag(zzcgx.zzd());
            }
            zzcfi0.zzN().zzA((boolean z, int v, String s, String s1) -> {
                if(this.zza.zza != null && zzcfi0.zzq() != null) {
                    zzcfi0.zzq().zzs(this.zza.zza);
                }
                ((zzcar)d0).zzb();
            });
            zzcfi0.zzl("google.afma.nativeAds.renderVideo", jSONObject0);
            return d0;
        }, this.zzb);
    }

    public final d zzb(String s, String s1, zzfbe zzfbe0, zzfbi zzfbi0, zzq zzq0) {
        return zzfye.zzn(zzfye.zzh(null), (Object object0) -> {
            zzcfi zzcfi0 = this.zzc.zza(zzq0, zzfbe0, zzfbi0);
            d d0 = zzcar.zza(zzcfi0);
            if(this.zza.zzb == null) {
                zzdne zzdne0 = this.zzd.zzb();
                zzcfi0.zzN().zzM(zzdne0, zzdne0, zzdne0, zzdne0, zzdne0, false, null, new zzb(this.zze, null, null), null, null, this.zzi, this.zzh, this.zzf, this.zzg, null, zzdne0, null, null, null);
                zzdlx.zzi(zzcfi0);
            }
            else {
                this.zzh(zzcfi0);
                zzcfi0.zzag(zzcgx.zzd());
            }
            zzcfi0.zzN().zzA((boolean z, int v, String s, String s1) -> {
                if(z) {
                    if(this.zza.zza != null && zzcfi0.zzq() != null) {
                        zzcfi0.zzq().zzs(this.zza.zza);
                    }
                    ((zzcar)d0).zzb();
                    return;
                }
                ((zzcar)d0).zzd(new zzehf(1, "Html video Web View failed to load. Error code: " + v + ", Description: " + s + ", Failing URL: " + s1));
            });
            zzcfi0.zzab(s, s1, null);
            return d0;
        }, this.zzb);
    }

    // 检测为 Lambda 实现
    final d zzc(JSONObject jSONObject0, zzcfi zzcfi0) [...]

    // 检测为 Lambda 实现
    final d zzd(zzq zzq0, zzfbe zzfbe0, zzfbi zzfbi0, String s, String s1, Object object0) [...]

    // 检测为 Lambda 实现
    final d zze(Object object0) [...]

    // 检测为 Lambda 实现
    final void zzf(zzcfi zzcfi0, zzcar zzcar0, boolean z, int v, String s, String s1) [...]

    // 检测为 Lambda 实现
    final void zzg(zzcfi zzcfi0, zzcar zzcar0, boolean z, int v, String s, String s1) [...]

    private final void zzh(zzcfi zzcfi0) {
        zzdlx.zzi(zzcfi0);
        zzcfi0.zzad("/video", zzbiq.zzl);
        zzcfi0.zzad("/videoMeta", zzbiq.zzm);
        zzcfi0.zzad("/precache", new zzcdv());
        zzcfi0.zzad("/delayPageLoaded", zzbiq.zzp);
        zzcfi0.zzad("/instrument", zzbiq.zzn);
        zzcfi0.zzad("/log", zzbiq.zzg);
        zzcfi0.zzad("/click", new zzbhr(null, null));
        if(this.zza.zzb == null) {
            zzcfi0.zzN().zzD(false);
        }
        else {
            zzcfi0.zzN().zzD(true);
            zzcfi0.zzad("/open", new zzbjc(null, null, null, null, null, null));
        }
        if(zzt.zzn().zzu(zzcfi0.getContext())) {
            zzcfi0.zzad("/logScionEvent", new zzbiw(zzcfi0.getContext()));
        }
    }

    private static final void zzi(zzcfi zzcfi0) {
        zzcfi0.zzad("/videoClicked", zzbiq.zzh);
        zzcfi0.zzN().zzF(true);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzdB)).booleanValue()) {
            zzcfi0.zzad("/getNativeAdViewSignals", zzbiq.zzs);
        }
        zzcfi0.zzad("/getNativeClickMeta", zzbiq.zzt);
    }
}

