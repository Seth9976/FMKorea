package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

public final class zzecb implements Runnable {
    public final SQLiteDatabase zza;
    public final String zzb;
    public final zzcaf zzc;

    public zzecb(SQLiteDatabase sQLiteDatabase0, String s, zzcaf zzcaf0) {
        this.zza = sQLiteDatabase0;
        this.zzb = s;
        this.zzc = zzcaf0;
    }

    @Override
    public final void run() {
        zzech.zzf(this.zza, this.zzb, this.zzc);
    }
}

