package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbez;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;

final class zzas extends zzax {
    final FrameLayout zza;
    final FrameLayout zzb;
    final Context zzc;
    final zzaw zzd;

    zzas(zzaw zzaw0, FrameLayout frameLayout0, FrameLayout frameLayout1, Context context0) {
        this.zzd = zzaw0;
        this.zza = frameLayout0;
        this.zzb = frameLayout1;
        this.zzc = context0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    protected final Object zza() {
        zzaw.zzt(this.zzc, "native_ad_view_delegate");
        return new zzez();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb(zzce zzce0) {
        return zzce0.zzi(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc() {
        zzbbr.zza(this.zzc);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjH)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zzc);
                IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(this.zza);
                IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(this.zzb);
                return zzbez.zzbE(((zzbfd)zzcae.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", (zzar this) -> zzbfc.zzb(((IBinder)object0)))).zze(iObjectWrapper0, iObjectWrapper1, iObjectWrapper2, 233012000));
            }
            catch(zzcad | RemoteException | NullPointerException zzcad0) {
                zzbth zzbth0 = zzbtf.zza(this.zzc);
                this.zzd.zzh = zzbth0;
                this.zzd.zzh.zzf(zzcad0, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        }
        return zzaw.zzj(this.zzd).zza(this.zzc, this.zza, this.zzb);
    }
}

