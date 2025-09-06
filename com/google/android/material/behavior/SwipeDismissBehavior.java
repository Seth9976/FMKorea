package com.google.android.material.behavior;

import C.C;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;

public class SwipeDismissBehavior extends c {
    class a extends H.c.c {
        private int a;
        private int b;
        final SwipeDismissBehavior c;

        a() {
            this.b = -1;
        }

        @Override  // H.c$c
        public int a(View view0, int v, int v1) {
            int v3;
            boolean z = Y.z(view0) == 1;
            int v2 = SwipeDismissBehavior.this.k;
            if(v2 == 0) {
                if(z) {
                    return SwipeDismissBehavior.L(this.a - view0.getWidth(), v, this.a);
                }
                v3 = this.a;
                return SwipeDismissBehavior.L(v3, v, view0.getWidth() + v3);
            }
            if(v2 == 1) {
                if(z) {
                    v3 = this.a;
                    return SwipeDismissBehavior.L(v3, v, view0.getWidth() + v3);
                }
                return SwipeDismissBehavior.L(this.a - view0.getWidth(), v, this.a);
            }
            v3 = this.a - view0.getWidth();
            int v4 = this.a;
            return SwipeDismissBehavior.L(v3, v, view0.getWidth() + v4);
        }

        @Override  // H.c$c
        public int b(View view0, int v, int v1) {
            return view0.getTop();
        }

        @Override  // H.c$c
        public int d(View view0) {
            return view0.getWidth();
        }

        @Override  // H.c$c
        public void i(View view0, int v) {
            this.b = v;
            this.a = view0.getLeft();
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 != null) {
                SwipeDismissBehavior.this.h = true;
                viewParent0.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.h = false;
            }
        }

        @Override  // H.c$c
        public void j(int v) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override  // H.c$c
        public void k(View view0, int v, int v1, int v2, int v3) {
            float f = ((float)view0.getWidth()) * SwipeDismissBehavior.this.m;
            float f1 = ((float)view0.getWidth()) * SwipeDismissBehavior.this.n;
            float f2 = (float)Math.abs(v - this.a);
            if(Float.compare(f2, f) <= 0) {
                view0.setAlpha(1.0f);
                return;
            }
            if(Float.compare(f2, f1) >= 0) {
                view0.setAlpha(0.0f);
                return;
            }
            view0.setAlpha(SwipeDismissBehavior.K(0.0f, 1.0f - (f2 - f) / (f1 - f), 1.0f));
        }

        @Override  // H.c$c
        public void l(View view0, float f, float f1) {
            boolean z;
            int v3;
            this.b = -1;
            int v = view0.getWidth();
            if(this.n(view0, f)) {
                if(f >= 0.0f) {
                    int v1 = view0.getLeft();
                    int v2 = this.a;
                    v3 = v1 >= v2 ? v2 + v : this.a - v;
                }
                else {
                    v3 = this.a - v;
                }
                z = true;
            }
            else {
                v3 = this.a;
                z = false;
            }
            if(SwipeDismissBehavior.this.f.O(v3, view0.getTop())) {
                Y.g0(view0, new com.google.android.material.behavior.SwipeDismissBehavior.c(SwipeDismissBehavior.this, view0, z));
                return;
            }
            if(z) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        // 去混淆评级： 低(20)
        @Override  // H.c$c
        public boolean m(View view0, int v) {
            return (this.b == -1 || this.b == v) && SwipeDismissBehavior.this.J(view0);
        }

        private boolean n(View view0, float f) {
            int v = Float.compare(f, 0.0f);
            if(v != 0) {
                boolean z = Y.z(view0) == 1;
                int v1 = SwipeDismissBehavior.this.k;
                if(v1 == 2) {
                    return true;
                }
                if(v1 == 0) {
                    return z ? f < 0.0f : v > 0;
                }
                if(v1 == 1) {
                    return z ? v > 0 : f < 0.0f;
                }
                return false;
            }
            return Math.abs(view0.getLeft() - this.a) >= Math.round(((float)view0.getWidth()) * SwipeDismissBehavior.this.l);
        }
    }

    class com.google.android.material.behavior.SwipeDismissBehavior.c implements Runnable {
        private final View f;
        private final boolean g;
        final SwipeDismissBehavior h;

        com.google.android.material.behavior.SwipeDismissBehavior.c(View view0, boolean z) {
            this.f = view0;
            this.g = z;
        }

        @Override
        public void run() {
            H.c c0 = SwipeDismissBehavior.this.f;
            if(c0 != null && c0.m(true)) {
                Y.g0(this.f, this);
                return;
            }
            if(this.g) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    H.c f;
    private boolean g;
    private boolean h;
    private float i;
    private boolean j;
    int k;
    float l;
    float m;
    float n;
    private final H.c.c o;

    public SwipeDismissBehavior() {
        this.i = 0.0f;
        this.k = 2;
        this.l = 0.5f;
        this.m = 0.0f;
        this.n = 0.5f;
        this.o = new a(this);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean H(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        if(this.f != null) {
            if(!this.h || motionEvent0.getActionMasked() != 3) {
                this.f.F(motionEvent0);
            }
            return true;
        }
        return false;
    }

    public boolean J(View view0) {
        return true;
    }

    static float K(float f, float f1, float f2) {
        return Math.min(Math.max(f, f1), f2);
    }

    static int L(int v, int v1, int v2) {
        return Math.min(Math.max(v, v1), v2);
    }

    private void M(ViewGroup viewGroup0) {
        if(this.f == null) {
            this.f = this.j ? H.c.n(viewGroup0, this.i, this.o) : H.c.o(viewGroup0, this.o);
        }
    }

    static float N(float f, float f1, float f2) [...] // Inlined contents

    public void O(float f) {
        this.n = SwipeDismissBehavior.K(0.0f, f, 1.0f);
    }

    public void P(float f) {
        this.m = SwipeDismissBehavior.K(0.0f, f, 1.0f);
    }

    public void Q(int v) {
        this.k = v;
    }

    private void R(View view0) {
        class b implements C {
            final SwipeDismissBehavior a;

            @Override  // C.C
            public boolean a(View view0, C.C.a c$a0) {
                boolean z = false;
                if(SwipeDismissBehavior.this.J(view0)) {
                    if(Y.z(view0) == 1) {
                        z = true;
                    }
                    int v = SwipeDismissBehavior.this.k;
                    Y.Y(view0, ((v != 0 || !z) && (v != 1 || z) ? view0.getWidth() : -view0.getWidth()));
                    view0.setAlpha(0.0f);
                    SwipeDismissBehavior.this.getClass();
                    return true;
                }
                return false;
            }
        }

        Y.i0(view0, 0x100000);
        if(this.J(view0)) {
            b swipeDismissBehavior$b0 = new b(this);
            Y.k0(view0, C.z.a.y, null, swipeDismissBehavior$b0);
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean o(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        boolean z = this.g;
        int v = motionEvent0.getActionMasked();
        switch(v) {
            case 0: {
                z = coordinatorLayout0.B(view0, ((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
                this.g = z;
                break;
            }
            case 1: {
                this.g = false;
                break;
            }
            default: {
                if(v == 3) {
                    this.g = false;
                }
            }
        }
        if(z) {
            this.M(coordinatorLayout0);
            return !this.h && this.f.P(motionEvent0);
        }
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean p(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        boolean z = super.p(coordinatorLayout0, view0, v);
        if(Y.x(view0) == 0) {
            Y.x0(view0, 1);
            this.R(view0);
        }
        return z;
    }
}

