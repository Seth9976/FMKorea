package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo;
import java.util.ArrayList;
import java.util.List;

public final class zzbrh extends AdChoicesInfo {
    private final List zza;
    private String zzb;

    public zzbrh(zzbeo zzbeo0) {
        this.zza = new ArrayList();
        try {
            this.zzb = zzbeo0.zzg();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            this.zzb = "";
        }
        try {
            for(Object object0: zzbeo0.zzh()) {
                zzbew zzbew0 = object0 instanceof IBinder ? zzbev.zzg(((IBinder)object0)) : null;
                if(zzbew0 != null) {
                    zzbrj zzbrj0 = new zzbrj(zzbew0);
                    this.zza.add(zzbrj0);
                }
            }
            return;
        }
        catch(RemoteException remoteException1) {
        }
        zzcaa.zzh("", remoteException1);
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$AdChoicesInfo
    public final List getImages() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}

