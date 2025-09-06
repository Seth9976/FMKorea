package w0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import z0.c;
import z3.k;

public abstract class e extends h {
    private final BroadcastReceiver f;

    public e(Context context0, c c0) {
        public static final class a extends BroadcastReceiver {
            final e a;

            a(e e0) {
                this.a = e0;
                super();
            }

            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                k.e(context0, "context");
                k.e(intent0, "intent");
                this.a.k(intent0);
            }
        }

        k.e(context0, "context");
        k.e(c0, "taskExecutor");
        super(context0, c0);
        this.f = new a(this);
    }

    @Override  // w0.h
    public void h() {
        androidx.work.k.e().a("WM-BrdcstRcvrCnstrntTrc", this.getClass().getSimpleName() + ": registering receiver");
        IntentFilter intentFilter0 = this.j();
        this.d().registerReceiver(this.f, intentFilter0);
    }

    @Override  // w0.h
    public void i() {
        androidx.work.k.e().a("WM-BrdcstRcvrCnstrntTrc", this.getClass().getSimpleName() + ": unregistering receiver");
        this.d().unregisterReceiver(this.f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent arg1);
}

