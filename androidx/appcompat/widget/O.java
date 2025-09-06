package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import e.a;

public class o extends ImageButton {
    private final d f;
    private final p g;
    private boolean h;

    public o(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, a.C);
    }

    public o(Context context0, AttributeSet attributeSet0, int v) {
        super(Z.b(context0), attributeSet0, v);
        this.h = false;
        Y.a(this, this.getContext());
        d d0 = new d(this);
        this.f = d0;
        d0.e(attributeSet0, v);
        p p0 = new p(this);
        this.g = p0;
        p0.g(attributeSet0, v);
    }

    @Override  // android.widget.ImageView
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d d0 = this.f;
        if(d0 != null) {
            d0.b();
        }
        p p0 = this.g;
        if(p0 != null) {
            p0.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f == null ? null : this.f.c();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.f == null ? null : this.f.d();
    }

    public ColorStateList getSupportImageTintList() {
        return this.g == null ? null : this.g.d();
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.g == null ? null : this.g.e();
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.ImageView
    public boolean hasOverlappingRendering() {
        return this.g.f() && super.hasOverlappingRendering();
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        d d0 = this.f;
        if(d0 != null) {
            d0.f(drawable0);
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(int v) {
        super.setBackgroundResource(v);
        d d0 = this.f;
        if(d0 != null) {
            d0.g(v);
        }
    }

    @Override  // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap0) {
        super.setImageBitmap(bitmap0);
        p p0 = this.g;
        if(p0 != null) {
            p0.c();
        }
    }

    @Override  // android.widget.ImageView
    public void setImageDrawable(Drawable drawable0) {
        p p0 = this.g;
        if(p0 != null && drawable0 != null && !this.h) {
            p0.h(drawable0);
        }
        super.setImageDrawable(drawable0);
        p p1 = this.g;
        if(p1 != null) {
            p1.c();
            if(!this.h) {
                this.g.b();
            }
        }
    }

    @Override  // android.widget.ImageView
    public void setImageLevel(int v) {
        super.setImageLevel(v);
        this.h = true;
    }

    @Override  // android.widget.ImageView
    public void setImageResource(int v) {
        this.g.i(v);
    }

    @Override  // android.widget.ImageView
    public void setImageURI(Uri uri0) {
        super.setImageURI(uri0);
        p p0 = this.g;
        if(p0 != null) {
            p0.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList0) {
        d d0 = this.f;
        if(d0 != null) {
            d0.i(colorStateList0);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        d d0 = this.f;
        if(d0 != null) {
            d0.j(porterDuff$Mode0);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList0) {
        p p0 = this.g;
        if(p0 != null) {
            p0.j(colorStateList0);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode porterDuff$Mode0) {
        p p0 = this.g;
        if(p0 != null) {
            p0.k(porterDuff$Mode0);
        }
    }
}

