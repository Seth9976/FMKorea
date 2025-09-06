package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;

final class zzaq extends zzax {
    final Context zza;
    final zzaw zzb;

    zzaq(zzaw zzaw0, Context context0) {
        this.zzb = zzaw0;
        this.zza = context0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    protected final Object zza() {
        zzaw.zzt(this.zza, "mobile_ads_settings");
        return new zzey();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb(zzce zzce0) {
        return zzce0.zzg(ObjectWrapper.wrap(this.zza), 233012000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc() {
        zzbbr.zza(this.zza);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjH)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                IBinder iBinder0 = ((zzcp)zzcae.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzap.zza)).zze(iObjectWrapper0, 233012000);
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                    return iInterface0 instanceof zzco ? ((zzco)iInterface0) : new zzcm(iBinder0);
                }
                return null;
            }
            catch(zzcad | RemoteException | NullPointerException zzcad0) {
            }
            zzbth zzbth0 = zzbtf.zza(this.zza);
            this.zzb.zzh = zzbth0;
            this.zzb.zzh.zzf(zzcad0, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
        return zzaw.zzg(this.zzb).zza(this.zza);
    }
}

