package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.app.p;
import androidx.core.content.res.h;
import androidx.core.os.i;
import java.io.File;
import java.util.concurrent.Executor;

public abstract class a {
    static abstract class androidx.core.content.a.a {
        static File a(Context context0) {
            return context0.getCodeCacheDir();
        }

        static Drawable b(Context context0, int v) {
            return context0.getDrawable(v);
        }

        static File c(Context context0) {
            return context0.getNoBackupFilesDir();
        }
    }

    static abstract class b {
        static int a(Context context0, int v) {
            return context0.getColor(v);
        }

        static Object b(Context context0, Class class0) {
            return context0.getSystemService(class0);
        }

        static String c(Context context0, Class class0) {
            return context0.getSystemServiceName(class0);
        }
    }

    static abstract class c {
        static Context a(Context context0) {
            return context0.createDeviceProtectedStorageContext();
        }

        static File b(Context context0) {
            return context0.getDataDir();
        }

        static boolean c(Context context0) {
            return context0.isDeviceProtectedStorage();
        }
    }

    static abstract class d {
        static Intent a(Context context0, BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0, String s, Handler handler0, int v) {
            return (v & 4) == 0 || s != null ? context0.registerReceiver(broadcastReceiver0, intentFilter0, s, handler0, v & 1) : context0.registerReceiver(broadcastReceiver0, intentFilter0, a.obtainAndCheckReceiverPermission(context0), handler0);
        }

        static ComponentName b(Context context0, Intent intent0) {
            return context0.startForegroundService(intent0);
        }
    }

    static abstract class e {
        static Executor a(Context context0) {
            return context0.getMainExecutor();
        }
    }

    static abstract class f {
        static Context a(Context context0, String s) {
            return context0.createAttributionContext(s);
        }

        static String b(Context context0) {
            return context0.getAttributionTag();
        }

        static Display c(Context context0) {
            try {
                return context0.getDisplay();
            }
            catch(UnsupportedOperationException unused_ex) {
                Log.w("ContextCompat", "The context:" + context0 + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager)context0.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    static abstract class g {
        static Intent a(Context context0, BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0, String s, Handler handler0, int v) {
            return context0.registerReceiver(broadcastReceiver0, intentFilter0, s, handler0, v);
        }
    }

    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync;

    static {
        a.sSync = new Object();
    }

    public static int checkSelfPermission(Context context0, String s) {
        B.c.d(s, "permission must be non-null");
        if(Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", s)) {
            return p.d(context0).a() ? 0 : -1;
        }
        return context0.checkPermission(s, Process.myPid(), Process.myUid());
    }

    public static Context createAttributionContext(Context context0, String s) {
        return Build.VERSION.SDK_INT < 30 ? context0 : f.a(context0, s);
    }

    public static Context createDeviceProtectedStorageContext(Context context0) {
        return Build.VERSION.SDK_INT < 24 ? null : c.a(context0);
    }

    public static String getAttributionTag(Context context0) {
        return Build.VERSION.SDK_INT < 30 ? null : f.b(context0);
    }

    public static File getCodeCacheDir(Context context0) {
        return androidx.core.content.a.a.a(context0);
    }

    public static int getColor(Context context0, int v) {
        return b.a(context0, v);
    }

    public static ColorStateList getColorStateList(Context context0, int v) {
        return h.e(context0.getResources(), v, context0.getTheme());
    }

    public static Context getContextForLanguage(Context context0) {
        i i0 = androidx.core.app.i.a(context0);
        if(Build.VERSION.SDK_INT <= 0x20 && !i0.f()) {
            Configuration configuration0 = new Configuration(context0.getResources().getConfiguration());
            androidx.core.os.e.b(configuration0, i0);
            return context0.createConfigurationContext(configuration0);
        }
        return context0;
    }

    public static File getDataDir(Context context0) {
        if(Build.VERSION.SDK_INT >= 24) {
            return c.b(context0);
        }
        String s = context0.getApplicationInfo().dataDir;
        return s == null ? null : new File(s);
    }

    public static Display getDisplayOrDefault(Context context0) {
        return Build.VERSION.SDK_INT < 30 ? ((WindowManager)context0.getSystemService("window")).getDefaultDisplay() : f.c(context0);
    }

    public static Drawable getDrawable(Context context0, int v) {
        return androidx.core.content.a.a.b(context0, v);
    }

    public static File[] getExternalCacheDirs(Context context0) {
        return context0.getExternalCacheDirs();
    }

    public static File[] getExternalFilesDirs(Context context0, String s) {
        return context0.getExternalFilesDirs(s);
    }

    public static Executor getMainExecutor(Context context0) {
        return Build.VERSION.SDK_INT < 28 ? androidx.core.os.g.a(new Handler(context0.getMainLooper())) : e.a(context0);
    }

    public static File getNoBackupFilesDir(Context context0) {
        return androidx.core.content.a.a.c(context0);
    }

    public static File[] getObbDirs(Context context0) {
        return context0.getObbDirs();
    }

    public static String getString(Context context0, int v) {
        return a.getContextForLanguage(context0).getString(v);
    }

    public static Object getSystemService(Context context0, Class class0) {
        return b.b(context0, class0);
    }

    public static String getSystemServiceName(Context context0, Class class0) {
        return b.c(context0, class0);
    }

    public static boolean isDeviceProtectedStorage(Context context0) {
        return Build.VERSION.SDK_INT < 24 ? false : c.c(context0);
    }

    // 去混淆评级： 低(33)
    static String obtainAndCheckReceiverPermission(Context context0) {
        if(androidx.core.content.d.b(context0, "com.fmkorea.m.fmk.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION") != 0) {
            throw new RuntimeException("Permission com.fmkorea.m.fmk.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION is required by your application to receive broadcasts, please add it to your manifest");
        }
        return "com.fmkorea.m.fmk.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    }

    public static Intent registerReceiver(Context context0, BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0, int v) {
        return a.registerReceiver(context0, broadcastReceiver0, intentFilter0, null, null, v);
    }

    public static Intent registerReceiver(Context context0, BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0, String s, Handler handler0, int v) {
        if((v & 1) != 0 && (v & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if((v & 1) != 0) {
            v |= 2;
        }
        if((v & 2) == 0 && (v & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if((v & 2) != 0 && (v & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 33) {
            return g.a(context0, broadcastReceiver0, intentFilter0, s, handler0, v);
        }
        if(v1 >= 26) {
            return d.a(context0, broadcastReceiver0, intentFilter0, s, handler0, v);
        }
        return (v & 4) == 0 || s != null ? context0.registerReceiver(broadcastReceiver0, intentFilter0, s, handler0) : context0.registerReceiver(broadcastReceiver0, intentFilter0, a.obtainAndCheckReceiverPermission(context0), handler0);
    }

    public static boolean startActivities(Context context0, Intent[] arr_intent) {
        return a.startActivities(context0, arr_intent, null);
    }

    public static boolean startActivities(Context context0, Intent[] arr_intent, Bundle bundle0) {
        context0.startActivities(arr_intent, bundle0);
        return true;
    }

    public static void startActivity(Context context0, Intent intent0, Bundle bundle0) {
        context0.startActivity(intent0, bundle0);
    }

    public static void startForegroundService(Context context0, Intent intent0) {
        if(Build.VERSION.SDK_INT >= 26) {
            d.b(context0, intent0);
            return;
        }
        context0.startService(intent0);
    }
}

