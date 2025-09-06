package com.google.android.gms.internal.ads;

import java.util.Locale;

public final class zzea {
    public static final int zza;
    private static final byte[] zzb;
    private static final String[] zzc;

    static {
        zzea.zzb = new byte[]{0, 0, 0, 1};
        zzea.zzc = new String[]{"", "A", "B", "C"};
    }

    public static String zza(int v, int v1, int v2) {
        return String.format("avc1.%02X%02X%02X", v, v1, v2);
    }

    public static String zzb(int v, boolean z, int v1, int v2, int[] arr_v, int v3) {
        StringBuilder stringBuilder0 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", zzea.zzc[v], v1, v2, Character.valueOf(((char)(z ? 72 : 76))), v3));
        int v4;
        for(v4 = 6; v4 > 0 && arr_v[v4 - 1] == 0; --v4) {
        }
        for(int v5 = 0; v5 < v4; ++v5) {
            stringBuilder0.append(String.format(".%02X", ((int)arr_v[v5])));
        }
        return stringBuilder0.toString();
    }

    public static byte[] zzc(byte[] arr_b, int v, int v1) {
        byte[] arr_b1 = new byte[v1 + 4];
        System.arraycopy(zzea.zzb, 0, arr_b1, 0, 4);
        System.arraycopy(arr_b, v, arr_b1, 4, v1);
        return arr_b1;
    }
}

