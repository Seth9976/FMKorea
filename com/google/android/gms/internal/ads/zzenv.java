package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzenv implements zzesi {
    private final Integer zza;

    private zzenv(Integer integer0) {
        this.zza = integer0;
    }

    static zzenv zzb() {
        int v = 0;
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjo)).booleanValue()) {
            if(Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
                v = SdkExtensions.getExtensionVersion(1000000);
            }
            return new zzenv(v);
        }
        return new zzenv(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        Integer integer0 = this.zza;
        if(integer0 != null) {
            ((Bundle)object0).putInt("aos", ((int)integer0));
        }
    }
}

