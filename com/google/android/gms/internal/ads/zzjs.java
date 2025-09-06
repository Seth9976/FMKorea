package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

final class zzjs {
    public static zzoh zza(Context context0, zzkb zzkb0, boolean z) {
        zzod zzod0 = zzod.zzb(context0);
        if(zzod0 == null) {
            zzes.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzoh(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if(z) {
            zzkb0.zzz(zzod0);
        }
        return new zzoh(zzod0.zza());
    }
}

