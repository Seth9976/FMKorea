package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzcaa;

public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    public static void disableMediationAdapterInitialization(Context context0) {
        zzej.zzf().zzl(context0);
    }

    public static void enableSameAppKey(boolean z) {
        zzej.zzf().zzm(z);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzej.zzf().zze();
    }

    @KeepForSdk
    private static String getInternalVersion() {
        return zzej.zzf().zzh();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzej.zzf().zzc();
    }

    public static VersionInfo getVersion() {
        zzej.zzf();
        String[] arr_s = TextUtils.split("22.4.0", "\\.");
        if(arr_s.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(arr_s[0]), Integer.parseInt(arr_s[1]), Integer.parseInt(arr_s[2]));
        }
        catch(NumberFormatException unused_ex) {
            return new VersionInfo(0, 0, 0);
        }
    }

    public static void initialize(Context context0) {
        zzej.zzf().zzn(context0, null, null);
    }

    public static void initialize(Context context0, OnInitializationCompleteListener onInitializationCompleteListener0) {
        zzej.zzf().zzn(context0, null, onInitializationCompleteListener0);
    }

    public static void openAdInspector(Context context0, OnAdInspectorClosedListener onAdInspectorClosedListener0) {
        zzej.zzf().zzq(context0, onAdInspectorClosedListener0);
    }

    public static void openDebugMenu(Context context0, String s) {
        zzej.zzf().zzr(context0, s);
    }

    @KeepForSdk
    public static void registerRtbAdapter(Class class0) {
        zzej.zzf().zzs(class0);
    }

    public static void registerWebView(WebView webView0) {
        zzej.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if(webView0 == null) {
            zzcaa.zzg("The webview to be registered cannot be null.");
            return;
        }
        zzbyr zzbyr0 = zzbst.zza(webView0.getContext());
        if(zzbyr0 == null) {
            zzcaa.zzj("Internal error, query info generator is null.");
            return;
        }
        try {
            zzbyr0.zzi(ObjectWrapper.wrap(webView0));
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    public static void setAppMuted(boolean z) {
        zzej.zzf().zzt(z);
    }

    public static void setAppVolume(float f) {
        zzej.zzf().zzu(f);
    }

    @KeepForSdk
    private static void setPlugin(String s) {
        zzej.zzf().zzv(s);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration0) {
        zzej.zzf().zzw(requestConfiguration0);
    }
}

