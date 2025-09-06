package com.google.android.gms.internal.ads;

import android.util.Pair;

final class zzafz implements zzage {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzafz(long[] arr_v, long[] arr_v1, long v) {
        this.zza = arr_v;
        this.zzb = arr_v1;
        if(v == 0x8000000000000001L) {
            v = zzfk.zzp(arr_v1[arr_v1.length - 1]);
        }
        this.zzc = v;
    }

    public static zzafz zza(long v, zzaew zzaew0, long v1) {
        int v2 = zzaew0.zzd.length + 1;
        long[] arr_v = new long[v2];
        long[] arr_v1 = new long[v2];
        arr_v[0] = v;
        long v3 = 0L;
        arr_v1[0] = 0L;
        for(int v4 = 1; v4 <= zzaew0.zzd.length; ++v4) {
            v += (long)(zzaew0.zzb + zzaew0.zzd[v4 - 1]);
            v3 += (long)(zzaew0.zzc + zzaew0.zze[v4 - 1]);
            arr_v[v4] = v;
            arr_v1[v4] = v3;
        }
        return new zzafz(arr_v, arr_v1, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzage
    public final long zzb() {
        return -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzage
    public final long zzc(long v) {
        return zzfk.zzp(((long)(((Long)zzafz.zzd(v, this.zza, this.zzb).second))));
    }

    private static Pair zzd(long v, long[] arr_v, long[] arr_v1) {
        int v1 = zzfk.zzc(arr_v, v, true, true);
        long v2 = arr_v[v1];
        long v3 = arr_v1[v1];
        if(v1 + 1 == arr_v.length) {
            return Pair.create(v2, v3);
        }
        long v4 = arr_v[v1 + 1];
        long v5 = arr_v1[v1 + 1];
        return v4 == v2 ? Pair.create(v, ((long)(((long)(0.0 * ((double)(v5 - v3)))) + v3))) : Pair.create(v, ((long)(((long)((((double)v) - ((double)v2)) / ((double)(v4 - v2)) * ((double)(v5 - v3)))) + v3)));
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long v) {
        Pair pair0 = zzafz.zzd(zzfk.zzr(Math.max(0L, Math.min(v, this.zzc))), this.zzb, this.zza);
        zzacb zzacb0 = new zzacb(zzfk.zzp(((long)(((Long)pair0.first)))), ((long)(((Long)pair0.second))));
        return new zzaby(zzacb0, zzacb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}

