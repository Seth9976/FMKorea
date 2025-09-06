package Q;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class g implements TextWatcher {
    static class a extends f {
        private final Reference a;

        a(EditText editText0) {
            this.a = new WeakReference(editText0);
        }

        @Override  // androidx.emoji2.text.f$f
        public void b() {
            super.b();
            g.b(((EditText)this.a.get()), 1);
        }
    }

    private final EditText f;
    private final boolean g;
    private f h;
    private int i;
    private int j;
    private boolean k;

    g(EditText editText0, boolean z) {
        this.i = 0x7FFFFFFF;
        this.j = 0;
        this.f = editText0;
        this.g = z;
        this.k = true;
    }

    private f a() {
        if(this.h == null) {
            this.h = new a(this.f);
        }
        return this.h;
    }

    @Override  // android.text.TextWatcher
    public void afterTextChanged(Editable editable0) {
    }

    static void b(EditText editText0, int v) {
        if(v == 1 && editText0 != null && editText0.isAttachedToWindow()) {
            Editable editable0 = editText0.getEditableText();
            int v1 = Selection.getSelectionStart(editable0);
            int v2 = Selection.getSelectionEnd(editable0);
            androidx.emoji2.text.f.c().p(editable0);
            d.b(editable0, v1, v2);
        }
    }

    @Override  // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    public void c(boolean z) {
        if(this.k != z) {
            if(this.h != null) {
                androidx.emoji2.text.f.c().u(this.h);
            }
            this.k = z;
            if(z) {
                int v = androidx.emoji2.text.f.c().e();
                g.b(this.f, v);
            }
        }
    }

    // 去混淆评级： 中等(50)
    private boolean d() {
        return !this.k || !this.g;
    }

    @Override  // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        if(!this.f.isInEditMode() && !this.d() && v1 <= v2 && charSequence0 instanceof Spannable) {
            switch(androidx.emoji2.text.f.c().e()) {
                case 1: {
                    androidx.emoji2.text.f.c().s(((Spannable)charSequence0), v, v + v2, this.i, this.j);
                    return;
                }
                case 0: 
                case 3: {
                    androidx.emoji2.text.f.c().t(this.a());
                    break;
                }
            }
        }
    }
}

