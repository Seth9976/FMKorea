package com.google.android.gms.internal.measurement;

final class zzkt {
    private static final zzkr zza;
    private static final zzkr zzb;

    static {
        zzkt.zza = zzkt.zzc();
        zzkt.zzb = new zzku();
    }

    static zzkr zza() {
        return zzkt.zza;
    }

    static zzkr zzb() {
        return zzkt.zzb;
    }

    private static zzkr zzc() {
        try {
            return (zzkr)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

