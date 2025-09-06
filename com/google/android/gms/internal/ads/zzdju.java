package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

public final class zzdju implements zzbir {
    public final zzdjw zza;
    public final View zzb;
    public final WindowManager zzc;

    public zzdju(zzdjw zzdjw0, View view0, WindowManager windowManager0) {
        this.zza = zzdjw0;
        this.zzb = view0;
        this.zzc = windowManager0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        this.zza.zze(this.zzb, this.zzc, ((zzcfi)object0), map0);
    }
}

