package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzesf implements zzesi {
    public final Bundle zza;

    public zzesf(Bundle bundle0) {
        this.zza = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        ((Bundle)object0).putBundle("shared_pref", this.zza);
    }
}

