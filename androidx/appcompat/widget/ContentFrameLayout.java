package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout {
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    private TypedValue f;
    private TypedValue g;
    private TypedValue h;
    private TypedValue i;
    private TypedValue j;
    private TypedValue k;
    private final Rect l;
    private a m;

    public ContentFrameLayout(Context context0) {
        this(context0, null);
    }

    public ContentFrameLayout(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ContentFrameLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.l = new Rect();
    }

    public void a(int v, int v1, int v2, int v3) {
        this.l.set(v, v1, v2, v3);
        if(this.isLaidOut()) {
            this.requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if(this.j == null) {
            this.j = new TypedValue();
        }
        return this.j;
    }

    public TypedValue getFixedHeightMinor() {
        if(this.k == null) {
            this.k = new TypedValue();
        }
        return this.k;
    }

    public TypedValue getFixedWidthMajor() {
        if(this.h == null) {
            this.h = new TypedValue();
        }
        return this.h;
    }

    public TypedValue getFixedWidthMinor() {
        if(this.i == null) {
            this.i = new TypedValue();
        }
        return this.i;
    }

    public TypedValue getMinWidthMajor() {
        if(this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getMinWidthMinor() {
        if(this.g == null) {
            this.g = new TypedValue();
        }
        return this.g;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a contentFrameLayout$a0 = this.m;
        if(contentFrameLayout$a0 != null) {
            contentFrameLayout$a0.a();
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a contentFrameLayout$a0 = this.m;
        if(contentFrameLayout$a0 != null) {
            contentFrameLayout$a0.onDetachedFromWindow();
        }
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        int v8;
        int v5;
        int v4;
        boolean z2;
        DisplayMetrics displayMetrics0 = this.getContext().getResources().getDisplayMetrics();
        boolean z = true;
        boolean z1 = displayMetrics0.widthPixels < displayMetrics0.heightPixels;
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getMode(v1);
        if(v2 == 0x80000000) {
            TypedValue typedValue0 = z1 ? this.i : this.h;
            if(typedValue0 == null) {
                z2 = false;
            }
            else {
                switch(typedValue0.type) {
                    case 0: {
                        z2 = false;
                        break;
                    }
                    case 5: {
                        v4 = (int)typedValue0.getDimension(displayMetrics0);
                        goto label_16;
                    }
                    case 6: {
                        v4 = (int)typedValue0.getFraction(((float)displayMetrics0.widthPixels), ((float)displayMetrics0.widthPixels));
                    label_16:
                        if(v4 > 0) {
                            v = View.MeasureSpec.makeMeasureSpec(Math.min(v4 - (this.l.left + this.l.right), View.MeasureSpec.getSize(v)), 0x40000000);
                            z2 = true;
                        }
                        else {
                            z2 = false;
                        }
                        break;
                    }
                    default: {
                        v4 = 0;
                        goto label_16;
                    }
                }
            }
        }
        else {
            z2 = false;
        }
        if(v3 == 0x80000000) {
            TypedValue typedValue1 = z1 ? this.j : this.k;
            if(typedValue1 != null) {
                switch(typedValue1.type) {
                    case 0: {
                        break;
                    }
                    case 5: {
                        v5 = (int)typedValue1.getDimension(displayMetrics0);
                        goto label_34;
                    }
                    case 6: {
                        v5 = (int)typedValue1.getFraction(((float)displayMetrics0.heightPixels), ((float)displayMetrics0.heightPixels));
                    label_34:
                        if(v5 > 0) {
                            v1 = View.MeasureSpec.makeMeasureSpec(Math.min(v5 - (this.l.top + this.l.bottom), View.MeasureSpec.getSize(v1)), 0x40000000);
                        }
                        break;
                    }
                    default: {
                        v5 = 0;
                        goto label_34;
                    }
                }
            }
        }
        super.onMeasure(v, v1);
        int v6 = this.getMeasuredWidth();
        int v7 = View.MeasureSpec.makeMeasureSpec(v6, 0x40000000);
        if(z2 || v2 != 0x80000000) {
            z = false;
        }
        else {
            TypedValue typedValue2 = z1 ? this.g : this.f;
            if(typedValue2 == null) {
                z = false;
            }
            else {
                switch(typedValue2.type) {
                    case 0: {
                        z = false;
                        goto label_60;
                    }
                    case 5: {
                        v8 = (int)typedValue2.getDimension(displayMetrics0);
                        break;
                    }
                    case 6: {
                        v8 = (int)typedValue2.getFraction(((float)displayMetrics0.widthPixels), ((float)displayMetrics0.widthPixels));
                        break;
                    }
                    default: {
                        v8 = 0;
                    }
                }
                if(v8 > 0) {
                    v8 -= this.l.left + this.l.right;
                }
                if(v6 < v8) {
                    v7 = View.MeasureSpec.makeMeasureSpec(v8, 0x40000000);
                }
                else {
                    z = false;
                }
            }
        }
    label_60:
        if(z) {
            super.onMeasure(v7, v1);
        }
    }

    public void setAttachListener(a contentFrameLayout$a0) {
        this.m = contentFrameLayout$a0;
    }
}

