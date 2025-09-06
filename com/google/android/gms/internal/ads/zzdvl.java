package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Callable;

public final class zzdvl implements Callable {
    public final CookieManager zza;

    public zzdvl(CookieManager cookieManager0) {
        this.zza = cookieManager0;
    }

    @Override
    public final Object call() {
        return this.zza == null ? "" : this.zza.getCookie(((String)zzba.zzc().zzb(zzbbr.zzaL)));
    }
}

