package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzgoo implements zzfzi {
    private final zzgpg zza;
    private final zzgag zzb;
    private final int zzc;

    public zzgoo(zzgpg zzgpg0, zzgag zzgag0, int v) {
        this.zza = zzgpg0;
        this.zzb = zzgag0;
        this.zzc = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzfzi
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) {
        int v = this.zzc;
        if(arr_b.length < v) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b2 = Arrays.copyOfRange(arr_b, 0, arr_b.length - v);
        byte[] arr_b3 = Arrays.copyOfRange(arr_b, arr_b.length - this.zzc, arr_b.length);
        if(arr_b1 == null) {
            arr_b1 = new byte[0];
        }
        byte[] arr_b4 = zzgom.zzb(new byte[][]{arr_b1, arr_b2, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long)arr_b1.length) * 8L).array(), 8)});
        this.zzb.zza(arr_b3, arr_b4);
        return this.zza.zza(arr_b2);
    }
}

