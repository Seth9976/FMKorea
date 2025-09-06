package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import b.a.a;
import b.b;

public abstract class c {
    private final b a;
    private final ComponentName b;
    private final Context c;

    c(b b0, ComponentName componentName0, Context context0) {
        this.a = b0;
        this.b = componentName0;
        this.c = context0;
    }

    public static boolean a(Context context0, String s, e e0) {
        e0.setApplicationContext(context0.getApplicationContext());
        Intent intent0 = new Intent("android.support.customtabs.action.CustomTabsService");
        if(!TextUtils.isEmpty(s)) {
            intent0.setPackage(s);
        }
        return context0.bindService(intent0, e0, 33);
    }

    private a b(androidx.browser.customtabs.b b0) {
        class androidx.browser.customtabs.c.a extends a {
            private Handler f;
            final c g;

            androidx.browser.customtabs.c.a(androidx.browser.customtabs.b b0) {
                this.f = new Handler(Looper.getMainLooper());
            }

            @Override  // b.a
            public void b(int v, int v1, int v2, int v3, int v4, Bundle bundle0) {
            }

            @Override  // b.a
            public Bundle e(String s, Bundle bundle0) {
                return null;
            }

            @Override  // b.a
            public void i(Bundle bundle0) {
            }

            @Override  // b.a
            public void k(Bundle bundle0) {
            }

            @Override  // b.a
            public void m(int v, int v1, Bundle bundle0) {
            }

            @Override  // b.a
            public void n(String s, Bundle bundle0) {
            }

            @Override  // b.a
            public void p(Bundle bundle0) {
            }

            @Override  // b.a
            public void q(int v, Bundle bundle0) {
            }

            @Override  // b.a
            public void r(String s, Bundle bundle0) {
            }

            @Override  // b.a
            public void t(Bundle bundle0) {
            }

            @Override  // b.a
            public void u(int v, Uri uri0, boolean z, Bundle bundle0) {
            }
        }

        return new androidx.browser.customtabs.c.a(this, b0);
    }

    public f c(androidx.browser.customtabs.b b0) {
        return this.d(b0, null);
    }

    private f d(androidx.browser.customtabs.b b0, PendingIntent pendingIntent0) {
        a a$a0 = this.b(b0);
        try {
            if(pendingIntent0 != null) {
                Bundle bundle0 = new Bundle();
                bundle0.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent0);
                return this.a.o(a$a0, bundle0) ? new f(this.a, a$a0, this.b, pendingIntent0) : null;
            }
            return this.a.j(a$a0) ? new f(this.a, a$a0, this.b, null) : null;
        }
        catch(RemoteException unused_ex) {
            return null;
        }
    }

    public boolean e(long v) {
        try {
            return this.a.h(v);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }
}

