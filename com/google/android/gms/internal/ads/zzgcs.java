package com.google.android.gms.internal.ads;

public final class zzgcs extends zzgfw {
    zzgcs() {
        zzggv[] arr_zzggv = {new zzgcq(zzfzi.class)};
        super(zzgll.class, arr_zzggv);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgcr(this, zzglo.class);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgta zzc(zzgqi zzgqi0) {
        return zzgll.zze(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final void zze(zzgta zzgta0) {
        zzgpm.zzb(((zzgll)zzgta0).zza(), 0);
        zzgpm.zza(((zzgll)zzgta0).zzf().zzd());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final int zzf() {
        return 2;
    }

    static zzgfu zzg(int v, int v1) {
        zzgln zzgln0 = zzglo.zzd();
        zzgln0.zza(v);
        return new zzgfu(((zzglo)zzgln0.zzal()), v1);
    }
}

