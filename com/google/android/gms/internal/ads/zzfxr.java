package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class zzfxr extends zzfxd {
    private zzfxq zza;

    zzfxr(zzfty zzfty0, boolean z, Executor executor0, Callable callable0) {
        super(zzfty0, z, false);
        this.zza = new zzfxp(this, callable0, executor0);
        this.zzv();
    }

    static void zzG(zzfxr zzfxr0, zzfxq zzfxq0) {
        zzfxr0.zza = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    final void zzf(int v, Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    protected final void zzq() {
        zzfxq zzfxq0 = this.zza;
        if(zzfxq0 != null) {
            zzfxq0.zzh();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    final void zzu() {
        zzfxq zzfxq0 = this.zza;
        if(zzfxq0 != null) {
            zzfxq0.zzf();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    final void zzy(int v) {
        super.zzy(v);
        if(v == 1) {
            this.zza = null;
        }
    }
}

