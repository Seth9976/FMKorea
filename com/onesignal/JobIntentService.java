package com.onesignal;

import android.app.Service;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import jeb.synthetic.FIN;

abstract class JobIntentService extends Service {
    final class CommandProcessor extends AsyncTask {
        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.doInBackground(((Void[])arr_object));
        }

        protected Void doInBackground(Void[] arr_void) {
            GenericWorkItem jobIntentService$GenericWorkItem0;
            while((jobIntentService$GenericWorkItem0 = JobIntentService.this.a()) != null) {
                Intent intent0 = jobIntentService$GenericWorkItem0.getIntent();
                JobIntentService.this.g(intent0);
                jobIntentService$GenericWorkItem0.complete();
            }
            return null;
        }

        @Override  // android.os.AsyncTask
        protected void onCancelled(Object object0) {
            this.onCancelled(((Void)object0));
        }

        protected void onCancelled(Void void0) {
            JobIntentService.this.i();
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object object0) {
            this.onPostExecute(((Void)object0));
        }

        protected void onPostExecute(Void void0) {
            JobIntentService.this.i();
        }
    }

    interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        boolean mServiceProcessing;

        CompatWorkEnqueuer(Context context0, ComponentName componentName0) {
            super(componentName0);
            this.mContext = context0.getApplicationContext();
            PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
            PowerManager.WakeLock powerManager$WakeLock0 = powerManager0.newWakeLock(1, componentName0.getClassName() + ":launch");
            this.mLaunchWakeLock = powerManager$WakeLock0;
            powerManager$WakeLock0.setReferenceCounted(false);
            PowerManager.WakeLock powerManager$WakeLock1 = powerManager0.newWakeLock(1, componentName0.getClassName() + ":run");
            this.mRunWakeLock = powerManager$WakeLock1;
            powerManager$WakeLock1.setReferenceCounted(false);
        }

        @Override  // com.onesignal.JobIntentService$WorkEnqueuer
        void enqueueWork(Intent intent0) {
            Intent intent1 = new Intent(intent0);
            intent1.setComponent(this.mComponentName);
            if(this.mContext.startService(intent1) != null) {
                synchronized(this) {
                    if(!this.mLaunchingService) {
                        this.mLaunchingService = true;
                        if(!this.mServiceProcessing) {
                            this.mLaunchWakeLock.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override  // com.onesignal.JobIntentService$WorkEnqueuer
        public void serviceProcessingFinished() {
            synchronized(this) {
                if(this.mServiceProcessing) {
                    if(this.mLaunchingService) {
                        this.mLaunchWakeLock.acquire(60000L);
                    }
                    this.mServiceProcessing = false;
                    this.mRunWakeLock.release();
                }
            }
        }

        @Override  // com.onesignal.JobIntentService$WorkEnqueuer
        public void serviceProcessingStarted() {
            synchronized(this) {
                if(!this.mServiceProcessing) {
                    this.mServiceProcessing = true;
                    this.mRunWakeLock.acquire(600000L);
                    this.mLaunchWakeLock.release();
                }
            }
        }

        @Override  // com.onesignal.JobIntentService$WorkEnqueuer
        public void serviceStartReceived() {
            synchronized(this) {
                this.mLaunchingService = false;
            }
        }
    }

    final class CompatWorkItem implements GenericWorkItem {
        final Intent mIntent;
        final int mStartId;

        CompatWorkItem(Intent intent0, int v) {
            this.mIntent = intent0;
            this.mStartId = v;
        }

        @Override  // com.onesignal.JobIntentService$GenericWorkItem
        public void complete() {
            JobIntentService.this.stopSelf(this.mStartId);
        }

        @Override  // com.onesignal.JobIntentService$GenericWorkItem
        public Intent getIntent() {
            return this.mIntent;
        }
    }

    static class ComponentNameWithWakeful {
        private ComponentName componentName;
        private boolean useWakefulService;

        ComponentNameWithWakeful(ComponentName componentName0, boolean z) {
            this.componentName = componentName0;
            this.useWakefulService = z;
        }
    }

    interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        final class WrapperWorkItem implements GenericWorkItem {
            final JobWorkItem mJobWork;

            WrapperWorkItem(JobWorkItem jobWorkItem0) {
                this.mJobWork = jobWorkItem0;
            }

            @Override  // com.onesignal.JobIntentService$GenericWorkItem
            public void complete() {
                synchronized(JobServiceEngineImpl.this.mLock) {
                    JobParameters jobParameters0 = JobServiceEngineImpl.this.mParams;
                    if(jobParameters0 != null) {
                        try {
                            K.a(jobParameters0, this.mJobWork);
                        }
                        catch(SecurityException securityException0) {
                            Log.e("JobServiceEngineImpl", "SecurityException: Failed to run mParams.completeWork(mJobWork)!", securityException0);
                        }
                        catch(IllegalArgumentException illegalArgumentException0) {
                            Log.e("JobServiceEngineImpl", "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!", illegalArgumentException0);
                        }
                    }
                }
            }

            @Override  // com.onesignal.JobIntentService$GenericWorkItem
            public Intent getIntent() {
                return I.a(this.mJobWork);
            }
        }

        static final boolean DEBUG = false;
        static final String TAG = "JobServiceEngineImpl";
        final Object mLock;
        JobParameters mParams;
        final JobIntentService mService;

        JobServiceEngineImpl(JobIntentService jobIntentService0) {
            super(jobIntentService0);
            this.mLock = new Object();
            this.mService = jobIntentService0;
        }

        @Override  // com.onesignal.JobIntentService$CompatJobEngine
        public IBinder compatGetBinder() {
            return J.a(this);
        }

        @Override  // com.onesignal.JobIntentService$CompatJobEngine
        public GenericWorkItem dequeueWork() {
            JobWorkItem jobWorkItem0;
            Object object0 = this.mLock;
            __monitor_enter(object0);
            int v = FIN.finallyOpen$NT();
            JobParameters jobParameters0 = this.mParams;
            if(jobParameters0 == null) {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(object0);
                FIN.finallyCodeEnd$NT(v);
                return null;
            }
            try {
                jobWorkItem0 = H.a(jobParameters0);
                FIN.finallyExec$NT(v);
            }
            catch(SecurityException securityException0) {
                Log.e("JobServiceEngineImpl", "Failed to run mParams.dequeueWork()!", securityException0);
                FIN.finallyExec$NT(v);
                return null;
            }
            if(jobWorkItem0 != null) {
                I.a(jobWorkItem0).setExtrasClassLoader(this.mService.getClassLoader());
                return new WrapperWorkItem(this, jobWorkItem0);
            }
            return null;
        }

        @Override  // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters0) {
            this.mParams = jobParameters0;
            this.mService.e(false);
            return true;
        }

        @Override  // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters0) {
            boolean z = this.mService.b();
            synchronized(this.mLock) {
                this.mParams = null;
            }
            return z;
        }
    }

    static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        JobWorkEnqueuer(Context context0, ComponentName componentName0, int v) {
            super(componentName0);
            this.ensureJobId(v);
            this.mJobInfo = new JobInfo.Builder(v, this.mComponentName).setOverrideDeadline(0L).build();
            this.mJobScheduler = (JobScheduler)context0.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override  // com.onesignal.JobIntentService$WorkEnqueuer
        void enqueueWork(Intent intent0) {
            JobWorkItem jobWorkItem0 = M.a(intent0);
            L.a(this.mJobScheduler, this.mJobInfo, jobWorkItem0);
        }
    }

    static abstract class WorkEnqueuer {
        final ComponentName mComponentName;
        boolean mHasJobId;
        int mJobId;

        WorkEnqueuer(ComponentName componentName0) {
            this.mComponentName = componentName0;
        }

        abstract void enqueueWork(Intent arg1);

        void ensureJobId(int v) {
            if(!this.mHasJobId) {
                this.mHasJobId = true;
                this.mJobId = v;
                return;
            }
            if(this.mJobId != v) {
                throw new IllegalArgumentException("Given job ID " + v + " is different than previous " + this.mJobId);
            }
        }

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }
    }

    CompatJobEngine f;
    WorkEnqueuer g;
    CommandProcessor h;
    boolean i;
    boolean j;
    boolean k;
    final ArrayList l;
    static final Object m;
    static final HashMap n;

    static {
        JobIntentService.m = new Object();
        JobIntentService.n = new HashMap();
    }

    public JobIntentService() {
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = new ArrayList();
    }

    GenericWorkItem a() {
        CompatJobEngine jobIntentService$CompatJobEngine0 = this.f;
        if(jobIntentService$CompatJobEngine0 != null) {
            GenericWorkItem jobIntentService$GenericWorkItem0 = jobIntentService$CompatJobEngine0.dequeueWork();
            if(jobIntentService$GenericWorkItem0 != null) {
                return jobIntentService$GenericWorkItem0;
            }
        }
        synchronized(this.l) {
            return this.l.size() > 0 ? ((GenericWorkItem)this.l.remove(0)) : null;
        }
    }

    boolean b() {
        CommandProcessor jobIntentService$CommandProcessor0 = this.h;
        if(jobIntentService$CommandProcessor0 != null) {
            jobIntentService$CommandProcessor0.cancel(this.i);
        }
        this.j = true;
        return this.h();
    }

    public static void c(Context context0, ComponentName componentName0, int v, Intent intent0, boolean z) {
        if(intent0 == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized(JobIntentService.m) {
            WorkEnqueuer jobIntentService$WorkEnqueuer0 = JobIntentService.f(context0, componentName0, true, v, z);
            jobIntentService$WorkEnqueuer0.ensureJobId(v);
            try {
                jobIntentService$WorkEnqueuer0.enqueueWork(intent0);
            }
            catch(IllegalStateException illegalStateException0) {
                if(!z) {
                    throw illegalStateException0;
                }
                JobIntentService.f(context0, componentName0, true, v, false).enqueueWork(intent0);
            }
        }
    }

    public static void d(Context context0, Class class0, int v, Intent intent0, boolean z) {
        JobIntentService.c(context0, new ComponentName(context0, class0), v, intent0, z);
    }

    void e(boolean z) {
        if(this.h == null) {
            this.h = new CommandProcessor(this);
            WorkEnqueuer jobIntentService$WorkEnqueuer0 = this.g;
            if(jobIntentService$WorkEnqueuer0 != null && z) {
                jobIntentService$WorkEnqueuer0.serviceProcessingStarted();
            }
            this.h.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    static WorkEnqueuer f(Context context0, ComponentName componentName0, boolean z, int v, boolean z1) {
        CompatWorkEnqueuer jobIntentService$CompatWorkEnqueuer0;
        ComponentNameWithWakeful jobIntentService$ComponentNameWithWakeful0 = new ComponentNameWithWakeful(componentName0, z1);
        HashMap hashMap0 = JobIntentService.n;
        WorkEnqueuer jobIntentService$WorkEnqueuer0 = (WorkEnqueuer)hashMap0.get(jobIntentService$ComponentNameWithWakeful0);
        if(jobIntentService$WorkEnqueuer0 == null) {
            if(Build.VERSION.SDK_INT < 26 || z1) {
                jobIntentService$CompatWorkEnqueuer0 = new CompatWorkEnqueuer(context0, componentName0);
            }
            else {
                if(!z) {
                    throw new IllegalArgumentException("Can\'t be here without a job id");
                }
                jobIntentService$CompatWorkEnqueuer0 = new JobWorkEnqueuer(context0, componentName0, v);
            }
            jobIntentService$WorkEnqueuer0 = jobIntentService$CompatWorkEnqueuer0;
            hashMap0.put(jobIntentService$ComponentNameWithWakeful0, jobIntentService$WorkEnqueuer0);
        }
        return jobIntentService$WorkEnqueuer0;
    }

    protected abstract void g(Intent arg1);

    public boolean h() {
        return true;
    }

    void i() {
        ArrayList arrayList0 = this.l;
        if(arrayList0 != null) {
            synchronized(arrayList0) {
                this.h = null;
                if(this.l != null && this.l.size() > 0) {
                    this.e(false);
                }
                else if(!this.k) {
                    this.g.serviceProcessingFinished();
                }
            }
        }
    }

    @Override  // android.app.Service
    public IBinder onBind(Intent intent0) {
        return this.f == null ? null : this.f.compatGetBinder();
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        if(Build.VERSION.SDK_INT >= 26) {
            this.f = new JobServiceEngineImpl(this);
            this.g = null;
        }
        this.g = JobIntentService.f(this, new ComponentName(this, this.getClass()), false, 0, true);
    }

    @Override  // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.b();
        synchronized(this.l) {
            this.k = true;
            this.g.serviceProcessingFinished();
        }
    }

    @Override  // android.app.Service
    public int onStartCommand(Intent intent0, int v, int v1) {
        this.g.serviceStartReceived();
        synchronized(this.l) {
            ArrayList arrayList1 = this.l;
            if(intent0 == null) {
                intent0 = new Intent();
            }
            arrayList1.add(new CompatWorkItem(this, intent0, v1));
            this.e(true);
            return 3;
        }
    }
}

