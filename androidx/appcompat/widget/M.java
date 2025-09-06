package androidx.appcompat.widget;

import Q.f;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import e.j;

class m {
    private final TextView a;
    private final f b;

    m(TextView textView0) {
        this.a = textView0;
        this.b = new f(textView0, false);
    }

    InputFilter[] a(InputFilter[] arr_inputFilter) {
        return this.b.a(arr_inputFilter);
    }

    public boolean b() {
        return this.b.b();
    }

    void c(AttributeSet attributeSet0, int v) {
        boolean z = true;
        TypedArray typedArray0 = this.a.getContext().obtainStyledAttributes(attributeSet0, j.g0, v, 0);
        try {
            if(typedArray0.hasValue(j.u0)) {
                z = typedArray0.getBoolean(14, true);
            }
        }
        finally {
            typedArray0.recycle();
        }
        this.e(z);
    }

    void d(boolean z) {
        this.b.c(z);
    }

    void e(boolean z) {
        this.b.d(z);
    }

    public TransformationMethod f(TransformationMethod transformationMethod0) {
        return this.b.e(transformationMethod0);
    }
}

