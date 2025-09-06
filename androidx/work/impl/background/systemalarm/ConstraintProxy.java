package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.c;
import androidx.work.k;
import androidx.work.l;
import java.util.List;
import x0.u;

abstract class ConstraintProxy extends BroadcastReceiver {
    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override  // androidx.work.impl.background.systemalarm.ConstraintProxy
        public void onReceive(Context context0, Intent intent0) {
            super.onReceive(context0, intent0);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override  // androidx.work.impl.background.systemalarm.ConstraintProxy
        public void onReceive(Context context0, Intent intent0) {
            super.onReceive(context0, intent0);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override  // androidx.work.impl.background.systemalarm.ConstraintProxy
        public void onReceive(Context context0, Intent intent0) {
            super.onReceive(context0, intent0);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override  // androidx.work.impl.background.systemalarm.ConstraintProxy
        public void onReceive(Context context0, Intent intent0) {
            super.onReceive(context0, intent0);
        }
    }

    private static final String a;

    static {
        ConstraintProxy.a = "WM-ConstraintProxy";
    }

    static void a(Context context0, List list0) {
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        for(Object object0: list0) {
            c c0 = ((u)object0).j;
            z |= c0.f();
            z1 |= c0.g();
            z2 |= c0.i();
            z3 |= c0.d() != l.f;
            if(z && z1 && z2 && z3) {
                break;
            }
        }
        context0.sendBroadcast(ConstraintProxyUpdateReceiver.a(context0, z, z1, z2, z3));
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        k.e().a("WM-ConstraintProxy", "onReceive : " + intent0);
        context0.startService(b.a(context0));
    }
}

