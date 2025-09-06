package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import i3.a;
import java.util.Arrays;
import java.util.List;

public class NovaHomeBadger implements a {
    @Override  // i3.a
    public List a() {
        return Arrays.asList(new String[]{"com.teslacoilsw.launcher"});
    }

    @Override  // i3.a
    public void b(Context context0, ComponentName componentName0, int v) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("tag", componentName0.getPackageName() + "/" + componentName0.getClassName());
        contentValues0.put("count", v);
        context0.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues0);
    }
}

