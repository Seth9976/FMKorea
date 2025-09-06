package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.ThreadFactory;

public final class zzcr implements ThreadFactory {
    public final zzcs zza;
    public final String zzb;

    public zzcr(zzcs zzcs0, String s) {
        this.zza = zzcs0;
        this.zzb = "Google consent worker";
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        return this.zza.zza(this.zzb, runnable0);
    }
}

