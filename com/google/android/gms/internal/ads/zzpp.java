package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

final class zzpp {
    public static void zza(AudioTrack audioTrack0, zzoh zzoh0) {
        LogSessionId logSessionId0 = zzoh0.zza();
        if(!logSessionId0.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack0.setLogSessionId(logSessionId0);
        }
    }
}

