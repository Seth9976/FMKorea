package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.widget.k;
import androidx.core.widget.l;
import e.a;

public class f extends CheckBox implements k, l {
    private final i f;
    private final d g;
    private final z h;
    private m i;

    public f(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, a.o);
    }

    public f(Context context0, AttributeSet attributeSet0, int v) {
        super(Z.b(context0), attributeSet0, v);
        Y.a(this, this.getContext());
        i i0 = new i(this);
        this.f = i0;
        i0.d(attributeSet0, v);
        d d0 = new d(this);
        this.g = d0;
        d0.e(attributeSet0, v);
        z z0 = new z(this);
        this.h = z0;
        z0.m(attributeSet0, v);
        this.getEmojiTextViewHelper().c(attributeSet0, v);
    }

    @Override  // android.widget.CompoundButton
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d d0 = this.g;
        if(d0 != null) {
            d0.b();
        }
        z z0 = this.h;
        if(z0 != null) {
            z0.b();
        }
    }

    private m getEmojiTextViewHelper() {
        if(this.i == null) {
            this.i = new m(this);
        }
        return this.i;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.g == null ? null : this.g.c();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.g == null ? null : this.g.d();
    }

    @Override  // androidx.core.widget.k
    public ColorStateList getSupportButtonTintList() {
        return this.f == null ? null : this.f.b();
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        return this.f == null ? null : this.f.c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.k();
    }

    @Override  // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        this.getEmojiTextViewHelper().d(z);
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        d d0 = this.g;
        if(d0 != null) {
            d0.f(drawable0);
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(int v) {
        super.setBackgroundResource(v);
        d d0 = this.g;
        if(d0 != null) {
            d0.g(v);
        }
    }

    @Override  // android.widget.CompoundButton
    public void setButtonDrawable(int v) {
        this.setButtonDrawable(f.a.b(this.getContext(), v));
    }

    @Override  // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable0) {
        super.setButtonDrawable(drawable0);
        i i0 = this.f;
        if(i0 != null) {
            i0.e();
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawables(drawable0, drawable1, drawable2, drawable3);
        z z0 = this.h;
        if(z0 != null) {
            z0.p();
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
        z z0 = this.h;
        if(z0 != null) {
            z0.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.getEmojiTextViewHelper().e(z);
    }

    @Override  // android.widget.TextView
    public void setFilters(InputFilter[] arr_inputFilter) {
        super.setFilters(this.getEmojiTextViewHelper().a(arr_inputFilter));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList0) {
        d d0 = this.g;
        if(d0 != null) {
            d0.i(colorStateList0);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        d d0 = this.g;
        if(d0 != null) {
            d0.j(porterDuff$Mode0);
        }
    }

    @Override  // androidx.core.widget.k
    public void setSupportButtonTintList(ColorStateList colorStateList0) {
        i i0 = this.f;
        if(i0 != null) {
            i0.f(colorStateList0);
        }
    }

    @Override  // androidx.core.widget.k
    public void setSupportButtonTintMode(PorterDuff.Mode porterDuff$Mode0) {
        i i0 = this.f;
        if(i0 != null) {
            i0.g(porterDuff$Mode0);
        }
    }

    @Override  // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList0) {
        this.h.w(colorStateList0);
        this.h.b();
    }

    @Override  // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.h.x(porterDuff$Mode0);
        this.h.b();
    }
}

