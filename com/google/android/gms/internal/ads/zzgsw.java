package com.google.android.gms.internal.ads;

final class zzgsw {
    private static final zzgsv zza;
    private static final zzgsv zzb;

    static {
        zzgsv zzgsv0 = null;
        try {
            zzgsv0 = (zzgsv)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
        }
        zzgsw.zza = zzgsv0;
        zzgsw.zzb = new zzgsv();
    }

    static zzgsv zza() {
        return zzgsw.zza;
    }

    static zzgsv zzb() {
        return zzgsw.zzb;
    }
}

