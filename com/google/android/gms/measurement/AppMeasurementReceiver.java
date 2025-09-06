package com.google.android.gms.measurement;

import U.a;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzgn.zza;
import com.google.android.gms.measurement.internal.zzgn;

public final class AppMeasurementReceiver extends a implements zza {
    private zzgn zza;

    public final BroadcastReceiver.PendingResult doGoAsync() {
        return this.goAsync();
    }

    @Override  // com.google.android.gms.measurement.internal.zzgn$zza
    public final void doStartService(Context context0, Intent intent0) {
        a.startWakefulService(context0, intent0);
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(this.zza == null) {
            this.zza = new zzgn(this);
        }
        this.zza.zza(context0, intent0);
    }
}

