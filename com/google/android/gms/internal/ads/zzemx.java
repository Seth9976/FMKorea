package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzemx implements zzesi {
    private final Bundle zza;

    zzemx(Bundle bundle0) {
        this.zza = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        if(!this.zza.isEmpty()) {
            ((Bundle)object0).putBundle("installed_adapter_data", this.zza);
        }
    }
}

