package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.p;
import androidx.work.k;

public class SystemForegroundService extends p implements b {
    static abstract class d {
        static void a(Service service0, int v, Notification notification0, int v1) {
            service0.startForeground(v, notification0, v1);
        }
    }

    static abstract class e {
        static void a(Service service0, int v, Notification notification0, int v1) {
            try {
                service0.startForeground(v, notification0, v1);
            }
            catch(ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException0) {
                k.e().l("WM-SystemFgService", "Unable to start foreground service", foregroundServiceStartNotAllowedException0);
            }
        }
    }

    private Handler g;
    private boolean h;
    androidx.work.impl.foreground.b i;
    NotificationManager j;
    private static final String k;
    private static SystemForegroundService l;

    static {
        SystemForegroundService.k = "WM-SystemFgService";
        SystemForegroundService.l = null;
    }

    @Override  // androidx.work.impl.foreground.b$b
    public void b(int v, int v1, Notification notification0) {
        class a implements Runnable {
            final int f;
            final Notification g;
            final int h;
            final SystemForegroundService i;

            a(int v, Notification notification0, int v1) {
                this.f = v;
                this.g = notification0;
                this.h = v1;
                super();
            }

            @Override
            public void run() {
                int v = Build.VERSION.SDK_INT;
                if(v >= 0x1F) {
                    e.a(SystemForegroundService.this, this.f, this.g, this.h);
                    return;
                }
                if(v >= 29) {
                    d.a(SystemForegroundService.this, this.f, this.g, this.h);
                    return;
                }
                SystemForegroundService.this.startForeground(this.f, this.g);
            }
        }

        this.g.post(new a(this, v, notification0, v1));
    }

    @Override  // androidx.work.impl.foreground.b$b
    public void c(int v, Notification notification0) {
        class androidx.work.impl.foreground.SystemForegroundService.b implements Runnable {
            final int f;
            final Notification g;
            final SystemForegroundService h;

            androidx.work.impl.foreground.SystemForegroundService.b(int v, Notification notification0) {
                this.f = v;
                this.g = notification0;
                super();
            }

            @Override
            public void run() {
                SystemForegroundService.this.j.notify(this.f, this.g);
            }
        }

        this.g.post(new androidx.work.impl.foreground.SystemForegroundService.b(this, v, notification0));
    }

    @Override  // androidx.work.impl.foreground.b$b
    public void d(int v) {
        class c implements Runnable {
            final int f;
            final SystemForegroundService g;

            c(int v) {
                this.f = v;
                super();
            }

            @Override
            public void run() {
                SystemForegroundService.this.j.cancel(this.f);
            }
        }

        this.g.post(new c(this, v));
    }

    // 去混淆评级： 低(20)
    static String e() [...] // 潜在的解密器

    private void g() {
        this.g = new Handler(Looper.getMainLooper());
        this.j = (NotificationManager)this.getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.b b0 = new androidx.work.impl.foreground.b(this.getApplicationContext());
        this.i = b0;
        b0.n(this);
    }

    @Override  // androidx.lifecycle.p
    public void onCreate() {
        super.onCreate();
        SystemForegroundService.l = this;
        this.g();
    }

    @Override  // androidx.lifecycle.p
    public void onDestroy() {
        super.onDestroy();
        this.i.l();
    }

    @Override  // androidx.lifecycle.p
    public int onStartCommand(Intent intent0, int v, int v1) {
        super.onStartCommand(intent0, v, v1);
        if(this.h) {
            k.e().f("WM-SystemFgService", "Re-initializing SystemForegroundService after a request to shut-down.");
            this.i.l();
            this.g();
            this.h = false;
        }
        if(intent0 != null) {
            this.i.m(intent0);
        }
        return 3;
    }

    @Override  // androidx.work.impl.foreground.b$b
    public void stop() {
        this.h = true;
        k.e().a("WM-SystemFgService", "All commands completed.");
        if(Build.VERSION.SDK_INT >= 26) {
            this.stopForeground(true);
        }
        SystemForegroundService.l = null;
        this.stopSelf();
    }
}

