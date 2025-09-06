package com.onesignal;

import android.R.drawable;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.RemoteViews;
import androidx.core.app.m.c;
import androidx.core.app.m.e;
import androidx.core.app.m.g;
import androidx.core.app.p;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

abstract class w {
    static abstract class a {
    }

    static class b {
        e a;
        boolean b;

        private b() {
        }

        b(a w$a0) {
        }
    }

    private static Class a;
    private static Class b;
    private static Resources c;
    private static Context d;
    private static String e;
    private static Integer f;

    static {
        w.a = NotificationOpenedReceiver.class;
        w.b = NotificationDismissReceiver.class;
    }

    private static int A(String s) {
        if(s == null) {
            return 0;
        }
        String s1 = s.trim();
        if(!OSUtils.J(s1)) {
            return 0;
        }
        int v = w.w(s1);
        if(v != 0) {
            return v;
        }
        try {
            return R.drawable.class.getField(s).getInt(null);
        }
        catch(Throwable unused_ex) {
            return 0;
        }
    }

    private static int B(JSONObject jSONObject0) {
        int v = w.A(jSONObject0.optString("sicon", null));
        return v == 0 ? w.v() : v;
    }

    private static CharSequence C(JSONObject jSONObject0) {
        CharSequence charSequence0 = jSONObject0.optString("title", null);
        return charSequence0 == null ? w.p() : charSequence0;
    }

    private static void D() {
        if(Build.VERSION.SDK_INT >= 24) {
            w.f = 2;
            return;
        }
        w.f = 1;
    }

    static void E() {
        if(OSUtils.H()) {
            throw new u1("Process for showing a notification should never been done on Main Thread!");
        }
    }

    private static boolean F(JSONObject jSONObject0) {
        String s = jSONObject0.optString("sound", null);
        return !"null".equals(s) && !"nil".equals(s);
    }

    private static void G(e m$e0) {
        m$e0.w(true).m(0).A(null).D(null).C(null);
    }

    private static Bitmap H(Bitmap bitmap0) {
        if(bitmap0 == null) {
            return null;
        }
        try {
            int v = (int)w.c.getDimension(0x1050006);
            int v1 = (int)w.c.getDimension(0x1050005);
            int v2 = bitmap0.getHeight();
            int v3 = bitmap0.getWidth();
            if(v3 > v1 || v2 > v) {
                if(v2 > v3) {
                    v1 = (int)(((float)v) * (((float)v3) / ((float)v2)));
                }
                else if(v3 > v2) {
                    v = (int)(((float)v1) * (((float)v2) / ((float)v3)));
                }
                return Bitmap.createScaledBitmap(bitmap0, v1, v, true);
            }
        }
        catch(Throwable unused_ex) {
        }
        return bitmap0;
    }

    private static Integer I(JSONObject jSONObject0, String s) {
        if(jSONObject0 != null) {
            try {
                return jSONObject0.has(s) ? new BigInteger(jSONObject0.optString(s), 16).intValue() : null;
            }
            catch(Throwable unused_ex) {
            }
        }
        return null;
    }

    private static void J(JSONObject jSONObject0, e m$e0) {
        int v = 4;
        int v1 = w.e(jSONObject0.optInt("pri", 6));
        m$e0.x(v1);
        if(v1 < 0) {
            return;
        }
        if(jSONObject0.has("ledc") && jSONObject0.optInt("led", 1) == 1) {
            try {
                m$e0.t(new BigInteger(jSONObject0.optString("ledc"), 16).intValue(), 2000, 5000);
                v = 0;
            }
            catch(Throwable unused_ex) {
            }
        }
        if(jSONObject0.optInt("vib", 1) == 1) {
            if(jSONObject0.has("vib_pt")) {
                long[] arr_v = OSUtils.Q(jSONObject0);
                if(arr_v != null) {
                    m$e0.D(arr_v);
                }
            }
            else {
                v |= 2;
            }
        }
        if(w.F(jSONObject0)) {
            Uri uri0 = OSUtils.n(w.d, jSONObject0.optString("sound", null));
            if(uri0 == null) {
                v |= 1;
            }
            else {
                m$e0.A(uri0);
            }
        }
        m$e0.m(v);
    }

    private static void K(Context context0) {
        w.d = context0;
        w.e = "com.fmkorea.m.fmk";
        w.c = w.d.getResources();
    }

