package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.collection.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class a0 {
    private final Context a;
    private final F b;
    private final A c;
    private final FirebaseMessaging d;
    private final Map e;
    private final ScheduledExecutorService f;
    private boolean g;
    private final Y h;
    private static final long i;

    static {
        a0.i = TimeUnit.HOURS.toSeconds(8L);
    }

    private a0(FirebaseMessaging firebaseMessaging0, F f0, Y y0, A a0, Context context0, ScheduledExecutorService scheduledExecutorService0) {
        this.e = new a();
        this.g = false;
        this.d = firebaseMessaging0;
        this.b = f0;
        this.h = y0;
        this.c = a0;
        this.a = context0;
        this.f = scheduledExecutorService0;
    }

    // 检测为 Lambda 实现
    public static a0 a(Context context0, ScheduledExecutorService scheduledExecutorService0, FirebaseMessaging firebaseMessaging0, F f0, A a0) [...]

    private static void b(Task task0) {
        try {
            Tasks.await(task0, 30L, TimeUnit.SECONDS);
            return;
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            if(throwable0 instanceof IOException) {
                throw (IOException)throwable0;
            }
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            throw new IOException(executionException0);
        }
        catch(InterruptedException | TimeoutException interruptedException0) {
            throw new IOException("SERVICE_NOT_AVAILABLE", interruptedException0);
        }
    }

    private void c(String s) {
        String s1 = this.d.i();
        a0.b(this.c.k(s1, s));
    }

    private void d(String s) {
        String s1 = this.d.i();
        a0.b(this.c.l(s1, s));
    }

    static Task e(FirebaseMessaging firebaseMessaging0, F f0, A a0, Context context0, ScheduledExecutorService scheduledExecutorService0) {
        return Tasks.call(scheduledExecutorService0, () -> a0.i(context0, scheduledExecutorService0, firebaseMessaging0, f0, a0));
    }

    boolean f() {
        return this.h.b() != null;
    }

    // 去混淆评级： 低(30)
    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    boolean h() {
        synchronized(this) {
        }
        return this.g;
    }

    private static a0 i(Context context0, ScheduledExecutorService scheduledExecutorService0, FirebaseMessaging firebaseMessaging0, F f0, A a0) {
        return new a0(firebaseMessaging0, f0, Y.a(context0, scheduledExecutorService0), a0, context0, scheduledExecutorService0);
    }

    private void j(X x0) {
        synchronized(this.e) {
            String s = x0.e();
            if(!this.e.containsKey(s)) {
                return;
            }
            ArrayDeque arrayDeque0 = (ArrayDeque)this.e.get(s);
            TaskCompletionSource taskCompletionSource0 = (TaskCompletionSource)arrayDeque0.poll();
            if(taskCompletionSource0 != null) {
                taskCompletionSource0.setResult(null);
            }
            if(arrayDeque0.isEmpty()) {
                this.e.remove(s);
            }
        }
    }

    boolean k(X x0) {
        try {
            switch(x0.b()) {
                case "S": {
                    this.c(x0.c());
                    if(a0.g()) {
                        Log.d("FirebaseMessaging", "Subscribe to topic: " + x0.c() + " succeeded.");
                        return true;
                    }
                    break;
                }
                case "U": {
                    this.d(x0.c());
                    if(a0.g()) {
                        Log.d("FirebaseMessaging", "Unsubscribe from topic: " + x0.c() + " succeeded.");
                        return true;
                    }
                    break;
                }
                default: {
                    if(a0.g()) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + x0 + ".");
                        return true;
                    }
                }
            }
            return true;
        }
        catch(IOException iOException0) {
        }
        if(!"SERVICE_NOT_AVAILABLE".equals(iOException0.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(iOException0.getMessage())) {
            if(iOException0.getMessage() != null) {
                throw iOException0;
            }
            Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
            return false;
        }
        Log.e("FirebaseMessaging", "Topic operation failed: " + iOException0.getMessage() + ". Will retry Topic operation.");
        return false;
    }

    void l(Runnable runnable0, long v) {
        this.f.schedule(runnable0, v, TimeUnit.SECONDS);
    }

    void m(boolean z) {
        synchronized(this) {
            this.g = z;
        }
    }

    private void n() {
        if(!this.h()) {
            this.q(0L);
        }
    }

    void o() {
        if(this.f()) {
            this.n();
        }
    }

    boolean p() {
        X x0;
        while(true) {
            synchronized(this) {
                x0 = this.h.b();
                if(x0 == null) {
                    if(a0.g()) {
                        Log.d("FirebaseMessaging", "topic sync succeeded");
                    }
                    return true;
                }
            }
            if(!this.k(x0)) {
                return false;
            }
            this.h.d(x0);
            this.j(x0);
        }
    }

    void q(long v) {
        this.l(new b0(this, this.a, this.b, Math.min(Math.max(30L, 2L * v), a0.i)), v);
        this.m(true);
    }
}

