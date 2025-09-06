package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeod implements zzesi {
    public final double zza;
    public final boolean zzb;

    public zzeod(double f, boolean z) {
        this.zza = f;
        this.zzb = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        Bundle bundle0 = zzfcm.zza(((Bundle)object0), "device");
        ((Bundle)object0).putBundle("device", bundle0);
        Bundle bundle1 = zzfcm.zza(bundle0, "battery");
        bundle0.putBundle("battery", bundle1);
        bundle1.putBoolean("is_charging", this.zzb);
        bundle1.putDouble("battery_level", this.zza);
    }
}

