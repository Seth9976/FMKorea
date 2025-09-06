package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd.Image;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbrj extends Image {
    private final zzbew zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;

    public zzbrj(zzbew zzbew0) {
        double f;
        Drawable drawable0;
        this.zza = zzbew0;
        Uri uri0 = null;
        try {
            IObjectWrapper iObjectWrapper0 = zzbew0.zzf();
            if(iObjectWrapper0 == null) {
                goto label_11;
            }
            else {
                drawable0 = (Drawable)ObjectWrapper.unwrap(iObjectWrapper0);
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            drawable0 = null;
        }
        goto label_12;
    label_11:
        drawable0 = null;
        try {
        label_12:
            this.zzb = drawable0;
            uri0 = this.zza.zze();
        }
        catch(RemoteException remoteException1) {
            zzcaa.zzh("", remoteException1);
        }
        try {
            this.zzc = uri0;
            f = this.zza.zzb();
        }
        catch(RemoteException remoteException2) {
            zzcaa.zzh("", remoteException2);
            f = 1.0;
        }
        try {
            this.zzd = f;
            this.zza.zzd();
        }
        catch(RemoteException remoteException3) {
            zzcaa.zzh("", remoteException3);
        }
        try {
            this.zza.zzc();
        }
        catch(RemoteException remoteException4) {
            zzcaa.zzh("", remoteException4);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$Image
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$Image
    public final double getScale() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$Image
    public final Uri getUri() {
        return this.zzc;
    }
}

