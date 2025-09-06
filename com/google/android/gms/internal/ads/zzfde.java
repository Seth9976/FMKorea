package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

public final class zzfde {
    static Task zza;
    public static AppSetIdClient zzb;
    private static final Object zzc;

    static {
        zzfde.zzc = new Object();
    }

    public static Task zza(Context context0) {
        zzfde.zzb(context0, false);
        synchronized(zzfde.zzc) {
        }
        return zzfde.zza;
    }

    public static void zzb(Context context0, boolean z) {
        synchronized(zzfde.zzc) {
            if(zzfde.zzb == null) {
                zzfde.zzb = AppSet.getClient(context0);
            }
            if(zzfde.zza == null || zzfde.zza.isComplete() && !zzfde.zza.isSuccessful() || z && zzfde.zza.isComplete()) {
                zzfde.zza = ((AppSetIdClient)Preconditions.checkNotNull(zzfde.zzb, "the appSetIdClient shouldn\'t be null")).getAppSetIdInfo();
            }
        }
    }
}

