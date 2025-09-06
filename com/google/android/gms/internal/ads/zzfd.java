package com.google.android.gms.internal.ads;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public final class zzfd implements zzdz {
    @Override  // com.google.android.gms.internal.ads.zzdz
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    @Override  // com.google.android.gms.internal.ads.zzdz
    public final zzej zzb(Looper looper0, Handler.Callback handler$Callback0) {
        return new zzfg(new Handler(looper0, handler$Callback0));
    }
}

