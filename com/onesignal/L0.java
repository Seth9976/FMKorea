package com.onesignal;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build.VERSION;
import androidx.core.app.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

abstract class l0 {
    static {
    }

    private static void a(JSONArray jSONArray0, String s, P1 p10) {
        Cursor cursor0 = p10.f("notification", new String[]{"full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{s}, null, null, null);
        if(cursor0.getCount() > 1) {
            cursor0.moveToFirst();
            while(true) {
                try {
                label_3:
                    jSONArray0.put(new JSONObject(cursor0.getString(cursor0.getColumnIndex("full_data"))));
                }
                catch(JSONException unused_ex) {
                    I1.a(C.h, "Could not parse JSON of sub notification in group: " + s);
                }
                if(cursor0.moveToNext()) {
                    goto label_3;
                }
                break;
            }
        }
        cursor0.close();
    }

    private static void b(Context context0, P1 p10, String s) {
        if(s != null) {
            p0.a(context0, p10, s);
            return;
        }
        if(((int)R1.e(context0)) < 1) {
            R1.i(context0).cancel(0xD52D1DDE);
        }
    }

    private static void c(Context context0, Intent intent0) {
        if(intent0.getBooleanExtra("action_button", false)) {
            p.d(context0).b(intent0.getIntExtra("androidNotificationId", 0));
            if(Build.VERSION.SDK_INT < 0x1F) {
                context0.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    // 去混淆评级： 低(30)
    private static boolean d(Intent intent0) {
        return intent0.hasExtra("onesignalData") || intent0.hasExtra("summary") || intent0.hasExtra("androidNotificationId");
    }

    private static void e(Context context0, Intent intent0, P1 p10, boolean z) {
        String s1;
        String s = intent0.getStringExtra("summary");
        String[] arr_s = null;
        if(s == null) {
            s1 = "android_notification_id = " + intent0.getIntExtra("androidNotificationId", 0);
        }
        else {
            boolean z1 = s.equals("os_group_undefined");
            if(z1) {
                s1 = "group_id IS NULL";
            }
            else {
                arr_s = new String[]{s};
                s1 = "group_id = ?";
            }
            if(!z && !I1.Y()) {
                String s2 = String.valueOf(R1.h(p10, s, z1));
                s1 = s1 + " AND android_notification_id = ?";
                arr_s = z1 ? new String[]{s2} : new String[]{s, s2};
            }
        }
        l0.b(context0, p10, s);
        p10.a("notification", l0.f(intent0), s1, arr_s);
        l.c(p10, context0);
    }

    private static ContentValues f(Intent intent0) {
        ContentValues contentValues0 = new ContentValues();
        if(intent0.getBooleanExtra("dismissed", false)) {
            contentValues0.put("dismissed", 1);
            return contentValues0;
        }
        contentValues0.put("opened", 1);
        return contentValues0;
    }

    static void g(Context context0, Intent intent0) {
        if(!l0.d(intent0)) {
            return;
        }
        if(context0 != null) {
            I1.X0(context0.getApplicationContext());
        }
        l0.c(context0, intent0);
        l0.h(context0, intent0);
    }

    static void h(Context context0, Intent intent0) {
        X0 x00;
        P1 p10 = P1.t(context0);
        String s = intent0.getStringExtra("summary");
        boolean z = intent0.getBooleanExtra("dismissed", false);
        if(z) {
            x00 = null;
        }
        else {
            x00 = l0.i(context0, intent0, p10, s);
            if(x00 == null) {
                return;
            }
        }
        l0.e(context0, intent0, p10, z);
        if(s == null) {
            String s1 = intent0.getStringExtra("grp");
            if(s1 != null) {
                p0.f(context0, p10, s1, z);
            }
        }
        C i1$C0 = C.k;
        I1.p1(i1$C0, "processIntent from context: " + context0 + " and intent: " + intent0);
        if(intent0.getExtras() != null) {
            I1.p1(i1$C0, "processIntent intent extras: " + intent0.getExtras().toString());
        }
        if(!z) {
            if(!(context0 instanceof Activity)) {
                I1.p1(C.h, "NotificationOpenedProcessor processIntent from an non Activity context: " + context0);
                return;
            }
            I1.Q0(((Activity)context0), x00.a(), V0.b(x00.b()));
        }
    }

    static X0 i(Context context0, Intent intent0, P1 p10, String s) {
        JSONObject jSONObject0;
        JSONArray jSONArray0 = null;
        try {
            jSONObject0 = null;
            jSONObject0 = new JSONObject(intent0.getStringExtra("onesignalData"));
            if(!(context0 instanceof Activity)) {
                I1.p1(C.h, "NotificationOpenedProcessor processIntent from an non Activity context: " + context0);
            }
            else if(I0.b(((Activity)context0), jSONObject0)) {
                return null;
            }
            jSONObject0.put("androidNotificationId", intent0.getIntExtra("androidNotificationId", 0));
            intent0.putExtra("onesignalData", jSONObject0.toString());
            jSONArray0 = S.g(new JSONObject(intent0.getStringExtra("onesignalData")));
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        if(s != null) {
            l0.a(jSONArray0, s, p10);
        }
        return new X0(jSONArray0, jSONObject0);
    }
}

