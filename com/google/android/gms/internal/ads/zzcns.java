package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcns implements zzcxd {
    private final zzfcw zza;

    public zzcns(zzfcw zzfcw0) {
        this.zza = zzfcw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbn(Context context0) {
        try {
            this.zza.zzg();
        }
        catch(zzfcf zzfcf0) {
            zzcaa.zzk("Cannot invoke onDestroy for the mediation adapter.", zzfcf0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbp(Context context0) {
        try {
            this.zza.zzt();
        }
        catch(zzfcf zzfcf0) {
            zzcaa.zzk("Cannot invoke onPause for the mediation adapter.", zzfcf0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbq(Context context0) {
        try {
            this.zza.zzu();
            if(context0 != null) {
                this.zza.zzs(context0);
            }
        }
        catch(zzfcf zzfcf0) {
            zzcaa.zzk("Cannot invoke onResume for the mediation adapter.", zzfcf0);
        }
    }
}

