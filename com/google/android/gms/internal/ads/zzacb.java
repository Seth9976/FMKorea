package com.google.android.gms.internal.ads;

public final class zzacb {
    public static final zzacb zza;
    public final long zzb;
    public final long zzc;

    static {
        zzacb.zza = new zzacb(0L, 0L);
    }

    public zzacb(long v, long v1) {
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzacb.class == class0 && this.zzb == ((zzacb)object0).zzb && this.zzc == ((zzacb)object0).zzc;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((int)this.zzb) * 0x1F + ((int)this.zzc);
    }

    @Override
    public final String toString() {
        return "[timeUs=" + this.zzb + ", position=" + this.zzc + "]";
    }
}

