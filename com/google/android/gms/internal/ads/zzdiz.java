package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

public final class zzdiz implements Runnable {
    public final zzdjc zza;
    public final ViewGroup zzb;

    public zzdiz(zzdjc zzdjc0, ViewGroup viewGroup0) {
        this.zza = zzdjc0;
        this.zzb = viewGroup0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

