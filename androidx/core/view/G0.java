package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class g0 {
    private final WeakReference a;

    g0(View view0) {
        this.a = new WeakReference(view0);
    }

    public g0 b(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().alpha(f);
        }
        return this;
    }

    public void c() {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().cancel();
        }
    }

    public long d() {
        View view0 = (View)this.a.get();
        return view0 == null ? 0L : view0.animate().getDuration();
    }

    // 检测为 Lambda 实现
    private static void e(j0 j00, View view0, ValueAnimator valueAnimator0) [...]

    public g0 f(long v) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().setDuration(v);
        }
        return this;
    }

    public g0 g(Interpolator interpolator0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().setInterpolator(interpolator0);
        }
        return this;
    }

    public g0 h(h0 h00) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            this.i(view0, h00);
        }
        return this;
    }

    private void i(View view0, h0 h00) {
        class a extends AnimatorListenerAdapter {
            final h0 a;
            final View b;
            final g0 c;

            a(h0 h00, View view0) {
                this.a = h00;
                this.b = view0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationCancel(Animator animator0) {
                this.a.a(this.b);
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.a.b(this.b);
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                this.a.c(this.b);
            }
        }

        if(h00 != null) {
            view0.animate().setListener(new a(this, h00, view0));
            return;
        }
        view0.animate().setListener(null);
    }

    public g0 j(long v) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().setStartDelay(v);
        }
        return this;
    }

    public g0 k(j0 j00) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            f0 f00 = j00 == null ? null : (ValueAnimator valueAnimator0) -> j00.a(view0);
            view0.animate().setUpdateListener(f00);
        }
        return this;
    }

    public void l() {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().start();
        }
    }

    public g0 m(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().translationY(f);
        }
        return this;
    }
}

