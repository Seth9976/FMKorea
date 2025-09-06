package com.google.android.gms.internal.ads;

final class zzfvr extends zzfud {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzfvr(Object[] arr_object, int v, int v1) {
        this.zza = arr_object;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final Object get(int v) {
        zzfri.zza(v, this.zzc, "index");
        Object object0 = this.zza[v + v + this.zzb];
        object0.getClass();
        return object0;
    }

    @Override
    public final int size() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final boolean zzf() {
        return true;
    }
}

