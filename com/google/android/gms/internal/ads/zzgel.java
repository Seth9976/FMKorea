package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgel extends zzgfw {
    zzgel() {
        zzggv[] arr_zzggv = {new zzgej(zzfzi.class)};
        super(zzgnr.class, arr_zzggv);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgek(this, zzgnu.class);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgta zzc(zzgqi zzgqi0) {
        return zzgnr.zze(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final void zze(zzgta zzgta0) {
        zzgpm.zzb(((zzgnr)zzgta0).zza(), 0);
        if(!zzgei.zzb(((zzgnr)zzgta0).zzf().zza().zzh())) {
            throw new GeneralSecurityException("Unsupported DEK key type: " + ((zzgnr)zzgta0).zzf().zza().zzh() + ". Only Tink AEAD key types are supported.");
        }
    }
}

