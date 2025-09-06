package w0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import z0.c;
import z3.k;

public final class a extends e {
    public a(Context context0, c c0) {
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
        intentFilter0.addAction("android.os.action.CHARGING");
        intentFilter0.addAction("android.os.action.DISCHARGING");
        return intentFilter0;
    }

    @Override  // w0.e
    public void k(Intent intent0) {
        k.e(intent0, "intent");
        String s = intent0.getAction();
        if(s == null) {
            return;
        }
        androidx.work.k.e().a("WM-BatteryChrgTracker", "Received " + s);
        switch(s) {
            case "android.intent.action.ACTION_POWER_CONNECTED": {
                this.g(Boolean.TRUE);
                return;
            }
            case "android.intent.action.ACTION_POWER_DISCONNECTED": {
                this.g(Boolean.FALSE);
                return;
            }
            case "android.os.action.CHARGING": {
                this.g(Boolean.TRUE);
                return;
            }
            case "android.os.action.DISCHARGING": {
                this.g(Boolean.FALSE);
            }
        }
    }

    public Boolean l() {
        Intent intent0 = this.d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if(intent0 == null) {
            androidx.work.k.e().c("WM-BatteryChrgTracker", "getInitialState - null intent received");
            return false;
        }
        return Boolean.valueOf(this.m(intent0));
    }

    private final boolean m(Intent intent0) {
        switch(intent0.getIntExtra("status", -1)) {
            case 2: 
            case 5: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

