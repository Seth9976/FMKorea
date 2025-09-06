package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.res.k;

public class SwitchPreferenceCompat extends TwoStatePreference {
    class a implements CompoundButton.OnCheckedChangeListener {
        final SwitchPreferenceCompat a;

        @Override  // android.widget.CompoundButton$OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
            if(!SwitchPreferenceCompat.this.f(Boolean.valueOf(z))) {
                compoundButton0.setChecked(!z);
                return;
            }
            SwitchPreferenceCompat.this.I0(z);
        }
    }

    private final a a0;
    private CharSequence b0;
    private CharSequence c0;

    public SwitchPreferenceCompat(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, m.k);
    }

    public SwitchPreferenceCompat(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public SwitchPreferenceCompat(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a0 = new a(this);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, s.Z0, v, v1);
        this.L0(k.o(typedArray0, s.h1, s.a1));
        this.K0(k.o(typedArray0, s.g1, s.b1));
        this.P0(k.o(typedArray0, s.j1, s.d1));
        this.O0(k.o(typedArray0, s.i1, s.e1));
        this.J0(k.b(typedArray0, s.f1, s.c1, false));
        typedArray0.recycle();
    }

    public void O0(CharSequence charSequence0) {
        this.c0 = charSequence0;
        this.N();
    }

    public void P0(CharSequence charSequence0) {
        this.b0 = charSequence0;
        this.N();
    }

    private void Q0(View view0) {
        if(view0 instanceof SwitchCompat) {
            ((SwitchCompat)view0).setOnCheckedChangeListener(null);
        }
        if(view0 instanceof Checkable) {
            ((Checkable)view0).setChecked(this.V);
        }
        if(view0 instanceof SwitchCompat) {
            ((SwitchCompat)view0).setTextOn(this.b0);
            ((SwitchCompat)view0).setTextOff(this.c0);
            ((SwitchCompat)view0).setOnCheckedChangeListener(this.a0);
        }
    }

    private void R0(View view0) {
        if(!((AccessibilityManager)this.m().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        this.Q0(view0.findViewById(o.f));
        this.M0(view0.findViewById(0x1020010));
    }

    @Override  // androidx.preference.Preference
    public void T(l l0) {
        super.T(l0);
        this.Q0(l0.M(o.f));
        this.N0(l0);
    }

    @Override  // androidx.preference.Preference
    protected void f0(View view0) {
        super.f0(view0);
        this.R0(view0);
    }
}

