package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbhd extends zzbgg {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbhd(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener0) {
        this.zza = onAdManagerAdViewLoadedListener0;
    }

    static OnAdManagerAdViewLoadedListener zzc(zzbhd zzbhd0) {
        return zzbhd0.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgh
    public final void zze(zzbu zzbu0, IObjectWrapper iObjectWrapper0) {
        if(zzbu0 != null && iObjectWrapper0 != null) {
            AdManagerAdView adManagerAdView0 = new AdManagerAdView(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
            AppEventListener appEventListener0 = null;
            try {
                if(zzbu0.zzi() instanceof zzg) {
                    zzg zzg0 = (zzg)zzbu0.zzi();
                    adManagerAdView0.setAdListener((zzg0 == null ? null : zzg0.zzb()));
                }
                goto label_9;
            }
            catch(RemoteException remoteException0) {
            }
            zzcaa.zzh("", remoteException0);
            try {
            label_9:
                if(zzbu0.zzj() instanceof zzaut) {
                    zzaut zzaut0 = (zzaut)zzbu0.zzj();
                    if(zzaut0 != null) {
                        appEventListener0 = zzaut0.zzb();
                    }
                    adManagerAdView0.setAppEventListener(appEventListener0);
                }
            }
            catch(RemoteException remoteException1) {
                zzcaa.zzh("", remoteException1);
            }
            zzbhc zzbhc0 = new zzbhc(this, adManagerAdView0, zzbu0);
            zzbzt.zza.post(zzbhc0);
        }
    }
}

