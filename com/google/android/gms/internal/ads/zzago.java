package com.google.android.gms.internal.ads;

final class zzago implements zzagm {
    private final int zza;
    private final int zzb;
    private final zzfb zzc;

    public zzago(zzagi zzagi0, zzam zzam0) {
        zzfb zzfb0 = zzagi0.zza;
        this.zzc = zzfb0;
        zzfb0.zzG(12);
        int v = zzfb0.zzo();
        if("audio/raw".equals(zzam0.zzm)) {
            int v1 = zzfk.zzl(zzam0.zzB, zzam0.zzz);
            if(v == 0 || v % v1 != 0) {
                zzes.zzf("AtomParsers", "Audio sample size mismatch. stsd sample size: " + v1 + ", stsz sample size: " + v);
                v = v1;
            }
        }
        if(v == 0) {
            v = -1;
        }
        this.zza = v;
        this.zzb = zzfb0.zzo();
    }

    @Override  // com.google.android.gms.internal.ads.zzagm
    public final int zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzagm
    public final int zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzagm
    public final int zzc() {
        return this.zza == -1 ? this.zzc.zzo() : this.zza;
    }
}

