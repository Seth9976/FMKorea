package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzgca extends zzgfv {
    final zzgcb zza;

    zzgca(zzgcb zzgcb0, Class class0) {
        this.zza = zzgcb0;
        super(class0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zza(zzgta zzgta0) {
        zzglb zzglb0 = zzglc.zzc();
        byte[] arr_b = zzghf.zzb(((zzglf)zzgta0).zza());
        zzglb0.zza(zzgqi.zzv(arr_b, 0, arr_b.length));
        zzglb0.zzb(((zzglf)zzgta0).zzf());
        zzglb0.zzc(0);
        return (zzglc)zzglb0.zzal();
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zzb(zzgqi zzgqi0) {
        return zzglf.zze(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("AES128_EAX", zzgcb.zzg(16, 16, 1));
        hashMap0.put("AES128_EAX_RAW", zzgcb.zzg(16, 16, 3));
        hashMap0.put("AES256_EAX", zzgcb.zzg(0x20, 16, 1));
        hashMap0.put("AES256_EAX_RAW", zzgcb.zzg(0x20, 16, 3));
        return Collections.unmodifiableMap(hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final void zzd(zzgta zzgta0) {
        zzgpm.zza(((zzglf)zzgta0).zza());
        switch(((zzglf)zzgta0).zzf().zza()) {
            case 12: 
            case 16: {
                return;
            }
            default: {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }
}

