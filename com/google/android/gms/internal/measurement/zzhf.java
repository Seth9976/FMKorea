package com.google.android.gms.internal.measurement;

import java.io.IOException;

public abstract class zzhf implements zzkm {
    @Override
    public Object clone() {
        return this.zzy();
    }

    private final String zza(String s) [...] // 潜在的解密器

    public abstract zzhf zza(zzib arg1, zzik arg2);

    public zzhf zza(byte[] arr_b, int v, int v1) {
        try {
            zzib zzib0 = zzib.zza(arr_b, 0, v1, false);
            this.zzb(zzib0, zzik.zza);
            zzib0.zzb(0);
            return this;
        }
        catch(zzji zzji0) {
            throw zzji0;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading com.google.android.gms.internal.measurement.zzhf from a byte array threw an IOException (should never happen).", iOException0);
        }
    }

    public zzhf zza(byte[] arr_b, int v, int v1, zzik zzik0) {
        try {
            zzib zzib0 = zzib.zza(arr_b, 0, v1, false);
            this.zzb(zzib0, zzik0);
            zzib0.zzb(0);
            return this;
        }
        catch(zzji zzji0) {
            throw zzji0;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading com.google.android.gms.internal.measurement.zzhf from a byte array threw an IOException (should never happen).", iOException0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzkm
    public final zzkm zza(byte[] arr_b) {
        return this.zza(arr_b, 0, arr_b.length);
    }

    @Override  // com.google.android.gms.internal.measurement.zzkm
    public final zzkm zza(byte[] arr_b, zzik zzik0) {
        return this.zza(arr_b, 0, arr_b.length, zzik0);
    }

    public zzkm zzb(zzib zzib0, zzik zzik0) {
        return this.zza(zzib0, zzik0);
    }

    public abstract zzhf zzy();
}

