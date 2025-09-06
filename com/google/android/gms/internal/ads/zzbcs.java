package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.f;
import java.util.List;

public final class zzbcs {
    private f zza;
    private c zzb;
    private e zzc;
    private zzbcq zzd;

    public final f zza() {
        c c0 = this.zzb;
        if(c0 == null) {
            this.zza = null;
            return null;
        }
        if(this.zza == null) {
            this.zza = c0.c(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity0) {
        if(this.zzb != null) {
            return;
        }
        String s = zzgzh.zza(activity0);
        if(s == null) {
            return;
        }
        zzgzi zzgzi0 = new zzgzi(this);
        this.zzc = zzgzi0;
        c.a(activity0, s, zzgzi0);
    }

    public final void zzc(c c0) {
        this.zzb = c0;
        c0.e(0L);
        zzbcq zzbcq0 = this.zzd;
        if(zzbcq0 != null) {
            zzbcq0.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbcq zzbcq0) {
        this.zzd = zzbcq0;
    }

    public final void zzf(Activity activity0) {
        e e0 = this.zzc;
        if(e0 == null) {
            return;
        }
        activity0.unbindService(e0);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    public static boolean zzg(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        if(packageManager0 == null) {
            return false;
        }
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfo0 = packageManager0.resolveActivity(intent0, 0);
        List list0 = packageManager0.queryIntentActivities(intent0, 0x10000);
        if(list0 != null && resolveInfo0 != null) {
            for(int v = 0; v < list0.size(); ++v) {
                ResolveInfo resolveInfo1 = (ResolveInfo)list0.get(v);
                if(resolveInfo0.activityInfo.name.equals(resolveInfo1.activityInfo.name)) {
                    return resolveInfo0.activityInfo.packageName.equals(zzgzh.zza(context0));
                }
            }
        }
        return false;
    }
}

