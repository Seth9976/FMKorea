package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

final class b extends Preference {
    private long V;

    b(Context context0, List list0, long v) {
        super(context0);
        this.H0();
        this.I0(list0);
        this.V = v + 1000000L;
    }

    private void H0() {
        this.t0(p.a);
        this.q0(n.a);
        this.A0(q.b);
        this.x0(999);
    }

    private void I0(List list0) {
        ArrayList arrayList0 = new ArrayList();
        CharSequence charSequence0 = null;
        for(Object object0: list0) {
            Preference preference0 = (Preference)object0;
            CharSequence charSequence1 = preference0.F();
            boolean z = preference0 instanceof PreferenceGroup;
            if(z && !TextUtils.isEmpty(charSequence1)) {
                arrayList0.add(((PreferenceGroup)preference0));
            }
            if(arrayList0.contains(preference0.v())) {
                if(!z) {
                    continue;
                }
                arrayList0.add(((PreferenceGroup)preference0));
            }
            else if(!TextUtils.isEmpty(charSequence1)) {
                charSequence0 = charSequence0 == null ? charSequence1 : this.m().getString(q.e, new Object[]{charSequence0, charSequence1});
            }
        }
        this.y0(charSequence0);
    }

    @Override  // androidx.preference.Preference
    public void T(l l0) {
        super.T(l0);
        l0.Q(false);
    }

    @Override  // androidx.preference.Preference
    long q() {
        return this.V;
    }
}

