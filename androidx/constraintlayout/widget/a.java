package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import s.e;

public class a extends c {
    private int n;
    private int o;
    private s.a p;

    public a(Context context0) {
        super(context0);
        super.setVisibility(8);
    }

    @Override  // androidx.constraintlayout.widget.c
    protected void g(AttributeSet attributeSet0) {
        super.g(attributeSet0);
        this.p = new s.a();
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, i.a1);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == i.q1) {
                    this.setType(typedArray0.getInt(v2, 0));
                }
                else if(v2 == i.p1) {
                    this.p.O0(typedArray0.getBoolean(v2, true));
                }
                else if(v2 == i.r1) {
                    int v3 = typedArray0.getDimensionPixelSize(v2, 0);
                    this.p.Q0(v3);
                }
            }
        }
        this.i = this.p;
        this.m();
    }

    public int getMargin() {
        return this.p.M0();
    }

    public int getType() {
        return this.n;
    }

    @Override  // androidx.constraintlayout.widget.c
    public void h(e e0, boolean z) {
        this.o(e0, this.n, z);
    }

    public boolean n() {
        return this.p.K0();
    }

    private void o(e e0, int v, boolean z) {
        this.o = v;
        if(z) {
            int v1 = this.n;
            if(v1 == 5) {
                this.o = 1;
            }
            else if(v1 == 6) {
                this.o = 0;
            }
        }
        else {
            int v2 = this.n;
            if(v2 == 5) {
                this.o = 0;
            }
            else if(v2 == 6) {
                this.o = 1;
            }
        }
        if(e0 instanceof s.a) {
            ((s.a)e0).P0(this.o);
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.p.O0(z);
    }

    public void setDpMargin(int v) {
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.p.Q0(((int)(((float)v) * displayMetrics0.density + 0.5f)));
    }

    public void setMargin(int v) {
        this.p.Q0(v);
    }

    public void setType(int v) {
        this.n = v;
    }
}

