package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

final class zzcej implements zzgi {
    private final zzgi zza;
    private final long zzb;
    private final zzgi zzc;
    private long zzd;
    private Uri zze;

    zzcej(zzgi zzgi0, int v, zzgi zzgi1) {
        this.zza = zzgi0;
        this.zzb = (long)v;
        this.zzc = zzgi1;
    }

    @Override  // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] arr_b, int v, int v1) {
        int v6;
        long v2 = this.zzd;
        long v3 = this.zzb;
        if(v2 < v3) {
            int v4 = this.zza.zza(arr_b, v, ((int)Math.min(v1, v3 - v2)));
            long v5 = this.zzd + ((long)v4);
            this.zzd = v5;
            v6 = v4;
            v2 = v5;
        }
        else {
            v6 = 0;
        }
        if(v2 >= this.zzb) {
            int v7 = this.zzc.zza(arr_b, v + v6, v1 - v6);
            v6 += v7;
            this.zzd += (long)v7;
        }
        return v6;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgn0) {
        this.zze = zzgn0.zza;
        zzgn zzgn1 = null;
        zzgn zzgn2 = Long.compare(zzgn0.zzf, this.zzb) < 0 ? new zzgn(zzgn0.zza, null, zzgn0.zzf, zzgn0.zzf, (zzgn0.zzg == -1L ? this.zzb - zzgn0.zzf : Math.min(zzgn0.zzg, this.zzb - zzgn0.zzf)), null, 0) : null;
        if(zzgn0.zzg == -1L || zzgn0.zzf + zzgn0.zzg > this.zzb) {
            long v = Math.max(this.zzb, zzgn0.zzf);
            zzgn1 = new zzgn(zzgn0.zza, null, v, v, (zzgn0.zzg == -1L ? -1L : Math.min(zzgn0.zzg, zzgn0.zzf + zzgn0.zzg - this.zzb)), null, 0);
        }
        long v1 = 0L;
        long v2 = zzgn2 == null ? 0L : this.zza.zzb(zzgn2);
        if(zzgn1 != null) {
            v1 = this.zzc.zzb(zzgn1);
        }
        this.zzd = zzgn0.zzf;
        return v2 == -1L || v1 == -1L ? -1L : v2 + v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Map zze() {
        return zzfug.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzf(zzhk zzhk0) {
    }
}

