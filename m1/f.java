package M1;

import T.b;
import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import z1.c;

public class f extends a {
    private final float g;
    private final float h;

    public f(View view0) {
        super(view0);
        Resources resources0 = view0.getResources();
        this.g = resources0.getDimension(c.n);
        this.h = resources0.getDimension(c.o);
    }

    public void f() {
        if(super.b() == null) {
            return;
        }
        Animator animator0 = this.g();
        animator0.setDuration(((long)this.e));
        animator0.start();
    }

    private Animator g() {
        Animator animator0 = new AnimatorSet();
        ((AnimatorSet)animator0).playTogether(new Animator[]{ObjectAnimator.ofFloat(this.b, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.b, View.SCALE_Y, new float[]{1.0f})});
        View view0 = this.b;
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                ((AnimatorSet)animator0).playTogether(new Animator[]{ObjectAnimator.ofFloat(((ViewGroup)view0).getChildAt(v), View.SCALE_Y, new float[]{1.0f})});
            }
        }
        ((AnimatorSet)animator0).setInterpolator(new b());
        return animator0;
    }

    public void h(androidx.activity.b b0, Animator.AnimatorListener animator$AnimatorListener0) {
        class M1.f.a extends AnimatorListenerAdapter {
            final f a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                f.this.b.setTranslationY(0.0f);
                f.this.k(0.0f);
            }
        }

        float[] arr_f = {((float)this.b.getHeight()) * this.b.getScaleY()};
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.b, View.TRANSLATION_Y, arr_f);
        objectAnimator0.setInterpolator(new b());
        objectAnimator0.setDuration(((long)A1.a.c(this.c, this.d, b0.a())));
        objectAnimator0.addListener(new M1.f.a(this));
        if(animator$AnimatorListener0 != null) {
            objectAnimator0.addListener(animator$AnimatorListener0);
        }
        objectAnimator0.start();
    }

    public void i(androidx.activity.b b0, Animator.AnimatorListener animator$AnimatorListener0) {
        Animator animator0 = this.g();
        animator0.setDuration(((long)A1.a.c(this.c, this.d, b0.a())));
        if(animator$AnimatorListener0 != null) {
            animator0.addListener(animator$AnimatorListener0);
        }
        animator0.start();
    }

    public void j(androidx.activity.b b0) {
        super.d(b0);
    }

    public void k(float f) {
        float f1 = this.a(f);
        float f2 = (float)this.b.getWidth();
        float f3 = (float)this.b.getHeight();
        if(f2 > 0.0f && f3 > 0.0f) {
            float f4 = A1.a.a(0.0f, this.g / f2, f1);
            float f5 = A1.a.a(0.0f, this.h / f3, f1);
            this.b.setScaleX(1.0f - f4);
            this.b.setPivotY(f3);
            this.b.setScaleY(1.0f - f5);
            View view0 = this.b;
            if(view0 instanceof ViewGroup) {
                for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                    View view1 = ((ViewGroup)view0).getChildAt(v);
                    view1.setPivotY(((float)(-view1.getTop())));
                    view1.setScaleY((1.0f - f5 == 0.0f ? 1.0f : (1.0f - f4) / (1.0f - f5)));
                }
            }
        }
    }

    public void l(androidx.activity.b b0) {
        if(super.e(b0) == null) {
            return;
        }
        this.k(b0.a());
    }
}

