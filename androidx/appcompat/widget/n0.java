package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets.Builder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class n0 {
    static abstract class a {
        static void a(View view0, Rect rect0, Rect rect1) {
            Insets insets0 = view0.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect0)).build(), rect1).getSystemWindowInsets();
            rect0.set(insets0.left, insets0.top, insets0.right, insets0.bottom);
        }
    }

    private static boolean a;
    private static Method b;
    static final boolean c;

    static {
        n0.c = Build.VERSION.SDK_INT >= 27;
    }

    public static void a(View view0, Rect rect0, Rect rect1) {
        if(Build.VERSION.SDK_INT >= 29) {
            a.a(view0, rect0, rect1);
            return;
        }
        if(!n0.a) {
            try {
                n0.a = true;
                Method method0 = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                n0.b = method0;
                if(!method0.isAccessible()) {
                    n0.b.setAccessible(true);
                }
            }
            catch(NoSuchMethodException unused_ex) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
        Method method1 = n0.b;
        if(method1 != null) {
            try {
                method1.invoke(view0, rect0, rect1);
            }
            catch(Exception exception0) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", exception0);
            }
        }
    }

    public static boolean b(View view0) {
        return view0.getLayoutDirection() == 1;
    }

    public static void c(View view0) {
        try {
            Method method0 = view0.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if(!method0.isAccessible()) {
                method0.setAccessible(true);
            }
            method0.invoke(view0, null);
            return;
        }
        catch(NoSuchMethodException unused_ex) {
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", invocationTargetException0);
            return;
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", illegalAccessException0);
            return;
        }
        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
    }
}

