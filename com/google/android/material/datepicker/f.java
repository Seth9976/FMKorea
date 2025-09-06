package com.google.android.material.datepicker;

import C.z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.appcompat.app.E;
import androidx.core.view.Y;
import androidx.core.view.a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.s;
import androidx.recyclerview.widget.RecyclerView.y;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import z1.c;
import z1.g;
import z1.i;

public final class f extends m {
    static enum l {
        DAY,
        YEAR;

    }

    interface com.google.android.material.datepicker.f.m {
        void a(long arg1);
    }

    private int g;
    private CalendarConstraints h;
    private Month i;
    private l j;
    private b k;
    private RecyclerView l;
    private RecyclerView m;
    private View n;
    private View o;
    private View p;
    private View q;
    static final Object r;
    static final Object s;
    static final Object t;
    static final Object u;

    static {
        f.r = "MONTHS_VIEW_GROUP_TAG";
        f.s = "NAVIGATION_PREV_TAG";
        f.t = "NAVIGATION_NEXT_TAG";
        f.u = "SELECTOR_TOGGLE_TAG";
    }

    private static int A(Context context0) {
        Resources resources0 = context0.getResources();
        int v = resources0.getDimensionPixelSize(c.i0);
        int v1 = resources0.getDimensionPixelOffset(c.j0);
        int v2 = resources0.getDimensionPixelOffset(c.h0);
        int v3 = resources0.getDimensionPixelSize(c.d0);
        int v4 = resources0.getDimensionPixelSize(c.b0);
        int v5 = resources0.getDimensionPixelOffset(c.g0);
        int v6 = resources0.getDimensionPixelOffset(c.Z);
        return v + v1 + v2 + v3 + (v4 * j.j + (j.j - 1) * v5) + v6;
    }

    LinearLayoutManager B() {
        return (LinearLayoutManager)this.m.getLayoutManager();
    }

