package com.google.android.gms.internal.ads;

public final class zzaao {
    public static void zza(long v, zzfb zzfb0, zzace[] arr_zzace) {
        int v9;
        int v6;
        while(zzfb0.zza() > 1) {
            int v1 = zzaao.zzc(zzfb0);
            int v2 = zzaao.zzc(zzfb0);
            int v3 = zzfb0.zzc() + v2;
            if(v2 == -1 || v2 > zzfb0.zza()) {
                zzes.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                v3 = zzfb0.zzd();
            }
            else if(v1 == 4 && v2 >= 8) {
                int v4 = zzfb0.zzl();
                int v5 = zzfb0.zzp();
                if(v5 == 49) {
                    v6 = zzfb0.zzf();
                    v5 = 49;
                }
                else {
                    v6 = 0;
                }
                int v7 = zzfb0.zzl();
                if(v5 == 0x2F) {
                    zzfb0.zzH(1);
                    v5 = 0x2F;
                }
                int v8 = v4 != 0xB5 || v5 != 0x2F && v5 != 49 || v7 != 3 ? 0 : 1;
                if(v5 == 49) {
                    if(v6 != 1195456820) {
                        v9 = 0;
                    }
                    v8 &= v9;
                }
                if(v8 != 0) {
                    zzaao.zzb(v, zzfb0, arr_zzace);
                }
            }
            v9 = 1;
            zzfb0.zzG(v3);
        }
    }

    public static void zzb(long v, zzfb zzfb0, zzace[] arr_zzace) {
        int v1 = zzfb0.zzl();
        if((v1 & 0x40) != 0) {
            zzfb0.zzH(1);
            int v2 = zzfb0.zzc();
            for(int v3 = 0; v3 < arr_zzace.length; ++v3) {
                int v4 = (v1 & 0x1F) * 3;
                zzace zzace0 = arr_zzace[v3];
                zzfb0.zzG(v2);
                zzace0.zzq(zzfb0, v4);
                if(v != 0x8000000000000001L) {
                    zzace0.zzs(v, 1, v4, 0, null);
                }
            }
        }
    }

    private static int zzc(zzfb zzfb0) {
        int v = 0;
        do {
            if(zzfb0.zza() == 0) {
                return -1;
            }
            int v1 = zzfb0.zzl();
            v += v1;
        }
        while(v1 == 0xFF);
        return v;
    }
}

