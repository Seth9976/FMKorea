package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference {
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
        Set f;

        static {
            SavedState.CREATOR = new a();
        }

        SavedState(Parcel parcel0) {
            super(parcel0);
            int v = parcel0.readInt();
            this.f = new HashSet();
            String[] arr_s = new String[v];
            parcel0.readStringArray(arr_s);
            Collections.addAll(this.f, arr_s);
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // android.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.f.size());
            parcel0.writeStringArray(((String[])this.f.toArray(new String[this.f.size()])));
        }
    }

    private CharSequence[] b0;
    private CharSequence[] c0;
    private Set d0;

    public MultiSelectListPreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, k.a(context0, m.b, 0x1010091));
    }

    public MultiSelectListPreference(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public MultiSelectListPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.d0 = new HashSet();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, s.E, v, v1);
        this.b0 = k.q(typedArray0, s.H, s.F);
        this.c0 = k.q(typedArray0, s.I, s.G);
        typedArray0.recycle();
    }

    public CharSequence[] N0() {
        return this.b0;
    }

    public CharSequence[] O0() {
        return this.c0;
    }

    public Set P0() {
        return this.d0;
    }

    public void Q0(Set set0) {
        this.d0.clear();
        this.d0.addAll(set0);
        this.j0(set0);
        this.N();
    }

    @Override  // androidx.preference.Preference
    protected Object X(TypedArray typedArray0, int v) {
        CharSequence[] arr_charSequence = typedArray0.getTextArray(v);
        HashSet hashSet0 = new HashSet();
        for(int v1 = 0; v1 < arr_charSequence.length; ++v1) {
            hashSet0.add(arr_charSequence[v1].toString());
        }
        return hashSet0;
    }

    @Override  // androidx.preference.Preference
    protected void a0(Parcelable parcelable0) {
        if(parcelable0 != null && parcelable0.getClass().equals(SavedState.class)) {
            super.a0(((SavedState)parcelable0).getSuperState());
            this.Q0(((SavedState)parcelable0).f);
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
        parcelable1.f = this.P0();
        return parcelable1;
    }

    @Override  // androidx.preference.Preference
    protected void c0(Object object0) {
        this.Q0(this.z(((Set)object0)));
    }
}

