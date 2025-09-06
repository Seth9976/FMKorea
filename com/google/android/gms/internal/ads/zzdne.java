package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;

public final class zzdne extends zzdmo implements zzddw {
    private zzddw zza;

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        synchronized(this) {
            zzddw zzddw0 = this.zza;
            if(zzddw0 != null) {
                zzddw0.zzbK();
            }
        }
    }

    protected final void zzi(zza zza0, zzbhh zzbhh0, zzo zzo0, zzbhj zzbhj0, zzz zzz0, zzddw zzddw0) {
        synchronized(this) {
            super.zzh(zza0, zzbhh0, zzo0, zzbhj0, zzz0);
            this.zza = zzddw0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
        synchronized(this) {
            zzddw zzddw0 = this.zza;
            if(zzddw0 != null) {
                zzddw0.zzs();
            }
        }
    }
}

