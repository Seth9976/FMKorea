package com.google.android.material.theme;

import O1.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.z;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.t;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.w;

public class MaterialComponentsViewInflater extends z {
    @Override  // androidx.appcompat.app.z
    protected c c(Context context0, AttributeSet attributeSet0) {
        return new w(context0, attributeSet0);
    }

    @Override  // androidx.appcompat.app.z
    protected e d(Context context0, AttributeSet attributeSet0) {
        return new MaterialButton(context0, attributeSet0);
    }

    @Override  // androidx.appcompat.app.z
    protected f e(Context context0, AttributeSet attributeSet0) {
        return new MaterialCheckBox(context0, attributeSet0);
    }

    @Override  // androidx.appcompat.app.z
    protected t k(Context context0, AttributeSet attributeSet0) {
        return new a(context0, attributeSet0);
    }

    @Override  // androidx.appcompat.app.z
    protected A o(Context context0, AttributeSet attributeSet0) {
        return new U1.a(context0, attributeSet0);
    }
}

