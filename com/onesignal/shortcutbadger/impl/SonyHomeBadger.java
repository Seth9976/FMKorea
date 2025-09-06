package com.onesignal.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import i3.a;
import java.util.Arrays;
import java.util.List;

public class SonyHomeBadger implements a {
    private final Uri a;
    private AsyncQueryHandler b;

    public SonyHomeBadger() {
        this.a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");
    }

    @Override  // i3.a
    public List a() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }

    @Override  // i3.a
    public void b(Context context0, ComponentName componentName0, int v) {
        if(SonyHomeBadger.h(context0)) {
            this.e(context0, componentName0, v);
            return;
        }
        SonyHomeBadger.d(context0, componentName0, v);
    }

    private ContentValues c(int v, ComponentName componentName0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("badge_count", v);
        contentValues0.put("package_name", componentName0.getPackageName());
        contentValues0.put("activity_name", componentName0.getClassName());
        return contentValues0;
    }

    private static void d(Context context0, ComponentName componentName0, int v) {
        Intent intent0 = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent0.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName0.getPackageName());
        intent0.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName0.getClassName());
        intent0.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(v));
        intent0.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", v > 0);
        context0.sendBroadcast(intent0);
    }

    private void e(Context context0, ComponentName componentName0, int v) {
        class com.onesignal.shortcutbadger.impl.SonyHomeBadger.a extends AsyncQueryHandler {
            final SonyHomeBadger a;

            com.onesignal.shortcutbadger.impl.SonyHomeBadger.a(ContentResolver contentResolver0) {
                super(contentResolver0);
            }
        }

        if(v < 0) {
            return;
        }
        ContentValues contentValues0 = this.c(v, componentName0);
        if(Looper.myLooper() == Looper.getMainLooper()) {
            if(this.b == null) {
                this.b = new com.onesignal.shortcutbadger.impl.SonyHomeBadger.a(this, context0.getApplicationContext().getContentResolver());
            }
            this.f(contentValues0);
            return;
        }
        this.g(context0, contentValues0);
    }

    private void f(ContentValues contentValues0) {
        this.b.startInsert(0, null, this.a, contentValues0);
    }

    private void g(Context context0, ContentValues contentValues0) {
        context0.getApplicationContext().getContentResolver().insert(this.a, contentValues0);
    }

    private static boolean h(Context context0) {
        return context0.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }
}

