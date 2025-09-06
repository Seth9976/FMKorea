package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.core.content.res.k;

public class SwitchPreference extends TwoStatePreference {
    class a implements CompoundButton.OnCheckedChangeListener {
        final SwitchPreference a;

        @Override  // android.widget.CompoundButton$OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
            if(!SwitchPreference.this.f(Boolean.valueOf(z))) {
                compoundButton0.setChecked(!z);
                return;
            }
            SwitchPreference.this.I0(z);
        }
    }

    private final a a0;
    private CharSequence b0;
    private CharSequence c0;

    public SwitchPreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, k.a(context0, m.l, 0x101036D));
    }

    public SwitchPreference(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public SwitchPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a0 = new a(this);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, s.O0, v, v1);
        this.L0(k.o(typedArray0, s.W0, s.P0));
        this.K0(k.o(typedArray0, s.V0, s.Q0));
        this.P0(k.o(typedArray0, s.Y0, s.S0));
        this.O0(k.o(typedArray0, s.X0, s.T0));
        this.J0(k.b(typedArray0, s.U0, s.R0, false));
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
        if(view0 instanceof Switch) {
            ((Switch)view0).setOnCheckedChangeListener(null);
        }
        if(view0 instanceof Checkable) {
            ((Checkable)view0).setChecked(this.V);
        }
        if(view0 instanceof Switch) {
            ((Switch)view0).setTextOn(this.b0);
            ((Switch)view0).setTextOff(this.c0);
            ((Switch)view0).setOnCheckedChangeListener(this.a0);
        }
    }

    private void R0(View view0) {
        if(!((AccessibilityManager)this.m().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        this.Q0(view0.findViewById(0x1020040));
        this.M0(view0.findViewById(0x1020010));
    }

    @Override  // androidx.preference.Preference
    public void T(l l0) {
        super.T(l0);
        this.Q0(l0.M(0x1020040));
        this.N0(l0);
    }

    @Override  // androidx.preference.Preference
    protected void f0(View view0) {
        super.f0(view0);
        this.R0(view0);
    }
}

