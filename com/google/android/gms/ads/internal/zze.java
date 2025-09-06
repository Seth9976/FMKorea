package com.google.android.gms.ads.internal;

import Z1.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfye;
import com.google.android.gms.internal.ads.zzfyo;
import org.json.JSONObject;

public final class zze {
    private Context zza;
    private long zzb;

    public zze() {
        this.zzb = 0L;
    }

    public final void zza(Context context0, zzcag zzcag0, String s, Runnable runnable0, zzfhu zzfhu0) {
        this.zzb(context0, zzcag0, true, null, s, null, runnable0, zzfhu0);
    }

    final void zzb(Context context0, zzcag zzcag0, boolean z, zzbzd zzbzd0, String s, String s1, Runnable runnable0, zzfhu zzfhu0) {
        if(zzt.zzB().elapsedRealtime() - this.zzb < 5000L) {
            zzcaa.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzB().elapsedRealtime();
        if(zzbzd0 != null && !TextUtils.isEmpty(zzbzd0.zzc()) && zzt.zzB().currentTimeMillis() - zzbzd0.zza() <= ((long)(((Long)zzba.zzc().zzb(zzbbr.zzdT)))) && zzbzd0.zzi()) {
            return;
        }
        if(context0 == null) {
            zzcaa.zzj("Context not provided to fetch application settings");
            return;
        }
        if(TextUtils.isEmpty(s) && TextUtils.isEmpty(s1)) {
            zzcaa.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context context1 = context0.getApplicationContext();
        if(context1 == null) {
            context1 = context0;
        }
        this.zza = context1;
        zzfhg zzfhg0 = zzfhf.zza(context0, 4);
        zzfhg0.zzh();
        zzbmy zzbmy0 = zzt.zzf().zza(this.zza, zzcag0, zzfhu0).zza("google.afma.config.fetchAppSettings", zzbnf.zza, zzbnf.zza);
        try {
            JSONObject jSONObject0 = new JSONObject();
            if(!TextUtils.isEmpty(s)) {
                jSONObject0.put("app_id", s);
            }
            else if(!TextUtils.isEmpty(s1)) {
                jSONObject0.put("ad_unit_id", s1);
            }
            jSONObject0.put("is_init", z);
            jSONObject0.put("pn", "com.fmkorea.m.fmk");
            jSONObject0.put("experiment_ids", TextUtils.join(",", zzba.zza().zza()));
            jSONObject0.put("js", zzcag0.zza);
            try {
                ApplicationInfo applicationInfo0 = this.zza.getApplicationInfo();
                if(applicationInfo0 != null) {
                    PackageInfo packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(applicationInfo0.packageName, 0);
                    if(packageInfo0 != null) {
                        jSONObject0.put("version", packageInfo0.versionCode);
                    }
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            d d0 = zzbmy0.zzb(jSONObject0);
            zzd zzd0 = new zzd(zzfhu0, zzfhg0);
            zzfyo zzfyo0 = zzcan.zzf;
            d d1 = zzfye.zzn(d0, zzd0, zzfyo0);
            if(runnable0 != null) {
                d0.addListener(runnable0, zzfyo0);
            }
            zzcaq.zza(d1, "ConfigLoader.maybeFetchNewAppSettings");
            return;
        }
        catch(Exception exception0) {
        }
        zzcaa.zzh("Error requesting application settings", exception0);
        zzfhg0.zzg(exception0);
        zzfhg0.zzf(false);
        zzfhu0.zzb(zzfhg0.zzl());
    }

    public final void zzc(Context context0, zzcag zzcag0, String s, zzbzd zzbzd0, zzfhu zzfhu0) {
        this.zzb(context0, zzcag0, false, zzbzd0, (zzbzd0 == null ? null : zzbzd0.zzb()), s, null, zzfhu0);
    }
}

