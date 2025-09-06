package com.onesignal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

public class UpgradeReceiver extends BroadcastReceiver {
    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(Build.VERSION.SDK_INT == 24) {
            return;
        }
        OSNotificationRestoreWorkManager.c(context0, true);
    }
}

