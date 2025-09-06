package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.ref.WeakReference;
import java.util.Map;

final class zzdgw implements zzbir {
    private final WeakReference zza;

    zzdgw(zzdgz zzdgz0, zzdgv zzdgv0) {
        this.zza = new WeakReference(zzdgz0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzdgz zzdgz0 = (zzdgz)this.zza.get();
        if(zzdgz0 == null) {
            return;
        }
        zzdgz.zzb(zzdgz0).onAdClicked();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjL)).booleanValue()) {
            zzdgz.zzd(zzdgz0).zzbK();
            if(!TextUtils.isEmpty(((CharSequence)map0.get("sccg")))) {
                zzdgz.zzd(zzdgz0).zzs();
            }
        }
    }
}

