package com.google.android.gms.internal.ads;

public final class zzgbg extends zzgfw {
    zzgbg() {
        zzggv[] arr_zzggv = {new zzgbe(zzfzi.class)};
        super(zzgkn.class, arr_zzggv);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgbf(this, zzgkq.class);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgta zzc(zzgqi zzgqi0) {
        return zzgkn.zze(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final void zze(zzgta zzgta0) {
        zzgpm.zzb(((zzgkn)zzgta0).zza(), 0);
        new zzgbu();
        zzgbu.zzh(((zzgkn)zzgta0).zzf());
        new zzgiw();
        zzgiw.zzm(((zzgkn)zzgta0).zzg());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final int zzf() {
        return 2;
    }

    static zzgfu zzg(int v, int v1, int v2, int v3, int v4, int v5) {
        zzgkv zzgkv0 = zzgkw.zzc();
        zzgky zzgky0 = zzgkz.zzc();
        zzgky0.zza(16);
        zzgkv0.zzb(((zzgkz)zzgky0.zzal()));
        zzgkv0.zza(v);
        zzgkw zzgkw0 = (zzgkw)zzgkv0.zzal();
        zzgmh zzgmh0 = zzgmi.zzd();
        zzgmk zzgmk0 = zzgml.zzc();
        zzgmk0.zzb(5);
        zzgmk0.zza(v3);
        zzgmh0.zzb(((zzgml)zzgmk0.zzal()));
        zzgmh0.zza(0x20);
        zzgmi zzgmi0 = (zzgmi)zzgmh0.zzal();
        zzgkp zzgkp0 = zzgkq.zza();
        zzgkp0.zza(zzgkw0);
        zzgkp0.zzb(zzgmi0);
        return new zzgfu(((zzgkq)zzgkp0.zzal()), v5);
    }
}

