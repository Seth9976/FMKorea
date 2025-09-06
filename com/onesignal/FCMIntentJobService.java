package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

public class FCMIntentJobService extends JobIntentService {
    @Override  // com.onesignal.JobIntentService
    protected void g(Intent intent0) {
        class a implements e {
            final FCMIntentJobService a;

            @Override  // com.onesignal.S$e
            public void a(f s$f0) {
            }
        }

        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            return;
        }
        I1.X0(this);
        S.h(this, bundle0, new a(this));
    }

    @Override  // com.onesignal.JobIntentService
    public boolean h() {
        return super.h();
    }

    public static void j(Context context0, Intent intent0) {
        JobIntentService.d(context0, FCMIntentJobService.class, 0x1E3F2, intent0, false);
    }

    @Override  // com.onesignal.JobIntentService
    public IBinder onBind(Intent intent0) {
        return super.onBind(intent0);
    }

    @Override  // com.onesignal.JobIntentService
    public void onCreate() {
        super.onCreate();
    }

    @Override  // com.onesignal.JobIntentService
    public void onDestroy() {
        super.onDestroy();
    }

    @Override  // com.onesignal.JobIntentService
    public int onStartCommand(Intent intent0, int v, int v1) {
        return super.onStartCommand(intent0, v, v1);
    }
}

