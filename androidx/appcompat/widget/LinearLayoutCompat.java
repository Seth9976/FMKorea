package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout.LayoutParams;
import androidx.core.view.Y;
import androidx.core.view.s;
import e.j;

public class LinearLayoutCompat extends ViewGroup {
    public static class a extends LinearLayout.LayoutParams {
        public a(int v, int v1) {
            super(v, v1);
        }

        public a(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public a(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
        }

        public a(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
        }
    }

    private boolean f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private boolean m;
    private int[] n;
    private int[] o;
    private Drawable p;
    private int q;
    private int r;
    private int s;
    private int t;

    public LinearLayoutCompat(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public LinearLayoutCompat(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.f = true;
        this.g = -1;
        this.h = 0;
        this.j = 0x800033;
        c0 c00 = c0.v(context0, attributeSet0, j.i1, v, 0);
        Y.m0(this, context0, j.i1, attributeSet0, c00.r(), v, 0);
        int v1 = c00.k(j.k1, -1);
        if(v1 >= 0) {
            this.setOrientation(v1);
        }
        int v2 = c00.k(j.j1, -1);
        if(v2 >= 0) {
            this.setGravity(v2);
        }
        if(!c00.a(j.l1, true)) {
            this.setBaselineAligned(false);
        }
        this.l = c00.i(j.n1, -1.0f);
        this.g = c00.k(j.m1, -1);
        this.m = c00.a(j.q1, false);
        this.setDividerDrawable(c00.g(j.o1));
        this.s = c00.k(j.r1, 0);
        this.t = c00.f(j.p1, 0);
        c00.x();
    }

    private void A(View view0, int v, int v1, int v2, int v3) {
        view0.layout(v, v1, v2 + v, v3 + v1);
    }

    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof a;
    }

    void g(Canvas canvas0) {
        int v2;
        int v = this.getVirtualChildCount();
        boolean z = n0.b(this);
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.s(v1);
            if(view0 != null && view0.getVisibility() != 8 && this.t(v1)) {
                a linearLayoutCompat$a0 = (a)view0.getLayoutParams();
                this.j(canvas0, (z ? view0.getRight() + linearLayoutCompat$a0.rightMargin : view0.getLeft() - linearLayoutCompat$a0.leftMargin - this.q));
            }
        }
        if(this.t(v)) {
            View view1 = this.s(v - 1);
            if(view1 != null) {
                a linearLayoutCompat$a1 = (a)view1.getLayoutParams();
                v2 = z ? view1.getLeft() - linearLayoutCompat$a1.leftMargin - this.q : view1.getRight() + linearLayoutCompat$a1.rightMargin;
            }
            else if(z) {
                v2 = this.getPaddingLeft();
            }
            else {
                v2 = this.getWidth() - this.getPaddingRight() - this.q;
            }
            this.j(canvas0, v2);
        }
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.m();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.n(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.o(viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    public int getBaseline() {
        if(this.g < 0) {
            return super.getBaseline();
        }
        int v = this.getChildCount();
        int v1 = this.g;
        if(v <= v1) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View view0 = this.getChildAt(v1);
        int v2 = view0.getBaseline();
        if(v2 == -1) {
            if(this.g != 0) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline.");
            }
            return -1;
        }
        int v3 = this.h;
        if(this.i == 1) {
            switch(this.j & 0x70) {
                case 16: {
                    v3 += (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.k) / 2;
                    break;
                }
                case 80: {
                    return this.getBottom() - this.getTop() - this.getPaddingBottom() - this.k + ((a)view0.getLayoutParams()).topMargin + v2;
                }
                default: {
                    return v3 + ((a)view0.getLayoutParams()).topMargin + v2;
                }
            }
        }
        return v3 + ((a)view0.getLayoutParams()).topMargin + v2;
    }

    public int getBaselineAlignedChildIndex() {
        return this.g;
    }

    public Drawable getDividerDrawable() {
        return this.p;
    }

    public int getDividerPadding() {
        return this.t;
    }

    public int getDividerWidth() {
        return this.q;
    }

    public int getGravity() {
        return this.j;
    }

    public int getOrientation() {
        return this.i;
    }

    public int getShowDividers() {
        return this.s;
    }

    int getVirtualChildCount() {
        return this.getChildCount();
    }

    public float getWeightSum() {
        return this.l;
    }

    void h(Canvas canvas0) {
        int v2;
        int v = this.getVirtualChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.s(v1);
            if(view0 != null && view0.getVisibility() != 8 && this.t(v1)) {
                a linearLayoutCompat$a0 = (a)view0.getLayoutParams();
                this.i(canvas0, view0.getTop() - linearLayoutCompat$a0.topMargin - this.r);
            }
        }
        if(this.t(v)) {
            View view1 = this.s(v - 1);
            if(view1 == null) {
                v2 = this.getHeight() - this.getPaddingBottom() - this.r;
            }
            else {
                a linearLayoutCompat$a1 = (a)view1.getLayoutParams();
                v2 = view1.getBottom() + linearLayoutCompat$a1.bottomMargin;
            }
            this.i(canvas0, v2);
        }
    }

