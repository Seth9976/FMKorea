package com.google.android.gms.internal.ads;

public final class zzlr {
    public static final zzlr zza;
    public static final zzlr zzb;
    public static final zzlr zzc;
    public static final zzlr zzd;
    public static final zzlr zze;
    public final long zzf;
    public final long zzg;

    static {
        zzlr zzlr0 = new zzlr(0L, 0L);
        zzlr.zza = zzlr0;
        zzlr.zzb = new zzlr(0x7FFFFFFFFFFFFFFFL, 0x7FFFFFFFFFFFFFFFL);
        zzlr.zzc = new zzlr(0x7FFFFFFFFFFFFFFFL, 0L);
        zzlr.zzd = new zzlr(0L, 0x7FFFFFFFFFFFFFFFL);
        zzlr.zze = zzlr0;
    }

    public zzlr(long v, long v1) {
        boolean z = false;
        zzdy.zzd(Long.compare(v, 0L) >= 0);
        if(v1 >= 0L) {
            z = true;
        }
        zzdy.zzd(z);
        this.zzf = v;
        this.zzg = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzlr.class == class0 && this.zzf == ((zzlr)object0).zzf && this.zzg == ((zzlr)object0).zzg;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((int)this.zzf) * 0x1F + ((int)this.zzg);
    }
}

