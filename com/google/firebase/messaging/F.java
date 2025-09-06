package com.google.firebase.messaging;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.util.Log;
import androidx.core.app.m.b;
import androidx.core.app.m.e;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class f {
    private final ExecutorService a;
    private final Context b;
    private final G c;

    public f(Context context0, G g0, ExecutorService executorService0) {
        this.a = executorService0;
        this.b = context0;
        this.c = g0;
    }

    boolean a() {
        if(this.c.a("gcm.n.noui")) {
            return true;
        }
        if(this.b()) {
            return false;
        }
        C c0 = this.d();
        a d$a0 = d.e(this.b, this.c);
        this.e(d$a0.a, c0);
        this.c(d$a0);
        return true;
    }

    private boolean b() {
        if(((KeyguardManager)this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        int v = Process.myPid();
        List list0 = ((ActivityManager)this.b.getSystemService("activity")).getRunningAppProcesses();
        if(list0 != null) {
            for(Object object0: list0) {
                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                if(activityManager$RunningAppProcessInfo0.pid == v) {
                    return activityManager$RunningAppProcessInfo0.importance == 100;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    private void c(a d$a0) {
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        NotificationManager notificationManager0 = (NotificationManager)this.b.getSystemService("notification");
        Notification notification0 = d$a0.a.b();
        notificationManager0.notify(d$a0.b, d$a0.c, notification0);
    }

    private C d() {
        C c0 = C.g(this.c.p("gcm.n.image"));
        if(c0 != null) {
            c0.t(this.a);
        }
        return c0;
    }

    private void e(e m$e0, C c0) {
        if(c0 == null) {
            return;
        }
        try {
            Bitmap bitmap0 = (Bitmap)Tasks.await(c0.j(), 5L, TimeUnit.SECONDS);
            m$e0.s(bitmap0);
            m$e0.B(new b().i(bitmap0).h(null));
        }
        catch(ExecutionException executionException0) {
            Log.w("FirebaseMessaging", "Failed to download image: " + executionException0.getCause());
        }
        catch(InterruptedException unused_ex) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c0.close();
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException unused_ex) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c0.close();
        }
    }
}

