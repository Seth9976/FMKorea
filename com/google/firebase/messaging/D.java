package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.m.c;
import androidx.core.app.m.e;
import com.google.android.gms.ads.internal.util.h;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class d {
    public static class a {
        public final e a;
        public final String b;
        public final int c;

        a(e m$e0, String s, int v) {
            this.a = m$e0;
            this.b = s;
            this.c = v;
        }
    }

    private static final AtomicInteger a;

    static {
        d.a = new AtomicInteger(((int)SystemClock.elapsedRealtime()));
    }

    private static PendingIntent a(Context context0, G g0, String s, PackageManager packageManager0) {
        Intent intent0 = d.f(s, g0, packageManager0);
        if(intent0 == null) {
            return null;
        }
        intent0.addFlags(0x4000000);
        intent0.putExtras(g0.y());
        if(d.q(g0)) {
            intent0.putExtra("gcm.n.analytics_data", g0.x());
        }
        return PendingIntent.getActivity(context0, d.g(), intent0, 0x44000000);
    }

    private static PendingIntent b(Context context0, Context context1, G g0) {
        return d.q(g0) ? d.c(context0, context1, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(g0.x())) : null;
    }

    private static PendingIntent c(Context context0, Context context1, Intent intent0) {
        return PendingIntent.getBroadcast(context0, d.g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context1, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent0), 0x44000000);
    }

    public static a d(Context context0, Context context1, G g0, String s, Bundle bundle0) {
        Resources resources0 = context1.getResources();
        PackageManager packageManager0 = context1.getPackageManager();
        e m$e0 = new e(context1, s);
        String s1 = g0.n(resources0, "com.fmkorea.m.fmk", "gcm.n.title");
        if(!TextUtils.isEmpty(s1)) {
            m$e0.l(s1);
        }
        String s2 = g0.n(resources0, "com.fmkorea.m.fmk", "gcm.n.body");
        if(!TextUtils.isEmpty(s2)) {
            m$e0.k(s2);
            m$e0.B(new c().h(s2));
        }
        m$e0.z(d.m(packageManager0, resources0, "com.fmkorea.m.fmk", g0.p("gcm.n.icon"), bundle0));
        Uri uri0 = d.n("com.fmkorea.m.fmk", g0, resources0);
        if(uri0 != null) {
            m$e0.A(uri0);
        }
        m$e0.j(d.a(context0, g0, "com.fmkorea.m.fmk", packageManager0));
        PendingIntent pendingIntent0 = d.b(context0, context1, g0);
        if(pendingIntent0 != null) {
            m$e0.n(pendingIntent0);
        }
        Integer integer0 = d.h(context1, g0.p("gcm.n.color"), bundle0);
        if(integer0 != null) {
            m$e0.h(((int)integer0));
        }
        m$e0.f(!g0.a("gcm.n.sticky"));
        m$e0.u(g0.a("gcm.n.local_only"));
        String s3 = g0.p("gcm.n.ticker");
        if(s3 != null) {
            m$e0.C(s3);
        }
        Integer integer1 = g0.m();
        if(integer1 != null) {
            m$e0.x(((int)integer1));
        }
        Integer integer2 = g0.r();
        if(integer2 != null) {
            m$e0.E(((int)integer2));
        }
        Integer integer3 = g0.l();
        if(integer3 != null) {
            m$e0.v(((int)integer3));
        }
        Long long0 = g0.j("gcm.n.event_time");
        if(long0 != null) {
            m$e0.y(true);
            m$e0.F(((long)long0));
        }
        long[] arr_v = g0.q();
        if(arr_v != null) {
            m$e0.D(arr_v);
        }
        int[] arr_v1 = g0.e();
        if(arr_v1 != null) {
            m$e0.t(arr_v1[0], arr_v1[1], arr_v1[2]);
        }
        m$e0.m(d.i(g0));
        return new a(m$e0, d.o(g0), 0);
    }

    static a e(Context context0, G g0) {
        Bundle bundle0 = d.j(context0.getPackageManager(), "com.fmkorea.m.fmk");
        return d.d(context0, context0, g0, d.k(context0, g0.k(), bundle0), bundle0);
    }

    private static Intent f(String s, G g0, PackageManager packageManager0) {
        String s1 = g0.p("gcm.n.click_action");
        if(!TextUtils.isEmpty(s1)) {
            Intent intent0 = new Intent(s1);
            intent0.setPackage(s);
            intent0.setFlags(0x10000000);
            return intent0;
        }
        Uri uri0 = g0.f();
        if(uri0 != null) {
            Intent intent1 = new Intent("android.intent.action.VIEW");
            intent1.setPackage(s);
            intent1.setData(uri0);
            return intent1;
        }
        Intent intent2 = packageManager0.getLaunchIntentForPackage(s);
        if(intent2 == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return intent2;
    }

    private static int g() {
        return d.a.incrementAndGet();
    }

    private static Integer h(Context context0, String s, Bundle bundle0) {
        if(!TextUtils.isEmpty(s)) {
            try {
                return Color.parseColor(s);
            }
            catch(IllegalArgumentException unused_ex) {
                Log.w("FirebaseMessaging", "Color is invalid: " + s + ". Notification will use default color.");
            }
        }
        int v = bundle0.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if(v != 0) {
            try {
                return androidx.core.content.a.getColor(context0, v);
            }
            catch(Resources.NotFoundException unused_ex) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    private static int i(G g0) {
        int v = g0.a("gcm.n.default_sound");
        if(g0.a("gcm.n.default_vibrate_timings")) {
            v |= 2;
        }
        return g0.a("gcm.n.default_light_settings") ? v | 4 : v;
    }

    private static Bundle j(PackageManager packageManager0, String s) {
        ApplicationInfo applicationInfo0;
        try {
            applicationInfo0 = packageManager0.getApplicationInfo(s, 0x80);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.w("FirebaseMessaging", "Couldn\'t get own application info: " + packageManager$NameNotFoundException0);
            return Bundle.EMPTY;
        }
        if(applicationInfo0 != null) {
            return applicationInfo0.metaData == null ? Bundle.EMPTY : applicationInfo0.metaData;
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context0, String s, Bundle bundle0) {
        String s2;
        if(Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            context0.getPackageManager().getApplicationInfo("com.fmkorea.m.fmk", 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
        NotificationManager notificationManager0 = (NotificationManager)context0.getSystemService(NotificationManager.class);
        if(!TextUtils.isEmpty(s)) {
            if(notificationManager0.getNotificationChannel(s) != null) {
                return s;
            }
            Log.w("FirebaseMessaging", "Notification Channel requested (" + s + ") has not been created by the app. Manifest configuration, or default, value will be used.");
        }
        String s1 = bundle0.getString("com.google.firebase.messaging.default_notification_channel_id");
        if(TextUtils.isEmpty(s1)) {
            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
        }
        else {
            if(notificationManager0.getNotificationChannel(s1) != null) {
                return s1;
            }
            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
        }
        if(notificationManager0.getNotificationChannel("fcm_fallback_notification_channel") == null) {
            int v = context0.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", "com.fmkorea.m.fmk");
            if(v == 0) {
                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                s2 = "Misc";
            }
            else {
                s2 = context0.getString(v);
            }
            notificationManager0.createNotificationChannel(h.a("fcm_fallback_notification_channel", s2, 3));
        }
        return "fcm_fallback_notification_channel";
    }

    private static int l(int v) [...] // Inlined contents

    private static int m(PackageManager packageManager0, Resources resources0, String s, String s1, Bundle bundle0) {
        if(!TextUtils.isEmpty(s1)) {
            int v = resources0.getIdentifier(s1, "drawable", s);
            if(v != 0 && d.p(resources0, v)) {
                return v;
            }
            int v1 = resources0.getIdentifier(s1, "mipmap", s);
            if(v1 != 0 && d.p(resources0, v1)) {
                return v1;
            }
            Log.w("FirebaseMessaging", "Icon resource " + s1 + " not found. Notification will use default icon.");
        }
        int v2 = bundle0.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if(v2 == 0 || !d.p(resources0, v2)) {
            try {
                v2 = packageManager0.getApplicationInfo(s, 0).icon;
                return v2 != 0 && d.p(resources0, v2) ? v2 : 0x1080093;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.w("FirebaseMessaging", "Couldn\'t get own application info: " + packageManager$NameNotFoundException0);
            }
        }
        return v2 != 0 && d.p(resources0, v2) ? v2 : 0x1080093;
    }

    private static Uri n(String s, G g0, Resources resources0) {
        String s1 = g0.o();
        if(TextUtils.isEmpty(s1)) {
            return null;
        }
        return "default".equals(s1) || resources0.getIdentifier(s1, "raw", s) == 0 ? RingtoneManager.getDefaultUri(2) : Uri.parse(("android.resource://" + s + "/raw/" + s1));
    }

    private static String o(G g0) {
        String s = g0.p("gcm.n.tag");
        return TextUtils.isEmpty(s) ? "FCM-Notification:" + SystemClock.uptimeMillis() : s;
    }

    private static boolean p(Resources resources0, int v) {
        if(Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if(com.google.firebase.messaging.c.a(resources0.getDrawable(v, null))) {
                Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + v);
                return false;
            }
            return true;
        }
        catch(Resources.NotFoundException unused_ex) {
            Log.e("FirebaseMessaging", "Couldn\'t find resource " + v + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(G g0) {
        return g0.a("google.c.a.e");
    }
}

