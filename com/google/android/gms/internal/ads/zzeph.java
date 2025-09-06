package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeph implements zzesi {
    public final String zza;
    public final boolean zzb;

    public zzeph(String s, boolean z) {
        this.zza = s;
        this.zzb = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        ((Bundle)object0).putString("gct", this.zza);
        if(this.zzb) {
            ((Bundle)object0).putString("de", "1");
        }
    }
}

