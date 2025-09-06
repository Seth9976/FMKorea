package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.core.content.a;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

public abstract class b extends a {
    static abstract class androidx.core.app.b.a {
        static void a(Object object0) {
            ((SharedElementCallback.OnSharedElementsReadyListener)object0).onSharedElementsReady();
        }

        static void b(Activity activity0, String[] arr_s, int v) {
            activity0.requestPermissions(arr_s, v);
        }

        static boolean c(Activity activity0, String s) {
            return activity0.shouldShowRequestPermissionRationale(s);
        }
    }

    static abstract class androidx.core.app.b.b {
        static boolean a(Activity activity0) {
            return activity0.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        static boolean b(Activity activity0, String s) {
            try {
                PackageManager packageManager0 = activity0.getApplication().getPackageManager();
                return ((Boolean)PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(packageManager0, s)).booleanValue();
            }
            catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException unused_ex) {
                return activity0.shouldShowRequestPermissionRationale(s);
            }
        }
    }

    static abstract class c {
        static boolean a(Activity activity0, String s) {
            return activity0.shouldShowRequestPermissionRationale(s);
        }
    }

    public interface d {
        void c(int arg1);
    }

    public static void b(Activity activity0) {
        activity0.finishAffinity();
    }

    // 检测为 Lambda 实现
    private static void c(Activity activity0) [...]

    public static void d(Activity activity0) {
        if(Build.VERSION.SDK_INT >= 28) {
            activity0.recreate();
            return;
        }
        new Handler(activity0.getMainLooper()).post(() -> if(!activity0.isFinishing() && !androidx.core.app.d.i(activity0)) {
            activity0.recreate();
        });
    }

    public static void e(Activity activity0, String[] arr_s, int v) {
        HashSet hashSet0 = new HashSet();
        for(int v2 = 0; v2 < arr_s.length; ++v2) {
            if(TextUtils.isEmpty(arr_s[v2])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(arr_s) + " must not contain null or empty values");
            }
            if(Build.VERSION.SDK_INT < 33 && TextUtils.equals(arr_s[v2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet0.add(v2);
            }
        }
        int v3 = hashSet0.size();
        String[] arr_s1 = v3 <= 0 ? arr_s : new String[arr_s.length - v3];
        if(v3 > 0) {
            if(v3 == arr_s.length) {
                return;
            }
            int v4 = 0;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(!hashSet0.contains(v1)) {
                    arr_s1[v4] = arr_s[v1];
                    ++v4;
                }
            }
        }
        if(activity0 instanceof d) {
            ((d)activity0).c(v);
        }
        androidx.core.app.b.a.b(activity0, arr_s, v);
    }

    public static boolean f(Activity activity0, String s) {
        int v = Build.VERSION.SDK_INT;
        if(v < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", s)) {
            return false;
        }
        if(v >= 0x20) {
            return c.a(activity0, s);
        }
        return v == 0x1F ? androidx.core.app.b.b.b(activity0, s) : androidx.core.app.b.a.c(activity0, s);
    }

    public static void g(Activity activity0, Intent intent0, int v, Bundle bundle0) {
        activity0.startActivityForResult(intent0, v, bundle0);
    }

    public static void h(Activity activity0, IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) {
        activity0.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3, bundle0);
    }
}

