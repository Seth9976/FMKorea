package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbeq implements DisplayOpenMeasurement {
    private final zzbfq zza;

    public zzbeq(zzbfq zzbfq0) {
        this.zza = zzbfq0;
        try {
            zzbfq0.zzm();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd$DisplayOpenMeasurement
    public final void setView(View view0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(view0);
            this.zza.zzp(iObjectWrapper0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd$DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzt();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return false;
        }
    }
}

