package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzr extends BroadcastReceiver {
    final zzs zza;

    zzr(zzs zzs0, zzq zzq0) {
        this.zza = zzs0;
        super();
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if("android.intent.action.USER_PRESENT".equals(intent0.getAction())) {
            zzs.zze(this.zza, true);
            return;
        }
        if("android.intent.action.SCREEN_OFF".equals(intent0.getAction())) {
            zzs.zze(this.zza, false);
        }
    }
}

