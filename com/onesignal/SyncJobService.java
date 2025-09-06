package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;

public class SyncJobService extends JobService {
    @Override  // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters0) {
        q1.q().b(this, new b(this, jobParameters0));
        return true;
    }

    @Override  // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters0) {
        boolean z = q1.q().l();
        I1.a(C.k, "SyncJobService onStopJob called, system conditions not available reschedule: " + z);
        return z;
    }
}

