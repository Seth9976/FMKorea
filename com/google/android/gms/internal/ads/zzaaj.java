package com.google.android.gms.internal.ads;

public final class zzaaj {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    protected zzaaj(long v, long v1, long v2, long v3, long v4, long v5, long v6) {
        this.zza = v;
        this.zzb = v1;
        this.zzd = 0L;
        this.zze = v3;
        this.zzf = v4;
        this.zzg = v5;
        this.zzc = v6;
        this.zzh = zzaaj.zzf(v1, 0L, v3, v4, v5, v6);
    }

    protected static long zzf(long v, long v1, long v2, long v3, long v4, long v5) {
        if(v3 + 1L < v4 && v1 + 1L < v2) {
            long v6 = (long)(((float)(v - v1)) * (((float)(v4 - v3)) / ((float)(v2 - v1))));
            return Math.max(v3, Math.min(v3 + v6 - v5 - v6 / 20L, v4 - 1L));
        }
        return v3;
    }

    static void zzg(zzaaj zzaaj0, long v, long v1) {
        zzaaj0.zze = v;
        zzaaj0.zzg = v1;
        zzaaj0.zzi();
    }

    static void zzh(zzaaj zzaaj0, long v, long v1) {
        zzaaj0.zzd = v;
        zzaaj0.zzf = v1;
        zzaaj0.zzi();
    }

    private final void zzi() {
        this.zzh = zzaaj.zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}

