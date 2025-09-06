package com.google.android.gms.internal.ads;

final class zzact implements zzacn {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzact(int v, int v1, int v2, int v3, int v4, int v5) {
        this.zza = v;
        this.zzb = v2;
        this.zzc = v3;
        this.zzd = v4;
        this.zze = v5;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zza() {
        return 0x68727473;
    }

    public static zzact zzb(zzfb zzfb0) {
        int v = zzfb0.zzh();
        zzfb0.zzH(12);
        int v1 = zzfb0.zzh();
        int v2 = zzfb0.zzh();
        int v3 = zzfb0.zzh();
        zzfb0.zzH(4);
        int v4 = zzfb0.zzh();
        int v5 = zzfb0.zzh();
        zzfb0.zzH(8);
        return new zzact(v, v1, v2, v3, v4, v5);
    }
}

