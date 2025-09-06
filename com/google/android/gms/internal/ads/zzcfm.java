package com.google.android.gms.internal.ads;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;

final class zzcfm implements View.OnAttachStateChangeListener {
    final zzbxb zza;
    final zzcfp zzb;

    zzcfm(zzcfp zzcfp0, zzbxb zzbxb0) {
        this.zzb = zzcfp0;
        this.zza = zzbxb0;
        super();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        zzcfp.zzf(this.zzb, view0, this.zza, 10);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }
}

