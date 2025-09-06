package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.h.a;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements l {
    private Activity f;
    private static int g;
    private static Field h;
    private static Field i;
    private static Field j;

    static {
    }

    ImmLeaksCleaner(Activity activity0) {
        this.f = activity0;
    }

    @Override  // androidx.lifecycle.l
    public void c(n n0, a h$a0) {
        Object object0;
        if(h$a0 != a.ON_DESTROY) {
            return;
        }
        if(ImmLeaksCleaner.g == 0) {
            ImmLeaksCleaner.h();
        }
        if(ImmLeaksCleaner.g == 1) {
            InputMethodManager inputMethodManager0 = (InputMethodManager)this.f.getSystemService("input_method");
            try {
                object0 = ImmLeaksCleaner.h.get(inputMethodManager0);
                if(object0 == null) {
                    return;
                }
            }
            catch(IllegalAccessException unused_ex) {
                return;
            }
            synchronized(object0) {
                try {
                    View view0 = (View)ImmLeaksCleaner.i.get(inputMethodManager0);
                }
                catch(IllegalAccessException unused_ex) {
                    return;
                }
                catch(ClassCastException unused_ex) {
                    return;
                }
            }
            if(view0 == null) {
                return;
            }
            if(view0.isAttachedToWindow()) {
                return;
            }
            try {
                ImmLeaksCleaner.j.set(inputMethodManager0, null);
            }
            catch(IllegalAccessException unused_ex) {
                return;
            }
            inputMethodManager0.isActive();
        }
    }

    private static void h() {
        try {
            ImmLeaksCleaner.g = 2;
            Field field0 = InputMethodManager.class.getDeclaredField("mServedView");
            ImmLeaksCleaner.i = field0;
            field0.setAccessible(true);
            Field field1 = InputMethodManager.class.getDeclaredField("mNextServedView");
            ImmLeaksCleaner.j = field1;
            field1.setAccessible(true);
            Field field2 = InputMethodManager.class.getDeclaredField("mH");
            ImmLeaksCleaner.h = field2;
            field2.setAccessible(true);
            ImmLeaksCleaner.g = 1;
        }
        catch(NoSuchFieldException unused_ex) {
        }
    }
}

