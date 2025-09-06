package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class zzte {
    private final zzabi zza;
    private final Map zzb;
    private final Set zzc;
    private final Map zzd;
    private zzgh zze;

    public zzte(zzabi zzabi0) {
        this.zza = zzabi0;
        this.zzb = new HashMap();
        this.zzc = new HashSet();
        this.zzd = new HashMap();
    }

    public final void zza(zzgh zzgh0) {
        if(zzgh0 != this.zze) {
            this.zze = zzgh0;
            this.zzb.clear();
            this.zzd.clear();
        }
    }
}

