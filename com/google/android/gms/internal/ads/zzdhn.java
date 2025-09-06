package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzdhn implements Runnable {
    public final zzdhx zza;
    public final View zzb;
    public final boolean zzc;
    public final int zzd;

    public zzdhn(zzdhx zzdhx0, View view0, boolean z, int v) {
        this.zza = zzdhx0;
        this.zzb = view0;
        this.zzc = z;
        this.zzd = v;
    }

    @Override
    public final void run() {
        this.zza.zzv(this.zzb, this.zzc, this.zzd);
    }
}

