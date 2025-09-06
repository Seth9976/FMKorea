package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzga extends ContentObserver {
    private final zzfy zza;

    zzga(zzfy zzfy0, Handler handler0) {
        this.zza = zzfy0;
        super(null);
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zzd();
    }
}

