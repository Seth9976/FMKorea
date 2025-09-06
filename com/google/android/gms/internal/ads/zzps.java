package com.google.android.gms.internal.ads;

public final class zzps {
    private zzoj zza;
    private boolean zzb;
    private final zzpr zzc;
    private zzpu zzd;
    private zzpm zze;

    @Deprecated
    public zzps() {
        this.zza = zzoj.zza;
        this.zzc = zzpr.zza;
    }

    @Deprecated
    public final zzps zzc(zzoj zzoj0) {
        this.zza = zzoj0;
        return this;
    }

    public final zzps zzd(zzdr[] arr_zzdr) {
        this.zzd = new zzpu(arr_zzdr);
        return this;
    }

    public final zzqe zze() {
        zzdy.zzf(!this.zzb);
        this.zzb = true;
        if(this.zzd == null) {
            this.zzd = new zzpu(new zzdr[0]);
        }
        if(this.zze == null) {
            this.zze = new zzpm(null);
        }
        return new zzqe(this, null);
    }
}

