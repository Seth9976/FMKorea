package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.e;
import androidx.work.j.a;
import androidx.work.m;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

abstract class OSNotificationRestoreWorkManager {
    public static class NotificationRestoreWorker extends Worker {
        public NotificationRestoreWorker(Context context0, WorkerParameters workerParameters0) {
            super(context0, workerParameters0);
        }

        @Override  // androidx.work.Worker
        public a doWork() {
            Context context0 = this.getApplicationContext();
            if(I1.b == null) {
                I1.X0(context0);
            }
            if(!OSUtils.a(context0)) {
                return a.a();
            }
            if(OSNotificationRestoreWorkManager.c) {
                return a.a();
            }
            OSNotificationRestoreWorkManager.c = true;
            I1.a(C.j, "Restoring notifications");
            P1 p10 = P1.t(context0);
            StringBuilder stringBuilder0 = P1.K();
            OSNotificationRestoreWorkManager.f(context0, stringBuilder0);
            OSNotificationRestoreWorkManager.d(context0, p10, stringBuilder0);
            return a.c();
        }
    }

    static final String[] a;
    private static final String b;
    public static boolean c;

    static {
        OSNotificationRestoreWorkManager.a = new String[]{"notification_id", "android_notification_id", "full_data", "created_time"};
        OSNotificationRestoreWorkManager.b = NotificationRestoreWorker.class.getCanonicalName();
    }

    public static void c(Context context0, boolean z) {
        m m0 = (m)((androidx.work.m.a)new androidx.work.m.a(NotificationRestoreWorker.class).k(((long)(z ? 15 : 0)), TimeUnit.SECONDS)).b();
        F1.a(context0).d(OSNotificationRestoreWorkManager.b, e.g, m0);
    }

    private static void d(Context context0, P1 p10, StringBuilder stringBuilder0) {
        I1.a(C.j, "Querying DB for notifications to restore: " + stringBuilder0.toString());
        Cursor cursor0 = null;
        try {
            cursor0 = p10.b("notification", OSNotificationRestoreWorkManager.a, stringBuilder0.toString(), null, null, null, "_id DESC", "49");
            OSNotificationRestoreWorkManager.e(context0, cursor0, 200);
            l.c(p10, context0);
        }
        catch(Throwable throwable0) {
            try {
                I1.b(C.h, "Error restoring notification records! ", throwable0);
            }
            catch(Throwable throwable1) {
                if(cursor0 != null && !cursor0.isClosed()) {
                    cursor0.close();
                }
                throw throwable1;
            }
            if(cursor0 != null && !cursor0.isClosed()) {
                cursor0.close();
                return;
            }
            return;
        }
        if(cursor0 != null && !cursor0.isClosed()) {
            cursor0.close();
        }
    }

    static void e(Context context0, Cursor cursor0, int v) {
        if(!cursor0.moveToFirst()) {
            return;
        }
        do {
            OSNotificationWorkManager.b(context0, cursor0.getString(cursor0.getColumnIndex("notification_id")), cursor0.getInt(cursor0.getColumnIndex("android_notification_id")), cursor0.getString(cursor0.getColumnIndex("full_data")), cursor0.getLong(cursor0.getColumnIndex("created_time")), true, false);
            if(v > 0) {
                OSUtils.V(v);
            }
        }
        while(cursor0.moveToNext());
    }

    private static void f(Context context0, StringBuilder stringBuilder0) {
        StatusBarNotification[] arr_statusBarNotification = R1.d(context0);
        if(arr_statusBarNotification.length == 0) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_statusBarNotification.length; ++v) {
            arrayList0.add(arr_statusBarNotification[v].getId());
        }
        stringBuilder0.append(" AND android_notification_id NOT IN (");
        stringBuilder0.append(TextUtils.join(",", arrayList0));
        stringBuilder0.append(")");
    }
}

