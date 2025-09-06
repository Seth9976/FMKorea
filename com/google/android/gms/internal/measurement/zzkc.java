package com.google.android.gms.internal.measurement;

final class zzkc implements zzkk {
    private zzkk[] zza;

    zzkc(zzkk[] arr_zzkk) {
        this.zza = arr_zzkk;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkk
    public final zzkh zza(Class class0) {
        zzkk[] arr_zzkk = this.zza;
        for(int v = 0; v < arr_zzkk.length; ++v) {
            zzkk zzkk0 = arr_zzkk[v];
            if(zzkk0.zzb(class0)) {
                return zzkk0.zza(class0);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.measurement.zzkk
    public final boolean zzb(Class class0) {
        zzkk[] arr_zzkk = this.zza;
        for(int v = 0; v < arr_zzkk.length; ++v) {
            if(arr_zzkk[v].zzb(class0)) {
                return true;
            }
        }
        return false;
    }
}

