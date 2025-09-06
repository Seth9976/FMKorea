package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

public final class zzevs {
    public static zzesj zza(zzeuw zzeuw0, zzeqj zzeqj0, ScheduledExecutorService scheduledExecutorService0, int v) {
        return v == 0 ? new zzeqr(zzeqj0, 0L, scheduledExecutorService0) : new zzeqr(zzeuw0, 0L, scheduledExecutorService0);
    }

    public static zzesj zzb(zzevg zzevg0, ScheduledExecutorService scheduledExecutorService0) {
        return new zzeqr(zzevg0, ((long)(((Long)zzba.zzc().zzb(zzbbr.zzdU)))), scheduledExecutorService0);
    }

    public static zzesj zzc(zzewb zzewb0, ScheduledExecutorService scheduledExecutorService0) {
        return new zzeqr(zzewb0, 0L, scheduledExecutorService0);
    }
}

