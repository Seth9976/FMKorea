package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import androidx.core.content.res.k;

public class CheckBoxPreference extends TwoStatePreference {
    class a implements CompoundButton.OnCheckedChangeListener {
        final CheckBoxPreference a;

        @Override  // android.widget.CompoundButton$OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
            if(!CheckBoxPreference.this.f(Boolean.valueOf(z))) {
                compoundButton0.setChecked(!z);
                return;
            }
            CheckBoxPreference.this.I0(z);
        }
    }

    private final a a0;

    public CheckBoxPreference(Context context0) {
        this(context0, null);
    }

    public CheckBoxPreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, k.a(context0, m.a, 0x101008F));
    }

    public CheckBoxPreference(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public CheckBoxPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a0 = new a(this);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, s.c, v, v1);
        this.L0(k.o(typedArray0, s.i, s.d));
        this.K0(k.o(typedArray0, s.h, s.e));
        this.J0(k.b(typedArray0, s.g, s.f, false));
        typedArray0.recycle();
    }

    private void O0(View view0) {
        if(view0 instanceof CompoundButton) {
            ((CompoundButton)view0).setOnCheckedChangeListener(null);
        }
        if(view0 instanceof Checkable) {
            ((Checkable)view0).setChecked(this.V);
        }
        if(view0 instanceof CompoundButton) {
            ((CompoundButton)view0).setOnCheckedChangeListener(this.a0);
        }
    }

    private void P0(View view0) {
        if(!((AccessibilityManager)this.m().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        this.O0(view0.findViewById(0x1020001));
        this.M0(view0.findViewById(0x1020010));
    }

    @Override  // androidx.preference.Preference
    public void T(l l0) {
        super.T(l0);
        this.O0(l0.M(0x1020001));
        this.N0(l0);
    }

    @Override  // androidx.preference.Preference
    protected void f0(View view0) {
        super.f0(view0);
        this.P0(view0);
    }
}

