package com.google.android.gms.internal.ads;

final class zzfdq {
    private final zzfdp zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    zzfdq() {
        this.zza = new zzfdp();
    }

    public final zzfdp zza() {
        zzfdp zzfdp0 = this.zza.zza();
        this.zza.zza = false;
        this.zza.zzb = false;
        return zzfdp0;
    }

    public final String zzb() [...] // 潜在的解密器

    public final void zzc() {
        ++this.zzf;
    }

    public final void zzd() {
        ++this.zzb;
        this.zza.zza = true;
    }

    public final void zze() {
        ++this.zze;
    }

    public final void zzf() {
        ++this.zzd;
    }

    public final void zzg() {
        ++this.zzc;
        this.zza.zzb = true;
    }
}

