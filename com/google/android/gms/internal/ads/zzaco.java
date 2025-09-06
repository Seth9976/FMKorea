package com.google.android.gms.internal.ads;

final class zzaco implements zzaca {
    final zzacr zza;
    private final long zzb;

    public zzaco(zzacr zzacr0, long v) {
        this.zza = zzacr0;
        super();
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long v) {
        zzaby zzaby0 = zzacr.zze(this.zza)[0].zza(v);
        for(int v1 = 1; true; ++v1) {
            zzacr zzacr0 = this.zza;
            if(v1 >= zzacr.zze(zzacr0).length) {
                break;
            }
            zzaby zzaby1 = zzacr.zze(zzacr0)[v1].zza(v);
            if(zzaby1.zza.zzc < zzaby0.zza.zzc) {
                zzaby0 = zzaby1;
            }
        }
        return zzaby0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}

