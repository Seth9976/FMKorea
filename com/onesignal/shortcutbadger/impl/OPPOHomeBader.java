package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import i3.a;
import i3.b;
import java.util.Collections;
import java.util.List;

public class OPPOHomeBader implements a {
    private int a;

    public OPPOHomeBader() {
        this.a = -1;
    }

    @Override  // i3.a
    public List a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override  // i3.a
    public void b(Context context0, ComponentName componentName0, int v) {
        if(this.a == v) {
            return;
        }
        this.a = v;
        this.c(context0, v);
    }

    private void c(Context context0, int v) {
        try {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("app_badge_count", v);
            context0.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", null, bundle0);
        }
        catch(Throwable unused_ex) {
            throw new b("Unable to execute Badge By Content Provider");
        }
    }
}