    private static void L(RemoteViews remoteViews0, JSONObject jSONObject0, int v, String s, String s1) {
        Integer integer0 = w.I(jSONObject0, s);
        if(integer0 != null) {
            remoteViews0.setTextColor(v, ((int)integer0));
            return;
        }
        int v1 = w.c.getIdentifier(s1, "color", w.e);
        if(v1 != 0) {
            remoteViews0.setTextColor(v, h.b(w.d, v1));
        }
    }

    private static boolean M(W0 w00) {
        Notification notification0;
        int v = (int)w00.a();
        JSONObject jSONObject0 = w00.e();
        String s = jSONObject0.optString("grp", null);
        F f0 = new F(w.d);
        ArrayList arrayList0 = new ArrayList();
        if(Build.VERSION.SDK_INT >= 24) {
            arrayList0 = R1.c(w.d);
            if(s == null && arrayList0.size() >= 3) {
                s = "os_group_undefined";
                R1.b(w.d, arrayList0);
            }
        }
        b w$b0 = w.q(w00);
        e m$e0 = w$b0.a;
        w.b(jSONObject0, f0, m$e0, v, null);
        try {
            w.a(jSONObject0, m$e0);
        }
        catch(Throwable throwable0) {
            I1.b(C.h, "Could not set background notification image!", throwable0);
        }
        w.d(w00, m$e0);
        if(w00.n()) {
            w.G(m$e0);
        }
        k0.a(w.d, (s == null ? 1 : 2));
        if(s == null) {
            notification0 = w.h(m$e0, f0, jSONObject0, v);
        }
        else {
            w.g(m$e0, f0, jSONObject0, s, v);
            notification0 = w.j(w00, m$e0);
            if(Build.VERSION.SDK_INT < 24 || !s.equals("os_group_undefined")) {
                w.l(w00, w$b0);
            }
            else {
                w.i(w00, f0, arrayList0.size() + 1);
            }
        }
        w.c(w$b0, notification0);
        p.d(w.d).f(v, notification0);
        return Build.VERSION.SDK_INT < 26 ? true : R1.a(w.d, notification0.getChannelId());
    }

    static void N(W0 w00) {
        w.K(w00.d());
        w.l(w00, null);
    }

    private static void a(JSONObject jSONObject0, e m$e0) {
        String s2;
        Bitmap bitmap0;
        JSONObject jSONObject1;
        int v = Build.VERSION.SDK_INT;
        if(v >= 0x1F) {
            I1.a(C.l, "Cannot use background images in notifications for device on version: " + v);
            return;
        }
        String s = jSONObject0.optString("bg_img", null);
        if(s == null) {
            bitmap0 = null;
            jSONObject1 = null;
        }
        else {
            jSONObject1 = new JSONObject(s);
            bitmap0 = w.r(jSONObject1.optString("img", null));
        }
        if(bitmap0 == null) {
            bitmap0 = w.s("onesignal_bgimage_default_image");
        }
        if(bitmap0 != null) {
            RemoteViews remoteViews0 = new RemoteViews("com.fmkorea.m.fmk", g2.a);
            CharSequence charSequence0 = w.C(jSONObject0);
            remoteViews0.setTextViewText(f2.e, charSequence0);
            String s1 = jSONObject0.optString("alert");
            remoteViews0.setTextViewText(f2.d, s1);
            w.L(remoteViews0, jSONObject1, f2.e, "tc", "onesignal_bgimage_notif_title_color");
            w.L(remoteViews0, jSONObject1, f2.d, "bc", "onesignal_bgimage_notif_body_color");
            if(jSONObject1 == null || !jSONObject1.has("img_align")) {
                int v1 = w.c.getIdentifier("onesignal_bgimage_notif_image_align", "string", w.e);
                s2 = v1 == 0 ? null : w.c.getString(v1);
            }
            else {
                s2 = jSONObject1.getString("img_align");
            }
            if("right".equals(s2)) {
                remoteViews0.setViewPadding(f2.b, -5000, 0, 0, 0);
                remoteViews0.setImageViewBitmap(f2.c, bitmap0);
                remoteViews0.setViewVisibility(f2.c, 0);
                remoteViews0.setViewVisibility(f2.a, 2);
            }
            else {
                remoteViews0.setImageViewBitmap(f2.a, bitmap0);
            }
            m$e0.i(remoteViews0);
            m$e0.B(null);
        }
    }

