package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

final class zzjm implements Runnable {
    private final Bundle zza;
    private final zziq zzb;

    zzjm(zziq zziq0, Bundle bundle0) {
        this.zzb = zziq0;
        this.zza = bundle0;
        super();
    }

    @Override
    public final void run() {
        zzbg zzbg2;
        zzbg zzbg1;
        zzbg zzbg0;
        zziq zziq0 = this.zzb;
        Bundle bundle0 = this.zza;
        zziq0.zzt();
        zziq0.zzu();
        Preconditions.checkNotNull(bundle0);
        String s = bundle0.getString("name");
        String s1 = bundle0.getString("origin");
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        Preconditions.checkNotNull(bundle0.get("value"));
        if(!zziq0.zzu.zzac()) {
            zziq0.zzj().zzp().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        zznc zznc0 = new zznc(s, bundle0.getLong("triggered_timestamp"), bundle0.get("value"), s1);
        try {
            zzbg0 = zziq0.zzq().zza(bundle0.getString("app_id"), bundle0.getString("triggered_event_name"), bundle0.getBundle("triggered_event_params"), s1, 0L, true, true);
            zzbg1 = zziq0.zzq().zza(bundle0.getString("app_id"), bundle0.getString("timed_out_event_name"), bundle0.getBundle("timed_out_event_params"), s1, 0L, true, true);
            zzbg2 = zziq0.zzq().zza(bundle0.getString("app_id"), bundle0.getString("expired_event_name"), bundle0.getBundle("expired_event_params"), s1, 0L, true, true);
        }
        catch(IllegalArgumentException unused_ex) {
            return;
        }
        zzad zzad0 = new zzad(bundle0.getString("app_id"), s1, zznc0, bundle0.getLong("creation_timestamp"), false, bundle0.getString("trigger_event_name"), zzbg1, bundle0.getLong("trigger_timeout"), zzbg0, bundle0.getLong("time_to_live"), zzbg2);
        zziq0.zzo().zza(zzad0);
    }
}

