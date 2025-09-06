package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class zzeno implements zzesi {
    final String zza;
    final int zzb;

    public zzeno(String s, int v) {
        this.zza = s;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        if(!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            Bundle bundle0 = zzfcm.zza(((Bundle)object0), "pii");
            ((Bundle)object0).putBundle("pii", bundle0);
            bundle0.putString("pvid", this.zza);
            bundle0.putInt("pvid_s", this.zzb);
        }
    }
}

