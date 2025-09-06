package androidx.preference;

import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.c.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class d extends g {
    Set n;
    boolean o;
    CharSequence[] p;
    CharSequence[] q;

    public d() {
        this.n = new HashSet();
    }

    @Override  // androidx.preference.g
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            MultiSelectListPreference multiSelectListPreference0 = this.w();
            if(multiSelectListPreference0.N0() == null || multiSelectListPreference0.O0() == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.n.clear();
            this.n.addAll(multiSelectListPreference0.P0());
            this.o = false;
            this.p = multiSelectListPreference0.N0();
            this.q = multiSelectListPreference0.O0();
            return;
        }
        this.n.clear();
        this.n.addAll(bundle0.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.o = bundle0.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.p = bundle0.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.q = bundle0.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override  // androidx.preference.g
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.n));
        bundle0.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.o);
        bundle0.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.p);
        bundle0.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.q);
    }

    @Override  // androidx.preference.g
    public void s(boolean z) {
        if(z && this.o) {
            MultiSelectListPreference multiSelectListPreference0 = this.w();
            if(multiSelectListPreference0.f(this.n)) {
                multiSelectListPreference0.Q0(this.n);
            }
        }
        this.o = false;
    }

    @Override  // androidx.preference.g
    protected void t(a c$a0) {
        class androidx.preference.d.a implements DialogInterface.OnMultiChoiceClickListener {
            final d a;

            @Override  // android.content.DialogInterface$OnMultiChoiceClickListener
            public void onClick(DialogInterface dialogInterface0, int v, boolean z) {
                if(z) {
                    boolean z1 = d.this.o;
                    d.this.o = d.this.n.add(d.this.q[v].toString()) | z1;
                    return;
                }
                boolean z2 = d.this.o;
                d.this.o = d.this.n.remove(d.this.q[v].toString()) | z2;
            }
        }

        super.t(c$a0);
        int v = this.q.length;
        boolean[] arr_z = new boolean[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_z[v1] = this.n.contains(this.q[v1].toString());
        }
        c$a0.g(this.p, arr_z, new androidx.preference.d.a(this));
    }

    private MultiSelectListPreference w() {
        return (MultiSelectListPreference)this.o();
    }

    public static d x(String s) {
        d d0 = new d();
        Bundle bundle0 = new Bundle(1);
        bundle0.putString("key", s);
        d0.setArguments(bundle0);
        return d0;
    }
}

