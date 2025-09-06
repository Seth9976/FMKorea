package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference extends ListPreference {
    class a implements AdapterView.OnItemSelectedListener {
        final DropDownPreference f;

        @Override  // android.widget.AdapterView$OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
            if(v >= 0) {
                String s = DropDownPreference.this.Q0()[v].toString();
                if(!s.equals(DropDownPreference.this.R0()) && DropDownPreference.this.f(s)) {
                    DropDownPreference.this.T0(s);
                }
            }
        }

        @Override  // android.widget.AdapterView$OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView0) {
        }
    }

    private final Context g0;
    private final ArrayAdapter h0;
    private Spinner i0;
    private final AdapterView.OnItemSelectedListener j0;

    public DropDownPreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, m.c);
    }

    public DropDownPreference(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public DropDownPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.j0 = new a(this);
        this.g0 = context0;
        this.h0 = this.U0();
        this.W0();
    }

    @Override  // androidx.preference.Preference
    protected void N() {
        super.N();
        ArrayAdapter arrayAdapter0 = this.h0;
        if(arrayAdapter0 != null) {
            arrayAdapter0.notifyDataSetChanged();
        }
    }

    @Override  // androidx.preference.Preference
    public void T(l l0) {
        Spinner spinner0 = (Spinner)l0.a.findViewById(o.e);
        this.i0 = spinner0;
        spinner0.setAdapter(this.h0);
        this.i0.setOnItemSelectedListener(this.j0);
        this.i0.setSelection(this.V0(this.R0()));
        super.T(l0);
    }

    @Override  // androidx.preference.DialogPreference
    protected void U() {
        this.i0.performClick();
    }

    protected ArrayAdapter U0() {
        return new ArrayAdapter(this.g0, 0x1090009);
    }

    private int V0(String s) {
        CharSequence[] arr_charSequence = this.Q0();
        if(s != null && arr_charSequence != null) {
            for(int v = arr_charSequence.length - 1; v >= 0; --v) {
                if(TextUtils.equals(arr_charSequence[v].toString(), s)) {
                    return v;
                }
            }
        }
        return -1;
    }

    private void W0() {
        this.h0.clear();
        if(this.O0() != null) {
            CharSequence[] arr_charSequence = this.O0();
            for(int v = 0; v < arr_charSequence.length; ++v) {
                this.h0.add(arr_charSequence[v].toString());
            }
        }
    }
}

