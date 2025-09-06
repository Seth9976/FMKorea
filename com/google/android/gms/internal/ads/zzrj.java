package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class zzrj extends Handler {
    final zzrl zza;

    zzrj(zzrl zzrl0, Looper looper0) {
        this.zza = zzrl0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        zzrl.zza(this.zza, message0);
    }
}

