package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzgek extends zzgfv {
    final zzgel zza;

    zzgek(zzgel zzgel0, Class class0) {
        this.zza = zzgel0;
        super(class0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zza(zzgta zzgta0) {
        zzgnq zzgnq0 = zzgnr.zzc();
        zzgnq0.zza(((zzgnu)zzgta0));
        zzgnq0.zzb(0);
        return (zzgnr)zzgnq0.zzal();
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zzb(zzgqi zzgqi0) {
        return zzgnu.zze(zzgqi0, zzgrc.zza());
    }

    // 去混淆评级： 中等(70)
    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final void zzd(zzgta zzgta0) {
        throw zzgei.zzb(((zzgnu)zzgta0).zza().zzh()) ? new GeneralSecurityException("invalid key format: missing KEK URI or DEK template") : new GeneralSecurityException("Unsupported DEK key type: " + ((zzgnu)zzgta0).zza().zzh() + ". Only Tink AEAD key types are supported.");
    }
}

