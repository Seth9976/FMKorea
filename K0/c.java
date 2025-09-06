package k0;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import z3.k;

public final class c {
    public static final c a;

    static {
        c.a = new c();
    }

    public static final Uri a(Cursor cursor0) {
        k.e(cursor0, "cursor");
        Uri uri0 = cursor0.getNotificationUri();
        k.d(uri0, "cursor.notificationUri");
        return uri0;
    }

    public static final boolean b(ActivityManager activityManager0) {
        k.e(activityManager0, "activityManager");
        return activityManager0.isLowRamDevice();
    }
}

