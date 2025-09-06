package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater.Factory2;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window.Callback;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.d;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.e.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.F;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.n0;
import androidx.core.view.G;
import androidx.core.view.Y;
import androidx.core.view.g0;
import androidx.core.view.i0;
import androidx.core.view.u;
import androidx.core.view.y0;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

class i extends g implements LayoutInflater.Factory2, a {
    class androidx.appcompat.app.i.a implements Runnable {
        final i f;

        @Override
        public void run() {
            i i0 = i.this;
            if((i0.f0 & 1) != 0) {
                i0.l0(0);
            }
            i i1 = i.this;
            if((i1.f0 & 0x1000) != 0) {
                i1.l0(108);
            }
            i.this.e0 = false;
            i.this.f0 = 0;
        }
    }

    class f implements b {
        final i a;

        @Override  // androidx.appcompat.app.b$b
        public boolean a() {
            androidx.appcompat.app.a a0 = i.this.u();
            return a0 != null && (a0.i() & 4) != 0;
        }

        @Override  // androidx.appcompat.app.b$b
        public Context b() {
            return i.this.r0();
        }

        @Override  // androidx.appcompat.app.b$b
        public void c(Drawable drawable0, int v) {
            androidx.appcompat.app.a a0 = i.this.u();
            if(a0 != null) {
                a0.v(drawable0);
                a0.u(v);
            }
        }

        @Override  // androidx.appcompat.app.b$b
        public Drawable d() {
            c0 c00 = c0.u(this.b(), null, new int[]{e.a.B});
            Drawable drawable0 = c00.g(0);
            c00.x();
            return drawable0;
        }
    }

    interface androidx.appcompat.app.i.g {
        boolean a(int arg1);

        View onCreatePanelView(int arg1);
    }

    final class h implements androidx.appcompat.view.menu.j.a {
        final i f;

        @Override  // androidx.appcompat.view.menu.j$a
        public void b(e e0, boolean z) {
            i.this.c0(e0);
        }

        @Override  // androidx.appcompat.view.menu.j$a
        public boolean c(e e0) {
            Window.Callback window$Callback0 = i.this.y0();
            if(window$Callback0 != null) {
                window$Callback0.onMenuOpened(108, e0);
            }
            return true;
        }
    }

    class androidx.appcompat.app.i.i implements androidx.appcompat.view.b.a {
        private androidx.appcompat.view.b.a a;
        final i b;

        public androidx.appcompat.app.i.i(androidx.appcompat.view.b.a b$a0) {
            this.a = b$a0;
        }

        @Override  // androidx.appcompat.view.b$a
        public void a(androidx.appcompat.view.b b0) {
            class androidx.appcompat.app.i.i.a extends i0 {
                final androidx.appcompat.app.i.i a;

                @Override  // androidx.core.view.h0
                public void b(View view0) {
                    i.this.A.setVisibility(8);
                    i i0 = i.this;
                    PopupWindow popupWindow0 = i0.B;
                    if(popupWindow0 != null) {
                        popupWindow0.dismiss();
                    }
                    else if(i0.A.getParent() instanceof View) {
                        Y.l0(((View)i.this.A.getParent()));
                    }
                    i.this.A.k();
                    i.this.D.h(null);
                    i.this.D = null;
                    Y.l0(i.this.G);
                }
            }

            this.a.a(b0);
            i i0 = i.this;
            if(i0.B != null) {
                i0.q.getDecorView().removeCallbacks(i.this.C);
            }
            i i1 = i.this;
            if(i1.A != null) {
                i1.m0();
                i.this.D = Y.e(i.this.A).b(0.0f);
                i.this.D.h(new androidx.appcompat.app.i.i.a(this));
            }
            i i2 = i.this;
            androidx.appcompat.app.e e0 = i2.s;
            if(e0 != null) {
                e0.r(i2.z);
            }
            i.this.z = null;
            Y.l0(i.this.G);
            i.this.g1();
        }

        @Override  // androidx.appcompat.view.b$a
        public boolean b(androidx.appcompat.view.b b0, Menu menu0) {
            return this.a.b(b0, menu0);
        }

        @Override  // androidx.appcompat.view.b$a
        public boolean c(androidx.appcompat.view.b b0, Menu menu0) {
            Y.l0(i.this.G);
            return this.a.c(b0, menu0);
        }

        @Override  // androidx.appcompat.view.b$a
        public boolean d(androidx.appcompat.view.b b0, MenuItem menuItem0) {
            return this.a.d(b0, menuItem0);
        }
    }

    static abstract class j {
        static boolean a(PowerManager powerManager0) {
            return powerManager0.isPowerSaveMode();
        }

        static String b(Locale locale0) {
            return locale0.toLanguageTag();
        }
    }

    static abstract class k {
        static void a(Configuration configuration0, Configuration configuration1, Configuration configuration2) {
            LocaleList localeList0 = configuration0.getLocales();
            LocaleList localeList1 = configuration1.getLocales();
            if(!localeList0.equals(localeList1)) {
                configuration2.setLocales(localeList1);
                configuration2.locale = configuration1.locale;
            }
        }

        static androidx.core.os.i b(Configuration configuration0) {
            return androidx.core.os.i.c(configuration0.getLocales().toLanguageTags());
        }

        public static void c(androidx.core.os.i i0) {
            LocaleList.setDefault(LocaleList.forLanguageTags(i0.h()));
        }

        static void d(Configuration configuration0, androidx.core.os.i i0) {
            configuration0.setLocales(LocaleList.forLanguageTags(i0.h()));
        }
    }

    static abstract class l {
        static void a(Configuration configuration0, Configuration configuration1, Configuration configuration2) {
            if((configuration0.colorMode & 3) != (configuration1.colorMode & 3)) {
                configuration2.colorMode |= configuration1.colorMode & 3;
            }
            if((configuration0.colorMode & 12) != (configuration1.colorMode & 12)) {
                configuration2.colorMode |= configuration1.colorMode & 12;
            }
        }
    }

    static abstract class m {
        static OnBackInvokedDispatcher a(Activity activity0) {
            return activity0.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object object0, i i0) {
            Objects.requireNonNull(i0);
            OnBackInvokedCallback onBackInvokedCallback0 = new w(i0);
            ((OnBackInvokedDispatcher)object0).registerOnBackInvokedCallback(1000000, onBackInvokedCallback0);
            return onBackInvokedCallback0;
        }

        static void c(Object object0, Object object1) {
            ((OnBackInvokedDispatcher)object0).unregisterOnBackInvokedCallback(((OnBackInvokedCallback)object1));
        }
    }

    class n extends androidx.appcompat.view.i {
        private androidx.appcompat.app.i.g g;
        private boolean h;
        private boolean i;
        private boolean j;
        final i k;

        n(Window.Callback window$Callback0) {
            super(window$Callback0);
        }

        public boolean b(Window.Callback window$Callback0, KeyEvent keyEvent0) {
            try {
                this.i = true;
                boolean z = window$Callback0.dispatchKeyEvent(keyEvent0);
                this.i = false;
                return z;
            }
            catch(Throwable throwable0) {
                this.i = false;
                throw throwable0;
            }
        }

        public void c(Window.Callback window$Callback0) {
            try {
                this.h = true;
                window$Callback0.onContentChanged();
                this.h = false;
            }
            catch(Throwable throwable0) {
                this.h = false;
                throw throwable0;
            }
        }

        public void d(Window.Callback window$Callback0, int v, Menu menu0) {
            try {
                this.j = true;
                window$Callback0.onPanelClosed(v, menu0);
                this.j = false;
            }
            catch(Throwable throwable0) {
                this.j = false;
                throw throwable0;
            }
        }

        // 去混淆评级： 低(40)
        @Override  // androidx.appcompat.view.i
        public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
            return this.i ? this.a().dispatchKeyEvent(keyEvent0) : i.this.k0(keyEvent0) || super.dispatchKeyEvent(keyEvent0);
        }

