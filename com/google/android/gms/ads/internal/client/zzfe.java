package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

public final class zzfe extends zzdf {
    private final OnPaidEventListener zza;

    public zzfe(OnPaidEventListener onPaidEventListener0) {
        this.zza = onPaidEventListener0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdg
    public final void zze(zzs zzs0) {
        OnPaidEventListener onPaidEventListener0 = this.zza;
        if(onPaidEventListener0 != null) {
            onPaidEventListener0.onPaidEvent(AdValue.zza(zzs0.zzb, zzs0.zzc, zzs0.zzd));
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdg
    public final boolean zzf() {
        return this.zza == null;
    }
}

