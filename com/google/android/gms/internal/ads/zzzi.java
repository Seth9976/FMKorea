package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager.DisplayListener;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

final class zzzi implements DisplayManager.DisplayListener, zzzg {
    private final DisplayManager zza;
    private zzze zzb;

    private zzzi(DisplayManager displayManager0) {
        this.zza = displayManager0;
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayAdded(int v) {
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayChanged(int v) {
        zzze zzze0 = this.zzb;
        if(zzze0 != null && v == 0) {
            Display display0 = this.zzd();
            zzzk.zzb(zzze0.zza, display0);
        }
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayRemoved(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzzg
    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzzg
    public final void zzb(zzze zzze0) {
        this.zzb = zzze0;
        Handler handler0 = zzfk.zzu(null);
        this.zza.registerDisplayListener(this, handler0);
        Display display0 = this.zzd();
        zzzk.zzb(zzze0.zza, display0);
    }

    public static zzzg zzc(Context context0) {
        DisplayManager displayManager0 = (DisplayManager)context0.getSystemService("display");
        return displayManager0 != null ? new zzzi(displayManager0) : null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }
}

