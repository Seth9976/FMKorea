package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class zzdof implements View.OnTouchListener {
    public final zzdol zza;

    public zzdof(zzdol zzdol0) {
        this.zza = zzdol0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        this.zza.zzh(view0, motionEvent0);
        return false;
    }
}

