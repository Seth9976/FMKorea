package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzce;

public final class zzmj extends zzmo {
    private final AlarmManager zza;
    private zzaw zzb;
    private Integer zzc;

    protected zzmj(zzmp zzmp0) {
        super(zzmp0);
        this.zza = (AlarmManager)this.zza().getSystemService("alarm");
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzmz g_() {
        return super.g_();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return super.zza();
    }

    public final void zza(long v) {
        this.zzak();
        Context context0 = this.zza();
        if(!zznd.zza(context0)) {
            this.zzj().zzc().zza("Receiver not registered/enabled");
        }
        if(!zznd.zza(context0, false)) {
            this.zzj().zzc().zza("Service not registered/enabled");
        }
        this.zzu();
        this.zzj().zzp().zza("Scheduling upload, millis", v);
        long v1 = this.zzb().elapsedRealtime();
        if(v < Math.max(0L, ((long)(((Long)zzbi.zzx.zza(null))))) && !this.zzx().zzc()) {
            this.zzx().zza(v);
        }
        if(Build.VERSION.SDK_INT >= 24) {
            Context context1 = this.zza();
            ComponentName componentName0 = new ComponentName(context1, "com.google.android.gms.measurement.AppMeasurementJobService");
            int v2 = this.zzv();
            PersistableBundle persistableBundle0 = new PersistableBundle();
            persistableBundle0.putString("action", "com.google.android.gms.measurement.UPLOAD");
            zzce.zza(context1, new JobInfo.Builder(v2, componentName0).setMinimumLatency(v).setOverrideDeadline(v << 1).setExtras(persistableBundle0).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager0 = this.zza;
        if(alarmManager0 != null) {
            alarmManager0.setInexactRepeating(2, v1 + v, Math.max(((long)(((Long)zzbi.zzs.zza(null)))), v), this.zzw());
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return super.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zzmo
    protected final boolean zzc() {
        AlarmManager alarmManager0 = this.zza;
        if(alarmManager0 != null) {
            alarmManager0.cancel(this.zzw());
        }
        if(Build.VERSION.SDK_INT >= 24) {
            this.zzy();
        }
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzae zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzaf zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzba zzf() {
        return super.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzt zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzao zzh() {
        return super.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfq zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzfr zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgd zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzgy zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzgp zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzls zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzmn zzo() {
        return super.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zznd zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzt() {
        super.zzt();
    }

    public final void zzu() {
        this.zzak();
        this.zzj().zzp().zza("Unscheduling upload");
        AlarmManager alarmManager0 = this.zza;
        if(alarmManager0 != null) {
            alarmManager0.cancel(this.zzw());
        }
        this.zzx().zza();
        if(Build.VERSION.SDK_INT >= 24) {
            this.zzy();
        }
    }

    private final int zzv() {
        if(this.zzc == null) {
            this.zzc = 0x667FD82F;
        }
        return (int)this.zzc;
    }

    private final PendingIntent zzw() {
        Context context0 = this.zza();
        return zzcc.zza(context0, 0, new Intent().setClassName(context0, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcc.zza);
    }

    private final zzaw zzx() {
        if(this.zzb == null) {
            this.zzb = new zzmm(this, this.zzf.zzk());
        }
        return this.zzb;
    }

    @TargetApi(24)
    private final void zzy() {
        JobScheduler jobScheduler0 = (JobScheduler)this.zza().getSystemService("jobscheduler");
        if(jobScheduler0 != null) {
            jobScheduler0.cancel(this.zzv());
        }
    }
}

