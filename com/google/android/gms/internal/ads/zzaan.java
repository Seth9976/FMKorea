package com.google.android.gms.internal.ads;

public class zzaan {
    protected final zzaah zza;
    protected final zzaam zzb;
    protected zzaaj zzc;
    private final int zzd;

    protected zzaan(zzaak zzaak0, zzaam zzaam0, long v, long v1, long v2, long v3, long v4, long v5, int v6) {
        this.zzb = zzaam0;
        this.zzd = v6;
        this.zza = new zzaah(zzaak0, v, 0L, v2, v3, v4, v5);
    }

    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        while(true) {
            zzaaj zzaaj0 = this.zzc;
            zzdy.zzb(zzaaj0);
            long v = zzaaj0.zzf;
            long v1 = zzaaj0.zzh;
            if(Long.compare(zzaaj0.zzg - v, this.zzd) <= 0) {
                this.zzc(false, v);
                return zzaan.zzf(zzabc0, v, zzabx0);
            }
            if(!zzaan.zzg(zzabc0, v1)) {
                return zzaan.zzf(zzabc0, v1, zzabx0);
            }
            zzabc0.zzj();
            zzaal zzaal0 = this.zzb.zza(zzabc0, zzaaj0.zzb);
            switch(zzaal0.zzb) {
                case -3: {
                    this.zzc(false, v1);
                    return zzaan.zzf(zzabc0, v1, zzabx0);
                }
                case -2: {
                    zzaaj.zzh(zzaaj0, zzaal0.zzc, zzaal0.zzd);
                    break;
                }
                case -1: {
                    zzaaj.zzg(zzaaj0, zzaal0.zzc, zzaal0.zzd);
                    break;
                }
                default: {
                    zzaan.zzg(zzabc0, zzaal0.zzd);
                    this.zzc(true, zzaal0.zzd);
                    return zzaan.zzf(zzabc0, zzaal0.zzd, zzabx0);
                }
            }
        }
    }

    public final zzaca zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z, long v) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long v) {
        if(this.zzc != null && this.zzc.zza == v) {
            return;
        }
        this.zzc = new zzaaj(v, this.zza.zzf(v), 0L, this.zza.zzc, this.zza.zzd, this.zza.zze, this.zza.zzf);
    }

    public final boolean zze() {
        return this.zzc != null;
    }

    protected static final int zzf(zzabc zzabc0, long v, zzabx zzabx0) {
        if(v == zzabc0.zzf()) {
            return 0;
        }
        zzabx0.zza = v;
        return 1;
    }

    protected static final boolean zzg(zzabc zzabc0, long v) {
        long v1 = v - zzabc0.zzf();
        if(Long.compare(v1, 0L) >= 0 && v1 <= 0x40000L) {
            ((zzaar)zzabc0).zzo(((int)v1), false);
            return true;
        }
        return false;
    }
}

