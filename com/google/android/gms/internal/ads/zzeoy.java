package com.google.android.gms.internal.ads;

import android.os.Bundle;

final class zzeoy implements zzesi {
    private final String zza;
    private final String zzb;
    private final Bundle zzc;

    zzeoy(String s, String s1, Bundle bundle0, zzeox zzeox0) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        ((Bundle)object0).putString("consent_string", this.zza);
        ((Bundle)object0).putString("fc_consent", this.zzb);
        ((Bundle)object0).putBundle("iab_consent_info", this.zzc);
    }
}

