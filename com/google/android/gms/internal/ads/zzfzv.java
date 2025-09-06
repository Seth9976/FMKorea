package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

public final class zzfzv {
    private final zzgmv zza;

    private zzfzv(zzgmv zzgmv0) {
        this.zza = zzgmv0;
    }

    public final zzgah zza() {
        zzgmv zzgmv0;
        byte[] arr_b = this.zzb().zzax();
        try {
            zzgmv0 = zzgmv.zze(arr_b, zzgrc.zza());
        }
        catch(IOException iOException0) {
            throw new GeneralSecurityException("Failed to parse proto", iOException0);
        }
        zzggi zzggi0 = zzggi.zzc();
        zzghd zzghd0 = zzghd.zza(zzgmv0);
        return !zzggi0.zzi(zzghd0) ? new zzgfz(zzghd0) : zzggi0.zzb(zzghd0);
    }

    final zzgmv zzb() {
        try {
            return this.zza == null ? ((zzghd)zzggi.zzc().zzd(null, zzghd.class)).zzc() : this.zza;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new zzghp("Parsing parameters failed in getProto(). You probably want to call some Tink register function for null", generalSecurityException0);
        }
    }

    public static zzfzv zzc(String s, byte[] arr_b, int v) {
        zzgnw zzgnw0;
        zzgmu zzgmu0 = zzgmv.zza();
        zzgmu0.zzb(s);
        zzgmu0.zzc(zzgqi.zzv(arr_b, 0, arr_b.length));
        switch(v - 1) {
            case 0: {
                zzgnw0 = zzgnw.zzb;
                break;
            }
            case 1: {
                zzgnw0 = zzgnw.zzc;
                break;
            }
            default: {
                zzgnw0 = zzgnw.zzd;
            }
        }
        zzgmu0.zza(zzgnw0);
        return new zzfzv(((zzgmv)zzgmu0.zzal()));
    }
}

