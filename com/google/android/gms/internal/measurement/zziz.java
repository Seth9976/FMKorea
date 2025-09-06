package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zziz {
    static final Charset zza;
    public static final byte[] zzb;
    private static final Charset zzc;
    private static final Charset zzd;
    private static final ByteBuffer zze;
    private static final zzib zzf;

    static {
        zziz.zzc = Charset.forName("US-ASCII");
        zziz.zza = Charset.forName("UTF-8");
        zziz.zzd = Charset.forName("ISO-8859-1");
        byte[] arr_b = new byte[0];
        zziz.zzb = arr_b;
        zziz.zze = ByteBuffer.wrap(arr_b);
        zziz.zzf = zzib.zza(arr_b, 0, 0, false);
    }

    static int zza(int v, byte[] arr_b, int v1, int v2) {
        for(int v3 = v1; v3 < v1 + v2; ++v3) {
            v = v * 0x1F + arr_b[v3];
        }
        return v;
    }

    public static int zza(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    // 去混淆评级： 低(20)
    public static int zza(boolean z) {
        return z ? 0x4CF : 0x4D5;
    }

    public static int zza(byte[] arr_b) {
        int v = zziz.zza(arr_b.length, arr_b, 0, arr_b.length);
        return v == 0 ? 1 : v;
    }

    static Object zza(Object object0) {
        object0.getClass();
        return object0;
    }

    static Object zza(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }

    static boolean zza(zzkj zzkj0) {
        return false;
    }

    public static String zzb(byte[] arr_b) {
        return new String(arr_b, zziz.zza);
    }

    public static boolean zzc(byte[] arr_b) {
        return zzmh.zza(arr_b);
    }
}

