package w0;

import android.content.Context;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import u0.b;
import y0.m;
import y0.p;
import z0.c;
import z3.k;

public final class j extends h {
    private final ConnectivityManager f;
    private final a g;

    public j(Context context0, c c0) {
        public static final class a extends ConnectivityManager.NetworkCallback {
            final j a;

            a(j j0) {
                this.a = j0;
                super();
            }

            @Override  // android.net.ConnectivityManager$NetworkCallback
            public void onCapabilitiesChanged(Network network0, NetworkCapabilities networkCapabilities0) {
                k.e(network0, "network");
                k.e(networkCapabilities0, "capabilities");
                androidx.work.k.e().a("WM-NetworkStateTracker", "Network capabilities changed: " + networkCapabilities0);
                b b0 = w0.k.c(j.j(this.a));
                this.a.g(b0);
            }

            @Override  // android.net.ConnectivityManager$NetworkCallback
            public void onLost(Network network0) {
                k.e(network0, "network");
                androidx.work.k.e().a("WM-NetworkStateTracker", "Network connection lost");
                b b0 = w0.k.c(this.a.f);
                this.a.g(b0);
            }
        }

        k.e(context0, "context");
        k.e(c0, "taskExecutor");
        super(context0, c0);
        Object object0 = this.d().getSystemService("connectivity");
        k.c(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager)object0;
        this.g = new a(this);
    }

    @Override  // w0.h
    public Object e() {
        return this.k();
    }

    @Override  // w0.h
    public void h() {
        try {
            androidx.work.k.e().a("WM-NetworkStateTracker", "Registering network callback");
            p.a(this.f, this.g);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            androidx.work.k.e().d("WM-NetworkStateTracker", "Received exception while registering network callback", illegalArgumentException0);
        }
        catch(SecurityException securityException0) {
            androidx.work.k.e().d("WM-NetworkStateTracker", "Received exception while registering network callback", securityException0);
        }
    }

    @Override  // w0.h
    public void i() {
        try {
            androidx.work.k.e().a("WM-NetworkStateTracker", "Unregistering network callback");
            m.c(this.f, this.g);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            androidx.work.k.e().d("WM-NetworkStateTracker", "Received exception while unregistering network callback", illegalArgumentException0);
        }
        catch(SecurityException securityException0) {
            androidx.work.k.e().d("WM-NetworkStateTracker", "Received exception while unregistering network callback", securityException0);
        }
    }

    public b k() {
        return w0.k.c(this.f);
    }
}

