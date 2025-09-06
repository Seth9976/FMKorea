package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import i3.a;
import i3.b;
import java.util.ArrayList;
import java.util.List;

public class DefaultBadger implements a {
    @Override  // i3.a
    public List a() {
        return new ArrayList(0);
    }

    @Override  // i3.a
    public void b(Context context0, ComponentName componentName0, int v) {
        Intent intent0 = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent0.putExtra("badge_count", v);
        intent0.putExtra("badge_count_package_name", componentName0.getPackageName());
        intent0.putExtra("badge_count_class_name", componentName0.getClassName());
        if(!j3.a.a(context0, intent0)) {
            throw new b("unable to resolve intent: " + intent0.toString());
        }
        context0.sendBroadcast(intent0);
    }

    boolean c(Context context0) {
        return j3.a.a(context0, new Intent("android.intent.action.BADGE_COUNT_UPDATE"));
    }
}

