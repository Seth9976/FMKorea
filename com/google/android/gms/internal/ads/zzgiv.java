package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzgiv extends zzgfv {
    final zzgiw zza;

    zzgiv(zzgiw zzgiw0, Class class0) {
        this.zza = zzgiw0;
        super(class0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zza(zzgta zzgta0) {
        zzgme zzgme0 = zzgmf.zzc();
        zzgme0.zzc(0);
        zzgme0.zzb(((zzgmi)zzgta0).zzh());
        byte[] arr_b = zzghf.zzb(((zzgmi)zzgta0).zza());
        zzgme0.zza(zzgqi.zzv(arr_b, 0, arr_b.length));
        return (zzgmf)zzgme0.zzal();
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zzb(zzgqi zzgqi0) {
        return zzgmi.zzg(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("HMAC_SHA256_128BITTAG", zzgiw.zzn(0x20, 16, 5, 1));
        hashMap0.put("HMAC_SHA256_128BITTAG_RAW", zzgiw.zzn(0x20, 16, 5, 3));
        hashMap0.put("HMAC_SHA256_256BITTAG", zzgiw.zzn(0x20, 0x20, 5, 1));
        hashMap0.put("HMAC_SHA256_256BITTAG_RAW", zzgiw.zzn(0x20, 0x20, 5, 3));
        hashMap0.put("HMAC_SHA512_128BITTAG", zzgiw.zzn(0x40, 16, 6, 1));
        hashMap0.put("HMAC_SHA512_128BITTAG_RAW", zzgiw.zzn(0x40, 16, 6, 3));
        hashMap0.put("HMAC_SHA512_256BITTAG", zzgiw.zzn(0x40, 0x20, 6, 1));
        hashMap0.put("HMAC_SHA512_256BITTAG_RAW", zzgiw.zzn(0x40, 0x20, 6, 3));
        hashMap0.put("HMAC_SHA512_512BITTAG", zzgiw.zzn(0x40, 0x40, 6, 1));
        hashMap0.put("HMAC_SHA512_512BITTAG_RAW", zzgiw.zzn(0x40, 0x40, 6, 3));
        return Collections.unmodifiableMap(hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final void zzd(zzgta zzgta0) {
        if(((zzgmi)zzgta0).zza() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzgiw.zzg(((zzgmi)zzgta0).zzh());
    }
}

