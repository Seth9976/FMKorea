package com.google.android.material.datepicker;

import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import z1.g;
import z1.i;

class e extends BaseAdapter {
    private final Calendar f;
    private final int g;
    private final int h;
    private static final int i;

    static {
        e.i = Build.VERSION.SDK_INT < 26 ? 1 : 4;
    }

    public e() {
        Calendar calendar0 = u.k();
        this.f = calendar0;
        this.g = calendar0.getMaximum(7);
        this.h = calendar0.getFirstDayOfWeek();
    }

    public e(int v) {
        Calendar calendar0 = u.k();
        this.f = calendar0;
        this.g = calendar0.getMaximum(7);
        this.h = v;
    }

    public Integer a(int v) {
        return v < this.g ? this.b(v) : null;
    }

    private int b(int v) {
        int v1 = v + this.h;
        return v1 <= this.g ? v1 : v1 - this.g;
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        return this.g;
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        return this.a(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return 0L;
    }

    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        View view1 = (TextView)view0;
        if(view0 == null) {
            view1 = (TextView)LayoutInflater.from(viewGroup0.getContext()).inflate(g.r, viewGroup0, false);
        }
        int v1 = this.b(v);
        this.f.set(7, v1);
        Configuration configuration0 = view1.getResources().getConfiguration();
        ((TextView)view1).setText(this.f.getDisplayName(7, e.i, configuration0.locale));
        String s = viewGroup0.getContext().getString(i.q);
        Locale locale0 = Locale.getDefault();
        view1.setContentDescription(String.format(s, this.f.getDisplayName(7, 2, locale0)));
        return view1;
    }
}

