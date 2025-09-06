package w0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import u0.b;
import z0.c;
import z3.k;

public final class l extends e {
    private final ConnectivityManager g;

    public l(Context context0, c c0) {
        k.e(context0, "context");
        k.e(c0, "taskExecutor");
        super(context0, c0);
        Object object0 = this.d().getSystemService("connectivity");
        k.c(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.g = (ConnectivityManager)object0;
    }

    @Override  // w0.h
    public Object e() {
        return this.l();
    }

    @Override  // w0.e
    public IntentFilter j() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override  // w0.e
    public void k(Intent intent0) {
        k.e(intent0, "intent");
        if(k.a(intent0.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            androidx.work.k.e().a("WM-NetworkStateTracker", "Network broadcast received");
            this.g(w0.k.c(this.g));
        }
    }

    public b l() {
        return w0.k.c(this.g);
    }
}

