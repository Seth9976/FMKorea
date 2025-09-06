package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class zzabw {
    public static int zza(ByteBuffer byteBuffer0) {
        int v1;
        int v = 0;
        if((byteBuffer0.get(5) & 2) == 0) {
            v1 = 0;
        }
        else {
            int v2 = byteBuffer0.get(26);
            int v3 = 28;
            int v5 = 28;
            for(int v4 = 0; v4 < v2; ++v4) {
                v5 += byteBuffer0.get(v4 + 27);
            }
            int v6 = byteBuffer0.get(v5 + 26);
            for(int v7 = 0; v7 < v6; ++v7) {
                v3 += byteBuffer0.get(v5 + 27 + v7);
            }
            v1 = v5 + v3;
        }
        int v8 = byteBuffer0.get(v1 + 26) + 27 + v1;
        int v9 = byteBuffer0.get(v8);
        if(byteBuffer0.limit() - v8 > 1) {
            v = byteBuffer0.get(v8 + 1);
        }
        return (int)(zzabw.zze(((byte)v9), ((byte)v)) * 48000L / 1000000L);
    }

    public static int zzb(ByteBuffer byteBuffer0) {
        int v = 0;
        int v1 = byteBuffer0.get(0);
        if(byteBuffer0.limit() > 1) {
            v = byteBuffer0.get(1);
        }
        return (int)(zzabw.zze(((byte)v1), ((byte)v)) * 48000L / 1000000L);
    }

    public static long zzc(byte[] arr_b) {
        int v = 0;
        int v1 = arr_b[0];
        if(arr_b.length > 1) {
            v = arr_b[1];
        }
        return zzabw.zze(((byte)v1), ((byte)v));
    }

    public static List zzd(byte[] arr_b) {
        int v = arr_b[11] & 0xFF;
        int v1 = arr_b[10] & 0xFF;
        List list0 = new ArrayList(3);
        list0.add(arr_b);
        list0.add(zzabw.zzg(((long)(v << 8 | v1)) * 1000000000L / 48000L));
        list0.add(new byte[]{0, -76, -60, 4, 0, 0, 0, 0});
        return list0;
    }

    private static long zze(byte b, byte b1) {
        int v = 2;
        if((b & 3) == 0) {
            v = 1;
        }
        else if((b & 3) != 1 && (b & 3) != 2) {
            v = b1 & 0x3F;
        }
        int v1 = (b & 0xFF) >> 3;
        if(v1 >= 16) {
            return ((long)v) * ((long)(2500 << (v1 & 3)));
        }
        if(v1 >= 12) {
            return ((long)v) * ((long)(10000 << (v1 & 1)));
        }
        return (v1 & 3) == 3 ? ((long)v) * 60000L : ((long)v) * ((long)(10000 << (v1 & 3)));
    }

    private static long zzf(long v) [...] // Inlined contents

    private static byte[] zzg(long v) [...] // 潜在的解密器
}

