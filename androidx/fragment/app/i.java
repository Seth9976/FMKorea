package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.J;

abstract class i {
    static class a {
        public final Animation a;
        public final Animator b;

        a(Animator animator0) {
            this.a = null;
            this.b = animator0;
            if(animator0 == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        a(Animation animation0) {
            this.a = animation0;
            this.b = null;
            if(animation0 == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    static class b extends AnimationSet implements Runnable {
        private final ViewGroup f;
        private final View g;
        private boolean h;
        private boolean i;
        private boolean j;

        b(Animation animation0, ViewGroup viewGroup0, View view0) {
            super(false);
            this.j = true;
            this.f = viewGroup0;
            this.g = view0;
            this.addAnimation(animation0);
            viewGroup0.post(this);
        }

        @Override  // android.view.animation.AnimationSet
        public boolean getTransformation(long v, Transformation transformation0) {
            this.j = true;
            if(this.h) {
                return !this.i;
            }
            if(!super.getTransformation(v, transformation0)) {
                this.h = true;
                J.a(this.f, this);
            }
            return true;
        }

        @Override  // android.view.animation.Animation
        public boolean getTransformation(long v, Transformation transformation0, float f) {
            this.j = true;
            if(this.h) {
                return !this.i;
            }
            if(!super.getTransformation(v, transformation0, f)) {
                this.h = true;
                J.a(this.f, this);
            }
            return true;
        }

        @Override
        public void run() {
            if(!this.h && this.j) {
                this.j = false;
                this.f.post(this);
                return;
            }
            this.f.endViewTransition(this.g);
            this.i = true;
        }
    }

    private static int a(Fragment fragment0, boolean z, boolean z1) {
        if(z1) {
            return z ? fragment0.getPopEnterAnim() : fragment0.getPopExitAnim();
        }
        return z ? fragment0.getEnterAnim() : fragment0.getExitAnim();
    }

    static a b(Context context0, Fragment fragment0, boolean z, boolean z1) {
        int v = fragment0.getNextTransition();
        int v1 = i.a(fragment0, z, z1);
        fragment0.setAnimations(0, 0, 0, 0);
        if(fragment0.mContainer != null && fragment0.mContainer.getTag(R.b.c) != null) {
            fragment0.mContainer.setTag(0x7F090218, null);  // id:visible_removing_fragment_view_tag
        }
        if(fragment0.mContainer != null && fragment0.mContainer.getLayoutTransition() != null) {
            return null;
        }
        if(v1 == 0 && v != 0) {
            v1 = i.d(context0, v, z);
        }
        if(v1 == 0) {
            return null;
        }
        else {
            boolean z2 = "anim".equals(context0.getResources().getResourceTypeName(v1));
            if(!z2) {
                goto label_17;
            }
            try {
                Animation animation0 = AnimationUtils.loadAnimation(context0, v1);
                return animation0 != null ? new a(animation0) : null;
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                throw resources$NotFoundException0;
            }
            catch(RuntimeException unused_ex) {
            }
            try {
            label_17:
                Animator animator0 = AnimatorInflater.loadAnimator(context0, v1);
                return animator0 == null ? null : new a(animator0);
            }
            catch(RuntimeException runtimeException0) {
            }
        }
        if(z2) {
            throw runtimeException0;
        }
        Animation animation1 = AnimationUtils.loadAnimation(context0, v1);
        return animation1 == null ? null : new a(animation1);
    }

    private static int c(Context context0, int v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(0x1030001, new int[]{v});
        int v1 = typedArray0.getResourceId(0, -1);
        typedArray0.recycle();
        return v1;
    }

    private static int d(Context context0, int v, boolean z) {
        switch(v) {
            case 0x1001: {
                return z ? R.a.e : R.a.f;
            }
            case 0x1003: {
                return z ? R.a.c : R.a.d;
            }
            case 4100: {
                return z ? i.c(context0, 0x10100B8) : i.c(context0, 0x10100B9);
            }
            case 0x2002: {
                return z ? R.a.a : R.a.b;
            }
            case 0x2005: {
                return z ? i.c(context0, 0x10100BA) : i.c(context0, 0x10100BB);
            }
            default: {
                return -1;
            }
        }
    }
}

