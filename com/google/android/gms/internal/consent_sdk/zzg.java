package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Executor;

public final class zzg {
    private final Executor zza;

    zzg(Executor executor0) {
        this.zza = executor0;
    }

    public final Executor zza() {
        return this.zza;
    }

    public final void zzb(String s, String s1, zzf[] arr_zzf) {
        zze zze0 = new zze(s, s1, arr_zzf);
        this.zza.execute(zze0);
    }
}

