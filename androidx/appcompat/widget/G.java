package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.i;
import androidx.core.widget.l;
import e.a;

public class g extends CheckedTextView implements l {
    private final h f;
    private final d g;
    private final z h;
    private m i;

    public g(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, a.p);
    }

    public g(Context context0, AttributeSet attributeSet0, int v) {
        super(Z.b(context0), attributeSet0, v);
        Y.a(this, this.getContext());
        z z0 = new z(this);
        this.h = z0;
        z0.m(attributeSet0, v);
        z0.b();
        d d0 = new d(this);
        this.g = d0;
        d0.e(attributeSet0, v);
        h h0 = new h(this);
        this.f = h0;
        h0.d(attributeSet0, v);
        this.getEmojiTextViewHelper().c(attributeSet0, v);
    }

    @Override  // android.widget.CheckedTextView
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        z z0 = this.h;
        if(z0 != null) {
            z0.b();
        }
        d d0 = this.g;
        if(d0 != null) {
            d0.b();
        }
        h h0 = this.f;
        if(h0 != null) {
            h0.a();
        }
    }

    @Override  // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.q(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        return this.f == null ? null : this.f.b();
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        return this.f == null ? null : this.f.c();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.k();
    }

    @Override  // android.widget.TextView
    public InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        return n.a(super.onCreateInputConnection(editorInfo0), editorInfo0, this);
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

    @Override  // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int v) {
        this.setCheckMarkDrawable(f.a.b(this.getContext(), v));
    }

    @Override  // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable0) {
        super.setCheckMarkDrawable(drawable0);
        h h0 = this.f;
        if(h0 != null) {
            h0.e();
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

    @Override  // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(i.r(this, actionMode$Callback0));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.getEmojiTextViewHelper().e(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList0) {
        h h0 = this.f;
        if(h0 != null) {
            h0.f(colorStateList0);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode porterDuff$Mode0) {
        h h0 = this.f;
        if(h0 != null) {
            h0.g(porterDuff$Mode0);
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

    @Override  // android.widget.TextView
    public void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        z z0 = this.h;
        if(z0 != null) {
            z0.q(context0, v);
        }
    }
}

