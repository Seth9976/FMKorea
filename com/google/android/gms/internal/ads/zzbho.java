package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

public final class zzbho implements zzfqw {
    public final String zza;

    public zzbho(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    public final Object apply(Object object0) {
        String s = this.zza;
        if(((Boolean)zzbdj.zzk.zze()).booleanValue()) {
            zzt.zzo().zzu(((Throwable)object0), "prepareClickUrl.attestation2");
        }
        return s;
    }
}

