package w0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import z3.k;

public final class c extends e {
    public c(Context context0, z0.c c0) {
        k.e(context0, "context");
        k.e(c0, "taskExecutor");
        super(context0, c0);
    }

    @Override  // w0.h
    public Object e() {
        return this.l();
    }

    @Override  // w0.e
    public IntentFilter j() {
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter0.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter0;
    }

    @Override  // w0.e
    public void k(Intent intent0) {
        k.e(intent0, "intent");
        if(intent0.getAction() == null) {
            return;
        }
        androidx.work.k.e().a("WM-BatteryNotLowTracker", "Received " + intent0.getAction());
        String s = intent0.getAction();
        if(s != null) {
            switch(s) {
                case "android.intent.action.BATTERY_LOW": {
                    this.g(Boolean.FALSE);
                    return;
                }
                case "android.intent.action.BATTERY_OKAY": {
                    this.g(Boolean.TRUE);
                    break;
                }
            }
        }
    }

    public Boolean l() {
        boolean z = true;
        Intent intent0 = this.d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if(intent0 == null) {
            androidx.work.k.e().c("WM-BatteryNotLowTracker", "getInitialState - null intent received");
            return false;
        }
        if(intent0.getIntExtra("status", -1) != 1 && ((float)intent0.getIntExtra("level", -1)) / ((float)intent0.getIntExtra("scale", -1)) <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

