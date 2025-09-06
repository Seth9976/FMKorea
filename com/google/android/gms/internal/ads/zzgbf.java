package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzgbf extends zzgfv {
    final zzgbg zza;

    zzgbf(zzgbg zzgbg0, Class class0) {
        this.zza = zzgbg0;
        super(class0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zza(zzgta zzgta0) {
        new zzgbu();
        zzgkt zzgkt0 = zzgbt.zzf(((zzgkq)zzgta0).zze());
        zzgta zzgta1 = new zzgiw().zza().zza(((zzgkq)zzgta0).zzf());
        zzgkm zzgkm0 = zzgkn.zzc();
        zzgkm0.zza(zzgkt0);
        zzgkm0.zzb(((zzgmf)zzgta1));
        zzgkm0.zzc(0);
        return (zzgkn)zzgkm0.zzal();
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zzb(zzgqi zzgqi0) {
        return zzgkq.zzd(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("AES128_CTR_HMAC_SHA256", zzgbg.zzg(16, 16, 0x20, 16, 5, 1));
        hashMap0.put("AES128_CTR_HMAC_SHA256_RAW", zzgbg.zzg(16, 16, 0x20, 16, 5, 3));
        hashMap0.put("AES256_CTR_HMAC_SHA256", zzgbg.zzg(0x20, 16, 0x20, 0x20, 5, 1));
        hashMap0.put("AES256_CTR_HMAC_SHA256_RAW", zzgbg.zzg(0x20, 16, 0x20, 0x20, 5, 3));
        return Collections.unmodifiableMap(hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final void zzd(zzgta zzgta0) {
        ((zzgbt)new zzgbu().zza()).zze(((zzgkq)zzgta0).zze());
        new zzgiw().zza().zzd(((zzgkq)zzgta0).zzf());
        zzgpm.zza(((zzgkq)zzgta0).zze().zza());
    }
}

