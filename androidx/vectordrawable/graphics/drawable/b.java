package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2.AnimationCallback;
import android.graphics.drawable.Drawable;

public abstract class b {
    Animatable2.AnimationCallback a;

    Animatable2.AnimationCallback a() {
        class a extends Animatable2.AnimationCallback {
            final b a;

            @Override  // android.graphics.drawable.Animatable2$AnimationCallback
            public void onAnimationEnd(Drawable drawable0) {
                b.this.b(drawable0);
            }

            @Override  // android.graphics.drawable.Animatable2$AnimationCallback
            public void onAnimationStart(Drawable drawable0) {
                b.this.c(drawable0);
            }
        }

        if(this.a == null) {
            this.a = new a(this);
        }
        return this.a;
    }

    public void b(Drawable drawable0) {
    }

    public void c(Drawable drawable0) {
    }
}

