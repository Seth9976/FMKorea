package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzgpn implements zzfzi {
    private final zzgff zza;

    public zzgpn(byte[] arr_b) {
        this.zza = new zzgff(arr_b);
    }

    @Override  // com.google.android.gms.internal.ads.zzfzi
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) {
        if(arr_b.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b2 = Arrays.copyOf(arr_b, 24);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b, 24, arr_b.length - 24);
        return this.zza.zzb(byteBuffer0, arr_b2, arr_b1);
    }
}

