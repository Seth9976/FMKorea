package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzpg;

public final class zzp extends BroadcastReceiver {
    private final zzhf zza;

    public zzp(zzhf zzhf0) {
        this.zza = zzhf0;
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(intent0 == null) {
            this.zza.zzj().zzu().zza("App receiver called with null intent");
            return;
        }
        String s = intent0.getAction();
        if(s == null) {
            this.zza.zzj().zzu().zza("App receiver called with null action");
            return;
        }
        if(!s.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.zza.zzj().zzu().zza("App receiver called with unknown action");
            return;
        }
        zzhf zzhf0 = this.zza;
        if(zzpg.zza() && zzhf0.zzf().zzf(null, zzbi.zzcg)) {
            zzhf0.zzj().zzp().zza("App receiver notified triggers are available");
            zzhf0.zzl().zzb(new zzr(zzhf0));
        }
    }
}

