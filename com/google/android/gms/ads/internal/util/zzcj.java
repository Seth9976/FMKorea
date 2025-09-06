package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzcj extends BroadcastReceiver {
    final zzck zza;

    zzcj(zzck zzck0) {
        this.zza = zzck0;
        super();
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        zzck.zza(this.zza, context0, intent0);
    }
}

