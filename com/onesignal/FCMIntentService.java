package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;

public class FCMIntentService extends IntentService {
    public FCMIntentService() {
        super("FCMIntentService");
        this.setIntentRedelivery(true);
    }

    @Override  // android.app.IntentService
    protected void onHandleIntent(Intent intent0) {
        class a implements e {
            final Intent a;
            final FCMIntentService b;

            a(Intent intent0) {
                this.a = intent0;
                super();
            }

            @Override  // com.onesignal.S$e
            public void a(f s$f0) {
                U.a.completeWakefulIntent(this.a);
            }
        }

        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            return;
        }
        I1.X0(this);
        S.h(this, bundle0, new a(this, intent0));
    }
}

