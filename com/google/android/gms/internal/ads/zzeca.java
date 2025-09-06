package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzeca implements Callable {
    public final zzech zza;

    public zzeca(zzech zzech0) {
        this.zza = zzech0;
    }

    @Override
    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}

