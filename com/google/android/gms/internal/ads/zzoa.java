package com.google.android.gms.internal.ads;

final class zzoa {
    final zzob zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzts zze;
    private boolean zzf;
    private boolean zzg;

    public zzoa(zzob zzob0, String s, int v, zzts zzts0) {
        this.zza = zzob0;
        super();
        this.zzb = s;
        this.zzc = v;
        this.zzd = zzts0 == null ? -1L : zzts0.zzd;
        if(zzts0 != null && zzts0.zzb()) {
            this.zze = zzts0;
        }
    }

    static void zze(zzoa zzoa0, boolean z) {
        zzoa0.zzg = true;
    }

    static void zzf(zzoa zzoa0, boolean z) {
        zzoa0.zzf = true;
    }

    public final void zzg(int v, zzts zzts0) {
        if(this.zzd == -1L && v == this.zzc && zzts0 != null) {
            long v1 = zzob.zza(this.zza);
            if(zzts0.zzd >= v1) {
                this.zzd = zzts0.zzd;
            }
        }
    }

    public final boolean zzj(int v, zzts zzts0) {
        if(zzts0 == null) {
            return v == this.zzc;
        }
        return this.zze == null ? !zzts0.zzb() && zzts0.zzd == this.zzd : zzts0.zzd == this.zze.zzd && zzts0.zzb == this.zze.zzb && zzts0.zzc == this.zze.zzc;
    }

    public final boolean zzk(zzly zzly0) {
        zzts zzts0 = zzly0.zzd;
        if(zzts0 == null) {
            return this.zzc != zzly0.zzc;
        }
        long v = this.zzd;
        if(v == -1L) {
            return false;
        }
        if(zzts0.zzd > v) {
            return true;
        }
        if(this.zze == null) {
            return false;
        }
        int v1 = zzly0.zzb.zza(zzts0.zza);
        int v2 = zzly0.zzb.zza(this.zze.zza);
        zzts zzts1 = zzly0.zzd;
        if(zzts1.zzd >= this.zze.zzd && v1 >= v2) {
            if(v1 > v2) {
                return true;
            }
            if(zzts1.zzb()) {
                int v3 = zzly0.zzd.zzb;
                int v4 = this.zze.zzb;
                return v3 > v4 || v3 == v4 && zzly0.zzd.zzc > this.zze.zzc;
            }
            int v5 = zzly0.zzd.zze;
            return v5 == -1 || v5 > this.zze.zzb;
        }
        return false;
    }

    public final boolean zzl(zzcw zzcw0, zzcw zzcw1) {
        int v = this.zzc;
        if(v < zzcw0.zzc()) {
            zzcw0.zze(v, zzob.zzc(this.zza), 0L);
            for(int v1 = zzob.zzc(this.zza).zzp; v1 <= zzob.zzc(this.zza).zzq; ++v1) {
                int v2 = zzcw1.zza(zzcw0.zzf(v1));
                if(v2 != -1) {
                    v = zzcw1.zzd(v2, zzob.zzb(this.zza), false).zzd;
                    break;
                }
            }
        }
        else if(v >= zzcw1.zzc()) {
        }
        this.zzc = v;
        if(v == -1) {
            return false;
        }
        return this.zze == null ? true : zzcw1.zza(this.zze.zza) != -1;
    }
}

