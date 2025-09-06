package com.google.android.gms.internal.ads;

final class zzfvn extends zzfud {
    static final zzfud zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static {
        zzfvn.zza = new zzfvn(new Object[0], 0);
    }

    zzfvn(Object[] arr_object, int v) {
        this.zzb = arr_object;
        this.zzc = v;
    }

    @Override
    public final Object get(int v) {
        zzfri.zza(v, this.zzc, "index");
        Object object0 = this.zzb[v];
        object0.getClass();
        return object0;
    }

    @Override
    public final int size() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfud
    final int zza(Object[] arr_object, int v) {
        System.arraycopy(this.zzb, 0, arr_object, v, this.zzc);
        return v + this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final int zzb() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final int zzc() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final boolean zzf() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final Object[] zzg() {
        return this.zzb;
    }
}

