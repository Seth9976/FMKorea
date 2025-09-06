package com.onesignal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import i3.b;
import i3.c;

abstract class l {
    private static int a = -1;

    static {
    }

    private static boolean a(Context context0) {
        switch(l.a) {
            case -1: {
                ApplicationInfo applicationInfo0 = j.a.a(context0);
                if(applicationInfo0 == null) {
                    l.a = 0;
                    I1.a(C.h, "Error reading meta-data tag \'com.onesignal.BadgeCount\'. Disabling badge setting.");
                    return false;
                }
                Bundle bundle0 = applicationInfo0.metaData;
                if(bundle0 != null) {
                    l.a = !"DISABLE".equals(bundle0.getString("com.onesignal.BadgeCount"));
                    return l.a == 1;
                }
                l.a = 1;
                return true;
            }
            case 1: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    // 去混淆评级： 低(20)
    private static boolean b(Context context0) {
        return l.a(context0) && OSUtils.a(context0);
    }

    static void c(O1 o10, Context context0) {
        if(!l.b(context0)) {
            return;
        }
        l.e(context0);
    }

    static void d(int v, Context context0) {
        if(!l.a(context0)) {
            return;
        }
        try {
            c.a(context0, v);
        }
        catch(b unused_ex) {
        }
    }

    private static void e(Context context0) {
        StatusBarNotification[] arr_statusBarNotification = R1.d(context0);
        int v1 = 0;
        for(int v = 0; v < arr_statusBarNotification.length; ++v) {
            if(!k0.f(arr_statusBarNotification[v])) {
                ++v1;
            }
        }
        l.d(v1, context0);
    }
}

