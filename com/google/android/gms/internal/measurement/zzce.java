package com.google.android.gms.internal.measurement;

import X1.h;
import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
public final class zzce {
    private static final Method zza;
    private static final Method zzb;
    private final JobScheduler zzc;

    static {
        zzce.zza = zzce.zzc();
        zzce.zzb = zzce.zzb();
    }

    private zzce(JobScheduler jobScheduler0) {
        this.zzc = jobScheduler0;
    }

    private static int zza() {
        Method method0 = zzce.zzb;
        if(method0 != null) {
            try {
                Integer integer0 = (Integer)method0.invoke(UserHandle.class, null);
                return integer0 == null ? 0 : ((int)integer0);
            }
            catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
                if(Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", illegalAccessException0);
                }
            }
        }
        return 0;
    }

    private final int zza(JobInfo jobInfo0, String s, int v, String s1) {
        Method method0 = zzce.zza;
        if(method0 != null) {
            try {
                Integer integer0 = (Integer)method0.invoke(this.zzc, jobInfo0, s, v, s1);
                return integer0 == null ? 0 : ((int)integer0);
            }
            catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
                Log.e(s1, "error calling scheduleAsPackage", illegalAccessException0);
            }
        }
        return this.zzc.schedule(jobInfo0);
    }

    public static int zza(Context context0, JobInfo jobInfo0, String s, String s1) {
        JobScheduler jobScheduler0 = (JobScheduler)h.i(((JobScheduler)context0.getSystemService("jobscheduler")));
        return zzce.zza == null || context0.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0 ? jobScheduler0.schedule(jobInfo0) : new zzce(jobScheduler0).zza(jobInfo0, s, zzce.zza(), s1);
    }

    private static Method zzb() {
        if(Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            }
            catch(NoSuchMethodException unused_ex) {
                if(Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        return null;
    }

    private static Method zzc() {
        if(Build.VERSION.SDK_INT >= 24) {
            try {
                return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            }
            catch(NoSuchMethodException unused_ex) {
                if(Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                }
            }
        }
        return null;
    }
}

