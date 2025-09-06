package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzghy extends zzgfv {
    zzghy(zzghz zzghz0, Class class0) {
        super(class0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zza(zzgta zzgta0) {
        zzgkd zzgkd0 = zzgke.zzc();
        zzgkd0.zzc(0);
        byte[] arr_b = zzghf.zzb(((zzgkh)zzgta0).zza());
        zzgkd0.zza(zzgqi.zzv(arr_b, 0, arr_b.length));
        zzgkd0.zzb(((zzgkh)zzgta0).zzf());
        return (zzgke)zzgkd0.zzal();
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zzb(zzgqi zzgqi0) {
        return zzgkh.zze(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() {
        HashMap hashMap0 = new HashMap();
        zzgkg zzgkg0 = zzgkh.zzc();
        zzgkg0.zza(0x20);
        zzgkj zzgkj0 = zzgkk.zzc();
        zzgkj0.zza(16);
        zzgkg0.zzb(((zzgkk)zzgkj0.zzal()));
        hashMap0.put("AES_CMAC", new zzgfu(((zzgkh)zzgkg0.zzal()), 1));
        zzgkg zzgkg1 = zzgkh.zzc();
        zzgkg1.zza(0x20);
        zzgkj zzgkj1 = zzgkk.zzc();
        zzgkj1.zza(16);
        zzgkg1.zzb(((zzgkk)zzgkj1.zzal()));
        hashMap0.put("AES256_CMAC", new zzgfu(((zzgkh)zzgkg1.zzal()), 1));
        zzgkg zzgkg2 = zzgkh.zzc();
        zzgkg2.zza(0x20);
        zzgkj zzgkj2 = zzgkk.zzc();
        zzgkj2.zza(16);
        zzgkg2.zzb(((zzgkk)zzgkj2.zzal()));
        hashMap0.put("AES256_CMAC_RAW", new zzgfu(((zzgkh)zzgkg2.zzal()), 3));
        return Collections.unmodifiableMap(hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final void zzd(zzgta zzgta0) {
        zzghz.zzn(((zzgkh)zzgta0).zzf());
        zzghz.zzo(((zzgkh)zzgta0).zza());
    }
}

