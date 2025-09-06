package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzd {
    public static final zzd zza;
    public static final zzn zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;
    private static final zzc zzf;
    private static final String zzg;
    private static final String zzh;
    private static final String zzi;
    private static final String zzj;
    private final zzc[] zzk;

    static {
        zzd.zza = new zzd(null, new zzc[0], 0L, 0x8000000000000001L, 0);
        zzd.zzf = new zzc(0L).zzb(0);
        zzd.zzg = "1";
        zzd.zzh = "2";
        zzd.zzi = "3";
        zzd.zzj = "4";
        zzd.zzb = zza.zza;
    }

    private zzd(Object object0, zzc[] arr_zzc, long v, long v1, int v2) {
        this.zzd = 0L;
        this.zzc = 0;
        this.zzk = arr_zzc;
        this.zze = 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzd.class == class0 && zzfk.zzD(null, null) && Arrays.equals(this.zzk, ((zzd)object0).zzk);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.zzk) + 961;
    }

    @Override
    public final String toString() {
        return "AdPlaybackState(adsId=" + null + ", adResumePositionUs=0, adGroups=[" + "])";
    }

    public final zzc zza(int v) {
        return v >= 0 ? this.zzk[v] : zzd.zzf;
    }

    public final boolean zzb(int v) {
        this.zza(-1);
        return false;
    }
}

