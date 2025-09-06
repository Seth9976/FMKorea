package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class a extends g {
    class androidx.preference.a.a implements Runnable {
        final a f;

        @Override
        public void run() {
            a.this.z();
        }
    }

    private EditText n;
    private CharSequence o;
    private final Runnable p;
    private long q;

    public a() {
        this.p = () -> if(a.this.x()) {
            if(a.this.n != null && a.this.n.isFocused()) {
                if(((InputMethodManager)a.this.n.getContext().getSystemService("input_method")).showSoftInput(a.this.n, 0)) {
                    a.this.A(false);
                    return;
                }
                a.this.n.removeCallbacks(a.this.p);
                a.this.n.postDelayed(a.this.p, 50L);
                return;
            }
            a.this.A(false);
        };
        this.q = -1L;
    }

    private void A(boolean z) {
        this.q = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override  // androidx.preference.g
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            this.o = this.w().O0();
            return;
        }
        this.o = bundle0.getCharSequence("EditTextPreferenceDialogFragment.text");
    }

    @Override  // androidx.preference.g
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putCharSequence("EditTextPreferenceDialogFragment.text", this.o);
    }

    @Override  // androidx.preference.g
    protected boolean p() {
        return true;
    }

    @Override  // androidx.preference.g
    protected void q(View view0) {
        super.q(view0);
        EditText editText0 = (EditText)view0.findViewById(0x1020003);
        this.n = editText0;
        if(editText0 == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText0.requestFocus();
        this.n.setText(this.o);
        this.n.setSelection(this.n.getText().length());
        this.w().N0();
    }

    @Override  // androidx.preference.g
    public void s(boolean z) {
        if(z) {
            String s = this.n.getText().toString();
            EditTextPreference editTextPreference0 = this.w();
            if(editTextPreference0.f(s)) {
                editTextPreference0.P0(s);
            }
        }
    }

    @Override  // androidx.preference.g
    protected void v() {
        this.A(true);
        this.z();
    }

    private EditTextPreference w() {
        return (EditTextPreference)this.o();
    }

    private boolean x() {
        return this.q != -1L && this.q + 1000L > SystemClock.currentThreadTimeMillis();
    }

    public static a y(String s) {
        a a0 = new a();
        Bundle bundle0 = new Bundle(1);
        bundle0.putString("key", s);
        a0.setArguments(bundle0);
        return a0;
    }

    // 检测为 Lambda 实现
    void z() [...]
}

