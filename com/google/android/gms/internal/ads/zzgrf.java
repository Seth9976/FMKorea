package com.google.android.gms.internal.ads;

final class zzgrf {
    private static final zzgrd zza;
    private static final zzgrd zzb;

    static {
        zzgrf.zza = new zzgre();
        zzgrd zzgrd0 = null;
        try {
            zzgrd0 = (zzgrd)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
        }
        zzgrf.zzb = zzgrd0;
    }

    static zzgrd zza() {
        zzgrd zzgrd0 = zzgrf.zzb;
        if(zzgrd0 == null) {
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        return zzgrd0;
    }

    static zzgrd zzb() {
        return zzgrf.zza;
    }
}

