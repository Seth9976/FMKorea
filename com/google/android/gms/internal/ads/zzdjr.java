package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;

public final class zzdjr implements ViewTreeObserver.OnScrollChangedListener {
    public final View zza;
    public final zzcfi zzb;
    public final String zzc;
    public final WindowManager.LayoutParams zzd;
    public final int zze;
    public final WindowManager zzf;

    public zzdjr(View view0, zzcfi zzcfi0, String s, WindowManager.LayoutParams windowManager$LayoutParams0, int v, WindowManager windowManager0) {
        this.zza = view0;
        this.zzb = zzcfi0;
        this.zzc = s;
        this.zzd = windowManager$LayoutParams0;
        this.zze = v;
        this.zzf = windowManager0;
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        zzcfi zzcfi0 = this.zzb;
        String s = this.zzc;
        WindowManager.LayoutParams windowManager$LayoutParams0 = this.zzd;
        int v = this.zze;
        WindowManager windowManager0 = this.zzf;
        Rect rect0 = new Rect();
        if(this.zza.getGlobalVisibleRect(rect0) && zzcfi0.zzF().getWindowToken() != null) {
            windowManager$LayoutParams0.y = "1".equals(s) || "2".equals(s) ? rect0.bottom - v : rect0.top - v;
            windowManager0.updateViewLayout(zzcfi0.zzF(), windowManager$LayoutParams0);
        }
    }
}

