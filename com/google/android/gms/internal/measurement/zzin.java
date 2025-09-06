package com.google.android.gms.internal.measurement;

final class zzin {
    private static final zzim zza;
    private static final zzim zzb;

    static {
        zzin.zza = new zzio();
        zzin.zzb = zzin.zzc();
    }

    static zzim zza() {
        zzim zzim0 = zzin.zzb;
        if(zzim0 == null) {
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        return zzim0;
    }

    static zzim zzb() {
        return zzin.zza;
    }

    private static zzim zzc() {
        try {
            return (zzim)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

