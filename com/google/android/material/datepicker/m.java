package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

abstract class m extends Fragment {
    protected final LinkedHashSet f;

    m() {
        this.f = new LinkedHashSet();
    }

    boolean m(l l0) {
        return this.f.add(l0);
    }

    void n() {
        this.f.clear();
    }
}

