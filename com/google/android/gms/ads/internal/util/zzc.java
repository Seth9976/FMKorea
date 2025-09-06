package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcaa;
import java.io.IOException;

final class zzc extends zzb {
    private final Context zza;

    zzc(Context context0) {
        this.zza = context0;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.zza);
        }
        catch(IOException | IllegalStateException | GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException iOException0) {
            zzcaa.zzh("Fail to get isAdIdFakeForDebugLogging", iOException0);
            z = false;
        }
        zzbzz.zzj(z);
        zzcaa.zzj(("Update ad debug logging enablement as " + z));
    }
}

