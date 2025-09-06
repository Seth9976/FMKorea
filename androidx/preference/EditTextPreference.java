package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.res.k;

public class EditTextPreference extends DialogPreference {
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
        String f;

        static {
            SavedState.CREATOR = new a();
        }

        SavedState(Parcel parcel0) {
            super(parcel0);
            this.f = parcel0.readString();
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // android.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeString(this.f);
        }
    }

    public interface androidx.preference.EditTextPreference.a {
    }

    public static final class b implements f {
        private static b a;

        @Override  // androidx.preference.Preference$f
        public CharSequence a(Preference preference0) {
            return this.c(((EditTextPreference)preference0));
        }

        public static b b() {
            if(b.a == null) {
                b.a = new b();
            }
            return b.a;
        }

        // 去混淆评级： 低(20)
        public CharSequence c(EditTextPreference editTextPreference0) {
            return TextUtils.isEmpty(editTextPreference0.O0()) ? editTextPreference0.m().getString(q.c) : editTextPreference0.O0();
        }
    }

    private String b0;

    public EditTextPreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, k.a(context0, m.d, 0x1010092));
    }

    public EditTextPreference(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public EditTextPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, s.w, v, v1);
        if(k.b(typedArray0, s.x, s.x, false)) {
            this.z0(b.b());
        }
        typedArray0.recycle();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.preference.Preference
    public boolean C0() {
        return TextUtils.isEmpty(this.b0) || super.C0();
    }

    androidx.preference.EditTextPreference.a N0() {
        return null;
    }

    public String O0() {
        return this.b0;
    }

    public void P0(String s) {
        boolean z = this.C0();
        this.b0 = s;
        this.i0(s);
        boolean z1 = this.C0();
        if(z1 != z) {
            this.O(z1);
        }
        this.N();
    }

    @Override  // androidx.preference.Preference
    protected Object X(TypedArray typedArray0, int v) {
        return typedArray0.getString(v);
    }

    @Override  // androidx.preference.Preference
    protected void a0(Parcelable parcelable0) {
        if(parcelable0 != null && parcelable0.getClass().equals(SavedState.class)) {
            super.a0(((SavedState)parcelable0).getSuperState());
            this.P0(((SavedState)parcelable0).f);
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
        parcelable1.f = this.O0();
        return parcelable1;
    }

    @Override  // androidx.preference.Preference
    protected void c0(Object object0) {
        this.P0(this.y(((String)object0)));
    }
}

