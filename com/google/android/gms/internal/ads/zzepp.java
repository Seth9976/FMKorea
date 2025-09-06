package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzepp implements zzesi {
    private final Boolean zza;

    public zzepp(Boolean boolean0) {
        this.zza = boolean0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        Boolean boolean0 = this.zza;
        if(boolean0 != null) {
            ((Bundle)object0).putBoolean("hw_accel", boolean0.booleanValue());
        }
    }
}

