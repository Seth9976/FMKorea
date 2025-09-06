package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

public final class zzbwu implements Runnable {
    public final zzbww zza;
    public final Bitmap zzb;

    public zzbwu(zzbww zzbww0, Bitmap bitmap0) {
        this.zza = zzbww0;
        this.zzb = bitmap0;
    }

    @Override
    public final void run() {
        this.zza.zzf(this.zzb);
    }
}

