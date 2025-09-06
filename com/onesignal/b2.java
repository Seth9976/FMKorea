package com.onesignal;

import android.content.Context;
import java.io.IOException;

abstract class b2 implements Z1 {
    private a a;
    private Thread b;
    private boolean c;
    private static int d = 5;
    private static int e = 10000;

    static {
    }

    @Override  // com.onesignal.Z1
    public void a(Context context0, String s, a z1$a0) {
        this.a = z1$a0;
        if(this.i(s, z1$a0)) {
            this.h(s);
        }
    }

    static int b() [...] // 潜在的解密器

    static int d() [...] // 潜在的解密器

    private boolean e(String s, int v) {
        try {
            String s1 = this.g(s);
            I1.a(C.j, "Device registered, push token = " + s1);
            this.a.a(s1, 1);
            return true;
        }
        catch(IOException iOException0) {
            int v1 = b2.j(iOException0);
            String s2 = OSUtils.l(iOException0);
            if(!"SERVICE_NOT_AVAILABLE".equals(s2) && !"AUTHENTICATION_FAILED".equals(s2)) {
                Exception exception0 = new Exception(iOException0);
                I1.b(C.h, "Error Getting " + this.f() + " Token", exception0);
                if(!this.c) {
                    this.a.a(null, v1);
                }
                return true;
            }
            Exception exception1 = new Exception(iOException0);
            if(v >= b2.d - 1) {
                I1.b(C.h, "Retry count of " + b2.d + " exceed! Could not get a " + this.f() + " Token.", exception1);
                return false;
            }
            I1.b(C.j, "\'Google Play services\' returned " + s2 + " error. Current retry count: " + v, exception1);
            if(v == 2) {
                this.a.a(null, v1);
                this.c = true;
                return true;
            }
            return false;
        }
        catch(Throwable throwable0) {
            Exception exception2 = new Exception(throwable0);
            I1.b(C.h, "Unknown error getting " + this.f() + " Token", exception2);
            this.a.a(null, b2.j(throwable0));
            return true;
        }
    }

    abstract String f();

    abstract String g(String arg1);

    private void h(String s) {
        try {
            if(OSUtils.D()) {
                this.k(s);
                return;
            }
            B.d();
            I1.a(C.h, "\'Google Play services\' app not installed or disabled on the device.");
            this.a.a(null, -7);
            return;
        }
        catch(Throwable throwable0) {
        }
        I1.b(C.h, "Could not register with " + this.f() + " due to an issue with your AndroidManifest.xml or with \'Google Play services\'.", throwable0);
        this.a.a(null, -8);
    }

    private boolean i(String s, a z1$a0) {
        try {
            Float.parseFloat(s);
            return true;
        }
        catch(Throwable unused_ex) {
            I1.a(C.h, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.");
            z1$a0.a(null, -6);
            return false;
        }
    }

    private static int j(Throwable throwable0) {
        String s = OSUtils.l(throwable0);
        if(throwable0 instanceof IOException) {
            if("SERVICE_NOT_AVAILABLE".equals(s)) {
                return -9;
            }
            return "AUTHENTICATION_FAILED".equals(s) ? -29 : -11;
        }
        return -12;
    }

    private void k(String s) {
        class com.onesignal.b2.a implements Runnable {
            final String f;
            final b2 g;

            com.onesignal.b2.a(String s) {
                this.f = s;
                super();
            }

            @Override
            public void run() {
                int v = 0;
                while(v < 5 && !b2.this.e(this.f, v)) {
                    ++v;
                    OSUtils.V(10000 * v);
                }
            }
        }

        synchronized(this) {
            if(this.b != null && this.b.isAlive()) {
                return;
            }
            Thread thread0 = new Thread(new com.onesignal.b2.a(this, s));
            this.b = thread0;
            thread0.start();
        }
    }
}

