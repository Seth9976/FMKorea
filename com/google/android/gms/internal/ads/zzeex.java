package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzeex extends zzbpp {
    final zzeey zza;
    private final zzedq zzb;

    zzeex(zzeey zzeey0, zzedq zzedq0, zzeew zzeew0) {
        this.zza = zzeey0;
        super();
        this.zzb = zzedq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpq
    public final void zze(String s) {
        ((zzefj)this.zzb.zzc).zzi(0, s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpq
    public final void zzf(zze zze0) {
        ((zzefj)this.zzb.zzc).zzh(zze0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpq
    public final void zzg(IObjectWrapper iObjectWrapper0) {
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
        this.zza.zzc = view0;
        ((zzefj)this.zzb.zzc).zzo();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpq
    public final void zzh(zzboo zzboo0) {
        this.zza.zzd = zzboo0;
        ((zzefj)this.zzb.zzc).zzo();
    }
}

