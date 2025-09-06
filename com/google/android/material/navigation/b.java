package com.google.android.material.navigation;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.core.graphics.d;
import androidx.drawerlayout.widget.DrawerLayout;

public abstract class b {
    private static final int a;

    static {
        b.a = Color.alpha(0x99000000);
    }

    // 检测为 Lambda 实现
    public static void a(DrawerLayout drawerLayout0, ValueAnimator valueAnimator0) [...]

    public static Animator.AnimatorListener b(DrawerLayout drawerLayout0, View view0) {
        class a extends AnimatorListenerAdapter {
            final DrawerLayout a;
            final View b;

            a(DrawerLayout drawerLayout0, View view0) {
                this.b = view0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.a.i(this.b, false);
                this.a.setScrimColor(0x99000000);
            }
        }

        return new a(drawerLayout0, view0);
    }

    public static ValueAnimator.AnimatorUpdateListener c(DrawerLayout drawerLayout0) {
        return (ValueAnimator valueAnimator0) -> b.d(drawerLayout0, valueAnimator0);
    }

    private static void d(DrawerLayout drawerLayout0, ValueAnimator valueAnimator0) {
        float f = valueAnimator0.getAnimatedFraction();
        drawerLayout0.setScrimColor(d.k(0x99000000, A1.a.c(b.a, 0, f)));
    }
}

