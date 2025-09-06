package co.median.android;

import I0.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AppUpgradeReceiver extends BroadcastReceiver {
    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(context0 != null && intent0 != null && "android.intent.action.MY_PACKAGE_REPLACED".equals(intent0.getAction())) {
            a.V(context0).R();
        }
    }
}

