package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class i0 implements ServiceConnection {
    static class a {
        final Intent a;
        private final TaskCompletionSource b;

        a(Intent intent0) {
            this.b = new TaskCompletionSource();
            this.a = intent0;
        }

        // 检测为 Lambda 实现
        public static void a(ScheduledFuture scheduledFuture0, Task task0) [...]

        // 检测为 Lambda 实现
        public static void b(a i0$a0) [...]

        void c(ScheduledExecutorService scheduledExecutorService0) {
            boolean z = (this.a.getFlags() & 0x10000000) != 0;
            this.e().addOnCompleteListener(scheduledExecutorService0, (Task task0) -> a.g(scheduledExecutorService0.schedule(() -> i0$a0.f(), (z ? d0.a : 9000L), TimeUnit.MILLISECONDS), task0));
        }

        void d() {
            this.b.trySetResult(null);
        }

        Task e() {
            return this.b.getTask();
        }

        private void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.a.getAction() + " Releasing WakeLock.");
            this.d();
        }

        private static void g(ScheduledFuture scheduledFuture0, Task task0) {
            scheduledFuture0.cancel(false);
        }
    }

    private final Context f;
    private final Intent g;
    private final ScheduledExecutorService h;
    private final Queue i;
    private f0 j;
    private boolean k;

    i0(Context context0, String s) {
        this(context0, s, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    i0(Context context0, String s, ScheduledExecutorService scheduledExecutorService0) {
        this.i = new ArrayDeque();
        this.k = false;
        this.f = context0.getApplicationContext();
        this.g = new Intent(s).setPackage("com.fmkorea.m.fmk");
        this.h = scheduledExecutorService0;
    }

    private void a() {
        while(!this.i.isEmpty()) {
            ((a)this.i.poll()).d();
        }
    }

    private void b() {
        synchronized(this) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while(!this.i.isEmpty()) {
                if(Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                if(this.j != null && this.j.isBinderAlive()) {
                    if(Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    a i0$a0 = (a)this.i.poll();
                    this.j.c(i0$a0);
                    continue;
                }
                this.d();
                return;
            }
        }
    }

    Task c(Intent intent0) {
        synchronized(this) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            a i0$a0 = new a(intent0);
            i0$a0.c(this.h);
            this.i.add(i0$a0);
            this.b();
            return i0$a0.e();
        }
    }

    private void d() {
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "binder is dead. start connection? " + !this.k);
        }
        if(this.k) {
            return;
        }
        try {
            this.k = true;
            if(ConnectionTracker.getInstance().bindService(this.f, this.g, this, 65)) {
                return;
            }
            Log.e("FirebaseMessaging", "binding to the service failed");
        }
        catch(SecurityException securityException0) {
            Log.e("FirebaseMessaging", "Exception while binding the service", securityException0);
        }
        this.k = false;
        this.a();
    }

    @Override  // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        synchronized(this) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName0);
            }
            this.k = false;
            if(!(iBinder0 instanceof f0)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder0);
                this.a();
                return;
            }
            this.j = (f0)iBinder0;
            this.b();
        }
    }

    @Override  // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName0) {
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName0);
        }
        this.b();
    }
}

