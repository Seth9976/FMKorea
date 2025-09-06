package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.View;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarPreference extends Preference {
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
        int g;
        int h;

        static {
            SavedState.CREATOR = new a();
        }

        SavedState(Parcel parcel0) {
            super(parcel0);
            this.f = parcel0.readInt();
            this.g = parcel0.readInt();
            this.h = parcel0.readInt();
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // android.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.f);
            parcel0.writeInt(this.g);
            parcel0.writeInt(this.h);
        }
    }

    class androidx.preference.SeekBarPreference.a implements SeekBar.OnSeekBarChangeListener {
        final SeekBarPreference a;

        @Override  // android.widget.SeekBar$OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
            if(z) {
                SeekBarPreference seekBarPreference0 = SeekBarPreference.this;
                if(seekBarPreference0.e0 || !seekBarPreference0.Z) {
                    seekBarPreference0.L0(seekBar0);
                    return;
                }
            }
            SeekBarPreference.this.M0(v + SeekBarPreference.this.W);
        }

        @Override  // android.widget.SeekBar$OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar0) {
            SeekBarPreference.this.Z = true;
        }

        @Override  // android.widget.SeekBar$OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar0) {
            SeekBarPreference.this.Z = false;
            int v = seekBar0.getProgress();
            SeekBarPreference seekBarPreference0 = SeekBarPreference.this;
            if(v + seekBarPreference0.W != seekBarPreference0.V) {
                seekBarPreference0.L0(seekBar0);
            }
        }
    }

    class b implements View.OnKeyListener {
        final SeekBarPreference f;

        @Override  // android.view.View$OnKeyListener
        public boolean onKey(View view0, int v, KeyEvent keyEvent0) {
            if(keyEvent0.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference0 = SeekBarPreference.this;
            if(!seekBarPreference0.c0 && (v == 21 || v == 22)) {
                return false;
            }
            if(v != 23 && v != 66) {
                SeekBar seekBar0 = seekBarPreference0.a0;
                if(seekBar0 == null) {
                    Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                    return false;
                }
                return seekBar0.onKeyDown(v, keyEvent0);
            }
            return false;
        }
    }

    int V;
    int W;
    private int X;
    private int Y;
    boolean Z;
    SeekBar a0;
    private TextView b0;
    boolean c0;
    private boolean d0;
    boolean e0;
    private final SeekBar.OnSeekBarChangeListener f0;
    private final View.OnKeyListener g0;

    public SeekBarPreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, m.j);
    }

    public SeekBarPreference(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public SeekBarPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.f0 = new androidx.preference.SeekBarPreference.a(this);
        this.g0 = new b(this);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, s.H0, v, v1);
        this.W = typedArray0.getInt(s.K0, 0);
        this.H0(typedArray0.getInt(s.I0, 100));
        this.I0(typedArray0.getInt(s.L0, 0));
        this.c0 = typedArray0.getBoolean(s.J0, true);
        this.d0 = typedArray0.getBoolean(s.M0, false);
        this.e0 = typedArray0.getBoolean(s.N0, false);
        typedArray0.recycle();
    }

    public final void H0(int v) {
        int v1 = this.W;
        if(v < v1) {
            v = v1;
        }
        if(v != this.X) {
            this.X = v;
            this.N();
        }
    }

    public final void I0(int v) {
        if(v != this.Y) {
            this.Y = Math.min(this.X - this.W, Math.abs(v));
            this.N();
        }
    }

    public void J0(int v) {
        this.K0(v, true);
    }

    private void K0(int v, boolean z) {
        int v1 = this.W;
        if(v < v1) {
            v = v1;
        }
        int v2 = this.X;
        if(v > v2) {
            v = v2;
        }
        if(v != this.V) {
            this.V = v;
            this.M0(v);
            this.h0(v);
            if(z) {
                this.N();
            }
        }
    }

    void L0(SeekBar seekBar0) {
        int v = this.W + seekBar0.getProgress();
        if(v != this.V) {
            if(this.f(v)) {
                this.K0(v, false);
                return;
            }
            seekBar0.setProgress(this.V - this.W);
            this.M0(this.V);
        }
    }

    void M0(int v) {
        TextView textView0 = this.b0;
        if(textView0 != null) {
            textView0.setText(String.valueOf(v));
        }
    }

    @Override  // androidx.preference.Preference
    public void T(l l0) {
        super.T(l0);
        l0.a.setOnKeyListener(this.g0);
        this.a0 = (SeekBar)l0.M(o.c);
        TextView textView0 = (TextView)l0.M(o.d);
        this.b0 = textView0;
        if(this.d0) {
            textView0.setVisibility(0);
        }
        else {
            textView0.setVisibility(8);
            this.b0 = null;
        }
        SeekBar seekBar0 = this.a0;
        if(seekBar0 == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar0.setOnSeekBarChangeListener(this.f0);
        this.a0.setMax(this.X - this.W);
        int v = this.Y;
        if(v == 0) {
            this.Y = this.a0.getKeyProgressIncrement();
        }
        else {
            this.a0.setKeyProgressIncrement(v);
        }
        this.a0.setProgress(this.V - this.W);
        this.M0(this.V);
        this.a0.setEnabled(this.J());
    }

    @Override  // androidx.preference.Preference
    protected Object X(TypedArray typedArray0, int v) {
        return typedArray0.getInt(v, 0);
    }

    @Override  // androidx.preference.Preference
    protected void a0(Parcelable parcelable0) {
        if(parcelable0 != null && parcelable0.getClass().equals(SavedState.class)) {
            super.a0(((SavedState)parcelable0).getSuperState());
            this.V = ((SavedState)parcelable0).f;
            this.W = ((SavedState)parcelable0).g;
            this.X = ((SavedState)parcelable0).h;
            this.N();
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
        parcelable1.f = this.V;
        parcelable1.g = this.W;
        parcelable1.h = this.X;
        return parcelable1;
    }

    @Override  // androidx.preference.Preference
    protected void c0(Object object0) {
        if(object0 == null) {
            object0 = 0;
        }
        this.J0(this.x(((int)(((Integer)object0)))));
    }
}

