package com.google.android.gms.internal.measurement;

import X1.h;
import com.google.common.collect.p;

public final class zzgy {
    private final boolean zza;

    public zzgy(zzhb zzhb0) {
        h.j(zzhb0, "BuildInfo must be non-null");
        this.zza = !zzhb0.zza();
    }

    public final boolean zza(String s) {
        h.j(s, "flagName must not be null");
        return this.zza ? ((p)zzha.zza.get()).b(s) : true;
    }
}

