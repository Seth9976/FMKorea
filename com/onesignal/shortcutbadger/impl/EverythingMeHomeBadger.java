package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import i3.a;
import java.util.Arrays;
import java.util.List;

public class EverythingMeHomeBadger implements a {
    @Override  // i3.a
    public List a() {
        return Arrays.asList(new String[]{"me.everything.launcher"});
    }

    @Override  // i3.a
    public void b(Context context0, ComponentName componentName0, int v) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("package_name", componentName0.getPackageName());
        contentValues0.put("activity_name", componentName0.getClassName());
        contentValues0.put("count", v);
        context0.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues0);
    }
}

