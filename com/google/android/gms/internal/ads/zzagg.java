package com.google.android.gms.internal.ads;

final class zzagg implements zzage {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzagg(long v, int v1, long v2, long v3, long[] arr_v) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzf = arr_v;
        this.zzd = v3;
        this.zze = v3 == -1L ? -1L : v + v3;
    }

    public static zzagg zza(long v, long v1, zzabu zzabu0, zzfb zzfb0) {
        int v2 = zzabu0.zzg;
        int v3 = zzabu0.zzd;
        int v4 = zzfb0.zzf();
        if((v4 & 1) == 1) {
            int v5 = zzfb0.zzo();
            if(v5 != 0) {
                long v6 = zzfk.zzq(v5, ((long)v2) * 1000000L, v3);
                if((v4 & 6) != 6) {
                    return new zzagg(v1, zzabu0.zzc, v6, -1L, null);
                }
                long v7 = zzfb0.zzt();
                long[] arr_v = new long[100];
                for(int v8 = 0; v8 < 100; ++v8) {
                    arr_v[v8] = (long)zzfb0.zzl();
                }
                if(v != -1L) {
                    long v9 = v1 + v7;
                    if(v != v9) {
                        zzes.zzf("XingSeeker", "XING data size mismatch: " + v + ", " + v9);
                    }
                }
                return new zzagg(v1, zzabu0.zzc, v6, v7, arr_v);
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzage
    public final long zzb() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzage
    public final long zzc(long v) {
        long v1 = v - this.zza;
        if(this.zzh() && v1 > ((long)this.zzb)) {
            zzdy.zzb(this.zzf);
            double f = ((double)v1) * 256.0 / ((double)this.zzd);
            int v2 = zzfk.zzc(this.zzf, ((long)f), true, true);
            long v3 = this.zzd(v2);
            long v4 = this.zzf[v2];
            long v5 = this.zzd(v2 + 1);
            long v6 = v2 == 99 ? 0x100L : this.zzf[v2 + 1];
            return v4 == v6 ? v3 + Math.round(0.0 * ((double)(v5 - v3))) : v3 + Math.round((f - ((double)v4)) / ((double)(v6 - v4)) * ((double)(v5 - v3)));
        }
        return 0L;
    }

    private final long zzd(int v) {
        return this.zzc * ((long)v) / 100L;
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long v) {
        if(!this.zzh()) {
            zzacb zzacb0 = new zzacb(0L, this.zza + ((long)this.zzb));
            return new zzaby(zzacb0, zzacb0);
        }
        long v1 = Math.max(0L, Math.min(v, this.zzc));
        double f = ((double)v1) * 100.0 / ((double)this.zzc);
        double f1 = 0.0;
        if(Double.compare(f, 0.0) > 0) {
            if(f >= 100.0) {
                f1 = 256.0;
            }
            else {
                zzdy.zzb(this.zzf);
                double f2 = (double)this.zzf[((int)f)];
                f1 = f2 + (f - ((double)(((int)f)))) * ((((int)f) == 99 ? 256.0 : ((double)this.zzf[((int)f) + 1])) - f2);
            }
        }
        zzacb zzacb1 = new zzacb(v1, this.zza + Math.max(this.zzb, Math.min(Math.round(f1 / 256.0 * ((double)this.zzd)), this.zzd - 1L)));
        return new zzaby(zzacb1, zzacb1);
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return this.zzf != null;
    }
}

