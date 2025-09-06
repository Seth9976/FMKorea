package com.onesignal;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;

class d2 implements Z1 {
    private static boolean a;
    private static a b;

    @Override  // com.onesignal.Z1
    public void a(Context context0, String s, a z1$a0) {
        class com.onesignal.d2.a implements Runnable {
            final Context f;
            final a g;
            final d2 h;

            com.onesignal.d2.a(Context context0, a z1$a0) {
                this.f = context0;
                this.g = z1$a0;
                super();
            }

            @Override
            public void run() {
                try {
                    d2.this.d(this.f, this.g);
                }
                catch(ApiException apiException0) {
                    I1.b(C.h, "HMS ApiException getting Huawei push token!", ((Throwable)apiException0));
                    int v = apiException0.getStatusCode() == 907135000 ? -26 : -27;
                    this.g.a(null, v);
                }
            }
        }

        d2.b = z1$a0;
        new Thread(new com.onesignal.d2.a(this, context0, z1$a0), "OS_HMS_GET_TOKEN").start();
    }

    private static void c() {
        try {
            Thread.sleep(30000L);
        }
        catch(InterruptedException unused_ex) {
        }
    }

    private void d(Context context0, a z1$a0) {
        synchronized(this) {
            if(!OSUtils.p()) {
                z1$a0.a(null, -28);
                return;
            }
            String s = AGConnectServicesConfig.fromContext(context0).getString("client/app_id");
            String s1 = HmsInstanceId.getInstance(context0).getToken(s, "HCM");
            if(TextUtils.isEmpty(s1)) {
                this.e(z1$a0);
            }
            else {
                I1.a(C.j, "Device registered for HMS, push token = " + s1);
                z1$a0.a(s1, 1);
            }
        }
    }

    private void e(a z1$a0) {
        d2.c();
        if(!d2.a) {
            I1.a(C.h, "HmsMessageServiceOneSignal.onNewToken timed out.");
            z1$a0.a(null, -25);
        }
    }
}

