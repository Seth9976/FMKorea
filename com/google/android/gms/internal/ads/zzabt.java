package com.google.android.gms.internal.ads;

public final class zzabt implements zzaca {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzabt(long[] arr_v, long[] arr_v1, long v) {
        zzdy.zzd(arr_v.length == arr_v1.length);
        this.zzd = arr_v1.length > 0;
        if(arr_v1.length <= 0 || arr_v1[0] <= 0L) {
            this.zza = arr_v;
            this.zzb = arr_v1;
        }
        else {
            long[] arr_v2 = new long[arr_v1.length + 1];
            this.zza = arr_v2;
            long[] arr_v3 = new long[arr_v1.length + 1];
            this.zzb = arr_v3;
            System.arraycopy(arr_v, 0, arr_v2, 1, arr_v1.length);
            System.arraycopy(arr_v1, 0, arr_v3, 1, arr_v1.length);
        }
        this.zzc = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long v) {
        if(!this.zzd) {
            return new zzaby(zzacb.zza, zzacb.zza);
        }
        int v1 = zzfk.zzc(this.zzb, v, true, true);
        zzacb zzacb0 = new zzacb(this.zzb[v1], this.zza[v1]);
        if(zzacb0.zzb != v) {
            return v1 == this.zzb.length - 1 ? new zzaby(zzacb0, zzacb0) : new zzaby(zzacb0, new zzacb(this.zzb[v1 + 1], this.zza[v1 + 1]));
        }
        return new zzaby(zzacb0, zzacb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return this.zzd;
    }
}