    private static void b(JSONObject jSONObject0, F f0, e m$e0, int v, String s) {
        try {
            JSONObject jSONObject1 = new JSONObject(jSONObject0.optString("custom"));
            if(!jSONObject1.has("a")) {
                return;
            }
            JSONObject jSONObject2 = jSONObject1.getJSONObject("a");
            if(!jSONObject2.has("actionButtons")) {
                return;
            }
            JSONArray jSONArray0 = jSONObject2.getJSONArray("actionButtons");
            for(int v1 = 0; true; ++v1) {
                if(v1 >= jSONArray0.length()) {
                    return;
                }
                JSONObject jSONObject3 = jSONArray0.optJSONObject(v1);
                JSONObject jSONObject4 = new JSONObject(jSONObject0.toString());
                Intent intent0 = f0.b(v);
                intent0.setAction("" + v1);
                intent0.putExtra("action_button", true);
                jSONObject4.put("actionId", jSONObject3.optString("id"));
                intent0.putExtra("onesignalData", jSONObject4.toString());
                if(s != null) {
                    intent0.putExtra("summary", s);
                }
                else if(jSONObject0.has("grp")) {
                    intent0.putExtra("grp", jSONObject0.optString("grp"));
                }
                PendingIntent pendingIntent0 = f0.a(v, intent0);
                m$e0.a((jSONObject3.has("icon") ? w.A(jSONObject3.optString("icon")) : 0), jSONObject3.optString("text"), pendingIntent0);
            }
        }
        catch(Throwable throwable0) {
        }
        throwable0.printStackTrace();
    }

    private static void c(b w$b0, Notification notification0) {
        if(!w$b0.b) {
            return;
        }
        try {
            Object object0 = Class.forName("android.app.MiuiNotification").newInstance();
            Field field0 = object0.getClass().getDeclaredField("customizedIcon");
            field0.setAccessible(true);
            field0.set(object0, Boolean.TRUE);
            Field field1 = notification0.getClass().getField("extraNotification");
            field1.setAccessible(true);
            field1.set(notification0, object0);
        }
        catch(Throwable unused_ex) {
        }
    }

    private static void d(W0 w00, e m$e0) {
        Class class0 = e.class;
        if(!w00.l()) {
            return;
        }
        try {
            Field field0 = class0.getDeclaredField("R");
            field0.setAccessible(true);
            Notification notification0 = (Notification)field0.get(m$e0);
            w00.s(notification0.flags);
            w00.t(notification0.sound);
            m$e0.c(null);
            Notification notification1 = (Notification)field0.get(m$e0);
            Field field1 = class0.getDeclaredField("f");
            field1.setAccessible(true);
            CharSequence charSequence0 = (CharSequence)field1.get(m$e0);
            Field field2 = class0.getDeclaredField("e");
            field2.setAccessible(true);
            CharSequence charSequence1 = (CharSequence)field2.get(m$e0);
            w00.u(charSequence0);
            w00.x(charSequence1);
            if(!w00.n()) {
                w00.v(notification1.flags);
                w00.w(notification1.sound);
            }
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
    }

    private static int e(int v) {
        if(v > 9) {
            return 2;
        }
        if(v > 7) {
            return 1;
        }
        if(v > 4) {
            return 0;
        }
        return v <= 2 ? -2 : -1;
    }

    private static Intent f(int v, F f0, JSONObject jSONObject0, String s) {
        return f0.b(v).putExtra("onesignalData", jSONObject0.toString()).putExtra("summary", s);
    }

    private static void g(e m$e0, F f0, JSONObject jSONObject0, String s, int v) {
        SecureRandom secureRandom0 = new SecureRandom();
        m$e0.j(f0.a(secureRandom0.nextInt(), f0.b(v).putExtra("onesignalData", jSONObject0.toString()).putExtra("grp", s)));
        m$e0.n(w.z(secureRandom0.nextInt(), w.y(v).putExtra("grp", s)));
        m$e0.p(s);
        try {
            m$e0.q(((int)w.f));
        }
        catch(Throwable unused_ex) {
        }
    }

    private static Notification h(e m$e0, F f0, JSONObject jSONObject0, int v) {
        SecureRandom secureRandom0 = new SecureRandom();
        m$e0.j(f0.a(secureRandom0.nextInt(), f0.b(v).putExtra("onesignalData", jSONObject0.toString())));
        m$e0.n(w.z(secureRandom0.nextInt(), w.y(v)));
        return m$e0.b();
    }

    private static void i(W0 w00, F f0, int v) {
        SecureRandom secureRandom0 = new SecureRandom();
        w.k(P1.t(w.d), "os_group_undefined", 0xD52D1DDE);
        PendingIntent pendingIntent0 = f0.a(secureRandom0.nextInt(), w.f(0xD52D1DDE, f0, w00.e(), "os_group_undefined"));
        PendingIntent pendingIntent1 = w.z(secureRandom0.nextInt(), w.y(0).putExtra("summary", "os_group_undefined"));
        e m$e0 = w.q(w00).a;
        if(w00.i() != null) {
            m$e0.A(w00.i());
        }
        if(w00.h() != null) {
            m$e0.m(((int)w00.h()));
        }
        m$e0.j(pendingIntent0).n(pendingIntent1).l(w.p()).k(v + " new messages").v(v).z(w.v()).s(w.u()).w(true).f(false).p("os_group_undefined").r(true);
        try {
            m$e0.q(((int)w.f));
        }
        catch(Throwable unused_ex) {
        }
        g m$g0 = new g();
        m$g0.i(v + " new messages");
        m$e0.B(m$g0);
        Notification notification0 = m$e0.b();
        p.d(w.d).f(0xD52D1DDE, notification0);
    }

    private static Notification j(W0 w00, e m$e0) {
        boolean z = Build.VERSION.SDK_INT < 24 && !w00.n();
        if(z && w00.i() != null && !w00.i().equals(w00.g())) {
            m$e0.A(null);
        }
        Notification notification0 = m$e0.b();
        if(z) {
            m$e0.A(w00.i());
        }
        return notification0;
    }

    private static void k(P1 p10, String s, int v) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("android_notification_id", v);
        contentValues0.put("group_id", s);
        contentValues0.put("is_summary", 1);
        p10.F("notification", null, contentValues0);
    }

