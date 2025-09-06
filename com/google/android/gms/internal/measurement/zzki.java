package com.google.android.gms.internal.measurement;

final class zzki {
    private static final zzkg zza;
    private static final zzkg zzb;

    static {
        zzki.zza = zzki.zzc();
        zzki.zzb = new zzkf();
    }

    static zzkg zza() {
        return zzki.zza;
    }

    static zzkg zzb() {
        return zzki.zzb;
    }

    private static zzkg zzc() {
        try {
            return (zzkg)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

