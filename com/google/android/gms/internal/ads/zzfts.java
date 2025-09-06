package com.google.android.gms.internal.ads;

import java.util.Comparator;

public abstract class zzfts {
    private static final zzfts zza;
    private static final zzfts zzb;
    private static final zzfts zzc;

    static {
        zzfts.zza = new zzftp();
        zzfts.zzb = new zzftq(-1);
        zzfts.zzc = new zzftq(1);
    }

    zzfts(zzftr zzftr0) {
    }

    public abstract int zza();

    public abstract zzfts zzb(int arg1, int arg2);

    public abstract zzfts zzc(Object arg1, Object arg2, Comparator arg3);

    public abstract zzfts zzd(boolean arg1, boolean arg2);

    public abstract zzfts zze(boolean arg1, boolean arg2);

    public static zzfts zzj() {
        return zzfts.zza;
    }
}

