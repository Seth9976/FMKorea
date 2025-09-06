package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import s.l;

public abstract class j extends c {
    private boolean n;
    private boolean o;

    public j(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // androidx.constraintlayout.widget.c
    protected void g(AttributeSet attributeSet0) {
        super.g(attributeSet0);
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, i.a1);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == i.h1) {
                    this.n = true;
                }
                else if(v2 == i.o1) {
                    this.o = true;
                }
            }
        }
    }

    public abstract void n(l arg1, int arg2, int arg3);

    @Override  // androidx.constraintlayout.widget.c
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.n || this.o) {
            ViewParent viewParent0 = this.getParent();
            if(viewParent0 != null && viewParent0 instanceof ConstraintLayout) {
                int v = this.getVisibility();
                float f = this.getElevation();
                for(int v1 = 0; v1 < this.g; ++v1) {
                    View view0 = ((ConstraintLayout)viewParent0).h(this.f[v1]);
                    if(view0 != null) {
                        if(this.n) {
                            view0.setVisibility(v);
                        }
                        if(this.o && f > 0.0f) {
                            view0.setTranslationZ(view0.getTranslationZ() + f);
                        }
                    }
                }
            }
        }
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        this.c();
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        this.c();
    }
}

