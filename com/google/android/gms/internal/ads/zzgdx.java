package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgdx extends zzgfw {
    zzgdx() {
        zzggv[] arr_zzggv = {new zzgdv(zzfzi.class)};
        super(zzglx.class, arr_zzggv);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgdw(this, zzgma.class);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgta zzc(zzgqi zzgqi0) {
        return zzglx.zze(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final void zze(zzgta zzgta0) {
        zzgpm.zzb(((zzglx)zzgta0).zza(), 0);
        if(((zzglx)zzgta0).zzf().zzd() != 0x20) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}

