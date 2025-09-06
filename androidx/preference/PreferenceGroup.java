package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.collection.g;
import androidx.core.content.res.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class PreferenceGroup extends Preference {
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
        int f;

        static {
            SavedState.CREATOR = new a();
        }

        SavedState(Parcel parcel0) {
            super(parcel0);
            this.f = parcel0.readInt();
        }

        SavedState(Parcelable parcelable0, int v) {
            super(parcelable0);
            this.f = v;
        }

        @Override  // android.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.f);
        }
    }

    class androidx.preference.PreferenceGroup.a implements Runnable {
        final PreferenceGroup f;

        @Override
        public void run() {
            synchronized(this) {
                PreferenceGroup.this.V.clear();
            }
        }
    }

    public interface b {
    }

    final g V;
    private final Handler W;
    private final List X;
    private boolean Y;
    private int Z;
    private boolean a0;
    private int b0;
    private final Runnable c0;

    public PreferenceGroup(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public PreferenceGroup(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public PreferenceGroup(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.V = new g();
        this.W = new Handler(Looper.getMainLooper());
        this.Y = true;
        this.Z = 0;
        this.a0 = false;
        this.b0 = 0x7FFFFFFF;
        this.c0 = new androidx.preference.PreferenceGroup.a(this);
        this.X = new ArrayList();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, s.A0, v, v1);
        this.Y = k.b(typedArray0, s.C0, s.C0, true);
        if(typedArray0.hasValue(s.B0)) {
            this.P0(k.d(typedArray0, 1, 1, 0x7FFFFFFF));
        }
        typedArray0.recycle();
    }

    public boolean H0(Preference preference0) {
        long v3;
        if(this.X.contains(preference0)) {
            return true;
        }
        if(preference0.s() != null) {
            PreferenceGroup preferenceGroup0;
            for(preferenceGroup0 = this; preferenceGroup0.v() != null; preferenceGroup0 = preferenceGroup0.v()) {
            }
            String s = preference0.s();
            if(preferenceGroup0.I0(s) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + s + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if(preference0.u() == 0x7FFFFFFF) {
            if(this.Y) {
                int v = this.Z;
                this.Z = v + 1;
                preference0.x0(v);
            }
            if(preference0 instanceof PreferenceGroup) {
                ((PreferenceGroup)preference0).Q0(this.Y);
            }
        }
        int v1 = Collections.binarySearch(this.X, preference0);
        if(v1 < 0) {
            v1 = -v1 - 1;
        }
        if(!this.O0(preference0)) {
            return false;
        }
        synchronized(this) {
            this.X.add(v1, preference0);
        }
        j j0 = this.B();
        String s1 = preference0.s();
        if(s1 == null || !this.V.containsKey(s1)) {
            v3 = j0.g();
        }
        else {
            v3 = (long)(((Long)this.V.get(s1)));
            this.V.remove(s1);
        }
        preference0.S(j0, v3);
        preference0.b(this);
        if(this.a0) {
            preference0.Q();
        }
        this.P();
        return true;
    }

    public Preference I0(CharSequence charSequence0) {
        if(charSequence0 == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if(TextUtils.equals(this.s(), charSequence0)) {
            return this;
        }
        int v = this.M0();
        for(int v1 = 0; v1 < v; ++v1) {
            Preference preference0 = this.L0(v1);
            if(TextUtils.equals(preference0.s(), charSequence0)) {
                return preference0;
            }
            if(preference0 instanceof PreferenceGroup) {
                Preference preference1 = ((PreferenceGroup)preference0).I0(charSequence0);
                if(preference1 != null) {
                    return preference1;
                }
            }
        }
        return null;
    }

    public int J0() {
        return this.b0;
    }

    public b K0() [...] // Inlined contents

    public Preference L0(int v) {
        return (Preference)this.X.get(v);
    }

    public int M0() {
        return this.X.size();
    }

    protected boolean N0() {
        return true;
    }

    @Override  // androidx.preference.Preference
    public void O(boolean z) {
        super.O(z);
        int v = this.M0();
        for(int v1 = 0; v1 < v; ++v1) {
            this.L0(v1).Z(this, z);
        }
    }

    protected boolean O0(Preference preference0) {
        preference0.Z(this, this.C0());
        return true;
    }

    public void P0(int v) {
        if(v != 0x7FFFFFFF && !this.H()) {
            Log.e("PreferenceGroup", this.getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.b0 = v;
    }

    @Override  // androidx.preference.Preference
    public void Q() {
        super.Q();
        this.a0 = true;
        int v = this.M0();
        for(int v1 = 0; v1 < v; ++v1) {
            this.L0(v1).Q();
        }
    }

    public void Q0(boolean z) {
        this.Y = z;
    }

    void R0() {
        synchronized(this) {
            Collections.sort(this.X);
        }
    }

    @Override  // androidx.preference.Preference
    public void W() {
        super.W();
        this.a0 = false;
        int v1 = this.M0();
        for(int v = 0; v < v1; ++v) {
            this.L0(v).W();
        }
    }

    @Override  // androidx.preference.Preference
    protected void a0(Parcelable parcelable0) {
        if(parcelable0 != null && parcelable0.getClass().equals(SavedState.class)) {
            this.b0 = ((SavedState)parcelable0).f;
            super.a0(((SavedState)parcelable0).getSuperState());
            return;
        }
        super.a0(parcelable0);
    }

    @Override  // androidx.preference.Preference
    protected Parcelable b0() {
        return new SavedState(super.b0(), this.b0);
    }

    @Override  // androidx.preference.Preference
    protected void i(Bundle bundle0) {
        super.i(bundle0);
        int v = this.M0();
        for(int v1 = 0; v1 < v; ++v1) {
            this.L0(v1).i(bundle0);
        }
    }

    @Override  // androidx.preference.Preference
    protected void j(Bundle bundle0) {
        super.j(bundle0);
        int v = this.M0();
        for(int v1 = 0; v1 < v; ++v1) {
            this.L0(v1).j(bundle0);
        }
    }
}

