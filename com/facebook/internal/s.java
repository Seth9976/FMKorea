package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.h;
import z3.k;

public final class s {
    public interface a {
        void a(String arg1);
    }

    public static final s a;

    static {
        s.a = new s();
    }

    private final boolean b() {
        return h.e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    private final void c(a s$a0) {
        public static final class b implements InstallReferrerStateListener {
            final InstallReferrerClient a;
            final a b;

            b(InstallReferrerClient installReferrerClient0, a s$a0) {
                this.a = installReferrerClient0;
                this.b = s$a0;
                super();
            }

            @Override  // com.android.installreferrer.api.InstallReferrerStateListener
            public void a(int v) {
                ReferrerDetails referrerDetails0;
                if(b1.a.d(this)) {
                    return;
                }
                switch(v) {
                    case 0: {
                        try {
                            try {
                                k.d(this.a, "referrerClient");
                                referrerDetails0 = this.a.a();
                                k.d(referrerDetails0, "referrerClient.installReferrer");
                            }
                            catch(RemoteException unused_ex) {
                                return;
                            }
                            String s = referrerDetails0.a();
                            if(s != null && (G3.h.x(s, "fb", false, 2, null) || G3.h.x(s, "facebook", false, 2, null))) {
                                this.b.a(s);
                            }
                            s.a.e();
                            return;
                        label_12:
                            s.a.e();
                        }
                        catch(Throwable throwable0) {
                            b1.a.b(throwable0, this);
                        }
                        return;
                    }
                    case 2: {
                        goto label_12;
                    }
                }
            }

            @Override  // com.android.installreferrer.api.InstallReferrerStateListener
            public void b() {
            }
        }

        InstallReferrerClient installReferrerClient0 = InstallReferrerClient.b(h.e()).a();
        b s$b0 = new b(installReferrerClient0, s$a0);
        try {
            installReferrerClient0.c(s$b0);
        }
        catch(Exception unused_ex) {
        }
    }

    public static final void d(a s$a0) {
        k.e(s$a0, "callback");
        s s0 = s.a;
        if(!s0.b()) {
            s0.c(s$a0);
        }
    }

    private final void e() {
        h.e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}

