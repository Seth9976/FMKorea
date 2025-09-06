package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzabl {
    public static zzbz zza(zzabc zzabc0, boolean z) {
        zzbz zzbz0 = new zzabs().zza(zzabc0, (z ? null : zzaer.zza));
        return zzbz0 == null || zzbz0.zza() == 0 ? null : zzbz0;
    }

    public static zzabn zzb(zzfb zzfb0) {
        zzfb0.zzH(1);
        int v = zzfb0.zzn();
        long v1 = (long)zzfb0.zzc();
        long[] arr_v = new long[v / 18];
        long[] arr_v1 = new long[v / 18];
        for(int v2 = 0; v2 < v / 18; ++v2) {
            long v3 = zzfb0.zzs();
            if(v3 == -1L) {
                arr_v = Arrays.copyOf(arr_v, v2);
                arr_v1 = Arrays.copyOf(arr_v1, v2);
                break;
            }
            arr_v[v2] = v3;
            arr_v1[v2] = zzfb0.zzs();
            zzfb0.zzH(2);
        }
        zzfb0.zzH(((int)(v1 + ((long)v) - ((long)zzfb0.zzc()))));
        return new zzabn(arr_v, arr_v1);
    }
}

