package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdnb {
    private final zzdmo zza;
    private final zza zzb;
    private final zzcfu zzc;
    private final Context zzd;
    private final zzdrh zze;
    private final zzfgo zzf;
    private final Executor zzg;
    private final zzaqx zzh;
    private final zzcag zzi;
    private final zzbjg zzj;
    private final zzech zzk;
    private final zzfik zzl;
    private final zzecs zzm;
    private d zzn;

    zzdnb(zzdmy zzdmy0) {
        this.zzd = zzdmy0.zzc;
        this.zzg = zzdmy0.zzg;
        this.zzh = zzdmy0.zzh;
        this.zzi = zzdmy0.zzi;
        this.zzb = zzdmy0.zza;
        this.zza = new zzdmo();
        this.zzc = zzdmy0.zzb;
        this.zzj = new zzbjg();
        this.zzk = zzdmy0.zzf;
        this.zzl = zzdmy0.zzj;
        this.zze = zzdmy0.zzd;
        this.zzf = zzdmy0.zze;
        this.zzm = zzdmy0.zzk;
    }

    final zzcfi zza(zzcfi zzcfi0) {
        zzcfi0.zzad("/result", this.zzj);
        zzcgv zzcgv0 = zzcfi0.zzN();
        zzb zzb0 = new zzb(this.zzd, null, null);
        zzcgv0.zzM(null, this.zza, this.zza, this.zza, this.zza, false, null, zzb0, null, null, this.zzk, this.zzl, this.zze, this.zzf, null, null, null, null, null);
        return zzcfi0;
    }

    static zzdmo zzb(zzdnb zzdnb0) {
        return zzdnb0.zza;
    }

    // 检测为 Lambda 实现
    final d zzc(String s, JSONObject jSONObject0, zzcfi zzcfi0) [...]

    public final d zzd(String s, JSONObject jSONObject0) {
        synchronized(this) {
            d d0 = this.zzn;
            return d0 == null ? zzfye.zzh(null) : zzfye.zzn(d0, (zzcfi zzcfi0) -> this.zzj.zzb(zzcfi0, s, jSONObject0), this.zzg);
        }
    }

    public final void zze(zzfbe zzfbe0, zzfbi zzfbi0) {
        synchronized(this) {
            d d0 = this.zzn;
            if(d0 == null) {
                return;
            }
            zzfye.zzr(d0, new zzdmv(this, zzfbe0, zzfbi0), this.zzg);
        }
    }

    public final void zzf() {
        synchronized(this) {
            d d0 = this.zzn;
            if(d0 == null) {
                return;
            }
            zzfye.zzr(d0, new zzdmr(this), this.zzg);
            this.zzn = null;
        }
    }

    public final void zzg(String s, Map map0) {
        synchronized(this) {
            d d0 = this.zzn;
            if(d0 == null) {
                return;
            }
            zzfye.zzr(d0, new zzdmu(this, "sendMessageToNativeJs", map0), this.zzg);
        }
    }

    public final void zzh() {
        synchronized(this) {
            Object object0 = zzba.zzc().zzb(zzbbr.zzdz);
            d d0 = zzfye.zzm(zzfye.zzk(new zzcfr(this.zzd, this.zzh, this.zzi, this.zzb, this.zzm, ((String)object0)), zzcan.zze), new zzdmq(this), this.zzg);
            this.zzn = d0;
            zzcaq.zza(d0, "NativeJavascriptExecutor.initializeEngine");
        }
    }

    public final void zzi(String s, zzbir zzbir0) {
        synchronized(this) {
            d d0 = this.zzn;
            if(d0 == null) {
                return;
            }
            zzfye.zzr(d0, new zzdms(this, s, zzbir0), this.zzg);
        }
    }

    public final void zzj(WeakReference weakReference0, String s, zzbir zzbir0) {
        this.zzi(s, new zzdna(this, weakReference0, s, zzbir0, null));
    }

    public final void zzk(String s, zzbir zzbir0) {
        synchronized(this) {
            d d0 = this.zzn;
            if(d0 == null) {
                return;
            }
            zzfye.zzr(d0, new zzdmt(this, s, zzbir0), this.zzg);
        }
    }
}

