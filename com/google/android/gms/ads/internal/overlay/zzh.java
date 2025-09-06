package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcfi;

public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(zzcfi zzcfi0) {
        this.zzb = zzcfi0.getLayoutParams();
        ViewParent viewParent0 = zzcfi0.getParent();
        this.zzd = zzcfi0.zzE();
        if(viewParent0 == null || !(viewParent0 instanceof ViewGroup)) {
            throw new zzf("Could not get the parent of the WebView for an overlay.");
        }
        this.zzc = (ViewGroup)viewParent0;
        this.zza = ((ViewGroup)viewParent0).indexOfChild(zzcfi0.zzF());
        ((ViewGroup)viewParent0).removeView(zzcfi0.zzF());
        zzcfi0.zzan(true);
    }
}

