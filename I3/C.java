package i3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.LinkedList;
import java.util.List;

public abstract class c {
    private static final List a;
    private static final Object b;
    private static a c;
    private static ComponentName d;

    static {
        LinkedList linkedList0 = new LinkedList();
        c.a = linkedList0;
        c.b = new Object();
        linkedList0.add(AdwHomeBadger.class);
        linkedList0.add(ApexHomeBadger.class);
        linkedList0.add(NewHtcHomeBadger.class);
        linkedList0.add(NovaHomeBadger.class);
        linkedList0.add(SonyHomeBadger.class);
        linkedList0.add(AsusHomeBadger.class);
        linkedList0.add(HuaweiHomeBadger.class);
        linkedList0.add(OPPOHomeBader.class);
        linkedList0.add(SamsungHomeBadger.class);
        linkedList0.add(ZukHomeBadger.class);
        linkedList0.add(VivoHomeBadger.class);
        linkedList0.add(EverythingMeHomeBadger.class);
    }

    public static void a(Context context0, int v) {
        if(c.c == null && !c.b(context0)) {
            throw new b("No default launcher available");
        }
        try {
            c.c.b(context0, c.d, v);
        }
        catch(Exception exception0) {
            throw new b("Unable to execute badge", exception0);
        }
    }

    private static boolean b(Context context0) {
        a a0;
        Intent intent0 = context0.getPackageManager().getLaunchIntentForPackage("com.fmkorea.m.fmk");
        if(intent0 == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package com.fmkorea.m.fmk");
            return false;
        }
        c.d = intent0.getComponent();
        Intent intent1 = new Intent("android.intent.action.MAIN");
        intent1.addCategory("android.intent.category.HOME");
        ResolveInfo resolveInfo0 = context0.getPackageManager().resolveActivity(intent1, 0x10000);
        if(resolveInfo0 != null && !resolveInfo0.activityInfo.name.toLowerCase().contains("resolver")) {
            String s = resolveInfo0.activityInfo.packageName;
            for(Object object0: c.a) {
                Class class0 = (Class)object0;
                try {
                    a0 = null;
                    a0 = (a)class0.newInstance();
                }
                catch(Exception unused_ex) {
                }
                if(a0 != null && a0.a().contains(s)) {
                    c.c = a0;
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(c.c == null) {
                String s1 = Build.MANUFACTURER;
                if(s1.equalsIgnoreCase("ZUK")) {
                    c.c = new ZukHomeBadger();
                    return true;
                }
                if(s1.equalsIgnoreCase("OPPO")) {
                    c.c = new OPPOHomeBader();
                    return true;
                }
                if(s1.equalsIgnoreCase("VIVO")) {
                    c.c = new VivoHomeBadger();
                    return true;
                }
                c.c = new DefaultBadger();
            }
            return true;
        }
        return false;
    }
}

