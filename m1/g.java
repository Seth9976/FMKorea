package M1;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import androidx.activity.b;
import androidx.core.view.Y;
import androidx.core.view.s;
import z1.c;

public class g extends a {
    private final float g;
    private final float h;
    private final float i;

    public g(View view0) {
        super(view0);
        Resources resources0 = view0.getResources();
        this.g = resources0.getDimension(c.q);
        this.h = resources0.getDimension(c.p);
        this.i = resources0.getDimension(c.r);
    }

    public void f() {
        if(super.b() == null) {
            return;
        }
        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.b, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.b, View.SCALE_Y, new float[]{1.0f})});
        View view0 = this.b;
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                animatorSet0.playTogether(new Animator[]{ObjectAnimator.ofFloat(((ViewGroup)view0).getChildAt(v), View.SCALE_Y, new float[]{1.0f})});
            }
        }
        animatorSet0.setDuration(((long)this.e));
        animatorSet0.start();
    }

    private boolean g(int v, int v1) {
        return (s.b(v, Y.z(this.b)) & v1) == v1;
    }

    public void h(b b0, int v, Animator.AnimatorListener animator$AnimatorListener0, ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        class M1.g.a extends AnimatorListenerAdapter {
            final boolean a;
            final int b;
            final g c;

            M1.g.a(boolean z, int v) {
                this.a = z;
                this.b = v;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                g.this.b.setTranslationX(0.0f);
                g.this.k(0.0f, this.a, this.b);
            }
        }

        boolean z = b0.b() == 0;
        boolean z1 = this.g(v, 3);
        float f = ((float)this.b.getWidth()) * this.b.getScaleX() + ((float)this.i(z1));
        View view0 = this.b;
        Property property0 = View.TRANSLATION_X;
        if(z1) {
            f = -f;
        }
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(view0, property0, new float[]{f});
        if(valueAnimator$AnimatorUpdateListener0 != null) {
            objectAnimator0.addUpdateListener(valueAnimator$AnimatorUpdateListener0);
        }
        objectAnimator0.setInterpolator(new T.b());
        objectAnimator0.setDuration(((long)A1.a.c(this.c, this.d, b0.a())));
        objectAnimator0.addListener(new M1.g.a(this, z, v));
        if(animator$AnimatorListener0 != null) {
            objectAnimator0.addListener(animator$AnimatorListener0);
        }
        objectAnimator0.start();
    }

    private int i(boolean z) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.b.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
            return z ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin : ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin;
        }
        return 0;
    }

    public void j(b b0) {
        super.d(b0);
    }

    public void k(float f, boolean z, int v) {
        float f1 = this.a(f);
        boolean z1 = this.g(v, 3);
        boolean z2 = z == z1;
        int v2 = this.b.getWidth();
        int v3 = this.b.getHeight();
        float f2 = (float)v2;
        if(f2 > 0.0f && ((float)v3) > 0.0f) {
            float f3 = this.g / f2;
            float f4 = this.h / f2;
            float f5 = this.i / ((float)v3);
            View view0 = this.b;
            if(z1) {
                f2 = 0.0f;
            }
            view0.setPivotX(f2);
            if(!z2) {
                f4 = -f3;
            }
            float f6 = 0.0f + f1 * (f4 - 0.0f);
            this.b.setScaleX(f6 + 1.0f);
            float f7 = 0.0f + f1 * (f5 - 0.0f);
            this.b.setScaleY(1.0f - f7);
            View view1 = this.b;
            if(view1 instanceof ViewGroup) {
                for(int v1 = 0; v1 < ((ViewGroup)view1).getChildCount(); ++v1) {
                    View view2 = ((ViewGroup)view1).getChildAt(v1);
                    view2.setPivotX(((float)(z1 ? v2 - view2.getRight() + view2.getWidth() : -view2.getLeft())));
                    view2.setPivotY(((float)(-view2.getTop())));
                    float f8 = z2 ? 1.0f - f6 : 1.0f;
                    view2.setScaleX(f8);
                    view2.setScaleY((1.0f - f7 == 0.0f ? 1.0f : (f6 + 1.0f) / (1.0f - f7) * f8));
                }
            }
        }
    }

    public void l(b b0, int v) {
        if(super.e(b0) == null) {
            return;
        }
        this.k(b0.a(), b0.b() == 0, v);
    }
}

