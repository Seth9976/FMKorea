package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

final class zzecg implements zzfya {
    final zzffh zza;

    zzecg(zzech zzech0, zzffh zzffh0) {
        this.zza = zzffh0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzcaa.zzg(("Failed to get offline buffered ping database: " + throwable0.getMessage()));
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        SQLiteDatabase sQLiteDatabase0 = (SQLiteDatabase)object0;
        try {
            this.zza.zza(sQLiteDatabase0);
        }
        catch(Exception exception0) {
            zzcaa.zzg(("Error executing function on offline buffered ping database: " + exception0.getMessage()));
        }
    }
}

