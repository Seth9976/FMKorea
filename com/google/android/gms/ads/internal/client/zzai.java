package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzbju;
import com.google.android.gms.internal.ads.zzbjv;
import com.google.android.gms.internal.ads.zzbjz;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;

final class zzai extends zzax {
    final Context zza;
    final zzbof zzb;
    final OnH5AdsEventListener zzc;

    zzai(zzaw zzaw0, Context context0, zzbof zzbof0, OnH5AdsEventListener onH5AdsEventListener0) {
        this.zza = context0;
        this.zzb = zzbof0;
        this.zzc = onH5AdsEventListener0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    protected final Object zza() {
        return new zzbjz();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb(zzce zzce0) {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
        zzbjm zzbjm0 = new zzbjm(this.zzc);
        return zzce0.zzk(iObjectWrapper0, this.zzb, 233012000, zzbjm0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc() {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
        try {
            zzbjv zzbjv0 = (zzbjv)zzcae.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", (zzah this) -> zzbju.zzb(((IBinder)object0)));
            zzbjm zzbjm0 = new zzbjm(this.zzc);
            return zzbjv0.zze(iObjectWrapper0, this.zzb, 233012000, zzbjm0);
        }
        catch(zzcad | RemoteException | NullPointerException unused_ex) {
            return null;
        }
    }
}

