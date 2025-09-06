package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.Y;
import androidx.core.view.c0;

class k0 implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {
    private final View f;
    private final CharSequence g;
    private final int h;
    private final Runnable i;
    private final Runnable j;
    private int k;
    private int l;
    private l0 m;
    private boolean n;
    private boolean o;
    private static k0 p;
    private static k0 q;

    private k0(View view0, CharSequence charSequence0) {
        this.i = () -> this.i(false);
        this.j = () -> {
            if(k0.q == this) {
                k0.q = null;
                l0 l00 = this.m;
                if(l00 == null) {
                    Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
                }
                else {
                    l00.c();
                    this.m = null;
                    this.c();
                    this.f.removeOnAttachStateChangeListener(this);
                }
            }
            if(k0.p == this) {
                k0.g(null);
            }
            this.f.removeCallbacks(this.j);
        };
        this.f = view0;
        this.g = charSequence0;
        this.h = c0.g(ViewConfiguration.get(view0.getContext()));
        this.c();
        view0.setOnLongClickListener(this);
        view0.setOnHoverListener(this);
    }

    private void b() {
        this.f.removeCallbacks(this.i);
    }

    private void c() {
        this.o = true;
    }

    // 检测为 Lambda 实现
    void d() [...]

    // 检测为 Lambda 实现
    private void e() [...]

    private void f() {
        long v = (long)ViewConfiguration.getLongPressTimeout();
        this.f.postDelayed(this.i, v);
    }

    private static void g(k0 k00) {
        k0 k01 = k0.p;
        if(k01 != null) {
            k01.b();
        }
        k0.p = k00;
        if(k00 != null) {
            k00.f();
        }
    }

    public static void h(View view0, CharSequence charSequence0) {
        if(k0.p != null && k0.p.f == view0) {
            k0.g(null);
        }
        if(TextUtils.isEmpty(charSequence0)) {
            k0 k00 = k0.q;
            if(k00 != null && k00.f == view0) {
                k00.d();
            }
            view0.setOnLongClickListener(null);
            view0.setLongClickable(false);
            view0.setOnHoverListener(null);
            return;
        }
        new k0(view0, charSequence0);
    }

    void i(boolean z) {
        long v2;
        long v1;
        long v;
        if(!this.f.isAttachedToWindow()) {
            return;
        }
        k0.g(null);
        k0 k00 = k0.q;
        if(k00 != null) {
            k00.d();
        }
        k0.q = this;
        this.n = z;
        l0 l00 = new l0(this.f.getContext());
        this.m = l00;
        l00.e(this.f, this.k, this.l, this.n, this.g);
        this.f.addOnAttachStateChangeListener(this);
        if(this.n) {
            v = 2500L;
        }
        else {
            if((Y.L(this.f) & 1) == 1) {
                v1 = (long)ViewConfiguration.getLongPressTimeout();
                v2 = 3000L;
            }
            else {
                v1 = (long)ViewConfiguration.getLongPressTimeout();
                v2 = 15000L;
            }
            v = v2 - v1;
        }
        this.f.removeCallbacks(this.j);
        this.f.postDelayed(this.j, v);
    }

    private boolean j(MotionEvent motionEvent0) {
        int v = (int)motionEvent0.getX();
        int v1 = (int)motionEvent0.getY();
        if(!this.o && Math.abs(v - this.k) <= this.h && Math.abs(v1 - this.l) <= this.h) {
            return false;
        }
        this.k = v;
        this.l = v1;
        this.o = false;
        return true;
    }

    @Override  // android.view.View$OnHoverListener
    public boolean onHover(View view0, MotionEvent motionEvent0) {
        if(this.m != null && this.n) {
            return false;
        }
        AccessibilityManager accessibilityManager0 = (AccessibilityManager)this.f.getContext().getSystemService("accessibility");
        if(accessibilityManager0.isEnabled() && accessibilityManager0.isTouchExplorationEnabled()) {
            return false;
        }
        switch(motionEvent0.getAction()) {
            case 7: {
                if(this.f.isEnabled() && this.m == null && this.j(motionEvent0)) {
                    k0.g(this);
                }
                return false;
            }
            case 10: {
                this.c();
                this.d();
                return false;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // android.view.View$OnLongClickListener
    public boolean onLongClick(View view0) {
        this.k = view0.getWidth() / 2;
        this.l = view0.getHeight() / 2;
        this.i(true);
        return true;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view0) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view0) {
        this.d();
    }
}

