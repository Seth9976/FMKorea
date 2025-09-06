package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
public final class zzdrm extends zzdro {
    private final zzfgw zzf;

    public zzdrm(Executor executor0, zzcaf zzcaf0, zzfgw zzfgw0, zzfgy zzfgy0) {
        super(executor0, zzcaf0, zzfgy0);
        this.zzf = zzfgw0;
        zzfgw0.zza(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}

