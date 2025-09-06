package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.FrameLayout;
import o.d;

public class CardView extends FrameLayout {
    class a implements b {
        private Drawable a;
        final CardView b;

        @Override  // androidx.cardview.widget.b
        public void a(Drawable drawable0) {
            this.a = drawable0;
            CardView.this.setBackgroundDrawable(drawable0);
        }

        @Override  // androidx.cardview.widget.b
        public boolean b() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override  // androidx.cardview.widget.b
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override  // androidx.cardview.widget.b
        public Drawable d() {
            return this.a;
        }

        @Override  // androidx.cardview.widget.b
        public View e() {
            return CardView.this;
        }

        @Override  // androidx.cardview.widget.b
        public void f(int v, int v1, int v2, int v3) {
            CardView.this.k.set(v, v1, v2, v3);
            CardView.this.super.setPadding(v + CardView.this.j.left, v1 + CardView.this.j.top, v2 + CardView.this.j.right, v3 + CardView.this.j.bottom);
        }
    }

    private boolean f;
    private boolean g;
    int h;
    int i;
    final Rect j;
    final Rect k;
    private final b l;
    private static final int[] m;
    private static final c n;

    static {
        CardView.m = new int[]{0x1010031};
        androidx.cardview.widget.a a0 = new androidx.cardview.widget.a();
        CardView.n = a0;
        a0.i();
    }

    public CardView(Context context0) {
        this(context0, null);
    }

    public CardView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, o.a.a);
    }

    public CardView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        ColorStateList colorStateList0;
        Rect rect0 = new Rect();
        this.j = rect0;
        this.k = new Rect();
        a cardView$a0 = new a(this);
        this.l = cardView$a0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, d.a, v, o.c.a);
        if(typedArray0.hasValue(d.d)) {
            colorStateList0 = typedArray0.getColorStateList(2);
        }
        else {
            TypedArray typedArray1 = this.getContext().obtainStyledAttributes(CardView.m);
            int v1 = typedArray1.getColor(0, 0);
            typedArray1.recycle();
            float[] arr_f = new float[3];
            Color.colorToHSV(v1, arr_f);
            colorStateList0 = ColorStateList.valueOf((arr_f[2] > 0.5f ? this.getResources().getColor(o.b.b) : this.getResources().getColor(o.b.a)));
        }
        float f = typedArray0.getDimension(d.e, 0.0f);
        float f1 = typedArray0.getDimension(d.f, 0.0f);
        float f2 = typedArray0.getDimension(d.g, 0.0f);
        this.f = typedArray0.getBoolean(d.i, false);
        this.g = typedArray0.getBoolean(d.h, true);
        int v2 = typedArray0.getDimensionPixelSize(d.j, 0);
        rect0.left = typedArray0.getDimensionPixelSize(d.l, v2);
        rect0.top = typedArray0.getDimensionPixelSize(d.n, v2);
        rect0.right = typedArray0.getDimensionPixelSize(d.m, v2);
        rect0.bottom = typedArray0.getDimensionPixelSize(d.k, v2);
        this.h = typedArray0.getDimensionPixelSize(d.b, 0);
        this.i = typedArray0.getDimensionPixelSize(d.c, 0);
        typedArray0.recycle();
        CardView.n.a(cardView$a0, context0, colorStateList0, f, f1, (f1 > f2 ? f1 : f2));
    }

    public ColorStateList getCardBackgroundColor() {
        return CardView.n.h(this.l);
    }

    public float getCardElevation() {
        return CardView.n.c(this.l);
    }

    public int getContentPaddingBottom() {
        return this.j.bottom;
    }

    public int getContentPaddingLeft() {
        return this.j.left;
    }

    public int getContentPaddingRight() {
        return this.j.right;
    }

    public int getContentPaddingTop() {
        return this.j.top;
    }

    public float getMaxCardElevation() {
        return CardView.n.g(this.l);
    }

    public boolean getPreventCornerOverlap() {
        return this.g;
    }

    public float getRadius() {
        return CardView.n.d(this.l);
    }

    public boolean getUseCompatPadding() {
        return this.f;
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        c c0 = CardView.n;
        if(!(c0 instanceof androidx.cardview.widget.a)) {
            int v2 = View.MeasureSpec.getMode(v);
            if(v2 == 0x80000000 || v2 == 0x40000000) {
                v = View.MeasureSpec.makeMeasureSpec(Math.max(((int)Math.ceil(c0.k(this.l))), View.MeasureSpec.getSize(v)), v2);
            }
            int v3 = View.MeasureSpec.getMode(v1);
            if(v3 == 0x80000000 || v3 == 0x40000000) {
                v1 = View.MeasureSpec.makeMeasureSpec(Math.max(((int)Math.ceil(c0.j(this.l))), View.MeasureSpec.getSize(v1)), v3);
            }
            super.onMeasure(v, v1);
            return;
        }
        super.onMeasure(v, v1);
    }

    public void setCardBackgroundColor(int v) {
        ColorStateList colorStateList0 = ColorStateList.valueOf(v);
        CardView.n.m(this.l, colorStateList0);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList0) {
        CardView.n.m(this.l, colorStateList0);
    }

    public void setCardElevation(float f) {
        CardView.n.f(this.l, f);
    }

    public void setMaxCardElevation(float f) {
        CardView.n.n(this.l, f);
    }

    @Override  // android.view.View
    public void setMinimumHeight(int v) {
        this.i = v;
        super.setMinimumHeight(v);
    }

    @Override  // android.view.View
    public void setMinimumWidth(int v) {
        this.h = v;
        super.setMinimumWidth(v);
    }

    @Override  // android.view.View
    public void setPadding(int v, int v1, int v2, int v3) {
    }

    @Override  // android.view.View
    public void setPaddingRelative(int v, int v1, int v2, int v3) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if(z != this.g) {
            this.g = z;
            CardView.n.l(this.l);
        }
    }

    public void setRadius(float f) {
        CardView.n.b(this.l, f);
    }

    public void setUseCompatPadding(boolean z) {
        if(this.f != z) {
            this.f = z;
            CardView.n.e(this.l);
        }
    }
}

