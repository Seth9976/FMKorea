package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;
import java.util.HashMap;

final class zzau extends zzax {
    final View zza;
    final HashMap zzb;
    final HashMap zzc;
    final zzaw zzd;

    zzau(zzaw zzaw0, View view0, HashMap hashMap0, HashMap hashMap1) {
        this.zzd = zzaw0;
        this.zza = view0;
        this.zzb = hashMap0;
        this.zzc = hashMap1;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    protected final Object zza() {
        zzaw.zzt(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb(zzce zzce0) {
        return zzce0.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc() {
        zzbbr.zza(this.zza.getContext());
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjH)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(this.zzb);
                IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(this.zzc);
                return zzbff.zze(((zzbfj)zzcae.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", (zzat this) -> zzbfi.zzb(((IBinder)object0)))).zze(iObjectWrapper0, iObjectWrapper1, iObjectWrapper2));
            }
            catch(zzcad | RemoteException | NullPointerException zzcad0) {
                zzbth zzbth0 = zzbtf.zza(this.zza.getContext());
                this.zzd.zzh = zzbth0;
                this.zzd.zzh.zzf(zzcad0, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        }
        return zzaw.zzk(this.zzd).zza(this.zza, this.zzb, this.zzc);
    }
}

