package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzabr {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;
    public final String zzg;

    private zzabr(List list0, int v, int v1, int v2, int v3, int v4, int v5, float f, String s) {
        this.zza = list0;
        this.zzb = v;
        this.zzc = v3;
        this.zzd = v4;
        this.zze = v5;
        this.zzf = f;
        this.zzg = s;
    }

    public static zzabr zza(zzfb zzfb0) {
        int v20;
        int v19;
        try {
            zzfb0.zzH(21);
            int v = zzfb0.zzl();
            int v1 = zzfb0.zzl();
            int v2 = zzfb0.zzc();
            int v4 = 0;
            for(int v3 = 0; v3 < v1; ++v3) {
                zzfb0.zzH(1);
                int v5 = zzfb0.zzp();
                for(int v6 = 0; v6 < v5; ++v6) {
                    int v7 = zzfb0.zzp();
                    v4 += v7 + 4;
                    zzfb0.zzH(v7);
                }
            }
            zzfb0.zzG(v2);
            byte[] arr_b = new byte[v4];
            int v8 = -1;
            int v9 = -1;
            int v10 = -1;
            int v11 = -1;
            int v12 = -1;
            String s = null;
            float f = 1.0f;
            int v14 = 0;
            for(int v13 = 0; v13 < v1; ++v13) {
                int v15 = zzfb0.zzl() & 0x3F;
                int v16 = zzfb0.zzp();
                int v17 = 0;
                while(v17 < v16) {
                    int v18 = zzfb0.zzp();
                    System.arraycopy(zzfy.zza, 0, arr_b, v14, 4);
                    System.arraycopy(zzfb0.zzI(), zzfb0.zzc(), arr_b, v14 + 4, v18);
                    if(v15 != 33 || v17 != 0) {
                        v19 = v15;
                        v20 = v16;
                    }
                    else {
                        zzfv zzfv0 = zzfy.zzc(arr_b, v14 + 6, v14 + 4 + v18);
                        v8 = zzfv0.zzg;
                        v9 = zzfv0.zzh;
                        v10 = zzfv0.zzj;
                        v11 = zzfv0.zzk;
                        v12 = zzfv0.zzl;
                        v19 = 33;
                        v20 = v16;
                        f = zzfv0.zzi;
                        s = zzea.zzb(zzfv0.zza, zzfv0.zzb, zzfv0.zzc, zzfv0.zzd, zzfv0.zze, zzfv0.zzf);
                        v17 = 0;
                    }
                    v14 = v14 + 4 + v18;
                    zzfb0.zzH(v18);
                    ++v17;
                    v15 = v19;
                    v16 = v20;
                }
            }
            return new zzabr((v4 == 0 ? Collections.emptyList() : Collections.singletonList(arr_b)), (v & 3) + 1, v8, v9, v10, v11, v12, f, s);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
        }
        throw zzcd.zza("Error parsing HEVC config", arrayIndexOutOfBoundsException0);
    }
}

