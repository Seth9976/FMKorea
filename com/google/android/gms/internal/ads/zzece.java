package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

public final class zzece implements zzffh {
    public final zzech zza;
    public final String zzb;

    public zzece(zzech zzech0, String s) {
        this.zza = zzech0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzffh
    public final Object zza(Object object0) {
        zzech.zzi(((SQLiteDatabase)object0), this.zzb);
        return null;
    }
}

