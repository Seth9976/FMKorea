package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcgt;

public final class zzd implements zzcgt {
    public final zzl zza;

    public zzd(zzl zzl0) {
        this.zza = zzl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final void zza(boolean z, int v, String s, String s1) {
        zzcfi zzcfi0 = this.zza.zzd;
        if(zzcfi0 != null) {
            zzcfi0.zzX();
        }
    }
}

