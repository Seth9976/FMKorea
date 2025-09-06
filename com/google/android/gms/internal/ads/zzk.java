package com.google.android.gms.internal.ads;

public final class zzk {
    public static final zzk zza;
    public static final zzn zzb;
    public final int zzc;
    private static final String zzd;
    private static final String zze;
    private static final String zzf;
    private static final String zzg;
    private static final String zzh;
    private zzi zzi;

    static {
        zzk.zza = new zzk(0, 0, 1, 1, 0, null);
        zzk.zzd = "0";
        zzk.zze = "1";
        zzk.zzf = "2";
        zzk.zzg = "3";
        zzk.zzh = "4";
        zzk.zzb = zze.zza;
    }

    zzk(int v, int v1, int v2, int v3, int v4, zzj zzj0) {
        this.zzc = 1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzk.class == class0) {
                zzk zzk0 = (zzk)object0;
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return 0x1D02666F;
    }

    public final zzi zza() {
        if(this.zzi == null) {
            this.zzi = new zzi(this, null);
        }
        return this.zzi;
    }
}

