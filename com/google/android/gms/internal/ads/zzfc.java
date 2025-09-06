package com.google.android.gms.internal.ads;

public final class zzfc {
    public static final zzfc zza;
    public static final zzfc zzb;
    private final int zzc;
    private final int zzd;

    static {
        zzfc.zza = new zzfc(-1, -1);
        zzfc.zzb = new zzfc(0, 0);
    }

    public zzfc(int v, int v1) {
        zzdy.zzd((v == -1 || v >= 0) && (v1 == -1 || v1 >= 0));
        this.zzc = v;
        this.zzd = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        return this == object0 ? true : object0 instanceof zzfc && this.zzc == ((zzfc)object0).zzc && this.zzd == ((zzfc)object0).zzd;
    }

    @Override
    public final int hashCode() {
        return this.zzd ^ (this.zzc >>> 16 | this.zzc << 16);
    }

    @Override
    public final String toString() {
        return this.zzc + "x" + this.zzd;
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzc;
    }
}

