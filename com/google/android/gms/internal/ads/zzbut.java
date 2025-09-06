package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

final class zzbut implements Callable {
    final Context zza;
    final zzbuv zzb;

    zzbut(zzbuv zzbuv0, Context context0) {
        this.zzb = zzbuv0;
        this.zza = context0;
        super();
    }

    @Override
    public final Object call() {
        zzbus zzbus0;
        zzbuu zzbuu0 = (zzbuu)zzbuv.zza(this.zzb).get(this.zza);
        if(zzbuu0 == null) {
            zzbus0 = new zzbur(this.zza).zza();
        }
        else {
            long v = (long)(((Long)zzbda.zza.zze()));
            long v1 = zzt.zzB().currentTimeMillis();
            zzbus0 = zzbuu0.zza + v >= v1 ? new zzbur(this.zza, zzbuu0.zzb).zza() : new zzbur(this.zza).zza();
        }
        zzbuu zzbuu1 = new zzbuu(this.zzb, zzbus0);
        zzbuv.zza(this.zzb).put(this.zza, zzbuu1);
        return zzbus0;
    }
}

