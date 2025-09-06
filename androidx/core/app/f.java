package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build.VERSION;

public abstract class f {
    static abstract class a {
        static Object a(Context context0, Class class0) {
            return context0.getSystemService(class0);
        }

        static int b(AppOpsManager appOpsManager0, String s, String s1) {
            return appOpsManager0.noteProxyOp(s, s1);
        }

        static int c(AppOpsManager appOpsManager0, String s, String s1) {
            return appOpsManager0.noteProxyOpNoThrow(s, s1);
        }

        static String d(String s) {
            return AppOpsManager.permissionToOp(s);
        }
    }

    static abstract class b {
        static int a(AppOpsManager appOpsManager0, String s, int v, String s1) {
            return appOpsManager0 == null ? 1 : appOpsManager0.checkOpNoThrow(s, v, s1);
        }

        static String b(Context context0) {
            return context0.getOpPackageName();
        }

        static AppOpsManager c(Context context0) {
            return (AppOpsManager)context0.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(Context context0, int v, String s, String s1) {
        if(Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManager0 = b.c(context0);
            int v1 = b.a(appOpsManager0, s, Binder.getCallingUid(), s1);
            return v1 == 0 ? b.a(appOpsManager0, s, v, b.b(context0)) : v1;
        }
        return f.b(context0, s, s1);
    }

    public static int b(Context context0, String s, String s1) {
        return a.c(((AppOpsManager)a.a(context0, AppOpsManager.class)), s, s1);
    }

    public static String c(String s) {
        return a.d(s);
    }
}

