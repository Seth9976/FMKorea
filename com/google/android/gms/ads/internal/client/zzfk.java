package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;

public final class zzfk extends zzds {
    private final VideoLifecycleCallbacks zza;

    public zzfk(VideoLifecycleCallbacks videoController$VideoLifecycleCallbacks0) {
        this.zza = videoController$VideoLifecycleCallbacks0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdt
    public final void zze() {
        this.zza.onVideoEnd();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdt
    public final void zzf(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdt
    public final void zzg() {
        this.zza.onVideoPause();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdt
    public final void zzh() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdt
    public final void zzi() {
        this.zza.onVideoStart();
    }
}

