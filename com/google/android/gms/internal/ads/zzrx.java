package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

final class zzrx {
    public static void zza(zzrr zzrr0, zzoh zzoh0) {
        LogSessionId logSessionId0 = zzoh0.zza();
        if(!logSessionId0.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            String s = logSessionId0.getStringId();
            zzrr0.zzb.setString("log-session-id", s);
        }
    }
}

