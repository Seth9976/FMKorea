package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo.TriggerContentUri;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest.Builder;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.work.c;
import androidx.work.l;
import x0.u;

class k {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[l.values().length];
            a.a = arr_v;
            try {
                arr_v[l.f.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[l.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[l.h.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[l.i.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[l.j.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final ComponentName a;
    private static final String b;

    static {
        k.b = "WM-SystemJobInfoConvert";
    }

    k(Context context0) {
        this.a = new ComponentName(context0.getApplicationContext(), SystemJobService.class);
    }

    JobInfo a(u u0, int v) {
        c c0 = u0.j;
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("EXTRA_WORK_SPEC_ID", u0.a);
        persistableBundle0.putInt("EXTRA_WORK_SPEC_GENERATION", u0.f());
        persistableBundle0.putBoolean("EXTRA_IS_PERIODIC", u0.j());
        JobInfo.Builder jobInfo$Builder0 = new JobInfo.Builder(v, this.a).setRequiresCharging(c0.g()).setRequiresDeviceIdle(c0.h()).setExtras(persistableBundle0);
        k.d(jobInfo$Builder0, c0.d());
        boolean z = false;
        if(!c0.h()) {
            jobInfo$Builder0.setBackoffCriteria(u0.m, (u0.l == androidx.work.a.g ? 0 : 1));
        }
        long v1 = Math.max(u0.c() - System.currentTimeMillis(), 0L);
        int v2 = Build.VERSION.SDK_INT;
        if(v2 <= 28) {
            jobInfo$Builder0.setMinimumLatency(v1);
        }
        else if(v1 > 0L) {
            jobInfo$Builder0.setMinimumLatency(v1);
        }
        else if(!u0.q) {
            jobInfo$Builder0.setImportantWhileForeground(true);
        }
        if(v2 >= 24 && c0.e()) {
            for(Object object0: c0.c()) {
                jobInfo$Builder0.addTriggerContentUri(k.b(((androidx.work.c.c)object0)));
            }
            jobInfo$Builder0.setTriggerContentUpdateDelay(c0.b());
            jobInfo$Builder0.setTriggerContentMaxDelay(c0.a());
        }
        jobInfo$Builder0.setPersisted(false);
        int v3 = Build.VERSION.SDK_INT;
        if(v3 >= 26) {
            jobInfo$Builder0.setRequiresBatteryNotLow(c0.f());
            jobInfo$Builder0.setRequiresStorageNotLow(c0.i());
        }
        boolean z1 = u0.k > 0;
        if(v1 > 0L) {
            z = true;
        }
        if(v3 >= 0x1F && u0.q && !z1 && !z) {
            jobInfo$Builder0.setExpedited(true);
        }
        return jobInfo$Builder0.build();
    }

    private static JobInfo.TriggerContentUri b(androidx.work.c.c c$c0) {
        return h.a(c$c0.a(), ((int)c$c0.b()));
    }

    static int c(l l0) {
        switch(l0) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 2;
            }
            case 4: {
                if(Build.VERSION.SDK_INT >= 24) {
                    return 3;
                }
                break;
            }
            case 5: {
                if(Build.VERSION.SDK_INT >= 26) {
                    return 4;
                }
            }
        }
        androidx.work.k.e().a("WM-SystemJobInfoConvert", "API version too low. Cannot convert network type value " + l0);
        return 1;
    }

    static void d(JobInfo.Builder jobInfo$Builder0, l l0) {
        if(Build.VERSION.SDK_INT >= 30 && l0 == l.k) {
            jobInfo$Builder0.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            return;
        }
        jobInfo$Builder0.setRequiredNetworkType(k.c(l0));
    }
}

