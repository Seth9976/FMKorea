package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

public final class zzdbb implements zzdbr {
    public final String zza;
    public final String zzb;

    public zzdbb(String s, String s1) {
        this.zza = s;
        this.zzb = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzdbr
    public final void zza(Object object0) {
        ((AppEventListener)object0).onAppEvent(this.zza, this.zzb);
    }
}

