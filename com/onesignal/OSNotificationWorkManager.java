package com.onesignal;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.e;
import androidx.work.j.a;
import androidx.work.m;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

abstract class OSNotificationWorkManager {
    public static class NotificationWorker extends Worker {
        public NotificationWorker(Context context0, WorkerParameters workerParameters0) {
            super(context0, workerParameters0);
        }

        private void b(Context context0, int v, JSONObject jSONObject0, boolean z, Long long0) {
            R0 r00 = new R0(null, jSONObject0, v);
            b1 b10 = new b1(new T0(context0, r00, jSONObject0, z, true, long0), r00);
            I1.a(C.i, "remoteNotificationReceivedHandler not setup, displaying normal OneSignal notification");
            b10.b(r00);
        }

        @Override  // androidx.work.Worker
        public a doWork() {
            d d0 = this.getInputData();
            try {
                I1.p1(C.k, "NotificationWorker running doWork with data: " + d0);
                int v = d0.i("android_notif_id", 0);
                JSONObject jSONObject0 = new JSONObject(d0.l("json_payload"));
                long v1 = d0.k("timestamp", System.currentTimeMillis() / 1000L);
                this.b(this.getApplicationContext(), v, jSONObject0, d0.h("is_restoring", false), v1);
                return a.c();
            }
            catch(JSONException jSONException0) {
                I1.p1(C.h, "Error occurred doing work for job with id: " + this.getId().toString());
                jSONException0.printStackTrace();
                return a.a();
            }
        }
    }

    private static Set a;

    static {
        OSNotificationWorkManager.a = OSUtils.K();
    }

    static boolean a(String s) {
        if(OSUtils.I(s)) {
            if(OSNotificationWorkManager.a.contains(s)) {
                I1.a(C.k, "OSNotificationWorkManager notification with notificationId: " + s + " already queued");
                return false;
            }
            OSNotificationWorkManager.a.add(s);
        }
        return true;
    }

    static void b(Context context0, String s, int v, String s1, long v1, boolean z, boolean z1) {
        d d0 = new androidx.work.d.a().f("android_notif_id", v).h("json_payload", s1).g("timestamp", v1).e("is_restoring", z).a();
        m m0 = (m)((androidx.work.m.a)new androidx.work.m.a(NotificationWorker.class).l(d0)).b();
        I1.a(C.k, "OSNotificationWorkManager enqueueing notification work with notificationId: " + s + " and jsonPayload: " + s1);
        F1.a(context0).d(s, e.g, m0);
    }

    static void c(String s) {
        if(OSUtils.I(s)) {
            OSNotificationWorkManager.a.remove(s);
        }
    }
}

