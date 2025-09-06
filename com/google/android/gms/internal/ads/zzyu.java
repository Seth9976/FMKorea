package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

final class zzyu implements zzdj {
    private static final zzfry zza;

    static {
        zzyu.zza = zzfsb.zza(zzys.zza);
    }

    private zzyu() {
    }

    zzyu(zzyt zzyt0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdj
    public final zzdl zza(Context context0, zzv zzv0, zzs zzs0, zzs zzs1, boolean z, Executor executor0, zzdk zzdk0) {
        return ((zzdj)zzyu.zza.zza()).zza(context0, zzv0, zzs0, zzs1, false, executor0, zzdk0);
    }
}

