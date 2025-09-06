package com.google.android.gms.internal.ads;

final class zzgrl implements zzgsy {
    private static final zzgrl zza;

    static {
        zzgrl.zza = new zzgrl();
    }

    public static zzgrl zza() {
        return zzgrl.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgsy
    public final zzgsx zzb(Class class0) {
        Class class1 = zzgrq.class;
        if(class1.isAssignableFrom(class0)) {
            try {
                return (zzgsx)zzgrq.zzaC(class0.asSubclass(class1)).zzb(3, null, null);
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.ads.zzgsy
    public final boolean zzc(Class class0) {
        return zzgrq.class.isAssignableFrom(class0);
    }
}

