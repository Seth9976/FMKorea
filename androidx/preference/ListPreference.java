package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.res.k;

public class ListPreference extends DialogPreference {
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

    public static final class androidx.preference.ListPreference.a implements f {
        private static androidx.preference.ListPreference.a a;

        @Override  // androidx.preference.Preference$f
        public CharSequence a(Preference preference0) {
            return this.c(((ListPreference)preference0));
        }

        public static androidx.preference.ListPreference.a b() {
            if(androidx.preference.ListPreference.a.a == null) {
                androidx.preference.ListPreference.a.a = new androidx.preference.ListPreference.a();
            }
            return androidx.preference.ListPreference.a.a;
        }

        public CharSequence c(ListPreference listPreference0) {
            return TextUtils.isEmpty(listPreference0.P0()) ? listPreference0.m().getString(q.c) : listPreference0.P0();
        }
    }

    private CharSequence[] b0;
    private CharSequence[] c0;
    private String d0;
    private String e0;
    private boolean f0;

    public ListPreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, k.a(context0, m.b, 0x1010091));
    }

    public ListPreference(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public ListPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, s.y, v, v1);
        this.b0 = k.q(typedArray0, s.B, s.z);
        this.c0 = k.q(typedArray0, s.C, s.A);
        if(k.b(typedArray0, s.D, s.D, false)) {
            this.z0(androidx.preference.ListPreference.a.b());
        }
        typedArray0.recycle();
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, s.J, v, v1);
        this.e0 = k.o(typedArray1, s.r0, s.R);
        typedArray1.recycle();
    }

    @Override  // androidx.preference.Preference
    public CharSequence D() {
        if(this.E() != null) {
            return this.E().a(this);
        }
        CharSequence charSequence0 = this.P0();
        CharSequence charSequence1 = super.D();
        String s = this.e0;
        if(s == null) {
            return charSequence1;
        }
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        CharSequence charSequence2 = String.format(s, charSequence0);
        if(TextUtils.equals(charSequence2, charSequence1)) {
            return charSequence1;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return charSequence2;
    }

    public int N0(String s) {
        if(s != null) {
            CharSequence[] arr_charSequence = this.c0;
            if(arr_charSequence != null) {
                for(int v = arr_charSequence.length - 1; v >= 0; --v) {
                    if(TextUtils.equals(this.c0[v].toString(), s)) {
                        return v;
                    }
                }
            }
        }
        return -1;
    }

    public CharSequence[] O0() {
        return this.b0;
    }

    public CharSequence P0() {
        int v = this.S0();
        if(v >= 0) {
            return this.b0 == null ? null : this.b0[v];
        }
        return null;
    }

    public CharSequence[] Q0() {
        return this.c0;
    }

    public String R0() {
        return this.d0;
    }

    private int S0() {
        return this.N0(this.d0);
    }

    public void T0(String s) {
        boolean z = TextUtils.equals(this.d0, s);
        if(!z || !this.f0) {
            this.d0 = s;
            this.f0 = true;
            this.i0(s);
            if(!z) {
                this.N();
            }
        }
    }

    @Override  // androidx.preference.Preference
    protected Object X(TypedArray typedArray0, int v) {
        return typedArray0.getString(v);
    }

    @Override  // androidx.preference.Preference
    protected void a0(Parcelable parcelable0) {
        if(parcelable0 != null && parcelable0.getClass().equals(SavedState.class)) {
            super.a0(((SavedState)parcelable0).getSuperState());
            this.T0(((SavedState)parcelable0).f);
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
        parcelable1.f = this.R0();
        return parcelable1;
    }

    @Override  // androidx.preference.Preference
    protected void c0(Object object0) {
        this.T0(this.y(((String)object0)));
    }
}

