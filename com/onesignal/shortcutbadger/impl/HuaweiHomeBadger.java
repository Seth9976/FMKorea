package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import i3.a;
import java.util.Arrays;
import java.util.List;

public class HuaweiHomeBadger implements a {
    @Override  // i3.a
    public List a() {
        return Arrays.asList(new String[]{"com.huawei.android.launcher"});
    }

    @Override  // i3.a
    public void b(Context context0, ComponentName componentName0, int v) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("package", "com.fmkorea.m.fmk");
        bundle0.putString("class", componentName0.getClassName());
        bundle0.putInt("badgenumber", v);
        context0.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", null, bundle0);
    }
}

