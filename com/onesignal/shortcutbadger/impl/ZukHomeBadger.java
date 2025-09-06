package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import i3.a;
import java.util.Collections;
import java.util.List;

public class ZukHomeBadger implements a {
    private final Uri a;

    public ZukHomeBadger() {
        this.a = Uri.parse("content://com.android.badge/badge");
    }

    @Override  // i3.a
    public List a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override  // i3.a
    public void b(Context context0, ComponentName componentName0, int v) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("app_badge_count", v);
        context0.getContentResolver().call(this.a, "setAppBadgeCount", null, bundle0);
    }
}

