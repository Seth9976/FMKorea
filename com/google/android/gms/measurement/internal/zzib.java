package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpg;
import java.util.ArrayList;
import java.util.concurrent.Callable;

final class zzib implements Callable {
    private final zzo zza;
    private final Bundle zzb;
    private final zzhj zzc;

    zzib(zzhj zzhj0, zzo zzo0, Bundle bundle0) {
        this.zzc = zzhj0;
        this.zza = zzo0;
        this.zzb = bundle0;
        super();
    }

    @Override
    public final Object call() {
        this.zzc.zza.zzr();
        zzmp zzmp0 = this.zzc.zza;
        zzo zzo0 = this.zza;
        Bundle bundle0 = this.zzb;
        zzmp0.zzl().zzt();
        if(zzpg.zza() && zzmp0.zze().zze(zzo0.zza, zzbi.zzcf) && zzo0.zza != null) {
            if(bundle0 != null) {
                int[] arr_v = bundle0.getIntArray("uriSources");
                long[] arr_v1 = bundle0.getLongArray("uriTimestamps");
                if(arr_v != null) {
                    if(arr_v1 != null && arr_v1.length == arr_v.length) {
                        for(int v = 0; v < arr_v.length; ++v) {
                            zzao zzao0 = zzmp0.zzf();
                            String s = zzo0.zza;
                            int v1 = arr_v[v];
                            long v2 = arr_v1[v];
                            Preconditions.checkNotEmpty(s);
                            zzao0.zzt();
                            zzao0.zzak();
                            try {
                                int v3 = zzao0.e_().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{s, String.valueOf(v1), String.valueOf(v2)});
                                zzao0.zzj().zzp().zza("Pruned " + v3 + " trigger URIs. appId, source, timestamp", s, v1, v2);
                            }
                            catch(SQLiteException sQLiteException0) {
                                zzao0.zzj().zzg().zza("Error pruning trigger URIs. appId", zzfr.zza(s), sQLiteException0);
                            }
                        }
                        return zzmp0.zzf().zzh(zzo0.zza);
                    }
                    zzmp0.zzj().zzg().zza("Uri sources and timestamps do not match");
                }
            }
            return zzmp0.zzf().zzh(zzo0.zza);
        }
        return new ArrayList();
    }
}

