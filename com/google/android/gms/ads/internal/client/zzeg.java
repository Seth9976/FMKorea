package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

final class zzeg extends zzcz {
    private zzeg() {
    }

    zzeg(zzef zzef0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzda
    public final void zze(zze zze0) {
        OnAdInspectorClosedListener onAdInspectorClosedListener0 = zzej.zzb(zzej.zzf());
        if(onAdInspectorClosedListener0 != null) {
            onAdInspectorClosedListener0.onAdInspectorClosed((zze0 == null ? null : new AdInspectorError(zze0.zza, zze0.zzb, zze0.zzc)));
        }
    }
}

