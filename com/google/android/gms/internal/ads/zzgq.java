package com.google.android.gms.internal.ads;

public final class zzgq implements zzgh {
    private final zzhe zza;
    private zzhk zzb;
    private String zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    public zzgq() {
        this.zza = new zzhe();
        this.zzd = 8000;
        this.zze = 8000;
    }

    @Override  // com.google.android.gms.internal.ads.zzgh
    public final zzgi zza() {
        return this.zzg();
    }

    public final zzgq zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzgq zzc(int v) {
        this.zzd = v;
        return this;
    }

    public final zzgq zzd(int v) {
        this.zze = v;
        return this;
    }

    public final zzgq zze(zzhk zzhk0) {
        this.zzb = zzhk0;
        return this;
    }

    public final zzgq zzf(String s) {
        this.zzc = s;
        return this;
    }

    public final zzgv zzg() {
        zzgv zzgv0 = new zzgv(this.zzc, this.zzd, this.zze, this.zzf, this.zza, null, false, null);
        zzhk zzhk0 = this.zzb;
        if(zzhk0 != null) {
            zzgv0.zzf(zzhk0);
        }
        return zzgv0;
    }
}

