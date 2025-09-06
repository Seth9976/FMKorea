package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.F;
import androidx.work.k;

public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a;

    static {
        RescheduleReceiver.a = "WM-RescheduleReceiver";
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        k.e().a("WM-RescheduleReceiver", "Received intent " + intent0);
        try {
            F.m(context0).w(this.goAsync());
        }
        catch(IllegalStateException illegalStateException0) {
            k.e().d("WM-RescheduleReceiver", "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", illegalStateException0);
        }
    }
}

