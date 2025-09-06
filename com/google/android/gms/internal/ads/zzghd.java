package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzghd implements zzghh {
    private final zzgpo zza;
    private final zzgmv zzb;

    private zzghd(zzgmv zzgmv0, zzgpo zzgpo0) {
        this.zzb = zzgmv0;
        this.zza = zzgpo0;
    }

    public static zzghd zza(zzgmv zzgmv0) {
        String s = zzgmv0.zzh();
        byte[] arr_b = new byte[s.length()];
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(v1 < 33 || v1 > 0x7E) {
                throw new GeneralSecurityException("Not a printable ASCII character: " + ((char)v1));
            }
            arr_b[v] = (byte)v1;
        }
        return new zzghd(zzgmv0, zzgpo.zzb(arr_b));
    }

    public static zzghd zzb(zzgmv zzgmv0) {
        return new zzghd(zzgmv0, zzghq.zza(zzgmv0.zzh()));
    }

    public final zzgmv zzc() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzghh
    public final zzgpo zzd() {
        return this.zza;
    }
}

