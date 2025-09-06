package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import i3.a;
import j3.b;
import java.util.Arrays;
import java.util.List;

public class SamsungHomeBadger implements a {
    private DefaultBadger a;
    private static final String[] b;

    static {
        SamsungHomeBadger.b = new String[]{"_id", "class"};
    }

    public SamsungHomeBadger() {
        this.a = new DefaultBadger();
    }

    @Override  // i3.a
    public List a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    @Override  // i3.a
    public void b(Context context0, ComponentName componentName0, int v) {
        Cursor cursor0;
        if(this.a != null && this.a.c(context0)) {
            this.a.b(context0, componentName0, v);
            return;
        }
        Uri uri0 = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver0 = context0.getContentResolver();
        try {
            String[] arr_s = {componentName0.getPackageName()};
            cursor0 = contentResolver0.query(uri0, SamsungHomeBadger.b, "package=?", arr_s, null);
            if(cursor0 != null) {
                String s = componentName0.getClassName();
                boolean z = false;
                while(cursor0.moveToNext()) {
                    int v2 = cursor0.getInt(0);
                    contentResolver0.update(uri0, this.c(componentName0, v, false), "_id=?", new String[]{String.valueOf(v2)});
                    if(s.equals(cursor0.getString(cursor0.getColumnIndex("class")))) {
                        z = true;
                    }
                }
                if(!z) {
                    contentResolver0.insert(uri0, this.c(componentName0, v, true));
                }
            }
        }
        finally {
            b.a(cursor0);
        }
    }

    private ContentValues c(ComponentName componentName0, int v, boolean z) {
        ContentValues contentValues0 = new ContentValues();
        if(z) {
            contentValues0.put("package", componentName0.getPackageName());
            contentValues0.put("class", componentName0.getClassName());
        }
        contentValues0.put("badgecount", v);
        return contentValues0;
    }
}