    void i(Canvas canvas0, int v) {
        this.p.setBounds(this.getPaddingLeft() + this.t, v, this.getWidth() - this.getPaddingRight() - this.t, this.r + v);
        this.p.draw(canvas0);
    }

    void j(Canvas canvas0, int v) {
        this.p.setBounds(v, this.getPaddingTop() + this.t, this.q + v, this.getHeight() - this.getPaddingBottom() - this.t);
        this.p.draw(canvas0);
    }

    private void k(int v, int v1) {
        int v2 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000);
        for(int v3 = 0; v3 < v; ++v3) {
            View view0 = this.s(v3);
            if(view0.getVisibility() != 8) {
                a linearLayoutCompat$a0 = (a)view0.getLayoutParams();
                if(linearLayoutCompat$a0.height == -1) {
                    int v4 = linearLayoutCompat$a0.width;
                    linearLayoutCompat$a0.width = view0.getMeasuredWidth();
                    this.measureChildWithMargins(view0, v1, 0, v2, 0);
                    linearLayoutCompat$a0.width = v4;
                }
            }
        }
    }

    private void l(int v, int v1) {
        int v2 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000);
        for(int v3 = 0; v3 < v; ++v3) {
            View view0 = this.s(v3);
            if(view0.getVisibility() != 8) {
                a linearLayoutCompat$a0 = (a)view0.getLayoutParams();
                if(linearLayoutCompat$a0.width == -1) {
                    int v4 = linearLayoutCompat$a0.height;
                    linearLayoutCompat$a0.height = view0.getMeasuredHeight();
                    this.measureChildWithMargins(view0, v2, 0, v1, 0);
                    linearLayoutCompat$a0.height = v4;
                }
            }
        }
    }

    protected a m() {
        int v = this.i;
        if(v == 0) {
            return new a(-2, -2);
        }
        return v == 1 ? new a(-1, -2) : null;
    }

    public a n(AttributeSet attributeSet0) {
        return new a(this.getContext(), attributeSet0);
    }

    protected a o(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof a) {
            return new a(((a)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new a(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new a(viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        if(this.p == null) {
            return;
        }
        if(this.i == 1) {
            this.h(canvas0);
            return;
        }
        this.g(canvas0);
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        if(this.i == 1) {
            this.v(v, v1, v2, v3);
            return;
        }
        this.u(v, v1, v2, v3);
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        if(this.i == 1) {
            this.z(v, v1);
            return;
        }
        this.x(v, v1);
    }

    int p(View view0, int v) [...] // Inlined contents

    int q(View view0) [...] // Inlined contents

    int r(View view0) [...] // Inlined contents

    View s(int v) {
        return this.getChildAt(v);
    }

    public void setBaselineAligned(boolean z) {
        this.f = z;
    }

    public void setBaselineAlignedChildIndex(int v) {
        if(v < 0 || v >= this.getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + this.getChildCount() + ")");
        }
        this.g = v;
    }

    public void setDividerDrawable(Drawable drawable0) {
        if(drawable0 == this.p) {
            return;
        }
        this.p = drawable0;
        boolean z = false;
        if(drawable0 == null) {
            this.q = 0;
            this.r = 0;
        }
        else {
            this.q = drawable0.getIntrinsicWidth();
            this.r = drawable0.getIntrinsicHeight();
        }
        if(drawable0 == null) {
            z = true;
        }
        this.setWillNotDraw(z);
        this.requestLayout();
    }

    public void setDividerPadding(int v) {
        this.t = v;
    }

    public void setGravity(int v) {
        if(this.j != v) {
            if((0x800007 & v) == 0) {
                v |= 0x800003;
            }
            if((v & 0x70) == 0) {
                v |= 0x30;
            }
            this.j = v;
            this.requestLayout();
        }
    }

    public void setHorizontalGravity(int v) {
        int v1 = this.j;
        if((0x800007 & v1) != (v & 0x800007)) {
            this.j = v & 0x800007 | 0xFF7FFFF8 & v1;
            this.requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.m = z;
    }

    public void setOrientation(int v) {
        if(this.i != v) {
            this.i = v;
            this.requestLayout();
        }
    }

    public void setShowDividers(int v) {
        if(v != this.s) {
            this.requestLayout();
        }
        this.s = v;
    }

    public void setVerticalGravity(int v) {
        int v1 = this.j;
        if((v1 & 0x70) != (v & 0x70)) {
            this.j = v & 0x70 | v1 & 0xFFFFFF8F;
            this.requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.l = Math.max(0.0f, f);
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected boolean t(int v) {
        if(v == 0) {
            return (this.s & 1) != 0;
        }
        if(v == this.getChildCount()) {
            return (this.s & 4) != 0;
        }
        if((this.s & 2) != 0) {
            for(int v1 = v - 1; v1 >= 0; --v1) {
                if(this.getChildAt(v1).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    void u(int v, int v1, int v2, int v3) {
        int v18;
        int v12;
        int v11;
        int v10;
        boolean z = n0.b(this);
        int v4 = this.getPaddingTop();
        int v5 = v3 - v1;
        int v6 = this.getPaddingBottom();
        int v7 = this.getPaddingBottom();
        int v8 = this.getVirtualChildCount();
        int v9 = this.j & 0x70;
        boolean z1 = this.f;
        int[] arr_v = this.n;
        int[] arr_v1 = this.o;
        switch(s.b(0x800007 & this.j, this.getLayoutDirection())) {
            case 1: {
                v10 = this.getPaddingLeft() + (v2 - v - this.k) / 2;
                break;
            }
            case 5: {
                v10 = this.getPaddingLeft() + v2 - v - this.k;
                break;
            }
            default: {
                v10 = this.getPaddingLeft();
            }
        }
        if(z) {
            v11 = v8 - 1;
            v12 = -1;
        }
        else {
            v11 = 0;
            v12 = 1;
        }
        for(int v13 = 0; v13 < v8; ++v13) {
            int v14 = v11 + v12 * v13;
            View view0 = this.s(v14);
            if(view0 != null && view0.getVisibility() != 8) {
                int v15 = view0.getMeasuredWidth();
                int v16 = view0.getMeasuredHeight();
                a linearLayoutCompat$a0 = (a)view0.getLayoutParams();
                int v17 = !z1 || linearLayoutCompat$a0.height == -1 ? -1 : view0.getBaseline();
                switch((linearLayoutCompat$a0.gravity >= 0 ? linearLayoutCompat$a0.gravity : v9) & 0x70) {
                    case 16: {
                        v18 = (v5 - v4 - v7 - v16) / 2 + v4 + linearLayoutCompat$a0.topMargin - linearLayoutCompat$a0.bottomMargin;
                        break;
                    }
                    case 0x30: {
                        v18 = linearLayoutCompat$a0.topMargin + v4;
                        if(v17 != -1) {
                            v18 += arr_v[1] - v17;
                        }
                        break;
                    }
                    case 80: {
                        v18 = v5 - v6 - v16 - linearLayoutCompat$a0.bottomMargin;
                        if(v17 != -1) {
                            int v19 = view0.getMeasuredHeight();
                            v18 -= arr_v1[2] - (v19 - v17);
                        }
                        break;
                    }
                    default: {
                        v18 = v4;
                    }
                }
                if(this.t(v14)) {
                    v10 += this.q;
                }
                int v20 = linearLayoutCompat$a0.leftMargin + v10;
                this.A(view0, v20, v18, v15, v16);
                v10 = v20 + (v15 + linearLayoutCompat$a0.rightMargin);
            }
        }
    }

    void v(int v, int v1, int v2, int v3) {
        int v14;
        int v10;
        int v4 = this.getPaddingLeft();
        int v5 = v2 - v;
        int v6 = this.getPaddingRight();
        int v7 = this.getPaddingRight();
        int v8 = this.getVirtualChildCount();
        int v9 = this.j & 0x800007;
        switch(this.j & 0x70) {
            case 16: {
                v10 = this.getPaddingTop() + (v3 - v1 - this.k) / 2;
                break;
            }
            case 80: {
                v10 = this.getPaddingTop() + v3 - v1 - this.k;
                break;
            }
            default: {
                v10 = this.getPaddingTop();
            }
        }
        for(int v11 = 0; v11 < v8; ++v11) {
            View view0 = this.s(v11);
            if(view0 != null && view0.getVisibility() != 8) {
                int v12 = view0.getMeasuredWidth();
                int v13 = view0.getMeasuredHeight();
                a linearLayoutCompat$a0 = (a)view0.getLayoutParams();
                switch(s.b((linearLayoutCompat$a0.gravity >= 0 ? linearLayoutCompat$a0.gravity : v9), this.getLayoutDirection()) & 7) {
                    case 1: {
                        v14 = (v5 - v4 - v7 - v12) / 2 + v4 + linearLayoutCompat$a0.leftMargin - linearLayoutCompat$a0.rightMargin;
                        break;
                    }
                    case 5: {
                        v14 = v5 - v6 - v12 - linearLayoutCompat$a0.rightMargin;
                        break;
                    }
                    default: {
                        v14 = linearLayoutCompat$a0.leftMargin + v4;
                    }
                }
                if(this.t(v11)) {
                    v10 += this.r;
                }
                int v15 = v10 + linearLayoutCompat$a0.topMargin;
                this.A(view0, v14, v15, v12, v13);
                v10 = v15 + (v13 + linearLayoutCompat$a0.bottomMargin);
            }
        }
    }

    void w(View view0, int v, int v1, int v2, int v3, int v4) {
        this.measureChildWithMargins(view0, v1, v2, v3, v4);
    }

    void x(int v, int v1) {
        int v32;
        int v31;
        int v29;
        int v37;
        int v36;
        float f5;
        int v24;
        int v22;
        int v21;
        int v19;
        boolean z6;
        View view1;
        boolean z5;
        boolean z4;
        int v12;
        int v13;
        this.k = 0;
        int v2 = this.getVirtualChildCount();
        int v3 = View.MeasureSpec.getMode(v);
        int v4 = View.MeasureSpec.getMode(v1);
        if(this.n == null || this.o == null) {
            this.n = new int[4];
            this.o = new int[4];
        }
        int[] arr_v = this.n;
        int[] arr_v1 = this.o;
        arr_v[3] = -1;
        arr_v[2] = -1;
        arr_v[1] = -1;
        arr_v[0] = -1;
        arr_v1[3] = -1;
        arr_v1[2] = -1;
        arr_v1[1] = -1;
        arr_v1[0] = -1;
        boolean z = this.f;
        boolean z1 = this.m;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        boolean z2 = false;
        int v10 = 0;
        boolean z3 = false;
        int v11 = 1;
        float f = 0.0f;
        while(v5 < v2) {
            View view0 = this.s(v5);
            if(view0 == null) {
                this.k = this.k;
            }
            else if(view0.getVisibility() != 8) {
                if(this.t(v5)) {
                    this.k += this.q;
                }
                a linearLayoutCompat$a0 = (a)view0.getLayoutParams();
                float f1 = linearLayoutCompat$a0.weight;
                float f2 = f + f1;
                if(v3 != 0x40000000 || linearLayoutCompat$a0.width != 0 || f1 <= 0.0f) {
                    if(linearLayoutCompat$a0.width != 0 || f1 <= 0.0f) {
                        v13 = 0x80000000;
                    }
                    else {
                        linearLayoutCompat$a0.width = -2;
                        v13 = 0;
                    }
                    v12 = v5;
                    z4 = z1;
                    z5 = z;
                    this.w(view0, v12, v, (f2 == 0.0f ? this.k : 0), v1, 0);
                    if(v13 != 0x80000000) {
                        linearLayoutCompat$a0.width = v13;
                    }
                    int v14 = view0.getMeasuredWidth();
                    if(v3 == 0x40000000) {
                        view1 = view0;
                        this.k += linearLayoutCompat$a0.leftMargin + v14 + linearLayoutCompat$a0.rightMargin;
                    }
                    else {
                        view1 = view0;
                        this.k = Math.max(this.k, this.k + v14 + linearLayoutCompat$a0.leftMargin + linearLayoutCompat$a0.rightMargin);
                    }
                    if(z4) {
                        v6 = Math.max(v14, v6);
                    }
                }
                else {
                    if(v3 == 0x40000000) {
                        this.k += linearLayoutCompat$a0.leftMargin + linearLayoutCompat$a0.rightMargin;
                    }
                    else {
                        this.k = Math.max(this.k, linearLayoutCompat$a0.leftMargin + this.k + linearLayoutCompat$a0.rightMargin);
                    }
                    if(z) {
                        view0.measure(0, 0);
                        v12 = v5;
                        z4 = z1;
                        z5 = true;
                        view1 = view0;
                    }
                    else {
                        v12 = v5;
                        z4 = z1;
                        z5 = false;
                        view1 = view0;
                        z2 = true;
                    }
                }
                if(v4 == 0x40000000 || linearLayoutCompat$a0.height != -1) {
                    z6 = false;
                }
                else {
                    z6 = true;
                    z3 = true;
                }
                int v15 = linearLayoutCompat$a0.topMargin + linearLayoutCompat$a0.bottomMargin;
                int v16 = view1.getMeasuredHeight() + v15;
                v10 = View.combineMeasuredStates(v10, view1.getMeasuredState());
                if(z5) {
                    int v17 = view1.getBaseline();
                    if(v17 != -1) {
                        int v18 = (((linearLayoutCompat$a0.gravity >= 0 ? linearLayoutCompat$a0.gravity : this.j) & 0x70) >> 4 & -2) >> 1;
                        arr_v[v18] = Math.max(arr_v[v18], v17);
                        arr_v1[v18] = Math.max(arr_v1[v18], v16 - v17);
                    }
                }
                v7 = Math.max(v7, v16);
                v11 = v11 == 0 || linearLayoutCompat$a0.height != -1 ? 0 : 1;
                if(linearLayoutCompat$a0.weight > 0.0f) {
                    if(!z6) {
                        v15 = v16;
                    }
                    v9 = Math.max(v9, v15);
                }
                else {
                    if(!z6) {
                        v15 = v16;
                    }
                    v8 = Math.max(v8, v15);
                }
                v19 = v12;
                f = f2;
                goto label_108;
            }
            z4 = z1;
            z5 = z;
            v19 = v5;
        label_108:
            z1 = z4;
            z = z5;
            v5 = v19 + 1;
        }
        if(this.k > 0 && this.t(v2)) {
            this.k += this.q;
        }
        int v20 = arr_v[1];
        if(v20 != -1 || arr_v[0] != -1 || arr_v[2] != -1 || arr_v[3] != -1) {
            v22 = v10;
            v21 = Math.max(v7, Math.max(arr_v[3], Math.max(arr_v[0], Math.max(v20, arr_v[2]))) + Math.max(arr_v1[3], Math.max(arr_v1[0], Math.max(arr_v1[1], arr_v1[2]))));
        }
        else {
            v21 = v7;
            v22 = v10;
        }
        if(z1 && (v3 == 0x80000000 || v3 == 0)) {
            this.k = 0;
            int v23 = 0;
            while(v23 < v2) {
                View view2 = this.s(v23);
                if(view2 == null) {
                    this.k = this.k;
                }
                else if(view2.getVisibility() != 8) {
                    a linearLayoutCompat$a1 = (a)view2.getLayoutParams();
                    if(v3 == 0x40000000) {
                        this.k += linearLayoutCompat$a1.leftMargin + v6 + linearLayoutCompat$a1.rightMargin;
                        v24 = v21;
                    }
                    else {
                        v24 = v21;
                        this.k = Math.max(this.k, this.k + v6 + linearLayoutCompat$a1.leftMargin + linearLayoutCompat$a1.rightMargin);
                    }
                    goto label_139;
                }
                v24 = v21;
            label_139:
                ++v23;
                v21 = v24;
            }
        }
        int v25 = v21;
        int v26 = this.k + (this.getPaddingLeft() + this.getPaddingRight());
        this.k = v26;
        int v27 = View.resolveSizeAndState(Math.max(v26, this.getSuggestedMinimumWidth()), v, 0);
        int v28 = (0xFFFFFF & v27) - this.k;
        if(z2 || v28 != 0 && f > 0.0f) {
            float f3 = this.l;
            if(f3 > 0.0f) {
                f = f3;
            }
            arr_v[3] = -1;
            arr_v[2] = -1;
            arr_v[1] = -1;
            arr_v[0] = -1;
            arr_v1[3] = -1;
            arr_v1[2] = -1;
            arr_v1[1] = -1;
            arr_v1[0] = -1;
            this.k = 0;
            int v33 = v8;
            int v34 = -1;
            v32 = v22;
            int v35 = 0;
            while(v35 < v2) {
                View view4 = this.s(v35);
                if(view4 != null && view4.getVisibility() != 8) {
                    a linearLayoutCompat$a2 = (a)view4.getLayoutParams();
                    float f4 = linearLayoutCompat$a2.weight;
                    if(f4 > 0.0f) {
                        int v38 = (int)(((float)v28) * f4 / f);
                        int v39 = v28 - v38;
                        v37 = v2;
                        int v40 = ViewGroup.getChildMeasureSpec(v1, this.getPaddingTop() + this.getPaddingBottom() + linearLayoutCompat$a2.topMargin + linearLayoutCompat$a2.bottomMargin, linearLayoutCompat$a2.height);
                        if(linearLayoutCompat$a2.width != 0 || v3 != 0x40000000) {
                            int v41 = view4.getMeasuredWidth() + v38;
                            if(v41 < 0) {
                                v41 = 0;
                            }
                            view4.measure(View.MeasureSpec.makeMeasureSpec(v41, 0x40000000), v40);
                        }
                        else {
                            if(v38 <= 0) {
                                v38 = 0;
                            }
                            view4.measure(View.MeasureSpec.makeMeasureSpec(v38, 0x40000000), v40);
                        }
                        v32 = View.combineMeasuredStates(v32, view4.getMeasuredState() & 0xFF000000);
                        f -= f4;
                        v36 = v39;
                    }
                    else {
                        v36 = v28;
                        v37 = v2;
                    }
                    if(v3 == 0x40000000) {
                        this.k += view4.getMeasuredWidth() + linearLayoutCompat$a2.leftMargin + linearLayoutCompat$a2.rightMargin;
                        f5 = f;
                    }
                    else {
                        int v42 = this.k;
                        f5 = f;
                        this.k = Math.max(v42, view4.getMeasuredWidth() + v42 + linearLayoutCompat$a2.leftMargin + linearLayoutCompat$a2.rightMargin);
                    }
                    boolean z7 = v4 != 0x40000000 && linearLayoutCompat$a2.height == -1;
                    int v43 = linearLayoutCompat$a2.topMargin + linearLayoutCompat$a2.bottomMargin;
                    int v44 = view4.getMeasuredHeight() + v43;
                    v34 = Math.max(v34, v44);
                    if(!z7) {
                        v43 = v44;
                    }
                    int v45 = Math.max(v33, v43);
                    int v46 = v11 == 0 || linearLayoutCompat$a2.height != -1 ? 0 : 1;
                    if(z) {
                        int v47 = view4.getBaseline();
                        if(v47 != -1) {
                            int v48 = (((linearLayoutCompat$a2.gravity >= 0 ? linearLayoutCompat$a2.gravity : this.j) & 0x70) >> 4 & -2) >> 1;
                            arr_v[v48] = Math.max(arr_v[v48], v47);
                            arr_v1[v48] = Math.max(arr_v1[v48], v44 - v47);
                        }
                    }
                    v11 = v46;
                    v33 = v45;
                    f = f5;
                }
                else {
                    v36 = v28;
                    v37 = v2;
                }
                ++v35;
                v28 = v36;
                v2 = v37;
            }
            v31 = v2;
            this.k += this.getPaddingLeft() + this.getPaddingRight();
            int v49 = arr_v[1];
            v25 = v49 != -1 || arr_v[0] != -1 || arr_v[2] != -1 || arr_v[3] != -1 ? Math.max(v34, Math.max(arr_v[3], Math.max(arr_v[0], Math.max(v49, arr_v[2]))) + Math.max(arr_v1[3], Math.max(arr_v1[0], Math.max(arr_v1[1], arr_v1[2])))) : v34;
            v29 = v33;
        }
        else {
            v29 = Math.max(v8, v9);
            if(z1 && v3 != 0x40000000) {
                for(int v30 = 0; v30 < v2; ++v30) {
                    View view3 = this.s(v30);
                    if(view3 != null && view3.getVisibility() != 8 && ((a)view3.getLayoutParams()).weight > 0.0f) {
                        view3.measure(View.MeasureSpec.makeMeasureSpec(v6, 0x40000000), View.MeasureSpec.makeMeasureSpec(view3.getMeasuredHeight(), 0x40000000));
                    }
                }
            }
            v31 = v2;
            v32 = v22;
        }
        if(v11 != 0 || v4 == 0x40000000) {
            v29 = v25;
        }
        this.setMeasuredDimension(v27 | 0xFF000000 & v32, View.resolveSizeAndState(Math.max(v29 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), v1, v32 << 16));
        if(z3) {
            this.k(v31, v);
        }
    }

    int y(int v) [...] // Inlined contents

    void z(int v, int v1) {
        int v34;
        int v32;
        int v44;
        int v38;
        int v27;
        boolean z3;
        int v19;
        int v18;
        int v17;
        int v16;
        int v15;
        View view1;
        int v14;
        int v20;
        int v13;
        this.k = 0;
        int v2 = this.getVirtualChildCount();
        int v3 = View.MeasureSpec.getMode(v);
        int v4 = View.MeasureSpec.getMode(v1);
        int v5 = this.g;
        boolean z = this.m;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        int v10 = 0;
        int v11 = 0;
        boolean z1 = false;
        boolean z2 = false;
        int v12 = 1;
        float f = 0.0f;
        while(v11 < v2) {
            View view0 = this.s(v11);
            if(view0 == null) {
                this.k = this.k;
                v13 = v2;
            }
            else if(view0.getVisibility() == 8) {
                v13 = v2;
            }
            else {
                if(this.t(v11)) {
                    this.k += this.r;
                }
                a linearLayoutCompat$a0 = (a)view0.getLayoutParams();
                float f1 = linearLayoutCompat$a0.weight;
                float f2 = f + f1;
                if(v4 != 0x40000000 || linearLayoutCompat$a0.height != 0 || f1 <= 0.0f) {
                    if(linearLayoutCompat$a0.height != 0 || f1 <= 0.0f) {
                        v20 = 0x80000000;
                    }
                    else {
                        linearLayoutCompat$a0.height = -2;
                        v20 = 0;
                    }
                    v16 = v6;
                    v17 = v7;
                    v18 = v9;
                    v13 = v2;
                    v15 = v10;
                    v19 = v11;
                    this.w(view0, v11, v, 0, v1, (f2 == 0.0f ? this.k : 0));
                    if(v20 != 0x80000000) {
                        linearLayoutCompat$a0.height = v20;
                    }
                    int v21 = view0.getMeasuredHeight();
                    view1 = view0;
                    this.k = Math.max(this.k, this.k + v21 + linearLayoutCompat$a0.topMargin + linearLayoutCompat$a0.bottomMargin);
                    v14 = z ? Math.max(v21, v8) : v8;
                }
                else {
                    this.k = Math.max(this.k, linearLayoutCompat$a0.topMargin + this.k + linearLayoutCompat$a0.bottomMargin);
                    v14 = v8;
                    view1 = view0;
                    v15 = v10;
                    z1 = true;
                    v16 = v6;
                    v17 = v7;
                    v18 = v9;
                    v13 = v2;
                    v19 = v11;
                }
                if(v5 >= 0 && v5 == v19 + 1) {
                    this.h = this.k;
                }
                if(v19 < v5 && linearLayoutCompat$a0.weight > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex.");
                }
                if(v3 == 0x40000000 || linearLayoutCompat$a0.width != -1) {
                    z3 = false;
                }
                else {
                    z3 = true;
                    z2 = true;
                }
                int v22 = linearLayoutCompat$a0.leftMargin + linearLayoutCompat$a0.rightMargin;
                int v23 = view1.getMeasuredWidth() + v22;
                int v24 = Math.max(v17, v23);
                int v25 = View.combineMeasuredStates(v16, view1.getMeasuredState());
                v12 = v12 == 0 || linearLayoutCompat$a0.width != -1 ? 0 : 1;
                if(linearLayoutCompat$a0.weight > 0.0f) {
                    if(!z3) {
                        v22 = v23;
                    }
                    v9 = Math.max(v18, v22);
                }
                else {
                    if(!z3) {
                        v22 = v23;
                    }
                    v15 = Math.max(v15, v22);
                    v9 = v18;
                }
                v8 = v14;
                v7 = v24;
                f = f2;
                v10 = v15;
                v11 = v19;
                v6 = v25;
            }
            ++v11;
            v2 = v13;
        }
        int v26 = v7;
        if(this.k > 0) {
            v27 = v2;
            if(this.t(v27)) {
                this.k += this.r;
            }
        }
        else {
            v27 = v2;
        }
        if(z && (v4 == 0x80000000 || v4 == 0)) {
            this.k = 0;
            for(int v28 = 0; v28 < v27; ++v28) {
                View view2 = this.s(v28);
                if(view2 == null) {
                    this.k = this.k;
                }
                else if(view2.getVisibility() != 8) {
                    a linearLayoutCompat$a1 = (a)view2.getLayoutParams();
                    this.k = Math.max(this.k, this.k + v8 + linearLayoutCompat$a1.topMargin + linearLayoutCompat$a1.bottomMargin);
                }
            }
        }
        int v29 = this.k + (this.getPaddingTop() + this.getPaddingBottom());
        this.k = v29;
        int v30 = View.resolveSizeAndState(Math.max(v29, this.getSuggestedMinimumHeight()), v1, 0);
        int v31 = (0xFFFFFF & v30) - this.k;
        if(z1 || v31 != 0 && f > 0.0f) {
            float f3 = this.l;
            if(f3 > 0.0f) {
                f = f3;
            }
            this.k = 0;
            int v35 = v31;
            int v36 = v10;
            v34 = v6;
            int v37 = 0;
            while(v37 < v27) {
                View view4 = this.s(v37);
                if(view4.getVisibility() == 8) {
                    v38 = v35;
                }
                else {
                    a linearLayoutCompat$a2 = (a)view4.getLayoutParams();
                    float f4 = linearLayoutCompat$a2.weight;
                    if(f4 > 0.0f) {
                        int v39 = (int)(((float)v35) * f4 / f);
                        v38 = v35 - v39;
                        int v40 = ViewGroup.getChildMeasureSpec(v, this.getPaddingLeft() + this.getPaddingRight() + linearLayoutCompat$a2.leftMargin + linearLayoutCompat$a2.rightMargin, linearLayoutCompat$a2.width);
                        if(linearLayoutCompat$a2.height != 0 || v4 != 0x40000000) {
                            int v41 = view4.getMeasuredHeight() + v39;
                            if(v41 < 0) {
                                v41 = 0;
                            }
                            view4.measure(v40, View.MeasureSpec.makeMeasureSpec(v41, 0x40000000));
                        }
                        else {
                            if(v39 <= 0) {
                                v39 = 0;
                            }
                            view4.measure(v40, View.MeasureSpec.makeMeasureSpec(v39, 0x40000000));
                        }
                        v34 = View.combineMeasuredStates(v34, view4.getMeasuredState() & 0xFFFFFF00);
                        f -= f4;
                    }
                    else {
                        v38 = v35;
                    }
                    int v42 = linearLayoutCompat$a2.leftMargin + linearLayoutCompat$a2.rightMargin;
                    int v43 = view4.getMeasuredWidth() + v42;
                    v26 = Math.max(v26, v43);
                    if(v3 == 0x40000000) {
                        v44 = v34;
                    }
                    else {
                        v44 = v34;
                        if(linearLayoutCompat$a2.width == -1) {
                            goto label_169;
                        }
                    }
                    v42 = v43;
                label_169:
                    int v45 = v12 == 0 || linearLayoutCompat$a2.width != -1 ? 0 : 1;
                    int v46 = this.k;
                    this.k = Math.max(v46, view4.getMeasuredHeight() + v46 + linearLayoutCompat$a2.topMargin + linearLayoutCompat$a2.bottomMargin);
                    v12 = v45;
                    v34 = v44;
                    v36 = Math.max(v36, v42);
                }
                ++v37;
                v35 = v38;
            }
            this.k += this.getPaddingTop() + this.getPaddingBottom();
            v32 = v36;
        }
        else {
            v32 = Math.max(v10, v9);
            if(z && v4 != 0x40000000) {
                for(int v33 = 0; v33 < v27; ++v33) {
                    View view3 = this.s(v33);
                    if(view3 != null && view3.getVisibility() != 8 && ((a)view3.getLayoutParams()).weight > 0.0f) {
                        view3.measure(View.MeasureSpec.makeMeasureSpec(view3.getMeasuredWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(v8, 0x40000000));
                    }
                }
            }
            v34 = v6;
        }
        if(v12 != 0 || v3 == 0x40000000) {
            v32 = v26;
        }
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(v32 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), v, v34), v30);
        if(z2) {
            this.l(v27, v1);
        }
    }
}

