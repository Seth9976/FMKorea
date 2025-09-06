package com.google.android.gms.internal.ads;

public final class zzdn {
    public static final zzdn zza;
    public static final zzn zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;
    private static final String zzg;
    private static final String zzh;
    private static final String zzi;
    private static final String zzj;

    static {
        zzdn.zza = new zzdn(0, 0, 0, 1.0f);
        zzdn.zzg = "0";
        zzdn.zzh = "1";
        zzdn.zzi = "2";
        zzdn.zzj = "3";
        zzdn.zzb = zzdm.zza;
    }

    public zzdn(int v, int v1, int v2, float f) {
        this.zzc = v;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = f;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof zzdn && this.zzc == ((zzdn)object0).zzc && this.zzd == ((zzdn)object0).zzd && this.zze == ((zzdn)object0).zze && this.zzf == ((zzdn)object0).zzf;
    }

    @Override
    public final int hashCode() {
        return (((this.zzc + 0xD9) * 0x1F + this.zzd) * 0x1F + this.zze) * 0x1F + Float.floatToRawIntBits(this.zzf);
    }
}

