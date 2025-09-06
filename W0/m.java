package w0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import z0.c;
import z3.k;

public final class m extends e {
    public m(Context context0, c c0) {
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
        intentFilter0.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter0.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter0;
    }

    @Override  // w0.e
    public void k(Intent intent0) {
        k.e(intent0, "intent");
        if(intent0.getAction() == null) {
            return;
        }
        androidx.work.k.e().a("WM-StorageNotLowTracker", "Received " + intent0.getAction());
        String s = intent0.getAction();
        if(s != null) {
            switch(s) {
                case "android.intent.action.DEVICE_STORAGE_LOW": {
                    this.g(Boolean.FALSE);
                    break;
                }
                case "android.intent.action.DEVICE_STORAGE_OK": {
                    this.g(Boolean.TRUE);
                }
            }
        }
    }

    public Boolean l() {
        Intent intent0 = this.d().registerReceiver(null, this.j());
        boolean z = true;
        if(intent0 != null && intent0.getAction() != null) {
            String s = intent0.getAction();
            if(s == null || s.hashCode() != -730838620 || !s.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}

