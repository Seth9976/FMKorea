package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgfe extends zzgfb {
    public zzgfe(byte[] arr_b, int v) {
        super(arr_b, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfb
    final int zza() {
        return 24;
    }

    @Override  // com.google.android.gms.internal.ads.zzgfb
    final int[] zzb(int[] arr_v, int v) {
        if(arr_v.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", ((int)(arr_v.length * 0x20))));
        }
        int[] arr_v1 = new int[16];
        int[] arr_v2 = new int[16];
        zzgex.zzb(arr_v2, this.zza);
        arr_v2[12] = arr_v[0];
        arr_v2[13] = arr_v[1];
        arr_v2[14] = arr_v[2];
        arr_v2[15] = arr_v[3];
        zzgex.zzc(arr_v2);
        arr_v2[4] = arr_v2[12];
        arr_v2[5] = arr_v2[13];
        arr_v2[6] = arr_v2[14];
        arr_v2[7] = arr_v2[15];
        zzgex.zzb(arr_v1, Arrays.copyOf(arr_v2, 8));
        arr_v1[12] = v;
        arr_v1[13] = 0;
        arr_v1[14] = arr_v[4];
        arr_v1[15] = arr_v[5];
        return arr_v1;
    }
}

