package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

public final class zzbwg implements RewardItem {
    private final zzbvt zza;

    public zzbwg(zzbvt zzbvt0) {
        this.zza = zzbvt0;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbvt zzbvt0 = this.zza;
        if(zzbvt0 != null) {
            try {
                return zzbvt0.zze();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Could not forward getAmount to RewardItem", remoteException0);
            }
        }
        return 0;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzbvt zzbvt0 = this.zza;
        if(zzbvt0 != null) {
            try {
                return zzbvt0.zzf();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Could not forward getType to RewardItem", remoteException0);
            }
        }
        return null;
    }
}

