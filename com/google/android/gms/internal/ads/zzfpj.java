package com.google.android.gms.internal.ads;

import android.os.Bundle;

final class zzfpj extends zzfpv {
    final zzfpk zza;
    private final zzfpp zzb;

    zzfpj(zzfpk zzfpk0, zzfpp zzfpp0) {
        this.zza = zzfpk0;
        super();
        this.zzb = zzfpp0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpw
    public final void zzb(Bundle bundle0) {
        int v = bundle0.getInt("statusCode", 8150);
        String s = bundle0.getString("sessionToken");
        zzfpn zzfpn0 = zzfpo.zzc();
        zzfpn0.zzb(v);
        if(s != null) {
            zzfpn0.zza(s);
        }
        zzfpo zzfpo0 = zzfpn0.zzc();
        this.zzb.zza(zzfpo0);
        if(v == 0x1FDD) {
            this.zza.zzc();
        }
    }
}

