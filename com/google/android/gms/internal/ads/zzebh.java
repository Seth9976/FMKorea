package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

public final class zzebh implements zzffh {
    public final zzebi zza;
    public final long zzb;

    public zzebh(zzebi zzebi0, long v) {
        this.zza = zzebi0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzffh
    public final Object zza(Object object0) {
        long v = this.zzb;
        if(!this.zza.zzf()) {
            zzazm zzazm0 = zzazn.zzg();
            zzazm0.zzh(v);
            byte[] arr_b = ((zzazn)zzazm0.zzal()).zzax();
            zzebp.zzg(((SQLiteDatabase)object0), false, false);
            zzebp.zzd(((SQLiteDatabase)object0), v, arr_b);
        }
        return null;
    }
}

