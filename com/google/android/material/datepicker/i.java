package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.E;

public final class i extends m {
    private int g;
    private CalendarConstraints h;

    static i o(DateSelector dateSelector0, int v, CalendarConstraints calendarConstraints0) {
        i i0 = new i();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("THEME_RES_ID_KEY", v);
        bundle0.putParcelable("DATE_SELECTOR_KEY", dateSelector0);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints0);
        i0.setArguments(bundle0);
        return i0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        this.g = bundle0.getInt("THEME_RES_ID_KEY");
        E.a(bundle0.getParcelable("DATE_SELECTOR_KEY"));
        this.h = (CalendarConstraints)bundle0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override  // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        class a extends l {
            final i a;

        }

        layoutInflater0.cloneInContext(new ContextThemeWrapper(this.getContext(), this.g));
        new a(this);
        throw null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("THEME_RES_ID_KEY", this.g);
        bundle0.putParcelable("DATE_SELECTOR_KEY", null);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.h);
    }
}

