package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.core.widget.l;
import e.a;

public class q extends MultiAutoCompleteTextView implements l {
    private final d f;
    private final z g;
    private final androidx.appcompat.widget.l h;
    private static final int[] i;

    static {
        q.i = new int[]{0x1010176};
    }

    public q(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, a.m);
    }

    public q(Context context0, AttributeSet attributeSet0, int v) {
        super(Z.b(context0), attributeSet0, v);
        Y.a(this, this.getContext());
        c0 c00 = c0.v(this.getContext(), attributeSet0, q.i, v, 0);
        if(c00.s(0)) {
            this.setDropDownBackgroundDrawable(c00.g(0));
        }
        c00.x();
        d d0 = new d(this);
        this.f = d0;
        d0.e(attributeSet0, v);
        z z0 = new z(this);
        this.g = z0;
        z0.m(attributeSet0, v);
        z0.b();
        androidx.appcompat.widget.l l0 = new androidx.appcompat.widget.l(this);
        this.h = l0;
        l0.c(attributeSet0, v);
        this.a(l0);
    }

    void a(androidx.appcompat.widget.l l0) {
        KeyListener keyListener0 = this.getKeyListener();
        if(l0.b(keyListener0)) {
            boolean z = super.isFocusable();
            boolean z1 = super.isClickable();
            boolean z2 = super.isLongClickable();
            int v = super.getInputType();
            KeyListener keyListener1 = l0.a(keyListener0);
            if(keyListener1 == keyListener0) {
                return;
            }
            super.setKeyListener(keyListener1);
            super.setRawInputType(v);
            super.setFocusable(z);
            super.setClickable(z1);
            super.setLongClickable(z2);
        }
    }

    @Override  // android.widget.TextView
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d d0 = this.f;
        if(d0 != null) {
            d0.b();
        }
        z z0 = this.g;
        if(z0 != null) {
            z0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f == null ? null : this.f.c();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.f == null ? null : this.f.d();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.k();
    }

    @Override  // android.widget.TextView
    public InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = n.a(super.onCreateInputConnection(editorInfo0), editorInfo0, this);
        return this.h.d(inputConnection0, editorInfo0);
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

    @Override  // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawables(drawable0, drawable1, drawable2, drawable3);
        z z0 = this.g;
        if(z0 != null) {
            z0.p();
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
        z z0 = this.g;
        if(z0 != null) {
            z0.p();
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int v) {
        this.setDropDownBackgroundDrawable(f.a.b(this.getContext(), v));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.h.e(z);
    }

    @Override  // android.widget.TextView
    public void setKeyListener(KeyListener keyListener0) {
        super.setKeyListener(this.h.a(keyListener0));
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

    @Override  // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList0) {
        this.g.w(colorStateList0);
        this.g.b();
    }

    @Override  // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.g.x(porterDuff$Mode0);
        this.g.b();
    }

    @Override  // android.widget.TextView
    public void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        z z0 = this.g;
        if(z0 != null) {
            z0.q(context0, v);
        }
    }
}

