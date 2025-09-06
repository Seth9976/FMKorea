package com.google.android.gms.internal.measurement;

public class zzjn {
    private static final zzik zza;
    private zzhm zzb;
    private volatile zzkj zzc;
    private volatile zzhm zzd;

    static {
        zzjn.zza = zzik.zza;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzjn)) {
            return false;
        }
        zzkj zzkj0 = this.zzc;
        zzkj zzkj1 = ((zzjn)object0).zzc;
        if(zzkj0 == null && zzkj1 == null) {
            return this.zzc().equals(((zzjn)object0).zzc());
        }
        if(zzkj0 != null && zzkj1 != null) {
            return zzkj0.equals(zzkj1);
        }
        return zzkj0 == null ? this.zzb(zzkj1.zzcf()).equals(zzkj1) : zzkj0.equals(((zzjn)object0).zzb(zzkj0.zzcf()));
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public final zzkj zza(zzkj zzkj0) {
        zzkj zzkj1 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzkj0;
        return zzkj1;
    }

    private final zzkj zzb(zzkj zzkj0) {
        if(this.zzc == null) {
            synchronized(this) {
                if(this.zzc != null) {
                    return this.zzc;
                }
                this.zzc = zzkj0;
                this.zzd = zzhm.zza;
            }
        }
        return this.zzc;
    }

    public final int zzb() {
        if(this.zzd != null) {
            return this.zzd.zzb();
        }
        return this.zzc == null ? 0 : this.zzc.zzbw();
    }

    public final zzhm zzc() {
        if(this.zzd != null) {
            return this.zzd;
        }
        synchronized(this) {
            if(this.zzd != null) {
                return this.zzd;
            }
            this.zzd = this.zzc == null ? zzhm.zza : this.zzc.zzbu();
            return this.zzd;
        }
    }
}

