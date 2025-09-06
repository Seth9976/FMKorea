package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbry;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;

final class zzag extends zzax {
    final Context zza;
    final zzbof zzb;

    zzag(zzaw zzaw0, Context context0, zzbof zzbof0) {
        this.zza = context0;
        this.zzb = zzbof0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    protected final Object zza() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb(zzce zzce0) {
        return zzce0.zzl(ObjectWrapper.wrap(this.zza), this.zzb, 233012000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc() {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
        try {
            return ((zzbry)zzcae.zzb(this.zza, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", (zzaf this) -> zzbrx.zzb(((IBinder)object0)))).zze(iObjectWrapper0, this.zzb, 233012000);
        }
        catch(zzcad | RemoteException | NullPointerException unused_ex) {
            return null;
        }
    }
}