    public static f C(DateSelector dateSelector0, int v, CalendarConstraints calendarConstraints0, DayViewDecorator dayViewDecorator0) {
        f f0 = new f();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("THEME_RES_ID_KEY", v);
        bundle0.putParcelable("GRID_SELECTOR_KEY", dateSelector0);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints0);
        bundle0.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator0);
        bundle0.putParcelable("CURRENT_MONTH_KEY", calendarConstraints0.j());
        f0.setArguments(bundle0);
        return f0;
    }

    private void D(int v) {
        class com.google.android.material.datepicker.f.b implements Runnable {
            final int f;
            final f g;

            com.google.android.material.datepicker.f.b(int v) {
                this.f = v;
                super();
            }

            @Override
            public void run() {
                f.o(f.this).q1(this.f);
            }
        }

        this.m.post(new com.google.android.material.datepicker.f.b(this, v));
    }

    void E(Month month0) {
        k k0 = (k)this.m.getAdapter();
        int v = k0.A(month0);
        int v1 = v - k0.A(this.i);
        boolean z = false;
        boolean z1 = Math.abs(v1) > 3;
        if(v1 > 0) {
            z = true;
        }
        this.i = month0;
        if(z1 && z) {
            this.m.i1(v - 3);
            this.D(v);
            return;
        }
        if(z1) {
            this.m.i1(v + 3);
            this.D(v);
            return;
        }
        this.D(v);
    }

    void F(l f$l0) {
        this.j = f$l0;
        if(f$l0 == l.g) {
            this.l.getLayoutManager().B1(((v)this.l.getAdapter()).x(this.i.h));
            this.p.setVisibility(0);
            this.q.setVisibility(8);
            this.n.setVisibility(8);
            this.o.setVisibility(8);
            return;
        }
        if(f$l0 == l.f) {
            this.p.setVisibility(8);
            this.q.setVisibility(0);
            this.n.setVisibility(0);
            this.o.setVisibility(0);
            this.E(this.i);
        }
    }

    private void G() {
        class com.google.android.material.datepicker.f.f extends a {
            final f d;

            @Override  // androidx.core.view.a
            public void g(View view0, z z0) {
                super.g(view0, z0);
                z0.F0(false);
            }
        }

        Y.o0(this.m, new com.google.android.material.datepicker.f.f(this));
    }

    // 检测为 Lambda 实现
    void H() [...]

    @Override  // com.google.android.material.datepicker.m
    public boolean m(com.google.android.material.datepicker.l l0) {
        return super.m(l0);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        this.g = bundle0.getInt("THEME_RES_ID_KEY");
        E.a(bundle0.getParcelable("GRID_SELECTOR_KEY"));
        this.h = (CalendarConstraints)bundle0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        E.a(bundle0.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.i = (Month)bundle0.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override  // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        class com.google.android.material.datepicker.f.c extends a {
            final f d;

            @Override  // androidx.core.view.a
            public void g(View view0, z z0) {
                super.g(view0, z0);
                z0.o0(null);
            }
        }


        class d extends n {
            final int I;
            final f J;

            d(Context context0, int v, boolean z, int v1) {
                this.I = v1;
                super(context0, v, z);
            }

            @Override  // androidx.recyclerview.widget.LinearLayoutManager
            protected void Q1(y recyclerView$y0, int[] arr_v) {
                if(this.I == 0) {
                    arr_v[0] = f.this.m.getWidth();
                    arr_v[1] = f.this.m.getWidth();
                    return;
                }
                arr_v[0] = f.this.m.getHeight();
                arr_v[1] = f.this.m.getHeight();
            }
        }


        class e implements com.google.android.material.datepicker.f.m {
            final f a;

            @Override  // com.google.android.material.datepicker.f$m
            public void a(long v) {
                if(!f.this.h.f().t(v)) {
                    return;
                }
                f.q(f.this);
                throw null;
            }
        }

        int v1;
        int v;
        ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(this.getContext(), this.g);
        this.k = new b(contextThemeWrapper0);
        LayoutInflater layoutInflater1 = layoutInflater0.cloneInContext(contextThemeWrapper0);
        Month month0 = this.h.k();
        if(h.y(contextThemeWrapper0)) {
            v = g.u;
            v1 = 1;
        }
        else {
            v = g.s;
            v1 = 0;
        }
        View view0 = layoutInflater1.inflate(v, viewGroup0, false);
        view0.setMinimumHeight(f.A(this.requireContext()));
        GridView gridView0 = (GridView)view0.findViewById(z1.e.x);
        Y.o0(gridView0, new com.google.android.material.datepicker.f.c(this));
        int v2 = this.h.h();
        gridView0.setAdapter((v2 <= 0 ? new com.google.android.material.datepicker.e() : new com.google.android.material.datepicker.e(v2)));
        gridView0.setNumColumns(month0.i);
        gridView0.setEnabled(false);
        this.m = (RecyclerView)view0.findViewById(z1.e.A);
        d f$d0 = new d(this, this.getContext(), v1, false, v1);
        this.m.setLayoutManager(f$d0);
        this.m.setTag(f.r);
        k k0 = new k(contextThemeWrapper0, null, this.h, null, new e(this));
        this.m.setAdapter(k0);
        int v3 = contextThemeWrapper0.getResources().getInteger(z1.f.c);
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(z1.e.B);
        this.l = recyclerView0;
        if(recyclerView0 != null) {
            recyclerView0.setHasFixedSize(true);
            this.l.setLayoutManager(new GridLayoutManager(contextThemeWrapper0, v3, 1, false));
            this.l.setAdapter(new v(this));
            this.l.h(this.u());
        }
        if(view0.findViewById(z1.e.r) != null) {
            this.t(view0, k0);
        }
        if(!h.y(contextThemeWrapper0)) {
            new androidx.recyclerview.widget.j().b(this.m);
        }
        this.m.i1(k0.A(this.i));
        this.G();
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("THEME_RES_ID_KEY", this.g);
        bundle0.putParcelable("GRID_SELECTOR_KEY", null);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.h);
        bundle0.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle0.putParcelable("CURRENT_MONTH_KEY", this.i);
    }

    static DateSelector q(f f0) {
        f0.getClass();
        return null;
    }

    private void t(View view0, k k0) {
        class com.google.android.material.datepicker.f.a implements View.OnClickListener {
            final k f;
            final f g;

            com.google.android.material.datepicker.f.a(k k0) {
                this.f = k0;
                super();
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                int v = f.this.B().g2();
                if(v - 1 >= 0) {
                    Month month0 = this.f.y(v - 1);
                    f.this.E(month0);
                }
            }
        }


        class com.google.android.material.datepicker.f.h extends a {
            final f d;

            @Override  // androidx.core.view.a
            public void g(View view0, z z0) {
                super.g(view0, z0);
                z0.w0((f.this.q.getVisibility() == 0 ? f.this.getString(i.z) : f.this.getString(i.x)));
            }
        }


        class com.google.android.material.datepicker.f.i extends s {
            final k a;
            final MaterialButton b;
            final f c;

            com.google.android.material.datepicker.f.i(k k0, MaterialButton materialButton0) {
                this.a = k0;
                this.b = materialButton0;
                super();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$s
            public void a(RecyclerView recyclerView0, int v) {
                if(v == 0) {
                    recyclerView0.announceForAccessibility(this.b.getText());
                }
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$s
            public void b(RecyclerView recyclerView0, int v, int v1) {
                int v2 = v >= 0 ? f.this.B().g2() : f.this.B().d2();
                Month month0 = this.a.y(v2);
                f.this.i = month0;
                CharSequence charSequence0 = this.a.z(v2);
                this.b.setText(charSequence0);
            }
        }


        class com.google.android.material.datepicker.f.j implements View.OnClickListener {
            final f f;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                f.this.H();
            }
        }


        class com.google.android.material.datepicker.f.k implements View.OnClickListener {
            final k f;
            final f g;

            com.google.android.material.datepicker.f.k(k k0) {
                this.f = k0;
                super();
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                int v = f.this.B().d2();
                if(v + 1 < f.this.m.getAdapter().e()) {
                    Month month0 = this.f.y(v + 1);
                    f.this.E(month0);
                }
            }
        }

        MaterialButton materialButton0 = (MaterialButton)view0.findViewById(z1.e.r);
        materialButton0.setTag(f.u);
        Y.o0(materialButton0, new com.google.android.material.datepicker.f.h(this));
        View view1 = view0.findViewById(z1.e.t);
        this.n = view1;
        view1.setTag(f.s);
        View view2 = view0.findViewById(z1.e.s);
        this.o = view2;
        view2.setTag(f.t);
        this.p = view0.findViewById(z1.e.B);
        this.q = view0.findViewById(z1.e.w);
        this.F(l.f);
        materialButton0.setText(this.i.l());
        this.m.k(new com.google.android.material.datepicker.f.i(this, k0, materialButton0));
        materialButton0.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
            l f$l0 = f.this.j;
            l f$l1 = l.g;
            if(f$l0 == f$l1) {
                f.this.F(l.f);
                return;
            }
            if(f$l0 == l.f) {
                f.this.F(f$l1);
            }
        });
        this.o.setOnClickListener(new com.google.android.material.datepicker.f.k(this, k0));
        this.n.setOnClickListener(new com.google.android.material.datepicker.f.a(this, k0));
    }

    private androidx.recyclerview.widget.RecyclerView.n u() {
        class com.google.android.material.datepicker.f.g extends androidx.recyclerview.widget.RecyclerView.n {
            private final Calendar a;
            private final Calendar b;
            final f c;

            com.google.android.material.datepicker.f.g() {
                this.a = u.k();
                this.b = u.k();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$n
            public void g(Canvas canvas0, RecyclerView recyclerView0, y recyclerView$y0) {
                if(recyclerView0.getAdapter() instanceof v && recyclerView0.getLayoutManager() instanceof GridLayoutManager) {
                    v v0 = (v)recyclerView0.getAdapter();
                    GridLayoutManager gridLayoutManager0 = (GridLayoutManager)recyclerView0.getLayoutManager();
                    f.q(f.this);
                    throw null;
                }
            }
        }

        return new com.google.android.material.datepicker.f.g(this);
    }

    CalendarConstraints v() {
        return this.h;
    }

    b w() {
        return this.k;
    }

    Month x() {
        return this.i;
    }

    public DateSelector y() [...] // Inlined contents

    static int z(Context context0) {
        return context0.getResources().getDimensionPixelSize(c.b0);
    }
}

