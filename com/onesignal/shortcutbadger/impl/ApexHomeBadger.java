package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import i3.a;
import i3.b;
import java.util.Arrays;
import java.util.List;

public class ApexHomeBadger implements a {
    @Override  // i3.a
    public List a() {
        return Arrays.asList(new String[]{"com.anddoes.launcher"});
    }

    @Override  // i3.a
    public void b(Context context0, ComponentName componentName0, int v) {
        Intent intent0 = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent0.putExtra("package", componentName0.getPackageName());
        intent0.putExtra("count", v);
        intent0.putExtra("class", componentName0.getClassName());
        if(!j3.a.a(context0, intent0)) {
            throw new b("unable to resolve intent: " + intent0.toString());
        }
        context0.sendBroadcast(intent0);
    }
}

