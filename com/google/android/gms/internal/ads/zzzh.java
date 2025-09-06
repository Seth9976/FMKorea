package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

final class zzzh implements zzzg {
    private final WindowManager zza;

    private zzzh(WindowManager windowManager0) {
        this.zza = windowManager0;
    }

    @Override  // com.google.android.gms.internal.ads.zzzg
    public final void zza() {
    }

    @Override  // com.google.android.gms.internal.ads.zzzg
    public final void zzb(zzze zzze0) {
        Display display0 = this.zza.getDefaultDisplay();
        zzzk.zzb(zzze0.zza, display0);
    }

    public static zzzg zzc(Context context0) {
        WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
        return windowManager0 != null ? new zzzh(windowManager0) : null;
    }
}

