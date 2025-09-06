package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfi.zze.zza;
import com.google.android.gms.internal.measurement.zzfi.zze;
import com.google.android.gms.internal.measurement.zzix;
import java.util.List;

final class zzx {
    private zze zza;
    private Long zzb;
    private long zzc;
    private final zzt zzd;

    private zzx(zzt zzt0) {
        this.zzd = zzt0;
        super();
    }

    zzx(zzt zzt0, zzaa zzaa0) {
        this(zzt0);
    }

    final zze zza(String s, zze zzfi$zze0) {
        List list0 = zzfi$zze0.zzh();
        this.zzd.g_();
        Object object0 = zzmz.zzb(zzfi$zze0, "_eid");
        if(((Long)object0) != null) {
            this.zzb = (Long)object0;
            this.zza = zzfi$zze0;
            this.zzd.g_();
            Long long0 = 0L;
            Object object1 = zzmz.zzb(zzfi$zze0, "_epc");
            if(object1 != null) {
                long0 = object1;
            }
            long v = (long)long0;
            this.zzc = v;
            if(v <= 0L) {
                this.zzd.zzj().zzm().zza("Complex event with zero extra param count. eventName", "");
                return (zze)(((zzix)((zza)zzfi$zze0.zzby()).zza("").zzd().zza(list0).zzab()));
            }
            this.zzd.zzh().zza(s, ((Long)Preconditions.checkNotNull(((Long)object0))), this.zzc, zzfi$zze0);
        }
        return (zze)(((zzix)((zza)zzfi$zze0.zzby()).zza("").zzd().zza(list0).zzab()));
    }
}

