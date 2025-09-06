package com.google.android.gms.internal.consent_sdk;

public final class zzba implements Runnable {
    public final zzbe zza;

    public zzba(zzbe zzbe0) {
        this.zza = zzbe0;
    }

    @Override
    public final void run() {
        zzi zzi0 = new zzi(4, "Web view timed out.");
        this.zza.zzf(zzi0);
    }
}

