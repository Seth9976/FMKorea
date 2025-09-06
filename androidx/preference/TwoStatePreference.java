package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public abstract class TwoStatePreference extends Preference {
    static class SavedState extends BaseSavedState {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0);
            }

            public SavedState[] b(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        boolean f;

        static {
            SavedState.CREATOR = new a();
        }

        SavedState(Parcel parcel0) {
            super(parcel0);
            this.f = parcel0.readInt() == 1;
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // android.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(((int)this.f));
        }
    }

    protected boolean V;
    private CharSequence W;
    private CharSequence X;
    private boolean Y;
    private boolean Z;

    public TwoStatePreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public TwoStatePreference(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public TwoStatePreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
    }

    // 去混淆评级： 中等(50)
    @Override  // androidx.preference.Preference
    public boolean C0() {
        return this.Z ? this.V || super.C0() : !this.V || super.C0();
    }

    public boolean H0() {
        return this.V;
    }

    public void I0(boolean z) {
        boolean z1 = this.V != z;
        if(z1 || !this.Y) {
            this.V = z;
            this.Y = true;
            this.g0(z);
            if(z1) {
                this.O(this.C0());
                this.N();
            }
        }
    }

    public void J0(boolean z) {
        this.Z = z;
    }

    public void K0(CharSequence charSequence0) {
        this.X = charSequence0;
        if(!this.H0()) {
            this.N();
        }
    }

    public void L0(CharSequence charSequence0) {
        this.W = charSequence0;
        if(this.H0()) {
            this.N();
        }
    }

    protected void M0(View view0) {
        boolean z;
        int v = 0;
        if(!(view0 instanceof TextView)) {
            return;
        }
        if(this.V && !TextUtils.isEmpty(this.W)) {
            ((TextView)view0).setText(this.W);
            z = false;
        }
        else if(this.V || TextUtils.isEmpty(this.X)) {
            z = true;
        }
        else {
            ((TextView)view0).setText(this.X);
            z = false;
        }
        if(z) {
            CharSequence charSequence0 = this.D();
            if(!TextUtils.isEmpty(charSequence0)) {
                ((TextView)view0).setText(charSequence0);
                z = false;
            }
        }
        if(z) {
            v = 8;
        }
        if(v != ((TextView)view0).getVisibility()) {
            ((TextView)view0).setVisibility(v);
        }
    }

    protected void N0(l l0) {
        this.M0(l0.M(0x1020010));
    }

    @Override  // androidx.preference.Preference
    protected void U() {
        super.U();
        boolean z = this.H0();
        if(this.f(Boolean.valueOf(!z))) {
            this.I0(!z);
        }
    }

    @Override  // androidx.preference.Preference
    protected Object X(TypedArray typedArray0, int v) {
        return Boolean.valueOf(typedArray0.getBoolean(v, false));
    }

    @Override  // androidx.preference.Preference
    protected void a0(Parcelable parcelable0) {
        if(parcelable0 != null && parcelable0.getClass().equals(SavedState.class)) {
            super.a0(((SavedState)parcelable0).getSuperState());
            this.I0(((SavedState)parcelable0).f);
            return;
        }
        super.a0(parcelable0);
    }

    @Override  // androidx.preference.Preference
    protected Parcelable b0() {
        Parcelable parcelable0 = super.b0();
        if(this.K()) {
            return parcelable0;
        }
        Parcelable parcelable1 = new SavedState(parcelable0);
        parcelable1.f = this.H0();
        return parcelable1;
    }

    @Override  // androidx.preference.Preference
    protected void c0(Object object0) {
        if(object0 == null) {
            object0 = Boolean.FALSE;
        }
        this.I0(this.w(((Boolean)object0).booleanValue()));
    }
}

