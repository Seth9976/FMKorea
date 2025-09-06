package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.c;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.core.view.Y;
import androidx.core.view.s;
import androidx.core.view.w;
import androidx.core.view.x;
import androidx.core.view.z;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Toolbar extends ViewGroup implements w {
    public static class SavedState extends AbsSavedState {
        class a implements Parcelable.ClassLoaderCreator {
            a() {
                super();
            }

            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0, null);
            }

            public SavedState b(Parcel parcel0, ClassLoader classLoader0) {
                return new SavedState(parcel0, classLoader0);
            }

            public SavedState[] c(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                return this.b(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.c(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        int h;
        boolean i;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.h = parcel0.readInt();
            this.i = parcel0.readInt() != 0;
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.h);
            parcel0.writeInt(((int)this.i));
        }
    }

    class androidx.appcompat.widget.Toolbar.a implements e {
        final Toolbar a;

        @Override  // androidx.appcompat.widget.ActionMenuView$e
        public boolean onMenuItemClick(MenuItem menuItem0) {
            if(Toolbar.this.L.d(menuItem0)) {
                return true;
            }
            h toolbar$h0 = Toolbar.this.N;
            return toolbar$h0 == null ? false : toolbar$h0.onMenuItemClick(menuItem0);
        }
    }

    class b implements Runnable {
        final Toolbar f;

        @Override
        public void run() {
            Toolbar.this.R();
        }
    }

    static abstract class androidx.appcompat.widget.Toolbar.e {
        static OnBackInvokedDispatcher a(View view0) {
            return view0.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Runnable runnable0) {
            Objects.requireNonNull(runnable0);
            return new f0(runnable0);
        }

        static void c(Object object0, Object object1) {
            ((OnBackInvokedDispatcher)object0).registerOnBackInvokedCallback(1000000, ((OnBackInvokedCallback)object1));
        }

        static void d(Object object0, Object object1) {
            ((OnBackInvokedDispatcher)object0).unregisterOnBackInvokedCallback(((OnBackInvokedCallback)object1));
        }
    }

    class f implements j {
        androidx.appcompat.view.menu.e f;
        g g;
        final Toolbar h;

        @Override  // androidx.appcompat.view.menu.j
        public void b(androidx.appcompat.view.menu.e e0, boolean z) {
        }

        @Override  // androidx.appcompat.view.menu.j
        public void c(boolean z) {
            if(this.g != null) {
                androidx.appcompat.view.menu.e e0 = this.f;
                if(e0 != null) {
                    int v = e0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        if(this.f.getItem(v1) == this.g) {
                            return;
                        }
                    }
                }
                this.e(this.f, this.g);
            }
        }

        @Override  // androidx.appcompat.view.menu.j
        public boolean d() {
            return false;
        }

        @Override  // androidx.appcompat.view.menu.j
        public boolean e(androidx.appcompat.view.menu.e e0, g g0) {
            View view0 = Toolbar.this.n;
            if(view0 instanceof c) {
                ((c)view0).f();
            }
            Toolbar.this.removeView(Toolbar.this.n);
            Toolbar.this.removeView(Toolbar.this.m);
            Toolbar.this.n = null;
            Toolbar.this.a();
            this.g = null;
            Toolbar.this.requestLayout();
            g0.r(false);
            Toolbar.this.S();
            return true;
        }

        @Override  // androidx.appcompat.view.menu.j
        public boolean f(androidx.appcompat.view.menu.e e0, g g0) {
            Toolbar.this.g();
            ViewParent viewParent0 = Toolbar.this.m.getParent();
            Toolbar toolbar0 = Toolbar.this;
            if(viewParent0 != toolbar0) {
                if(viewParent0 instanceof ViewGroup) {
                    ((ViewGroup)viewParent0).removeView(toolbar0.m);
                }
                Toolbar.this.addView(Toolbar.this.m);
            }
            Toolbar.this.n = g0.getActionView();
            this.g = g0;
            ViewParent viewParent1 = Toolbar.this.n.getParent();
            Toolbar toolbar1 = Toolbar.this;
            if(viewParent1 != toolbar1) {
                if(viewParent1 instanceof ViewGroup) {
                    ((ViewGroup)viewParent1).removeView(toolbar1.n);
                }
                androidx.appcompat.widget.Toolbar.g toolbar$g0 = Toolbar.this.n();
                toolbar$g0.a = Toolbar.this.s & 0x70 | 0x800003;
                toolbar$g0.b = 2;
                Toolbar.this.n.setLayoutParams(toolbar$g0);
                Toolbar.this.addView(Toolbar.this.n);
            }
            Toolbar.this.J();
            Toolbar.this.requestLayout();
            g0.r(true);
            View view0 = Toolbar.this.n;
            if(view0 instanceof c) {
                ((c)view0).c();
            }
            Toolbar.this.S();
            return true;
        }

        @Override  // androidx.appcompat.view.menu.j
        public int getId() {
            return 0;
        }

        @Override  // androidx.appcompat.view.menu.j
        public void h(Context context0, androidx.appcompat.view.menu.e e0) {
            androidx.appcompat.view.menu.e e1 = this.f;
            if(e1 != null) {
                g g0 = this.g;
                if(g0 != null) {
                    e1.f(g0);
                }
            }
            this.f = e0;
        }

        @Override  // androidx.appcompat.view.menu.j
        public void i(Parcelable parcelable0) {
        }

        @Override  // androidx.appcompat.view.menu.j
        public boolean k(m m0) {
            return false;
        }

        @Override  // androidx.appcompat.view.menu.j
        public Parcelable l() {
            return null;
        }
    }

    public static class androidx.appcompat.widget.Toolbar.g extends androidx.appcompat.app.a.a {
        int b;

        public androidx.appcompat.widget.Toolbar.g(int v, int v1) {
            super(v, v1);
            this.b = 0;
            this.a = 0x800013;
        }

        public androidx.appcompat.widget.Toolbar.g(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.b = 0;
        }

        public androidx.appcompat.widget.Toolbar.g(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.b = 0;
        }

        public androidx.appcompat.widget.Toolbar.g(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.b = 0;
            this.a(viewGroup$MarginLayoutParams0);
        }

        public androidx.appcompat.widget.Toolbar.g(androidx.appcompat.app.a.a a$a0) {
            super(a$a0);
            this.b = 0;
        }

        public androidx.appcompat.widget.Toolbar.g(androidx.appcompat.widget.Toolbar.g toolbar$g0) {
            super(toolbar$g0);
            this.b = toolbar$g0.b;
        }

        void a(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            this.leftMargin = viewGroup$MarginLayoutParams0.leftMargin;
            this.topMargin = viewGroup$MarginLayoutParams0.topMargin;
            this.rightMargin = viewGroup$MarginLayoutParams0.rightMargin;
            this.bottomMargin = viewGroup$MarginLayoutParams0.bottomMargin;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem arg1);
    }

    private int A;
    private int B;
    private CharSequence C;
    private CharSequence D;
    private ColorStateList E;
    private ColorStateList F;
    private boolean G;
    private boolean H;
    private final ArrayList I;
    private final ArrayList J;
    private final int[] K;
    final x L;
    private ArrayList M;
    h N;
    private final e O;
    private g0 P;
    private ActionMenuPresenter Q;
    private f R;
    private androidx.appcompat.view.menu.j.a S;
    androidx.appcompat.view.menu.e.a T;
    private boolean U;
    private OnBackInvokedCallback V;
    private OnBackInvokedDispatcher W;
    private boolean a0;
    private final Runnable b0;
    ActionMenuView f;
    private TextView g;
    private TextView h;
    private ImageButton i;
    private ImageView j;
    private Drawable k;
    private CharSequence l;
    ImageButton m;
    View n;
    private Context o;
    private int p;
    private int q;
    private int r;
    int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private V y;
    private int z;

    public Toolbar(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, e.a.O);
    }

    public Toolbar(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.B = 0x800013;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new int[2];
        this.L = new x(() -> {
            for(Object object0: this.M) {
                this.getMenu().removeItem(((MenuItem)object0).getItemId());
            }
            this.H();
        });
        this.M = new ArrayList();
        this.O = new androidx.appcompat.widget.Toolbar.a(this);
        this.b0 = () -> Toolbar.this.f != null && Toolbar.this.f.P();
        c0 c00 = c0.v(this.getContext(), attributeSet0, e.j.l3, v, 0);
        Y.m0(this, context0, e.j.l3, attributeSet0, c00.r(), v, 0);
        this.q = c00.n(e.j.N3, 0);
        this.r = c00.n(e.j.E3, 0);
        this.B = c00.l(e.j.m3, this.B);
        this.s = c00.l(e.j.n3, 0x30);
        int v1 = c00.e(e.j.H3, 0);
        if(c00.s(e.j.M3)) {
            v1 = c00.e(27, v1);
        }
        this.x = v1;
        this.w = v1;
        this.v = v1;
        this.u = v1;
        int v2 = c00.e(e.j.K3, -1);
        if(v2 >= 0) {
            this.u = v2;
        }
        int v3 = c00.e(e.j.J3, -1);
        if(v3 >= 0) {
            this.v = v3;
        }
        int v4 = c00.e(e.j.L3, -1);
        if(v4 >= 0) {
            this.w = v4;
        }
        int v5 = c00.e(e.j.I3, -1);
        if(v5 >= 0) {
            this.x = v5;
        }
        this.t = c00.f(e.j.y3, -1);
        int v6 = c00.e(e.j.u3, 0x80000000);
        int v7 = c00.e(e.j.q3, 0x80000000);
        int v8 = c00.f(e.j.s3, 0);
        int v9 = c00.f(e.j.t3, 0);
        this.h();
        this.y.e(v8, v9);
        if(v6 != 0x80000000 || v7 != 0x80000000) {
            this.y.g(v6, v7);
        }
        this.z = c00.e(e.j.v3, 0x80000000);
        this.A = c00.e(e.j.r3, 0x80000000);
        this.k = c00.g(e.j.p3);
        this.l = c00.p(e.j.o3);
        CharSequence charSequence0 = c00.p(e.j.G3);
        if(!TextUtils.isEmpty(charSequence0)) {
            this.setTitle(charSequence0);
        }
        CharSequence charSequence1 = c00.p(e.j.D3);
        if(!TextUtils.isEmpty(charSequence1)) {
            this.setSubtitle(charSequence1);
        }
        this.o = this.getContext();
        this.setPopupTheme(c00.n(e.j.C3, 0));
        Drawable drawable0 = c00.g(e.j.B3);
        if(drawable0 != null) {
            this.setNavigationIcon(drawable0);
        }
        CharSequence charSequence2 = c00.p(e.j.A3);
        if(!TextUtils.isEmpty(charSequence2)) {
            this.setNavigationContentDescription(charSequence2);
        }
        Drawable drawable1 = c00.g(e.j.w3);
        if(drawable1 != null) {
            this.setLogo(drawable1);
        }
        CharSequence charSequence3 = c00.p(e.j.x3);
        if(!TextUtils.isEmpty(charSequence3)) {
            this.setLogoDescription(charSequence3);
        }
        if(c00.s(e.j.O3)) {
            this.setTitleTextColor(c00.c(29));
        }
        if(c00.s(e.j.F3)) {
            this.setSubtitleTextColor(c00.c(20));
        }
        if(c00.s(e.j.z3)) {
            this.y(c00.n(14, 0));
        }
        c00.x();
    }

    private boolean A(View view0) {
        return view0.getParent() == this || this.J.contains(view0);
    }

    public boolean B() {
        return this.f != null && this.f.I();
    }

    public boolean C() {
        return this.f != null && this.f.J();
    }

    private int D(View view0, int v, int[] arr_v, int v1) {
        androidx.appcompat.widget.Toolbar.g toolbar$g0 = (androidx.appcompat.widget.Toolbar.g)view0.getLayoutParams();
        int v2 = toolbar$g0.leftMargin - arr_v[0];
        int v3 = v + Math.max(0, v2);
        arr_v[0] = Math.max(0, -v2);
        int v4 = this.r(view0, v1);
        int v5 = view0.getMeasuredWidth();
        view0.layout(v3, v4, v3 + v5, view0.getMeasuredHeight() + v4);
        return v3 + (v5 + toolbar$g0.rightMargin);
    }

    private int E(View view0, int v, int[] arr_v, int v1) {
        androidx.appcompat.widget.Toolbar.g toolbar$g0 = (androidx.appcompat.widget.Toolbar.g)view0.getLayoutParams();
        int v2 = toolbar$g0.rightMargin - arr_v[1];
        int v3 = v - Math.max(0, v2);
        arr_v[1] = Math.max(0, -v2);
        int v4 = this.r(view0, v1);
        int v5 = view0.getMeasuredWidth();
        view0.layout(v3 - v5, v4, v3, view0.getMeasuredHeight() + v4);
        return v3 - (v5 + toolbar$g0.leftMargin);
    }

    private int F(View view0, int v, int v1, int v2, int v3, int[] arr_v) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v4 = viewGroup$MarginLayoutParams0.leftMargin - arr_v[0];
        int v5 = viewGroup$MarginLayoutParams0.rightMargin - arr_v[1];
        int v6 = Math.max(0, v4) + Math.max(0, v5);
        arr_v[0] = Math.max(0, -v4);
        arr_v[1] = Math.max(0, -v5);
        view0.measure(ViewGroup.getChildMeasureSpec(v, this.getPaddingLeft() + this.getPaddingRight() + v6 + v1, viewGroup$MarginLayoutParams0.width), ViewGroup.getChildMeasureSpec(v2, this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin + v3, viewGroup$MarginLayoutParams0.height));
        return view0.getMeasuredWidth() + v6;
    }

    private void G(View view0, int v, int v1, int v2, int v3, int v4) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v5 = ViewGroup.getChildMeasureSpec(v, this.getPaddingLeft() + this.getPaddingRight() + viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin + v1, viewGroup$MarginLayoutParams0.width);
        int v6 = ViewGroup.getChildMeasureSpec(v2, this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin + v3, viewGroup$MarginLayoutParams0.height);
        int v7 = View.MeasureSpec.getMode(v6);
        if(v7 != 0x40000000 && v4 >= 0) {
            if(v7 != 0) {
                v4 = Math.min(View.MeasureSpec.getSize(v6), v4);
            }
            v6 = View.MeasureSpec.makeMeasureSpec(v4, 0x40000000);
        }
        view0.measure(v5, v6);
    }

    private void H() {
        Menu menu0 = this.getMenu();
        ArrayList arrayList0 = this.getCurrentMenuItems();
        MenuInflater menuInflater0 = this.getMenuInflater();
        this.L.b(menu0, menuInflater0);
        ArrayList arrayList1 = this.getCurrentMenuItems();
        arrayList1.removeAll(arrayList0);
        this.M = arrayList1;
    }

    private void I() {
        this.removeCallbacks(this.b0);
        this.post(this.b0);
    }

    void J() {
        for(int v = this.getChildCount() - 1; v >= 0; --v) {
            View view0 = this.getChildAt(v);
            if(((androidx.appcompat.widget.Toolbar.g)view0.getLayoutParams()).b != 2 && view0 != this.f) {
                this.removeViewAt(v);
                this.J.add(view0);
            }
        }
    }

    public void K(int v, int v1) {
        this.h();
        this.y.g(v, v1);
    }

    public void L(androidx.appcompat.view.menu.e e0, ActionMenuPresenter actionMenuPresenter0) {
        if(e0 == null && this.f == null) {
            return;
        }
        this.l();
        androidx.appcompat.view.menu.e e1 = this.f.N();
        if(e1 == e0) {
            return;
        }
        if(e1 != null) {
            e1.R(this.Q);
            e1.R(this.R);
        }
        if(this.R == null) {
            this.R = new f(this);
        }
        actionMenuPresenter0.I(true);
        if(e0 == null) {
            actionMenuPresenter0.h(this.o, null);
            this.R.h(this.o, null);
            actionMenuPresenter0.c(true);
            this.R.c(true);
        }
        else {
            e0.c(actionMenuPresenter0, this.o);
            e0.c(this.R, this.o);
        }
        this.f.setPopupTheme(this.p);
        this.f.setPresenter(actionMenuPresenter0);
        this.Q = actionMenuPresenter0;
        this.S();
    }

    public void M(androidx.appcompat.view.menu.j.a j$a0, androidx.appcompat.view.menu.e.a e$a0) {
        this.S = j$a0;
        this.T = e$a0;
        ActionMenuView actionMenuView0 = this.f;
        if(actionMenuView0 != null) {
            actionMenuView0.O(j$a0, e$a0);
        }
    }

    public void N(Context context0, int v) {
        this.r = v;
        TextView textView0 = this.h;
        if(textView0 != null) {
            textView0.setTextAppearance(context0, v);
        }
    }

    public void O(Context context0, int v) {
        this.q = v;
        TextView textView0 = this.g;
        if(textView0 != null) {
            textView0.setTextAppearance(context0, v);
        }
    }

    private boolean P() {
        if(!this.U) {
            return false;
        }
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(this.Q(view0) && view0.getMeasuredWidth() > 0 && view0.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean Q(View view0) {
        return view0 != null && view0.getParent() == this && view0.getVisibility() != 8;
    }

    // 检测为 Lambda 实现
    public boolean R() [...]

    void S() {
        if(Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = androidx.appcompat.widget.Toolbar.e.a(this);
            boolean z = this.w() && onBackInvokedDispatcher0 != null && this.isAttachedToWindow() && this.a0;
            if(z && this.W == null) {
                if(this.V == null) {
                    this.V = androidx.appcompat.widget.Toolbar.e.b(() -> {
                        g g0 = this.R == null ? null : this.R.g;
                        if(g0 != null) {
                            g0.collapseActionView();
                        }
                    });
                }
                androidx.appcompat.widget.Toolbar.e.c(onBackInvokedDispatcher0, this.V);
                this.W = onBackInvokedDispatcher0;
                return;
            }
            if(!z) {
                OnBackInvokedDispatcher onBackInvokedDispatcher1 = this.W;
                if(onBackInvokedDispatcher1 != null) {
                    androidx.appcompat.widget.Toolbar.e.d(onBackInvokedDispatcher1, this.V);
                    this.W = null;
                }
            }
        }
    }

    void a() {
        for(int v = this.J.size() - 1; v >= 0; --v) {
            this.addView(((View)this.J.get(v)));
        }
        this.J.clear();
    }

    private void b(List list0, int v) {
        boolean z = this.getLayoutDirection() == 1;
        int v2 = this.getChildCount();
        int v3 = s.b(v, this.getLayoutDirection());
        list0.clear();
        if(z) {
            for(int v4 = v2 - 1; v4 >= 0; --v4) {
                View view0 = this.getChildAt(v4);
                androidx.appcompat.widget.Toolbar.g toolbar$g0 = (androidx.appcompat.widget.Toolbar.g)view0.getLayoutParams();
                if(toolbar$g0.b == 0 && this.Q(view0) && this.q(toolbar$g0.a) == v3) {
                    list0.add(view0);
                }
            }
            return;
        }
        for(int v1 = 0; v1 < v2; ++v1) {
            View view1 = this.getChildAt(v1);
            androidx.appcompat.widget.Toolbar.g toolbar$g1 = (androidx.appcompat.widget.Toolbar.g)view1.getLayoutParams();
            if(toolbar$g1.b == 0 && this.Q(view1) && this.q(toolbar$g1.a) == v3) {
                list0.add(view1);
            }
        }
    }

    private void c(View view0, boolean z) {
        androidx.appcompat.widget.Toolbar.g toolbar$g0;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            toolbar$g0 = this.n();
        }
        else {
            toolbar$g0 = this.checkLayoutParams(viewGroup$LayoutParams0) ? ((androidx.appcompat.widget.Toolbar.g)viewGroup$LayoutParams0) : this.p(viewGroup$LayoutParams0);
        }
        toolbar$g0.b = 1;
        if(z && this.n != null) {
            view0.setLayoutParams(toolbar$g0);
            this.J.add(view0);
            return;
        }
        this.addView(view0, toolbar$g0);
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return super.checkLayoutParams(viewGroup$LayoutParams0) && viewGroup$LayoutParams0 instanceof androidx.appcompat.widget.Toolbar.g;
    }

    public boolean d() {
        return this.getVisibility() == 0 && (this.f != null && this.f.K());
    }

    // 检测为 Lambda 实现
    public void e() [...]

    public void f() {
        ActionMenuView actionMenuView0 = this.f;
        if(actionMenuView0 != null) {
            actionMenuView0.B();
        }
    }

    void g() {
        class d implements View.OnClickListener {
            final Toolbar f;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                Toolbar.this.e();
            }
        }

        if(this.m == null) {
            o o0 = new o(this.getContext(), null, e.a.N);
            this.m = o0;
            o0.setImageDrawable(this.k);
            this.m.setContentDescription(this.l);
            androidx.appcompat.widget.Toolbar.g toolbar$g0 = this.n();
            toolbar$g0.a = this.s & 0x70 | 0x800003;
            toolbar$g0.b = 2;
            this.m.setLayoutParams(toolbar$g0);
            this.m.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
                g g0 = Toolbar.this.R == null ? null : Toolbar.this.R.g;
                if(g0 != null) {
                    g0.collapseActionView();
                }
            });
        }
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.n();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.o(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.p(viewGroup$LayoutParams0);
    }

    public CharSequence getCollapseContentDescription() {
        return this.m == null ? null : this.m.getContentDescription();
    }

    public Drawable getCollapseIcon() {
        return this.m == null ? null : this.m.getDrawable();
    }

    public int getContentInsetEnd() {
        return this.y == null ? 0 : this.y.a();
    }

    public int getContentInsetEndWithActions() {
        return this.A == 0x80000000 ? this.getContentInsetEnd() : this.A;
    }

    public int getContentInsetLeft() {
        return this.y == null ? 0 : this.y.b();
    }

    public int getContentInsetRight() {
        return this.y == null ? 0 : this.y.c();
    }

    public int getContentInsetStart() {
        return this.y == null ? 0 : this.y.d();
    }

    public int getContentInsetStartWithNavigation() {
        return this.z == 0x80000000 ? this.getContentInsetStart() : this.z;
    }

    public int getCurrentContentInsetEnd() {
        ActionMenuView actionMenuView0 = this.f;
        if(actionMenuView0 != null) {
            androidx.appcompat.view.menu.e e0 = actionMenuView0.N();
            return e0 == null || !e0.hasVisibleItems() ? this.getContentInsetEnd() : Math.max(this.getContentInsetEnd(), Math.max(this.A, 0));
        }
        return this.getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return this.getLayoutDirection() == 1 ? this.getCurrentContentInsetEnd() : this.getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return this.getLayoutDirection() == 1 ? this.getCurrentContentInsetStart() : this.getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return this.getNavigationIcon() == null ? this.getContentInsetStart() : Math.max(this.getContentInsetStart(), Math.max(this.z, 0));
    }

    private ArrayList getCurrentMenuItems() {
        ArrayList arrayList0 = new ArrayList();
        Menu menu0 = this.getMenu();
        for(int v = 0; v < menu0.size(); ++v) {
            arrayList0.add(menu0.getItem(v));
        }
        return arrayList0;
    }

    public Drawable getLogo() {
        return this.j == null ? null : this.j.getDrawable();
    }

    public CharSequence getLogoDescription() {
        return this.j == null ? null : this.j.getContentDescription();
    }

    public Menu getMenu() {
        this.j();
        return this.f.getMenu();
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(this.getContext());
    }

    View getNavButtonView() {
        return this.i;
    }

    public CharSequence getNavigationContentDescription() {
        return this.i == null ? null : this.i.getContentDescription();
    }

    public Drawable getNavigationIcon() {
        return this.i == null ? null : this.i.getDrawable();
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.Q;
    }

    public Drawable getOverflowIcon() {
        this.j();
        return this.f.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.o;
    }

    public int getPopupTheme() {
        return this.p;
    }

    public CharSequence getSubtitle() {
        return this.D;
    }

    final TextView getSubtitleTextView() {
        return this.h;
    }

    public CharSequence getTitle() {
        return this.C;
    }

    public int getTitleMarginBottom() {
        return this.x;
    }

    public int getTitleMarginEnd() {
        return this.v;
    }

    public int getTitleMarginStart() {
        return this.u;
    }

    public int getTitleMarginTop() {
        return this.w;
    }

    final TextView getTitleTextView() {
        return this.g;
    }

    public G getWrapper() {
        if(this.P == null) {
            this.P = new g0(this, true);
        }
        return this.P;
    }

    private void h() {
        if(this.y == null) {
            this.y = new V();
        }
    }

    @Override  // androidx.core.view.w
    public void h0(z z0) {
        this.L.a(z0);
    }

    private void i() {
        if(this.j == null) {
            this.j = new AppCompatImageView(this.getContext());
        }
    }

    private void j() {
        this.l();
        if(this.f.N() == null) {
            androidx.appcompat.view.menu.e e0 = (androidx.appcompat.view.menu.e)this.f.getMenu();
            if(this.R == null) {
                this.R = new f(this);
            }
            this.f.setExpandedActionViewsExclusive(true);
            e0.c(this.R, this.o);
            this.S();
        }
    }

    @Override  // androidx.core.view.w
    public void k(z z0) {
        this.L.f(z0);
    }

    private void l() {
        class androidx.appcompat.widget.Toolbar.c implements androidx.appcompat.view.menu.e.a {
            final Toolbar f;

            @Override  // androidx.appcompat.view.menu.e$a
            public boolean a(androidx.appcompat.view.menu.e e0, MenuItem menuItem0) {
                androidx.appcompat.view.menu.e.a e$a0 = Toolbar.this.T;
                return e$a0 != null && e$a0.a(e0, menuItem0);
            }

            @Override  // androidx.appcompat.view.menu.e$a
            public void b(androidx.appcompat.view.menu.e e0) {
                if(!Toolbar.this.f.J()) {
                    Toolbar.this.L.e(e0);
                }
                androidx.appcompat.view.menu.e.a e$a0 = Toolbar.this.T;
                if(e$a0 != null) {
                    e$a0.b(e0);
                }
            }
        }

        if(this.f == null) {
            ActionMenuView actionMenuView0 = new ActionMenuView(this.getContext());
            this.f = actionMenuView0;
            actionMenuView0.setPopupTheme(this.p);
            this.f.setOnMenuItemClickListener(this.O);
            this.f.O(this.S, new androidx.appcompat.widget.Toolbar.c(this));
            androidx.appcompat.widget.Toolbar.g toolbar$g0 = this.n();
            toolbar$g0.a = this.s & 0x70 | 0x800005;
            this.f.setLayoutParams(toolbar$g0);
            this.c(this.f, false);
        }
    }

    private void m() {
        if(this.i == null) {
            this.i = new o(this.getContext(), null, e.a.N);
            androidx.appcompat.widget.Toolbar.g toolbar$g0 = this.n();
            toolbar$g0.a = this.s & 0x70 | 0x800003;
            this.i.setLayoutParams(toolbar$g0);
        }
    }

    protected androidx.appcompat.widget.Toolbar.g n() {
        return new androidx.appcompat.widget.Toolbar.g(-2, -2);
    }

    public androidx.appcompat.widget.Toolbar.g o(AttributeSet attributeSet0) {
        return new androidx.appcompat.widget.Toolbar.g(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.b0);
        this.S();
    }

    @Override  // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 9) {
            this.H = false;
        }
        if(!this.H && (v == 9 && !super.onHoverEvent(motionEvent0))) {
            this.H = true;
        }
        if(v == 3 || v == 10) {
            this.H = false;
        }
        return true;
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v43;
        int v39;
        int v35;
        int v34;
        int v30;
        int v26;
        int v23;
        int v19;
        int v14;
        int v13;
        boolean z1 = this.getLayoutDirection() == 1;
        int v4 = this.getWidth();
        int v5 = this.getHeight();
        int v6 = this.getPaddingLeft();
        int v7 = this.getPaddingRight();
        int v8 = this.getPaddingTop();
        int v9 = this.getPaddingBottom();
        int v10 = v4 - v7;
        int[] arr_v = this.K;
        arr_v[1] = 0;
        arr_v[0] = 0;
        int v11 = Y.A(this);
        int v12 = v11 < 0 ? 0 : Math.min(v11, v3 - v1);
        if(!this.Q(this.i)) {
            v14 = v6;
            v13 = v10;
        }
        else if(z1) {
            v13 = this.E(this.i, v10, arr_v, v12);
            v14 = v6;
        }
        else {
            v14 = this.D(this.i, v6, arr_v, v12);
            v13 = v10;
        }
        if(this.Q(this.m)) {
            if(z1) {
                v13 = this.E(this.m, v13, arr_v, v12);
            }
            else {
                v14 = this.D(this.m, v14, arr_v, v12);
            }
        }
        if(this.Q(this.f)) {
            if(z1) {
                v14 = this.D(this.f, v14, arr_v, v12);
            }
            else {
                v13 = this.E(this.f, v13, arr_v, v12);
            }
        }
        int v15 = this.getCurrentContentInsetLeft();
        int v16 = this.getCurrentContentInsetRight();
        arr_v[0] = Math.max(0, v15 - v14);
        arr_v[1] = Math.max(0, v16 - (v10 - v13));
        int v17 = Math.max(v14, v15);
        int v18 = Math.min(v13, v10 - v16);
        if(this.Q(this.n)) {
            if(z1) {
                v18 = this.E(this.n, v18, arr_v, v12);
            }
            else {
                v17 = this.D(this.n, v17, arr_v, v12);
            }
        }
        if(this.Q(this.j)) {
            if(z1) {
                v18 = this.E(this.j, v18, arr_v, v12);
            }
            else {
                v17 = this.D(this.j, v17, arr_v, v12);
            }
        }
        boolean z2 = this.Q(this.g);
        boolean z3 = this.Q(this.h);
        if(z2) {
            androidx.appcompat.widget.Toolbar.g toolbar$g0 = (androidx.appcompat.widget.Toolbar.g)this.g.getLayoutParams();
            v19 = toolbar$g0.topMargin + this.g.getMeasuredHeight() + toolbar$g0.bottomMargin;
        }
        else {
            v19 = 0;
        }
        if(z3) {
            androidx.appcompat.widget.Toolbar.g toolbar$g1 = (androidx.appcompat.widget.Toolbar.g)this.h.getLayoutParams();
            v19 += toolbar$g1.topMargin + this.h.getMeasuredHeight() + toolbar$g1.bottomMargin;
        }
        if(z2 || z3) {
            TextView textView0 = z3 ? this.h : this.g;
            androidx.appcompat.widget.Toolbar.g toolbar$g2 = (androidx.appcompat.widget.Toolbar.g)(z2 ? this.g : this.h).getLayoutParams();
            androidx.appcompat.widget.Toolbar.g toolbar$g3 = (androidx.appcompat.widget.Toolbar.g)textView0.getLayoutParams();
            boolean z4 = z2 && this.g.getMeasuredWidth() > 0 || z3 && this.h.getMeasuredWidth() > 0;
            switch(this.B & 0x70) {
                case 0x30: {
                    v23 = v17;
                    v26 = this.getPaddingTop() + toolbar$g2.topMargin + this.w;
                    break;
                }
                case 80: {
                    v23 = v17;
                    v26 = v5 - v9 - toolbar$g3.bottomMargin - this.x - v19;
                    break;
                }
                default: {
                    int v20 = (v5 - v8 - v9 - v19) / 2;
                    int v21 = toolbar$g2.topMargin;
                    int v22 = this.w;
                    v23 = v17;
                    if(v20 < v21 + v22) {
                        v20 = v21 + v22;
                    }
                    else {
                        int v24 = v5 - v9 - v19 - v20 - v8;
                        int v25 = this.x;
                        if(v24 < toolbar$g2.bottomMargin + v25) {
                            v20 = Math.max(0, v20 - (toolbar$g3.bottomMargin + v25 - v24));
                        }
                    }
                    v26 = v8 + v20;
                }
            }
            if(z1) {
                int v27 = (z4 ? this.u : 0) - arr_v[1];
                v18 -= Math.max(0, v27);
                arr_v[1] = Math.max(0, -v27);
                if(z2) {
                    androidx.appcompat.widget.Toolbar.g toolbar$g4 = (androidx.appcompat.widget.Toolbar.g)this.g.getLayoutParams();
                    int v28 = v18 - this.g.getMeasuredWidth();
                    int v29 = this.g.getMeasuredHeight() + v26;
                    this.g.layout(v28, v26, v18, v29);
                    v30 = v28 - this.v;
                    v26 = v29 + toolbar$g4.bottomMargin;
                }
                else {
                    v30 = v18;
                }
                if(z3) {
                    int v31 = v26 + ((androidx.appcompat.widget.Toolbar.g)this.h.getLayoutParams()).topMargin;
                    int v32 = this.h.getMeasuredWidth();
                    int v33 = this.h.getMeasuredHeight();
                    this.h.layout(v18 - v32, v31, v18, v33 + v31);
                    v34 = v18 - this.v;
                }
                else {
                    v34 = v18;
                }
                if(z4) {
                    v18 = Math.min(v30, v34);
                }
                v17 = v23;
                v35 = 0;
            }
            else {
                v35 = 0;
                int v36 = (z4 ? this.u : 0) - arr_v[0];
                v17 = v23 + Math.max(0, v36);
                arr_v[0] = Math.max(0, -v36);
                if(z2) {
                    androidx.appcompat.widget.Toolbar.g toolbar$g5 = (androidx.appcompat.widget.Toolbar.g)this.g.getLayoutParams();
                    int v37 = this.g.getMeasuredWidth() + v17;
                    int v38 = this.g.getMeasuredHeight() + v26;
                    this.g.layout(v17, v26, v37, v38);
                    v39 = v37 + this.v;
                    v26 = v38 + toolbar$g5.bottomMargin;
                }
                else {
                    v39 = v17;
                }
                if(z3) {
                    int v40 = v26 + ((androidx.appcompat.widget.Toolbar.g)this.h.getLayoutParams()).topMargin;
                    int v41 = this.h.getMeasuredWidth() + v17;
                    int v42 = this.h.getMeasuredHeight();
                    this.h.layout(v17, v40, v41, v42 + v40);
                    v43 = v41 + this.v;
                }
                else {
                    v43 = v17;
                }
                if(z4) {
                    v17 = Math.max(v39, v43);
                }
            }
        }
        else {
            v35 = 0;
        }
        this.b(this.I, 3);
        int v44 = this.I.size();
        int v45 = v17;
        for(int v46 = 0; v46 < v44; ++v46) {
            v45 = this.D(((View)this.I.get(v46)), v45, arr_v, v12);
        }
        this.b(this.I, 5);
        int v47 = this.I.size();
        for(int v48 = 0; v48 < v47; ++v48) {
            v18 = this.E(((View)this.I.get(v48)), v18, arr_v, v12);
        }
        this.b(this.I, 1);
        int v49 = this.v(this.I, arr_v);
        int v50 = v6 + (v4 - v6 - v7) / 2 - v49 / 2;
        int v51 = v49 + v50;
        if(v50 >= v45) {
            v45 = v51 <= v18 ? v50 : v50 - (v51 - v18);
        }
        int v52 = this.I.size();
        while(v35 < v52) {
            v45 = this.D(((View)this.I.get(v35)), v45, arr_v, v12);
            ++v35;
        }
        this.I.clear();
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v19;
        int v18;
        int v17;
        int v8;
        int v5;
        int v4;
        int v3;
        int[] arr_v = this.K;
        boolean z = n0.b(this);
        int v2 = 0;
        if(this.Q(this.i)) {
            this.G(this.i, v, 0, v1, 0, this.t);
            v3 = this.i.getMeasuredWidth() + this.t(this.i);
            v4 = Math.max(0, this.i.getMeasuredHeight() + this.u(this.i));
            v5 = View.combineMeasuredStates(0, this.i.getMeasuredState());
        }
        else {
            v3 = 0;
            v4 = 0;
            v5 = 0;
        }
        if(this.Q(this.m)) {
            this.G(this.m, v, 0, v1, 0, this.t);
            v3 = this.m.getMeasuredWidth() + this.t(this.m);
            v4 = Math.max(v4, this.m.getMeasuredHeight() + this.u(this.m));
            v5 = View.combineMeasuredStates(v5, this.m.getMeasuredState());
        }
        int v6 = this.getCurrentContentInsetStart();
        int v7 = Math.max(v6, v3);
        arr_v[z] = Math.max(0, v6 - v3);
        if(this.Q(this.f)) {
            this.G(this.f, v, v7, v1, 0, this.t);
            v8 = this.f.getMeasuredWidth() + this.t(this.f);
            v4 = Math.max(v4, this.f.getMeasuredHeight() + this.u(this.f));
            v5 = View.combineMeasuredStates(v5, this.f.getMeasuredState());
        }
        else {
            v8 = 0;
        }
        int v9 = this.getCurrentContentInsetEnd();
        int v10 = v7 + Math.max(v9, v8);
        arr_v[!z] = Math.max(0, v9 - v8);
        if(this.Q(this.n)) {
            v10 += this.F(this.n, v, v10, v1, 0, arr_v);
            v4 = Math.max(v4, this.n.getMeasuredHeight() + this.u(this.n));
            v5 = View.combineMeasuredStates(v5, this.n.getMeasuredState());
        }
        if(this.Q(this.j)) {
            v10 += this.F(this.j, v, v10, v1, 0, arr_v);
            v4 = Math.max(v4, this.j.getMeasuredHeight() + this.u(this.j));
            v5 = View.combineMeasuredStates(v5, this.j.getMeasuredState());
        }
        int v11 = this.getChildCount();
        for(int v12 = 0; v12 < v11; ++v12) {
            View view0 = this.getChildAt(v12);
            if(((androidx.appcompat.widget.Toolbar.g)view0.getLayoutParams()).b == 0 && this.Q(view0)) {
                v10 += this.F(view0, v, v10, v1, 0, arr_v);
                v4 = Math.max(v4, view0.getMeasuredHeight() + this.u(view0));
                v5 = View.combineMeasuredStates(v5, view0.getMeasuredState());
            }
        }
        int v13 = this.w + this.x;
        int v14 = this.u + this.v;
        if(this.Q(this.g)) {
            this.F(this.g, v, v10 + v14, v1, v13, arr_v);
            int v15 = this.g.getMeasuredWidth();
            int v16 = this.t(this.g);
            v17 = this.g.getMeasuredHeight() + this.u(this.g);
            v18 = View.combineMeasuredStates(v5, this.g.getMeasuredState());
            v19 = v15 + v16;
        }
        else {
            v17 = 0;
            v18 = v5;
            v19 = 0;
        }
        if(this.Q(this.h)) {
            v19 = Math.max(v19, this.F(this.h, v, v10 + v14, v1, v17 + v13, arr_v));
            v17 += this.h.getMeasuredHeight() + this.u(this.h);
            v18 = View.combineMeasuredStates(v18, this.h.getMeasuredState());
        }
        int v20 = this.getPaddingLeft();
        int v21 = this.getPaddingRight();
        int v22 = this.getPaddingTop();
        int v23 = this.getPaddingBottom();
        int v24 = View.resolveSizeAndState(Math.max(v10 + v19 + (v20 + v21), this.getSuggestedMinimumWidth()), v, 0xFF000000 & v18);
        int v25 = View.resolveSizeAndState(Math.max(Math.max(v4, v17) + (v22 + v23), this.getSuggestedMinimumHeight()), v1, v18 << 16);
        if(!this.P()) {
            v2 = v25;
        }
        this.setMeasuredDimension(v24, v2);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        androidx.appcompat.view.menu.e e0 = this.f == null ? null : this.f.N();
        int v = ((SavedState)parcelable0).h;
        if(v != 0 && this.R != null && e0 != null) {
            MenuItem menuItem0 = e0.findItem(v);
            if(menuItem0 != null) {
                menuItem0.expandActionView();
            }
        }
        if(((SavedState)parcelable0).i) {
            this.I();
        }
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        super.onRtlPropertiesChanged(v);
        this.h();
        this.y.f(v == 1);
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        f toolbar$f0 = this.R;
        if(toolbar$f0 != null) {
            g g0 = toolbar$f0.g;
            if(g0 != null) {
                parcelable0.h = g0.getItemId();
            }
        }
        parcelable0.i = this.C();
        return parcelable0;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.G = false;
        }
        if(!this.G && (v == 0 && !super.onTouchEvent(motionEvent0))) {
            this.G = true;
        }
        if(v == 1 || v == 3) {
            this.G = false;
        }
        return true;
    }

    protected androidx.appcompat.widget.Toolbar.g p(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof androidx.appcompat.widget.Toolbar.g) {
            return new androidx.appcompat.widget.Toolbar.g(((androidx.appcompat.widget.Toolbar.g)viewGroup$LayoutParams0));
        }
        if(viewGroup$LayoutParams0 instanceof androidx.appcompat.app.a.a) {
            return new androidx.appcompat.widget.Toolbar.g(((androidx.appcompat.app.a.a)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new androidx.appcompat.widget.Toolbar.g(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new androidx.appcompat.widget.Toolbar.g(viewGroup$LayoutParams0);
    }

    private int q(int v) {
        int v1 = this.getLayoutDirection();
        int v2 = s.b(v, v1);
        if((v2 & 7) != 1 && (v2 & 7) != 3 && (v2 & 7) != 5) {
            return v1 == 1 ? 5 : 3;
        }
        return v2 & 7;
    }

    private int r(View view0, int v) {
        androidx.appcompat.widget.Toolbar.g toolbar$g0 = (androidx.appcompat.widget.Toolbar.g)view0.getLayoutParams();
        int v1 = view0.getMeasuredHeight();
        int v2 = v <= 0 ? 0 : (v1 - v) / 2;
        switch(this.s(toolbar$g0.a)) {
            case 0x30: {
                return this.getPaddingTop() - v2;
            }
            case 80: {
                return this.getHeight() - this.getPaddingBottom() - v1 - toolbar$g0.bottomMargin - v2;
            }
            default: {
                int v3 = this.getPaddingTop();
                int v4 = this.getPaddingBottom();
                int v5 = this.getHeight();
                int v6 = (v5 - v3 - v4 - v1) / 2;
                int v7 = toolbar$g0.topMargin;
                if(v6 < v7) {
                    return v3 + v7;
                }
                int v8 = v5 - v4 - v1 - v6 - v3;
                int v9 = toolbar$g0.bottomMargin;
                if(v8 < v9) {
                    v6 = Math.max(0, v6 - (v9 - v8));
                }
                return v3 + v6;
            }
        }
    }

    private int s(int v) {
        int v1 = v & 0x70;
        return v1 == 16 || v1 == 0x30 || v1 == 80 ? v1 : this.B & 0x70;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if(this.a0 != z) {
            this.a0 = z;
            this.S();
        }
    }

    public void setCollapseContentDescription(int v) {
        this.setCollapseContentDescription((v == 0 ? null : this.getContext().getText(v)));
    }

    public void setCollapseContentDescription(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            this.g();
        }
        ImageButton imageButton0 = this.m;
        if(imageButton0 != null) {
            imageButton0.setContentDescription(charSequence0);
        }
    }

    public void setCollapseIcon(int v) {
        this.setCollapseIcon(f.a.b(this.getContext(), v));
    }

    public void setCollapseIcon(Drawable drawable0) {
        if(drawable0 != null) {
            this.g();
            this.m.setImageDrawable(drawable0);
            return;
        }
        ImageButton imageButton0 = this.m;
        if(imageButton0 != null) {
            imageButton0.setImageDrawable(this.k);
        }
    }

    public void setCollapsible(boolean z) {
        this.U = z;
        this.requestLayout();
    }

    public void setContentInsetEndWithActions(int v) {
        if(v < 0) {
            v = 0x80000000;
        }
        if(v != this.A) {
            this.A = v;
            if(this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int v) {
        if(v < 0) {
            v = 0x80000000;
        }
        if(v != this.z) {
            this.z = v;
            if(this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }

    public void setLogo(int v) {
        this.setLogo(f.a.b(this.getContext(), v));
    }

    public void setLogo(Drawable drawable0) {
        if(drawable0 != null) {
            this.i();
            if(!this.A(this.j)) {
                this.c(this.j, true);
            }
        }
        else if(this.j != null && this.A(this.j)) {
            this.removeView(this.j);
            this.J.remove(this.j);
        }
        ImageView imageView0 = this.j;
        if(imageView0 != null) {
            imageView0.setImageDrawable(drawable0);
        }
    }

    public void setLogoDescription(int v) {
        this.setLogoDescription(this.getContext().getText(v));
    }

    public void setLogoDescription(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            this.i();
        }
        ImageView imageView0 = this.j;
        if(imageView0 != null) {
            imageView0.setContentDescription(charSequence0);
        }
    }

    public void setNavigationContentDescription(int v) {
        this.setNavigationContentDescription((v == 0 ? null : this.getContext().getText(v)));
    }

    public void setNavigationContentDescription(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            this.m();
        }
        ImageButton imageButton0 = this.i;
        if(imageButton0 != null) {
            imageButton0.setContentDescription(charSequence0);
            h0.a(this.i, charSequence0);
        }
    }

    public void setNavigationIcon(int v) {
        this.setNavigationIcon(f.a.b(this.getContext(), v));
    }

    public void setNavigationIcon(Drawable drawable0) {
        if(drawable0 != null) {
            this.m();
            if(!this.A(this.i)) {
                this.c(this.i, true);
            }
        }
        else if(this.i != null && this.A(this.i)) {
            this.removeView(this.i);
            this.J.remove(this.i);
        }
        ImageButton imageButton0 = this.i;
        if(imageButton0 != null) {
            imageButton0.setImageDrawable(drawable0);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.m();
        this.i.setOnClickListener(view$OnClickListener0);
    }

    public void setOnMenuItemClickListener(h toolbar$h0) {
        this.N = toolbar$h0;
    }

    public void setOverflowIcon(Drawable drawable0) {
        this.j();
        this.f.setOverflowIcon(drawable0);
    }

    public void setPopupTheme(int v) {
        if(this.p != v) {
            this.p = v;
            if(v == 0) {
                this.o = this.getContext();
                return;
            }
            this.o = new ContextThemeWrapper(this.getContext(), v);
        }
    }

    public void setSubtitle(int v) {
        this.setSubtitle(this.getContext().getText(v));
    }

    public void setSubtitle(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            if(this.h == null) {
                Context context0 = this.getContext();
                A a0 = new A(context0);
                this.h = a0;
                a0.setSingleLine();
                this.h.setEllipsize(TextUtils.TruncateAt.END);
                int v = this.r;
                if(v != 0) {
                    this.h.setTextAppearance(context0, v);
                }
                ColorStateList colorStateList0 = this.F;
                if(colorStateList0 != null) {
                    this.h.setTextColor(colorStateList0);
                }
            }
            if(!this.A(this.h)) {
                this.c(this.h, true);
            }
        }
        else if(this.h != null && this.A(this.h)) {
            this.removeView(this.h);
            this.J.remove(this.h);
        }
        TextView textView0 = this.h;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
        this.D = charSequence0;
    }

    public void setSubtitleTextColor(int v) {
        this.setSubtitleTextColor(ColorStateList.valueOf(v));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList0) {
        this.F = colorStateList0;
        TextView textView0 = this.h;
        if(textView0 != null) {
            textView0.setTextColor(colorStateList0);
        }
    }

    public void setTitle(int v) {
        this.setTitle(this.getContext().getText(v));
    }

    public void setTitle(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            if(this.g == null) {
                Context context0 = this.getContext();
                A a0 = new A(context0);
                this.g = a0;
                a0.setSingleLine();
                this.g.setEllipsize(TextUtils.TruncateAt.END);
                int v = this.q;
                if(v != 0) {
                    this.g.setTextAppearance(context0, v);
                }
                ColorStateList colorStateList0 = this.E;
                if(colorStateList0 != null) {
                    this.g.setTextColor(colorStateList0);
                }
            }
            if(!this.A(this.g)) {
                this.c(this.g, true);
            }
        }
        else if(this.g != null && this.A(this.g)) {
            this.removeView(this.g);
            this.J.remove(this.g);
        }
        TextView textView0 = this.g;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
        this.C = charSequence0;
    }

    public void setTitleMarginBottom(int v) {
        this.x = v;
        this.requestLayout();
    }

    public void setTitleMarginEnd(int v) {
        this.v = v;
        this.requestLayout();
    }

    public void setTitleMarginStart(int v) {
        this.u = v;
        this.requestLayout();
    }

    public void setTitleMarginTop(int v) {
        this.w = v;
        this.requestLayout();
    }

    public void setTitleTextColor(int v) {
        this.setTitleTextColor(ColorStateList.valueOf(v));
    }

    public void setTitleTextColor(ColorStateList colorStateList0) {
        this.E = colorStateList0;
        TextView textView0 = this.g;
        if(textView0 != null) {
            textView0.setTextColor(colorStateList0);
        }
    }

    private int t(View view0) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        return viewGroup$MarginLayoutParams0.getMarginStart() + viewGroup$MarginLayoutParams0.getMarginEnd();
    }

    private int u(View view0) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        return viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin;
    }

    private int v(List list0, int[] arr_v) {
        int v = arr_v[0];
        int v1 = arr_v[1];
        int v2 = list0.size();
        int v3 = 0;
        int v4 = 0;
        while(v3 < v2) {
            View view0 = (View)list0.get(v3);
            androidx.appcompat.widget.Toolbar.g toolbar$g0 = (androidx.appcompat.widget.Toolbar.g)view0.getLayoutParams();
            int v5 = toolbar$g0.leftMargin - v;
            int v6 = toolbar$g0.rightMargin - v1;
            v4 += Math.max(0, v5) + view0.getMeasuredWidth() + Math.max(0, v6);
            ++v3;
            v1 = Math.max(0, -v6);
            v = Math.max(0, -v5);
        }
        return v4;
    }

    public boolean w() {
        return this.R != null && this.R.g != null;
    }

    public boolean x() {
        return this.f != null && this.f.H();
    }

    public void y(int v) {
        this.getMenuInflater().inflate(v, this.getMenu());
    }

    // 检测为 Lambda 实现
    public void z() [...]
}

