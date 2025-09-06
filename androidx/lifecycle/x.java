package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import z3.g;
import z3.k;

public class x extends Fragment {
    public interface a {
        void onCreate();

        void onResume();

        void onStart();
    }

    public static final class b {
        private b() {
        }

        public b(g g0) {
        }

        public final void a(Activity activity0, androidx.lifecycle.h.a h$a0) {
            k.e(activity0, "activity");
            k.e(h$a0, "event");
            if(activity0 instanceof n) {
                h h0 = ((n)activity0).getLifecycle();
                if(h0 instanceof o) {
                    ((o)h0).h(h$a0);
                }
            }
        }

        public final x b(Activity activity0) {
            k.e(activity0, "<this>");
            Fragment fragment0 = activity0.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            k.c(fragment0, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (x)fragment0;
        }

        public final void c(Activity activity0) {
            k.e(activity0, "activity");
            if(Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity0);
            }
            FragmentManager fragmentManager0 = activity0.getFragmentManager();
            if(fragmentManager0.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager0.beginTransaction().add(new x(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager0.executePendingTransactions();
            }
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final class androidx.lifecycle.x.c.a {
            private androidx.lifecycle.x.c.a() {
            }

            public androidx.lifecycle.x.c.a(g g0) {
            }

            public final void a(Activity activity0) {
                k.e(activity0, "activity");
                activity0.registerActivityLifecycleCallbacks(new c());
            }
        }

        public static final androidx.lifecycle.x.c.a Companion;

        static {
            c.Companion = new androidx.lifecycle.x.c.a(null);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity0, Bundle bundle0) {
            k.e(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity0) {
            k.e(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity0) {
            k.e(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity0, Bundle bundle0) {
            k.e(activity0, "activity");
            x.g.a(activity0, androidx.lifecycle.h.a.ON_CREATE);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity0) {
            k.e(activity0, "activity");
            x.g.a(activity0, androidx.lifecycle.h.a.ON_RESUME);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity0) {
            k.e(activity0, "activity");
            x.g.a(activity0, androidx.lifecycle.h.a.ON_START);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity0) {
            k.e(activity0, "activity");
            x.g.a(activity0, androidx.lifecycle.h.a.ON_DESTROY);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity0) {
            k.e(activity0, "activity");
            x.g.a(activity0, androidx.lifecycle.h.a.ON_PAUSE);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity0) {
            k.e(activity0, "activity");
            x.g.a(activity0, androidx.lifecycle.h.a.ON_STOP);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity0) {
            k.e(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
            k.e(activity0, "activity");
            k.e(bundle0, "bundle");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity0) {
            k.e(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity0) {
            k.e(activity0, "activity");
        }

        public static final void registerIn(Activity activity0) {
            c.Companion.a(activity0);
        }
    }

    private a f;
    public static final b g;

    static {
        x.g = new b(null);
    }

    private final void a(androidx.lifecycle.h.a h$a0) {
        if(Build.VERSION.SDK_INT < 29) {
            Activity activity0 = this.getActivity();
            k.d(activity0, "activity");
            x.g.a(activity0, h$a0);
        }
    }

    private final void b(a x$a0) {
        if(x$a0 != null) {
            x$a0.onCreate();
        }
    }

    private final void c(a x$a0) {
        if(x$a0 != null) {
            x$a0.onResume();
        }
    }

    private final void d(a x$a0) {
        if(x$a0 != null) {
            x$a0.onStart();
        }
    }

    public static final void e(Activity activity0) {
        x.g.c(activity0);
    }

    public final void f(a x$a0) {
        this.f = x$a0;
    }

    @Override  // android.app.Fragment
    public void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        this.b(this.f);
        this.a(androidx.lifecycle.h.a.ON_CREATE);
    }

    @Override  // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a(androidx.lifecycle.h.a.ON_DESTROY);
        this.f = null;
    }

    @Override  // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.a(androidx.lifecycle.h.a.ON_PAUSE);
    }

    @Override  // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.c(this.f);
        this.a(androidx.lifecycle.h.a.ON_RESUME);
    }

    @Override  // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.d(this.f);
        this.a(androidx.lifecycle.h.a.ON_START);
    }

    @Override  // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.a(androidx.lifecycle.h.a.ON_STOP);
    }
}

