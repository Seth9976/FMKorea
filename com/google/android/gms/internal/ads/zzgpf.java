package com.google.android.gms.internal.ads;

public final class zzgpf {
    public static String zza(byte[] arr_b) {
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length + arr_b.length);
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            stringBuilder0.append("0123456789abcdef".charAt((v1 & 0xFF) >> 4));
            stringBuilder0.append("0123456789abcdef".charAt(v1 & 15));
        }
        return stringBuilder0.toString();
    }
}

