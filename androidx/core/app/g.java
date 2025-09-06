package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

public abstract class g {
    public static IBinder a(Bundle bundle0, String s) {
        return bundle0.getBinder(s);
    }

    public static void b(Bundle bundle0, String s, IBinder iBinder0) {
        bundle0.putBinder(s, iBinder0);
    }
}

