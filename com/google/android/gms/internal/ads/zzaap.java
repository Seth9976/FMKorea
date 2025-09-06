package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzaap implements zzaca {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaap(int[] arr_v, long[] arr_v1, long[] arr_v2, long[] arr_v3) {
        this.zzb = arr_v;
        this.zzc = arr_v1;
        this.zzd = arr_v2;
        this.zze = arr_v3;
        this.zza = arr_v.length;
        if(arr_v.length > 0) {
            this.zzf = arr_v2[arr_v.length - 1] + arr_v3[arr_v.length - 1];
            return;
        }
        this.zzf = 0L;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.zzb);
        String s1 = Arrays.toString(this.zzc);
        String s2 = Arrays.toString(this.zze);
        String s3 = Arrays.toString(this.zzd);
        return "ChunkIndex(length=" + this.zza + ", sizes=" + s + ", offsets=" + s1 + ", timeUs=" + s2 + ", durationsUs=" + s3 + ")";
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long v) {
        int v1 = zzfk.zzc(this.zze, v, true, true);
        zzacb zzacb0 = new zzacb(this.zze[v1], this.zzc[v1]);
        return zzacb0.zzb >= v || v1 == this.zza - 1 ? new zzaby(zzacb0, zzacb0) : new zzaby(zzacb0, new zzacb(this.zze[v1 + 1], this.zzc[v1 + 1]));
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}

