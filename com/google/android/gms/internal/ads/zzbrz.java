package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.android.gms.dynamic.RemoteCreator;

public final class zzbrz extends RemoteCreator {
    public zzbrz() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override  // com.google.android.gms.dynamic.RemoteCreator
    protected final Object getRemoteCreator(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterface0 instanceof zzbsf ? ((zzbsf)iInterface0) : new zzbsd(iBinder0);
    }

    public final zzbsc zza(Activity activity0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(activity0);
            IBinder iBinder0 = ((zzbsf)this.getRemoteCreatorInstance(activity0)).zze(iObjectWrapper0);
            if(iBinder0 != null) {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterface0 instanceof zzbsc ? ((zzbsc)iInterface0) : new zzbsa(iBinder0);
            }
            return null;
        }
        catch(RemoteException remoteException0) {
        }
        catch(RemoteCreatorException remoteCreator$RemoteCreatorException0) {
            zzcaa.zzk("Could not create remote AdOverlay.", remoteCreator$RemoteCreatorException0);
            return null;
        }
        zzcaa.zzk("Could not create remote AdOverlay.", remoteException0);
        return null;
    }
}

