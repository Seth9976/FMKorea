package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

public class c extends N {
    static class a extends AnimatorListenerAdapter implements f {
        private final View a;
        private boolean b;

        a(View view0) {
            this.b = false;
            this.a = view0;
        }

        @Override  // androidx.transition.k$f
        public void a(k k0) {
        }

        @Override  // androidx.transition.k$f
        public void b(k k0) {
            float f = this.a.getVisibility() == 0 ? A.b(this.a) : 0.0f;
            this.a.setTag(h.d, f);
        }

        @Override  // androidx.transition.k$f
        public void c(k k0, boolean z) {
            l.a(this, k0, z);
        }

        @Override  // androidx.transition.k$f
        public void d(k k0) {
        }

        @Override  // androidx.transition.k$f
        public void e(k k0) {
        }

        @Override  // androidx.transition.k$f
        public void f(k k0, boolean z) {
        }

        @Override  // androidx.transition.k$f
        public void g(k k0) {
            this.a.setTag(h.d, null);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationCancel(Animator animator0) {
            A.e(this.a, 1.0f);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            this.onAnimationEnd(animator0, false);
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationEnd(Animator animator0, boolean z) {
            if(this.b) {
                this.a.setLayerType(0, null);
            }
            if(!z) {
                A.e(this.a, 1.0f);
            }
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationStart(Animator animator0) {
            if(this.a.hasOverlappingRendering() && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public c() {
    }

    public c(int v) {
        this.n0(v);
    }

    @Override  // androidx.transition.N
    public Animator j0(ViewGroup viewGroup0, View view0, x x0, x x1) {
        return this.o0(view0, c.p0(x0, 0.0f), 1.0f);
    }

    @Override  // androidx.transition.N
    public void l(x x0) {
        super.l(x0);
        Float float0 = (Float)x0.b.getTag(h.d);
        if(float0 == null) {
            float0 = x0.b.getVisibility() == 0 ? A.b(x0.b) : 0.0f;
        }
        x0.a.put("android:fade:transitionAlpha", float0);
    }

    @Override  // androidx.transition.N
    public Animator l0(ViewGroup viewGroup0, View view0, x x0, x x1) {
        Animator animator0 = this.o0(view0, c.p0(x0, 1.0f), 0.0f);
        if(animator0 == null) {
            A.e(view0, c.p0(x1, 1.0f));
        }
        return animator0;
    }

    private Animator o0(View view0, float f, float f1) {
        if(f == f1) {
            return null;
        }
        A.e(view0, f);
        Animator animator0 = ObjectAnimator.ofFloat(view0, A.b, new float[]{f1});
        a c$a0 = new a(view0);
        animator0.addListener(c$a0);
        this.z().b(c$a0);
        return animator0;
    }

    private static float p0(x x0, float f) {
        if(x0 != null) {
            Float float0 = (Float)x0.a.get("android:fade:transitionAlpha");
            return float0 == null ? f : ((float)float0);
        }
        return f;
    }
}

