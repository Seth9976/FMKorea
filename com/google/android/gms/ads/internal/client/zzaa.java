package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzbse;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;

final class zzaa extends zzax {
    final Activity zza;
    final zzaw zzb;

    zzaa(zzaw zzaw0, Activity activity0) {
        this.zzb = zzaw0;
        this.zza = activity0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    protected final Object zza() {
        zzaw.zzt(this.zza, "ad_overlay");
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb(zzce zzce0) {
        return zzce0.zzm(ObjectWrapper.wrap(this.zza));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc() {
        zzbbr.zza(this.zza);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjH)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                return zzbsb.zzH(((zzbsf)zzcae.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", (zzz this) -> zzbse.zzb(((IBinder)object0)))).zze(iObjectWrapper0));
            }
            catch(zzcad | RemoteException | NullPointerException zzcad0) {
                zzbth zzbth0 = zzbtf.zza(this.zza.getApplicationContext());
                this.zzb.zzh = zzbth0;
                this.zzb.zzh.zzf(zzcad0, "ClientApiBroker.createAdOverlay");
                return null;
            }
        }
        return this.zzb.zzf.zza(this.zza);
    }
}

