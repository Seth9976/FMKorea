package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzcfl implements Runnable {
    public final zzcfp zza;
    public final View zzb;
    public final zzbxb zzc;
    public final int zzd;

    public zzcfl(zzcfp zzcfp0, View view0, zzbxb zzbxb0, int v) {
        this.zza = zzcfp0;
        this.zzb = view0;
        this.zzc = zzbxb0;
        this.zzd = v;
    }

    @Override
    public final void run() {
        this.zza.zzo(this.zzb, this.zzc, this.zzd);
    }
}

