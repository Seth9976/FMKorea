package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver.PendingResult;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.F;
import androidx.work.k;
import y0.q;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    static final String a;

    static {
        ConstraintProxyUpdateReceiver.a = "WM-ConstrntProxyUpdtRec";
    }

    public static Intent a(Context context0, boolean z, boolean z1, boolean z2, boolean z3) {
        Intent intent0 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent0.setComponent(new ComponentName(context0, ConstraintProxyUpdateReceiver.class));
        intent0.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z1).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z3);
        return intent0;
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        class a implements Runnable {
            final Intent f;
            final Context g;
            final BroadcastReceiver.PendingResult h;
            final ConstraintProxyUpdateReceiver i;

            a(Intent intent0, Context context0, BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0) {
                this.f = intent0;
                this.g = context0;
                this.h = broadcastReceiver$PendingResult0;
                super();
            }

            @Override
            public void run() {
                try {
                    boolean z = this.f.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean z1 = this.f.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean z2 = this.f.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean z3 = this.f.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    k.e().a("WM-ConstrntProxyUpdtRec", "Updating proxies: (BatteryNotLowProxy (" + z + "), BatteryChargingProxy (" + z1 + "), StorageNotLowProxy (" + z2 + "), NetworkStateProxy (" + z3 + "), ");
                    q.a(this.g, BatteryNotLowProxy.class, z);
                    q.a(this.g, BatteryChargingProxy.class, z1);
                    q.a(this.g, StorageNotLowProxy.class, z2);
                    q.a(this.g, NetworkStateProxy.class, z3);
                }
                finally {
                    this.h.finish();
                }
            }
        }

        String s = intent0 == null ? null : intent0.getAction();
        if(!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(s)) {
            k.e().a("WM-ConstrntProxyUpdtRec", "Ignoring unknown action " + s);
            return;
        }
        BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.goAsync();
        F.m(context0).s().c(new a(this, intent0, context0, broadcastReceiver$PendingResult0));
    }
}

