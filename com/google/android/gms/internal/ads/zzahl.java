package com.google.android.gms.internal.ads;

import java.math.BigInteger;

final class zzahl implements zzaca {
    final zzahm zza;

    zzahl(zzahm zzahm0, zzahk zzahk0) {
        this.zza = zzahm0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return zzahm.zzf(this.zza).zzf(zzahm.zzc(this.zza));
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long v) {
        long v1 = zzahm.zzf(this.zza).zzg(v);
        long v2 = zzahm.zzb(this.zza);
        long v3 = BigInteger.valueOf(v1).multiply(BigInteger.valueOf(zzahm.zza(this.zza) - zzahm.zzb(this.zza))).divide(BigInteger.valueOf(zzahm.zzc(this.zza))).longValue();
        zzacb zzacb0 = new zzacb(v, Math.max(zzahm.zzb(this.zza), Math.min(v2 + v3 - 30000L, zzahm.zza(this.zza) - 1L)));
        return new zzaby(zzacb0, zzacb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}

