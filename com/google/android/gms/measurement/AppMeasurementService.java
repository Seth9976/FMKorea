package com.google.android.gms.measurement;

import U.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzly;

public final class AppMeasurementService extends Service implements zzly {
    private zzlu zza;

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
        return this.zza().zza(intent0);
    }

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

    @Override  // android.app.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        return this.zza().zza(intent0, v, v1);
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
    public final void zza(JobParameters jobParameters0, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.measurement.internal.zzly
    public final void zza(Intent intent0) {
        a.completeWakefulIntent(intent0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzly
    public final boolean zza(int v) {
        return this.stopSelfResult(v);
    }
}

