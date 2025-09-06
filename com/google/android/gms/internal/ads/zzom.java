package com.google.android.gms.internal.ads;

public final class zzom {
    public static final zzom zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    static {
        zzom.zza = new zzok().zzd();
    }

    zzom(zzok zzok0, zzol zzol0) {
        this.zzb = zzok0.zza;
        this.zzc = zzok0.zzb;
        this.zzd = zzok0.zzc;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzom.class == class0 && this.zzb == ((zzom)object0).zzb && this.zzc == ((zzom)object0).zzc && this.zzd == ((zzom)object0).zzd;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (this.zzb << 2) + (this.zzc + this.zzc) + this.zzd;
    }
}

