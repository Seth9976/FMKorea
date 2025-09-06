package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzas;

final class zzg extends RelativeLayout {
    final zzas zza;
    boolean zzb;

    public zzg(Context context0, String s, String s1, String s2) {
        super(context0);
        zzas zzas0 = new zzas(context0, s);
        this.zza = zzas0;
        zzas0.zzo(s1);
        zzas0.zzn(s2);
    }

    @Override  // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        if(!this.zzb) {
            this.zza.zzm(motionEvent0);
        }
        return false;
    }
}

