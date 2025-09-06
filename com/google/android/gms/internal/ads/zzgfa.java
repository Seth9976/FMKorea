package com.google.android.gms.internal.ads;

public final class zzgfa extends zzgfb {
    public zzgfa(byte[] arr_b, int v) {
        super(arr_b, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfb
    public final int zza() {
        return 12;
    }

    @Override  // com.google.android.gms.internal.ads.zzgfb
    public final int[] zzb(int[] arr_v, int v) {
        if(arr_v.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", ((int)(arr_v.length * 0x20))));
        }
        int[] arr_v1 = new int[16];
        zzgex.zzb(arr_v1, this.zza);
        arr_v1[12] = v;
        System.arraycopy(arr_v, 0, arr_v1, 13, 3);
        return arr_v1;
    }
}

