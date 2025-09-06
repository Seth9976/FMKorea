package com.google.android.gms.internal.ads;

final class zzwm implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzwm(zzam zzam0, int v) {
        this.zza = 1 == (zzam0.zze & 1);
        this.zzb = zzxd.zzn(v, false);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.zza(((zzwm)object0));
    }

    public final int zza(zzwm zzwm0) {
        return zzfts.zzj().zzd(this.zzb, zzwm0.zzb).zzd(this.zza, zzwm0.zza).zza();
    }
}

