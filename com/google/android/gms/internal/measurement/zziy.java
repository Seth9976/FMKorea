package com.google.android.gms.internal.measurement;

final class zziy implements zzkk {
    private static final zziy zza;

    static {
        zziy.zza = new zziy();
    }

    public static zziy zza() {
        return zziy.zza;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkk
    public final zzkh zza(Class class0) {
        Class class1 = zzix.class;
        if(class1.isAssignableFrom(class0)) {
            try {
                return (zzkh)zzix.zza(class0.asSubclass(class1)).zza(zze.zzc, null, null);
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.measurement.zzkk
    public final boolean zzb(Class class0) {
        return zzix.class.isAssignableFrom(class0);
    }
}

