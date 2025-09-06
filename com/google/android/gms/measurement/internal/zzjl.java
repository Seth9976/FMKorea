package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

final class zzjl implements Runnable {
    private final Bundle zza;
    private final zziq zzb;

    zzjl(zziq zziq0, Bundle bundle0) {
        this.zzb = zziq0;
        this.zza = bundle0;
        super();
    }

    @Override
    public final void run() {
        zzbg zzbg0;
        zziq zziq0 = this.zzb;
        Bundle bundle0 = this.zza;
        zziq0.zzt();
        zziq0.zzu();
        Preconditions.checkNotNull(bundle0);
        String s = Preconditions.checkNotEmpty(bundle0.getString("name"));
        if(!zziq0.zzu.zzac()) {
            zziq0.zzj().zzp().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zznc zznc0 = new zznc(s, 0L, null, "");
        try {
            zzbg0 = zziq0.zzq().zza(bundle0.getString("app_id"), bundle0.getString("expired_event_name"), bundle0.getBundle("expired_event_params"), "", bundle0.getLong("creation_timestamp"), true, true);
        }
        catch(IllegalArgumentException unused_ex) {
            return;
        }
        zzad zzad0 = new zzad(bundle0.getString("app_id"), "", zznc0, bundle0.getLong("creation_timestamp"), bundle0.getBoolean("active"), bundle0.getString("trigger_event_name"), null, bundle0.getLong("trigger_timeout"), null, bundle0.getLong("time_to_live"), zzbg0);
        zziq0.zzo().zza(zzad0);
    }
}

