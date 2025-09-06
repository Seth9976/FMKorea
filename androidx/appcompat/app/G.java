package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.m0;
import androidx.core.app.e;
import androidx.core.os.i;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

public abstract class g {
    static abstract class a {
        static LocaleList a(String s) {
            return LocaleList.forLanguageTags(s);
        }
    }

    static abstract class b {
        static LocaleList a(Object object0) {
            return ((LocaleManager)object0).getApplicationLocales();
        }

        static void b(Object object0, LocaleList localeList0) {
            ((LocaleManager)object0).setApplicationLocales(localeList0);
        }
    }

    static class c implements Executor {
        private final Object f;
        final Queue g;
        final Executor h;
        Runnable i;

        c(Executor executor0) {
            this.f = new Object();
            this.g = new ArrayDeque();
            this.h = executor0;
        }

        // 检测为 Lambda 实现
        private void c(Runnable runnable0) [...]

        protected void d() {
            synchronized(this.f) {
                Runnable runnable0 = (Runnable)this.g.poll();
                this.i = runnable0;
                if(runnable0 != null) {
                    this.h.execute(runnable0);
                }
            }
        }

        @Override
        public void execute(Runnable runnable0) {
            synchronized(this.f) {
                h h0 = () -> try {
                    runnable0.run();
                }
                finally {
                    this.d();
                };
                this.g.add(h0);
                if(this.i == null) {
                    this.d();
                }
            }
        }
    }

    static class d implements Executor {
        @Override
        public void execute(Runnable runnable0) {
            new Thread(runnable0).start();
        }
    }

    static c f;
    private static int g;
    private static i h;
    private static i i;
    private static Boolean j;
    private static boolean k;
    private static final androidx.collection.b l;
    private static final Object m;
    private static final Object n;

    static {
        g.f = new c(new d());
        g.g = -100;
        g.h = null;
        g.i = null;
        g.j = null;
        g.k = false;
        g.l = new androidx.collection.b();
        g.m = new Object();
        g.n = new Object();
    }

    public abstract void A(Bundle arg1);

    public abstract void B();

    public abstract void C(Bundle arg1);

    public abstract void D();

    public abstract void E(Bundle arg1);

    public abstract void F();

    public abstract void G();

    static void H(g g0) {
        synchronized(g.m) {
            g.I(g0);
        }
    }

    private static void I(g g0) {
        synchronized(g.m) {
            Iterator iterator0 = g.l.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                g g1 = (g)((WeakReference)object1).get();
                if(g1 == g0 || g1 == null) {
                    iterator0.remove();
                }
            }
        }
    }

    public abstract boolean J(int arg1);

    public static void K(boolean z) {
        m0.c(z);
    }

    public abstract void L(int arg1);

    public abstract void M(View arg1);

    public abstract void N(View arg1, ViewGroup.LayoutParams arg2);

    public static void O(int v) {
        if(v != -1 && v != 0 && (v != 1 && v != 2 && v != 3)) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if(g.g != v) {
            g.g = v;
            g.g();
        }
    }

    public void P(OnBackInvokedDispatcher onBackInvokedDispatcher0) {
    }

    public abstract void Q(Toolbar arg1);

    public abstract void R(int arg1);

    public abstract void S(CharSequence arg1);

    static void T(Context context0) {
        if(Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName0 = new ComponentName(context0, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if(context0.getPackageManager().getComponentEnabledSetting(componentName0) != 1) {
                if(g.m().f()) {
                    String s = e.b(context0);
                    Object object0 = context0.getSystemService("locale");
                    if(object0 != null) {
                        b.b(object0, a.a(s));
                    }
                }
                context0.getPackageManager().setComponentEnabledSetting(componentName0, 1, 1);
            }
        }
    }

    static void U(Context context0) {
        Object object0;
        if(!g.x(context0)) {
            return;
        }
        if(Build.VERSION.SDK_INT < 33) {
            object0 = g.n;
            synchronized(object0) {
                i i0 = g.h;
                if(i0 == null) {
                    if(g.i == null) {
                        g.i = i.c(e.b(context0));
                    }
                    if(!g.i.f()) {
                        g.h = g.i;
                        return;
                    }
                    return;
                }
                else {
                    goto label_17;
                }
                return;
            }
            return;
        label_17:
            if(!i0.equals(g.i)) {
                g.i = g.h;
                e.a(context0, g.h.h());
            }
        }
        else if(!g.k) {
            g.f.execute(() -> {
                g.T(context0);
                g.k = true;
            });
        }
    }

    static void d(g g0) {
        synchronized(g.m) {
            g.I(g0);
            WeakReference weakReference0 = new WeakReference(g0);
            g.l.add(weakReference0);
        }
    }

    public abstract void e(View arg1, ViewGroup.LayoutParams arg2);

    public abstract boolean f();

    private static void g() {
        synchronized(g.m) {
            for(Object object1: g.l) {
                g g0 = (g)((WeakReference)object1).get();
                if(g0 != null) {
                    g0.f();
                }
            }
        }
    }

    public void h(Context context0) {
    }

    public Context i(Context context0) {
        return context0;
    }

    public static g j(Activity activity0, androidx.appcompat.app.e e0) {
        return new androidx.appcompat.app.i(activity0, e0);
    }

    public static g k(Dialog dialog0, androidx.appcompat.app.e e0) {
        return new androidx.appcompat.app.i(dialog0, e0);
    }

    public abstract View l(int arg1);

    public static i m() {
        if(Build.VERSION.SDK_INT >= 33) {
            Object object0 = g.r();
            return object0 == null ? i.e() : i.j(b.a(object0));
        }
        return g.h == null ? i.e() : g.h;
    }

    public abstract Context n();

    public static int o() [...] // 潜在的解密器

    public abstract androidx.appcompat.app.b.b p();

    public abstract int q();

    static Object r() {
        for(Object object0: g.l) {
            g g0 = (g)((WeakReference)object0).get();
            if(g0 != null) {
                Context context0 = g0.n();
                if(context0 != null) {
                    return context0.getSystemService("locale");
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public abstract MenuInflater s();

    static i t() {
        return g.h;
    }

    public abstract androidx.appcompat.app.a u();

    public abstract void v();

    public abstract void w();

    static boolean x(Context context0) {
        if(g.j == null) {
            try {
                Bundle bundle0 = A.a(context0).metaData;
                if(bundle0 != null) {
                    g.j = Boolean.valueOf(bundle0.getBoolean("autoStoreLocales"));
                    return g.j.booleanValue();
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                g.j = Boolean.FALSE;
                return g.j.booleanValue();
            }
        }
        return g.j.booleanValue();
    }

    // 检测为 Lambda 实现
    private static void y(Context context0) [...]

    public abstract void z(Configuration arg1);
}

