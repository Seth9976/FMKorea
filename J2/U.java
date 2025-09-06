package j2;

import a2.e;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g2.f;
import java.util.concurrent.Executor;

public class u {
    private final SharedPreferences a;
    private final e b;
    private final Object c;
    TaskCompletionSource d;
    boolean e;
    private boolean f;
    private Boolean g;
    private final TaskCompletionSource h;

    public u(e e0) {
        Object object0 = new Object();
        this.c = object0;
        this.d = new TaskCompletionSource();
        this.e = false;
        this.f = false;
        this.h = new TaskCompletionSource();
        Context context0 = e0.j();
        this.b = e0;
        this.a = i.s(context0);
        Boolean boolean0 = this.b();
        if(boolean0 == null) {
            boolean0 = this.a(context0);
        }
        this.g = boolean0;
        synchronized(object0) {
            if(this.d()) {
                this.d.trySetResult(null);
                this.e = true;
            }
        }
    }

    private Boolean a(Context context0) {
        Boolean boolean0 = u.f(context0);
        if(boolean0 == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolean0));
    }

    private Boolean b() {
        if(this.a.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            return Boolean.valueOf(this.a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    public void c(boolean z) {
        if(!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.h.trySetResult(null);
    }

    public boolean d() {
        synchronized(this) {
            Boolean boolean0 = this.g;
            boolean z = boolean0 == null ? this.b.s() : boolean0.booleanValue();
            this.e(z);
            return z;
        }
    }

    private void e(boolean z) {
        String s;
        if(this.g == null) {
            s = "global Firebase setting";
        }
        else {
            s = this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        f.f().b(String.format("Crashlytics automatic data collection %s by %s.", (z ? "ENABLED" : "DISABLED"), s));
    }

    private static Boolean f(Context context0) {
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 != null) {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.fmkorea.m.fmk", 0x80);
                if(applicationInfo0 != null && (applicationInfo0.metaData != null && applicationInfo0.metaData.containsKey("firebase_crashlytics_collection_enabled"))) {
                    return Boolean.valueOf(applicationInfo0.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
                }
            }
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            f.f().e("Could not read data collection permission from manifest", packageManager$NameNotFoundException0);
        }
        return null;
    }

    public void g(Boolean boolean0) {
        synchronized(this) {
            if(boolean0 != null) {
                this.f = false;
            }
            this.g = boolean0 == null ? this.a(this.b.j()) : boolean0;
            u.h(this.a, boolean0);
            Object object0 = this.c;
            synchronized(object0) {
                if(!this.d()) {
                    if(this.e) {
                        this.d = new TaskCompletionSource();
                        this.e = false;
                    }
                }
                else if(!this.e) {
                    this.d.trySetResult(null);
                    this.e = true;
                }
            }
        }
    }

    private static void h(SharedPreferences sharedPreferences0, Boolean boolean0) {
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        if(boolean0 == null) {
            sharedPreferences$Editor0.remove("firebase_crashlytics_collection_enabled");
        }
        else {
            sharedPreferences$Editor0.putBoolean("firebase_crashlytics_collection_enabled", boolean0.booleanValue());
        }
        sharedPreferences$Editor0.apply();
    }

    public Task i() {
        synchronized(this.c) {
        }
        return this.d.getTask();
    }

    public Task j(Executor executor0) {
        Task task0 = this.i();
        return V.o(executor0, this.h.getTask(), task0);
    }
}

