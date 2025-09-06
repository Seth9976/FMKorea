package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

public final class zziw implements Runnable {
    private zziq zza;
    private Bundle zzb;
    private long zzc;

    public zziw(zziq zziq0, Bundle bundle0, long v) {
        this.zza = zziq0;
        this.zzb = bundle0;
        this.zzc = v;
    }

    @Override
    public final void run() {
        zziq zziq0 = this.zza;
        Bundle bundle0 = this.zzb;
        long v = this.zzc;
        if(TextUtils.isEmpty(zziq0.zzg().zzae())) {
            zziq0.zza(bundle0, 0, v);
            return;
        }
        zziq0.zzj().zzv().zza("Using developer consent only; google app id found");
    }
}

