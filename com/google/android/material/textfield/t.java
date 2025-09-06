package com.google.android.material.textfield;

import C.c.a;
import C.z;
import android.content.Context;
import android.text.Editable;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

abstract class t {
    final TextInputLayout a;
    final s b;
    final Context c;
    final CheckableImageButton d;

    t(s s0) {
        this.a = s0.f;
        this.b = s0;
        this.c = s0.getContext();
        this.d = s0.r();
    }

    void a(Editable editable0) {
    }

    void b(CharSequence charSequence0, int v, int v1, int v2) {
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    a h() {
        return null;
    }

    boolean i(int v) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(EditText editText0) {
    }

    void o(View view0, z z0) {
    }

    void p(View view0, AccessibilityEvent accessibilityEvent0) {
    }

    void q(boolean z) {
    }

    final void r() {
        this.b.L(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }
}

