package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

abstract class n {
    static InputConnection a(InputConnection inputConnection0, EditorInfo editorInfo0, View view0) {
        if(inputConnection0 != null && editorInfo0.hintText == null) {
            for(ViewParent viewParent0 = view0.getParent(); viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
            }
        }
        return inputConnection0;
    }
}

