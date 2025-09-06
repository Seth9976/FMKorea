package t1;

import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import m1.p;
import q1.a;

public class d implements x {
    private final Context a;
    private final u1.d b;
    private final f c;

    public d(Context context0, u1.d d0, f f0) {
        this.a = context0;
        this.b = d0;
        this.c = f0;
    }

    @Override  // t1.x
    public void a(p p0, int v, boolean z) {
        ComponentName componentName0 = new ComponentName(this.a, JobInfoSchedulerService.class);
        Object object0 = this.a.getSystemService("jobscheduler");
        int v1 = this.c(p0);
        if(!z && this.d(((JobScheduler)object0), v1, v)) {
            a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", p0);
            return;
        }
        long v2 = this.b.u(p0);
        JobInfo.Builder jobInfo$Builder0 = new JobInfo.Builder(v1, componentName0);
        k1.d d0 = p0.d();
        JobInfo.Builder jobInfo$Builder1 = this.c.c(jobInfo$Builder0, d0, v2, v);
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("attemptNumber", v);
        persistableBundle0.putString("backendName", p0.b());
        persistableBundle0.putInt("priority", x1.a.a(p0.d()));
        if(p0.c() != null) {
            persistableBundle0.putString("extras", Base64.encodeToString(p0.c(), 0));
        }
        jobInfo$Builder1.setExtras(persistableBundle0);
        k1.d d1 = p0.d();
        a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[]{p0, v1, this.c.g(d1, v2, v), v2, v});
        ((JobScheduler)object0).schedule(jobInfo$Builder1.build());
    }

    @Override  // t1.x
    public void b(p p0, int v) {
        this.a(p0, v, false);
    }

    int c(p p0) {
        Adler32 adler320 = new Adler32();
        adler320.update("com.fmkorea.m.fmk".getBytes(Charset.forName("UTF-8")));
        adler320.update(p0.b().getBytes(Charset.forName("UTF-8")));
        adler320.update(ByteBuffer.allocate(4).putInt(x1.a.a(p0.d())).array());
        if(p0.c() != null) {
            adler320.update(p0.c());
        }
        return (int)adler320.getValue();
    }

    private boolean d(JobScheduler jobScheduler0, int v, int v1) {
        for(Object object0: jobScheduler0.getAllPendingJobs()) {
            int v2 = ((JobInfo)object0).getExtras().getInt("attemptNumber");
            if(((JobInfo)object0).getId() == v) {
                return v2 >= v1;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

