package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class zzp extends AnimatorListenerAdapter {
    final zzr zza;

    zzp(zzr zzr0) {
        this.zza = zzr0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        this.zza(true);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        this.zza(true);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationStart(Animator animator0) {
        this.zza(false);
    }

    private final void zza(boolean z) {
        this.zza.setEnabled(z);
        zzr.zza(this.zza).setEnabled(z);
    }
}