    private static void l(W0 w00, b w$b0) {
        Notification notification0;
        JSONObject jSONObject1;
        Integer integer0;
        ArrayList arrayList0;
        String s2;
        Cursor cursor0;
        String s1;
        boolean z = w00.n();
        JSONObject jSONObject0 = w00.e();
        F f0 = new F(w.d);
        String s = jSONObject0.optString("grp", null);
        SecureRandom secureRandom0 = new SecureRandom();
        PendingIntent pendingIntent0 = w.z(secureRandom0.nextInt(), w.y(0).putExtra("summary", s));
        P1 p10 = P1.t(w.d);
        String[] arr_s = {s};
        if(z) {
            s1 = "group_id = ? AND dismissed = 0 AND opened = 0";
        }
        else {
            try {
                s1 = "group_id = ? AND dismissed = 0 AND opened = 0 AND android_notification_id <> " + w00.a();
            }
            catch(Throwable throwable0) {
                cursor0 = null;
                goto label_46;
            }
        }
        try {
            cursor0 = null;
            cursor0 = p10.f("notification", new String[]{"android_notification_id", "full_data", "is_summary", "title", "message"}, s1, arr_s, null, null, "_id DESC");
            s2 = "";
            if(cursor0.moveToFirst()) {
                arrayList0 = new ArrayList();
                String s3 = null;
                integer0 = null;
                do {
                    if(cursor0.getInt(cursor0.getColumnIndex("is_summary")) == 1) {
                        integer0 = cursor0.getInt(cursor0.getColumnIndex("android_notification_id"));
                    }
                    else {
                        String s4 = cursor0.getString(cursor0.getColumnIndex("title"));
                        String s5 = s4 == null ? "" : s4 + " ";
                        SpannableString spannableString0 = new SpannableString(s5 + cursor0.getString(cursor0.getColumnIndex("message")));
                        if(s5.length() > 0) {
                            spannableString0.setSpan(new StyleSpan(1), 0, s5.length(), 0);
                        }
                        arrayList0.add(spannableString0);
                        if(s3 == null) {
                            s3 = cursor0.getString(cursor0.getColumnIndex("full_data"));
                        }
                    }
                }
                while(cursor0.moveToNext());
                if(!z || s3 == null) {
                    jSONObject1 = jSONObject0;
                }
                else {
                    try {
                        jSONObject1 = new JSONObject(s3);
                    }
                    catch(JSONException jSONException0) {
                        jSONException0.printStackTrace();
                        jSONObject1 = jSONObject0;
                    }
                }
            }
            else {
                jSONObject1 = jSONObject0;
                arrayList0 = null;
                integer0 = null;
            }
            goto label_49;
        }
        catch(Throwable throwable0) {
        }
    label_46:
        if(cursor0 != null && !cursor0.isClosed()) {
            cursor0.close();
        }
        throw throwable0;
    label_49:
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        if(integer0 == null) {
            int v = secureRandom0.nextInt();
            integer0 = v;
            w.k(p10, s, v);
        }
        PendingIntent pendingIntent1 = f0.a(secureRandom0.nextInt(), w.f(((int)integer0), f0, jSONObject1, s));
        if(arrayList0 == null || (!z || arrayList0.size() <= 1) && (z || arrayList0.size() <= 0)) {
            e m$e1 = w$b0.a;
            m$e1.b.clear();
            w.b(jSONObject1, f0, m$e1, ((int)integer0), s);
            m$e1.j(pendingIntent1).n(pendingIntent0).w(z).f(false).p(s).r(true);
            try {
                m$e1.q(((int)w.f));
            }
            catch(Throwable unused_ex) {
            }
            notification0 = m$e1.b();
            w.c(w$b0, notification0);
        }
        else {
            int v1 = arrayList0.size() + !z;
            String s6 = jSONObject1.optString("grp_msg", null);
            String s7 = s6 == null ? v1 + " new messages" : s6.replace("$[notif_count]", "" + v1);
            e m$e0 = w.q(w00).a;
            if(z) {
                w.G(m$e0);
            }
            else {
                if(w00.i() != null) {
                    m$e0.A(w00.i());
                }
                if(w00.h() != null) {
                    m$e0.m(((int)w00.h()));
                }
            }
            m$e0.j(pendingIntent1).n(pendingIntent0).l(w.p()).k(s7).v(v1).z(w.v()).s(w.u()).w(z).f(false).p(s).r(true);
            try {
                m$e0.q(((int)w.f));
            }
            catch(Throwable unused_ex) {
            }
            if(!z) {
                m$e0.C(s7);
            }
            g m$g0 = new g();
            if(!z) {
                String s8 = w00.k() == null ? null : w00.k().toString();
                if(s8 != null) {
                    s2 = s8 + " ";
                }
                SpannableString spannableString1 = new SpannableString(s2 + w00.c().toString());
                if(s2.length() > 0) {
                    spannableString1.setSpan(new StyleSpan(1), 0, s2.length(), 0);
                }
                m$g0.h(spannableString1);
            }
            for(Object object0: arrayList0) {
                m$g0.h(((SpannableString)object0));
            }
            m$g0.i(s7);
            m$e0.B(m$g0);
            notification0 = m$e0.b();
        }
        p.d(w.d).f(((int)integer0), notification0);
    }

