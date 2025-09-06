package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;
import java.util.Map.Entry;
import java.util.TreeMap;

abstract class k0 {
    static final String a;

    static {
        k0.a = "49";
    }

    static void a(Context context0, int v) {
        try {
            k0.c(context0, v);
        }
        catch(Throwable unused_ex) {
            k0.b(context0, v);
        }
    }

    static void b(Context context0, int v) {
        P1 p10 = P1.t(context0);
        Cursor cursor0 = null;
        try {
            String s = P1.K().toString();
            cursor0 = p10.b("notification", new String[]{"android_notification_id"}, s, null, null, null, "_id", "49" + v);
            int v1 = cursor0.getCount() - 49 + v;
            if(v1 >= 1) {
                while(true) {
                    if(!cursor0.moveToNext()) {
                        goto label_20;
                    }
                    I1.G1(cursor0.getInt(cursor0.getColumnIndex("android_notification_id")));
                    --v1;
                    if(v1 > 0) {
                        continue;
                    }
                    goto label_20;
                }
            }
            goto label_24;
        }
        catch(Throwable throwable0) {
            try {
                I1.b(C.h, "Error clearing oldest notifications over limit! ", throwable0);
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
    label_20:
        if(!cursor0.isClosed()) {
            cursor0.close();
            return;
        }
        return;
    label_24:
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
    }

    static void c(Context context0, int v) {
        StatusBarNotification[] arr_statusBarNotification = R1.d(context0);
        int v1 = arr_statusBarNotification.length - 49 + v;
        if(v1 < 1) {
            return;
        }
        TreeMap treeMap0 = new TreeMap();
        for(int v2 = 0; v2 < arr_statusBarNotification.length; ++v2) {
            StatusBarNotification statusBarNotification0 = arr_statusBarNotification[v2];
            if(!k0.f(statusBarNotification0)) {
                treeMap0.put(statusBarNotification0.getNotification().when, statusBarNotification0.getId());
            }
        }
        for(Object object0: treeMap0.entrySet()) {
            I1.G1(((int)(((Integer)((Map.Entry)object0).getValue()))));
            --v1;
            if(v1 <= 0) {
                break;
            }
        }
    }

    private static int d() [...] // Inlined contents

    // 去混淆评级： 低(20)
    private static String e() [...] // 潜在的解密器

    static boolean f(StatusBarNotification statusBarNotification0) {
        return (statusBarNotification0.getNotification().flags & 0x200) != 0;
    }
}

