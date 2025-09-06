package com.onesignal;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.util.h;
import f3.a;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

abstract class j0 {
    private static final Pattern a;

    static {
        j0.a = Pattern.compile("^([A-Fa-f0-9]{8})$");
    }

    private static String a(Context context0, NotificationManager notificationManager0, JSONObject jSONObject0) {
        JSONObject jSONObject3;
        Object object0 = jSONObject0.opt("chnl");
        JSONObject jSONObject1 = object0 instanceof String ? new JSONObject(((String)object0)) : ((JSONObject)object0);
        String s = "fcm_fallback_notification_channel";
        String s1 = jSONObject1.optString("id", "fcm_fallback_notification_channel");
        if(!s1.equals("miscellaneous")) {
            s = s1;
        }
        if(jSONObject1.has("langs")) {
            JSONObject jSONObject2 = jSONObject1.getJSONObject("langs");
            String s2 = a.a().b();
            jSONObject3 = jSONObject2.has(s2) ? jSONObject2.optJSONObject(s2) : jSONObject1;
        }
        else {
            jSONObject3 = jSONObject1;
        }
        NotificationChannel notificationChannel0 = h.a(s, jSONObject3.optString("nm", "Miscellaneous"), j0.f(jSONObject0.optInt("pri", 6)));
        notificationChannel0.setDescription(jSONObject3.optString("dscr", null));
        if(jSONObject1.has("grp_id")) {
            String s3 = jSONObject1.optString("grp_id");
            notificationManager0.createNotificationChannelGroup(c0.a(s3, jSONObject3.optString("grp_nm")));
            notificationChannel0.setGroup(s3);
        }
        if(jSONObject0.has("ledc")) {
            String s4 = jSONObject0.optString("ledc");
            if(!j0.a.matcher(s4).matches()) {
                I1.a(C.i, "OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)");
                s4 = "FFFFFFFF";
            }
            try {
                notificationChannel0.setLightColor(new BigInteger(s4, 16).intValue());
            }
            catch(Throwable throwable0) {
                I1.b(C.h, "Couldn\'t convert ARGB Hex value to BigInteger:", throwable0);
            }
        }
        boolean z = true;
        notificationChannel0.enableLights(jSONObject0.optInt("led", 1) == 1);
        if(jSONObject0.has("vib_pt")) {
            long[] arr_v = OSUtils.Q(jSONObject0);
            if(arr_v != null) {
                notificationChannel0.setVibrationPattern(arr_v);
            }
        }
        notificationChannel0.enableVibration(jSONObject0.optInt("vib", 1) == 1);
        if(jSONObject0.has("sound")) {
            String s5 = jSONObject0.optString("sound", null);
            Uri uri0 = OSUtils.n(context0, s5);
            if(uri0 != null) {
                notificationChannel0.setSound(uri0, null);
            }
            else if("null".equals(s5) || "nil".equals(s5)) {
                notificationChannel0.setSound(null, null);
            }
        }
        notificationChannel0.setLockscreenVisibility(jSONObject0.optInt("vis", 0));
        notificationChannel0.setShowBadge(jSONObject0.optInt("bdg", 1) == 1);
        if(jSONObject0.optInt("bdnd", 0) != 1) {
            z = false;
        }
        notificationChannel0.setBypassDnd(z);
        I1.p1(C.l, "Creating notification channel with channel:\n" + notificationChannel0.toString());
        try {
            notificationManager0.createNotificationChannel(notificationChannel0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            illegalArgumentException0.printStackTrace();
        }
        return s;
    }

    private static String b(NotificationManager notificationManager0) {
        NotificationChannel notificationChannel0 = h.a("fcm_fallback_notification_channel", "Miscellaneous", 3);
        notificationChannel0.enableLights(true);
        notificationChannel0.enableVibration(true);
        notificationManager0.createNotificationChannel(notificationChannel0);
        return "fcm_fallback_notification_channel";
    }

    static String c(W0 w00) {
        if(Build.VERSION.SDK_INT < 26) {
            return "fcm_fallback_notification_channel";
        }
        Context context0 = w00.d();
        JSONObject jSONObject0 = w00.e();
        NotificationManager notificationManager0 = R1.i(context0);
        if(w00.n()) {
            return j0.d(notificationManager0);
        }
        if(jSONObject0.has("oth_chnl")) {
            String s = jSONObject0.optString("oth_chnl");
            if(notificationManager0.getNotificationChannel(s) != null) {
                return s;
            }
        }
        if(!jSONObject0.has("chnl")) {
            return j0.b(notificationManager0);
        }
        try {
            return j0.a(context0, notificationManager0, jSONObject0);
        }
        catch(JSONException jSONException0) {
            I1.b(C.h, "Could not create notification channel due to JSON payload error!", jSONException0);
            return "fcm_fallback_notification_channel";
        }
    }

    private static String d(NotificationManager notificationManager0) {
        notificationManager0.createNotificationChannel(h.a("restored_OS_notifications", "Restored", 2));
        return "restored_OS_notifications";
    }

    private static List e(NotificationManager notificationManager0) {
        try {
            return notificationManager0.getNotificationChannels();
        }
        catch(NullPointerException nullPointerException0) {
            I1.p1(C.h, "Error when trying to delete notification channel: " + nullPointerException0.getMessage());
            return null;
        }
        catch(RuntimeException runtimeException0) {
            if(!i.a(runtimeException0.getCause())) {
                throw runtimeException0;
            }
            return null;
        }
    }

    private static int f(int v) {
        if(v > 9) {
            return 5;
        }
        if(v > 7) {
            return 4;
        }
        if(v > 5) {
            return 3;
        }
        if(v > 3) {
            return 2;
        }
        return v <= 1 ? 0 : 1;
    }

    static void g(Context context0, JSONArray jSONArray0) {
        if(Build.VERSION.SDK_INT < 26) {
            return;
        }
        if(jSONArray0 != null && jSONArray0.length() != 0) {
            NotificationManager notificationManager0 = R1.i(context0);
            HashSet hashSet0 = new HashSet();
            int v = jSONArray0.length();
            for(int v1 = 0; v1 < v; ++v1) {
                try {
                    hashSet0.add(j0.a(context0, notificationManager0, jSONArray0.getJSONObject(v1)));
                }
                catch(JSONException jSONException0) {
                    I1.b(C.h, "Could not create notification channel due to JSON payload error!", jSONException0);
                }
            }
            if(hashSet0.isEmpty()) {
                return;
            }
            List list0 = j0.e(notificationManager0);
            if(list0 == null) {
                return;
            }
            for(Object object0: list0) {
                String s = ((NotificationChannel)object0).getId();
                if(s.startsWith("OS_") && !hashSet0.contains(s)) {
                    notificationManager0.deleteNotificationChannel(s);
                }
            }
        }
    }
}

