package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import androidx.constraintlayout.widget.i;
import androidx.constraintlayout.widget.j;
import s.e;
import s.g;
import s.l;

public class Flow extends j {
    private g p;

    public Flow(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // androidx.constraintlayout.widget.j
    protected void g(AttributeSet attributeSet0) {
        super.g(attributeSet0);
        this.p = new g();
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, i.a1);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == i.b1) {
                    this.p.S1(typedArray0.getInt(v2, 0));
                }
                else if(v2 == i.c1) {
                    this.p.Y0(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == i.m1) {
                    this.p.d1(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == i.n1) {
                    this.p.a1(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == i.d1) {
                    this.p.b1(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == i.e1) {
                    this.p.e1(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == i.f1) {
                    this.p.c1(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == i.g1) {
                    this.p.Z0(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == i.L1) {
                    this.p.X1(typedArray0.getInt(v2, 0));
                }
                else if(v2 == i.B1) {
                    this.p.M1(typedArray0.getInt(v2, 0));
                }
                else if(v2 == i.K1) {
                    this.p.W1(typedArray0.getInt(v2, 0));
                }
                else if(v2 == i.v1) {
                    this.p.G1(typedArray0.getInt(v2, 0));
                }
                else if(v2 == i.D1) {
                    this.p.O1(typedArray0.getInt(v2, 0));
                }
                else if(v2 == i.x1) {
                    this.p.I1(typedArray0.getInt(v2, 0));
                }
                else if(v2 == i.F1) {
                    this.p.Q1(typedArray0.getInt(v2, 0));
                }
                else if(v2 == i.z1) {
                    this.p.K1(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == i.u1) {
                    this.p.F1(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == i.C1) {
                    this.p.N1(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == i.w1) {
                    this.p.H1(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == i.E1) {
                    this.p.P1(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == i.I1) {
                    this.p.U1(typedArray0.getFloat(v2, 0.5f));
                }
                else if(v2 == i.y1) {
                    this.p.J1(typedArray0.getInt(v2, 2));
                }
                else if(v2 == i.H1) {
                    this.p.T1(typedArray0.getInt(v2, 2));
                }
                else if(v2 == i.A1) {
                    this.p.L1(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == i.J1) {
                    this.p.V1(typedArray0.getDimensionPixelSize(v2, 0));
                }
                else if(v2 == i.G1) {
                    this.p.R1(typedArray0.getInt(v2, -1));
                }
            }
        }
        this.i = this.p;
        this.m();
    }

    @Override  // androidx.constraintlayout.widget.c
    public void h(e e0, boolean z) {
        this.p.K0(z);
    }

    @Override  // androidx.constraintlayout.widget.j
    public void n(l l0, int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = View.MeasureSpec.getMode(v1);
        int v5 = View.MeasureSpec.getSize(v1);
        if(l0 != null) {
            l0.S0(v2, v3, v4, v5);
            this.setMeasuredDimension(l0.N0(), l0.M0());
            return;
        }
        this.setMeasuredDimension(0, 0);
    }

    @Override  // androidx.constraintlayout.widget.c
    protected void onMeasure(int v, int v1) {
        this.n(this.p, v, v1);
    }

    public void setFirstHorizontalBias(float f) {
        this.p.F1(f);
        this.requestLayout();
    }

    public void setFirstHorizontalStyle(int v) {
        this.p.G1(v);
        this.requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.p.H1(f);
        this.requestLayout();
    }

    public void setFirstVerticalStyle(int v) {
        this.p.I1(v);
        this.requestLayout();
    }

    public void setHorizontalAlign(int v) {
        this.p.J1(v);
        this.requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.p.K1(f);
        this.requestLayout();
    }

    public void setHorizontalGap(int v) {
        this.p.L1(v);
        this.requestLayout();
    }

    public void setHorizontalStyle(int v) {
        this.p.M1(v);
        this.requestLayout();
    }

    public void setMaxElementsWrap(int v) {
        this.p.R1(v);
        this.requestLayout();
    }

    public void setOrientation(int v) {
        this.p.S1(v);
        this.requestLayout();
    }

    public void setPadding(int v) {
        this.p.Y0(v);
        this.requestLayout();
    }

    public void setPaddingBottom(int v) {
        this.p.Z0(v);
        this.requestLayout();
    }

    public void setPaddingLeft(int v) {
        this.p.b1(v);
        this.requestLayout();
    }

    public void setPaddingRight(int v) {
        this.p.c1(v);
        this.requestLayout();
    }

    public void setPaddingTop(int v) {
        this.p.e1(v);
        this.requestLayout();
    }

    public void setVerticalAlign(int v) {
        this.p.T1(v);
        this.requestLayout();
    }

    public void setVerticalBias(float f) {
        this.p.U1(f);
        this.requestLayout();
    }

    public void setVerticalGap(int v) {
        this.p.V1(v);
        this.requestLayout();
    }

    public void setVerticalStyle(int v) {
        this.p.W1(v);
        this.requestLayout();
    }

    public void setWrapMode(int v) {
        this.p.X1(v);
        this.requestLayout();
    }
}

