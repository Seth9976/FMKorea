package com.google.android.gms.internal.ads;

final class zzgtg {
    private static final zzgtf zza;
    private static final zzgtf zzb;

    static {
        zzgtf zzgtf0 = null;
        try {
            zzgtf0 = (zzgtf)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
        }
        zzgtg.zza = zzgtf0;
        zzgtg.zzb = new zzgtf();
    }

    static zzgtf zza() {
        return zzgtg.zza;
    }

    static zzgtf zzb() {
        return zzgtg.zzb;
    }
}

