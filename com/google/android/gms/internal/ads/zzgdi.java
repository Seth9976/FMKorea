package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzgdi extends zzgfv {
    final zzgdj zza;

    zzgdi(zzgdj zzgdj0, Class class0) {
        this.zza = zzgdj0;
        super(class0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zza(zzgta zzgta0) {
        zzglq zzglq0 = zzglr.zzc();
        byte[] arr_b = zzghf.zzb(((zzglu)zzgta0).zza());
        zzglq0.zza(zzgqi.zzv(arr_b, 0, arr_b.length));
        zzglq0.zzb(0);
        return (zzglr)zzglq0.zzal();
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zzb(zzgqi zzgqi0) {
        return zzglu.zzf(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("AES128_GCM_SIV", zzgdj.zzh(16, 1));
        hashMap0.put("AES128_GCM_SIV_RAW", zzgdj.zzh(16, 3));
        hashMap0.put("AES256_GCM_SIV", zzgdj.zzh(0x20, 1));
        hashMap0.put("AES256_GCM_SIV_RAW", zzgdj.zzh(0x20, 3));
        return Collections.unmodifiableMap(hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final void zzd(zzgta zzgta0) {
        zzgpm.zza(((zzglu)zzgta0).zza());
    }
}

