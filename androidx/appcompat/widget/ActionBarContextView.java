package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.core.view.Y;
import androidx.core.view.g0;
import e.f;
import e.g;
import e.j;

public class ActionBarContextView extends a {
    private CharSequence n;
    private CharSequence o;
    private View p;
    private View q;
    private View r;
    private LinearLayout s;
    private TextView t;
    private TextView u;
    private int v;
    private int w;
    private boolean x;
    private int y;

    public ActionBarContextView(Context context0) {
        this(context0, null);
    }

    public ActionBarContextView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, e.a.g);
    }

    public ActionBarContextView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        c0 c00 = c0.v(context0, attributeSet0, j.y, v, 0);
        this.setBackground(c00.g(j.z));
        this.v = c00.n(j.D, 0);
        this.w = c00.n(j.C, 0);
        this.j = c00.m(j.B, 0);
        this.y = c00.n(j.A, g.d);
        c00.x();
    }

    @Override  // androidx.appcompat.widget.a
    public g0 f(int v, long v1) {
        return super.f(v, v1);
    }

    public void g() {
        if(this.p == null) {
            this.k();
        }
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new ViewGroup.MarginLayoutParams(this.getContext(), attributeSet0);
    }

    @Override  // androidx.appcompat.widget.a
    public int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override  // androidx.appcompat.widget.a
    public int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.o;
    }

    public CharSequence getTitle() {
        return this.n;
    }

    public void h(b b0) {
        class androidx.appcompat.widget.ActionBarContextView.a implements View.OnClickListener {
            final b f;
            final ActionBarContextView g;

            androidx.appcompat.widget.ActionBarContextView.a(b b0) {
                this.f = b0;
                super();
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                this.f.c();
            }
        }

        View view0 = this.p;
        if(view0 == null) {
            View view1 = LayoutInflater.from(this.getContext()).inflate(this.y, this, false);
            this.p = view1;
            this.addView(view1);
        }
        else if(view0.getParent() == null) {
            this.addView(this.p);
        }
        View view2 = this.p.findViewById(f.i);
        this.q = view2;
        view2.setOnClickListener(new androidx.appcompat.widget.ActionBarContextView.a(this, b0));
        e e0 = (e)b0.e();
        ActionMenuPresenter actionMenuPresenter0 = this.i;
        if(actionMenuPresenter0 != null) {
            actionMenuPresenter0.A();
        }
        ActionMenuPresenter actionMenuPresenter1 = new ActionMenuPresenter(this.getContext());
        this.i = actionMenuPresenter1;
        actionMenuPresenter1.L(true);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-2, -1);
        e0.c(this.i, this.g);
        ActionMenuView actionMenuView0 = (ActionMenuView)this.i.q(this);
        this.h = actionMenuView0;
        actionMenuView0.setBackground(null);
        this.addView(this.h, viewGroup$LayoutParams0);
    }

    private void i() {
        if(this.s == null) {
            LayoutInflater.from(this.getContext()).inflate(g.a, this);
            LinearLayout linearLayout0 = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
            this.s = linearLayout0;
            this.t = (TextView)linearLayout0.findViewById(f.e);
            this.u = (TextView)this.s.findViewById(f.d);
            if(this.v != 0) {
                this.t.setTextAppearance(this.getContext(), this.v);
            }
            if(this.w != 0) {
                this.u.setTextAppearance(this.getContext(), this.w);
            }
        }
        this.t.setText(this.n);
        this.u.setText(this.o);
        boolean z = TextUtils.isEmpty(this.n);
        boolean z1 = TextUtils.isEmpty(this.o);
        int v = 8;
        this.u.setVisibility((z1 ? 8 : 0));
        LinearLayout linearLayout1 = this.s;
        if(!z || !z1) {
            v = 0;
        }
        linearLayout1.setVisibility(v);
        if(this.s.getParent() == null) {
            this.addView(this.s);
        }
    }

    public boolean j() {
        return this.x;
    }

    public void k() {
        this.removeAllViews();
        this.r = null;
        this.h = null;
        this.i = null;
        View view0 = this.q;
        if(view0 != null) {
            view0.setOnClickListener(null);
        }
    }

    public boolean l() {
        return this.i == null ? false : this.i.M();
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter0 = this.i;
        if(actionMenuPresenter0 != null) {
            actionMenuPresenter0.D();
            this.i.E();
        }
    }

    @Override  // androidx.appcompat.widget.a
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        return super.onHoverEvent(motionEvent0);
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        boolean z1 = n0.b(this);
        int v4 = z1 ? v2 - v - this.getPaddingRight() : this.getPaddingLeft();
        int v5 = this.getPaddingTop();
        int v6 = v3 - v1 - this.getPaddingTop() - this.getPaddingBottom();
        if(this.p != null && this.p.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.p.getLayoutParams();
            int v7 = z1 ? viewGroup$MarginLayoutParams0.leftMargin : viewGroup$MarginLayoutParams0.rightMargin;
            int v8 = a.d(v4, (z1 ? viewGroup$MarginLayoutParams0.rightMargin : viewGroup$MarginLayoutParams0.leftMargin), z1);
            v4 = a.d(v8 + this.e(this.p, v8, v5, v6, z1), v7, z1);
        }
        int v9 = this.s == null || this.r != null || this.s.getVisibility() == 8 ? v4 : v4 + this.e(this.s, v4, v5, v6, z1);
        View view0 = this.r;
        if(view0 != null) {
            this.e(view0, v9, v5, v6, z1);
        }
        int v10 = z1 ? this.getPaddingLeft() : v2 - v - this.getPaddingRight();
        ActionMenuView actionMenuView0 = this.h;
        if(actionMenuView0 != null) {
            this.e(actionMenuView0, v10, v5, v6, !z1);
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v2 = 0x40000000;
        if(View.MeasureSpec.getMode(v) != 0x40000000) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if(View.MeasureSpec.getMode(v1) == 0) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = this.j > 0 ? this.j : View.MeasureSpec.getSize(v1);
        int v5 = this.getPaddingTop() + this.getPaddingBottom();
        int v6 = v3 - this.getPaddingLeft() - this.getPaddingRight();
        int v7 = v4 - v5;
        int v8 = View.MeasureSpec.makeMeasureSpec(v7, 0x80000000);
        View view0 = this.p;
        if(view0 != null) {
            int v10 = this.c(view0, v6, v8, 0);
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.p.getLayoutParams();
            v6 = v10 - (viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin);
        }
        if(this.h != null && this.h.getParent() == this) {
            v6 = this.c(this.h, v6, v8, 0);
        }
        LinearLayout linearLayout0 = this.s;
        if(linearLayout0 != null && this.r == null) {
            if(this.x) {
                this.s.measure(0, v8);
                int v11 = this.s.getMeasuredWidth();
                boolean z = v11 <= v6;
                if(z) {
                    v6 -= v11;
                }
                this.s.setVisibility((z ? 0 : 8));
            }
            else {
                v6 = this.c(linearLayout0, v6, v8, 0);
            }
        }
        View view1 = this.r;
        if(view1 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
            int v12 = viewGroup$LayoutParams0.width;
            if(v12 >= 0) {
                v6 = Math.min(v12, v6);
            }
            int v13 = viewGroup$LayoutParams0.height;
            if(v13 == -2) {
                v2 = 0x80000000;
            }
            if(v13 >= 0) {
                v7 = Math.min(v13, v7);
            }
            this.r.measure(View.MeasureSpec.makeMeasureSpec(v6, (v12 == -2 ? 0x80000000 : 0x40000000)), View.MeasureSpec.makeMeasureSpec(v7, v2));
        }
        if(this.j <= 0) {
            int v14 = this.getChildCount();
            int v15 = 0;
            for(int v9 = 0; v9 < v14; ++v9) {
                int v16 = this.getChildAt(v9).getMeasuredHeight() + v5;
                if(v16 > v15) {
                    v15 = v16;
                }
            }
            this.setMeasuredDimension(v3, v15);
            return;
        }
        this.setMeasuredDimension(v3, v4);
    }

    @Override  // androidx.appcompat.widget.a
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        return super.onTouchEvent(motionEvent0);
    }

    @Override  // androidx.appcompat.widget.a
    public void setContentHeight(int v) {
        this.j = v;
    }

    public void setCustomView(View view0) {
        View view1 = this.r;
        if(view1 != null) {
            this.removeView(view1);
        }
        this.r = view0;
        if(view0 != null) {
            LinearLayout linearLayout0 = this.s;
            if(linearLayout0 != null) {
                this.removeView(linearLayout0);
                this.s = null;
            }
        }
        if(view0 != null) {
            this.addView(view0);
        }
        this.requestLayout();
    }

    public void setSubtitle(CharSequence charSequence0) {
        this.o = charSequence0;
        this.i();
    }

    public void setTitle(CharSequence charSequence0) {
        this.n = charSequence0;
        this.i();
        Y.r0(this, charSequence0);
    }

    public void setTitleOptional(boolean z) {
        if(z != this.x) {
            this.requestLayout();
        }
        this.x = z;
    }

    @Override  // androidx.appcompat.widget.a
    public void setVisibility(int v) {
        super.setVisibility(v);
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

