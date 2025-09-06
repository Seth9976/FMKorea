package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import z1.d;
import z1.i;

class z extends t {
    private int e;
    private EditText f;
    private final View.OnClickListener g;

    z(s s0, int v) {
        super(s0);
        this.e = d.a;
        this.g = (View view0) -> this.y(view0);
        if(v != 0) {
            this.e = v;
        }
    }

    @Override  // com.google.android.material.textfield.t
    void b(CharSequence charSequence0, int v, int v1, int v2) {
        this.r();
    }

    @Override  // com.google.android.material.textfield.t
    int c() {
        return i.A;
    }

    @Override  // com.google.android.material.textfield.t
    int d() {
        return this.e;
    }

    @Override  // com.google.android.material.textfield.t
    View.OnClickListener f() {
        return this.g;
    }

    @Override  // com.google.android.material.textfield.t
    boolean l() {
        return true;
    }

    @Override  // com.google.android.material.textfield.t
    boolean m() {
        return !this.w();
    }

    @Override  // com.google.android.material.textfield.t
    void n(EditText editText0) {
        this.f = editText0;
        this.r();
    }

    @Override  // com.google.android.material.textfield.t
    void s() {
        if(z.x(this.f)) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override  // com.google.android.material.textfield.t
    void u() {
        EditText editText0 = this.f;
        if(editText0 != null) {
            editText0.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    // 检测为 Lambda 实现
    public static void v(z z0, View view0) [...]

    private boolean w() {
        return this.f != null && this.f.getTransformationMethod() instanceof PasswordTransformationMethod;
    }

    private static boolean x(EditText editText0) {
        if(editText0 != null) {
            switch(editText0.getInputType()) {
                case 16: 
                case 0x80: 
                case 0x90: 
                case 0xE0: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    private void y(View view0) {
        EditText editText0 = this.f;
        if(editText0 == null) {
            return;
        }
        int v = editText0.getSelectionEnd();
        if(this.w()) {
            this.f.setTransformationMethod(null);
        }
        else {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if(v >= 0) {
            this.f.setSelection(v);
        }
        this.r();
    }
}

