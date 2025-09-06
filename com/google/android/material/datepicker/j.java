package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import z1.g;

class j extends BaseAdapter {
    final Month f;
    private Collection g;
    b h;
    final CalendarConstraints i;
    static final int j;
    private static final int k;

    static {
        j.j = u.k().getMaximum(4);
        j.k = u.k().getMaximum(5) + u.k().getMaximum(7) - 1;
    }

    j(Month month0, DateSelector dateSelector0, CalendarConstraints calendarConstraints0, DayViewDecorator dayViewDecorator0) {
        this.f = month0;
        this.i = calendarConstraints0;
        this.g = dateSelector0.v();
    }

    int a(int v) {
        return this.b() + (v - 1);
    }

    int b() {
        return this.f.i(this.i.h());
    }

    private String c(Context context0, long v) {
        return d.a(context0, v, this.j(v), this.i(v), this.g(v));
    }

    public Long d(int v) {
        if(v >= this.b() && v <= this.k()) {
            int v1 = this.l(v);
            return this.f.j(v1);
        }
        return null;
    }

    public TextView e(int v, View view0, ViewGroup viewGroup0) {
        int v2;
        this.f(viewGroup0.getContext());
        TextView textView0 = (TextView)view0;
        if(view0 == null) {
            textView0 = (TextView)LayoutInflater.from(viewGroup0.getContext()).inflate(g.q, viewGroup0, false);
        }
        int v1 = v - this.b();
        if(v1 >= 0) {
            Month month0 = this.f;
            if(v1 < month0.j) {
                v2 = v1 + 1;
                textView0.setTag(month0);
                textView0.setText(String.format(textView0.getResources().getConfiguration().locale, "%d", v2));
                textView0.setVisibility(0);
                textView0.setEnabled(true);
                goto label_17;
            }
            goto label_14;
        }
        else {
        label_14:
            textView0.setVisibility(8);
            textView0.setEnabled(false);
            v2 = -1;
        }
    label_17:
        Long long0 = this.d(v);
        if(long0 == null) {
            return textView0;
        }
        this.m(textView0, ((long)long0), v2);
        return textView0;
    }

    private void f(Context context0) {
        if(this.h == null) {
            this.h = new b(context0);
        }
    }

    boolean g(long v) {
        throw null;
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        return j.k;
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        return this.d(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return (long)(v / this.f.i);
    }

    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        return this.e(v, view0, viewGroup0);
    }

    private boolean h(long v) {
        throw null;
    }

    @Override  // android.widget.BaseAdapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(long v) {
        throw null;
    }

    private boolean j(long v) {
        return u.i().getTimeInMillis() == v;
    }

    int k() {
        return this.b() + this.f.j - 1;
    }

    int l(int v) {
        return v - this.b() + 1;
    }

    private void m(TextView textView0, long v, int v1) {
        a a0;
        if(textView0 == null) {
            return;
        }
        textView0.setContentDescription(this.c(textView0.getContext(), v));
        if(this.i.f().t(v)) {
            textView0.setEnabled(true);
            boolean z = this.h(v);
            textView0.setSelected(z);
            if(z) {
                a0 = this.h.b;
            }
            else if(this.j(v)) {
                a0 = this.h.c;
            }
            else {
                a0 = this.h.a;
            }
        }
        else {
            textView0.setEnabled(false);
            a0 = this.h.g;
        }
        a0.b(textView0);
    }

    private void n(MaterialCalendarGridView materialCalendarGridView0, long v) {
        if(Month.g(v).equals(this.f)) {
            int v1 = this.f.k(v);
            this.m(((TextView)materialCalendarGridView0.getChildAt(materialCalendarGridView0.b().a(v1) - materialCalendarGridView0.getFirstVisiblePosition())), v, v1);
        }
    }

    public void o(MaterialCalendarGridView materialCalendarGridView0) {
        for(Object object0: this.g) {
            this.n(materialCalendarGridView0, ((long)(((Long)object0))));
        }
    }

    boolean p(int v) {
        return v >= this.b() && v <= this.k();
    }
}

