package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.work.impl.F;
import androidx.work.impl.e;
import androidx.work.impl.v;
import androidx.work.impl.w;
import androidx.work.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import x0.m;

public class SystemJobService extends JobService implements e {
    static abstract class a {
        static String[] a(JobParameters jobParameters0) {
            return jobParameters0.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters0) {
            return jobParameters0.getTriggeredContentUris();
        }
    }

    static abstract class b {
        static Network a(JobParameters jobParameters0) {
            return jobParameters0.getNetwork();
        }
    }

    private F f;
    private final Map g;
    private final w h;
    private static final String i;

    static {
        SystemJobService.i = "WM-SystemJobService";
    }

    public SystemJobService() {
        this.g = new HashMap();
        this.h = new w();
    }

    private static m a(JobParameters jobParameters0) {
        try {
            PersistableBundle persistableBundle0 = jobParameters0.getExtras();
            return persistableBundle0 == null || !persistableBundle0.containsKey("EXTRA_WORK_SPEC_ID") ? null : new m(persistableBundle0.getString("EXTRA_WORK_SPEC_ID"), persistableBundle0.getInt("EXTRA_WORK_SPEC_GENERATION"));
        }
        catch(NullPointerException unused_ex) {
        }
        return null;
    }

    @Override  // androidx.work.impl.e
    public void f(m m0, boolean z) {
        JobParameters jobParameters0;
        k.e().a("WM-SystemJobService", m0.b() + " executed on JobScheduler");
        synchronized(this.g) {
            jobParameters0 = (JobParameters)this.g.remove(m0);
        }
        this.h.b(m0);
        if(jobParameters0 != null) {
            this.jobFinished(jobParameters0, z);
        }
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            F f0 = F.m(this.getApplicationContext());
            this.f = f0;
            f0.o().g(this);
        }
        catch(IllegalStateException unused_ex) {
            Class class0 = this.getApplication().getClass();
            if(!Application.class.equals(class0)) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            k.e().k("WM-SystemJobService", "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override  // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        F f0 = this.f;
        if(f0 != null) {
            f0.o().n(this);
        }
    }

    @Override  // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters0) {
        androidx.work.WorkerParameters.a workerParameters$a0;
        if(this.f == null) {
            k.e().a("WM-SystemJobService", "WorkManager is not initialized; requesting retry.");
            this.jobFinished(jobParameters0, true);
            return false;
        }
        m m0 = SystemJobService.a(jobParameters0);
        if(m0 == null) {
            k.e().c("WM-SystemJobService", "WorkSpec id not found!");
            return false;
        }
        synchronized(this.g) {
            if(this.g.containsKey(m0)) {
                k.e().a("WM-SystemJobService", "Job is already being executed by SystemJobService: " + m0);
                return false;
            }
            k.e().a("WM-SystemJobService", "onStartJob for " + m0);
            this.g.put(m0, jobParameters0);
        }
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 24) {
            workerParameters$a0 = new androidx.work.WorkerParameters.a();
            if(a.b(jobParameters0) != null) {
                workerParameters$a0.b = Arrays.asList(a.b(jobParameters0));
            }
            if(a.a(jobParameters0) != null) {
                workerParameters$a0.a = Arrays.asList(a.a(jobParameters0));
            }
            if(v1 >= 28) {
                workerParameters$a0.c = b.a(jobParameters0);
            }
        }
        else {
            workerParameters$a0 = null;
        }
        this.f.y(this.h.d(m0), workerParameters$a0);
        return true;
    }

    @Override  // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters0) {
        if(this.f == null) {
            k.e().a("WM-SystemJobService", "WorkManager is not initialized; requesting retry.");
            return true;
        }
        m m0 = SystemJobService.a(jobParameters0);
        if(m0 == null) {
            k.e().c("WM-SystemJobService", "WorkSpec id not found!");
            return false;
        }
        k.e().a("WM-SystemJobService", "onStopJob for " + m0);
        synchronized(this.g) {
            this.g.remove(m0);
        }
        v v1 = this.h.b(m0);
        if(v1 != null) {
            this.f.A(v1);
        }
        return !this.f.o().j(m0.b());
    }
}

