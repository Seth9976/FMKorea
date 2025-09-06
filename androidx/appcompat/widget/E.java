package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.i;
import androidx.core.widget.l;
import e.a;

public class e extends Button implements l {
    private final d f;
    private final z g;
    private m h;

    public e(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, a.n);
    }

    public e(Context context0, AttributeSet attributeSet0, int v) {
        super(Z.b(context0), attributeSet0, v);
        Y.a(this, this.getContext());
        d d0 = new d(this);
        this.f = d0;
        d0.e(attributeSet0, v);
        z z0 = new z(this);
        this.g = z0;
        z0.m(attributeSet0, v);
        z0.b();
        this.getEmojiTextViewHelper().c(attributeSet0, v);
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
    public int getAutoSizeMaxTextSize() {
        if(n0.c) {
            return super.getAutoSizeMaxTextSize();
        }
        return this.g == null ? -1 : this.g.e();
    }

    @Override  // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if(n0.c) {
            return super.getAutoSizeMinTextSize();
        }
        return this.g == null ? -1 : this.g.f();
    }

    @Override  // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if(n0.c) {
            return super.getAutoSizeStepGranularity();
        }
        return this.g == null ? -1 : this.g.g();
    }

    @Override  // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if(n0.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        return this.g == null ? new int[0] : this.g.h();
    }

    @Override  // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if(n0.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        return this.g == null ? 0 : this.g.i();
    }

    @Override  // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.q(super.getCustomSelectionActionModeCallback());
    }

    private m getEmojiTextViewHelper() {
        if(this.h == null) {
            this.h = new m(this);
        }
        return this.h;
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

    @Override  // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName("android.widget.Button");
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("android.widget.Button");
    }

    @Override  // android.widget.TextView
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        z z1 = this.g;
        if(z1 != null) {
            z1.o(z, v, v1, v2, v3);
        }
    }

    @Override  // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        super.onTextChanged(charSequence0, v, v1, v2);
        if(this.g != null && !n0.c && this.g.l()) {
            this.g.c();
        }
    }

    @Override  // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        this.getEmojiTextViewHelper().d(z);
    }

    @Override  // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int v, int v1, int v2, int v3) {
        if(n0.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
            return;
        }
        z z0 = this.g;
        if(z0 != null) {
            z0.t(v, v1, v2, v3);
        }
    }

    @Override  // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] arr_v, int v) {
        if(n0.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
            return;
        }
        z z0 = this.g;
        if(z0 != null) {
            z0.u(arr_v, v);
        }
    }

    @Override  // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int v) {
        if(n0.c) {
            super.setAutoSizeTextTypeWithDefaults(v);
            return;
        }
        z z0 = this.g;
        if(z0 != null) {
            z0.v(v);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(i.r(this, actionMode$Callback0));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.getEmojiTextViewHelper().e(z);
    }

    @Override  // android.widget.TextView
    public void setFilters(InputFilter[] arr_inputFilter) {
        super.setFilters(this.getEmojiTextViewHelper().a(arr_inputFilter));
    }

    public void setSupportAllCaps(boolean z) {
        z z1 = this.g;
        if(z1 != null) {
            z1.s(z);
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
    public void setTextSize(int v, float f) {
        if(n0.c) {
            super.setTextSize(v, f);
            return;
        }
        z z0 = this.g;
        if(z0 != null) {
            z0.A(v, f);
        }
    }
}

