package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzgcr extends zzgfv {
    final zzgcs zza;

    zzgcr(zzgcs zzgcs0, Class class0) {
        this.zza = zzgcs0;
        super(class0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zza(zzgta zzgta0) {
        zzglk zzglk0 = zzgll.zzc();
        byte[] arr_b = zzghf.zzb(((zzglo)zzgta0).zza());
        zzglk0.zza(zzgqi.zzv(arr_b, 0, arr_b.length));
        zzglk0.zzb(0);
        return (zzgll)zzglk0.zzal();
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zzb(zzgqi zzgqi0) {
        return zzglo.zzf(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("AES128_GCM", zzgcs.zzg(16, 1));
        hashMap0.put("AES128_GCM_RAW", zzgcs.zzg(16, 3));
        hashMap0.put("AES256_GCM", zzgcs.zzg(0x20, 1));
        hashMap0.put("AES256_GCM_RAW", zzgcs.zzg(0x20, 3));
        return Collections.unmodifiableMap(hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final void zzd(zzgta zzgta0) {
        zzgpm.zza(((zzglo)zzgta0).zza());
    }
}