    static boolean m(W0 w00) {
        w.K(w00.d());
        return w.M(w00);
    }

    static boolean n(W0 w00) {
        w.K(w00.d());
        w.E();
        w.D();
        return w.M(w00);
    }

    static BigInteger o(JSONObject jSONObject0) {
        try {
            if(jSONObject0.has("bgac")) {
                return new BigInteger(jSONObject0.optString("bgac", null), 16);
            }
            goto label_2;
        }
        catch(Throwable unused_ex) {
            try {
            label_2:
                String s = OSUtils.k(I1.b, "onesignal_notification_accent_color", null);
                if(s != null) {
                    return new BigInteger(s, 16);
                }
                goto label_5;
            }
            catch(Throwable unused_ex) {
                try {
                label_5:
                    String s1 = OSUtils.f(I1.b, "com.onesignal.NotificationAccentColor.DEFAULT");
                    return s1 == null ? null : new BigInteger(s1, 16);
                }
                catch(Throwable unused_ex) {
                }
                return null;
            }
        }
    }

    private static CharSequence p() {
        ApplicationInfo applicationInfo0 = j.a.a(w.d);
        return applicationInfo0 == null ? "" : w.d.getPackageManager().getApplicationLabel(applicationInfo0);
    }

    private static b q(W0 w00) {
        e m$e0;
        JSONObject jSONObject0 = w00.e();
        b w$b0 = new b(null);
        try {
            String s = j0.c(w00);
            m$e0 = new e(w.d, s);
        }
        catch(Throwable unused_ex) {
            m$e0 = new e(w.d);
        }
        String s1 = jSONObject0.optString("alert", null);
        m$e0.f(true).z(w.B(jSONObject0)).B(new c().h(s1)).k(s1).C(s1);
        if(Build.VERSION.SDK_INT < 24 || !jSONObject0.optString("title").equals("")) {
            m$e0.l(w.C(jSONObject0));
        }
        try {
            BigInteger bigInteger0 = w.o(jSONObject0);
            if(bigInteger0 != null) {
                m$e0.h(bigInteger0.intValue());
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            m$e0.E((jSONObject0.has("vis") ? Integer.parseInt(jSONObject0.optString("vis")) : 1));
        }
        catch(Throwable unused_ex) {
        }
        Bitmap bitmap0 = w.x(jSONObject0);
        if(bitmap0 != null) {
            w$b0.b = true;
            m$e0.s(bitmap0);
        }
        Bitmap bitmap1 = w.r(jSONObject0.optString("bicon", null));
        if(bitmap1 != null) {
            m$e0.B(new androidx.core.app.m.b().i(bitmap1).j(s1));
        }
        if(w00.j() != null) {
            try {
                m$e0.F(((long)w00.j()) * 1000L);
            }
            catch(Throwable unused_ex) {
            }
        }
        w.J(jSONObject0, m$e0);
        w$b0.a = m$e0;
        return w$b0;
    }

    private static Bitmap r(String s) {
        if(s == null) {
            return null;
        }
        String s1 = s.trim();
        return s1.startsWith("http://") || s1.startsWith("https://") ? w.t(s1) : w.s(s);
    }

    private static Bitmap s(String s) {
        String s1;
        Bitmap bitmap0 = null;
        try {
            bitmap0 = BitmapFactory.decodeStream(w.d.getAssets().open(s));
        }
        catch(Throwable unused_ex) {
        }
        if(bitmap0 != null) {
            return bitmap0;
        }
        try {
            Iterator iterator0 = Arrays.asList(new String[]{".png", ".webp", ".jpg", ".gif", ".bmp"}).iterator();
            while(true) {
            label_5:
                if(!iterator0.hasNext()) {
                    int v = w.A(s);
                    return v == 0 ? null : BitmapFactory.decodeResource(w.c, v);
                }
                Object object0 = iterator0.next();
                s1 = (String)object0;
                break;
            }
        }
        catch(Throwable unused_ex) {
            return null;
        }
        try {
            bitmap0 = BitmapFactory.decodeStream(w.d.getAssets().open(s + s1));
        }
        catch(Throwable unused_ex) {
        }
        try {
            if(bitmap0 == null) {
                goto label_5;
            }
            return bitmap0;
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    private static Bitmap t(String s) {
        try {
            return BitmapFactory.decodeStream(new URL(s).openConnection().getInputStream());
        }
        catch(Throwable throwable0) {
            I1.b(C.i, "Could not download image!", throwable0);
            return null;
        }
    }

    private static Bitmap u() {
        return w.H(w.s("ic_onesignal_large_icon_default"));
    }

    private static int v() {
        int v = w.w("ic_stat_onesignal_default");
        if(v != 0) {
            return v;
        }
        int v1 = w.w("corona_statusbar_icon_default");
        if(v1 != 0) {
            return v1;
        }
        int v2 = w.w("ic_os_notification_fallback_white_24dp");
        return v2 == 0 ? 0x108005E : v2;
    }

    private static int w(String s) {
        return w.c.getIdentifier(s, "drawable", w.e);
    }

    private static Bitmap x(JSONObject jSONObject0) {
        Bitmap bitmap0 = w.r(jSONObject0.optString("licon"));
        if(bitmap0 == null) {
            bitmap0 = w.s("ic_onesignal_large_icon_default");
        }
        return bitmap0 == null ? null : w.H(bitmap0);
    }

    private static Intent y(int v) {
        return new Intent(w.d, w.b).putExtra("androidNotificationId", v).putExtra("dismissed", true);
    }

    private static PendingIntent z(int v, Intent intent0) {
        return PendingIntent.getBroadcast(w.d, v, intent0, 0xC000000);
    }
}

