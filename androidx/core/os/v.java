package androidx.core.os;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserManager;

public abstract class v {
    static abstract class a {
        static boolean a(Context context0) {
            return ((UserManager)context0.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(Context context0) {
        return Build.VERSION.SDK_INT < 24 ? true : a.a(context0);
    }
}

