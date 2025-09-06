package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdd;

public final class zzio {
    final Context zza;
    String zzb;
    String zzc;
    String zzd;
    Boolean zze;
    long zzf;
    zzdd zzg;
    boolean zzh;
    Long zzi;
    String zzj;

    public zzio(Context context0, zzdd zzdd0, Long long0) {
        this.zzh = true;
        Preconditions.checkNotNull(context0);
        Context context1 = context0.getApplicationContext();
        Preconditions.checkNotNull(context1);
        this.zza = context1;
        this.zzi = long0;
        if(zzdd0 != null) {
            this.zzg = zzdd0;
            this.zzb = zzdd0.zzf;
            this.zzc = zzdd0.zze;
            this.zzd = zzdd0.zzd;
            this.zzh = zzdd0.zzc;
            this.zzf = zzdd0.zzb;
            this.zzj = zzdd0.zzh;
            Bundle bundle0 = zzdd0.zzg;
            if(bundle0 != null) {
                this.zze = Boolean.valueOf(bundle0.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

