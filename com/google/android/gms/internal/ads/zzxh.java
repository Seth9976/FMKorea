package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzxh {
    private final String[] zza;
    private final int[] zzb;
    private final zzvs[] zzc;
    private final int[] zzd;
    private final int[][][] zze;
    private final zzvs zzf;

    zzxh(String[] arr_s, int[] arr_v, zzvs[] arr_zzvs, int[] arr_v1, int[][][] arr3_v, zzvs zzvs0) {
        this.zza = arr_s;
        this.zzb = arr_v;
        this.zzc = arr_zzvs;
        this.zze = arr3_v;
        this.zzd = arr_v1;
        this.zzf = zzvs0;
    }

    public final int zza(int v, int v1, boolean z) {
        this.zzc[v].zzb(v1);
        int[] arr_v = new int[1];
        int v2 = 0;
        int v3 = 0;
        for(int v4 = 0; v4 <= 0; ++v4) {
            if((this.zze[v][v1][v4] & 7) == 4) {
                arr_v[v3] = v4;
                ++v3;
            }
        }
        int[] arr_v1 = Arrays.copyOf(arr_v, v3);
        String s = null;
        int v5 = 16;
        int v6 = 0;
        for(int v7 = 0; v2 < arr_v1.length; ++v7) {
            int v8 = arr_v1[v2];
            String s1 = this.zzc[v].zzb(v1).zzb(v8).zzm;
            if(v7 == 0) {
                s = s1;
            }
            else {
                v6 |= !zzfk.zzD(s, s1);
            }
            v5 = Math.min(v5, this.zze[v][v1][v2] & 24);
            ++v2;
        }
        return v6 == 0 ? v5 : Math.min(v5, this.zzd[v]);
    }

    public final int zzb(int v, int v1, int v2) {
        return this.zze[v][v1][v2];
    }

    public final int zzc(int v) {
        return this.zzb[v];
    }

    public final zzvs zzd(int v) {
        return this.zzc[v];
    }

    public final zzvs zze() {
        return this.zzf;
    }
}

