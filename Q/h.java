package Q;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.f;

class h implements TransformationMethod {
    private final TransformationMethod a;

    h(TransformationMethod transformationMethod0) {
        this.a = transformationMethod0;
    }

    public TransformationMethod a() {
        return this.a;
    }

    @Override  // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence0, View view0) {
        if(view0.isInEditMode()) {
            return charSequence0;
        }
        TransformationMethod transformationMethod0 = this.a;
        if(transformationMethod0 != null) {
            charSequence0 = transformationMethod0.getTransformation(charSequence0, view0);
        }
        return charSequence0 == null || f.c().e() != 1 ? charSequence0 : f.c().p(charSequence0);
    }

    @Override  // android.text.method.TransformationMethod
    public void onFocusChanged(View view0, CharSequence charSequence0, boolean z, int v, Rect rect0) {
        TransformationMethod transformationMethod0 = this.a;
        if(transformationMethod0 != null) {
            transformationMethod0.onFocusChanged(view0, charSequence0, z, v, rect0);
        }
    }
}

