package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;

public final class zzlu {
    private final Context zza;

    public zzlu(Context context0) {
        Preconditions.checkNotNull(context0);
        this.zza = context0;
    }

    private final void zza(Runnable runnable0) {
        zzmp zzmp0 = zzmp.zza(this.zza);
        zzmp0.zzl().zzb(new zzlv(this, zzmp0, runnable0));
    }

    public final int zza(Intent intent0, int v, int v1) {
        zzfr zzfr0 = zzhf.zza(this.zza, null, null).zzj();
        if(intent0 == null) {
            zzfr0.zzu().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String s = intent0.getAction();
        zzfr0.zzp().zza("Local AppMeasurementService called. startId, action", v1, s);
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            this.zza(new zzlw(this, v1, zzfr0, intent0));
        }
        return 2;
    }

    public final IBinder zza(Intent intent0) {
        if(intent0 == null) {
            this.zzc().zzg().zza("onBind called with null intent");
            return null;
        }
        String s = intent0.getAction();
        if("com.google.android.gms.measurement.START".equals(s)) {
            return new zzhj(zzmp.zza(this.zza));
        }
        this.zzc().zzu().zza("onBind received unknown action", s);
        return null;
    }

    public final void zza() {
        zzhf.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is starting up");
    }

    final void zza(int v, zzfr zzfr0, Intent intent0) {
        if(((zzly)this.zza).zza(v)) {
            zzfr0.zzp().zza("Local AppMeasurementService processed last upload request. StartId", v);
            this.zzc().zzp().zza("Completed wakeful intent.");
            ((zzly)this.zza).zza(intent0);
        }
    }

    // 检测为 Lambda 实现
    final void zza(zzfr zzfr0, JobParameters jobParameters0) [...]

    @TargetApi(24)
    public final boolean zza(JobParameters jobParameters0) {
        zzfr zzfr0 = zzhf.zza(this.zza, null, null).zzj();
        String s = jobParameters0.getExtras().getString("action");
        zzfr0.zzp().zza("Local AppMeasurementJobService called. action", s);
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            this.zza(() -> {
                zzfr0.zzp().zza("AppMeasurementJobService processed last upload request.");
                ((zzly)this.zza).zza(jobParameters0, false);
            });
        }
        return true;
    }

    public final void zzb() {
        zzhf.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is shutting down");
    }

    public final void zzb(Intent intent0) {
        if(intent0 == null) {
            this.zzc().zzg().zza("onRebind called with null intent");
            return;
        }
        String s = intent0.getAction();
        this.zzc().zzp().zza("onRebind called. action", s);
    }

    private final zzfr zzc() {
        return zzhf.zza(this.zza, null, null).zzj();
    }

    public final boolean zzc(Intent intent0) {
        if(intent0 == null) {
            this.zzc().zzg().zza("onUnbind called with null intent");
            return true;
        }
        String s = intent0.getAction();
        this.zzc().zzp().zza("onUnbind called for intent. action", s);
        return true;
    }
}

