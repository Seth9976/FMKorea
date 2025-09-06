package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzepx implements zzesi {
    public final Bundle zza;

    public zzepx(Bundle bundle0) {
        this.zza = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        Bundle bundle0 = zzfcm.zza(((Bundle)object0), "device");
        bundle0.putBundle("android_mem_info", this.zza);
        ((Bundle)object0).putBundle("device", bundle0);
    }
}

