package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.k;
import com.google.android.material.internal.f;
import com.google.android.material.internal.q;
import z1.a;
import z1.j;

public class TextInputEditText extends k {
    private final Rect l;
    private boolean m;

    public TextInputEditText(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, a.q);
    }

    public TextInputEditText(Context context0, AttributeSet attributeSet0, int v) {
        super(V1.a.c(context0, attributeSet0, v, 0), attributeSet0, v);
        this.l = new Rect();
        TypedArray typedArray0 = q.i(context0, attributeSet0, z1.k.u7, v, j.k, new int[0]);
        this.setTextInputLayoutFocusedRectEnabled(typedArray0.getBoolean(z1.k.v7, false));
        typedArray0.recycle();
    }

    private boolean e(TextInputLayout textInputLayout0) {
        return textInputLayout0 != null && this.m;
    }

    @Override  // android.widget.TextView
    public void getFocusedRect(Rect rect0) {
        super.getFocusedRect(rect0);
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(this.e(textInputLayout0) && rect0 != null) {
            textInputLayout0.getFocusedRect(this.l);
            rect0.bottom = this.l.bottom;
        }
    }

    @Override  // android.view.View
    public boolean getGlobalVisibleRect(Rect rect0, Point point0) {
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(this.e(textInputLayout0)) {
            boolean z = textInputLayout0.getGlobalVisibleRect(rect0, point0);
            if(z && point0 != null) {
                point0.offset(-this.getScrollX(), -this.getScrollY());
            }
            return z;
        }
        return super.getGlobalVisibleRect(rect0, point0);
    }

    @Override  // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        return textInputLayout0 == null || !textInputLayout0.R() ? super.getHint() : textInputLayout0.getHint();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        return textInputLayout0 == null ? null : textInputLayout0.getHint();
    }

    private TextInputLayout getTextInputLayout() {
        for(ViewParent viewParent0 = this.getParent(); viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
            if(viewParent0 instanceof TextInputLayout) {
                return (TextInputLayout)viewParent0;
            }
        }
        return null;
    }

    @Override  // android.widget.TextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(textInputLayout0 != null && textInputLayout0.R() && super.getHint() == null && f.b()) {
            this.setHint("");
        }
    }

    @Override  // androidx.appcompat.widget.k
    public InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        if(inputConnection0 != null && editorInfo0.hintText == null) {
            editorInfo0.hintText = this.getHintFromLayout();
        }
        return inputConnection0;
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        this.getTextInputLayout();
    }

    @Override  // android.view.View
    public boolean requestRectangleOnScreen(Rect rect0) {
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(this.e(textInputLayout0) && rect0 != null) {
            int v = textInputLayout0.getHeight();
            int v1 = this.getHeight();
            this.l.set(rect0.left, rect0.top, rect0.right, rect0.bottom + (v - v1));
            return super.requestRectangleOnScreen(this.l);
        }
        return super.requestRectangleOnScreen(rect0);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.m = z;
    }
}

