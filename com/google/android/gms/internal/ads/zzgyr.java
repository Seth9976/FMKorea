package com.google.android.gms.internal.ads;

public final class zzgyr implements zzgyt {
    private zzgzg zza;

    public static void zza(zzgzg zzgzg0, zzgzg zzgzg1) {
        if(((zzgyr)zzgzg0).zza != null) {
            throw new IllegalStateException();
        }
        ((zzgyr)zzgzg0).zza = zzgzg1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzgzg zzgzg0 = this.zza;
        if(zzgzg0 == null) {
            throw new IllegalStateException();
        }
        return zzgzg0.zzb();
    }
}

