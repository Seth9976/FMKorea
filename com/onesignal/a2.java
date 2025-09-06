package com.onesignal;

import android.content.Context;
import com.amazon.device.messaging.ADM;

public class a2 implements Z1 {
    private static a a = null;
    private static boolean b = false;

    static {
    }

    @Override  // com.onesignal.Z1
    public void a(Context context0, String s, a z1$a0) {
        class com.onesignal.a2.a implements Runnable {
            final Context f;
            final a g;
            final a2 h;

            com.onesignal.a2.a(Context context0, a z1$a0) {
                this.f = context0;
                this.g = z1$a0;
                super();
            }

            @Override
            public void run() {
                ADM aDM0 = new ADM(this.f);
                String s = aDM0.getRegistrationId();
                if(s == null) {
                    aDM0.startRegister();
                }
                else {
                    I1.a(C.k, "ADM Already registered with ID:" + s);
                    this.g.a(s, 1);
                }
                try {
                    Thread.sleep(30000L);
                }
                catch(InterruptedException unused_ex) {
                }
                I1.a(C.h, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
                a2.c(null);
            }
        }

        a2.a = z1$a0;
        new Thread(new com.onesignal.a2.a(this, context0, z1$a0)).start();
    }

    static boolean b() [...] // 潜在的解密器

    public static void c(String s) {
        a z1$a0 = a2.a;
        if(z1$a0 == null) {
            return;
        }
        a2.b = true;
        z1$a0.a(s, 1);
    }
}

