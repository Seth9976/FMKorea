package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import androidx.core.view.Y;
import e.f;
import e.j;

public class ButtonBarLayout extends LinearLayout {
    private boolean f;
    private boolean g;
    private int h;

    public ButtonBarLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.h = -1;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, j.N0);
        Y.m0(this, context0, j.N0, attributeSet0, typedArray0, 0, 0);
        this.f = typedArray0.getBoolean(j.O0, true);
        typedArray0.recycle();
        if(this.getOrientation() == 1) {
            this.setStacked(this.f);
        }
    }

    private int a(int v) {
        int v1 = this.getChildCount();
        while(v < v1) {
            if(this.getChildAt(v).getVisibility() == 0) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    private boolean b() {
        return this.g;
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        boolean z;
        int v4;
        int v2 = View.MeasureSpec.getSize(v);
        int v3 = 0;
        if(this.f) {
            if(v2 > this.h && this.b()) {
                this.setStacked(false);
            }
            this.h = v2;
        }
        if(this.b() || View.MeasureSpec.getMode(v) != 0x40000000) {
            v4 = v;
            z = false;
        }
        else {
            v4 = View.MeasureSpec.makeMeasureSpec(v2, 0x80000000);
            z = true;
        }
        super.onMeasure(v4, v1);
        if(this.f && !this.b() && (this.getMeasuredWidthAndState() & 0xFF000000) == 0x1000000) {
            this.setStacked(true);
            z = true;
        }
        if(z) {
            super.onMeasure(v, v1);
        }
        int v5 = this.a(0);
        if(v5 >= 0) {
            View view0 = this.getChildAt(v5);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)view0.getLayoutParams();
            int v6 = this.getPaddingTop() + view0.getMeasuredHeight() + linearLayout$LayoutParams0.topMargin + linearLayout$LayoutParams0.bottomMargin;
            if(this.b()) {
                int v7 = this.a(v5 + 1);
                if(v7 >= 0) {
                    v6 += this.getChildAt(v7).getPaddingTop() + ((int)(this.getResources().getDisplayMetrics().density * 16.0f));
                }
                v3 = v6;
            }
            else {
                v3 = v6 + this.getPaddingBottom();
            }
        }
        if(Y.A(this) != v3) {
            this.setMinimumHeight(v3);
            if(v1 == 0) {
                super.onMeasure(v, 0);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if(this.f != z) {
            this.f = z;
            if(!z && this.b()) {
                this.setStacked(false);
            }
            this.requestLayout();
        }
    }

    private void setStacked(boolean z) {
        if(this.g != z && (!z || this.f)) {
            this.g = z;
            this.setOrientation(((int)z));
            this.setGravity((z ? 0x800005 : 80));
            View view0 = this.findViewById(f.G);
            if(view0 != null) {
                view0.setVisibility((z ? 8 : 4));
            }
            for(int v = this.getChildCount() - 2; v >= 0; --v) {
                this.bringChildToFront(this.getChildAt(v));
            }
        }
    }
}

