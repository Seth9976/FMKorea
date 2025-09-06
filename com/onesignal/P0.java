package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import org.json.JSONException;
import org.json.JSONObject;

abstract class p0 {
    static void a(Context context0, P1 p10, String s) {
        Integer integer0 = p0.b(p10, s);
        boolean z = s.equals("os_group_undefined");
        NotificationManager notificationManager0 = R1.i(context0);
        Integer integer1 = R1.h(p10, s, z);
        if(integer1 != null) {
            if(I1.Y()) {
                if(z) {
                    integer0 = 0xD52D1DDE;
                }
                if(integer0 != null) {
                    notificationManager0.cancel(((int)integer0));
                }
            }
            else {
                I1.G1(((int)integer1));
            }
        }
    }

    static Integer b(O1 o10, String s) {
        Integer integer1;
        Cursor cursor0;
        Integer integer0 = null;
        try {
            cursor0 = o10.f("notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1", new String[]{s}, null, null, null);
        }
        catch(Throwable throwable0) {
            integer1 = null;
            goto label_18;
        }
        try {
            if(!cursor0.moveToFirst()) {
                cursor0.close();
                goto label_8;
            }
            goto label_11;
        }
        catch(Throwable throwable0) {
            goto label_15;
        }
    label_8:
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return null;
        try {
        label_11:
            integer0 = cursor0.getInt(cursor0.getColumnIndex("android_notification_id"));
            cursor0.close();
            goto label_25;
        }
        catch(Throwable throwable0) {
        label_15:
            Integer integer2 = integer0;
            integer0 = cursor0;
            integer1 = integer2;
        }
    label_18:
        try {
            I1.b(C.h, "Error getting android notification id for summary notification group: " + s, throwable0);
            return integer1;
        }
        finally {
            if(integer0 != null && !((Cursor)integer0).isClosed()) {
                ((Cursor)integer0).close();
            }
        }
    label_25:
        if(!cursor0.isClosed()) {
            cursor0.close();
            return integer0;
        }
        return integer0;
    }

    private static Cursor c(Context context0, O1 o10, String s, boolean z) {
        Cursor cursor0 = o10.f("notification", new String[]{"android_notification_id", "created_time", "full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{s}, null, null, "_id DESC");
        int v = cursor0.getCount();
        if(v == 0 && !s.equals("os_group_undefined")) {
            cursor0.close();
            Integer integer0 = p0.b(o10, s);
            if(integer0 == null) {
                return cursor0;
            }
            R1.i(context0).cancel(((int)integer0));
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put((z ? "dismissed" : "opened"), 1);
            o10.a("notification", contentValues0, "android_notification_id = " + integer0, null);
            return cursor0;
        }
        if(v == 1) {
            cursor0.close();
            if(p0.b(o10, s) == null) {
                return cursor0;
            }
            p0.d(context0, s);
            return cursor0;
        }
        try {
            cursor0.moveToFirst();
            Long long0 = cursor0.getLong(cursor0.getColumnIndex("created_time"));
            String s1 = cursor0.getString(cursor0.getColumnIndex("full_data"));
            cursor0.close();
            if(p0.b(o10, s) == null) {
                return cursor0;
            }
            W0 w00 = new W0(context0);
            w00.y(true);
            w00.z(long0);
            w00.q(new JSONObject(s1));
            w.N(w00);
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        return cursor0;
    }

    private static void d(Context context0, String s) {
        P1 p10 = P1.t(context0);
        Cursor cursor0 = null;
        try {
            cursor0 = p10.f("notification", OSNotificationRestoreWorkManager.a, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{s}, null, null, null);
            OSNotificationRestoreWorkManager.e(context0, cursor0, 0);
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

    static void e(Context context0, O1 o10, int v) {
        Cursor cursor0 = o10.f("notification", new String[]{"group_id"}, "android_notification_id = " + v, null, null, null, null);
        if(cursor0.moveToFirst()) {
            String s = cursor0.getString(cursor0.getColumnIndex("group_id"));
            cursor0.close();
            if(s != null) {
                p0.f(context0, o10, s, true);
            }
        }
        else {
            cursor0.close();
        }
    }

    static void f(Context context0, O1 o10, String s, boolean z) {
        Cursor cursor0;
        try {
            cursor0 = p0.c(context0, o10, s, z);
        }
        catch(Throwable throwable0) {
            I1.b(C.h, "Error running updateSummaryNotificationAfterChildRemoved!", throwable0);
            return;
        }
        if(cursor0 != null && !cursor0.isClosed()) {
            cursor0.close();
        }
    }
}

