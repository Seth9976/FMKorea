package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.android.gms.dynamic.RemoteCreator;

public final class zzbgv extends RemoteCreator {
    public zzbgv() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override  // com.google.android.gms.dynamic.RemoteCreator
    protected final Object getRemoteCreator(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterface0 instanceof zzbfd ? ((zzbfd)iInterface0) : new zzbfb(iBinder0);
    }

    public final zzbfa zza(Context context0, FrameLayout frameLayout0, FrameLayout frameLayout1) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
            IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(frameLayout0);
            IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(frameLayout1);
            IBinder iBinder0 = ((zzbfd)this.getRemoteCreatorInstance(context0)).zze(iObjectWrapper0, iObjectWrapper1, iObjectWrapper2, 233012000);
            if(iBinder0 != null) {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterface0 instanceof zzbfa ? ((zzbfa)iInterface0) : new zzbey(iBinder0);
            }
            return null;
        }
        catch(RemoteException | RemoteCreatorException remoteException0) {
        }
        zzcaa.zzk("Could not create remote NativeAdViewDelegate.", remoteException0);
        return null;
    }
}

