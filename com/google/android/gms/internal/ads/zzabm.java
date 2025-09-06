package com.google.android.gms.internal.ads;

public final class zzabm implements zzaca {
    private final zzabo zza;
    private final long zzb;

    public zzabm(zzabo zzabo0, long v) {
        this.zza = zzabo0;
        this.zzb = v;
    }

    private final zzacb zza(long v, long v1) {
        return new zzacb(v * 1000000L / ((long)this.zza.zze), this.zzb + v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zza.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long v) {
        zzdy.zzb(this.zza.zzk);
        long[] arr_v = this.zza.zzk.zza;
        long[] arr_v1 = this.zza.zzk.zzb;
        int v1 = zzfk.zzc(arr_v, this.zza.zzb(v), true, false);
        long v2 = 0L;
        long v3 = v1 == -1 ? 0L : arr_v[v1];
        if(v1 != -1) {
            v2 = arr_v1[v1];
        }
        zzacb zzacb0 = this.zza(v3, v2);
        return zzacb0.zzb == v || v1 == arr_v.length - 1 ? new zzaby(zzacb0, zzacb0) : new zzaby(zzacb0, this.zza(arr_v[v1 + 1], arr_v1[v1 + 1]));
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}

