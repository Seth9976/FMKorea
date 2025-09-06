package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public final class zzfwg {
    private static final OutputStream zza;

    static {
        zzfwg.zza = new zzfwf();
    }

    public static byte[] zza(InputStream inputStream0) {
        inputStream0.getClass();
        ArrayDeque arrayDeque0 = new ArrayDeque(20);
        int v1 = 0;
        for(int v = 0x80; v1 < 0x7FFFFFF7; v = zzfwl.zzc(((long)v) * ((long)(v >= 0x1000 ? 2 : 4)))) {
            int v2 = Math.min(v, 0x7FFFFFF7 - v1);
            byte[] arr_b = new byte[v2];
            arrayDeque0.add(arr_b);
            int v3 = 0;
            while(v3 < v2) {
                int v4 = inputStream0.read(arr_b, v3, v2 - v3);
                if(v4 == -1) {
                    return zzfwg.zzb(arrayDeque0, v1);
                }
                v3 += v4;
                v1 += v4;
            }
        }
        if(inputStream0.read() != -1) {
            throw new OutOfMemoryError("input is too large to fit in a byte array");
        }
        return zzfwg.zzb(arrayDeque0, 0x7FFFFFF7);
    }

    private static byte[] zzb(Queue queue0, int v) {
        if(queue0.isEmpty()) {
            return new byte[0];
        }
        byte[] arr_b = (byte[])queue0.remove();
        if(arr_b.length == v) {
            return arr_b;
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, v);
        for(int v1 = v - arr_b.length; v1 > 0; v1 -= v2) {
            byte[] arr_b2 = (byte[])queue0.remove();
            int v2 = Math.min(v1, arr_b2.length);
            System.arraycopy(arr_b2, 0, arr_b1, v - v1, v2);
        }
        return arr_b1;
    }
}

