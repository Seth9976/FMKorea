package com.google.android.gms.internal.ads;

public final class zzcjv {
    private zzchg zza;
    private zzcli zzb;
    private zzfgi zzc;
    private zzclu zzd;
    private zzfdc zze;

    private zzcjv() {
    }

    zzcjv(zzcju zzcju0) {
    }

    public final zzchd zza() {
        zzgzb.zzc(this.zza, zzchg.class);
        zzgzb.zzc(this.zzb, zzcli.class);
        if(this.zzc == null) {
            this.zzc = new zzfgi();
        }
        if(this.zzd == null) {
            this.zzd = new zzclu();
        }
        if(this.zze == null) {
            this.zze = new zzfdc();
        }
        return new zzciz(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzcjv zzb(zzchg zzchg0) {
        this.zza = zzchg0;
        return this;
    }

    public final zzcjv zzc(zzcli zzcli0) {
        this.zzb = zzcli0;
        return this;
    }
}

