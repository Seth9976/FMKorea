package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

final class zzn implements View.OnTouchListener {
    final zzs zza;

    zzn(zzs zzs0) {
        this.zza = zzs0;
        super();
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        zzs zzs0 = this.zza;
        if(zzs.zzf(zzs0) != null) {
            zzs.zzf(zzs0).zzd(motionEvent0);
        }
        return false;
    }
}

