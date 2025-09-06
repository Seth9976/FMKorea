package com.google.android.gms.internal.ads;

import Z1.d;
import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.c;
import androidx.privacysandbox.ads.adservices.topics.e;

public final class zzesw implements zzfxl {
    public static final zzesw zza;

    static {
        zzesw.zza = new zzesw();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        zzgvi zzgvi0 = zzgvj.zza();
        for(Object object1: ((c)object0).a()) {
            zzgvg zzgvg0 = zzgvh.zza();
            zzgvg0.zzc(((e)object1).c());
            zzgvg0.zza(((e)object1).a());
            zzgvg0.zzb(((e)object1).b());
            zzgvi0.zza(((zzgvh)zzgvg0.zzal()));
        }
        return zzfye.zzh(new zzeta(Base64.encodeToString(((zzgvj)zzgvi0.zzal()).zzax(), 1), 1, null));
    }
}

