package com.google.android.gms.internal.ads;

import android.graphics.Point;
import java.util.List;

public final class zzwf implements zzwy {
    public final zzwr zza;
    public final int[] zzb;

    public zzwf(zzwr zzwr0, int[] arr_v) {
        this.zza = zzwr0;
        this.zzb = arr_v;
    }

    @Override  // com.google.android.gms.internal.ads.zzwy
    public final List zza(int v, zzcy zzcy0, int[] arr_v) {
        int v10;
        int v9;
        zzwr zzwr0 = this.zza;
        int v1 = this.zzb[v];
        int v2 = zzwr0.zzl;
        int v3 = zzwr0.zzm;
        boolean z = zzwr0.zzn;
        int v4 = 0x7FFFFFFF;
        if(v2 != 0x7FFFFFFF && v3 != 0x7FFFFFFF) {
            int v5 = 0x7FFFFFFF;
            for(int v6 = 0; v6 <= 0; ++v6) {
                zzam zzam0 = zzcy0.zzb(v6);
                int v7 = zzam0.zzr;
                if(v7 > 0) {
                    int v8 = zzam0.zzs;
                    if(v8 > 0) {
                        if(!z || (v7 > v8 ? 1 : 0) == (v2 > v3 ? 1 : 0)) {
                            v10 = v2;
                            v9 = v3;
                        }
                        else {
                            v9 = v2;
                            v10 = v3;
                        }
                        int v11 = v7 * v9;
                        int v12 = v8 * v10;
                        Point point0 = v11 < v12 ? new Point((v11 + v8 - 1) / v8, v9) : new Point(v10, (v12 + v7 - 1) / v7);
                        int v13 = zzam0.zzr * zzam0.zzs;
                        if(zzam0.zzr >= ((int)(((float)point0.x) * 0.98f)) && zzam0.zzs >= ((int)(((float)point0.y) * 0.98f)) && v13 < v5) {
                            v5 = v13;
                        }
                    }
                }
            }
            v4 = v5;
        }
        zzfua zzfua0 = new zzfua();
        for(int v14 = 0; v14 <= 0; ++v14) {
            int v15 = zzcy0.zzb(v14).zza();
            zzfua0.zzf(new zzxc(v, zzcy0, v14, zzwr0, arr_v[v14], v1, v4 == 0x7FFFFFFF || v15 != -1 && v15 <= v4));
        }
        return zzfua0.zzi();
    }
}

