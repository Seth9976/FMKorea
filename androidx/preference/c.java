package androidx.preference;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.c.a;

public class c extends g {
    int n;
    private CharSequence[] o;
    private CharSequence[] p;

    @Override  // androidx.preference.g
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            ListPreference listPreference0 = this.w();
            if(listPreference0.O0() == null || listPreference0.Q0() == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.n = listPreference0.N0(listPreference0.R0());
            this.o = listPreference0.O0();
            this.p = listPreference0.Q0();
            return;
        }
        this.n = bundle0.getInt("ListPreferenceDialogFragment.index", 0);
        this.o = bundle0.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.p = bundle0.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override  // androidx.preference.g
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("ListPreferenceDialogFragment.index", this.n);
        bundle0.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.o);
        bundle0.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.p);
    }

    @Override  // androidx.preference.g
    public void s(boolean z) {
        if(z) {
            int v = this.n;
            if(v >= 0) {
                String s = this.p[v].toString();
                ListPreference listPreference0 = this.w();
                if(listPreference0.f(s)) {
                    listPreference0.T0(s);
                }
            }
        }
    }

    @Override  // androidx.preference.g
    protected void t(a c$a0) {
        class androidx.preference.c.a implements DialogInterface.OnClickListener {
            final c f;

            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialogInterface0, int v) {
                c.this.n = v;
                c.this.onClick(dialogInterface0, -1);
                dialogInterface0.dismiss();
            }
        }

        super.t(c$a0);
        c$a0.o(this.o, this.n, new androidx.preference.c.a(this));
        c$a0.m(null, null);
    }

    private ListPreference w() {
        return (ListPreference)this.o();
    }

    public static c x(String s) {
        c c0 = new c();
        Bundle bundle0 = new Bundle(1);
        bundle0.putString("key", s);
        c0.setArguments(bundle0);
        return c0;
    }
}

