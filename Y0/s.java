package y0;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import androidx.work.b;
import androidx.work.u;
import java.lang.reflect.Method;
import java.util.List;
import z3.k;

public abstract class s {
    private static final String a;

    // 去混淆评级： 低(20)
    static {
        k.d("WM-ProcessUtils", "tagWithPrefix(\"ProcessUtils\")");
        s.a = "WM-ProcessUtils";
    }

    private static final String a(Context context0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return a.a.a();
        }
        try {
            Method method0 = Class.forName("android.app.ActivityThread", false, u.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            method0.setAccessible(true);
            Object object0 = method0.invoke(null, null);
            k.b(object0);
            if(object0 instanceof String) {
                return (String)object0;
            }
        }
        catch(Throwable throwable0) {
            androidx.work.k.e().b("WM-ProcessUtils", "Unable to check ActivityThread for processName", throwable0);
        }
        int v = Process.myPid();
        Object object1 = context0.getSystemService("activity");
        k.c(object1, "null cannot be cast to non-null type android.app.ActivityManager");
        List list0 = ((ActivityManager)object1).getRunningAppProcesses();
        if(list0 != null) {
            for(Object object2: list0) {
                if(((ActivityManager.RunningAppProcessInfo)object2).pid == v) {
                    return ((ActivityManager.RunningAppProcessInfo)object2) == null ? null : ((ActivityManager.RunningAppProcessInfo)object2).processName;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
        return null;
    }

    public static final boolean b(Context context0, b b0) {
        k.e(context0, "context");
        k.e(b0, "configuration");
        String s = s.a(context0);
        String s1 = b0.c();
        return s1 == null || s1.length() == 0 ? k.a(s, context0.getApplicationInfo().processName) : k.a(s, b0.c());
    }
}

