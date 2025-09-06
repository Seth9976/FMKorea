package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import i3.a;
import java.util.Arrays;
import java.util.List;

public class VivoHomeBadger implements a {
    @Override  // i3.a
    public List a() {
        return Arrays.asList(new String[]{"com.vivo.launcher"});
    }

    @Override  // i3.a
    public void b(Context context0, ComponentName componentName0, int v) {
        Intent intent0 = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent0.putExtra("packageName", "com.fmkorea.m.fmk");
        intent0.putExtra("className", componentName0.getClassName());
        intent0.putExtra("notificationNum", v);
        context0.sendBroadcast(intent0);
    }
}

