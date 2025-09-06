package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzly;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements zzly {
    private zzlu zza;

    @Override  // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.zza().zza();
    }

    @Override  // android.app.Service
    public final void onDestroy() {
        this.zza().zzb();
        super.onDestroy();
    }

    @Override  // android.app.Service
    public final void onRebind(Intent intent0) {
        this.zza().zzb(intent0);
    }

    @Override  // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters0) {
        return this.zza().zza(jobParameters0);
    }

    @Override  // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters0) {
        return false;
    }

    @Override  // android.app.Service
    public final boolean onUnbind(Intent intent0) {
        return this.zza().zzc(intent0);
    }

    private final zzlu zza() {
        if(this.zza == null) {
            this.zza = new zzlu(this);
        }
        return this.zza;
    }

    @Override  // com.google.android.gms.measurement.internal.zzly
    @TargetApi(24)
    public final void zza(JobParameters jobParameters0, boolean z) {
        this.jobFinished(jobParameters0, false);
    }

    @Override  // com.google.android.gms.measurement.internal.zzly
    public final void zza(Intent intent0) {
    }

    @Override  // com.google.android.gms.measurement.internal.zzly
    public final boolean zza(int v) {
        throw new UnsupportedOperationException();
    }
}

