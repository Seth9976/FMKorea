package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

public final class zzche {
    private zzcag zza;
    private Context zzb;
    private WeakReference zzc;

    public final zzche zzc(Context context0) {
        this.zzc = new WeakReference(context0);
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.zzb = context0;
        return this;
    }

    public final zzche zzd(zzcag zzcag0) {
        this.zza = zzcag0;
        return this;
    }
}

