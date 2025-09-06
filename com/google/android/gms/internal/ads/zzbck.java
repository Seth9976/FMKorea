package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbck extends zzbcl {
    private final zzf zza;
    private final String zzb;
    private final String zzc;

    public zzbck(zzf zzf0, String s, String s1) {
        this.zza = zzf0;
        this.zzb = s;
        this.zzc = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbcm
    public final String zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzbcm
    public final String zzc() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzbcm
    public final void zzd(IObjectWrapper iObjectWrapper0) {
        if(iObjectWrapper0 == null) {
            return;
        }
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
        this.zza.zza(view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcm
    public final void zze() {
        this.zza.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbcm
    public final void zzf() {
        this.zza.zzc();
    }
}

