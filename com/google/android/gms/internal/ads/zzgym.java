package com.google.android.gms.internal.ads;

public final class zzgym {
    public static final zzgym zza;
    public static final zzgym zzb;
    public static final zzgym zzc;
    public static final zzgym zzd;
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;
    public final double zzj;
    public final double zzk;
    public final double zzl;
    public final double zzm;

    static {
        zzgym.zza = new zzgym(1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        zzgym.zzb = new zzgym(0.0, 1.0, -1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        zzgym.zzc = new zzgym(-1.0, 0.0, 0.0, -1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        zzgym.zzd = new zzgym(0.0, -1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
    }

    public zzgym(double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7, double f8) {
        this.zze = f4;
        this.zzf = f5;
        this.zzg = f6;
        this.zzh = f;
        this.zzi = f1;
        this.zzj = f2;
        this.zzk = f3;
        this.zzl = f7;
        this.zzm = f8;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzgym.class != class0 || Double.compare(((zzgym)object0).zzh, this.zzh) != 0) {
                return false;
            }
            if(Double.compare(((zzgym)object0).zzi, this.zzi) != 0) {
                return false;
            }
            if(Double.compare(((zzgym)object0).zzj, this.zzj) != 0) {
                return false;
            }
            if(Double.compare(((zzgym)object0).zzk, this.zzk) != 0) {
                return false;
            }
            if(Double.compare(((zzgym)object0).zzl, this.zzl) != 0) {
                return false;
            }
            if(Double.compare(((zzgym)object0).zzm, this.zzm) != 0) {
                return false;
            }
            if(Double.compare(((zzgym)object0).zze, this.zze) != 0) {
                return false;
            }
            return Double.compare(((zzgym)object0).zzf, this.zzf) == 0 ? Double.compare(((zzgym)object0).zzg, this.zzg) == 0 : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.zze);
        long v1 = Double.doubleToLongBits(this.zzf);
        long v2 = Double.doubleToLongBits(this.zzg);
        long v3 = Double.doubleToLongBits(this.zzh);
        long v4 = Double.doubleToLongBits(this.zzi);
        long v5 = Double.doubleToLongBits(this.zzj);
        long v6 = Double.doubleToLongBits(this.zzk);
        long v7 = Double.doubleToLongBits(this.zzl);
        long v8 = Double.doubleToLongBits(this.zzm);
        return (((((((((int)(v ^ v >>> 0x20)) * 0x1F + ((int)(v1 ^ v1 >>> 0x20))) * 0x1F + ((int)(v2 ^ v2 >>> 0x20))) * 0x1F + ((int)(v3 ^ v3 >>> 0x20))) * 0x1F + ((int)(v4 ^ v4 >>> 0x20))) * 0x1F + ((int)(v5 ^ v5 >>> 0x20))) * 0x1F + ((int)(v6 ^ v6 >>> 0x20))) * 0x1F + ((int)(v7 ^ v7 >>> 0x20))) * 0x1F + ((int)(v8 ^ v8 >>> 0x20));
    }

    @Override
    public final String toString() {
        if(this.equals(zzgym.zza)) {
            return "Rotate 0°";
        }
        if(this.equals(zzgym.zzb)) {
            return "Rotate 90°";
        }
        if(this.equals(zzgym.zzc)) {
            return "Rotate 180°";
        }
        return this.equals(zzgym.zzd) ? "Rotate 270°" : "Matrix{u=" + this.zze + ", v=" + this.zzf + ", w=" + this.zzg + ", a=" + this.zzh + ", b=" + this.zzi + ", c=" + this.zzj + ", d=" + this.zzk + ", tx=" + this.zzl + ", ty=" + this.zzm + "}";
    }
}

