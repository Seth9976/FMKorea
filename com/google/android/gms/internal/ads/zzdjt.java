package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

public final class zzdjt implements zzbir {
    public final zzdjw zza;
    public final WindowManager zzb;
    public final View zzc;

    public zzdjt(zzdjw zzdjw0, WindowManager windowManager0, View view0) {
        this.zza = zzdjw0;
        this.zzb = windowManager0;
        this.zzc = view0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        this.zza.zzc(this.zzb, this.zzc, ((zzcfi)object0), map0);
    }
}

