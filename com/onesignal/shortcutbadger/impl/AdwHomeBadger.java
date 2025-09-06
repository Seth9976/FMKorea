package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import i3.a;
import i3.b;
import java.util.Arrays;
import java.util.List;

public class AdwHomeBadger implements a {
    @Override  // i3.a
    public List a() {
        return Arrays.asList(new String[]{"org.adw.launcher", "org.adwfreak.launcher"});
    }

    @Override  // i3.a
    public void b(Context context0, ComponentName componentName0, int v) {
        Intent intent0 = new Intent("org.adw.launcher.counter.SEND");
        intent0.putExtra("PNAME", componentName0.getPackageName());
        intent0.putExtra("CNAME", componentName0.getClassName());
        intent0.putExtra("COUNT", v);
        if(!j3.a.a(context0, intent0)) {
            throw new b("unable to resolve intent: " + intent0.toString());
        }
        context0.sendBroadcast(intent0);
    }
}

