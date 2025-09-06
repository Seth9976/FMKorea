package com.google.android.gms.internal.ads;

final class zzagp implements zzagm {
    private final zzfb zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzagp(zzagi zzagi0) {
        this.zza = zzagi0.zza;
        zzagi0.zza.zzG(12);
        this.zzc = zzagi0.zza.zzo() & 0xFF;
        this.zzb = zzagi0.zza.zzo();
    }

    @Override  // com.google.android.gms.internal.ads.zzagm
    public final int zza() {
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzagm
    public final int zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzagm
    public final int zzc() {
        int v = this.zzc;
        if(v == 8) {
            return this.zza.zzl();
        }
        if(v == 16) {
            return this.zza.zzp();
        }
        int v1 = this.zzd;
        this.zzd = v1 + 1;
        if(v1 % 2 == 0) {
            int v2 = this.zza.zzl();
            this.zze = v2;
            return (v2 & 0xF0) >> 4;
        }
        return this.zze & 15;
    }
}

