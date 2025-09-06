package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

public final class zzghq {
    public static final Charset zza;

    static {
        zzghq.zza = Charset.forName("UTF-8");
    }

    public static final zzgpo zza(String s) {
        byte[] arr_b = new byte[s.length()];
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(v1 < 33 || v1 > 0x7E) {
                throw new zzghp("Not a printable ASCII character: " + ((char)v1));
            }
            arr_b[v] = (byte)v1;
        }
        return zzgpo.zzb(arr_b);
    }
}

