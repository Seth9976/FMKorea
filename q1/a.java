package Q1;

import S1.g;
import S1.k;
import S1.n;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;

public class a extends Drawable implements n {
    static abstract class Q1.a.a {
    }

    static final class b extends Drawable.ConstantState {
        g a;
        boolean b;

        public b(b a$b0) {
            this.a = (g)a$b0.a.getConstantState().newDrawable();
            this.b = a$b0.b;
        }

        public b(g g0) {
            this.a = g0;
            this.b = false;
        }

        public a a() {
            return new a(new b(this), null);
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable() {
            return this.a();
        }
    }

    private b f;

    private a(b a$b0) {
        this.f = a$b0;
    }

    a(b a$b0, Q1.a.a a$a0) {
        this(a$b0);
    }

    public a(k k0) {
        this(new b(new g(k0)));
    }

    public a a() {
        this.f = new b(this.f);
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        b a$b0 = this.f;
        if(a$b0.b) {
            a$b0.a.draw(canvas0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f.a.getOpacity();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable mutate() {
        return this.a();
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.f.a.setBounds(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        boolean z = super.onStateChange(arr_v);
        if(this.f.a.setState(arr_v)) {
            z = true;
        }
        boolean z1 = Q1.b.e(arr_v);
        b a$b0 = this.f;
        if(a$b0.b != z1) {
            a$b0.b = z1;
            return true;
        }
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.f.a.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.f.a.setColorFilter(colorFilter0);
    }

    @Override  // S1.n
    public void setShapeAppearanceModel(k k0) {
        this.f.a.setShapeAppearanceModel(k0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTint(int v) {
        this.f.a.setTint(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList0) {
        this.f.a.setTintList(colorStateList0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.f.a.setTintMode(porterDuff$Mode0);
    }
}

