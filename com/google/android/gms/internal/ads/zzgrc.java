package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgrc {
    static final zzgrc zza = null;
    public static final int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgrc zzd;
    private final Map zze;

    static {
        zzgrc.zza = new zzgrc(true);
    }

    zzgrc() {
        this.zze = new HashMap();
    }

    zzgrc(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzgrc zza() {
        return zzgrc.zza;
    }

    public static zzgrc zzb() {
        zzgrc zzgrc0 = zzgrc.zzd;
        if(zzgrc0 != null) {
            return zzgrc0;
        }
        synchronized(zzgrc.class) {
            zzgrc zzgrc1 = zzgrc.zzd;
            if(zzgrc1 != null) {
                return zzgrc1;
            }
            zzgrc zzgrc2 = zzgrk.zzb(zzgrc.class);
            zzgrc.zzd = zzgrc2;
            return zzgrc2;
        }
    }

    public final zzgro zzc(zzgta zzgta0, int v) {
        zzgrb zzgrb0 = new zzgrb(zzgta0, v);
        return (zzgro)this.zze.get(zzgrb0);
    }
}

