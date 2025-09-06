package com.google.android.gms.ads.h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbjw;

public final class H5AdsRequestHandler {
    private final zzbjw zza;

    public H5AdsRequestHandler(Context context0, OnH5AdsEventListener onH5AdsEventListener0) {
        this.zza = new zzbjw(context0, onH5AdsEventListener0);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public boolean handleH5AdsRequest(String s) {
        return this.zza.zzb(s);
    }

    public boolean shouldInterceptRequest(String s) {
        return zzbjw.zzc(s);
    }
}

