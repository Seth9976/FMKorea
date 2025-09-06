package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.res.k;

public abstract class DialogPreference extends Preference {
    public interface a {
        Preference a(CharSequence arg1);
    }

    private CharSequence V;
    private CharSequence W;
    private Drawable X;
    private CharSequence Y;
    private CharSequence Z;
    private int a0;

    public DialogPreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, k.a(context0, m.b, 0x1010091));
    }

    public DialogPreference(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public DialogPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, s.j, v, v1);
        String s = k.o(typedArray0, s.t, s.k);
        this.V = s;
        if(s == null) {
            this.V = this.F();
        }
        this.W = k.o(typedArray0, s.s, s.l);
        this.X = k.c(typedArray0, s.q, s.m);
        this.Y = k.o(typedArray0, s.v, s.n);
        this.Z = k.o(typedArray0, s.u, s.o);
        this.a0 = k.n(typedArray0, s.r, s.p, 0);
        typedArray0.recycle();
    }

    public Drawable H0() {
        return this.X;
    }

    public int I0() {
        return this.a0;
    }

    public CharSequence J0() {
        return this.W;
    }

    public CharSequence K0() {
        return this.V;
    }

    public CharSequence L0() {
        return this.Z;
    }

    public CharSequence M0() {
        return this.Y;
    }

    @Override  // androidx.preference.Preference
    protected void U() {
        this.B().t(this);
    }
}

