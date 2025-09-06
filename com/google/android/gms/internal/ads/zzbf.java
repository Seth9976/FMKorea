package com.google.android.gms.internal.ads;

public final class zzbf {
    public static final zzbf zza;
    public static final zzn zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final float zzf;
    public final float zzg;
    private static final String zzh;
    private static final String zzi;
    private static final String zzj;
    private static final String zzk;
    private static final String zzl;

    static {
        zzbf.zza = new zzbf(new zzbd());
        zzbf.zzh = "0";
        zzbf.zzi = "1";
        zzbf.zzj = "2";
        zzbf.zzk = "3";
        zzbf.zzl = "4";
        zzbf.zzb = zzbc.zza;
    }

    private zzbf(zzbd zzbd0) {
        this.zzc = 0x8000000000000001L;
        this.zzd = 0x8000000000000001L;
        this.zze = 0x8000000000000001L;
        this.zzf = -3.402823E+38f;
        this.zzg = -3.402823E+38f;
    }

    zzbf(zzbd zzbd0, zzbe zzbe0) {
        this(zzbd0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzbf)) {
            return false;
        }
        zzbf zzbf0 = (zzbf)object0;
        return true;
    }

    // 去混淆评级： 低(20)
    @Override
    public final int hashCode() [...] // Inlined contents
}

