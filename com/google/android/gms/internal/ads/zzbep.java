package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import java.util.ArrayList;
import java.util.List;

public final class zzbep extends AdChoicesInfo {
    private final zzbeo zza;
    private final List zzb;
    private String zzc;

    public zzbep(zzbeo zzbeo0) {
        this.zzb = new ArrayList();
        this.zza = zzbeo0;
        try {
            this.zzc = zzbeo0.zzg();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            this.zzc = "";
        }
        try {
            for(Object object0: zzbeo0.zzh()) {
                zzbew zzbew0 = null;
                if(object0 instanceof IBinder && ((IBinder)object0) != null) {
                    IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbew0 = iInterface0 instanceof zzbew ? ((zzbew)iInterface0) : new zzbeu(((IBinder)object0));
                }
                if(zzbew0 != null) {
                    zzbex zzbex0 = new zzbex(zzbew0);
                    this.zzb.add(zzbex0);
                }
            }
            return;
        }
        catch(RemoteException remoteException1) {
        }
        zzcaa.zzh("", remoteException1);
    }

    @Override  // com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo
    public final List getImages() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}

