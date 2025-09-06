package androidx.work.impl.background.systemjob;

import B.a;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.work.impl.F;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.t;
import androidx.work.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import x0.i;
import x0.m;
import x0.u;
import x0.v;
import x0.x;

public class l implements t {
    private final Context f;
    private final JobScheduler g;
    private final F h;
    private final k i;
    private static final String j;

    static {
        l.j = "WM-SystemJobScheduler";
    }

    public l(Context context0, F f0) {
        this(context0, f0, ((JobScheduler)context0.getSystemService("jobscheduler")), new k(context0));
    }

    public l(Context context0, F f0, JobScheduler jobScheduler0, k k0) {
        this.f = context0;
        this.h = f0;
        this.g = jobScheduler0;
        this.i = k0;
    }

    public static void a(Context context0) {
        JobScheduler jobScheduler0 = (JobScheduler)context0.getSystemService("jobscheduler");
        if(jobScheduler0 != null) {
            List list0 = l.g(context0, jobScheduler0);
            if(list0 != null && !list0.isEmpty()) {
                for(Object object0: list0) {
                    l.e(jobScheduler0, ((JobInfo)object0).getId());
                }
            }
        }
    }

    @Override  // androidx.work.impl.t
    public boolean b() {
        return true;
    }

    @Override  // androidx.work.impl.t
    public void c(String s) {
        List list0 = l.f(this.f, this.g, s);
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                l.e(this.g, ((int)(((Integer)object0))));
            }
            this.h.r().F().e(s);
        }
    }

    @Override  // androidx.work.impl.t
    public void d(u[] arr_u) {
        WorkDatabase workDatabase0 = this.h.r();
        y0.k k0 = new y0.k(workDatabase0);
        for(int v = 0; v < arr_u.length; ++v) {
            u u0 = arr_u[v];
            workDatabase0.e();
            try {
                u u1 = workDatabase0.I().o(u0.a);
                if(u1 == null) {
                    androidx.work.k.e().k("WM-SystemJobScheduler", "Skipping scheduling " + u0.a + " because it\'s no longer in the DB");
                }
                else if(u1.b == androidx.work.t.f) {
                    m m0 = x.a(u0);
                    i i0 = workDatabase0.F().a(m0);
                    int v2 = i0 == null ? k0.e(this.h.k().i(), this.h.k().g()) : i0.c;
                    if(i0 == null) {
                        i i1 = x0.l.a(m0, v2);
                        this.h.r().F().g(i1);
                    }
                    this.j(u0, v2);
                    if(Build.VERSION.SDK_INT == 23) {
                        List list0 = l.f(this.f, this.g, u0.a);
                        if(list0 != null) {
                            int v3 = list0.indexOf(v2);
                            if(v3 >= 0) {
                                list0.remove(v3);
                            }
                            this.j(u0, (list0.isEmpty() ? k0.e(this.h.k().i(), this.h.k().g()) : ((int)(((Integer)list0.get(0))))));
                        }
                    }
                }
                else {
                    androidx.work.k.e().k("WM-SystemJobScheduler", "Skipping scheduling " + u0.a + " because it is no longer enqueued");
                }
                workDatabase0.A();
            }
            finally {
                workDatabase0.i();
            }
        }
    }

    private static void e(JobScheduler jobScheduler0, int v) {
        try {
            jobScheduler0.cancel(v);
        }
        catch(Throwable throwable0) {
            androidx.work.k.e().d("WM-SystemJobScheduler", String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", v), throwable0);
        }
    }

    private static List f(Context context0, JobScheduler jobScheduler0, String s) {
        List list0 = l.g(context0, jobScheduler0);
        if(list0 == null) {
            return null;
        }
        List list1 = new ArrayList(2);
        for(Object object0: list0) {
            JobInfo jobInfo0 = (JobInfo)object0;
            m m0 = l.h(jobInfo0);
            if(m0 != null && s.equals(m0.b())) {
                list1.add(jobInfo0.getId());
            }
        }
        return list1;
    }

    private static List g(Context context0, JobScheduler jobScheduler0) {
        List list0;
        try {
            list0 = jobScheduler0.getAllPendingJobs();
        }
        catch(Throwable throwable0) {
            androidx.work.k.e().d("WM-SystemJobScheduler", "getAllPendingJobs() is not reliable on this device.", throwable0);
            list0 = null;
        }
        if(list0 == null) {
            return null;
        }
        List list1 = new ArrayList(list0.size());
        ComponentName componentName0 = new ComponentName(context0, SystemJobService.class);
        for(Object object0: list0) {
            JobInfo jobInfo0 = (JobInfo)object0;
            if(componentName0.equals(jobInfo0.getService())) {
                list1.add(jobInfo0);
            }
        }
        return list1;
    }

    private static m h(JobInfo jobInfo0) {
        PersistableBundle persistableBundle0 = jobInfo0.getExtras();
        if(persistableBundle0 != null) {
            try {
                if(persistableBundle0.containsKey("EXTRA_WORK_SPEC_ID")) {
                    int v = persistableBundle0.getInt("EXTRA_WORK_SPEC_GENERATION", 0);
                    return new m(persistableBundle0.getString("EXTRA_WORK_SPEC_ID"), v);
                }
                return null;
            }
            catch(NullPointerException unused_ex) {
            }
        }
        return null;
    }

    public static boolean i(Context context0, F f0) {
        JobScheduler jobScheduler0 = (JobScheduler)context0.getSystemService("jobscheduler");
        List list0 = l.g(context0, jobScheduler0);
        List list1 = f0.r().F().b();
        boolean z = false;
        HashSet hashSet0 = new HashSet((list0 == null ? 0 : list0.size()));
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                JobInfo jobInfo0 = (JobInfo)object0;
                m m0 = l.h(jobInfo0);
                if(m0 == null) {
                    l.e(jobScheduler0, jobInfo0.getId());
                }
                else {
                    hashSet0.add(m0.b());
                }
            }
        }
        for(Object object1: list1) {
            if(!hashSet0.contains(((String)object1))) {
                androidx.work.k.e().a("WM-SystemJobScheduler", "Reconciling jobs");
                z = true;
                break;
            }
            if(false) {
                break;
            }
        }
        if(z) {
            WorkDatabase workDatabase0 = f0.r();
            workDatabase0.e();
            try {
                v v1 = workDatabase0.I();
                for(Object object2: list1) {
                    v1.c(((String)object2), -1L);
                }
                workDatabase0.A();
                return true;
            }
            finally {
                workDatabase0.i();
            }
        }
        return false;
    }

    public void j(u u0, int v) {
        JobInfo jobInfo0 = this.i.a(u0, v);
        androidx.work.k.e().a("WM-SystemJobScheduler", "Scheduling work ID " + u0.a + "Job ID " + v);
        try {
            if(this.g.schedule(jobInfo0) == 0) {
                androidx.work.k.e().k("WM-SystemJobScheduler", "Unable to schedule work ID " + u0.a);
                if(u0.q && u0.r == o.f) {
                    u0.q = false;
                    androidx.work.k.e().a("WM-SystemJobScheduler", String.format("Scheduling a non-expedited job (work ID %s)", u0.a));
                    this.j(u0, v);
                }
            }
        }
        catch(IllegalStateException illegalStateException0) {
            List list0 = l.g(this.f, this.g);
            String s = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", ((int)(list0 == null ? 0 : list0.size())), this.h.r().I().i().size(), this.h.k().h());
            androidx.work.k.e().c("WM-SystemJobScheduler", s);
            IllegalStateException illegalStateException1 = new IllegalStateException(s, illegalStateException0);
            a a0 = this.h.k().l();
            if(a0 == null) {
                throw illegalStateException1;
            }
            a0.a(illegalStateException1);
        }
        catch(Throwable throwable0) {
            androidx.work.k.e().d("WM-SystemJobScheduler", "Unable to schedule " + u0, throwable0);
        }
    }
}

