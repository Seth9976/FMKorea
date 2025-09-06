package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgcb extends zzgfw {
    zzgcb() {
        zzggv[] arr_zzggv = {new zzgbz(zzfzi.class)};
        super(zzglc.class, arr_zzggv);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgca(this, zzglf.class);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgta zzc(zzgqi zzgqi0) {
        return zzglc.zze(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final void zze(zzgta zzgta0) {
        zzgpm.zzb(((zzglc)zzgta0).zza(), 0);
        zzgpm.zza(((zzglc)zzgta0).zzg().zzd());
        switch(((zzglc)zzgta0).zzf().zza()) {
            case 12: 
            case 16: {
                return;
            }
            default: {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    static zzgfu zzg(int v, int v1, int v2) {
        zzgle zzgle0 = zzglf.zzc();
        zzgle0.zza(v);
        zzglh zzglh0 = zzgli.zzc();
        zzglh0.zza(16);
        zzgle0.zzb(((zzgli)zzglh0.zzal()));
        return new zzgfu(((zzglf)zzgle0.zzal()), v2);
    }
}

