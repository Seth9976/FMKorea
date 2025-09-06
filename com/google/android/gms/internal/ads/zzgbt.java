package com.google.android.gms.internal.ads;

final class zzgbt extends zzgfv {
    final zzgbu zza;

    zzgbt(zzgbu zzgbu0, Class class0) {
        this.zza = zzgbu0;
        super(class0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zza(zzgta zzgta0) {
        return zzgbt.zzf(((zzgkw)zzgta0));
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zzb(zzgqi zzgqi0) {
        return zzgkw.zzf(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final void zzd(zzgta zzgta0) {
        this.zze(((zzgkw)zzgta0));
    }

    public final void zze(zzgkw zzgkw0) {
        zzgpm.zza(zzgkw0.zza());
        zzgkz zzgkz0 = zzgkw0.zzg();
        zzgbu.zzg(this.zza, zzgkz0);
    }

    public static final zzgkt zzf(zzgkw zzgkw0) {
        zzgks zzgks0 = zzgkt.zzc();
        zzgks0.zzb(zzgkw0.zzg());
        byte[] arr_b = zzghf.zzb(zzgkw0.zza());
        zzgks0.zza(zzgqi.zzv(arr_b, 0, arr_b.length));
        zzgks0.zzc(0);
        return (zzgkt)zzgks0.zzal();
    }
}

