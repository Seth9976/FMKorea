package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.activity.B;
import androidx.activity.k;
import androidx.appcompat.view.b;
import androidx.core.view.t.a;
import androidx.core.view.t;
import androidx.lifecycle.N;

public abstract class y extends k implements e {
    private g i;
    private final a j;

    public y(Context context0, int v) {
        super(context0, y.g(context0, v));
        this.j = (KeyEvent keyEvent0) -> super.dispatchKeyEvent(keyEvent0);
        g g0 = this.e();
        g0.R(y.g(context0, v));
        g0.A(null);
    }

    @Override  // androidx.appcompat.app.e
    public b M(androidx.appcompat.view.b.a b$a0) {
        return null;
    }

    @Override  // androidx.activity.k
    public void addContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.e().e(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Dialog
    public void dismiss() {
        super.dismiss();
        this.e().B();
    }

    @Override  // android.app.Dialog
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        View view0 = this.getWindow().getDecorView();
        return t.e(this.j, view0, this, keyEvent0);
    }

    public g e() {
        if(this.i == null) {
            this.i = g.k(this, this);
        }
        return this.i;
    }

    @Override  // android.app.Dialog
    public View findViewById(int v) {
        return this.e().l(v);
    }

    private static int g(Context context0, int v) {
        if(v == 0) {
            TypedValue typedValue0 = new TypedValue();
            context0.getTheme().resolveAttribute(e.a.x, typedValue0, true);
            return typedValue0.resourceId;
        }
        return v;
    }

    private void h() {
        N.a(this.getWindow().getDecorView(), this);
        j0.e.a(this.getWindow().getDecorView(), this);
        B.a(this.getWindow().getDecorView(), this);
    }

    // 检测为 Lambda 实现
    boolean i(KeyEvent keyEvent0) [...]

    @Override  // android.app.Dialog
    public void invalidateOptionsMenu() {
        this.e().w();
    }

    public boolean j(int v) {
        return this.e().J(v);
    }

    @Override  // androidx.appcompat.app.e
    public void n(b b0) {
    }

    @Override  // androidx.activity.k
    protected void onCreate(Bundle bundle0) {
        this.e().v();
        super.onCreate(bundle0);
        this.e().A(bundle0);
    }

    @Override  // androidx.activity.k
    protected void onStop() {
        super.onStop();
        this.e().G();
    }

    @Override  // androidx.appcompat.app.e
    public void r(b b0) {
    }

    @Override  // androidx.activity.k
    public void setContentView(int v) {
        this.h();
        this.e().L(v);
    }

    @Override  // androidx.activity.k
    public void setContentView(View view0) {
        this.h();
        this.e().M(view0);
    }

    @Override  // androidx.activity.k
    public void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.h();
        this.e().N(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Dialog
    public void setTitle(int v) {
        super.setTitle(v);
        this.e().S(this.getContext().getString(v));
    }

    @Override  // android.app.Dialog
    public void setTitle(CharSequence charSequence0) {
        super.setTitle(charSequence0);
        this.e().S(charSequence0);
    }
}

