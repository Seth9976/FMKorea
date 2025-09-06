package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;

public final class zzk extends RemoteCreator {
    private zzbth zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override  // com.google.android.gms.dynamic.RemoteCreator
    protected final Object getRemoteCreator(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterface0 instanceof zzbv ? ((zzbv)iInterface0) : new zzbv(iBinder0);
    }

    public final zzbu zza(Context context0, zzq zzq0, String s, zzbof zzbof0, int v) {
        zzbbr.zza(context0);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjH)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                IBinder iBinder0 = ((zzbv)zzcae.zzb(context0, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.zza)).zze(iObjectWrapper0, zzq0, s, zzbof0, 233012000, v);
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterface0 instanceof zzbu ? ((zzbu)iInterface0) : new zzbs(iBinder0);
                }
            }
            catch(zzcad | RemoteException | NullPointerException zzcad0) {
                zzbth zzbth0 = zzbtf.zza(context0);
                this.zza = zzbth0;
                zzbth0.zzf(zzcad0, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzcaa.zzl("#007 Could not call remote method.", zzcad0);
            }
            return null;
        }
        try {
            IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(context0);
            IBinder iBinder1 = ((zzbv)this.getRemoteCreatorInstance(context0)).zze(iObjectWrapper1, zzq0, s, zzbof0, 233012000, v);
            if(iBinder1 != null) {
                IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterface1 instanceof zzbu ? ((zzbu)iInterface1) : new zzbs(iBinder1);
            }
            return null;
        }
        catch(RemoteException | RemoteCreatorException remoteException0) {
        }
        zzcaa.zzf("Could not create remote AdManager.", remoteException0);
        return null;
    }
}