        @Override  // androidx.appcompat.view.i
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent0) {
            if(!super.dispatchKeyShortcutEvent(keyEvent0)) {
                int v = keyEvent0.getKeyCode();
                return i.this.J0(v, keyEvent0);
            }
            return true;
        }

        void e(androidx.appcompat.app.i.g i$g0) {
            this.g = i$g0;
        }

        final ActionMode f(ActionMode.Callback actionMode$Callback0) {
            androidx.appcompat.view.f.a f$a0 = new androidx.appcompat.view.f.a(i.this.p, actionMode$Callback0);
            androidx.appcompat.view.b b0 = i.this.a1(f$a0);
            return b0 == null ? null : f$a0.e(b0);
        }

        @Override  // android.view.Window$Callback
        public void onContentChanged() {
            if(this.h) {
                this.a().onContentChanged();
            }
        }

        @Override  // androidx.appcompat.view.i
        public boolean onCreatePanelMenu(int v, Menu menu0) {
            return v != 0 || menu0 instanceof e ? super.onCreatePanelMenu(v, menu0) : false;
        }

        @Override  // androidx.appcompat.view.i
        public View onCreatePanelView(int v) {
            androidx.appcompat.app.i.g i$g0 = this.g;
            if(i$g0 != null) {
                View view0 = i$g0.onCreatePanelView(v);
                return view0 == null ? super.onCreatePanelView(v) : view0;
            }
            return super.onCreatePanelView(v);
        }

        @Override  // androidx.appcompat.view.i
        public boolean onMenuOpened(int v, Menu menu0) {
            super.onMenuOpened(v, menu0);
            i.this.M0(v);
            return true;
        }

        @Override  // androidx.appcompat.view.i
        public void onPanelClosed(int v, Menu menu0) {
            if(this.j) {
                this.a().onPanelClosed(v, menu0);
                return;
            }
            super.onPanelClosed(v, menu0);
            i.this.N0(v);
        }

        @Override  // androidx.appcompat.view.i
        public boolean onPreparePanel(int v, View view0, Menu menu0) {
            e e0 = menu0 instanceof e ? ((e)menu0) : null;
            boolean z = true;
            if(v == 0 && e0 == null) {
                return false;
            }
            if(e0 != null) {
                e0.f0(true);
            }
            if(this.g == null || !this.g.a(v)) {
                z = super.onPreparePanel(v, view0, menu0);
            }
            if(e0 != null) {
                e0.f0(false);
            }
            return z;
        }

        @Override  // androidx.appcompat.view.i
        public void onProvideKeyboardShortcuts(List list0, Menu menu0, int v) {
            s i$s0 = i.this.w0(0, true);
            if(i$s0 != null) {
                e e0 = i$s0.j;
                if(e0 != null) {
                    super.onProvideKeyboardShortcuts(list0, e0, v);
                    return;
                }
            }
            super.onProvideKeyboardShortcuts(list0, menu0, v);
        }

        @Override  // android.view.Window$Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0) {
            return null;
        }

        @Override  // androidx.appcompat.view.i
        public ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0, int v) {
            return !i.this.E0() || v != 0 ? super.onWindowStartingActionMode(actionMode$Callback0, v) : this.f(actionMode$Callback0);
        }
    }

    class o extends p {
        private final PowerManager c;
        final i d;

        o(Context context0) {
            this.c = (PowerManager)context0.getApplicationContext().getSystemService("power");
        }

        @Override  // androidx.appcompat.app.i$p
        IntentFilter b() {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.appcompat.app.i$p
        public int c() {
            return j.a(this.c) ? 2 : 1;
        }

        @Override  // androidx.appcompat.app.i$p
        public void d() {
            i.this.f();
        }
    }

    abstract class p {
        private BroadcastReceiver a;
        final i b;

        void a() {
            BroadcastReceiver broadcastReceiver0 = this.a;
            if(broadcastReceiver0 != null) {
                try {
                    i.this.p.unregisterReceiver(broadcastReceiver0);
                }
                catch(IllegalArgumentException unused_ex) {
                }
                this.a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            class androidx.appcompat.app.i.p.a extends BroadcastReceiver {
                final p a;

                @Override  // android.content.BroadcastReceiver
                public void onReceive(Context context0, Intent intent0) {
                    p.this.d();
                }
            }

            this.a();
            IntentFilter intentFilter0 = this.b();
            if(intentFilter0 != null && intentFilter0.countActions() != 0) {
                if(this.a == null) {
                    this.a = new androidx.appcompat.app.i.p.a(this);
                }
                i.this.p.registerReceiver(this.a, intentFilter0);
            }
        }
    }

    class q extends p {
        private final H c;
        final i d;

        q(H h0) {
            this.c = h0;
        }

        @Override  // androidx.appcompat.app.i$p
        IntentFilter b() {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.TIME_SET");
            intentFilter0.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter0.addAction("android.intent.action.TIME_TICK");
            return intentFilter0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.appcompat.app.i$p
        public int c() {
            return this.c.d() ? 2 : 1;
        }

        @Override  // androidx.appcompat.app.i$p
        public void d() {
            i.this.f();
        }
    }

    class r extends ContentFrameLayout {
        final i n;

        public r(Context context0) {
            super(context0);
        }

        private boolean b(int v, int v1) {
            return v < -5 || v1 < -5 || v > this.getWidth() + 5 || v1 > this.getHeight() + 5;
        }

        // 去混淆评级： 低(20)
        @Override  // android.view.ViewGroup
        public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
            return i.this.k0(keyEvent0) || super.dispatchKeyEvent(keyEvent0);
        }

        @Override  // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
            if(motionEvent0.getAction() == 0 && this.b(((int)motionEvent0.getX()), ((int)motionEvent0.getY()))) {
                i.this.e0(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent0);
        }

        @Override  // android.view.View
        public void setBackgroundResource(int v) {
            this.setBackgroundDrawable(f.a.b(this.getContext(), v));
        }
    }

    public static final class s {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        e j;
        c k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q;
        boolean r;
        Bundle s;

        s(int v) {
            this.a = v;
            this.q = false;
        }

        androidx.appcompat.view.menu.k a(androidx.appcompat.view.menu.j.a j$a0) {
            if(this.j == null) {
                return null;
            }
            if(this.k == null) {
                c c0 = new c(this.l, e.g.j);
                this.k = c0;
                c0.g(j$a0);
                this.j.b(this.k);
            }
            return this.k.j(this.g);
        }

        public boolean b() {
            if(this.h == null) {
                return false;
            }
            return this.i == null ? this.k.a().getCount() > 0 : true;
        }

        void c(e e0) {
            e e1 = this.j;
            if(e0 == e1) {
                return;
            }
            if(e1 != null) {
                e1.R(this.k);
            }
            this.j = e0;
            if(e0 != null) {
                c c0 = this.k;
                if(c0 != null) {
                    e0.b(c0);
                }
            }
        }

        void d(Context context0) {
            TypedValue typedValue0 = new TypedValue();
            Resources.Theme resources$Theme0 = context0.getResources().newTheme();
            resources$Theme0.setTo(context0.getTheme());
            resources$Theme0.resolveAttribute(e.a.a, typedValue0, true);
            int v = typedValue0.resourceId;
            if(v != 0) {
                resources$Theme0.applyStyle(v, true);
            }
            resources$Theme0.resolveAttribute(e.a.F, typedValue0, true);
            int v1 = typedValue0.resourceId;
            if(v1 == 0) {
                resources$Theme0.applyStyle(e.i.c, true);
            }
            else {
                resources$Theme0.applyStyle(v1, true);
            }
            d d0 = new d(context0, 0);
            d0.getTheme().setTo(resources$Theme0);
            this.l = d0;
            TypedArray typedArray0 = d0.obtainStyledAttributes(e.j.y0);
            this.b = typedArray0.getResourceId(e.j.B0, 0);
            this.f = typedArray0.getResourceId(e.j.A0, 0);
            typedArray0.recycle();
        }
    }

    final class t implements androidx.appcompat.view.menu.j.a {
        final i f;

        @Override  // androidx.appcompat.view.menu.j$a
        public void b(e e0, boolean z) {
            e e1 = e0.F();
            boolean z1 = e1 != e0;
            i i0 = i.this;
            if(z1) {
                e0 = e1;
            }
            s i$s0 = i0.p0(e0);
            if(i$s0 != null) {
                if(z1) {
                    i.this.b0(i$s0.a, i$s0, e1);
                    i.this.f0(i$s0, true);
                    return;
                }
                i.this.f0(i$s0, z);
            }
        }

        @Override  // androidx.appcompat.view.menu.j$a
        public boolean c(e e0) {
            if(e0 == e0.F()) {
                i i0 = i.this;
                if(i0.L) {
                    Window.Callback window$Callback0 = i0.y0();
                    if(window$Callback0 != null && !i.this.W) {
                        window$Callback0.onMenuOpened(108, e0);
                    }
                }
            }
            return true;
        }
    }

    ActionBarContextView A;
    PopupWindow B;
    Runnable C;
    g0 D;
    private boolean E;
    private boolean F;
    ViewGroup G;
    private TextView H;
    private View I;
    private boolean J;
    private boolean K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    private boolean Q;
    private s[] R;
    private s S;
    private boolean T;
    private boolean U;
    private boolean V;
    boolean W;
    private Configuration X;
    private int Y;
    private int Z;
    private int a0;
    private boolean b0;
    private p c0;
    private p d0;
    boolean e0;
    int f0;
    private final Runnable g0;
    private boolean h0;
    private Rect i0;
    private Rect j0;
    private z k0;
    private B l0;
    private OnBackInvokedDispatcher m0;
    private OnBackInvokedCallback n0;
    final Object o;
    private static final androidx.collection.g o0;
    final Context p;
    private static final boolean p0;
    Window q;
    private static final int[] q0;
    private n r;
    private static final boolean r0;
    final androidx.appcompat.app.e s;
    androidx.appcompat.app.a t;
    MenuInflater u;
    private CharSequence v;
    private F w;
    private h x;
    private t y;
    androidx.appcompat.view.b z;

    static {
        i.o0 = new androidx.collection.g();
        i.p0 = false;
        i.q0 = new int[]{0x1010054};
        i.r0 = true;
    }

    i(Activity activity0, androidx.appcompat.app.e e0) {
        this(activity0, null, e0, activity0);
    }

    i(Dialog dialog0, androidx.appcompat.app.e e0) {
        this(dialog0.getContext(), dialog0.getWindow(), e0, dialog0);
    }

    private i(Context context0, Window window0, androidx.appcompat.app.e e0, Object object0) {
        this.D = null;
        this.E = true;
        this.Y = -100;
        this.g0 = new androidx.appcompat.app.i.a(this);
        this.p = context0;
        this.s = e0;
        this.o = object0;
        if(this.Y == -100 && object0 instanceof Dialog) {
            androidx.appcompat.app.d d0 = this.d1();
            if(d0 != null) {
                this.Y = d0.Z0().q();
            }
        }
        if(this.Y == -100) {
            androidx.collection.g g0 = i.o0;
            Integer integer0 = (Integer)g0.get(object0.getClass().getName());
            if(integer0 != null) {
                this.Y = (int)integer0;
                g0.remove(object0.getClass().getName());
            }
        }
        if(window0 != null) {
            this.Y(window0);
        }
        androidx.appcompat.widget.j.h();
    }

    @Override  // androidx.appcompat.app.g
    public void A(Bundle bundle0) {
        this.U = true;
        this.V(false);
        this.o0();
        Object object0 = this.o;
        if(object0 instanceof Activity) {
            try {
                String s = null;
                s = androidx.core.app.k.c(((Activity)object0));
            }
            catch(IllegalArgumentException unused_ex) {
            }
            if(s != null) {
                androidx.appcompat.app.a a0 = this.Q0();
                if(a0 == null) {
                    this.h0 = true;
                }
                else {
                    a0.r(true);
                }
            }
            g.d(this);
        }
        this.X = new Configuration(this.p.getResources().getConfiguration());
        this.V = true;
    }

    private boolean A0(s i$s0) {
        View view0 = i$s0.i;
        if(view0 != null) {
            i$s0.h = view0;
            return true;
        }
        if(i$s0.j == null) {
            return false;
        }
        if(this.y == null) {
            this.y = new t(this);
        }
        View view1 = (View)i$s0.a(this.y);
        i$s0.h = view1;
        return view1 != null;
    }

    @Override  // androidx.appcompat.app.g
    public void B() {
        if(this.o instanceof Activity) {
            g.H(this);
        }
        if(this.e0) {
            this.q.getDecorView().removeCallbacks(this.g0);
        }
        this.W = true;
        if(this.Y == -100 || (!(this.o instanceof Activity) || !((Activity)this.o).isChangingConfigurations())) {
            String s1 = this.o.getClass().getName();
            i.o0.remove(s1);
        }
        else {
            String s = this.o.getClass().getName();
            i.o0.put(s, this.Y);
        }
        androidx.appcompat.app.a a0 = this.t;
        if(a0 != null) {
            a0.n();
        }
        this.d0();
    }

    private boolean B0(s i$s0) {
        i$s0.d(this.r0());
        i$s0.g = new r(this, i$s0.l);
        i$s0.c = 81;
        return true;
    }

    @Override  // androidx.appcompat.app.g
    public void C(Bundle bundle0) {
        this.n0();
    }

    private boolean C0(s i$s0) {
        Resources.Theme resources$Theme1;
        Context context0 = this.p;
        if((i$s0.a == 0 || i$s0.a == 108) && this.w != null) {
            TypedValue typedValue0 = new TypedValue();
            Resources.Theme resources$Theme0 = context0.getTheme();
            resources$Theme0.resolveAttribute(e.a.d, typedValue0, true);
            if(typedValue0.resourceId == 0) {
                resources$Theme0.resolveAttribute(e.a.e, typedValue0, true);
                resources$Theme1 = null;
            }
            else {
                resources$Theme1 = context0.getResources().newTheme();
                resources$Theme1.setTo(resources$Theme0);
                resources$Theme1.applyStyle(typedValue0.resourceId, true);
                resources$Theme1.resolveAttribute(e.a.e, typedValue0, true);
            }
            if(typedValue0.resourceId != 0) {
                if(resources$Theme1 == null) {
                    resources$Theme1 = context0.getResources().newTheme();
                    resources$Theme1.setTo(resources$Theme0);
                }
                resources$Theme1.applyStyle(typedValue0.resourceId, true);
            }
            if(resources$Theme1 != null) {
                d d0 = new d(context0, 0);
                d0.getTheme().setTo(resources$Theme1);
                context0 = d0;
            }
        }
        e e0 = new e(context0);
        e0.W(this);
        i$s0.c(e0);
        return true;
    }

    @Override  // androidx.appcompat.app.g
    public void D() {
        androidx.appcompat.app.a a0 = this.u();
        if(a0 != null) {
            a0.w(true);
        }
    }

    private void D0(int v) {
        this.f0 |= 1 << v;
        if(!this.e0) {
            Y.g0(this.q.getDecorView(), this.g0);
            this.e0 = true;
        }
    }

    @Override  // androidx.appcompat.app.g
    public void E(Bundle bundle0) {
    }

    public boolean E0() {
        return this.E;
    }

    @Override  // androidx.appcompat.app.g
    public void F() {
        this.W(true, false);
    }

    int F0(Context context0, int v) {
        switch(v) {
            case -100: {
                return -1;
            }
            case 0: {
                return ((UiModeManager)context0.getApplicationContext().getSystemService("uimode")).getNightMode() == 0 ? -1 : this.u0(context0).c();
            }
            case -1: 
            case 1: 
            case 2: {
                return v;
            }
            case 3: {
                return this.t0(context0).c();
            }
            default: {
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
    }

    @Override  // androidx.appcompat.app.g
    public void G() {
        androidx.appcompat.app.a a0 = this.u();
        if(a0 != null) {
            a0.w(false);
        }
    }

    boolean G0() {
        boolean z = this.T;
        this.T = false;
        s i$s0 = this.w0(0, false);
        if(i$s0 != null && i$s0.o) {
            if(!z) {
                this.f0(i$s0, true);
            }
            return true;
        }
        androidx.appcompat.view.b b0 = this.z;
        if(b0 != null) {
            b0.c();
            return true;
        }
        androidx.appcompat.app.a a0 = this.u();
        return a0 != null && a0.g();
    }

    boolean H0(int v, KeyEvent keyEvent0) {
        boolean z = true;
        switch(v) {
            case 4: {
                if((keyEvent0.getFlags() & 0x80) == 0) {
                    z = false;
                }
                this.T = z;
                return false;
            }
            case 82: {
                this.I0(0, keyEvent0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private boolean I0(int v, KeyEvent keyEvent0) {
        if(keyEvent0.getRepeatCount() == 0) {
            s i$s0 = this.w0(v, true);
            return i$s0.o ? false : this.S0(i$s0, keyEvent0);
        }
        return false;
    }

    @Override  // androidx.appcompat.app.g
    public boolean J(int v) {
        int v1 = this.U0(v);
        if(this.P && v1 == 108) {
            return false;
        }
        if(this.L && v1 == 1) {
            this.L = false;
        }
        switch(v1) {
            case 1: {
                this.c1();
                this.P = true;
                return true;
            }
            case 2: {
                this.c1();
                this.J = true;
                return true;
            }
            case 5: {
                this.c1();
                this.K = true;
                return true;
            }
            case 10: {
                this.c1();
                this.N = true;
                return true;
            }
            case 108: {
                this.c1();
                this.L = true;
                return true;
            }
            default: {
                if(v1 != 109) {
                    return this.q.requestFeature(v1);
                }
                this.c1();
                this.M = true;
                return true;
            }
        }
    }

    boolean J0(int v, KeyEvent keyEvent0) {
        androidx.appcompat.app.a a0 = this.u();
        if(a0 != null && a0.o(v, keyEvent0)) {
            return true;
        }
        if(this.S != null && this.R0(this.S, keyEvent0.getKeyCode(), keyEvent0, 1)) {
            s i$s0 = this.S;
            if(i$s0 != null) {
                i$s0.n = true;
            }
            return true;
        }
        if(this.S == null) {
            s i$s1 = this.w0(0, true);
            this.S0(i$s1, keyEvent0);
            boolean z = this.R0(i$s1, keyEvent0.getKeyCode(), keyEvent0, 1);
            i$s1.m = false;
            return z;
        }
        return false;
    }

    boolean K0(int v, KeyEvent keyEvent0) {
        switch(v) {
            case 4: {
                return this.G0();
            }
            case 82: {
                this.L0(0, keyEvent0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // androidx.appcompat.app.g
    public void L(int v) {
        this.n0();
        ViewGroup viewGroup0 = (ViewGroup)this.G.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        LayoutInflater.from(this.p).inflate(v, viewGroup0);
        this.r.c(this.q.getCallback());
    }

    private boolean L0(int v, KeyEvent keyEvent0) {
        boolean z2;
        if(this.z != null) {
            return false;
        }
        boolean z = true;
        s i$s0 = this.w0(v, true);
        if(v != 0 || (this.w == null || !this.w.d() || ViewConfiguration.get(this.p).hasPermanentMenuKey())) {
            boolean z1 = i$s0.o;
            if(z1 || i$s0.n) {
                this.f0(i$s0, true);
                z = z1;
            }
            else if(i$s0.m) {
                if(i$s0.r) {
                    i$s0.m = false;
                    z2 = this.S0(i$s0, keyEvent0);
                }
                else {
                    z2 = true;
                }
                if(z2) {
                    this.P0(i$s0, keyEvent0);
                }
                else {
                    z = false;
                }
            }
            else {
                z = false;
            }
        }
        else if(this.w.b()) {
            z = this.w.f();
        }
        else if(!this.W && this.S0(i$s0, keyEvent0)) {
            z = this.w.g();
        }
        else {
            z = false;
        }
        if(z) {
            AudioManager audioManager0 = (AudioManager)this.p.getApplicationContext().getSystemService("audio");
            if(audioManager0 != null) {
                audioManager0.playSoundEffect(0);
                return true;
            }
            Log.w("AppCompatDelegate", "Couldn\'t get audio manager");
        }
        return z;
    }

    @Override  // androidx.appcompat.app.g
    public void M(View view0) {
        this.n0();
        ViewGroup viewGroup0 = (ViewGroup)this.G.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        viewGroup0.addView(view0);
        this.r.c(this.q.getCallback());
    }

    void M0(int v) {
        if(v == 108) {
            androidx.appcompat.app.a a0 = this.u();
            if(a0 != null) {
                a0.h(true);
            }
        }
    }

    @Override  // androidx.appcompat.app.g
    public void N(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.n0();
        ViewGroup viewGroup0 = (ViewGroup)this.G.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        viewGroup0.addView(view0, viewGroup$LayoutParams0);
        this.r.c(this.q.getCallback());
    }

    void N0(int v) {
        switch(v) {
            case 0: {
                s i$s0 = this.w0(0, true);
                if(i$s0.o) {
                    this.f0(i$s0, false);
                    return;
                }
                break;
            }
            case 108: {
                androidx.appcompat.app.a a0 = this.u();
                if(a0 != null) {
                    a0.h(false);
                    return;
                }
                break;
            }
        }
    }

    void O0(ViewGroup viewGroup0) {
    }

    @Override  // androidx.appcompat.app.g
    public void P(OnBackInvokedDispatcher onBackInvokedDispatcher0) {
        super.P(onBackInvokedDispatcher0);
        OnBackInvokedDispatcher onBackInvokedDispatcher1 = this.m0;
        if(onBackInvokedDispatcher1 != null) {
            OnBackInvokedCallback onBackInvokedCallback0 = this.n0;
            if(onBackInvokedCallback0 != null) {
                m.c(onBackInvokedDispatcher1, onBackInvokedCallback0);
                this.n0 = null;
            }
        }
        this.m0 = onBackInvokedDispatcher0 != null || (!(this.o instanceof Activity) || ((Activity)this.o).getWindow() == null) ? onBackInvokedDispatcher0 : m.a(((Activity)this.o));
        this.g1();
    }

    private void P0(s i$s0, KeyEvent keyEvent0) {
        int v;
        if(i$s0.o || this.W || i$s0.a == 0 && (this.p.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback window$Callback0 = this.y0();
        if(window$Callback0 != null && !window$Callback0.onMenuOpened(i$s0.a, i$s0.j)) {
            this.f0(i$s0, true);
            return;
        }
        WindowManager windowManager0 = (WindowManager)this.p.getSystemService("window");
        if(windowManager0 == null) {
            return;
        }
        if(!this.S0(i$s0, keyEvent0)) {
            return;
        }
        ViewGroup viewGroup0 = i$s0.g;
        if(viewGroup0 != null && !i$s0.q) {
            View view0 = i$s0.i;
            if(view0 == null) {
                goto label_35;
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null || viewGroup$LayoutParams0.width != -1) {
                goto label_35;
            }
            v = -1;
            goto label_36;
        }
        if(viewGroup0 == null) {
            if(!this.B0(i$s0) || i$s0.g == null) {
                return;
            }
        }
        else if(i$s0.q && viewGroup0.getChildCount() > 0) {
            i$s0.g.removeAllViews();
        }
        if(this.A0(i$s0) && i$s0.b()) {
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = i$s0.h.getLayoutParams();
            if(viewGroup$LayoutParams1 == null) {
                viewGroup$LayoutParams1 = new ViewGroup.LayoutParams(-2, -2);
            }
            i$s0.g.setBackgroundResource(i$s0.b);
            ViewParent viewParent0 = i$s0.h.getParent();
            if(viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(i$s0.h);
            }
            i$s0.g.addView(i$s0.h, viewGroup$LayoutParams1);
            if(!i$s0.h.hasFocus()) {
                i$s0.h.requestFocus();
            }
        label_35:
            v = -2;
        label_36:
            i$s0.n = false;
            WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams(v, -2, i$s0.d, i$s0.e, 1002, 0x820000, -3);
            windowManager$LayoutParams0.gravity = i$s0.c;
            windowManager$LayoutParams0.windowAnimations = i$s0.f;
            windowManager0.addView(i$s0.g, windowManager$LayoutParams0);
            i$s0.o = true;
            if(i$s0.a == 0) {
                this.g1();
            }
            return;
        }
        i$s0.q = true;
    }

    @Override  // androidx.appcompat.app.g
    public void Q(Toolbar toolbar0) {
        if(!(this.o instanceof Activity)) {
            return;
        }
        androidx.appcompat.app.a a0 = this.u();
        if(a0 instanceof I) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        this.u = null;
        if(a0 != null) {
            a0.n();
        }
        this.t = null;
        if(toolbar0 == null) {
            this.r.e(null);
        }
        else {
            androidx.appcompat.app.F f0 = new androidx.appcompat.app.F(toolbar0, this.x0(), this.r);
            this.t = f0;
            this.r.e(f0.c);
            toolbar0.setBackInvokedCallbackEnabled(true);
        }
        this.w();
    }

    final androidx.appcompat.app.a Q0() {
        return this.t;
    }

    @Override  // androidx.appcompat.app.g
    public void R(int v) {
        this.Z = v;
    }

    private boolean R0(s i$s0, int v, KeyEvent keyEvent0, int v1) {
        boolean z = false;
        if(keyEvent0.isSystem()) {
            return false;
        }
        if(i$s0.m || this.S0(i$s0, keyEvent0)) {
            e e0 = i$s0.j;
            if(e0 != null) {
                z = e0.performShortcut(v, keyEvent0, v1);
            }
        }
        if(z && (v1 & 1) == 0 && this.w == null) {
            this.f0(i$s0, true);
        }
        return z;
    }

    @Override  // androidx.appcompat.app.g
    public final void S(CharSequence charSequence0) {
        this.v = charSequence0;
        F f0 = this.w;
        if(f0 != null) {
            f0.setWindowTitle(charSequence0);
            return;
        }
        if(this.Q0() != null) {
            this.Q0().x(charSequence0);
            return;
        }
        TextView textView0 = this.H;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
    }

    private boolean S0(s i$s0, KeyEvent keyEvent0) {
        if(this.W) {
            return false;
        }
        if(i$s0.m) {
            return true;
        }
        s i$s1 = this.S;
        if(i$s1 != null && i$s1 != i$s0) {
            this.f0(i$s1, false);
        }
        Window.Callback window$Callback0 = this.y0();
        if(window$Callback0 != null) {
            i$s0.i = window$Callback0.onCreatePanelView(i$s0.a);
        }
        boolean z = i$s0.a == 0 || i$s0.a == 108;
        if(z) {
            F f0 = this.w;
            if(f0 != null) {
                f0.c();
            }
        }
        if(i$s0.i == null && (!z || !(this.Q0() instanceof androidx.appcompat.app.F))) {
            e e0 = i$s0.j;
            if(e0 == null || i$s0.r) {
                if(e0 == null && (!this.C0(i$s0) || i$s0.j == null)) {
                    return false;
                }
                if(z && this.w != null) {
                    if(this.x == null) {
                        this.x = new h(this);
                    }
                    this.w.a(i$s0.j, this.x);
                }
                i$s0.j.i0();
                if(!window$Callback0.onCreatePanelMenu(i$s0.a, i$s0.j)) {
                    i$s0.c(null);
                    if(z) {
                        F f1 = this.w;
                        if(f1 != null) {
                            f1.a(null, this.x);
                        }
                    }
                    return false;
                }
                i$s0.r = false;
            }
            i$s0.j.i0();
            Bundle bundle0 = i$s0.s;
            if(bundle0 != null) {
                i$s0.j.S(bundle0);
                i$s0.s = null;
            }
            if(!window$Callback0.onPreparePanel(0, i$s0.i, i$s0.j)) {
                if(z) {
                    F f2 = this.w;
                    if(f2 != null) {
                        f2.a(null, this.x);
                    }
                }
                i$s0.j.h0();
                return false;
            }
            boolean z1 = KeyCharacterMap.load((keyEvent0 == null ? -1 : keyEvent0.getDeviceId())).getKeyboardType() != 1;
            i$s0.p = z1;
            i$s0.j.setQwertyMode(z1);
            i$s0.j.h0();
        }
        i$s0.m = true;
        i$s0.n = false;
        this.S = i$s0;
        return true;
    }

    private void T0(boolean z) {
        if(this.w != null && this.w.d() && (!ViewConfiguration.get(this.p).hasPermanentMenuKey() || this.w.e())) {
            Window.Callback window$Callback0 = this.y0();
            if(this.w.b() && z) {
                this.w.f();
                if(!this.W) {
                    window$Callback0.onPanelClosed(108, this.w0(0, true).j);
                    return;
                }
            }
            else if(window$Callback0 != null && !this.W) {
                if(this.e0 && (this.f0 & 1) != 0) {
                    this.q.getDecorView().removeCallbacks(this.g0);
                    this.g0.run();
                }
                s i$s0 = this.w0(0, true);
                if(i$s0.j != null && !i$s0.r && window$Callback0.onPreparePanel(0, i$s0.i, i$s0.j)) {
                    window$Callback0.onMenuOpened(108, i$s0.j);
                    this.w.g();
                }
            }
            return;
        }
        s i$s1 = this.w0(0, true);
        i$s1.q = true;
        this.f0(i$s1, false);
        this.P0(i$s1, null);
    }

    private int U0(int v) {
        switch(v) {
            case 8: {
                Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
                return 108;
            }
            case 9: {
                Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
                return 109;
            }
            default: {
                return v;
            }
        }
    }

    private boolean V(boolean z) {
        return this.W(z, true);
    }

    void V0(Configuration configuration0, androidx.core.os.i i0) {
        if(Build.VERSION.SDK_INT >= 24) {
            k.d(configuration0, i0);
            return;
        }
        configuration0.setLocale(i0.d(0));
        configuration0.setLayoutDirection(i0.d(0));
    }

    private boolean W(boolean z, boolean z1) {
        if(this.W) {
            return false;
        }
        int v = this.a0();
        int v1 = this.F0(this.p, v);
        androidx.core.os.i i0 = Build.VERSION.SDK_INT >= 33 ? null : this.Z(this.p);
        if(!z1 && i0 != null) {
            i0 = this.v0(this.p.getResources().getConfiguration());
        }
        boolean z2 = this.f1(v1, i0, z);
        if(v == 0) {
            this.u0(this.p).e();
        }
        else {
            p i$p0 = this.c0;
            if(i$p0 != null) {
                i$p0.a();
            }
        }
        if(v == 3) {
            this.t0(this.p).e();
            return z2;
        }
        p i$p1 = this.d0;
        if(i$p1 != null) {
            i$p1.a();
        }
        return z2;
    }

    void W0(androidx.core.os.i i0) {
        if(Build.VERSION.SDK_INT >= 24) {
            k.c(i0);
            return;
        }
        Locale.setDefault(i0.d(0));
    }

    private void X() {
        ContentFrameLayout contentFrameLayout0 = (ContentFrameLayout)this.G.findViewById(0x1020002);
        View view0 = this.q.getDecorView();
        contentFrameLayout0.a(view0.getPaddingLeft(), view0.getPaddingTop(), view0.getPaddingRight(), view0.getPaddingBottom());
        TypedArray typedArray0 = this.p.obtainStyledAttributes(e.j.y0);
        TypedValue typedValue0 = contentFrameLayout0.getMinWidthMajor();
        typedArray0.getValue(e.j.K0, typedValue0);
        TypedValue typedValue1 = contentFrameLayout0.getMinWidthMinor();
        typedArray0.getValue(e.j.L0, typedValue1);
        if(typedArray0.hasValue(e.j.I0)) {
            typedArray0.getValue(0x7A, contentFrameLayout0.getFixedWidthMajor());
        }
        if(typedArray0.hasValue(e.j.J0)) {
            typedArray0.getValue(0x7B, contentFrameLayout0.getFixedWidthMinor());
        }
        if(typedArray0.hasValue(e.j.G0)) {
            typedArray0.getValue(120, contentFrameLayout0.getFixedHeightMajor());
        }
        if(typedArray0.hasValue(e.j.H0)) {
            typedArray0.getValue(0x79, contentFrameLayout0.getFixedHeightMinor());
        }
        typedArray0.recycle();
        contentFrameLayout0.requestLayout();
    }

    // 去混淆评级： 低(20)
    final boolean X0() {
        return this.F && (this.G != null && this.G.isLaidOut());
    }

    private void Y(Window window0) {
        if(this.q != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback window$Callback0 = window0.getCallback();
        if(window$Callback0 instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n i$n0 = new n(this, window$Callback0);
        this.r = i$n0;
        window0.setCallback(i$n0);
        c0 c00 = c0.u(this.p, null, i.q0);
        Drawable drawable0 = c00.h(0);
        if(drawable0 != null) {
            window0.setBackgroundDrawable(drawable0);
        }
        c00.x();
        this.q = window0;
        if(Build.VERSION.SDK_INT >= 33 && this.m0 == null) {
            this.P(null);
        }
    }

    private boolean Y0(ViewParent viewParent0) {
        if(viewParent0 == null) {
            return false;
        }
        View view0 = this.q.getDecorView();
        while(true) {
            if(viewParent0 == null) {
                return true;
            }
            if(viewParent0 == view0 || !(viewParent0 instanceof View) || ((View)viewParent0).isAttachedToWindow()) {
                break;
            }
            viewParent0 = viewParent0.getParent();
        }
        return false;
    }

    androidx.core.os.i Z(Context context0) {
        androidx.core.os.i i2;
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            return null;
        }
        androidx.core.os.i i0 = g.t();
        if(i0 == null) {
            return null;
        }
        androidx.core.os.i i1 = this.v0(context0.getApplicationContext().getResources().getConfiguration());
        if(v >= 24) {
            i2 = C.b(i0, i1);
            return i2.f() ? i1 : i2;
        }
        i2 = i0.f() ? androidx.core.os.i.e() : androidx.core.os.i.c(j.b(i0.d(0)));
        return i2.f() ? i1 : i2;
    }

    boolean Z0() {
        if(this.m0 == null) {
            return false;
        }
        s i$s0 = this.w0(0, false);
        return i$s0 == null || !i$s0.o ? this.z != null : true;
    }

    @Override  // androidx.appcompat.view.menu.e$a
    public boolean a(e e0, MenuItem menuItem0) {
        Window.Callback window$Callback0 = this.y0();
        if(window$Callback0 != null && !this.W) {
            s i$s0 = this.p0(e0.F());
            return i$s0 == null ? false : window$Callback0.onMenuItemSelected(i$s0.a, menuItem0);
        }
        return false;
    }

    // 去混淆评级： 低(30)
    private int a0() {
        return this.Y == -100 ? -100 : this.Y;
    }

    public androidx.appcompat.view.b a1(androidx.appcompat.view.b.a b$a0) {
        if(b$a0 == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b b0 = this.z;
        if(b0 != null) {
            b0.c();
        }
        androidx.appcompat.app.i.i i$i0 = new androidx.appcompat.app.i.i(this, b$a0);
        androidx.appcompat.app.a a0 = this.u();
        if(a0 != null) {
            androidx.appcompat.view.b b1 = a0.z(i$i0);
            this.z = b1;
            if(b1 != null) {
                androidx.appcompat.app.e e0 = this.s;
                if(e0 != null) {
                    e0.n(b1);
                }
            }
        }
        if(this.z == null) {
            this.z = this.b1(i$i0);
        }
        this.g1();
        return this.z;
    }

    @Override  // androidx.appcompat.view.menu.e$a
    public void b(e e0) {
        this.T0(true);
    }

    void b0(int v, s i$s0, Menu menu0) {
        if(menu0 == null) {
            if(i$s0 == null && v >= 0) {
                s[] arr_i$s = this.R;
                if(v < arr_i$s.length) {
                    i$s0 = arr_i$s[v];
                }
            }
            if(i$s0 != null) {
                menu0 = i$s0.j;
            }
        }
        if(i$s0 != null && !i$s0.o) {
            return;
        }
        if(!this.W) {
            this.r.d(this.q.getCallback(), v, menu0);
        }
    }

    androidx.appcompat.view.b b1(androidx.appcompat.view.b.a b$a0) {
        class androidx.appcompat.app.i.d implements Runnable {
            final i f;

            @Override
            public void run() {
                class androidx.appcompat.app.i.d.a extends i0 {
                    final androidx.appcompat.app.i.d a;

                    @Override  // androidx.core.view.h0
                    public void b(View view0) {
                        i.this.A.setAlpha(1.0f);
                        i.this.D.h(null);
                        i.this.D = null;
                    }

                    @Override  // androidx.core.view.i0
                    public void c(View view0) {
                        i.this.A.setVisibility(0);
                    }
                }

                i.this.B.showAtLocation(i.this.A, 55, 0, 0);
                i.this.m0();
                if(i.this.X0()) {
                    i.this.A.setAlpha(0.0f);
                    i.this.D = Y.e(i.this.A).b(1.0f);
                    i.this.D.h(new androidx.appcompat.app.i.d.a(this));
                    return;
                }
                i.this.A.setAlpha(1.0f);
                i.this.A.setVisibility(0);
            }
        }


        class androidx.appcompat.app.i.e extends i0 {
            final i a;

            @Override  // androidx.core.view.h0
            public void b(View view0) {
                i.this.A.setAlpha(1.0f);
                i.this.D.h(null);
                i.this.D = null;
            }

            @Override  // androidx.core.view.i0
            public void c(View view0) {
                i.this.A.setVisibility(0);
                if(i.this.A.getParent() instanceof View) {
                    Y.l0(((View)i.this.A.getParent()));
                }
            }
        }

        Context context0;
        this.m0();
        androidx.appcompat.view.b b0 = this.z;
        if(b0 != null) {
            b0.c();
        }
        if(!(b$a0 instanceof androidx.appcompat.app.i.i)) {
            b$a0 = new androidx.appcompat.app.i.i(this, b$a0);
        }
        androidx.appcompat.app.e e0 = this.s;
        androidx.appcompat.view.b b1 = null;
        if(e0 != null && !this.W) {
            try {
                b1 = e0.M(b$a0);
            }
            catch(AbstractMethodError unused_ex) {
            }
        }
        boolean z = true;
        if(b1 == null) {
            if(this.A == null) {
                if(this.O) {
                    TypedValue typedValue0 = new TypedValue();
                    Resources.Theme resources$Theme0 = this.p.getTheme();
                    resources$Theme0.resolveAttribute(e.a.d, typedValue0, true);
                    if(typedValue0.resourceId == 0) {
                        context0 = this.p;
                    }
                    else {
                        Resources.Theme resources$Theme1 = this.p.getResources().newTheme();
                        resources$Theme1.setTo(resources$Theme0);
                        resources$Theme1.applyStyle(typedValue0.resourceId, true);
                        context0 = new d(this.p, 0);
                        context0.getTheme().setTo(resources$Theme1);
                    }
                    this.A = new ActionBarContextView(context0);
                    PopupWindow popupWindow0 = new PopupWindow(context0, null, e.a.f);
                    this.B = popupWindow0;
                    androidx.core.widget.h.b(popupWindow0, 2);
                    this.B.setContentView(this.A);
                    this.B.setWidth(-1);
                    context0.getTheme().resolveAttribute(e.a.b, typedValue0, true);
                    int v = TypedValue.complexToDimensionPixelSize(typedValue0.data, context0.getResources().getDisplayMetrics());
                    this.A.setContentHeight(v);
                    this.B.setHeight(-2);
                    this.C = new androidx.appcompat.app.i.d(this);
                }
                else {
                    ViewStubCompat viewStubCompat0 = (ViewStubCompat)this.G.findViewById(e.f.h);
                    if(viewStubCompat0 != null) {
                        viewStubCompat0.setLayoutInflater(LayoutInflater.from(this.r0()));
                        this.A = (ActionBarContextView)viewStubCompat0.a();
                    }
                }
            }
            if(this.A != null) {
                this.m0();
                this.A.k();
                Context context1 = this.A.getContext();
                ActionBarContextView actionBarContextView0 = this.A;
                if(this.B != null) {
                    z = false;
                }
                androidx.appcompat.view.e e1 = new androidx.appcompat.view.e(context1, actionBarContextView0, b$a0, z);
                if(b$a0.b(e1, e1.e())) {
                    e1.k();
                    this.A.h(e1);
                    this.z = e1;
                    if(this.X0()) {
                        this.A.setAlpha(0.0f);
                        g0 g00 = Y.e(this.A).b(1.0f);
                        this.D = g00;
                        g00.h(new androidx.appcompat.app.i.e(this));
                    }
                    else {
                        this.A.setAlpha(1.0f);
                        this.A.setVisibility(0);
                        if(this.A.getParent() instanceof View) {
                            Y.l0(((View)this.A.getParent()));
                        }
                    }
                    if(this.B != null) {
                        this.q.getDecorView().post(this.C);
                    }
                }
                else {
                    this.z = null;
                }
            }
        }
        else {
            this.z = b1;
        }
        androidx.appcompat.view.b b2 = this.z;
        if(b2 != null) {
            androidx.appcompat.app.e e2 = this.s;
            if(e2 != null) {
                e2.n(b2);
            }
        }
        this.g1();
        return this.z;
    }

    void c0(e e0) {
        if(this.Q) {
            return;
        }
        this.Q = true;
        this.w.i();
        Window.Callback window$Callback0 = this.y0();
        if(window$Callback0 != null && !this.W) {
            window$Callback0.onPanelClosed(108, e0);
        }
        this.Q = false;
    }

    private void c1() {
        if(this.F) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void d0() {
        p i$p0 = this.c0;
        if(i$p0 != null) {
            i$p0.a();
        }
        p i$p1 = this.d0;
        if(i$p1 != null) {
            i$p1.a();
        }
    }

    private androidx.appcompat.app.d d1() {
        for(Context context0 = this.p; context0 != null; context0 = ((ContextWrapper)context0).getBaseContext()) {
            if(context0 instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d)context0;
            }
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    @Override  // androidx.appcompat.app.g
    public void e(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.n0();
        ((ViewGroup)this.G.findViewById(0x1020002)).addView(view0, viewGroup$LayoutParams0);
        this.r.c(this.q.getCallback());
    }

    void e0(int v) {
        this.f0(this.w0(v, true), true);
    }

    private void e1(Configuration configuration0) {
        Activity activity0 = (Activity)this.o;
        if(activity0 instanceof androidx.lifecycle.n) {
            if(((androidx.lifecycle.n)activity0).getLifecycle().b().f(androidx.lifecycle.h.b.h)) {
                activity0.onConfigurationChanged(configuration0);
            }
        }
        else if(this.V && !this.W) {
            activity0.onConfigurationChanged(configuration0);
        }
    }

    @Override  // androidx.appcompat.app.g
    public boolean f() {
        return this.V(true);
    }

    void f0(s i$s0, boolean z) {
        if(z && i$s0.a == 0 && (this.w != null && this.w.b())) {
            this.c0(i$s0.j);
            return;
        }
        WindowManager windowManager0 = (WindowManager)this.p.getSystemService("window");
        if(windowManager0 != null && i$s0.o) {
            ViewGroup viewGroup0 = i$s0.g;
            if(viewGroup0 != null) {
                windowManager0.removeView(viewGroup0);
                if(z) {
                    this.b0(i$s0.a, i$s0, null);
                }
            }
        }
        i$s0.m = false;
        i$s0.n = false;
        i$s0.o = false;
        i$s0.h = null;
        i$s0.q = true;
        if(this.S == i$s0) {
            this.S = null;
        }
        if(i$s0.a == 0) {
            this.g1();
        }
    }

    private boolean f1(int v, androidx.core.os.i i0, boolean z) {
        boolean z3;
        Configuration configuration0 = this.g0(this.p, v, i0, null, false);
        int v1 = this.s0(this.p);
        Configuration configuration1 = this.X == null ? this.p.getResources().getConfiguration() : this.X;
        int v2 = configuration1.uiMode & 0x30;
        int v3 = configuration0.uiMode & 0x30;
        androidx.core.os.i i1 = this.v0(configuration1);
        androidx.core.os.i i2 = i0 == null ? null : this.v0(configuration0);
        boolean z1 = false;
        int v4 = v2 == v3 ? 0 : 0x200;
        if(i2 != null && !i1.equals(i2)) {
            v4 |= 0x2004;
        }
        boolean z2 = true;
        if((~v1 & v4) == 0 || !z || !this.U || !i.r0 && !this.V || (!(this.o instanceof Activity) || ((Activity)this.o).isChild())) {
            z3 = false;
        }
        else {
            if(Build.VERSION.SDK_INT >= 0x1F && (v4 & 0x2000) != 0) {
                ((Activity)this.o).getWindow().getDecorView().setLayoutDirection(configuration0.getLayoutDirection());
            }
            androidx.core.app.b.d(((Activity)this.o));
            z3 = true;
        }
        if(z3 || v4 == 0) {
            z2 = z3;
        }
        else {
            if((v4 & v1) == v4) {
                z1 = true;
            }
            this.h1(v3, i2, z1, null);
        }
        if(i2 != null) {
            this.W0(this.v0(this.p.getResources().getConfiguration()));
        }
        return z2;
    }

    private Configuration g0(Context context0, int v, androidx.core.os.i i0, Configuration configuration0, boolean z) {
        int v1;
        switch(v) {
            case 1: {
                v1 = 16;
                break;
            }
            case 2: {
                v1 = 0x20;
                break;
            }
            default: {
                v1 = z ? 0 : context0.getApplicationContext().getResources().getConfiguration().uiMode & 0x30;
            }
        }
        Configuration configuration1 = new Configuration();
        configuration1.fontScale = 0.0f;
        if(configuration0 != null) {
            configuration1.setTo(configuration0);
        }
        configuration1.uiMode = v1 | configuration1.uiMode & -49;
        if(i0 != null) {
            this.V0(configuration1, i0);
        }
        return configuration1;
    }

    void g1() {
        if(Build.VERSION.SDK_INT >= 33) {
            boolean z = this.Z0();
            if(z && this.n0 == null) {
                this.n0 = m.b(this.m0, this);
                return;
            }
            if(!z) {
                OnBackInvokedCallback onBackInvokedCallback0 = this.n0;
                if(onBackInvokedCallback0 != null) {
                    m.c(this.m0, onBackInvokedCallback0);
                    this.n0 = null;
                }
            }
        }
    }

    private ViewGroup h0() {
        class androidx.appcompat.app.i.b implements G {
            final i a;

            @Override  // androidx.core.view.G
            public y0 a(View view0, y0 y00) {
                int v = y00.l();
                int v1 = i.this.i1(y00, null);
                if(v != v1) {
                    y00 = y00.r(y00.j(), v1, y00.k(), y00.i());
                }
                return Y.a0(view0, y00);
            }
        }


        class androidx.appcompat.app.i.c implements androidx.appcompat.widget.ContentFrameLayout.a {
            final i a;

            @Override  // androidx.appcompat.widget.ContentFrameLayout$a
            public void a() {
            }

            @Override  // androidx.appcompat.widget.ContentFrameLayout$a
            public void onDetachedFromWindow() {
                i.this.j0();
            }
        }

        ViewGroup viewGroup0;
        TypedArray typedArray0 = this.p.obtainStyledAttributes(e.j.y0);
        if(typedArray0.hasValue(e.j.D0)) {
            if(typedArray0.getBoolean(e.j.M0, false)) {
                this.J(1);
            }
            else if(typedArray0.getBoolean(0x75, false)) {
                this.J(108);
            }
            if(typedArray0.getBoolean(e.j.E0, false)) {
                this.J(109);
            }
            if(typedArray0.getBoolean(e.j.F0, false)) {
                this.J(10);
            }
            this.O = typedArray0.getBoolean(e.j.z0, false);
            typedArray0.recycle();
            this.o0();
            this.q.getDecorView();
            LayoutInflater layoutInflater0 = LayoutInflater.from(this.p);
            if(this.P) {
                viewGroup0 = this.N ? ((ViewGroup)layoutInflater0.inflate(e.g.o, null)) : ((ViewGroup)layoutInflater0.inflate(e.g.n, null));
            }
            else if(this.O) {
                viewGroup0 = (ViewGroup)layoutInflater0.inflate(e.g.f, null);
                this.M = false;
                this.L = false;
            }
            else if(this.L) {
                TypedValue typedValue0 = new TypedValue();
                this.p.getTheme().resolveAttribute(e.a.d, typedValue0, true);
                Context context0 = typedValue0.resourceId == 0 ? this.p : new d(this.p, typedValue0.resourceId);
                viewGroup0 = (ViewGroup)LayoutInflater.from(context0).inflate(e.g.p, null);
                F f0 = (F)viewGroup0.findViewById(e.f.p);
                this.w = f0;
                f0.setWindowCallback(this.y0());
                if(this.M) {
                    this.w.h(109);
                }
                if(this.J) {
                    this.w.h(2);
                }
                if(this.K) {
                    this.w.h(5);
                }
            }
            else {
                viewGroup0 = null;
            }
            if(viewGroup0 == null) {
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.L + ", windowActionBarOverlay: " + this.M + ", android:windowIsFloating: " + this.O + ", windowActionModeOverlay: " + this.N + ", windowNoTitle: " + this.P + " }");
            }
            Y.B0(viewGroup0, new androidx.appcompat.app.i.b(this));
            if(this.w == null) {
                this.H = (TextView)viewGroup0.findViewById(e.f.M);
            }
            n0.c(viewGroup0);
            ContentFrameLayout contentFrameLayout0 = (ContentFrameLayout)viewGroup0.findViewById(e.f.b);
            ViewGroup viewGroup1 = (ViewGroup)this.q.findViewById(0x1020002);
            if(viewGroup1 != null) {
                while(viewGroup1.getChildCount() > 0) {
                    View view0 = viewGroup1.getChildAt(0);
                    viewGroup1.removeViewAt(0);
                    contentFrameLayout0.addView(view0);
                }
                viewGroup1.setId(-1);
                contentFrameLayout0.setId(0x1020002);
                if(viewGroup1 instanceof FrameLayout) {
                    ((FrameLayout)viewGroup1).setForeground(null);
                }
            }
            this.q.setContentView(viewGroup0);
            contentFrameLayout0.setAttachListener(new androidx.appcompat.app.i.c(this));
            return viewGroup0;
        }
        typedArray0.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void h1(int v, androidx.core.os.i i0, boolean z, Configuration configuration0) {
        Resources resources0 = this.p.getResources();
        Configuration configuration1 = new Configuration(resources0.getConfiguration());
        if(configuration0 != null) {
            configuration1.updateFrom(configuration0);
        }
        configuration1.uiMode = v | resources0.getConfiguration().uiMode & -49;
        if(i0 != null) {
            this.V0(configuration1, i0);
        }
        resources0.updateConfiguration(configuration1, null);
        if(Build.VERSION.SDK_INT < 26) {
            D.a(resources0);
        }
        int v1 = this.Z;
        if(v1 != 0) {
            this.p.setTheme(v1);
            this.p.getTheme().applyStyle(this.Z, true);
        }
        if(z && this.o instanceof Activity) {
            this.e1(configuration1);
        }
    }

    @Override  // androidx.appcompat.app.g
    public Context i(Context context0) {
        this.U = true;
        int v = this.F0(context0, this.a0());
        if(g.x(context0)) {
            g.U(context0);
        }
        androidx.core.os.i i0 = this.Z(context0);
        if(context0 instanceof ContextThemeWrapper) {
            Configuration configuration0 = this.g0(context0, v, i0, null, false);
            try {
                ((ContextThemeWrapper)context0).applyOverrideConfiguration(configuration0);
                return context0;
            }
            catch(IllegalStateException unused_ex) {
            }
        }
        if(context0 instanceof d) {
            Configuration configuration1 = this.g0(context0, v, i0, null, false);
            try {
                ((d)context0).a(configuration1);
                return context0;
            }
            catch(IllegalStateException unused_ex) {
            }
        }
        if(!i.r0) {
            return super.i(context0);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context0.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context0.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        Configuration configuration5 = this.g0(context0, v, i0, (configuration3.equals(configuration4) ? null : i.q0(configuration3, configuration4)), true);
        d d0 = new d(context0, e.i.d);
        d0.a(configuration5);
        try {
            if(context0.getTheme() != null) {
                goto label_25;
            }
        }
        catch(NullPointerException unused_ex) {
        }
        return super.i(d0);
    label_25:
        androidx.core.content.res.h.f.a(d0.getTheme());
        return super.i(d0);
    }

    public View i0(View view0, String s, Context context0, AttributeSet attributeSet0) {
        if(this.k0 == null) {
            TypedArray typedArray0 = this.p.obtainStyledAttributes(e.j.y0);
            String s1 = typedArray0.getString(e.j.C0);
            typedArray0.recycle();
            if(s1 == null) {
                this.k0 = new z();
            }
            else {
                try {
                    this.k0 = (z)this.p.getClassLoader().loadClass(s1).getDeclaredConstructor(null).newInstance(null);
                }
                catch(Throwable throwable0) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + s1 + ". Falling back to default.", throwable0);
                    this.k0 = new z();
                }
            }
        }
        boolean z = i.p0;
        boolean z1 = false;
        if(z) {
            if(this.l0 == null) {
                this.l0 = new B();
            }
            if(this.l0.a(attributeSet0)) {
                return this.k0.r(view0, s, context0, attributeSet0, true, true, true, false);
            }
            if(attributeSet0 instanceof XmlPullParser) {
                return ((XmlPullParser)attributeSet0).getDepth() <= 1 ? this.k0.r(view0, s, context0, attributeSet0, false, true, true, false) : this.k0.r(view0, s, context0, attributeSet0, true, true, true, false);
            }
            z1 = this.Y0(((ViewParent)view0));
        }
        return this.k0.r(view0, s, context0, attributeSet0, z1, z, true, false);
    }

    final int i1(y0 y00, Rect rect0) {
        int v10;
        int v8;
        int v1;
        int v = 0;
        if(y00 == null) {
            v1 = rect0 == null ? 0 : rect0.top;
        }
        else {
            v1 = y00.l();
        }
        if(this.A == null || !(this.A.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            v10 = 0;
        }
        else {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.A.getLayoutParams();
            int v2 = 1;
            if(this.A.isShown()) {
                if(this.i0 == null) {
                    this.i0 = new Rect();
                    this.j0 = new Rect();
                }
                Rect rect1 = this.i0;
                Rect rect2 = this.j0;
                if(y00 == null) {
                    rect1.set(rect0);
                }
                else {
                    rect1.set(y00.j(), y00.l(), y00.k(), y00.i());
                }
                n0.a(this.G, rect1, rect2);
                int v3 = rect1.top;
                int v4 = rect1.left;
                int v5 = rect1.right;
                y0 y01 = Y.G(this.G);
                int v6 = y01 == null ? 0 : y01.j();
                int v7 = y01 == null ? 0 : y01.k();
                if(viewGroup$MarginLayoutParams0.topMargin != v3 || viewGroup$MarginLayoutParams0.leftMargin != v4 || viewGroup$MarginLayoutParams0.rightMargin != v5) {
                    viewGroup$MarginLayoutParams0.topMargin = v3;
                    viewGroup$MarginLayoutParams0.leftMargin = v4;
                    viewGroup$MarginLayoutParams0.rightMargin = v5;
                    v8 = 1;
                }
                else {
                    v8 = 0;
                }
                if(v3 <= 0 || this.I != null) {
                    View view1 = this.I;
                    if(view1 != null) {
                        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams1 = (ViewGroup.MarginLayoutParams)view1.getLayoutParams();
                        int v9 = viewGroup$MarginLayoutParams0.topMargin;
                        if(viewGroup$MarginLayoutParams1.height != v9 || viewGroup$MarginLayoutParams1.leftMargin != v6 || viewGroup$MarginLayoutParams1.rightMargin != v7) {
                            viewGroup$MarginLayoutParams1.height = v9;
                            viewGroup$MarginLayoutParams1.leftMargin = v6;
                            viewGroup$MarginLayoutParams1.rightMargin = v7;
                            this.I.setLayoutParams(viewGroup$MarginLayoutParams1);
                        }
                    }
                }
                else {
                    View view0 = new View(this.p);
                    this.I = view0;
                    view0.setVisibility(8);
                    FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, viewGroup$MarginLayoutParams0.topMargin, 51);
                    frameLayout$LayoutParams0.leftMargin = v6;
                    frameLayout$LayoutParams0.rightMargin = v7;
                    this.G.addView(this.I, -1, frameLayout$LayoutParams0);
                }
                View view2 = this.I;
                if(view2 == null) {
                    v2 = 0;
                }
                else if(view2.getVisibility() != 0) {
                    this.j1(this.I);
                }
                if(!this.N && v2 != 0) {
                    v1 = 0;
                }
                v10 = v2;
                v2 = v8;
            }
            else if(viewGroup$MarginLayoutParams0.topMargin == 0) {
                v10 = 0;
                v2 = 0;
            }
            else {
                viewGroup$MarginLayoutParams0.topMargin = 0;
                v10 = 0;
            }
            if(v2 != 0) {
                this.A.setLayoutParams(viewGroup$MarginLayoutParams0);
            }
        }
        View view3 = this.I;
        if(view3 != null) {
            if(v10 == 0) {
                v = 8;
            }
            view3.setVisibility(v);
        }
        return v1;
    }

    void j0() {
        F f0 = this.w;
        if(f0 != null) {
            f0.i();
        }
        if(this.B != null) {
            this.q.getDecorView().removeCallbacks(this.C);
            if(this.B.isShowing()) {
                try {
                    this.B.dismiss();
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            this.B = null;
        }
        this.m0();
        s i$s0 = this.w0(0, false);
        if(i$s0 != null) {
            e e0 = i$s0.j;
            if(e0 != null) {
                e0.close();
            }
        }
    }

    private void j1(View view0) {
        view0.setBackgroundColor(((Y.L(view0) & 0x2000) == 0 ? androidx.core.content.a.getColor(this.p, e.c.a) : androidx.core.content.a.getColor(this.p, e.c.b)));
    }

    boolean k0(KeyEvent keyEvent0) {
        if(this.o instanceof androidx.core.view.t.a || this.o instanceof y) {
            View view0 = this.q.getDecorView();
            if(view0 != null && androidx.core.view.t.d(view0, keyEvent0)) {
                return true;
            }
        }
        if(keyEvent0.getKeyCode() == 82 && this.r.b(this.q.getCallback(), keyEvent0)) {
            return true;
        }
        int v = keyEvent0.getKeyCode();
        return keyEvent0.getAction() == 0 ? this.H0(v, keyEvent0) : this.K0(v, keyEvent0);
    }

    @Override  // androidx.appcompat.app.g
    public View l(int v) {
        this.n0();
        return this.q.findViewById(v);
    }

    void l0(int v) {
        s i$s0 = this.w0(v, true);
        if(i$s0.j != null) {
            Bundle bundle0 = new Bundle();
            i$s0.j.U(bundle0);
            if(bundle0.size() > 0) {
                i$s0.s = bundle0;
            }
            i$s0.j.i0();
            i$s0.j.clear();
        }
        i$s0.r = true;
        i$s0.q = true;
        if((v == 0 || v == 108) && this.w != null) {
            s i$s1 = this.w0(0, false);
            if(i$s1 != null) {
                i$s1.m = false;
                this.S0(i$s1, null);
            }
        }
    }

    void m0() {
        g0 g00 = this.D;
        if(g00 != null) {
            g00.c();
        }
    }

    @Override  // androidx.appcompat.app.g
    public Context n() {
        return this.p;
    }

    private void n0() {
        if(!this.F) {
            this.G = this.h0();
            CharSequence charSequence0 = this.x0();
            if(!TextUtils.isEmpty(charSequence0)) {
                F f0 = this.w;
                if(f0 != null) {
                    f0.setWindowTitle(charSequence0);
                }
                else if(this.Q0() == null) {
                    TextView textView0 = this.H;
                    if(textView0 != null) {
                        textView0.setText(charSequence0);
                    }
                }
                else {
                    this.Q0().x(charSequence0);
                }
            }
            this.X();
            this.F = true;
            s i$s0 = this.w0(0, false);
            if(!this.W && (i$s0 == null || i$s0.j == null)) {
                this.D0(108);
            }
        }
    }

    private void o0() {
        if(this.q == null) {
            Object object0 = this.o;
            if(object0 instanceof Activity) {
                this.Y(((Activity)object0).getWindow());
            }
        }
        if(this.q == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override  // android.view.LayoutInflater$Factory2
    public final View onCreateView(View view0, String s, Context context0, AttributeSet attributeSet0) {
        return this.i0(view0, s, context0, attributeSet0);
    }

    @Override  // android.view.LayoutInflater$Factory
    public View onCreateView(String s, Context context0, AttributeSet attributeSet0) {
        return this.onCreateView(null, s, context0, attributeSet0);
    }

    @Override  // androidx.appcompat.app.g
    public final b p() {
        return new f(this);
    }

    s p0(Menu menu0) {
        s[] arr_i$s = this.R;
        int v1 = arr_i$s == null ? 0 : arr_i$s.length;
        for(int v = 0; v < v1; ++v) {
            s i$s0 = arr_i$s[v];
            if(i$s0 != null && i$s0.j == menu0) {
                return i$s0;
            }
        }
        return null;
    }

    @Override  // androidx.appcompat.app.g
    public int q() {
        return this.Y;
    }

    private static Configuration q0(Configuration configuration0, Configuration configuration1) {
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if(configuration1 != null && configuration0.diff(configuration1) != 0) {
            float f = configuration1.fontScale;
            if(configuration0.fontScale != f) {
                configuration2.fontScale = f;
            }
            int v = configuration1.mcc;
            if(configuration0.mcc != v) {
                configuration2.mcc = v;
            }
            int v1 = configuration1.mnc;
            if(configuration0.mnc != v1) {
                configuration2.mnc = v1;
            }
            int v2 = Build.VERSION.SDK_INT;
            if(v2 >= 24) {
                k.a(configuration0, configuration1, configuration2);
            }
            else if(!B.c.a(configuration0.locale, configuration1.locale)) {
                configuration2.locale = configuration1.locale;
            }
            int v3 = configuration1.touchscreen;
            if(configuration0.touchscreen != v3) {
                configuration2.touchscreen = v3;
            }
            int v4 = configuration1.keyboard;
            if(configuration0.keyboard != v4) {
                configuration2.keyboard = v4;
            }
            int v5 = configuration1.keyboardHidden;
            if(configuration0.keyboardHidden != v5) {
                configuration2.keyboardHidden = v5;
            }
            int v6 = configuration1.navigation;
            if(configuration0.navigation != v6) {
                configuration2.navigation = v6;
            }
            int v7 = configuration1.navigationHidden;
            if(configuration0.navigationHidden != v7) {
                configuration2.navigationHidden = v7;
            }
            int v8 = configuration1.orientation;
            if(configuration0.orientation != v8) {
                configuration2.orientation = v8;
            }
            int v9 = configuration1.screenLayout;
            if((configuration0.screenLayout & 15) != (v9 & 15)) {
                configuration2.screenLayout |= v9 & 15;
            }
            int v10 = configuration1.screenLayout;
            if((configuration0.screenLayout & 0xC0) != (v10 & 0xC0)) {
                configuration2.screenLayout |= v10 & 0xC0;
            }
            int v11 = configuration1.screenLayout;
            if((configuration0.screenLayout & 0x30) != (v11 & 0x30)) {
                configuration2.screenLayout |= v11 & 0x30;
            }
            int v12 = configuration1.screenLayout;
            if((configuration0.screenLayout & 0x300) != (v12 & 0x300)) {
                configuration2.screenLayout |= v12 & 0x300;
            }
            if(v2 >= 26) {
                l.a(configuration0, configuration1, configuration2);
            }
            int v13 = configuration1.uiMode;
            if((configuration0.uiMode & 15) != (v13 & 15)) {
                configuration2.uiMode |= v13 & 15;
            }
            int v14 = configuration1.uiMode;
            if((configuration0.uiMode & 0x30) != (v14 & 0x30)) {
                configuration2.uiMode |= v14 & 0x30;
            }
            int v15 = configuration1.screenWidthDp;
            if(configuration0.screenWidthDp != v15) {
                configuration2.screenWidthDp = v15;
            }
            int v16 = configuration1.screenHeightDp;
            if(configuration0.screenHeightDp != v16) {
                configuration2.screenHeightDp = v16;
            }
            int v17 = configuration1.smallestScreenWidthDp;
            if(configuration0.smallestScreenWidthDp != v17) {
                configuration2.smallestScreenWidthDp = v17;
            }
            int v18 = configuration1.densityDpi;
            if(configuration0.densityDpi != v18) {
                configuration2.densityDpi = v18;
            }
        }
        return configuration2;
    }

    final Context r0() {
        androidx.appcompat.app.a a0 = this.u();
        Context context0 = a0 == null ? null : a0.j();
        return context0 == null ? this.p : context0;
    }

    @Override  // androidx.appcompat.app.g
    public MenuInflater s() {
        if(this.u == null) {
            this.z0();
            this.u = new androidx.appcompat.view.g((this.t == null ? this.p : this.t.j()));
        }
        return this.u;
    }

    private int s0(Context context0) {
        int v1;
        if(!this.b0 && this.o instanceof Activity) {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return 0;
            }
            try {
                int v = Build.VERSION.SDK_INT;
                if(v >= 29) {
                    v1 = 0x100C0000;
                }
                else {
                    v1 = v < 24 ? 0 : 0xC0000;
                }
                ActivityInfo activityInfo0 = packageManager0.getActivityInfo(new ComponentName(context0, this.o.getClass()), v1);
                if(activityInfo0 != null) {
                    this.a0 = activityInfo0.configChanges;
                }
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", packageManager$NameNotFoundException0);
                this.a0 = 0;
            }
        }
        this.b0 = true;
        return this.a0;
    }

    private p t0(Context context0) {
        if(this.d0 == null) {
            this.d0 = new o(this, context0);
        }
        return this.d0;
    }

    @Override  // androidx.appcompat.app.g
    public androidx.appcompat.app.a u() {
        this.z0();
        return this.t;
    }

    private p u0(Context context0) {
        if(this.c0 == null) {
            this.c0 = new q(this, H.a(context0));
        }
        return this.c0;
    }

    @Override  // androidx.appcompat.app.g
    public void v() {
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.p);
        if(layoutInflater0.getFactory() == null) {
            u.a(layoutInflater0, this);
            return;
        }
        if(!(layoutInflater0.getFactory2() instanceof i)) {
            Log.i("AppCompatDelegate", "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s");
        }
    }

    androidx.core.os.i v0(Configuration configuration0) {
        return Build.VERSION.SDK_INT < 24 ? androidx.core.os.i.c(j.b(configuration0.locale)) : k.b(configuration0);
    }

    @Override  // androidx.appcompat.app.g
    public void w() {
        if(this.Q0() != null && !this.u().l()) {
            this.D0(0);
        }
    }

    protected s w0(int v, boolean z) {
        s[] arr_i$s = this.R;
        if(arr_i$s == null || arr_i$s.length <= v) {
            s[] arr_i$s1 = new s[v + 1];
            if(arr_i$s != null) {
                System.arraycopy(arr_i$s, 0, arr_i$s1, 0, arr_i$s.length);
            }
            this.R = arr_i$s1;
            arr_i$s = arr_i$s1;
        }
        s i$s0 = arr_i$s[v];
        if(i$s0 == null) {
            i$s0 = new s(v);
            arr_i$s[v] = i$s0;
        }
        return i$s0;
    }

    // 去混淆评级： 低(20)
    final CharSequence x0() {
        return this.o instanceof Activity ? ((Activity)this.o).getTitle() : this.v;
    }

    final Window.Callback y0() {
        return this.q.getCallback();
    }

    @Override  // androidx.appcompat.app.g
    public void z(Configuration configuration0) {
        if(this.L && this.F) {
            androidx.appcompat.app.a a0 = this.u();
            if(a0 != null) {
                a0.m(configuration0);
            }
        }
        androidx.appcompat.widget.j.b().g(this.p);
        this.X = new Configuration(this.p.getResources().getConfiguration());
        this.W(false, false);
    }

    private void z0() {
        this.n0();
        if(this.L && this.t == null) {
            Object object0 = this.o;
            if(object0 instanceof Activity) {
                this.t = new I(((Activity)this.o), this.M);
            }
            else if(object0 instanceof Dialog) {
                this.t = new I(((Dialog)this.o));
            }
            androidx.appcompat.app.a a0 = this.t;
            if(a0 != null) {
                a0.r(this.h0);
            }
        }
    }
}

