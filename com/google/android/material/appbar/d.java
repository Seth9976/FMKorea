package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;

abstract class d extends f {
    class a implements Runnable {
        private final CoordinatorLayout f;
        private final View g;
        final d h;

        a(CoordinatorLayout coordinatorLayout0, View view0) {
            this.f = coordinatorLayout0;
            this.g = view0;
        }

        @Override
        public void run() {
            if(this.g != null) {
                OverScroller overScroller0 = d.this.j;
                if(overScroller0 != null) {
                    if(overScroller0.computeScrollOffset()) {
                        int v = d.this.j.getCurrY();
                        d.this.T(this.f, this.g, v);
                        Y.g0(this.g, this);
                        return;
                    }
                    d.this.R(this.f, this.g);
                }
            }
        }
    }

    private Runnable i;
    OverScroller j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private VelocityTracker o;

    public d() {
        this.l = -1;
        this.n = -1;
    }

    public d(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.l = -1;
        this.n = -1;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean H(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        boolean z;
        switch(motionEvent0.getActionMasked()) {
            case 1: {
                VelocityTracker velocityTracker0 = this.o;
                if(velocityTracker0 == null) {
                    z = false;
                }
                else {
                    velocityTracker0.addMovement(motionEvent0);
                    this.o.computeCurrentVelocity(1000);
                    float f = this.o.getYVelocity(this.l);
                    this.N(coordinatorLayout0, view0, -this.P(view0), 0, f);
                    z = true;
                }
                goto label_23;
            }
            case 2: {
                int v = motionEvent0.findPointerIndex(this.l);
                if(v == -1) {
                    return false;
                }
                int v1 = (int)motionEvent0.getY(v);
                int v2 = this.m - v1;
                this.m = v1;
                this.S(coordinatorLayout0, view0, v2, this.O(view0), 0);
                z = false;
                break;
            }
            case 3: {
                z = false;
            label_23:
                this.k = false;
                this.l = -1;
                VelocityTracker velocityTracker1 = this.o;
                if(velocityTracker1 != null) {
                    velocityTracker1.recycle();
                    this.o = null;
                }
                break;
            }
            case 6: {
                int v3 = motionEvent0.getActionIndex() == 0 ? 1 : 0;
                this.l = motionEvent0.getPointerId(v3);
                this.m = (int)(motionEvent0.getY(v3) + 0.5f);
                z = false;
                break;
            }
            default: {
                z = false;
            }
        }
        VelocityTracker velocityTracker2 = this.o;
        if(velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent0);
        }
        return this.k || z;
    }

    abstract boolean L(View arg1);

    private void M() {
        if(this.o == null) {
            this.o = VelocityTracker.obtain();
        }
    }

    final boolean N(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, float f) {
        Runnable runnable0 = this.i;
        if(runnable0 != null) {
            view0.removeCallbacks(runnable0);
            this.i = null;
        }
        if(this.j == null) {
            this.j = new OverScroller(view0.getContext());
        }
        this.j.fling(0, this.I(), 0, Math.round(f), 0, 0, v, v1);
        if(this.j.computeScrollOffset()) {
            a d$a0 = new a(this, coordinatorLayout0, view0);
            this.i = d$a0;
            Y.g0(view0, d$a0);
            return true;
        }
        this.R(coordinatorLayout0, view0);
        return false;
    }

    abstract int O(View arg1);

    abstract int P(View arg1);

    abstract int Q();

    abstract void R(CoordinatorLayout arg1, View arg2);

    final int S(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2) {
        return this.U(coordinatorLayout0, view0, this.Q() - v, v1, v2);
    }

    int T(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        return this.U(coordinatorLayout0, view0, v, 0x80000000, 0x7FFFFFFF);
    }

    abstract int U(CoordinatorLayout arg1, View arg2, int arg3, int arg4, int arg5);

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean o(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        if(this.n < 0) {
            this.n = ViewConfiguration.get(coordinatorLayout0.getContext()).getScaledTouchSlop();
        }
        if(motionEvent0.getActionMasked() == 2 && this.k) {
            int v = this.l;
            if(v == -1) {
                return false;
            }
            int v1 = motionEvent0.findPointerIndex(v);
            if(v1 == -1) {
                return false;
            }
            int v2 = (int)motionEvent0.getY(v1);
            if(Math.abs(v2 - this.m) > this.n) {
                this.m = v2;
                return true;
            }
        }
        if(motionEvent0.getActionMasked() == 0) {
            this.l = -1;
            int v3 = (int)motionEvent0.getX();
            int v4 = (int)motionEvent0.getY();
            boolean z = this.L(view0) && coordinatorLayout0.B(view0, v3, v4);
            this.k = z;
            if(z) {
                this.m = v4;
                this.l = motionEvent0.getPointerId(0);
                this.M();
                if(this.j != null && !this.j.isFinished()) {
                    this.j.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker0 = this.o;
        if(velocityTracker0 != null) {
            velocityTracker0.addMovement(motionEvent0);
        }
        return false;
    }
}

