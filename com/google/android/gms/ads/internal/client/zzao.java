package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;

final class zzao extends zzax {
    final Context zza;
    final String zzb;
    final zzbof zzc;
    final zzaw zzd;

    zzao(zzaw zzaw0, Context context0, String s, zzbof zzbof0) {
        this.zzd = zzaw0;
        this.zza = context0;
        this.zzb = s;
        this.zzc = zzbof0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    protected final Object zza() {
        zzaw.zzt(this.zza, "native_ad");
        return new zzeu();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb(zzce zzce0) {
        return zzce0.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 233012000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc() {
        zzbbr.zza(this.zza);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjH)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                IBinder iBinder0 = ((zzbr)zzcae.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzan.zza)).zze(iObjectWrapper0, this.zzb, this.zzc, 233012000);
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    return iInterface0 instanceof zzbq ? ((zzbq)iInterface0) : new zzbo(iBinder0);
                }
                return null;
            }
            catch(zzcad | RemoteException | NullPointerException zzcad0) {
            }
            zzbth zzbth0 = zzbtf.zza(this.zza);
            this.zzd.zzh = zzbth0;
            this.zzd.zzh.zzf(zzcad0, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
        return zzaw.zza(this.zzd).zza(this.zza, this.zzb, this.zzc);
    }
}

