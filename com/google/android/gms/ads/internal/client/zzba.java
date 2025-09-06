package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbbl;
import com.google.android.gms.internal.ads.zzbbp;

public final class zzba {
    private static final zzba zza;
    private final zzbbk zzb;
    private final zzbbl zzc;
    private final zzbbp zzd;

    static {
        zzba.zza = new zzba();
    }

    protected zzba() {
        zzbbk zzbbk0 = new zzbbk();
        zzbbl zzbbl0 = new zzbbl();
        zzbbp zzbbp0 = new zzbbp();
        super();
        this.zzb = zzbbk0;
        this.zzc = zzbbl0;
        this.zzd = zzbbp0;
    }

    public static zzbbk zza() {
        return zzba.zza.zzb;
    }

    public static zzbbl zzb() {
        return zzba.zza.zzc;
    }

    public static zzbbp zzc() {
        return zzba.zza.zzd;
    }
}

