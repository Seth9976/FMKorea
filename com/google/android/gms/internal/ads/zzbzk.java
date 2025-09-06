package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

public final class zzbzk {
    long zza;
    long zzb;
    int zzc;
    int zzd;
    long zze;
    final String zzf;
    int zzg;
    int zzh;
    int zzi;
    private final Object zzj;
    private final zzg zzk;

    public zzbzk(String s, zzg zzg0) {
        this.zza = -1L;
        this.zzb = -1L;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = 0L;
        this.zzj = new Object();
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zzf = s;
        this.zzk = zzg0;
    }

    public final int zza() {
        synchronized(this.zzj) {
        }
        return this.zzi;
    }

    public final Bundle zzb(Context context0, String s) {
        synchronized(this.zzj) {
            Bundle bundle0 = new Bundle();
            if(!this.zzk.zzQ()) {
                bundle0.putString("session_id", this.zzf);
            }
            bundle0.putLong("basets", this.zzb);
            bundle0.putLong("currts", this.zza);
            bundle0.putString("seq_num", s);
            bundle0.putInt("preqs", this.zzc);
            bundle0.putInt("preqs_in_session", this.zzd);
            bundle0.putLong("time_in_session", this.zze);
            bundle0.putInt("pclick", this.zzg);
            bundle0.putInt("pimp", this.zzh);
            Context context1 = zzbvb.zza(context0);
            int v1 = context1.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z = false;
            if(v1 == 0) {
                zzcaa.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            }
            else {
                ComponentName componentName0 = new ComponentName("com.fmkorea.m.fmk", "com.google.android.gms.ads.AdActivity");
                try {
                    if(v1 == context1.getPackageManager().getActivityInfo(componentName0, 0).theme) {
                        z = true;
                    }
                    else {
                        zzcaa.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    zzcaa.zzj("Fail to fetch AdActivity theme");
                    zzcaa.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle0.putBoolean("support_transparent_background", z);
            bundle0.putInt("consent_form_action_identifier", this.zza());
            return bundle0;
        }
    }

    public final void zzc() {
        synchronized(this.zzj) {
            ++this.zzg;
        }
    }

    public final void zzd() {
        synchronized(this.zzj) {
            ++this.zzh;
        }
    }

    public final void zze() {
        this.zzi();
    }

    public final void zzf() {
        this.zzi();
    }

    public final void zzg(zzl zzl0, long v) {
        synchronized(this.zzj) {
            long v2 = this.zzk.zzd();
            long v3 = zzt.zzB().currentTimeMillis();
            if(this.zzb == -1L) {
                this.zzd = v3 - v2 > ((long)(((Long)zzba.zzc().zzb(zzbbr.zzaR)))) ? -1 : this.zzk.zzc();
                this.zzb = v;
            }
            this.zza = v;
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zzdp)).booleanValue() && (zzl0.zzc != null && zzl0.zzc.getInt("gw", 2) == 1)) {
                return;
            }
            ++this.zzc;
            int v4 = this.zzd + 1;
            this.zzd = v4;
            if(v4 == 0) {
                this.zze = 0L;
                this.zzk.zzD(v3);
            }
            else {
                this.zze = v3 - this.zzk.zze();
            }
        }
    }

    public final void zzh() {
        synchronized(this.zzj) {
            ++this.zzi;
        }
    }

    private final void zzi() {
        if(((Boolean)zzbdq.zza.zze()).booleanValue()) {
            synchronized(this.zzj) {
                --this.zzc;
                --this.zzd;
            }
        }
    }
}

