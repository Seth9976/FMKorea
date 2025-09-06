package com.google.android.material.appbar;

import S1.g;
import S1.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.Y;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.q;
import com.google.android.material.internal.r;
import z1.a;
import z1.j;
import z1.k;

public class MaterialToolbar extends Toolbar {
    private Integer c0;
    private boolean d0;
    private boolean e0;
    private ImageView.ScaleType f0;
    private Boolean g0;
    private static final int h0;
    private static final ImageView.ScaleType[] i0;

    static {
        MaterialToolbar.h0 = j.z;
        MaterialToolbar.i0 = new ImageView.ScaleType[]{ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    }

    public MaterialToolbar(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, a.b0);
    }

    public MaterialToolbar(Context context0, AttributeSet attributeSet0, int v) {
        super(V1.a.c(context0, attributeSet0, v, MaterialToolbar.h0), attributeSet0, v);
        Context context1 = this.getContext();
        TypedArray typedArray0 = q.i(context1, attributeSet0, k.G4, v, MaterialToolbar.h0, new int[0]);
        if(typedArray0.hasValue(k.J4)) {
            this.setNavigationIconTint(typedArray0.getColor(2, -1));
        }
        this.d0 = typedArray0.getBoolean(k.L4, false);
        this.e0 = typedArray0.getBoolean(k.K4, false);
        int v1 = typedArray0.getInt(k.I4, -1);
        if(v1 >= 0) {
            ImageView.ScaleType[] arr_imageView$ScaleType = MaterialToolbar.i0;
            if(v1 < arr_imageView$ScaleType.length) {
                this.f0 = arr_imageView$ScaleType[v1];
            }
        }
        if(typedArray0.hasValue(k.H4)) {
            this.g0 = Boolean.valueOf(typedArray0.getBoolean(0, false));
        }
        typedArray0.recycle();
        this.U(context1);
    }

    private Pair T(TextView textView0, TextView textView1) {
        int v = this.getMeasuredWidth();
        int v1 = this.getPaddingLeft();
        int v2 = v - this.getPaddingRight();
        for(int v3 = 0; v3 < this.getChildCount(); ++v3) {
            View view0 = this.getChildAt(v3);
            if(view0.getVisibility() != 8 && view0 != textView0 && view0 != textView1) {
                if(view0.getRight() < v / 2 && view0.getRight() > v1) {
                    v1 = view0.getRight();
                }
                if(view0.getLeft() > v / 2 && view0.getLeft() < v2) {
                    v2 = view0.getLeft();
                }
            }
        }
        return new Pair(v1, v2);
    }

    private void U(Context context0) {
        Drawable drawable0 = this.getBackground();
        ColorStateList colorStateList0 = drawable0 == null ? ColorStateList.valueOf(0) : d.f(drawable0);
        if(colorStateList0 != null) {
            g g0 = new g();
            g0.V(colorStateList0);
            g0.K(context0);
            g0.U(Y.u(this));
            Y.s0(this, g0);
        }
    }

    private void V(View view0, Pair pair0) {
        int v = this.getMeasuredWidth();
        int v1 = view0.getMeasuredWidth();
        int v2 = v / 2 - v1 / 2;
        int v3 = v1 + v2;
        int v4 = Math.max(Math.max(((int)(((Integer)pair0.first))) - v2, 0), Math.max(v3 - ((int)(((Integer)pair0.second))), 0));
        if(v4 > 0) {
            v2 += v4;
            v3 -= v4;
            view0.measure(View.MeasureSpec.makeMeasureSpec(v3 - v2, 0x40000000), view0.getMeasuredHeightAndState());
        }
        view0.layout(v2, view0.getTop(), v3, view0.getBottom());
    }

    private void W() {
        if(!this.d0 && !this.e0) {
            return;
        }
        TextView textView0 = r.e(this);
        TextView textView1 = r.c(this);
        if(textView0 == null && textView1 == null) {
            return;
        }
        Pair pair0 = this.T(textView0, textView1);
        if(this.d0 && textView0 != null) {
            this.V(textView0, pair0);
        }
        if(this.e0 && textView1 != null) {
            this.V(textView1, pair0);
        }
    }

    private Drawable X(Drawable drawable0) {
        if(drawable0 != null && this.c0 != null) {
            drawable0 = androidx.core.graphics.drawable.a.r(drawable0.mutate());
            androidx.core.graphics.drawable.a.n(drawable0, ((int)this.c0));
        }
        return drawable0;
    }

    private void Y() {
        ImageView imageView0 = r.b(this);
        if(imageView0 != null) {
            Boolean boolean0 = this.g0;
            if(boolean0 != null) {
                imageView0.setAdjustViewBounds(boolean0.booleanValue());
            }
            ImageView.ScaleType imageView$ScaleType0 = this.f0;
            if(imageView$ScaleType0 != null) {
                imageView0.setScaleType(imageView$ScaleType0);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f0;
    }

    public Integer getNavigationIconTint() {
        return this.c0;
    }

    @Override  // androidx.appcompat.widget.Toolbar
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.W();
        this.Y();
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        h.d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        if(this.g0 == null || this.g0.booleanValue() != z) {
            this.g0 = Boolean.valueOf(z);
            this.requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType imageView$ScaleType0) {
        if(this.f0 != imageView$ScaleType0) {
            this.f0 = imageView$ScaleType0;
            this.requestLayout();
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable0) {
        super.setNavigationIcon(this.X(drawable0));
    }

    public void setNavigationIconTint(int v) {
        this.c0 = v;
        Drawable drawable0 = this.getNavigationIcon();
        if(drawable0 != null) {
            this.setNavigationIcon(drawable0);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if(this.e0 != z) {
            this.e0 = z;
            this.requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if(this.d0 != z) {
            this.d0 = z;
            this.requestLayout();
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void y(int v) {
        Menu menu0 = this.getMenu();
        if(menu0 instanceof e) {
            ((e)menu0).i0();
        }
        super.y(v);
        if(menu0 instanceof e) {
            ((e)menu0).h0();
        }
    }
}

