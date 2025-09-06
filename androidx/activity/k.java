package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.N;
import androidx.lifecycle.h;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.savedstate.a;
import j0.c;
import j0.d;
import j0.e;

public class k extends Dialog implements x, n, d {
    private o f;
    private final c g;
    private final OnBackPressedDispatcher h;

    public k(Context context0, int v) {
        z3.k.e(context0, "context");
        super(context0, v);
        this.g = c.d.a(this);
        this.h = new OnBackPressedDispatcher(() -> {
            z3.k.e(this, "this$0");
            this.super.onBackPressed();
        });
    }

    @Override  // android.app.Dialog
    public void addContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        z3.k.e(view0, "view");
        this.c();
        super.addContentView(view0, viewGroup$LayoutParams0);
    }

    private final o b() {
        o o0 = this.f;
        if(o0 == null) {
            o0 = new o(this);
            this.f = o0;
        }
        return o0;
    }

    public void c() {
        Window window0 = this.getWindow();
        z3.k.b(window0);
        View view0 = window0.getDecorView();
        z3.k.d(view0, "window!!.decorView");
        N.a(view0, this);
        Window window1 = this.getWindow();
        z3.k.b(window1);
        View view1 = window1.getDecorView();
        z3.k.d(view1, "window!!.decorView");
        B.a(view1, this);
        Window window2 = this.getWindow();
        z3.k.b(window2);
        View view2 = window2.getDecorView();
        z3.k.d(view2, "window!!.decorView");
        e.a(view2, this);
    }

    // 检测为 Lambda 实现
    private static final void d(k k0) [...]

    @Override  // androidx.activity.x
    public final OnBackPressedDispatcher f() {
        return this.h;
    }

    @Override  // androidx.lifecycle.n
    public h getLifecycle() {
        return this.b();
    }

    @Override  // j0.d
    public a getSavedStateRegistry() {
        return this.g.b();
    }

    @Override  // android.app.Dialog
    public void onBackPressed() {
        this.h.k();
    }

    @Override  // android.app.Dialog
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = this.getOnBackInvokedDispatcher();
            z3.k.d(onBackInvokedDispatcher0, "onBackInvokedDispatcher");
            this.h.n(onBackInvokedDispatcher0);
        }
        this.g.d(bundle0);
        this.b().h(androidx.lifecycle.h.a.ON_CREATE);
    }

    @Override  // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundle0 = super.onSaveInstanceState();
        z3.k.d(bundle0, "super.onSaveInstanceState()");
        this.g.e(bundle0);
        return bundle0;
    }

    @Override  // android.app.Dialog
    protected void onStart() {
        super.onStart();
        this.b().h(androidx.lifecycle.h.a.ON_RESUME);
    }

    @Override  // android.app.Dialog
    protected void onStop() {
        this.b().h(androidx.lifecycle.h.a.ON_DESTROY);
        this.f = null;
        super.onStop();
    }

    @Override  // android.app.Dialog
    public void setContentView(int v) {
        this.c();
        super.setContentView(v);
    }

    @Override  // android.app.Dialog
    public void setContentView(View view0) {
        z3.k.e(view0, "view");
        this.c();
        super.setContentView(view0);
    }

    @Override  // android.app.Dialog
    public void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        z3.k.e(view0, "view");
        this.c();
        super.setContentView(view0, viewGroup$LayoutParams0);
    }
}

