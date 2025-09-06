package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

public final class zzecf implements zzffh {
    public final zzech zza;
    public final zzcaf zzb;
    public final String zzc;

    public zzecf(zzech zzech0, zzcaf zzcaf0, String s) {
        this.zza = zzech0;
        this.zzb = zzcaf0;
        this.zzc = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzffh
    public final Object zza(Object object0) {
        this.zza.zzg(((SQLiteDatabase)object0), this.zzb, this.zzc);
        return null;
    }
}

