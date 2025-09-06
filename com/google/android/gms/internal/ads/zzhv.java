package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

final class zzhv extends BroadcastReceiver implements Runnable {
    final zzhx zza;
    private final zzhw zzb;
    private final Handler zzc;

    public zzhv(zzhx zzhx0, Handler handler0, zzhw zzhw0) {
        this.zza = zzhx0;
        super();
        this.zzc = handler0;
        this.zzb = zzhw0;
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if("android.media.AUDIO_BECOMING_NOISY".equals(intent0.getAction())) {
            this.zzc.post(this);
        }
    }

    @Override
    public final void run() {
    }
}

