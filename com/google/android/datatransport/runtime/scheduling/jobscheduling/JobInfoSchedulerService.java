package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import m1.p.a;
import m1.p;
import m1.u;

public class JobInfoSchedulerService extends JobService {
    // 检测为 Lambda 实现
    private void b(JobParameters jobParameters0) [...]

    @Override  // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters0) {
        String s = jobParameters0.getExtras().getString("backendName");
        String s1 = jobParameters0.getExtras().getString("extras");
        int v = jobParameters0.getExtras().getInt("priority");
        int v1 = jobParameters0.getExtras().getInt("attemptNumber");
        u.f(this.getApplicationContext());
        a p$a0 = p.a().b(s).d(x1.a.b(v));
        if(s1 != null) {
            p$a0.c(Base64.decode(s1, 0));
        }
        u.c().e().v(p$a0.a(), v1, () -> this.jobFinished(jobParameters0, false));
        return true;
    }

    @Override  // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters0) {
        return true;
    }
}

