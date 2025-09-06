package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzerl implements zzesi {
    private final String zza;
    private final Bundle zzb;

    public zzerl(String s, Bundle bundle0) {
        this.zza = s;
        this.zzb = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        ((Bundle)object0).putString("rtb", this.zza);
        if(!this.zzb.isEmpty()) {
            ((Bundle)object0).putBundle("adapter_initialization_status", this.zzb);
        }
    }
}

