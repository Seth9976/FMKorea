package com.google.android.gms.internal.ads;

public final class zzcj {
    private final zzaf zza;

    public zzcj() {
        this.zza = new zzaf();
    }

    public final zzcj zza(int v) {
        this.zza.zza(v);
        return this;
    }

    public final zzcj zzb(zzcl zzcl0) {
        zzaf zzaf0 = this.zza;
        zzah zzah0 = zzcl.zza(zzcl0);
        for(int v = 0; v < zzah0.zzb(); ++v) {
            zzaf0.zza(zzah0.zza(v));
        }
        return this;
    }

    public final zzcj zzc(int[] arr_v) {
        zzaf zzaf0 = this.zza;
        for(int v = 0; v < 19; ++v) {
            zzaf0.zza(arr_v[v]);
        }
        return this;
    }

    public final zzcj zzd(int v, boolean z) {
        zzaf zzaf0 = this.zza;
        if(z) {
            zzaf0.zza(v);
        }
        return this;
    }

    public final zzcl zze() {
        return new zzcl(this.zza.zzb(), null);
    }
}

