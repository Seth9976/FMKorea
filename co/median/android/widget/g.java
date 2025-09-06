package co.median.android.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import z3.k;

public final class g extends RelativeLayout {
    private final ImageView f;
    private final TextView g;
    private int h;
    private int i;
    private int j;

    public g(Context context0, Drawable drawable0, Drawable drawable1, String s, int v, int v1) {
        k.e(context0, "context");
        super(context0, null, 0);
        View.inflate(this.getContext(), 0x7F0C00A2, this);  // layout:view_handle
        View view0 = this.findViewById(0x7F0900E3);  // id:icon
        k.d(view0, "findViewById(...)");
        this.f = (ImageView)view0;
        View view1 = this.findViewById(0x7F0901E7);  // id:text
        k.d(view1, "findViewById(...)");
        this.g = (TextView)view1;
        this.h = 0x80000000;
        this.i = -1;
        this.j = -1;
        this.m(drawable0, drawable1, s, v, v1);
    }

    public final void e() {
        ValueAnimator valueAnimator0 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{this.i, this.j});
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> {
            k.e(valueAnimator0, "anim");
            Object object0 = valueAnimator0.getAnimatedValue();
            k.c(object0, "null cannot be cast to non-null type kotlin.Int");
            int v = (int)(((Integer)object0));
            this.g.setTextColor(v);
            this.f.setColorFilter(v, PorterDuff.Mode.SRC_IN);
        });
        valueAnimator0.setDuration(100L);
        valueAnimator0.start();
    }

    // 检测为 Lambda 实现
    private static final void f(g g0, ValueAnimator valueAnimator0) [...]

    public final void g() {
        CharSequence charSequence0 = this.g.getText();
        k.d(charSequence0, "getText(...)");
        if(charSequence0.length() == 0) {
            return;
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{this.h, 0});
        valueAnimator0.setDuration(300L);
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> {
            k.e(valueAnimator0, "anim");
            Object object0 = valueAnimator0.getAnimatedValue();
            k.c(object0, "null cannot be cast to non-null type kotlin.Int");
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.g.getLayoutParams();
            viewGroup$LayoutParams0.width = (int)(((Integer)object0));
            this.g.setLayoutParams(viewGroup$LayoutParams0);
        });
        valueAnimator0.start();
    }

    public final int getActiveColor() {
        return this.j;
    }

    public final int getInactiveColor() {
        return this.i;
    }

    public final int getMaxTextWidth() {
        return this.h;
    }

    // 检测为 Lambda 实现
    private static final void h(g g0, ValueAnimator valueAnimator0) [...]

    public final void i() {
        ValueAnimator valueAnimator0 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{this.j, this.i});
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> {
            k.e(valueAnimator0, "anim");
            Object object0 = valueAnimator0.getAnimatedValue();
            k.c(object0, "null cannot be cast to non-null type kotlin.Int");
            int v = (int)(((Integer)object0));
            this.g.setTextColor(v);
            this.f.setColorFilter(v, PorterDuff.Mode.SRC_IN);
        });
        valueAnimator0.setDuration(200L);
        valueAnimator0.start();
    }

    // 检测为 Lambda 实现
    private static final void j(g g0, ValueAnimator valueAnimator0) [...]

    public final void k() {
        CharSequence charSequence0 = this.g.getText();
        k.d(charSequence0, "getText(...)");
        if(charSequence0.length() == 0) {
            return;
        }
        if(this.g.getLayoutParams().width != 0) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.g.getLayoutParams();
            viewGroup$LayoutParams0.width = 0;
            this.g.setLayoutParams(viewGroup$LayoutParams0);
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{0, this.h});
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> {
            k.e(valueAnimator0, "anim");
            Object object0 = valueAnimator0.getAnimatedValue();
            k.c(object0, "null cannot be cast to non-null type kotlin.Int");
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.g.getLayoutParams();
            viewGroup$LayoutParams0.width = (int)(((Integer)object0));
            this.g.setLayoutParams(viewGroup$LayoutParams0);
        });
        valueAnimator0.setDuration(300L);
        valueAnimator0.start();
    }

    // 检测为 Lambda 实现
    private static final void l(g g0, ValueAnimator valueAnimator0) [...]

    public final void m(Drawable drawable0, Drawable drawable1, String s, int v, int v1) {
        this.setBackground(drawable0);
        this.f.setImageDrawable(drawable1);
        this.setText(s);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.g.getLayoutParams();
        viewGroup$LayoutParams0.width = 0;
        this.g.setLayoutParams(viewGroup$LayoutParams0);
        this.i = v;
        this.j = v1;
        this.f.setColorFilter(v);
    }

    public final void setActiveColor(int v) {
        this.j = v;
    }

    public final void setInactiveColor(int v) {
        this.i = v;
    }

    public final void setMaxTextWidth(int v) {
        this.h = v;
    }

    public final void setText(String s) {
        this.g.getLayoutParams().width = -2;
        this.g.setText(s);
        this.g.measure(0, 0);
        this.h = this.g.getMeasuredWidth();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.g.getLayoutParams();
        viewGroup$LayoutParams0.width = 0;
        this.g.setLayoutParams(viewGroup$LayoutParams0);
    }
}

