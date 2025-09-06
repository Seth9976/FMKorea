package com.google.android.gms.internal.ads;

final class zzgsr implements zzgsy {
    private final zzgsy[] zza;

    zzgsr(zzgsy[] arr_zzgsy) {
        this.zza = arr_zzgsy;
    }

    @Override  // com.google.android.gms.internal.ads.zzgsy
    public final zzgsx zzb(Class class0) {
        zzgsy[] arr_zzgsy = this.zza;
        for(int v = 0; v < 2; ++v) {
            zzgsy zzgsy0 = arr_zzgsy[v];
            if(zzgsy0.zzc(class0)) {
                return zzgsy0.zzb(class0);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.ads.zzgsy
    public final boolean zzc(Class class0) {
        zzgsy[] arr_zzgsy = this.zza;
        for(int v = 0; v < 2; ++v) {
            if(arr_zzgsy[v].zzc(class0)) {
                return true;
            }
        }
        return false;
    }
}

