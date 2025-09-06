package com.google.android.gms.internal.ads;

final class zzut {
    public final int zza;
    public final boolean zzb;

    public zzut(int v, boolean z) {
        this.zza = v;
        this.zzb = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzut.class == class0 && this.zza == ((zzut)object0).zza && this.zzb == ((zzut)object0).zzb;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza * 0x1F + this.zzb;
    }
}

