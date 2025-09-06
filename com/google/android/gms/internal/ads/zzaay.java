package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzaay {
    public static final int zza;
    private static final int[] zzb;
    private static final int[] zzc;
    private static final int[] zzd;

    static {
        zzaay.zzb = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        zzaay.zzc = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        zzaay.zzd = new int[]{0x40, 0x70, 0x80, 0xC0, 0xE0, 0x100, 0x180, 0x1C0, 0x200, 640, 0x300, 0x380, 0x400, 0x480, 0x500, 0x600, 0x780, 0x800, 0x900, 0xA00, 0xA80, 0xB00, 0xB07, 0xB80, 0xC00, 0xF00, 0x1000, 0x1800, 0x1E00};
    }

    public static zzam zza(byte[] arr_b, String s, String s1, zzad zzad0) {
        zzfa zzfa0;
        int v = 0;
        int v1 = -1;
        if(arr_b[0] == 0x7F) {
            zzfa0 = new zzfa(arr_b, arr_b.length);
        }
        else {
            byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
            switch(arr_b1[0]) {
                case -2: 
                case -1: {
                    for(int v2 = 0; v2 < arr_b1.length - 1; v2 += 2) {
                        byte b = arr_b1[v2];
                        arr_b1[v2] = arr_b1[v2 + 1];
                        arr_b1[v2 + 1] = b;
                    }
                }
            }
            zzfa0 = new zzfa(arr_b1, arr_b1.length);
            if(arr_b1[0] == 0x1F) {
                zzfa zzfa1 = new zzfa(arr_b1, arr_b1.length);
                while(zzfa1.zza() >= 16) {
                    zzfa1.zzl(2);
                    zzfa0.zzf(zzfa1.zzd(14), 14);
                }
            }
            zzfa0.zzi(arr_b1, arr_b1.length);
        }
        zzfa0.zzl(60);
        int v3 = zzaay.zzb[zzfa0.zzd(6)];
        int v4 = zzaay.zzc[zzfa0.zzd(4)];
        int v5 = zzfa0.zzd(5);
        if(v5 < 29) {
            v1 = zzaay.zzd[v5] * 1000 / 2;
        }
        zzfa0.zzl(10);
        if(zzfa0.zzd(2) > 0) {
            v = 1;
        }
        zzak zzak0 = new zzak();
        zzak0.zzH(s);
        zzak0.zzS("audio/vnd.dts");
        zzak0.zzv(v1);
        zzak0.zzw(v3 + v);
        zzak0.zzT(v4);
        zzak0.zzB(null);
        zzak0.zzK(s1);
        return zzak0.zzY();
    }
}

