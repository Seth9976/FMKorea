package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

final class zzcyw implements Runnable {
    private final WeakReference zza;

    zzcyw(zzcyx zzcyx0, zzcyv zzcyv0) {
        this.zza = new WeakReference(zzcyx0);
    }

    @Override
    public final void run() {
        zzcyx zzcyx0 = (zzcyx)this.zza.get();
        if(zzcyx0 != null) {
            zzcyx0.zzt((zzcyu this) -> ((zzcyy)object0).zza());
        }
    }
}

