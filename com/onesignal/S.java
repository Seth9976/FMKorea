package com.onesignal;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.Y;

class s extends RelativeLayout {
    interface b {
        void a();

        void b();

        void onDismiss();
    }

    static class c {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        boolean h;
        private int i;
        private int j;
        private int k;

        static int a(c s$c0) {
            return s$c0.j;
        }

        static int b(c s$c0, int v) {
            s$c0.j = v;
            return v;
        }

        static int c(c s$c0) {
            return s$c0.i;
        }

        static int d(c s$c0, int v) {
            s$c0.i = v;
            return v;
        }

        static int e(c s$c0) {
            return s$c0.k;
        }

        static int f(c s$c0, int v) {
            s$c0.k = v;
            return v;
        }
    }

    private b f;
    private H.c g;
    private boolean h;
    private c i;
    private static final int j;
    private static final int k;

    static {
        s.j = D1.b(28);
        s.k = D1.b(0x40);
    }

    public s(Context context0) {
        super(context0);
        this.setClipChildren(false);
        this.f();
    }

    @Override  // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if(this.g.m(true)) {
            Y.f0(this);
        }
    }

    private void f() {
        class a extends H.c.c {
            private int a;
            final s b;

            @Override  // H.c$c
            public int a(View view0, int v, int v1) {
                return s.this.i.d;
            }

            @Override  // H.c$c
            public int b(View view0, int v, int v1) {
                if(s.this.i.h) {
                    return s.this.i.b;
                }
                this.a = v;
                if(s.this.i.g == 1) {
                    if(v >= s.this.i.c && s.this.f != null) {
                        s.this.f.a();
                    }
                    return v >= s.this.i.b ? v : s.this.i.b;
                }
                if(v <= s.this.i.c && s.this.f != null) {
                    s.this.f.a();
                }
                return v <= s.this.i.b ? v : s.this.i.b;
            }

            @Override  // H.c$c
            public void l(View view0, float f, float f1) {
                int v = s.this.i.b;
                if(!s.this.h) {
                    if(s.this.i.g != 1) {
                        if(this.a < c.e(s.this.i) || f1 < ((float)c.c(s.this.i))) {
                            v = c.a(s.this.i);
                            s.this.h = true;
                            if(s.this.f != null) {
                                s.this.f.onDismiss();
                            }
                        }
                    }
                    else if(this.a > c.e(s.this.i) || f1 > ((float)c.c(s.this.i))) {
                        v = c.a(s.this.i);
                        s.this.h = true;
                        if(s.this.f != null) {
                            s.this.f.onDismiss();
                        }
                    }
                }
                if(s.this.g.O(s.this.i.d, v)) {
                    Y.f0(s.this);
                }
            }

            @Override  // H.c$c
            public boolean m(View view0, int v) {
                return true;
            }
        }

        this.g = H.c.n(this, 1.0f, new a(this));
    }

    public void g() {
        this.h = true;
        this.g.Q(this, this.getLeft(), c.a(this.i));
        Y.f0(this);
    }

    void h(b s$b0) {
        this.f = s$b0;
    }

    void i(c s$c0) {
        this.i = s$c0;
        c.b(s$c0, s$c0.f + s$c0.a + (Resources.getSystem().getDisplayMetrics().heightPixels - s$c0.f - s$c0.a) + s.k);
        c.d(s$c0, D1.b(3000));
        if(s$c0.g == 0) {
            c.b(s$c0, -s$c0.f - s.j);
            c.d(s$c0, -c.c(s$c0));
            c.f(s$c0, c.a(s$c0) / 3);
            return;
        }
        c.f(s$c0, s$c0.f / 3 + s$c0.b * 2);
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        if(this.h) {
            return true;
        }
        switch(motionEvent0.getAction()) {
            case 0: 
            case 5: {
                b s$b0 = this.f;
                if(s$b0 != null) {
                    s$b0.b();
                }
            }
        }
        this.g.F(motionEvent0);
        return false;
    }
}

