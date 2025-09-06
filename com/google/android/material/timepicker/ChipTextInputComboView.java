package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.Y;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.p;
import com.google.android.material.internal.t;
import com.google.android.material.textfield.TextInputLayout;
import z1.e;
import z1.g;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    static abstract class a {
    }

    class b extends p {
        final ChipTextInputComboView f;

        private b() {
        }

        b(a chipTextInputComboView$a0) {
        }

        @Override  // android.text.TextWatcher
        public void afterTextChanged(Editable editable0) {
            if(TextUtils.isEmpty(editable0)) {
                ChipTextInputComboView.this.f.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String s = ChipTextInputComboView.this.c(editable0);
            Chip chip0 = ChipTextInputComboView.this.f;
            if(TextUtils.isEmpty(s)) {
                s = ChipTextInputComboView.this.c("00");
            }
            chip0.setText(s);
        }
    }

    private final Chip f;
    private final TextInputLayout g;
    private final EditText h;
    private TextWatcher i;
    private TextView j;

    public ChipTextInputComboView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ChipTextInputComboView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
        Chip chip0 = (Chip)layoutInflater0.inflate(g.m, this, false);
        this.f = chip0;
        chip0.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout0 = (TextInputLayout)layoutInflater0.inflate(g.n, this, false);
        this.g = textInputLayout0;
        EditText editText0 = textInputLayout0.getEditText();
        this.h = editText0;
        editText0.setVisibility(4);
        b chipTextInputComboView$b0 = new b(this, null);
        this.i = chipTextInputComboView$b0;
        editText0.addTextChangedListener(chipTextInputComboView$b0);
        this.d();
        this.addView(chip0);
        this.addView(textInputLayout0);
        this.j = (TextView)this.findViewById(e.n);
        editText0.setId(Y.k());
        Y.A0(this.j, editText0.getId());
        editText0.setSaveEnabled(false);
        editText0.setLongClickable(false);
    }

    private String c(CharSequence charSequence0) {
        return TimeModel.a(this.getResources(), charSequence0);
    }

    private void d() {
        if(Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList0 = this.getContext().getResources().getConfiguration().getLocales();
            com.google.android.material.timepicker.a.a(this.h, localeList0);
        }
    }

    @Override  // android.widget.Checkable
    public boolean isChecked() {
        return this.f.isChecked();
    }

    @Override  // android.view.View
    protected void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.d();
    }

    @Override  // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f.setChecked(z);
        this.h.setVisibility((z ? 0 : 4));
        this.f.setVisibility((z ? 8 : 0));
        if(this.isChecked()) {
            t.k(this.h, false);
        }
    }

    @Override  // android.view.View
    public void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.f.setOnClickListener(view$OnClickListener0);
    }

    @Override  // android.view.View
    public void setTag(int v, Object object0) {
        this.f.setTag(v, object0);
    }

    @Override  // android.widget.Checkable
    public void toggle() {
        this.f.toggle();
    }
}

