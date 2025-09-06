package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzbct {
    private MotionEvent zza;
    private MotionEvent zzb;
    private final Context zzc;
    private final ScheduledExecutorService zzd;
    private final zzfhr zze;
    private final zzbcv zzf;

    public zzbct(Context context0, ScheduledExecutorService scheduledExecutorService0, zzbcv zzbcv0, zzfhr zzfhr0) {
        this.zza = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
        this.zzb = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
        this.zzc = context0;
        this.zzd = scheduledExecutorService0;
        this.zzf = zzbcv0;
        this.zze = zzfhr0;
    }

    public final d zza() {
        return (zzfxv)zzfye.zzo(zzfxv.zzu(zzfye.zzh(null)), ((long)(((Long)zzbdj.zzc.zze()))), TimeUnit.MILLISECONDS, this.zzd);
    }

    public final void zzb(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 1 && motionEvent0.getEventTime() > this.zza.getEventTime()) {
            this.zza = MotionEvent.obtain(motionEvent0);
            return;
        }
        if(motionEvent0.getAction() == 0 && motionEvent0.getEventTime() > this.zzb.getEventTime()) {
            this.zzb = MotionEvent.obtain(motionEvent0);
        }
    }
}

