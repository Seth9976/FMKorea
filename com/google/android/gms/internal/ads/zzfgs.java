package com.google.android.gms.internal.ads;

final class zzfgs {
    public final String zza;
    public final String zzb;

    public zzfgs(String s, String s1) {
        this.zza = s;
        this.zzb = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzfgs ? this.zza.equals(((zzfgs)object0).zza) && this.zzb.equals(((zzfgs)object0).zzb) : false;
    }

    @Override
    public final int hashCode() {
        return (this.zza + this.zzb).hashCode();
    }
}

