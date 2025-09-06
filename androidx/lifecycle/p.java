package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import z3.k;

public abstract class p extends Service implements n {
    private final G f;

    public p() {
        this.f = new G(this);
    }

    @Override  // androidx.lifecycle.n
    public h getLifecycle() {
        return this.f.a();
    }

    @Override  // android.app.Service
    public IBinder onBind(Intent intent0) {
        k.e(intent0, "intent");
        this.f.b();
        return null;
    }

    @Override  // android.app.Service
    public void onCreate() {
        this.f.c();
        super.onCreate();
    }

    @Override  // android.app.Service
    public void onDestroy() {
        this.f.d();
        super.onDestroy();
    }

    @Override  // android.app.Service
    public void onStart(Intent intent0, int v) {
        this.f.e();
        super.onStart(intent0, v);
    }

    @Override  // android.app.Service
    public int onStartCommand(Intent intent0, int v, int v1) {
        return super.onStartCommand(intent0, v, v1);
    }
}

