package com.google.android.gms.internal.ads;

public final class zzaaf {
    public static final int zza;
    private static final int[] zzb;

    static {
        zzaaf.zzb = new int[]{2002, 2000, 0x780, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 0x800};
    }

    public static zzaae zza(zzfa zzfa0) {
        int v7;
        int v2;
        int v = zzfa0.zzd(16);
        int v1 = zzfa0.zzd(16);
        if(v1 == 0xFFFF) {
            v1 = zzfa0.zzd(24);
            v2 = 7;
        }
        else {
            v2 = 4;
        }
        int v3 = v == 44097 ? v1 + v2 + 2 : v1 + v2;
        int v4 = zzfa0.zzd(2);
        int v5 = 0;
        if(v4 == 3) {
            for(int v6 = 0; true; v6 = v7 + 1 << 2) {
                v7 = v6 + zzfa0.zzd(2);
                if(!zzfa0.zzn()) {
                    break;
                }
            }
            v4 = v7 + 3;
        }
        int v8 = zzfa0.zzd(10);
        if(zzfa0.zzn() && zzfa0.zzd(3) > 0) {
            zzfa0.zzl(2);
        }
        int v9 = zzfa0.zzn() ? 48000 : 44100;
        int v10 = zzfa0.zzd(4);
        if(v9 == 44100 && v10 == 13) {
            return new zzaae(v4, 2, v9, v3, zzaaf.zzb[13], null);
        }
        if(v9 == 48000 && v10 < 14) {
            v5 = zzaaf.zzb[v10];
            if(v8 % 5 != 1) {
                switch(v8 % 5) {
                    case 2: {
                        return v10 != 8 && v10 != 11 ? new zzaae(v4, 2, v9, v3, v5, null) : new zzaae(v4, 2, v9, v3, v5 + 1, null);
                    }
                    case 3: {
                        break;
                    }
                    case 4: {
                        return v10 != 3 && v10 != 8 && v10 != 11 ? new zzaae(v4, 2, v9, v3, v5, null) : new zzaae(v4, 2, v9, v3, v5 + 1, null);
                    }
                    default: {
                        return new zzaae(v4, 2, v9, v3, v5, null);
                    }
                }
            }
            if(v10 == 3 || v10 == 8) {
                ++v5;
            }
        }
        return new zzaae(v4, 2, v9, v3, v5, null);
    }

    public static void zzb(int v, zzfb zzfb0) {
        zzfb0.zzD(7);
        byte[] arr_b = zzfb0.zzI();
        arr_b[0] = -84;
        arr_b[1] = 0x40;
        arr_b[2] = -1;
        arr_b[3] = -1;
        arr_b[4] = (byte)(v >> 16 & 0xFF);
        arr_b[5] = (byte)(v >> 8 & 0xFF);
        arr_b[6] = (byte)(v & 0xFF);
    }
}

