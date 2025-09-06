package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzecw implements Runnable {
    public final zzfip zza;
    public final View zzb;

    public zzecw(zzfip zzfip0, View view0) {
        this.zza = zzfip0;
        this.zzb = view0;
    }

    @Override
    public final void run() {
        zzfip zzfip0 = this.zza;
        View view0 = this.zzb;
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() && false) {
            zzfip0.zzd(view0);
        }
    }
}

