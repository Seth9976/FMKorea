package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfp;
import com.google.android.gms.internal.ads.zzcgk;
import com.google.android.gms.internal.ads.zzecs;
import java.io.InputStream;
import java.util.Map;

public class zzaa {
    private zzaa() {
    }

    zzaa(zzz zzz0) {
    }

    public int zza() {
        return 1;
    }

    public CookieManager zzb(Context context0) {
        if(zzs.zzC()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context0);
            return CookieManager.getInstance();
        }
        catch(Throwable throwable0) {
            zzcaa.zzh("Failed to obtain CookieManager.", throwable0);
            zzt.zzo().zzu(throwable0, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse zzc(String s, String s1, int v, String s2, Map map0, InputStream inputStream0) {
        return new WebResourceResponse(s, s1, inputStream0);
    }

    public zzcfp zzd(zzcfi zzcfi0, zzaxe zzaxe0, boolean z, zzecs zzecs0) {
        return new zzcgk(zzcfi0, zzaxe0, z, zzecs0);
    }

    public boolean zze(Activity activity0, Configuration configuration0) {
        return false;
    }

    public Intent zzg(Activity activity0) {
        Intent intent0 = new Intent();
        intent0.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent0.putExtra("app_package", "com.fmkorea.m.fmk");
        intent0.putExtra("app_uid", activity0.getApplicationInfo().uid);
        return intent0;
    }

    public void zzh(Context context0, String s, String s1) {
    }

    public boolean zzi(Context context0, String s) {
        return false;
    }

    public int zzj(Context context0, TelephonyManager telephonyManager0) {
        return 1001;
    }

    public int zzk(AudioManager audioManager0) {
        return 0;
    }

    public void zzl(Activity activity0) {
    }

    public int zzn(Context context0) {
        return ((TelephonyManager)context0.getSystemService("phone")).getNetworkType();
    }

    public static zzaa zzo(int v) {
        if(v >= 30) {
            return new zzy();
        }
        if(v >= 28) {
            return new zzx();
        }
        if(v >= 26) {
            return new zzv();
        }
        if(v >= 24) {
            return new zzu();
        }
        return v >= 21 ? new com.google.android.gms.ads.internal.util.zzt() : new zzaa();
    }
}

