package androidx.appcompat.widget;

import F.c;
import F.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.I;
import androidx.core.widget.i;
import androidx.core.widget.j;
import androidx.core.widget.l;

public class k extends EditText implements I, l {
    class a {
        final k a;

        public TextClassifier a() {
            return k.this.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier0) {
            k.this.super.setTextClassifier(textClassifier0);
        }
    }

    private final d f;
    private final z g;
    private final y h;
    private final j i;
    private final androidx.appcompat.widget.l j;
    private a k;

    public k(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, e.a.A);
    }

    public k(Context context0, AttributeSet attributeSet0, int v) {
        super(Z.b(context0), attributeSet0, v);
        Y.a(this, this.getContext());
        d d0 = new d(this);
        this.f = d0;
        d0.e(attributeSet0, v);
        z z0 = new z(this);
        this.g = z0;
        z0.m(attributeSet0, v);
        z0.b();
        this.h = new y(this);
        this.i = new j();
        androidx.appcompat.widget.l l0 = new androidx.appcompat.widget.l(this);
        this.j = l0;
        l0.c(attributeSet0, v);
        this.d(l0);
    }

    @Override  // androidx.core.view.I
    public androidx.core.view.d a(androidx.core.view.d d0) {
        return this.i.a(this, d0);
    }

    void d(androidx.appcompat.widget.l l0) {
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

    @Override  // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.q(super.getCustomSelectionActionModeCallback());
    }

    private a getSuperCaller() {
        if(this.k == null) {
            this.k = new a(this);
        }
        return this.k;
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

    @Override  // android.widget.EditText
    public Editable getText() {
        return Build.VERSION.SDK_INT < 28 ? super.getEditableText() : super.getText();
    }

    @Override  // android.widget.EditText
    public CharSequence getText() {
        return this.getText();
    }

    @Override  // android.widget.TextView
    public TextClassifier getTextClassifier() {
        if(Build.VERSION.SDK_INT < 28) {
            return this.h == null ? this.getSuperCaller().a() : this.h.a();
        }
        return this.getSuperCaller().a();
    }

    @Override  // android.widget.TextView
    public InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        this.g.r(this, inputConnection0, editorInfo0);
        InputConnection inputConnection1 = n.a(inputConnection0, editorInfo0, this);
        if(inputConnection1 != null && Build.VERSION.SDK_INT <= 30) {
            String[] arr_s = androidx.core.view.Y.C(this);
            if(arr_s != null) {
                c.d(editorInfo0, arr_s);
                inputConnection1 = e.c(this, inputConnection1, editorInfo0);
            }
        }
        return this.j.d(inputConnection1, editorInfo0);
    }

    @Override  // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager)this.getContext().getSystemService("input_method")).isActive(this);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.TextView
    public boolean onDragEvent(DragEvent dragEvent0) {
        return v.a(this, dragEvent0) ? true : super.onDragEvent(dragEvent0);
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.EditText
    public boolean onTextContextMenuItem(int v) {
        return v.b(this, v) ? true : super.onTextContextMenuItem(v);
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

    @Override  // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(i.r(this, actionMode$Callback0));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.j.e(z);
    }

    @Override  // android.widget.TextView
    public void setKeyListener(KeyListener keyListener0) {
        super.setKeyListener(this.j.a(keyListener0));
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

    @Override  // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier0) {
        if(Build.VERSION.SDK_INT < 28) {
            y y0 = this.h;
            if(y0 != null) {
                y0.b(textClassifier0);
                return;
            }
        }
        this.getSuperCaller().b(textClassifier0);
    }
}

