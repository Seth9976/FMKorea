package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzdou implements zzcxd {
    private final zzcfi zza;

    zzdou(zzcfi zzcfi0) {
        this.zza = zzcfi0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbn(Context context0) {
        zzcfi zzcfi0 = this.zza;
        if(zzcfi0 != null) {
            zzcfi0.destroy();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbp(Context context0) {
        zzcfi zzcfi0 = this.zza;
        if(zzcfi0 != null) {
            zzcfi0.onPause();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbq(Context context0) {
        zzcfi zzcfi0 = this.zza;
        if(zzcfi0 != null) {
            zzcfi0.onResume();
        }
    }
}

