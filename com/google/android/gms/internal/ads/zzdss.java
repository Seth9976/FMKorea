package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzdss implements zzdsg {
    private final long zza;
    private final zzelf zzb;

    zzdss(long v, Context context0, zzdsl zzdsl0, zzchd zzchd0, String s) {
        this.zza = v;
        zzezj zzezj0 = zzchd0.zzu();
        zzezj0.zzc(context0);
        zzezj0.zza(new zzq());
        zzezj0.zzb(s);
        zzelf zzelf0 = zzezj0.zzd().zza();
        this.zzb = zzelf0;
        zzelf0.zzD(new zzdsr(this, zzdsl0));
    }

    @Override  // com.google.android.gms.internal.ads.zzdsg
    public final void zza() {
        this.zzb.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzdsg
    public final void zzb(zzl zzl0) {
        this.zzb.zzaa(zzl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdsg
    public final void zzc() {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(null);
        this.zzb.zzW(iObjectWrapper0);
    }

    static long zzd(zzdss zzdss0) {
        return zzdss0.zza;
    }
}

