package com.google.android.gms.internal.ads;

public final class zzaby {
    public final zzacb zza;
    public final zzacb zzb;

    public zzaby(zzacb zzacb0, zzacb zzacb1) {
        this.zza = zzacb0;
        this.zzb = zzacb1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzaby.class == class0 && this.zza.equals(((zzaby)object0).zza) && this.zzb.equals(((zzaby)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode() * 0x1F + this.zzb.hashCode();
    }

    @Override
    public final String toString() {
        String s = this.zza.toString();
        return this.zza.equals(this.zzb) ? "[" + s + "" + "]" : "[" + s + (", " + this.zzb.toString()) + "]";
    }
}

