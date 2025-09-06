package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView.B;
import androidx.recyclerview.widget.RecyclerView.g;
import androidx.recyclerview.widget.RecyclerView.p;
import z1.e;

class k extends g {
    public static class b extends B {
        final TextView t;
        final MaterialCalendarGridView u;

        b(LinearLayout linearLayout0, boolean z) {
            super(linearLayout0);
            TextView textView0 = (TextView)linearLayout0.findViewById(e.u);
            this.t = textView0;
            Y.p0(textView0, true);
            this.u = (MaterialCalendarGridView)linearLayout0.findViewById(e.q);
            if(!z) {
                textView0.setVisibility(8);
            }
        }
    }

    private final CalendarConstraints c;
    private final m d;
    private final int e;

    k(Context context0, DateSelector dateSelector0, CalendarConstraints calendarConstraints0, DayViewDecorator dayViewDecorator0, m f$m0) {
        Month month0 = calendarConstraints0.g();
        Month month1 = calendarConstraints0.j();
        if(calendarConstraints0.k().b(month1) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if(month1.b(month0) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int v = f.z(context0);
        int v1 = h.y(context0) ? f.z(context0) : 0;
        this.e = j.j * v + v1;
        this.c = calendarConstraints0;
        this.d = f$m0;
        this.v(true);
    }

    int A(Month month0) {
        return this.c.k().o(month0);
    }

    public void B(b k$b0, int v) {
        class a implements AdapterView.OnItemClickListener {
            final MaterialCalendarGridView f;
            final k g;

            a(MaterialCalendarGridView materialCalendarGridView0) {
                this.f = materialCalendarGridView0;
                super();
            }

            @Override  // android.widget.AdapterView$OnItemClickListener
            public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
                if(this.f.b().p(v)) {
                    k.this.d.a(((long)this.f.b().d(v)));
                }
            }
        }

        Month month0 = this.c.k().n(v);
        String s = month0.l();
        k$b0.t.setText(s);
        MaterialCalendarGridView materialCalendarGridView0 = (MaterialCalendarGridView)k$b0.u.findViewById(e.q);
        if(materialCalendarGridView0.b() == null || !month0.equals(materialCalendarGridView0.b().f)) {
            j j0 = new j(month0, null, this.c, null);
            materialCalendarGridView0.setNumColumns(month0.i);
            materialCalendarGridView0.setAdapter(j0);
        }
        else {
            materialCalendarGridView0.invalidate();
            materialCalendarGridView0.b().o(materialCalendarGridView0);
        }
        materialCalendarGridView0.setOnItemClickListener(new a(this, materialCalendarGridView0));
    }

    public b C(ViewGroup viewGroup0, int v) {
        LinearLayout linearLayout0 = (LinearLayout)LayoutInflater.from(viewGroup0.getContext()).inflate(z1.g.t, viewGroup0, false);
        if(h.y(viewGroup0.getContext())) {
            linearLayout0.setLayoutParams(new p(-1, this.e));
            return new b(linearLayout0, true);
        }
        return new b(linearLayout0, false);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$g
    public int e() {
        return this.c.i();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$g
    public long f(int v) {
        return this.c.k().n(v).m();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$g
    public void m(B recyclerView$B0, int v) {
        this.B(((b)recyclerView$B0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$g
    public B o(ViewGroup viewGroup0, int v) {
        return this.C(viewGroup0, v);
    }

    Month y(int v) {
        return this.c.k().n(v);
    }

    CharSequence z(int v) {
        return this.y(v).l();
    }
}

