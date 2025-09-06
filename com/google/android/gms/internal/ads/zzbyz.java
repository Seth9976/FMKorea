package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

final class zzbyz implements Runnable {
    final Context zza;
    final zzcas zzb;

    zzbyz(zzbza zzbza0, Context context0, zzcas zzcas0) {
        this.zza = context0;
        this.zzb = zzcas0;
        super();
    }

    @Override
    public final void run() {
        try {
            Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(this.zza);
            this.zzb.zzc(advertisingIdClient$Info0);
        }
        catch(IOException | IllegalStateException | GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException iOException0) {
            this.zzb.zzd(iOException0);
            zzcaa.zzh("Exception while getting advertising Id info", iOException0);
        }
    }
}

