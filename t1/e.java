package t1;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

public final class e implements Runnable {
    public final JobInfoSchedulerService f;
    public final JobParameters g;

    public e(JobInfoSchedulerService jobInfoSchedulerService0, JobParameters jobParameters0) {
        this.f = jobInfoSchedulerService0;
        this.g = jobParameters0;
    }

    @Override
    public final void run() {
        this.f.b(this.g);
    }
}

