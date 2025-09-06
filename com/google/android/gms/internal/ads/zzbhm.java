package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

public final class zzbhm implements zzfqw {
    public static final zzbhm zza;

    static {
        zzbhm.zza = new zzbhm();
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    public final Object apply(Object object0) {
        if(((Boolean)zzbdj.zzk.zze()).booleanValue()) {
            zzt.zzo().zzu(((Throwable)object0), "prepareClickUrl.attestation1");
        }
        return "failure_click_attok";
    }
}

