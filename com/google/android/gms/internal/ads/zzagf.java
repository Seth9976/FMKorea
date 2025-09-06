package com.google.android.gms.internal.ads;

final class zzagf implements zzage {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzagf(long[] arr_v, long[] arr_v1, long v, long v1) {
        this.zza = arr_v;
        this.zzb = arr_v1;
        this.zzc = v;
        this.zzd = v1;
    }

    public static zzagf zza(long v, long v1, zzabu zzabu0, zzfb zzfb0) {
        int v10;
        zzfb0.zzH(10);
        int v2 = zzfb0.zzf();
        if(v2 <= 0) {
            return null;
        }
        long v3 = zzfk.zzq(v2, ((long)(zzabu0.zzd < 32000 ? 0x240 : 0x480)) * 1000000L, zzabu0.zzd);
        int v4 = zzfb0.zzp();
        int v5 = zzfb0.zzp();
        int v6 = zzfb0.zzp();
        zzfb0.zzH(2);
        long v7 = v1 + ((long)zzabu0.zzc);
        long[] arr_v = new long[v4];
        long[] arr_v1 = new long[v4];
        long v9 = v1;
        for(int v8 = 0; v8 < v4; ++v8) {
            arr_v[v8] = ((long)v8) * v3 / ((long)v4);
            arr_v1[v8] = Math.max(v9, v7);
            switch(v6) {
                case 1: {
                    v10 = zzfb0.zzl();
                    break;
                }
                case 2: {
                    v10 = zzfb0.zzp();
                    break;
                }
                case 3: {
                    v10 = zzfb0.zzn();
                    break;
                }
                case 4: {
                    v10 = zzfb0.zzo();
                    break;
                }
                default: {
                    return null;
                }
            }
            v9 += ((long)v10) * ((long)v5);
        }
        if(v != -1L && v != v9) {
            zzes.zzf("VbriSeeker", "VBRI data size mismatch: " + v + ", " + v9);
        }
        return new zzagf(arr_v, arr_v1, v3, v9);
    }

    @Override  // com.google.android.gms.internal.ads.zzage
    public final long zzb() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzage
    public final long zzc(long v) {
        return this.zza[zzfk.zzc(this.zzb, v, true, true)];
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long v) {
        int v1 = zzfk.zzc(this.zza, v, true, true);
        zzacb zzacb0 = new zzacb(this.zza[v1], this.zzb[v1]);
        if(zzacb0.zzb < v) {
            return v1 == this.zza.length - 1 ? new zzaby(zzacb0, zzacb0) : new zzaby(zzacb0, new zzacb(this.zza[v1 + 1], this.zzb[v1 + 1]));
        }
        return new zzaby(zzacb0, zzacb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}

