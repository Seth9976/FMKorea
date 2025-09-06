package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbwi {
    public static final zzbvw zza(Context context0, String s, zzbof zzbof0) {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
        try {
            IBinder iBinder0 = ((zzbwa)zzcae.zzb(context0, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzbwh.zza)).zze(iObjectWrapper0, s, zzbof0, 233012000);
            if(iBinder0 != null) {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
                return iInterface0 instanceof zzbvw ? ((zzbvw)iInterface0) : new zzbvu(iBinder0);
            }
            return null;
        }
        catch(zzcad | RemoteException zzcad0) {
        }
        zzcaa.zzl("#007 Could not call remote method.", zzcad0);
        return null;
    }
}

