package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import i3.a;
import i3.b;
import java.util.Arrays;
import java.util.List;

public class NewHtcHomeBadger implements a {
    @Override  // i3.a
    public List a() {
        return Arrays.asList(new String[]{"com.htc.launcher"});
    }

    @Override  // i3.a
    public void b(Context context0, ComponentName componentName0, int v) {
        Intent intent0 = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent0.putExtra("com.htc.launcher.extra.COMPONENT", componentName0.flattenToShortString());
        intent0.putExtra("com.htc.launcher.extra.COUNT", v);
        Intent intent1 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent1.putExtra("packagename", componentName0.getPackageName());
        intent1.putExtra("count", v);
        if(!j3.a.a(context0, intent0) && !j3.a.a(context0, intent1)) {
            throw new b("unable to resolve intent: " + intent1.toString());
        }
        context0.sendBroadcast(intent0);
        context0.sendBroadcast(intent1);
    }
}

