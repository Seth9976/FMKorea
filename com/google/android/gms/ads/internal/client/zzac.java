package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;

final class zzac extends zzax {
    final Context zza;
    final zzbof zzb;

    zzac(zzaw zzaw0, Context context0, zzbof zzbof0) {
        this.zza = context0;
        this.zzb = zzbof0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    protected final Object zza() {
        zzaw.zzt(this.zza, "out_of_context_tester");
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb(zzce zzce0) {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
        zzbbr.zza(this.zza);
        return ((Boolean)zzba.zzc().zzb(zzbbr.zziY)).booleanValue() ? zzce0.zzh(iObjectWrapper0, this.zzb, 233012000) : null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc() {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
        zzbbr.zza(this.zza);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziY)).booleanValue()) {
            try {
                return ((zzdk)zzcae.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", zzab.zza)).zze(iObjectWrapper0, this.zzb, 233012000);
            }
            catch(zzcad | RemoteException | NullPointerException zzcad0) {
                zzbtf.zza(this.zza).zzf(zzcad0, "ClientApiBroker.getOutOfContextTester");
            }
        }
        return null;
    }
}

