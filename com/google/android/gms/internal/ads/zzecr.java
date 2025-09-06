package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Timer;
import java.util.TimerTask;

final class zzecr extends TimerTask {
    final AlertDialog zza;
    final Timer zzb;
    final zzl zzc;

    zzecr(zzecs zzecs0, AlertDialog alertDialog0, Timer timer0, zzl zzl0) {
        this.zza = alertDialog0;
        this.zzb = timer0;
        this.zzc = zzl0;
        super();
    }

    @Override
    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        zzl zzl0 = this.zzc;
        if(zzl0 != null) {
            zzl0.zzb();
        }
    }
}

