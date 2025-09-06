package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.WindowInsets;

public final class zzw implements View.OnApplyWindowInsetsListener {
    public final zzx zza;
    public final Activity zzb;

    public zzw(zzx zzx0, Activity activity0) {
        this.zza = zzx0;
        this.zzb = activity0;
    }

    @Override  // android.view.View$OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
        return zzx.zzm(this.zzb, view0, windowInsets0);
    }
}

