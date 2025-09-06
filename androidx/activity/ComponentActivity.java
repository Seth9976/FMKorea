package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnDrawListener;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.c;
import androidx.core.app.h;
import androidx.core.app.j;
import androidx.core.app.q;
import androidx.core.app.r;
import androidx.core.app.s;
import androidx.core.content.b;
import androidx.core.view.w;
import androidx.core.view.z;
import androidx.lifecycle.B;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import j0.d;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ComponentActivity extends h implements c, u, x, q, r, b, androidx.core.content.c, w, M, g, n, d {
    class a extends ActivityResultRegistry {
        final ComponentActivity h;

        @Override  // androidx.activity.result.ActivityResultRegistry
        public void f(int v, d.a a0, Object object0, androidx.core.app.c c0) {
            class androidx.activity.ComponentActivity.a.a implements Runnable {
                final int f;
                final d.a.a g;
                final a h;

                androidx.activity.ComponentActivity.a.a(int v, d.a.a a$a0) {
                    this.f = v;
                    this.g = a$a0;
                    super();
                }

                @Override
                public void run() {
                    Object object0 = this.g.a();
                    a.this.c(this.f, object0);
                }
            }


            class androidx.activity.ComponentActivity.a.b implements Runnable {
                final int f;
                final IntentSender.SendIntentException g;
                final a h;

                androidx.activity.ComponentActivity.a.b(int v, IntentSender.SendIntentException intentSender$SendIntentException0) {
                    this.f = v;
                    this.g = intentSender$SendIntentException0;
                    super();
                }

                @Override
                public void run() {
                    Intent intent0 = new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.g);
                    a.this.b(this.f, 0, intent0);
                }
            }

            Bundle bundle1;
            ComponentActivity componentActivity0 = ComponentActivity.this;
            d.a.a a$a0 = a0.b(componentActivity0, object0);
            if(a$a0 != null) {
                new Handler(Looper.getMainLooper()).post(new androidx.activity.ComponentActivity.a.a(this, v, a$a0));
                return;
            }
            Intent intent0 = a0.a(componentActivity0, object0);
            if(intent0.getExtras() != null && intent0.getExtras().getClassLoader() == null) {
                intent0.setExtrasClassLoader(componentActivity0.getClassLoader());
            }
            if(intent0.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundle0 = intent0.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intent0.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle1 = bundle0;
            }
            else {
                bundle1 = null;
            }
            if("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intent0.getAction())) {
                String[] arr_s = intent0.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if(arr_s == null) {
                    arr_s = new String[0];
                }
                androidx.core.app.b.e(componentActivity0, arr_s, v);
                return;
            }
            if("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intent0.getAction())) {
                IntentSenderRequest intentSenderRequest0 = (IntentSenderRequest)intent0.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.b.h(componentActivity0, intentSenderRequest0.d(), v, intentSenderRequest0.a(), intentSenderRequest0.b(), intentSenderRequest0.c(), 0, bundle1);
                }
                catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                    new Handler(Looper.getMainLooper()).post(new androidx.activity.ComponentActivity.a.b(this, v, intentSender$SendIntentException0));
                }
                return;
            }
            androidx.core.app.b.g(componentActivity0, intent0, v, bundle1);
        }
    }

    static abstract class androidx.activity.ComponentActivity.c {
        static void a(View view0) {
            view0.cancelPendingInputEvents();
        }
    }

    static abstract class androidx.activity.ComponentActivity.d {
        static OnBackInvokedDispatcher a(Activity activity0) {
            return activity0.getOnBackInvokedDispatcher();
        }
    }

    static final class e {
        Object a;
        L b;

    }

    interface f extends Executor {
        void O(View arg1);

        void b();
    }

    class androidx.activity.ComponentActivity.g implements ViewTreeObserver.OnDrawListener, f, Runnable {
        final long f;
        Runnable g;
        boolean h;
        final ComponentActivity i;

        androidx.activity.ComponentActivity.g() {
            this.f = SystemClock.uptimeMillis() + 10000L;
            this.h = false;
        }

        @Override  // androidx.activity.ComponentActivity$f
        public void O(View view0) {
            if(!this.h) {
                this.h = true;
                view0.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        @Override  // androidx.activity.ComponentActivity$f
        public void b() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        // 检测为 Lambda 实现
        private void c() [...]

        @Override
        public void execute(Runnable runnable0) {
            this.g = runnable0;
            View view0 = ComponentActivity.this.getWindow().getDecorView();
            if(this.h) {
                if(Looper.myLooper() == Looper.getMainLooper()) {
                    view0.invalidate();
                    return;
                }
                view0.postInvalidate();
                return;
            }
            view0.postOnAnimation(() -> {
                Runnable runnable0 = this.g;
                if(runnable0 != null) {
                    runnable0.run();
                    this.g = null;
                }
            });
        }

        @Override  // android.view.ViewTreeObserver$OnDrawListener
        public void onDraw() {
            Runnable runnable0 = this.g;
            if(runnable0 != null) {
                runnable0.run();
                this.g = null;
                if(ComponentActivity.this.o.c()) {
                    this.h = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            }
            else if(SystemClock.uptimeMillis() > this.f) {
                this.h = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    final c.a h;
    private final androidx.core.view.x i;
    private final o j;
    final j0.c k;
    private L l;
    private OnBackPressedDispatcher m;
    final f n;
    final t o;
    private int p;
    private final AtomicInteger q;
    private final ActivityResultRegistry r;
    private final CopyOnWriteArrayList s;
    private final CopyOnWriteArrayList t;
    private final CopyOnWriteArrayList u;
    private final CopyOnWriteArrayList v;
    private final CopyOnWriteArrayList w;
    private boolean x;
    private boolean y;

    public ComponentActivity() {
        this.h = new c.a();
        this.i = new androidx.core.view.x(() -> this.invalidateOptionsMenu());
        this.j = new o(this);
        j0.c c0 = j0.c.a(this);
        this.k = c0;
        this.m = null;
        f componentActivity$f0 = this.A0();
        this.n = componentActivity$f0;
        this.o = new t(componentActivity$f0, () -> {
            this.reportFullyDrawn();
            return null;
        });
        this.q = new AtomicInteger();
        this.r = new a(this);
        this.s = new CopyOnWriteArrayList();
        this.t = new CopyOnWriteArrayList();
        this.u = new CopyOnWriteArrayList();
        this.v = new CopyOnWriteArrayList();
        this.w = new CopyOnWriteArrayList();
        this.x = false;
        this.y = false;
        if(this.getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity\'s constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int v = Build.VERSION.SDK_INT;
        this.getLifecycle().a(new l() {
            final ComponentActivity f;

            @Override  // androidx.lifecycle.l
            public void c(n n0, androidx.lifecycle.h.a h$a0) {
                if(h$a0 == androidx.lifecycle.h.a.ON_STOP) {
                    Window window0 = ComponentActivity.this.getWindow();
                    View view0 = window0 == null ? null : window0.peekDecorView();
                    if(view0 != null) {
                        androidx.activity.ComponentActivity.c.a(view0);
                    }
                }
            }
        });
        this.getLifecycle().a(new l() {
            final ComponentActivity f;

            @Override  // androidx.lifecycle.l
            public void c(n n0, androidx.lifecycle.h.a h$a0) {
                if(h$a0 == androidx.lifecycle.h.a.ON_DESTROY) {
                    ComponentActivity.this.h.b();
                    if(!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().a();
                    }
                    ComponentActivity.this.n.b();
                }
            }
        });
        this.getLifecycle().a(new l() {
            final ComponentActivity f;

            @Override  // androidx.lifecycle.l
            public void c(n n0, androidx.lifecycle.h.a h$a0) {
                ComponentActivity.this.B0();
                ComponentActivity.this.getLifecycle().c(this);
            }
        });
        c0.c();
        B.c(this);
        if(v <= 23) {
            this.getLifecycle().a(new ImmLeaksCleaner(this));
        }
        this.getSavedStateRegistry().h("android:support:activity-result", () -> {
            Bundle bundle0 = new Bundle();
            this.r.h(bundle0);
            return bundle0;
        });
        this.y0((Context context0) -> {
            Bundle bundle0 = this.getSavedStateRegistry().b("android:support:activity-result");
            if(bundle0 != null) {
                this.r.g(bundle0);
            }
        });
    }

    @Override  // androidx.core.content.b
    public final void A(B.a a0) {
        this.s.remove(a0);
    }

    private f A0() {
        return new androidx.activity.ComponentActivity.g(this);
    }

    @Override  // androidx.core.app.r
    public final void B(B.a a0) {
        this.w.add(a0);
    }

    void B0() {
        if(this.l == null) {
            e componentActivity$e0 = (e)this.getLastNonConfigurationInstance();
            if(componentActivity$e0 != null) {
                this.l = componentActivity$e0.b;
            }
            if(this.l == null) {
                this.l = new L();
            }
        }
    }

    public void C0() {
        N.a(this.getWindow().getDecorView(), this);
        O.a(this.getWindow().getDecorView(), this);
        j0.e.a(this.getWindow().getDecorView(), this);
        androidx.activity.B.a(this.getWindow().getDecorView(), this);
        A.a(this.getWindow().getDecorView(), this);
    }

    @Override  // androidx.activity.result.c
    public final ActivityResultRegistry D() {
        return this.r;
    }

    // 检测为 Lambda 实现
    public void D0() [...]

    // 检测为 Lambda 实现
    private l3.u E0() [...]

    // 检测为 Lambda 实现
    private Bundle F0() [...]

    // 检测为 Lambda 实现
    private void G0(Context context0) [...]

    public Object H0() [...] // Inlined contents

    public final androidx.activity.result.b I0(d.a a0, androidx.activity.result.a a1) {
        return this.J0(a0, this.r, a1);
    }

    public final androidx.activity.result.b J0(d.a a0, ActivityResultRegistry activityResultRegistry0, androidx.activity.result.a a1) {
        return activityResultRegistry0.i("activity_rq#" + this.q.getAndIncrement(), this, a0, a1);
    }

    @Override  // androidx.core.app.q
    public final void K(B.a a0) {
        this.v.add(a0);
    }

    @Override  // androidx.core.content.c
    public final void a0(B.a a0) {
        this.t.add(a0);
    }

    @Override  // android.app.Activity
    public void addContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.C0();
        View view1 = this.getWindow().getDecorView();
        this.n.O(view1);
        super.addContentView(view0, viewGroup$LayoutParams0);
    }

    @Override  // androidx.activity.x
    public final OnBackPressedDispatcher f() {
        class androidx.activity.ComponentActivity.b implements Runnable {
            final ComponentActivity f;

            @Override
            public void run() {
                try {
                    ComponentActivity.this.super.onBackPressed();
                }
                catch(IllegalStateException illegalStateException0) {
                    if(!TextUtils.equals(illegalStateException0.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw illegalStateException0;
                    }
                }
                catch(NullPointerException nullPointerException0) {
                    if(!TextUtils.equals(nullPointerException0.getMessage(), "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference")) {
                        throw nullPointerException0;
                    }
                }
            }
        }

        if(this.m == null) {
            this.m = new OnBackPressedDispatcher(new androidx.activity.ComponentActivity.b(this));
            this.getLifecycle().a(new l() {
                final ComponentActivity f;

                @Override  // androidx.lifecycle.l
                public void c(n n0, androidx.lifecycle.h.a h$a0) {
                    if(h$a0 == androidx.lifecycle.h.a.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                        ComponentActivity.this.m.n(androidx.activity.ComponentActivity.d.a(((ComponentActivity)n0)));
                    }
                }
            });
        }
        return this.m;
    }

    @Override  // androidx.core.app.r
    public final void g0(B.a a0) {
        this.w.remove(a0);
    }

    @Override  // androidx.lifecycle.g
    public W.a getDefaultViewModelCreationExtras() {
        W.a a0 = new W.d();
        if(this.getApplication() != null) {
            Application application0 = this.getApplication();
            ((W.d)a0).c(androidx.lifecycle.I.a.g, application0);
        }
        ((W.d)a0).c(B.a, this);
        ((W.d)a0).c(B.b, this);
        if(this.getIntent() != null && this.getIntent().getExtras() != null) {
            Bundle bundle0 = this.getIntent().getExtras();
            ((W.d)a0).c(B.c, bundle0);
        }
        return a0;
    }

    @Override  // androidx.lifecycle.n
    public androidx.lifecycle.h getLifecycle() {
        return this.j;
    }

    @Override  // j0.d
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.k.b();
    }

    @Override  // androidx.lifecycle.M
    public L getViewModelStore() {
        if(this.getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call.");
        }
        this.B0();
        return this.l;
    }

    @Override  // androidx.core.view.w
    public void h0(z z0) {
        this.i.a(z0);
    }

    @Override  // androidx.core.view.w
    public void k(z z0) {
        this.i.f(z0);
    }

    @Override  // androidx.core.content.c
    public final void m(B.a a0) {
        this.t.remove(a0);
    }

    @Override  // androidx.core.app.q
    public final void o0(B.a a0) {
        this.v.remove(a0);
    }

    @Override  // android.app.Activity
    protected void onActivityResult(int v, int v1, Intent intent0) {
        if(!this.r.b(v, v1, intent0)) {
            super.onActivityResult(v, v1, intent0);
        }
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        this.f().k();
    }

    @Override  // android.app.Activity
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        for(Object object0: this.s) {
            ((B.a)object0).a(configuration0);
        }
    }

    @Override  // androidx.core.app.h
    protected void onCreate(Bundle bundle0) {
        this.k.d(bundle0);
        this.h.c(this);
        super.onCreate(bundle0);
        androidx.lifecycle.x.e(this);
        int v = this.p;
        if(v != 0) {
            this.setContentView(v);
        }
    }

    @Override  // android.app.Activity
    public boolean onCreatePanelMenu(int v, Menu menu0) {
        if(v == 0) {
            super.onCreatePanelMenu(0, menu0);
            MenuInflater menuInflater0 = this.getMenuInflater();
            this.i.b(menu0, menuInflater0);
        }
        return true;
    }

    @Override  // android.app.Activity
    public boolean onMenuItemSelected(int v, MenuItem menuItem0) {
        if(super.onMenuItemSelected(v, menuItem0)) {
            return true;
        }
        return v == 0 ? this.i.d(menuItem0) : false;
    }

    @Override  // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if(this.x) {
            return;
        }
        for(Object object0: this.v) {
            ((B.a)object0).a(new j(z));
        }
    }

    @Override  // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration0) {
        try {
            this.x = true;
            super.onMultiWindowModeChanged(z, configuration0);
        }
        finally {
            this.x = false;
        }
        for(Object object0: this.v) {
            ((B.a)object0).a(new j(z, configuration0));
        }
    }

    @Override  // android.app.Activity
    protected void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        for(Object object0: this.u) {
            ((B.a)object0).a(intent0);
        }
    }

    @Override  // android.app.Activity
    public void onPanelClosed(int v, Menu menu0) {
        this.i.c(menu0);
        super.onPanelClosed(v, menu0);
    }

    @Override  // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if(this.y) {
            return;
        }
        for(Object object0: this.w) {
            ((B.a)object0).a(new s(z));
        }
    }

    @Override  // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration0) {
        try {
            this.y = true;
            super.onPictureInPictureModeChanged(z, configuration0);
        }
        finally {
            this.y = false;
        }
        for(Object object0: this.w) {
            ((B.a)object0).a(new s(z, configuration0));
        }
    }

    @Override  // android.app.Activity
    public boolean onPreparePanel(int v, View view0, Menu menu0) {
        if(v == 0) {
            super.onPreparePanel(0, view0, menu0);
            this.i.e(menu0);
        }
        return true;
    }

    @Override  // android.app.Activity
    public void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        Intent intent0 = new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", arr_s).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", arr_v);
        if(!this.r.b(v, -1, intent0)) {
            super.onRequestPermissionsResult(v, arr_s, arr_v);
        }
    }

    @Override  // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        L l0 = this.l;
        if(l0 == null) {
            e componentActivity$e0 = (e)this.getLastNonConfigurationInstance();
            if(componentActivity$e0 != null) {
                l0 = componentActivity$e0.b;
            }
        }
        if(l0 == null) {
            return null;
        }
        e componentActivity$e1 = new e();
        componentActivity$e1.a = null;
        componentActivity$e1.b = l0;
        return componentActivity$e1;
    }

    @Override  // androidx.core.app.h
    protected void onSaveInstanceState(Bundle bundle0) {
        androidx.lifecycle.h h0 = this.getLifecycle();
        if(h0 instanceof o) {
            ((o)h0).m(androidx.lifecycle.h.b.h);
        }
        super.onSaveInstanceState(bundle0);
        this.k.e(bundle0);
    }

    @Override  // android.app.Activity
    public void onTrimMemory(int v) {
        super.onTrimMemory(v);
        for(Object object0: this.t) {
            ((B.a)object0).a(v);
        }
    }

    @Override  // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if(p0.b.d()) {
                p0.b.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.o.b();
        }
        finally {
            p0.b.b();
        }
    }

    @Override  // android.app.Activity
    public void setContentView(int v) {
        this.C0();
        View view0 = this.getWindow().getDecorView();
        this.n.O(view0);
        super.setContentView(v);
    }

    @Override  // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view0) {
        this.C0();
        View view1 = this.getWindow().getDecorView();
        this.n.O(view1);
        super.setContentView(view0);
    }

    @Override  // android.app.Activity
    public void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.C0();
        View view1 = this.getWindow().getDecorView();
        this.n.O(view1);
        super.setContentView(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Activity
    public void startActivityForResult(Intent intent0, int v) {
        super.startActivityForResult(intent0, v);
    }

    @Override  // android.app.Activity
    public void startActivityForResult(Intent intent0, int v, Bundle bundle0) {
        super.startActivityForResult(intent0, v, bundle0);
    }

    @Override  // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3) {
        super.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3);
    }

    @Override  // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) {
        super.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    @Override  // androidx.core.content.b
    public final void t(B.a a0) {
        this.s.add(a0);
    }

    public final void y0(c.b b0) {
        this.h.a(b0);
    }

    public final void z0(B.a a0) {
        this.u.add(a0);
    }
}

