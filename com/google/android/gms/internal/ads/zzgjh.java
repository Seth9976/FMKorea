package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;

final class zzgjh implements zzgag {
    private final zzgao zza;
    private final zzgju zzb;
    private final zzgju zzc;

    zzgjh(zzgao zzgao0, zzgjg zzgjg0) {
        zzgju zzgju0;
        this.zza = zzgao0;
        if(zzgao0.zzf()) {
            zzgjv zzgjv0 = zzggf.zza().zzb();
            zzgka zzgka0 = zzggc.zza(zzgao0);
            this.zzb = zzgjv0.zza(zzgka0, "mac", "compute");
            zzgju0 = zzgjv0.zza(zzgka0, "mac", "verify");
        }
        else {
            zzgju0 = zzggc.zza;
            this.zzb = zzgju0;
        }
        this.zzc = zzgju0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgag
    public final void zza(byte[] arr_b, byte[] arr_b1) {
        if(arr_b.length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] arr_b2 = Arrays.copyOf(arr_b, 5);
        byte[] arr_b3 = Arrays.copyOfRange(arr_b, 5, arr_b.length);
        for(Object object0: this.zza.zze(arr_b2)) {
            zzgak zzgak0 = (zzgak)object0;
            byte[] arr_b4 = zzgak0.zzc().equals(zzgnw.zzc) ? zzgom.zzb(new byte[][]{arr_b1, new byte[]{0}}) : arr_b1;
            try {
                ((zzgag)zzgak0.zze()).zza(arr_b3, arr_b4);
                return;
            }
            catch(GeneralSecurityException generalSecurityException0) {
                zzgji.zza.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: " + generalSecurityException0.toString());
            }
        }
        Iterator iterator1 = this.zza.zze(zzfzn.zza).iterator();
    label_14:
        if(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            zzgak zzgak1 = (zzgak)object1;
            try {
                ((zzgag)zzgak1.zze()).zza(arr_b, arr_b1);
                return;
            }
            catch(GeneralSecurityException unused_ex) {
                goto label_14;
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}

