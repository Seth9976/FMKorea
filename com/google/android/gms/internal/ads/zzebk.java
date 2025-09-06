package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

public final class zzebk implements zzffh {
    public final zzebl zza;
    public final boolean zzb;
    public final ArrayList zzc;
    public final zzazi zzd;
    public final zzazr zze;

    public zzebk(zzebl zzebl0, boolean z, ArrayList arrayList0, zzazi zzazi0, zzazr zzazr0) {
        this.zza = zzebl0;
        this.zzb = z;
        this.zzc = arrayList0;
        this.zzd = zzazi0;
        this.zze = zzazr0;
    }

    @Override  // com.google.android.gms.internal.ads.zzffh
    public final Object zza(Object object0) {
        zzebl zzebl0 = this.zza;
        boolean z = this.zzb;
        ArrayList arrayList0 = this.zzc;
        zzazi zzazi0 = this.zzd;
        zzazr zzazr0 = this.zze;
        if(!zzebl0.zzb.zzf()) {
            byte[] arr_b = zzebm.zze(zzebl0.zzb, z, arrayList0, zzazi0, zzazr0);
            zzebp.zzg(((SQLiteDatabase)object0), z, true);
            zzebp.zzd(((SQLiteDatabase)object0), zzebm.zzc(zzebl0.zzb).zzd(), arr_b);
        }
        return null;
    }
}

