package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.k;
import androidx.transition.x;
import java.util.Map;

public class o extends k {
    private void h0(x x0) {
        View view0 = x0.b;
        if(view0 instanceof TextView) {
            Float float0 = ((TextView)view0).getScaleX();
            x0.a.put("android:textscale:scale", float0);
        }
    }

    @Override  // androidx.transition.k
    public void i(x x0) {
        this.h0(x0);
    }

    @Override  // androidx.transition.k
    public void l(x x0) {
        this.h0(x0);
    }

    @Override  // androidx.transition.k
    public Animator p(ViewGroup viewGroup0, x x0, x x1) {
        class a implements ValueAnimator.AnimatorUpdateListener {
            final TextView a;
            final o b;

            a(TextView textView0) {
                this.a = textView0;
                super();
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                this.a.setScaleX(f);
                this.a.setScaleY(f);
            }
        }

        Animator animator0 = null;
        if(x0 != null && x1 != null && x0.b instanceof TextView) {
            View view0 = x1.b;
            if(view0 instanceof TextView) {
                Map map0 = x1.a;
                float f = 1.0f;
                float f1 = x0.a.get("android:textscale:scale") == null ? 1.0f : ((float)(((Float)x0.a.get("android:textscale:scale"))));
                if(map0.get("android:textscale:scale") != null) {
                    f = (float)(((Float)map0.get("android:textscale:scale")));
                }
                if(f1 == f) {
                    return null;
                }
                animator0 = ValueAnimator.ofFloat(new float[]{f1, f});
                ((ValueAnimator)animator0).addUpdateListener(new a(this, ((TextView)view0)));
            }
        }
        return animator0;
    }
}

