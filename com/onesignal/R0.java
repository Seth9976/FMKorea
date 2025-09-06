package com.onesignal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

abstract class r0 {
    protected boolean a;
    private Thread b;
    protected static final Object c;

    static {
        r0.c = new Object();
    }

    r0() {
        this.a = false;
    }

    protected void a(Context context0) {
        I1.p1(C.k, this.getClass().getSimpleName() + " cancel background sync");
        synchronized(r0.c) {
            ((JobScheduler)context0.getSystemService("jobscheduler")).cancel(this.e());
        }
    }

    void b(Context context0, Runnable runnable0) {
        I1.p1(C.k, "OSBackground sync, calling initWithContext");
        I1.X0(context0);
        Thread thread0 = new Thread(runnable0, this.f());
        this.b = thread0;
        OSUtils.W(thread0);
    }

    protected abstract Class c();

    protected abstract Class d();

    protected abstract int e();

    protected abstract String f();

    private boolean g(Context context0) {
        return h.a(context0, "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private boolean h(Context context0) {
        for(Object object0: ((JobScheduler)context0.getSystemService("jobscheduler")).getAllPendingJobs()) {
            if(((JobInfo)object0).getId() == this.e() && (this.b != null && this.b.isAlive())) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    protected void i(Context context0, long v) {
        synchronized(r0.c) {
            this.k(context0, v);
        }
    }

    private void j(Context context0, long v) {
        I1.a(C.l, this.getClass().getSimpleName() + " scheduleServiceSyncTask:atTime: " + v);
        PendingIntent pendingIntent0 = this.m(context0);
        ((AlarmManager)context0.getSystemService("alarm")).set(0, I1.H0().a() + v, pendingIntent0);
    }

    private void k(Context context0, long v) {
        C i1$C0 = C.l;
        I1.a(i1$C0, "OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + v);
        if(this.h(context0)) {
            I1.a(i1$C0, "OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!");
            this.a = true;
            return;
        }
        JobInfo.Builder jobInfo$Builder0 = new JobInfo.Builder(this.e(), new ComponentName(context0, this.c()));
        jobInfo$Builder0.setMinimumLatency(v).setRequiredNetworkType(1);
        if(this.g(context0)) {
            jobInfo$Builder0.setPersisted(true);
        }
        JobScheduler jobScheduler0 = (JobScheduler)context0.getSystemService("jobscheduler");
        try {
            int v1 = jobScheduler0.schedule(jobInfo$Builder0.build());
            I1.a(C.j, "OSBackgroundSync scheduleSyncServiceAsJob:result: " + v1);
        }
        catch(NullPointerException nullPointerException0) {
            I1.b(C.h, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", nullPointerException0);
        }
    }

    boolean l() {
        Thread thread0 = this.b;
        if(thread0 == null) {
            return false;
        }
        if(!thread0.isAlive()) {
            return false;
        }
        this.b.interrupt();
        return true;
    }

    private PendingIntent m(Context context0) {
        return PendingIntent.getService(context0, this.e(), new Intent(context0, this.d()), 0xC000000);
    }

    private static boolean n() [...] // Inlined contents
}

