package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import b.a;
import b.b;
import java.util.List;

public final class f {
    private final Object a;
    private final b b;
    private final a c;
    private final ComponentName d;
    private final PendingIntent e;

    f(b b0, a a0, ComponentName componentName0, PendingIntent pendingIntent0) {
        this.a = new Object();
        this.b = b0;
        this.c = a0;
        this.d = componentName0;
        this.e = pendingIntent0;
    }

    private void a(Bundle bundle0) {
        PendingIntent pendingIntent0 = this.e;
        if(pendingIntent0 != null) {
            bundle0.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent0);
        }
    }

    private Bundle b(Bundle bundle0) {
        Bundle bundle1 = new Bundle();
        if(bundle0 != null) {
            bundle1.putAll(bundle0);
        }
        this.a(bundle1);
        return bundle1;
    }

    IBinder c() {
        return this.c.asBinder();
    }

    ComponentName d() {
        return this.d;
    }

    PendingIntent e() {
        return this.e;
    }

    public boolean f(Uri uri0, Bundle bundle0, List list0) {
        Bundle bundle1 = this.b(bundle0);
        try {
            return this.b.f(this.c, uri0, bundle1, list0);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }
}

